<%@page import="util.StringLibrary"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/template/public/inc/header.jsp" %>

<!--================ Banner Area =================-->
    <section class="banner_area">
        <div class="banner_inner d-flex align-items-center">
            <div class="container">
                <div class="banner_content text-left">
                    <h2>Đăng nhập</h2>
                    <div class="page_link">
                        <a href="<%=request.getContextPath()%>/index.jsp">Home</a>
                        <a href="<%=request.getContextPath()%>/login.jsp">Đăng nhập</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--================End Banner Area =================-->
<!-- Form elements --> 
<style>
	.myErrors {
		color:red;
	}
	.module-body{width:960px; margin: 0 auto;}
	.error{
		color:red;
		font-weight: bold;
		display:block;
	}
</style>
<%
	String err = request.getParameter("err");
	if("1".equals(err)){
		out.print("<div style='text-align: center; font-weight: bold; color: red; background: yellow'>Đăng nhập sai username hoặc password</div>");
	}
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
%>   



    

    <!-- Start Appointment Area -->
	<section class="appointment-area">
		<div class="container">
			<div class="row justify-content-between align-items-center appointment-wrap">
				<div class="col-lg-5 col-md-6 appointment-left">
					<h1>
						ĐĂNG NHẬP
					</h1>
					<p>
						
					</p>
					
				</div>
				<div class="col-lg-6 col-md-6 pt-60 pb-60">
					<div class="appointment-right">
						<form class="form-wrap" method="post">
							<h3 class="pb-20 text-center mb-20">Đăng nhập</h3>
							<input type="text" class="form-control" name="username" placeholder="Tên đăng nhập" onfocus="this.placeholder = ''" onblur="this.placeholder = 'username'" >
							<input type="password" class="form-control" name="password" placeholder="Mật khẩu " onfocus="this.placeholder = ''" onblur="this.placeholder = 'password'" >
							<div class="text-center">
								<button class="main_btn text-uppercase">Đăng nhập</button>
								<a class="main_btn text-uppercase" href="<%=request.getContextPath()%>/add">Đăng ký</a>
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