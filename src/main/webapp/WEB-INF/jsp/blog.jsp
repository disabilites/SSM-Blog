<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->

<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>

    <!-- Basic Page Needs
  ================================================== -->
	<title>${article.title}</title>
	<meta name="description" content="Free Responsive Html5 Css3 Templates Designed by Kimmy | ">
	<meta name="author" content="horizon">
	
    <!-- Mobile Specific Metas
  ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    
    <!-- CSS
  ================================================== -->
  	<link rel="stylesheet" href="statics/css/zerogrid.css">
	<link rel="stylesheet" href="statics/css/style.css">
    <link rel="stylesheet" href="statics/css/responsive.css">
	
	<!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
		<script src="statics/js/html5.js"></script>
		<script src="statics/js/css3-mediaqueries.js"></script>
	<![endif]-->
	
	<link href='statics/images/favicon.ico' rel='icon' type='image/x-icon'/>
    
</head>
<body>
<div class="wrap-body zerogrid">
<!--------------Header--------------->
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
						<li><a href="index.html">首页</a></li>
						<li><a href="blog.html">归档</a></li>
						<li><a href="blog.html">标签</a></li>
						<li><a href="blog.html">关于</a></li>
					</ul>
				</div>
			</div>
		</nav>
		
	</div>
</header>

<!--------------Content--------------->
<section id="content">
	<div class="wrap-content">
		<div class="row block">
			<div id="main-content" class="col-2-3">
				<div class="wrap-col">
					<article>
						<div class="heading">
							<h2>${article.title}</h2>
						</div>
						<div class="content">
							<img src="statics/images/img1.jpg" width="100%"/>
							<p>${article.content}</p>
						</div>
						<div class="info">
							<p><fmt:formatDate value="${article.date}" pattern="yyyy-MM-dd HH:mm" /></p>
						</div>
					</article>
					
					<section>
						<h3>Leave a Comment</h3>
						
						<form id="contact-form" method="post">
						    <fieldset>
						        <label><input name="email" value="Email" onBlur="if(this.value=='') this.value='Email'" onFocus="if(this.value =='Email' ) this.value=''" /></label>
						        <label><input name="subject" value="Subject" onBlur="if(this.value=='') this.value='Subject'" onFocus="if(this.value =='Subject' ) this.value=''" /></label>
						        <textarea onBlur="if(this.value=='') this.value='Message'" onFocus="if(this.value =='Message' ) this.value=''">Message</textarea>
						        <div class="buttons">
						            <a href="#" onClick="document.getElementById('contact-form').reset()">Clear</a>
						            <a href="#" onClick="document.getElementById('contact-form').submit()">Send</a>
						        </div>											
						    </fieldset>           
						</form>
					</section>
				</div>
			</div>
		</div>
	</div>
</section>
<!--------------Footer--------------->
<footer>
	<div class="copyright">
		<p>Copyright © 2014 - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> </p>
	</div>
</footer>

</div>
</body></html>