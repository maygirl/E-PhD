<%-- 
    Document   : validateReport
    Created on : May 21, 2016, 3:54:38 PM
    Author     : Mac
--%>

<%@include file="template/Header.jsp" %>


<form method="post" action="validate-report" id="form-submit">
    <h3>Select the report</h3>
    <label for="report" >Report</label>
        <select name="report" id="report" >
            <c:forEach var="r" items="${reports}">
                <option value ="${r.id}"> ${r.student.id} , ${r.date} </option>
            </c:forEach>
        </select>
    <h4>Content</h4>
    <div id="content"> 
    
    </div>
    <button type="submit"> Validate </button>
</form>

    <script>
        $("#report").change(function() {
            var reportId = $("#report").val();
            $.post( "load-report",{reportId: reportId},function( data ) {
                $("#content").html(data);
            });    
        });
    </script>

<%@include file="template/Footer.jsp" %>
