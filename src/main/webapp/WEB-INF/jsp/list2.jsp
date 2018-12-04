<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章</title>
</head>
<body>

<div style="border:1px solid blue">
    <form action="/post/insert" method="post">
        标题：<input type="text" name="postTite" placeholder="标题"><br/>
        作者： <select name="authorId">
        <option>请选择</option>
        <c:forEach items="${authors}" var="author">
            <option value="${author.authorId}">${author.authorName}</option>
        </c:forEach>
    </select><br/>
        内容：<textarea name="postContent" style="width: 200px;height: 200px;resize:none"></textarea><br/>
        日期：<input type="date" name="postDate" placeholder="日期"><br/>
        <input type="submit" value="提交">
    </form>
</div>
<br/><br/><br/>

<c:forEach items="${posts}" var="post">
    <div style="border:1px solid black">
        <p><b>${post.postTite}</b></p>
        <p>${post.author.authorName}/${post.author.authorPhone}/${post.author.authorAddress}</p>
        <div style="background-color: antiquewhite ">${post.postContent}</div>
        <p>${post.postDate}</p>
        <p><a href="/post/delete?id=${post.postId}">删除</a></p>
    </div>
</c:forEach>

<div>
    <p>一共有${PostInfo.pages}页，共有${PostInfo.total}条</p>
    <p>当前是第<span style="color: red">${PostInfo.pageNum}</span>页</p>
    <c:forEach begin="1" end="${PostInfo.pages}" var="p">
        <a href="/post/list?page=${p}">第 ${p} 页 </a>
    </c:forEach>
</div>
</body>
</html>
