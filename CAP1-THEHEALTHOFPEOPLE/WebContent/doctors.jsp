<%@page import="model.bean.Doctors"%>
<%@page import="java.util.ArrayList"%>
<%@page import="util.StringLibrary"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="/template/public/inc/header.jsp" %>
	<!--================ Banner Area =================-->
    <section class="banner_area">
        <div class="banner_inner d-flex align-items-center">
            <div class="container">
                <div class="banner_content text-left">
                    <h2>Bác sĩ</h2>
                    <div class="page_link">
                        <a href="<%=request.getContextPath()%>/index.jsp">Home</a>
                        <a href="<%=request.getContextPath()%>/doctors.jsp">Danh sách bác sĩ</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--================End Banner Area =================-->
	<!-- Start team Area -->
	<section class="team-area section_gap">
		<div class="container">
			<div class="row justify-content-center section-title-wrap">
				<div class="col-lg-12">
					<h1>Danh Sách Bác Sĩ</h1>
					<p>
						Chúng tôi có các bác sĩ chuyên khoa sẽ phụ trách tư vấn bệnh tình giúp bạn. Các bác sĩ có chuyên môn giỏi và có nhiều năm kinh nghiệm
					</p>
				</div>
			</div>
			
			
			
			<div class="row justify-content-center d-flex align-items-center">
					<%
						if (request.getAttribute("listDoctor") != null){
							ArrayList<Doctors> listDoctor = (ArrayList<Doctors>) request.getAttribute("listDoctor");
							if(listDoctor.size() > 0){
								for(int i=0; i<listDoctor.size(); i++){
						
						%>
				<div class="col-lg-3 col-md-6 single-team mb-50">
						
					<div class="thumb">
						<img class="img-fluid" src="<%=request.getContextPath()%>/template/public/img/<%=listDoctor.get(i).getPicture()%>" alt="">
						<div class="align-items-end justify-content-center d-flex">
							<div class="social-links">
								<a href="#">
									<i class="fa fa-facebook"></i>
								</a>
								<a href="#">
									<i class="fa fa-twitter"></i>
								</a>
								<a href="#">
									<i class="fa fa-dribbble"></i>
								</a>
								<a href="#">
									<i class="fa fa-behance"></i>
								</a>
							</div>
							<p>
								<%=listDoctor.get(i).getDepartment()%>
							</p>
							<h4><%=listDoctor.get(i).getName() %></h4>
						</div>
						
					</div>
				</div>
				<%}}} %>
			</div>
		</div>
	</section>
	<!-- End team Area -->

<%@include file="/template/public/inc/footer.jsp" %>

</html>