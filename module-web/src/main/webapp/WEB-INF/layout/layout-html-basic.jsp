<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css">
    <title>Portal</title>
</head>
<body>
    <%
        String mainFragment = (String) request.getAttribute("fragment-main");
    %>
    <H1 style="font-size:10em; text-align: center;">Welcome</H1>
    <div style="margin:10px; text-align: center;">
        <jsp:include page="<%=mainFragment%>"></jsp:include>
    </div>
    <%@ include file="/WEB-INF/fragment/footer.jsp"%>
</body>
</html>