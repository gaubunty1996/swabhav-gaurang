<html>  
<body>  
<%  

String uname=request.getParameter("inputUser");  
String pass=request.getParameter("inputPass"); 

if(uname.equals("admin") && pass.equals("admin")){
    out.println("Welcome,"+uname);
}

else{
    out.println("<h1 style='color:red'>Invalid user please login again!!</h1><br>");
    out.println("<a href='login.html'>login.html</a>");
}
%>  
</form>  
</body>  
</html>  