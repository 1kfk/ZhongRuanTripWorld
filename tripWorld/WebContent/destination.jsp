<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by FreeHTML5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="FreeHTML5.co" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700"
	rel="stylesheet">

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

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>

	<div class="gtco-loader"></div>

	<div id="page">

		<!-- <div class="page-inner"> -->

		<c:import url="header.jsp"></c:import>

		<div id="gtco-subscribe" style="background-image: url(images/BIG1.png);  background-repeat:no-repeat;background-size:2000px 800px;">
			<div class="gtco-container">
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2>江南美景欢迎您！</h2>
						<p>鱼米之乡，人间仙境，地府天国</p>
					</div>
				</div>
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2">
						<form class="form-inline" action="destination" >
							<div class="col-md-6 col-sm-6">
								<div class="form-group">
									<input type="text" class="form-control" name="place"
										placeholder="你想去的地方？">
								</div>
							</div>
							<div class="col-md-6 col-sm-6">
								<button type="submit" class="btn btn-default btn-block">点击查询</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

		<div class="gtco-section">
			<div class="gtco-container">

				<div class="row">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2>你想去哪呢？</h2>
						<p>这里有我们国家江南众多旅游景点，选择您喜爱的地方，早日前往观景吧！</p>
					</div>
				</div>

				<div class="row">
					<c:forEach items="${places}" var="places">
						<div class="col-lg-4 col-md-4 col-sm-6" id="jiangxi">
							<a href="scene/${places.scene}"
								class="fh5co-card-item image-popup">
								<figure>
									<div class="overlay">
										<i class="ti-plus"></i>
									</div>
									<img src="scene/${places.scene}" alt="Image"
										class="img-responsive">
								</figure>
								<div class="fh5co-text">
									<h2>${places.location}</h2>
									<p>${places.assess}</p>
									门票价格<span>${places.price_low}元 ~ ${places.price_low}元</span>
									<p>
										<a href="pricings?place_id=${places.id}" class="btn btn-primary">选择方案 </a>
									</p>
								</div>
							</a>
						</div>
					</c:forEach>
				</div>

			</div>
		</div>

		<c:import url="footer.jsp"></c:import>

		<!-- </div> -->

	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>

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


<script type="text/javascript" src="js/user.js"></script>
	<!-- Main -->
	<script type="text/javascript">
	var bigu = '${bigu}';
	</script>
	<script src="js/main.js"></script>
</body>
</html>

