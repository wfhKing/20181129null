<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${rans}" var="ran">
    ${ran.rid},${ran.name}<br/>
</c:forEach>

<div>
    <p>一共有${pageInfo.pages}页，共有${pageInfo.total}</p>
    <p>当前是第${pageInfo.pageNum}页</p>
    <c:forEach begin="1" end="${pageInfo.pages}" var="p">
        <a href="/list?page=${p}">第 ${p} 页  </a>
    </c:forEach>
</div>
</body>
</html>
