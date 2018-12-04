<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${authors}" var="author">
    ${author.authorId},${author.authorName},${author.authorPhone}  <a href="/xxx/authorId?authorId=1">跳转</a><br/>
</c:forEach>

</body>
</html>
