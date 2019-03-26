<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>HORIZON</title>
	<link rel="stylesheet" href="statics/css/style.css">
	<link href="statics/images/favicon.ico" rel="icon" type="image/x-icon"/>
</head>
<body>
<div class="wrap-body zerogrid">
	<header>
		<div class="wrap-header">
			<div id="logo">
				<a href="/index"><h1>HORIZON</h1></a>
				<p> Welcome To My Blog </p>
			</div>

			<nav>
				<div class="wrap-nav">
					<div class="menu">
						<ul>
							<li><a href="/index">首页</a></li>
							<li><a href="/articles">归档</a></li>
							<li><a href="/classifications">分类</a></li>
							<li><a href="/about">关于</a></li>
						</ul>
					</div>
				</div>
			</nav>

		</div>
	</header>

	<section id="content">
		<div class="wrap-content">
			<div class="row block">
				<div id="main-content" class="col-2-3">
					<div class="wrap-col">
						<c:forEach var="article" items="${articles}">
							<c:if test="${article.state eq '已发布'}">
							<article>
								<div class="heading">
									<h2><a href="/blog/${article.id}">${article.title}</a></h2>
								</div>
								<div class="content">
									<div>${article.content_html}</div>
								</div>
								<div class="info">
									<p><fmt:formatDate value="${article.date}" pattern="yyyy-MM-dd HH:mm"/></p>
								</div>
							</article>
							</c:if>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</section>
	<footer>
		<div class="copyright">
			<p>Copyright © 2019 <a href="https://www.ashtwo.cn/" target="_blank" title="ashtwo">ashtwo</a> </p>
		</div>
	</footer>

</div>
</body>
</html>