<%-- 
    Document   : studentReport
    Created on : May 21, 2016, 4:33:37 PM
    Author     : Mac
--%>

<%@include file="template/Header.jsp" %>

The following publications will be added to this report:
</br>
<table>
    <tr>
        <td>Title</td>
        <td>Domain</td>
        <td>File</td>
    </tr>
    <c:forEach var="p" items="${publications}">
        <tr>
            <td> ${p.title} </td>
            <td> ${p.domain} </td>
            <td> ${p.path} </td>
        </tr>
    </c:forEach>
</table>
</br>

<form method="post" action="student-report" id="form-submit">
        <h3>Report Form</h3>
        <br>
        <label for="content">Content</label>
            <input type="text" name="content" id="content">
        <input type="submit" value="Submit" name="send">
        <input type="reset" value="Reset" name="clear">
</form>

<%@include file="template/Footer.jsp" %>