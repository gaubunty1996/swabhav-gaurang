<%@ page import="java.io.*,java.util.*"%>
<body>
        <a href="summary.jsp">Summary</a>
    Session Id:<%=session.getId()%><br>
    
        <%
        
        Integer hitsCount = (Integer)session.getAttribute("hitCounter");
        if( hitsCount ==null || hitsCount == 0 ) {
           /* First visit */
           
           hitsCount = 1;
           
        } else {
           /* return visit */
           
           hitsCount += 1;
        }
        session.setAttribute("hitCounter", hitsCount);
       
     %>
     <p>
            Old Counter:<%= hitsCount-1%>
            New Counter:<%= hitsCount %>
        </p>
      
    
    
</body>