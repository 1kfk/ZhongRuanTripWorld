<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Home</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="FreeHTML5.co" />

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Themify Icons-->
	<link rel="stylesheet" href="css/themify-icons.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	</head>
	<body>
		
	<div class="gtco-loader"></div>
	
	<div id="page">

	
	<!-- <div class="page-inner"> -->
	<c:import url="header.jsp"></c:import>
	
	<header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image: url(images/img_bg_2.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					

					<div class="row row-mt-15em">
						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<h1>你从哪里来? </h1><br>
							<h1>要去往何方? </h1>	
						</div>
						<div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
							<div class="form-wrap">
								<div class="tab">
									
									<div class="tab-content">
										<div class="tab-content-inner active" data-content="signup">
											<h3>为你的旅行购票</h3>
											<form action="contact">
												<div class="row form-group">
													<div class="col-md-12">
														<label for="fullname">姓名</label>
														<input type="text" id="fullname" name="name" class="form-control">
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="fullname">身份证</label>
														<input type="text" id="fullname" name="idcard" class="form-control">
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="activities">所在地</label>
														
														省：<select id="cmbProvince" name="atshen"></select>
														市：<select id="cmbCity" name="atshi"></select>
														<select id="cmbArea" style="display: none;"></select>
														
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="destination">目的地</label>
														
														省：<select id="Select1" name="goshen"></select>
														市：<select id="Select2" name="goshi"></select>
														<select id="Select3" style="display: none;"></select>
													
													</div>
												</div>
												
												<div class="row form-group">
													<div class="col-md-12">
														<label for="date-start">出发时间</label>
														<input type="text" id="date-start" name="time" class="form-control">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<input type="submit" class="btn btn-primary btn-block" value="提交">
													</div>
												</div>
											</form>	
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	

	<c:import url="footer.jsp"></c:import>
	<!-- </div> -->

	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!--反馈地理信息  -->
	<script  src="js/jsAddress.js"></script>
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>

	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>

	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	
	<!-- Datepicker -->
	<script src="js/bootstrap-datepicker.min.js"></script>
	

	<!-- Main -->
	<script src="js/main.js"></script>


	<!--选择地理位置  -->
	<script type="text/javascript">
    addressInit('cmbProvince', 'cmbCity', 'cmbArea', '福建', '厦门市', '集美区');
    addressInit('Select1', 'Select2', 'Select3');
    var bigu = '${bigu}';
	</script>
<script type="text/javascript" src="js/user.js"></script>
	</body>
</html>

