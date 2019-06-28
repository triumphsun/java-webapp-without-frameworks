<div id="header">
    <div>
        <div style="font-size: 3em; margin-left: 10px;">
            <a style="text-decoration: none;" href="<%=request.getContextPath()%>/home"><%=session.getAttribute("username")%></a>
        </div>
    </div>
    <div class="item">
        <a href="<%=request.getContextPath()%>/admin">
            <img src="<%=request.getContextPath()%>/img/admin.png" height="40px" title="Admin"/>
        </a>
    </div>
    <div class="item">
        <a href="<%=request.getContextPath()%>/profile">
            <img src="<%=request.getContextPath()%>/img/profile.png" height="40px" title="Profile"/>
        </a>
    </div>
    <div class="item">
        <a href="<%=request.getContextPath()%>/setting">
            <img src="<%=request.getContextPath()%>/img/setting.png" height="40px" title="Setting"/>
        </a>
    </div>
    <div class="item">
        <a href="<%=request.getContextPath()%>/logout">
            <img src="<%=request.getContextPath()%>/img/logout.png" height="40px" title="Logout"/>
        </a>
    </div>
    <div style="clear: both"></div>
</div>