<%@ page import="Model.Customer" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jelle
  Date: 09-05-2019
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    ArrayList<Customer> customer = (ArrayList<Customer>) session.getAttribute("login");


%>
<html>
<head>
    <title>Profil</title>
    <h1>Kunde Profil</h1>

    <table class="table">

        <tr>
            <th>Kundenr</th><th>Navn</th><th>Email</th><th>Telefon</th><th>Addresse</th><th>Postnr</th><th>By</th>
        </tr>
        <tr>
            <td><%out.println(customer.get(0).getCustomer_id());%></td>
            <td><%out.println(customer.get(0).getName());%></td>
            <td><%out.println(customer.get(0).getEmail());%></td>
            <td><%out.println(customer.get(0).getPhone());%></td>
            <td><%out.println(customer.get(0).getAdress());%></td>
            <td><%out.println(customer.get(0).getZipcode());%></td>
            <td><%out.println(customer.get(0).getCity());%></td>


        </tr>






    </table>
</head>
<body>

</body>
</html>
