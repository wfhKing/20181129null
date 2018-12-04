项目用到的是 ***++pagehelper++*** 方式 进行分页，我们要在 **++web.xml++** 加入


	<dependency>
        <groupId>com.github.pagehelper</groupId>
        <artifactId>pagehelper</artifactId>
        <version>5.1.7</version>
	</dependency>
后台：
在方法中，多给一个页面 `page` 的参数，默认是第一页 `@RequestParam(defaultValue = "1") int page`

把原来 `model.ad
dAttribute('xxx',list)` 的写法改成 `model.addAttribute('xxx',new PageInfo<>(list))` 的写法
_ _ _

前端 :

	<p>一共有${xxx.pages}页，共有${xxx.total}条</p>
        <p>当前是第<span style="color: red">${xxx.pageNum}</span>页</p>
        <c:forEach begin="1" end="${xxx.pages}" var="p">
            <a href="/score/list?page=${p}">第 ${p} 页  </a>
    </c:forEach>
   
`pages`可以查询出有多少个页面， `total`可以查询到有多少条数据，
`pageNum`可以查询出当前是多少页

