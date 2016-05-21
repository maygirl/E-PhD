<%--
  Created by IntelliJ IDEA.
  User: Mac
  Date: 07/04/16
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="template/Header.jsp" %>

    <form method="post" action="login" id="form-submit">
        <h3>Login form Java EE 7</h3>
        <br>
        <label for="username">Username</label>
            <input type="text" name="username" id="username">
            <span class="error" style="color:red; display:none;">Username should not pe empty</span>
        <br>
        <label for="password">Password</label>
            <input type="password" name="password" id="password">
            <span class="error" style="color:red; display:none;">Password should not pe empty</span>
        <br>
        <input type="submit" value="Submit" name="send">
        <input type="reset" value="Reset" name="clear">
        <span id="main-error" style="font-weight:700; color:red; display:none">Check all the errors</span>
    </form>

    <c:if test="${not empty error}">
        ${error}
    </c:if>

<%@include file="template/Footer.jsp" %>
