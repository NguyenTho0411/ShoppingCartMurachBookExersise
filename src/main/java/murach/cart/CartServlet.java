/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.cart;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import murach.bussiness.Cart;
import murach.bussiness.LineItem;
import murach.bussiness.Product;
import murach.data.ProductIO;

/**
 *
 * @author DELL
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/cart"})
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="/index.jsp";
        ServletContext sc = getServletContext();
        String action = request.getParameter("action");
        if(action==null){
            action="cart";
        }
        if(action.equals("shop")){
            url="/index.jsp";
        }
        if(action.equals("cart")){
            String productCode = request.getParameter("productCode");
            String quantityString = request.getParameter("quantity");
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("cart");
            if(cart ==null){
                cart = new Cart();
            }
            int quantity;
            try{
                quantity= Integer.parseInt(quantityString);
               if(quantity<0)
                   quantity=1;
            }
            catch(NumberFormatException exp){
                quantity= 1;
            }
            String path = sc.getRealPath("/WEB-INF/product.txt");
            Product product = ProductIO.getProduct(productCode,path);
            
            LineItem item = new LineItem();
            item.setProduct(product);
            item.setQuantity(quantity);
            if(quantity>0){
                cart.addItem(item);
            }
            else if(quantity==0){
                cart.removeItem(item);
            }
            session.setAttribute("cart", cart);
            url="/cart.jsp";
        }
        else
            if(action.equals("checkout")){
                url="/checkout.jsp";
            }
        sc.getRequestDispatcher(url).forward(request,response);
    }

}
