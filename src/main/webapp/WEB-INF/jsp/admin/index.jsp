<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理 | Horizon</title>
    <link href="https://cdn.bootcss.com/simple-line-icons/2.4.1/css/simple-line-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="statics/css/admin.css">
</head>
<body class="sidebar-fixed header-fixed">
<div class="page-wrapper">
    <nav class="navbar page-header">
        <a href="/index" target="_blank">
            <img src="statics/images/logo.png" alt="logo" class="fa fa-bars">
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
                        <a href="#" class="nav-link active">
                            <i class="icon icon-speedometer"></i>主页
                        </a>
                    </li>

                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-notebook"></i> 文章 <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="/admin/articles" class="nav-link">
                                    <i class="icon"></i> 全部
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="/admin/add-article" class="nav-link">
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
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-3">
                        <div class="card p-4">
                            <div class="card-body d-flex justify-content-between align-items-center">
                                <div>
                                    <span class="h4 d-block font-weight-normal mb-2">${userCount}</span>
                                    <span class="font-weight-light">用户</span>
                                </div>

                                <div class="h2 text-muted">
                                    <i class="icon icon-people"></i>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="card p-4">
                            <div class="card-body d-flex justify-content-between align-items-center">
                                <div>
                                    <span class="h4 d-block font-weight-normal mb-2">${articleCount}</span>
                                    <span class="font-weight-light">文章</span>
                                </div>

                                <div class="h2 text-muted">
                                    <i class="icon icon-star"></i>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="card p-4">
                            <div class="card-body d-flex justify-content-between align-items-center">
                                <div>
                                    <span class="h4 d-block font-weight-normal mb-2">${commentCount}</span>
                                    <span class="font-weight-light">留言</span>
                                </div>

                                <div class="h2 text-muted">
                                    <i class="icon icon-speech"></i>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="card p-4">
                            <div class="card-body d-flex justify-content-between align-items-center">
                                <div>
                                    <span class="h4 d-block font-weight-normal mb-2">${imageCount}</span>
                                    <span class="font-weight-light">图片</span>
                                </div>

                                <div class="h2 text-muted">
                                    <i class="icon icon-picture"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://use.fontawesome.com/c0f66813d0.js"></script>
<script src="statics/js/jquery.cookie.js"></script>
<script src="statics/js/carbon.js"></script>
</body>
</html>
