<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>图片 | Horizon</title>
    <link href="https://cdn.bootcss.com/simple-line-icons/2.4.1/css/simple-line-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="http://www.bootcss.com/p/buttons/css/buttons.css"/>
    <link rel="stylesheet" href="../statics/css/admin.css">
    <link rel="stylesheet" href="../statics/css/image.css">

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
                        <a href="/admin/images" class="nav-link active">
                            <i class="icon icon-picture"></i> 图片
                        </a>
                    </li>
                </ul>
            </nav>
        </div>

        <div class="content">
            <form action="/admin/upload" method="post" enctype="multipart/form-data">
                <button type="submit" class="upload">上传</button>
                <a href="#" class="choose">
                    <input type="file" name="uploadImage"accept="image/*"/><label>选择图片</label>
                </a>
            </form>
            <span>${message}</span>
            <div class="wrap">
                <div class="header-left" id="home">
                    <section>
                        <ul class="lb-album" >
                            <c:forEach var="image" items="${images}">
                                <li>
                                    <a href="${image.url}" target="_blank">
                                        <img src="${image.url}" alt="${image.name}" width="250px" height="200px">
                                        <span>${image.name}</span>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </section>
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