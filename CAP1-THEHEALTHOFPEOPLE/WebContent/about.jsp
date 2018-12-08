<%@page import="model.bean.QuestionSick"%>
<%@page import="model.bean.Sick"%>
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
                    <h2>Tư vấn sức khỏe</h2>
                    <div class="page_link">
                        <a href="<%=request.getContextPath()%>/index.jsp">Home</a>
                        <a href="<%=request.getContextPath()%>/about.jsp">Tư vấn</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--================End Banner Area =================-->
	<!-- Start Appointment Area -->
	<section class="appointment-area">
		<div class="container">
			<div class="row justify-content-between align-items-center appointment-wrap">
				<div class="col-lg-5 col-md-6 appointment-left">
					<h1>
						Tư vấn sức khỏe
					</h1>
					<p>
						Chúng tôi luôn sẵn sàng tư vấn, giải đáp mọi thắc mắc của bạn. Nếu bạn có thắc mắc hãy điền vào khung và gửi cho chúng tôi.
					</p>
					
				</div>
				<div class="col-lg-6 col-md-6 pt-60 pb-60">
					<div class="appointment-right">
						<form class="form-wrap" action="#">
							<h3 class="pb-20 text-center mb-20">Tư vấn</h3>
							<div class="form-select" id="service-select">
								<select>
								
									<option data-display="">Bạn bị bệnh gì?</option>
								<%
										if (request.getAttribute("listSick") != null){
											ArrayList<Sick> listSick = (ArrayList<Sick>) request.getAttribute("listSick");
											if(listSick.size() > 0){
												for(int i=0; i < listSick.size(); i++){
										
								%>	
									<option value="<%=listSick.get(i).getId()%>"><%=listSick.get(i).getNameSick()%></option>
								<%} }} %>
								</select>
								<br>
								<select>
								<%
									if(request.getAttribute("listQuestion") != null){
										ArrayList<QuestionSick> listQuestion = (ArrayList<QuestionSick>) request.getAttribute("listQuestion");
										if(listQuestion.size() > 0){
											for(int i = 0; i < listQuestion.size(); i++){
									
								%>
									<option data-display="<%=listQuestion.get(i).getQuestion() %>"></option>
								<%}}} %>
									<option value="1">Sáng</option>
									<option value="2">Trưa</option>
									<option value="3">Chiều</option>
								
								</select>
								<br>
								<select>
									<option data-display="">Bạn ho như thế nào</option>
									<option value="1">Ho khan</option>
									<option value="2">Ho nửa đầu</option>
									<option value="3">Ho cấp</option>
									<option value="4">Ho ra máu</option>
								</select>
							</div>
							
							<div class="text-center">
								<button class="main_btn text-uppercase">Tu vấn</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- End Appointment Area -->

	<!--================ About Myself Area =================-->
	<section class="about_myself section_gap">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 pr-0">
					<div class="about_img">
						<img class="img-fluid w-100" src="<%=request.getContextPath()%>/template/public/img/about-me.jpg" alt="">
					</div>
				</div>

				<div class="col-lg-6 pl-0">
					<div class="about_box">
						<div class="section-title-wrap text-left">
							<h1>Về chúng tôi</h1>
							<p>
								Chúng tôi cung cấp cho bạn các giải pháp về sức khỏe, tư vấn miễn phí về các vấn đề sức khỏe của người dùng.
							</p>
						</div>

						<div class="activity">
							<div class="row">
								<div class="col-lg-6 col-md-6">
									<div class="activity_box">
										<div>
											<i class="lnr lnr-database"></i>
										</div>
										<h3>$<span class="counter">2.5</span> M</h3>
										<p>Total Donation</p>
									</div>
								</div>

								<div class="col-lg-6 col-md-6">
									<div class="activity_box">
										<div>
											<i class="lnr lnr-book"></i>
										</div>
										<h3 class="counter">1465</h3>
										<p>Total Project</p>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="activity_box">
										<div>
											<i class="lnr lnr-users"></i>
										</div>
										<h3 class="counter">3965</h3>
										<p>Total Volunteers</p>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="activity_box">
										<div>
											<i class="lnr lnr-users"></i>
										</div>
										<h3 class="counter">3965</h3>
										<p>Total Volunteers</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ End About Myself Area =================-->

	<!-- Start Feedback Area -->
	<section class="feedback_area section_gap relative">
		<div class="container">
			<div class="row justify-content-center section-title-wrap">
				<div class="col-lg-12">
					<h1>Enjoy our Client’s Feedback</h1>
					<p>
						Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
					</p>
				</div>
			</div>

			<div class="feedback_contents justify-content-center align-items-center">
				<div class="active-review-carusel owl-carousel">
					<div class="row">
						<div class="col-lg-6">
							<img src="img/feedback-bg.jpg" alt="">
						</div>

						<div class="col-lg-6">
							<div class="single-feedback-carusel">
								<div class="d-flex flex-row">
									<h4 class="">Fannie Rowe</h4>
									<div class="star">
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star"></span>
									</div>
								</div>
								<p class="">
									Accessories Here you can find the best computer accessory for your laptop, monitor, printer, scanner, speaker. Here you can
									find the best computer accessory for your laptop, monitor, printer, scanner, speaker.
								</p>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-lg-6">
							<img src="img/feedback-bg.jpg" alt="">
						</div>

						<div class="col-lg-6">
							<div class="single-feedback-carusel">
								<div class="d-flex flex-row">
									<h4 class="">Fannie Rowe</h4>
									<div class="star">
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star"></span>
									</div>
								</div>
								<p class="">
									Accessories Here you can find the best computer accessory for your laptop, monitor, printer, scanner, speaker. Here you can
									find the best computer accessory for your laptop, monitor, printer, scanner, speaker.
								</p>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-lg-6">
							<img src="img/feedback-bg.jpg" alt="">
						</div>

						<div class="col-lg-6">
							<div class="single-feedback-carusel">
								<div class="d-flex flex-row">
									<h4 class="">Fannie Rowe</h4>
									<div class="star">
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star"></span>
									</div>
								</div>
								<p class="">
									Accessories Here you can find the best computer accessory for your laptop, monitor, printer, scanner, speaker. Here you can
									find the best computer accessory for your laptop, monitor, printer, scanner, speaker.
								</p>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-lg-6">
							<img src="img/feedback-bg.jpg" alt="">
						</div>

						<div class="col-lg-6">
							<div class="single-feedback-carusel">
								<div class="d-flex flex-row">
									<h4 class="">Fannie Rowe</h4>
									<div class="star">
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star checked"></span>
										<span class="fa fa-star"></span>
									</div>
								</div>
								<p class="">
									Accessories Here you can find the best computer accessory for your laptop, monitor, printer, scanner, speaker. Here you can
									find the best computer accessory for your laptop, monitor, printer, scanner, speaker.
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- End Feedback Area -->

<%@include file="/template/public/inc/footer.jsp" %>

</html>