<%@page import="util.StringLibrary"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="/template/public/inc/header.jsp" %>
	<!--================ Banner Area =================-->
	<section class="banner_area">
		<div class="banner_inner d-flex align-items-center">
			<div class="container">
				<div class="banner_content text-left">
					<h2>Đăng ký</h2>
					<div class="page_link">
						<a href="index.jsp">Home</a>
						<a href="signin.jsp">Đăng ký</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Banner Area =================-->
<%
	String check = request.getParameter("check");
	if("1".equals(check)){
		out.print("<div style='text-align: center; font-weight: bold; color: red; background: yellow'>Đăng ký thất bại thất bại!</div>");
	}
	String username = request.getParameter("username");
	if(username == null){
		username = "";
	}
	String password = request.getParameter("password");
	if(password == null){
		password = "";
	}
	String fullname = request.getParameter("fullname");
	if(fullname == null){
		fullname = "";
	}
	String email = request.getParameter("email");
	if(email == null){
		email = "";
	}
	String ngaySinh = request.getParameter("ngaysinh");
	if(ngaySinh == null){
		ngaySinh = "";
	}
%>   
	<!-- Start Appointment Area -->
	<section class="appointment-area">
		<div class="container">
			<div class="row justify-content-between align-items-center appointment-wrap">
				<div class="col-lg-5 col-md-6 appointment-left">
					<h1>
						Đăng ký
					</h1>
					<p>
						
					</p>
					
				</div>
				<div class="col-lg-6 col-md-6 pt-60 pb-60">
					<div class="appointment-right">
						<form class="form-wrap" action="" method="post">
							<h3 class="pb-20 text-center mb-20">Đăng ký</h3>
							<input type="text" class="form-control" name="username" placeholder="Tên đăng nhập " onfocus="this.placeholder = ''" onblur="this.placeholder = 'username'" required="" value="<%=username%>">
							<input type="password" class="form-control" name="password" placeholder="Mật khẩu " onfocus="this.placeholder = ''" onblur="this.placeholder = 'password'" required="" value="<%=password%>">
							<input type="text" class="form-control" name="fullname" placeholder="Họ và tên" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Họ và tên:'" required="" value="<%=fullname%>">
							<input type="email" class="form-control" name="email" placeholder="Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email'" required="" value="<%=email%>">
							<input id="datepicker1" name="ngaysinh" class="dates form-control" placeholder="Ngày sinh" type="text" value="<%=ngaySinh%>">
							<div class="text-center">
								<button class="main_btn text-uppercase" name= "dangky" type="submit">Đăng ký</button>
								<button class="main_btn text-uppercase" name="reset" type="reset">Nhập lại</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- End Appointment Area -->

<%@include file="/template/public/inc/footer.jsp" %>
</html>