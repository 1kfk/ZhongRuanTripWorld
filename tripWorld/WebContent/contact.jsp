<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
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
	
	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image: url(images/img_bg_1.jpg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					<div class="row row-mt-15em">

						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<span class="intro-text-small">欢迎你的到来</span>
							<h1>联系 我们</h1>	
						</div>
						
					</div>
					
				</div>
			</div>
		</div>
	</header>
	
	
	<div class="gtco-section border-bottom">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12">
					<div class="col-md-6 animate-box">
					<h3>建议与评价</h3>
					<form action="contact2" method="post">
						<div class="row form-group">
							<div class="col-md-12">
								<label class="sr-only" for="name">名字</label>
								<input type="text" id="name" name="name" class="form-control" placeholder="名字">
							</div>
							
						</div>

						<div class="row form-group">
							<div class="col-md-12">
								<label class="sr-only" for="email">去了</label>
								<input type="text" id="email" name="gowhere" class="form-control" placeholder="去了哪儿">
							</div>
						</div>

						<div class="row form-group">
							<div class="col-md-12">
								<label class="sr-only" for="subject">心情</label>
								<input type="text" id="subject" name="emotion" class="form-control" placeholder="心情如何">
							</div>
						</div>

						<div class="row form-group">
							<div class="col-md-12">
								<label class="sr-only" for="message">请说</label>
								<textarea  id="message"  name="talking" cols="30" rows="10" class="form-control" placeholder="想说的"></textarea>
							</div>
						</div>
						<div class="form-group">
							<input type="submit" value="提交"  onclick="getMessage()" class="btn btn-primary">
						</div>

					</form>		
				</div>
				<div class="col-md-5 col-md-push-1 animate-box">
					
					<div class="gtco-contact-info">
						<h3>联系我们</h3>
						<ul>
							<li class="address">198 平西 21th街 , <br> Suite 721 南昌 10016</li>
							<li class="phone"><a href="tel://1234567920">+ 1235 2355 98</a></li>
							<li class="email"><a href="mailto:info@yoursite.com">314597@qq.com</a></li>
							<li class="url"><a href="https://freehtml5.co"></a></li>
						</ul>
					</div>


				</div>
				</div>
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
	
<script type="text/javascript">
var bigu = '${bigu}';

function getMessage(){

	alert("评价成功，谢谢。");
}

</script>



	<!-- Main -->
	<script src="js/main.js"></script>
<script type="text/javascript" src="js/user.js"></script>
	</body>
</html>

