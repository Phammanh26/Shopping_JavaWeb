<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
                    Actions
                </td>
            </tr>

            <c:if test="${not empty requestScope.PRODUCT_DETAIL}">
                <form class="example" action="MainController" method ="post">
                    <tr>  
                        
                        <td>
                 
                            <input type="text"  name ="proID" value =${requestScope.PRODUCT_DETAIL.getId()} readonly>

                        </td>

                        <td>
                            <input type="text"  name ="proName" value = ${requestScope.PRODUCT_DETAIL.getName()}>

                        </td>

                        <td>
                            <input type="text"  name ="proDesc" value = ${requestScope.PRODUCT_DETAIL.getDescription()}>

                        </td>

                        <td>
                            <input type="text"  name ="proPrice" value = ${requestScope.PRODUCT_DETAIL.getPrice()}>

                        </td>
                        <td>
                            <input type="text"  name ="proTime" value = ${requestScope.PRODUCT_DETAIL.getCookingTime()}>

                        </td>
                        <td>
          
                            <select name = "proStatus">
                                <option value="1">true</option>
                                <option value="0">false</option>
                             
                            </select>
                        </td>


                        <td>
                            <button type="submit"  name ="action"  value="updateProduct">Update</button>
                        </td>
                    </tr>
                </form>   
            </c:if>


           


        </table>
    </body>
</html>
