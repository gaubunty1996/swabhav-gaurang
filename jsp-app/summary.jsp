<body>
    <a href="session.jsp">Session</a>
    <a href="application.jsp">Application</a>
    <p>
        Old Counter for session:<%= (Integer)session.getAttribute("hitCounter")%>
       
    </p>
    <p>
        Old Counter for application:<%= (Integer)application.getAttribute("hitCount")%>
       
    </p>
</body>