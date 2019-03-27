<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<head>
    <title>分类 | HORIZON</title>
    <link rel="stylesheet" href="statics/css/style.css">
    <link href="statics/images/favicon.ico" rel="icon" type="image/x-icon"/>

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<div class="wrap-body zerogrid">
    <header>
        <div class="wrap-header">

            <div id="logo">
                <a href="#"><h1>zSoodany</h1></a>
                <p> Here Is The Classification Page.</p>
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
                        <c:forEach var="articles" items="${articlesMap}">
                            <div class="about4">
                                <div class="about4_ch">${articles.key}</div>
                                <div class="about4_main">
                                    <div class="line"></div>
                                    <ul>
                                        <c:forEach var="article" items="${articles.value}">
                                            <c:if test="${article.state eq '已发布'}">
                                            <li>
                                                <time class="time"><fmt:formatDate value="${article.date}" pattern="yyy-MM-dd"/></time>
                                                <span>—</span>
                                                <a class="details" href="/blog?id=${article.id}" >${article.title}</a>
                                            </li>
                                            </c:if>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
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
