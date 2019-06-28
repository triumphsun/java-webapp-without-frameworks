<%
    String baseURL = request.getContextPath() + "/user/" + session.getAttribute("username");
%>

<div id="menu">
    <ul>
        <li><a href="<%=request.getContextPath()%>/board/b01">Dashboard-001</a></li>
        <li><a href="<%=request.getContextPath()%>/board/b02">Dashboard-002</a></li>
        <li><a href="<%=request.getContextPath()%>/board/b03">Dashboard-003</a></li>
    </ul>
</div>