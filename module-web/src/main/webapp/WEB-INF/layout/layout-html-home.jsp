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

    <div style="height: 100%;">
        <div style="float: left; height: 100%; width: 20%; background: #242424;">
            <%@ include file="/WEB-INF/fragment/header.jsp"%>
            <jsp:include page="/WEB-INF/fragment/menu.jsp"/>
        </div>
        <div style="float: left; height: 100%; width: 75%; padding: 10px;">
            <jsp:include page="<%=mainFragment%>"></jsp:include>
        </div>
        <div style="clear: both; height: 0px;"></div>
    </div>
</body>
</html>