<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>写文章 | Horizon</title>
    <link href="https://cdn.bootcss.com/simple-line-icons/2.4.1/css/simple-line-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="http://www.bootcss.com/p/buttons/css/buttons.css"/>
    <link rel="stylesheet" href="../statics/css/admin.css">
    <link rel="stylesheet" href="../statics/css/markdown.css">
</head>
<body>
<nav class="navbar page-header">
    <a href="/index" target="_blank">
        <img src="../statics/images/logo.png" alt="logo" class="fa fa-bars">
    </a>

    <ul class="navbar-nav ml-auto">
        <li class="nav-item">${user.name}</li>
        <li class="nav-item">
            <a href="/signOut">退出</a>
        </li>
    </ul>
</nav>
<div class="main-container">
    <div class="sidebar">
        <nav class="sidebar-nav">
            <ul class="nav">
                <li class="nav-title">Admin</li>

                <li class="nav-item">
                    <a href="/admin" class="nav-link">
                        <i class="icon icon-speedometer"></i>主页
                    </a>
                </li>

                <li class="nav-item nav-dropdown open">
                    <a href="#" class="nav-link nav-dropdown-toggle active">
                        <i class="icon icon-notebook"></i> 文章 <i class="fa fa-caret-left"></i>
                    </a>

                    <ul class="nav-dropdown-items">
                        <li class="nav-item">
                            <a href="/admin/articles" class="nav-link ">
                                <i class="icon"></i> 全部
                            </a>
                        </li>

                        <li class="nav-item">
                            <a href="#" class="nav-link active">
                                <i class="icon"></i> 写文章
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item nav-dropdown">
                    <a href="#" class="nav-link nav-dropdown-toggle">
                        <i class="icon icon-user"></i> 用户 <i class="fa fa-caret-left"></i>
                    </a>

                    <ul class="nav-dropdown-items">
                        <li class="nav-item">
                            <a href="/admin/users" class="nav-link">
                                <i class="icon"></i> 全部
                            </a>
                        </li>

                        <li class="nav-item">
                            <a href="/admin/add-user" class="nav-link">
                                <i class="icon"></i> 添加用户
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item">
                    <a href="/admin/comments" class="nav-link">
                        <i class="icon icon-note"></i> 留言
                    </a>
                </li>

                <li class="nav-item">
                    <a href="/admin/images" class="nav-link">
                        <i class="icon icon-picture"></i> 图片
                    </a>
                </li>
            </ul>
        </nav>
    </div>

    <div class="content">
        <form method="post" action="/add-article-finish?state=true">
            <header>
                <input type="text" placeholder="在此输入标题" name="article_title" class="title">
                <button type="submit" name="articleUpload" class="button button-raised button-pill button-inverse">发布</button>
                <button formaction="/admin/add-finish?state=false" type="submit" class="button button-raised button-pill button-inverse">保存为草稿</button>
                <a href="/admin/articles" class="button button-raised button-pill button-inverse">取消</a>
                <br>
                <input type="text" placeholder="在此输入标题" name="article_tag" class="classification">
            </header>
            <div class = "content-wrap">
            <textarea id="markdown" name="content_md" class="content_md" onkeyup="convert()"></textarea>
            <textarea id="upload_text" name="content_html" style="display: none"></textarea>
            <div id="result"></div>
            </div>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/marked/marked.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://use.fontawesome.com/c0f66813d0.js"></script>
<script src="../statics/js/jquery.cookie.js"></script>
<script src="../statics/js/carbon.js"></script>
<script type="text/javascript">
    function convert(){
        var text = document.getElementById("markdown").value;
        var html = marked(text);
        document.getElementById("result").innerHTML = html;
        document.getElementById("upload_text").innerHTML = html;
    }
</script>
</body>
</html>