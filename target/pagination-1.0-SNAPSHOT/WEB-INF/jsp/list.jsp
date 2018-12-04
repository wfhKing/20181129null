<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩</title>
</head>
<body>

<form action="/score/insert" method="post">
    姓名：<input type="text" name="name" placeholder="姓名">
    科目：<input type="text" name="curr" placeholder="科目">
    分数：<input type="text" name="grade" placeholder="分数">
    <input type="submit" value="提交">
</form>

<c:forEach items="${scores}" var="score">
    ID:<span style="color: red">${score.id}</span>,
    姓名:<span style="color: red">${score.name}</span>,
    科目:<span style="color: red">${score.curr}</span>,
    分数:<span style="color: red">${score.grade}</span><a href="/score/delete?id=${score.id}">删除</a><br/>
</c:forEach>

<div>
    <p>一共有${info.pages}页，共有${info.total}条</p>
    <p>当前是第<span style="color: red">${info.pageNum}</span>页</p>
    <c:forEach begin="1" end="${info.pages}" var="p">
        <a href="/score/list?page=${p}">第 ${p} 页  </a>
    </c:forEach>
</div>
</body>
</html>
