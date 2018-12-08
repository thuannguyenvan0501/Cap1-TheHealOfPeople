<%@page import="model.bean.User"%>
<%@page import="util.StringLibrary"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="icon" href="<%=request.getContextPath()%>/template/public/img/favicon.png" type="image/png">
	<title>The Health Of People</title>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/template/public/css/bootstrap.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/linericon/style.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/template/public/css/font-awesome.min.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/owl-carousel/owl.carousel.min.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/lightbox/simpleLightbox.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/nice-select/css/nice-select.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/animate-css/animate.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/jquery-ui/jquery-ui.css">
	<link rel="stylesheet" src="<%=request.getContextPath()%>/fonts/fontawesome-webfont.woff">
	<link rel="stylesheet" src="<%=request.getContextPath()%>/fonts/fontawesome-webfont.woff2">
	<link rel="stylesheet" src="<%=request.getContextPath()%>/fonts/fontawesome-webfont.ttf">
	<!-- main css -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/template/public/css/style.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/template/public/css/responsive.css">
</head>   
<body>

<!--================Header Menu Area =================-->
	<header class="header_area">
		<div class="top_menu row m0">
			<div class="container">
				<div class="float-left">
					<ul class="left_side">
						<li>
							<a href="login.html">
								<i class="fa fa-facebook-f"></i>
							</a>
						</li>
						<li>
							<a href="login.html">
								<i class="fa fa-twitter"></i>
							</a>
						</li>
						<li>
							<a href="login.html">
								<i class="fa fa-dribbble"></i>
							</a>
						</li>
						<li>
							<a href="login.html">
								<i class="fa fa-behance"></i>
							</a>
						</li>
					</ul>
				</div>
				<div class="float-right">
					<ul class="right_side">
						<li>
							<a href="<%=request.getContextPath()%>login.jsp">
								<i class="lnr lnr-phone-handset"></i>
								0935746935
							</a>
						</li>
						<li>
							<a href="#">
								<i class="lnr lnr-envelope"></i>
								Team21@gmail.com
							</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<a class="navbar-brand logo_h" href="<%=request.getContextPath()%>/index.jsp">
						<img src="<%=request.getContextPath()%>/template/public/img/logo.png" alt="">
					</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
					 aria-expanded="false" aria-label="Toggle navigation">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse offset" id="navbarSupportedContent">
						<div class="row ml-0 w-100">
							<div class="col-lg-12 pr-0">
								<ul class="nav navbar-nav center_nav pull-right">
									<li class="nav-item active">
										<a class="nav-link" href="<%=request.getContextPath()%>/index">Trang chủ</a>
									</li>
									<li class="nav-item ">
										<a class="nav-link" href="<%=request.getContextPath()%>/public/news">Tin tức</a>
									</li>
									<li class="nav-item ">
										<a class="nav-link" href="<%=request.getContextPath()%>/public/doctor">Bác sĩ</a>
									</li>
									<li class="nav-item submenu dropdown">
										<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Tư vấn</a>
										<ul class="dropdown-menu">
											<li class="nav-item">
												<a class="nav-link" href="<%=request.getContextPath()%>/public/advisory">Sức khỏe</a>
											</li>
											<li class="nav-item">
												<a class="nav-link" href="<%=request.getContextPath()%>/services.jsp"></a>
											</li>
											<li class="nav-item">
												<a class="nav-link" href="<%=request.getContextPath()%>/elements.jsp"></a>
											</li>
										</ul>
									</li>
									<li class="nav-item submenu dropdown">
										<a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Tài khoản</a>
										<ul class="dropdown-menu">
											<%
					                    		User userLogin = (User) session.getAttribute("userLogin");
					                    		if(userLogin != null){
					                    			
					                    	%>
					                    	<li class="nav-item">
												<a class="nav-link" href="<%=request.getContextPath()%>/logout">Đăng xuất</a>
											</li>
											<%} %>
											<li class="nav-item">
												<a class="nav-link" href="<%=request.getContextPath()%>/add">Đăng ký</a>
											</li>
										</ul>
									</li>  
									<li class="nav-item">
										<a class="nav-link" href="<%=request.getContextPath()%>/contact.jsp">Liên hệ</a>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</nav>
		</div>
	</header>
	<!--================Header Menu Area =================-->
	