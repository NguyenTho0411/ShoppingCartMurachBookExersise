<%-- 
    Document   : index.jsp
    Created on : Sep 29, 2024, 5:15:24 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>22110237 - Nguyễn Hữu Đức thọ</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Your cart</h1>
        <table>
            <tr>
                <th>Description</th>
                <th>Price</th>
                <th></th>
            </tr>
            <tr>
                <td>86 (the band) - True Life Song And Pictures</td>
                <td class="right">$14.95</td>
                <td>
                    <form action="cart" method="post">
                        <input type="hidden" name="productCode" value="8601">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
            <tr>
                <td>Paddlefoot - The First CD</td>
                <td class="right">$12.85</td>
                <td>
                    <form action="cart" method="post">
                        <input type="hidden" name="productCode" value="pf01">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
            <tr>
                <td>Paddlefoot - The Second CD</td>
                <td class="right">$14.95</td>
                <td>
                    <form action="cart" method="post">
                        <input type="hidden" name="productCode" value="pf02">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
                        <tr>
                <td>Joe Rut - Genuine Wood Grained Finish</td>
                <td class="right">$14.95</td>
                <td>
                    <form action="cart" method="post">
                        <input type="hidden" name="productCode" value="jr01">
                        <input type="submit" value="Add to cart">
                    </form>
                </td>
            </tr>
        </table>
            
    </body>
</html>
