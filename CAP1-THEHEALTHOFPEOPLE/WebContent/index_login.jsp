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
                        <a href="<%=request.getContextPath()%>/index">Home</a>
                        <a href="<%=request.getContextPath()%>/login">Đăng ký thành công</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--================End Banner Area =================--> 
    
    <%
	String error = request.getParameter("err");
	String msg = request.getParameter("msg");
	if("1".equals(msg)){
		out.print("<div style='text-align: center; font-weight: bold; color: blue; background: yellow'>Đăng ký thành công thành công!</div>");
	}
	%>
    
    <!-- Start Offered Services Area -->
	<section class="service_area section_gap">
		<div class="container">
			<div class="row justify-content-center section-title-wrap">
				<div class="col-lg-12">
					<h1>ĐĂNG KÝ THÀNH CÔNG</h1>
					<p>
						Chúc mừng bạn đã đăng ký tài khoản thành công. 
					</p><br>
					<div class="page_link">
                        <p>Quay trở lại</p>
                        <a href="<%=request.getContextPath()%>/index">Trang chủ</a>
                    </div>
				</div>
			</div>

<%@include file="/template/public/inc/footer.jsp" %>
</html>