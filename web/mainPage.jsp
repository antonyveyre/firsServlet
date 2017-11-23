<%-- 
    Document   : mainPage
    Created on : 22 nov. 2017, 16:13:53
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MAIN Page</title>
    </head>
    <body>

        <%try {
    if(request.getCookies()[0].getName().equals("Authenticated")&&
    request.getCookies()[0].getValue().equals("vrai"))   
    {
        out.println("déjà autentifié");
    }
    }catch(Exception e){
   System.out.println("Exception cause : "+e.getCause()+
      " message : "+ e.getMessage());}

    %>
    <form action="${pageContext.request.contextPath}/" method="post">
    <input type="submit" name="button1" value="autentification" />
    </form>
    <%
         %>
      <h1>Je suis un requette GET</h1>
    </body>
</html>
   

</body>
</html>
