<%--
  Created by IntelliJ IDEA.
  User: NITINJAIN
  Date: 10/6/2020
  Time: 10:38 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List all products</title>
</head>

<body>

  ${allProducts.name }
  ${allProducts.sku }
  ${allProducts.price }

<table border="1">
    <g:each in="${allProducts}" var="thisProduct">
        <tr>
            <td>${thisProduct.name}</td>
            <td>${thisProduct.sku}</td>
            <td>${thisProduct.price}</td>
        </tr>
    </g:each>
</table>



</body>
</html>