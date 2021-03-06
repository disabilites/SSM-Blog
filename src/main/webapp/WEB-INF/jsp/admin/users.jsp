<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户 | Horizon</title>
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
                        <a href="" class="nav-link nav-dropdown-toggle">
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
                                <a href="#" class="nav-link active">
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
            <a href="/admin/add-user" class="button button-raised button-pill button-inverse" style="margin: 10px">添加用户</a>
            <div class="row">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>用户名</th>
                                        <th>邮箱</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="user" items="${users}">
                                        <tr>
                                            <td>${user.name}</td>
                                            <td>${user.email}</td>
                                            <td>
                                                <a href="/admin/edit-user?name=${user.name}" class="button button-glow button-rounded button-primary delete">修改</a>
                                                <a href="/admin/delete-user?name=${user.name}" class="button button-glow button-rounded button-caution delete">删除</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
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
<script src="../statics/js/jquery.cookie.js"></script>
<script src="../statics/js/carbon.js"></script>
</body>
</html>
