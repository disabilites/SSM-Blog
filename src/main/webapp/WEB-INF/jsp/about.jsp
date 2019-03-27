<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<!DOCTYPE html>
<head>
    <title>关于 | HORIZON</title>
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
                                <h2>基于SSM框架搭建的简易博客系统</h2>
                            </div>
                            <div class="content">
                                <p>该博客系统基于spring+springMVC+mybatis搭建，开发环境为idea，使用maven项目管理工具。</p>
                                <p>目前实现的功能：</p>
                                <ul>
                                <li>1、文章归档</li>
                                <li>2、文章分类</li>
                                <li>3、留言系统</li>
                                <li>4、图片上传</li>
                                <li>5、markdown编辑</li>
                                </ul>
                            </div>

                        </article>
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