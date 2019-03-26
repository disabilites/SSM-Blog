<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <title>${article.title}</title>
    <link rel="stylesheet" href="../statics/css/style.css">
    <link href="../statics/images/favicon.ico" rel="icon" type="image/x-icon"/>

</head>
<body>
<div class="wrap-body zerogrid">
    <header>
        <div class="wrap-header">

            <div id="logo">
                <a href="/index"><h1>HORIZON</h1></a>
                <p> Welcaom To My Blog </p>
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
                        <article>
                            <div class="heading">
                                <h2><a href="#"> ${article.title} </a></h2>
                            </div>
                            <div class="content">
                                ${article.content_html}
                            </div>
                            <div class="info">
                                <p><fmt:formatDate value="${article.date}" pattern="yyyy-MM-dd HH:mm" /></p>
                            </div>
                        </article>
                        <c:forEach var="comment" items="${comments}">
                            <div class="comment">
                                <img src="/statics/images/user.png" class="avatar">
                                <span class="username">${comment.name}:</span>
                                <span class="comment-time"><fmt:formatDate value="${comment.date}" pattern="yyyy-MM-dd HH:mm" /></span>
                                <span class="comment-content">${comment.content}
                                </span>
                            </div>
                        </c:forEach>

                        <section>
                            <div align="center">
                                <h3>Leave a Comment</h3>
                                <form id="contact-form" method="post" action="/make-comment?aid=${article.id}&title=${article.title}">
                                    <fieldset>
                                        <label><input type="text" name="name" placeholder="名字" /></label>
                                        <label><input type="email" name="email" placeholder="邮箱" /></label>
                                        <textarea placeholder="内容" name="content"></textarea>
                                        <div class="buttons">
                                            <button type="submit" id="test">发表评论</button>
                                            <button type="reset" >重置</button>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </section>
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
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../statics/js/jquery.cookie.js"></script>
<script src="../statics/js/carbon.js"></script>
</body>
</html>