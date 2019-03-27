<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户 | Horizon</title>
    <link href="https://cdn.bootcss.com/simple-line-icons/2.4.1/css/simple-line-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="http://www.bootcss.com/p/buttons/css/buttons.css"/>
    <link rel="stylesheet" href="../statics/css/admin.css">
</head>
<body>
<div class="page-wrapper">
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

                    <li class="nav-item nav-dropdown open">
                        <a href="#" class="nav-link nav-dropdown-toggle active">
                            <i class="icon icon-user"></i> 用户 <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="/admin/users" class="nav-link">
                                    <i class="icon"></i> 全部
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="#" class="nav-link active">
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
            <span>${message}</span>
            <form id="register" action="/admin/add-user-finish" method="post">
                <div class="register-body">

                    <div class="form-group">
                        <label>用户名</label>
                        <input type="text" name="name" class="form-control">
                    </div>

                    <div class="form-group">
                        <label>邮箱</label>
                        <input type="email" name="email" class="form-control">
                    </div>

                    <div class="form-group">
                        <label>密码</label>
                        <input type="password" name="password" class="form-control">
                    </div>

                    <div class="register-footer">
                        <button type="submit" class="button button-glow button-rounded button-primary" disabled="disabled">注册</button>
                        <button type="reset" class="button button-glow button-rounded button-caution">重置</button>
                    </div>

                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://use.fontawesome.com/c0f66813d0.js"></script>
<script src="../statics/js/jquery.cookie.js"></script>
<script src="../statics/js/carbon.js"></script>
</body>
</html>
