<%@page import="util.StringLibrary"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/template/public/inc/header.jsp" %>

<!--================ Home Banner Area =================-->
	<section class="home_banner_area">
		<div class="banner_inner d-flex align-items-center">
			<div class="container">
				<div class="banner_content row">
					<div class="col-lg-12">
						<h1>Hãy để chúng tôi chăm sóc sức khỏe của bạn</h1>
						<p>Điều quí giá nhất của mỗi con người đó chính là sức khỏe của chúng ta. Vì vậy, để chăm sóc sức khỏe của mình, bạn đừng ngại ngần chia sẻ với chúng tôi</p>
						<a class="main_btn mr-10" href="#">get started</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ End Home Banner Area =================--> 


	

	<!--================ Procedure Category Area =================-->
	<section class="procedure_category section_gap">
		<div class="container">
			<div class="row justify-content-center section-title-wrap">
				<div class="col-lg-12">
					<h1>Danh mục</h1>
					<p>
						Danh mục tư vấn về các vấn đề sức khỏe của người dùng
					</p>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-4">
					<div class="categories_post">
						<img src="<%=request.getContextPath()%>/template/public/img/procedure/p1.jpg" alt="Procedure">
						<div class="categories_details">
							<div class="categories_text">
								<div class="border_line"></div>
								<a href="<%=request.getContextPath()%>/about.jsp">
									<h5>Tư vấn bệnh lý</h5>
								</a>
								<div class="border_line"></div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="categories_post">
						<img src="<%=request.getContextPath()%>/template/public/img/procedure/p2.jpg" alt="Procedure">
						<div class="categories_details">
							<div class="categories_text">
								<div class="border_line"></div>
								<a href="<%=request.getContextPath()%>/public/bmi">
									<h5>Chỉ số BMI</h5>
								</a>
								<div class="border_line"></div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="categories_post">
						<img src="<%=request.getContextPath()%>/template/public/img/procedure/p3.jpg" alt="Procedure">
						<div class="categories_details">
							<div class="categories_text">
								<div class="border_line"></div>
								<a href="<%=request.getContextPath()%>/kinhnguyet.jsp">
									<h5>Tư vấn kinh nguyệt</h5>
								</a>
								<div class="border_line"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ End Procedure Category Area =================-->

	<!--================ About Myself Area =================-->
	<section class="about_myself pad_bottom">
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
										<h3><span class="counter">2.5</span> M</h3>
										<p>Lượt truy cập</p>
									</div>
								</div>

								<div class="col-lg-6 col-md-6">
									<div class="activity_box">
										<div>
											<i class="lnr lnr-book"></i>
										</div>
										<h3 class="counter">1465</h3>
										<p>Tư vấn</p>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="activity_box">
										<div>
											<i class="lnr lnr-users"></i>
										</div>
										<h3 class="counter">3965</h3>
										<p>Câu hỏi</p>
									</div>
								</div>
								<div class="col-lg-6 col-md-6">
									<div class="activity_box">
										<div>
											<i class="lnr lnr-users"></i>
										</div>
										<h3 class="counter">20</h3>
										<p>Bác sĩ</p>
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


	<!--================ Start Feedback Area =================-->
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
							<img src="<%=request.getContextPath()%>/template/public/img/feedback-bg.jpg" alt="">
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
							<img src="<%=request.getContextPath()%>/template/public/img/feedback-bg.jpg" alt="">
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
							<img src="<%=request.getContextPath()%>/template/public/img/feedback-bg.jpg" alt="">
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
							<img src="<%=request.getContextPath()%>/template/public/img/feedback-bg.jpg" alt="">
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
	<!--================ End Feedback Area =================-->



	<!--================ Start Appointment Area =================-->
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
							<input type="text" class="form-control" name="name" placeholder="Họ và tên" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Họ và tên:'">
							<input type="text" class="form-control" name="phone" placeholder="Số điện thoại " onfocus="this.placeholder = ''" onblur="this.placeholder = 'Số điện thoại'">
							<input type="email" class="form-control" name="email" placeholder="Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email'">
							<input id="datepicker1" name="dop" class="dates form-control" placeholder="Ngày sinh" type="text">
							<div class="form-select" id="service-select">
								<select>
									<option data-display="">Tình trạng bệnh</option>
									<option value="1">Ho</option>
									<option value="2">Đau đầu</option>
									<option value="3">Chóng mặt</option>
									<option value="4">Tức ngực</option>
								</select>
							</div>
							<textarea name="messege" class="" rows="5" placeholder="Chi tiết tình trạng bệnh" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Messege'"></textarea>
							<div class="text-center">
								<button class="main_btn text-uppercase">Gửi</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ End Appointment Area =================-->

	

<%@include file="/template/public/inc/footer.jsp" %>



	

</html>