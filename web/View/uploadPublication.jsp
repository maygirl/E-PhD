<%-- 
    Document   : Publication
    Created on : May 21, 2016, 3:52:12 PM
    Author     : Mac
--%>

<%@include file="template/Header.jsp" %>

<form method="post" action="publication" id="form-submit" enctype="multipart/form-data">
        <h3>Add Publication</h3>
        <label for="title">Title</label>
            <input type="text" name="title" id="title">
        <br>
        <label for="domain">Domain</label>
            <input type="text" name="domain" id="domain">
        <br>
        File:
            <input type="file" name="file" id="file" /> <br/>
        </br>
        <input type="submit" value="Upload" name="upload" id="upload" />
        <input type="reset" value="Reset" name="clear">
    </form>

<%@include file="template/Footer.jsp" %>
