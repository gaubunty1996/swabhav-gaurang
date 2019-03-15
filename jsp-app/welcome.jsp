<html>

<body>
<% out.println("Welcome to jsp");%>
    <!-- <% for(int i = 0; i < 7; i=i+1) { %>
    <% out.println("<h"+i+">Weclome to jsp</h"+i+">"); %><br>
    <% } %> -->
    <%

String name=request.getParameter("developer");
for(int i = 0; i < 7; i=i+1) {
if(name!=null && !name.equals("null") && name!=""){
    
    out.println("<h"+i+">Welcome to jsp, "+name+"</h"+i+">");
}
else{
    
    out.println("<h"+i+">Welcome to jsp</h"+i+">");
}
}

%>
</body>

</html>