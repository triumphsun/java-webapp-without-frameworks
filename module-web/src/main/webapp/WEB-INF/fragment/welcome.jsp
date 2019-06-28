<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
    <c:choose>
        <c:when test="${sessionScope.get('username')==null}">
            Welcome! Please <a href="login">login</a> first.
        </c:when>
        <c:otherwise>
            Welcome <a href="user/<%=session.getAttribute("username")%>"><%=session.getAttribute("username")%></a> ,
            <a href="logout">logout</a>
        </c:otherwise>
    </c:choose>
</div>