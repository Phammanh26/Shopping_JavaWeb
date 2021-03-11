<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Product Manage</title>
    </head>
    <body>



        <!-- The form -->
        <form class="example" action="MainController">
          
            <input type="text" placeholder="Search.." name ="searchName">
            <button type="submit" name ="action"  value="view"><i class="fa fa-search"></i></button>

            <a href="addNewProduct.jsp">Add new</a>
        </form>   
        LIST USER:
        <table>
            <tr>         
                <td>
                    ID
                </td>

                <td>
                    Name
                </td>

                <td>
                    Description
                </td>

                <td>
                    Price
                </td>
                <td>
                    Cooking Time
                </td>
                <td>
                    Status
                </td>
                <td>
                    Create Date
                </td>
                <td>
                    Actions
                </td>
            </tr>

            <c:if test="${not empty requestScope.LIST_PRODUCT}">
                <c:forEach  items= "${requestScope.LIST_PRODUCT}" var="product" varStatus ="counter">
                    <tr>         
                        <td>
                            ${product.getId()}
                        </td>

                        <td>
                            ${product. getName()}
                        </td>

                        <td>
                            ${product.getDescription()}
                        </td>

                        <td>
                            ${product.getPrice()}
                        </td>
                        <td>
                            ${product.getCookingTime()}
                        </td>
                        <td>
                            ${product.getStatus()}
                        </td>
                        <td>
                            ${product.getCreateDate()}
                        </td>

                        <td>
                            <form class="example" action="MainController" method ="post">

                                <input type ="hidden" name ="proID" value=${product.getId()}>

                                <button type="submit"  name ="action"  value="viewDetail">Update</button>
                                <button type="submit"  name ="action"  value="deleteProduct">Delete</button>
                            </form>   
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>










    </body>
</html>
