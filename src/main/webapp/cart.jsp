<%-- 
    Document   : cart.jsp
    Created on : Sep 29, 2024, 5:22:38 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>22110237 _ Nguyễn Hữu Đức Thọ</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Your cart</h1>
        <table>
            <tr>
                <th>Quantity</th>
                <th>Description</th>
                <th>Price</th>
                <th>Amount</th>
                <th></th>
            </tr>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <c:forEach var="item" items="${cart.items}">
                <tr>
                    <td><form action="cart" method="post">
                            <input type="hidden" name="productCode" value="${item.product.code}"><!-- comment -->
                            <input type="text" name="quantity" value="${item.quantity}" id="quantity">
                            <input type="submit" value="Update">
                        </form></td>
                    <td>${item.product.description}</td>
                    <td>${item.product.currencyFormat()}</td>
                    <td>${item.getTotalCurrencyFormat()}</td>
                    <td><a href="cart?productCode=${item.product.code}&amp;quantity=0">Remove Item</a></td>
                </tr>
            </c:forEach>

        </table>
            <p><b>To change the quantity </b>, enter the new quantity and click on the update button</p>
            <form action="" method="post">
                <input type="hidden" name="action" value="shop">
                <input type="submit" value="Continue Shopping">
            </form>
                <form action="" method="post">
                <input type="hidden" name="action" value="checkout">
                <input type="submit" value="Check out">
            </form>
    </body>
</html>
