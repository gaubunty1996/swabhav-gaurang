<%@ page import="java.io.*,java.util.*"%>
<body>
    <a href="summary.jsp">Summary</a>
    
        <%
        
        Integer hitsCount = (Integer)application.getAttribute("hitCount");
        if( hitsCount ==null || hitsCount == 0 ) {
           /* First visit */
           
           hitsCount = 1;
           
        } else {
           /* return visit */
           
           hitsCount += 1;
        }
        application.setAttribute("hitCount", hitsCount);
       
     %>
     <p>
            Old Counter:<%= hitsCount-1%>
            New Counter:<%= hitsCount %>
        </p>
      
    
    
</body>