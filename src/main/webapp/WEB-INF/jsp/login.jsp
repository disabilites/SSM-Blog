<!DOCTYPE html>
<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
	<title>登录 | HORIZON</title>
	<link href="statics/images/favicon.ico" rel="icon" type="image/x-icon"/>
	<link rel="stylesheet" href="statics/css/admin.css">

</head>
<body>
<div class="page-wrapper flex-row align-items-center">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-5">
				<div class="card p-4">
					<div class="card-header text-center text-uppercase h4 font-weight-light">
						Login
					</div>

					<form action="/signIn" method="post">
					<div class="card-body py-5">

						<div class="form-group">
							<label class="form-control-label">Email</label>
							<input type="email" name="email" value="${email}" class="form-control">
						</div>

						<div class="form-group">
							<label class="form-control-label">Password</label>
							<input type="password" name="password" value="${password}" maxlength="6" class="form-control">
						</div>

						<div class="custom-control custom-checkbox mt-4">
							<input type="checkbox" name="remember" class="custom-control-input" id="login" ${checked}>
							<label class="custom-control-label" for="login">Check this custom checkbox</label>
						</div>

						<label class="error hide">邮箱密码不能为空</label>
						<c:if test="${flag}">
							<label class="error hide">邮箱或密码错误</label>
						</c:if>
						<c:if test="${!flag}">
							<label class="error">邮箱或密码错误</label>
						</c:if>

					</div>

					<div class="card-footer">
						<div class="row">
							<div class="col-6">
								<button type="submit" class="btn btn-primary px-5">Login</button>
							</div>

							<div class="col-6">
								<a href="#" class="btn btn-link">Forgot password?</a>
							</div>
						</div>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="statics/js/jquery.cookie.js"></script>
<script src="statics/js/carbon.js"></script>
</body>
</html>
