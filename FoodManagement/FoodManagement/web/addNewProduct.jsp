<%-- 
    Document   : addNewProduct
    Created on : Mar 11, 2021, 4:25:49 PM
    Author     : Manh
--%>

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
                    Create Date
                </td>
                <td>
                    Actions
                </td>
            </tr>
            <form class="example" action="MainController">
      
                        <tr>         
                        <td>

                            <input type="text"  name ="proID">

                        </td>

                        <td>
                            <input type="text"  name ="proName" >

                        </td>

                        <td>
                            <input type="text"  name ="proDesc" >

                        </td>

                        <td>
                            <input type="text"  name ="proPrice" >

                        </td>
                        <td>
                            <input type="text"  name ="proTime">

                        </td>
                        <td>
                            <input type="text"  name ="proStatus" >

                        </td>


                        <td>
                            <button type="submit"  name ="action"  value="addNewProduct">Add</button>
                        </td>
                    </tr>
                 </form>
        </table>
                 
      
    </body>
</html>
