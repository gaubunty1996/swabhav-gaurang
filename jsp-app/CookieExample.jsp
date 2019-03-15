<!DOCTYPE html>

<HTML>

<HEAD>
    <TITLE>Color Testing</TITLE>
</HEAD>

<%      
        String bgColor = "BLUE";
        String myColor = request.getParameter("colour");
        Cookie cookie = new Cookie("colour",myColor);
        cookie.setMaxAge(60*60*10); 
        response.addCookie(cookie); 

        %>

<BODY BGCOLOR="<%= cookie.getValue() %>">

    <H2 ALIGN="CENTER">Color Testing</H2>

    <form>
        <input type="text" name="colour" size="25">
        <p></p>
        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form>

</BODY>

</HTML>