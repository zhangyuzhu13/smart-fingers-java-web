<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>儿童手工DIY教学营销网站</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />


<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/owl.carousel.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/magnific-popup.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script src="js/owl.carousel.js"></script>
	<script>
			$(document).ready(function() {
				$("#owl-demo").owlCarousel({
					items : 4,
					lazyLoad : true,
					autoPlay : true,
					navigation : true,
					navigationText : ["", ""],
					rewindNav : false,
					scrollPerPage : false,
					pagination : false,
					paginationNumbers : false,
				});
			});
		</script>
		<!-- //Owl Carousel Assets -->
		<!-----768px-menu----->
		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />
		<script type="text/javascript" src="js/jquery.mmenu.js"></script>
			<script type="text/javascript">
				//	The menu on the left
				$(function() {
					$('nav#menu-left').mmenu();
				});
		</script>
		<!-----//768px-menu----->
</head>
<body>
<!-- start header -->
<div class="header_bg">
<div class="wrap">
	<div class="header">
		<div class="logo">
			 <a>
				<img src="images/lg.png" alt=""/>
				<h1>儿童手工DIY教学营销网站</h1>
                </a> 
				<div class="clear"> </div>
		</div>
		<div class="text">
		  <s:if test="#session.user_name==null">
				 
					 <a href="login.jsp" style="color:#1c0756">登陆</a> 
					
				 
					</s:if>

					<s:if test="#session.user_name!=null">
				 
					 <a href="backStage.jsp" style="color:#1c0756">我的主页〉</a> 
					 <a href="<s:url action='LogoutAction' method='logout'/>" style="color:#1c0756">注销</a> 
            	 
					</s:if>
		</div>
		<div class="clear"> </div>
	</div>
</div>
</div>
<!-- start header -->
<div class="header_btm">
	<div class="wrap">
		 
		<!------start-768px-menu---->
			<div class="header_sub">
				<div class="h_menu">
					<ul>
						<ul>
							<li class="active"><a href="index.html">网站首页</a></li>  
                            <li><a href="<s:url action='ShowCourseAction'/>">手工制作</a></li>     
                  			<li><a href="<s:url action='ShowCourseAction'/>"> 动画教程</a>   </li> 
                  			<li><a href="<s:url action='ShowMessageAction'/>"> 留言互动</a>   </li> 
                            <li><a href="contact.jsp">联系我们</a></li><span/>
						
				
				 
		    		
					</ul>
				</ul>
				</div>
				<div class="clear"> </div>
			</div>
	</div>
</div>
			<!---start-banner---->
			<div class="banner" id="move-top">
				<!----start-image-slider---->
					<div data-scroll-reveal="enter bottom but wait 0.7s" class="img-slider" id="home">
						<div class="wrap">
							<div class="slider">
								<ul id="jquery-demo">
								  <li>
								    <a href="#slide1">
								    </a>
								    <div data-scroll-reveal="enter bottom but wait 0.7s" class="slider-detils">
								    	<h3>Lorem ipsum dolor sit amet.</h3>
								    	<span>consectetur adipisc ing elit</span>
								    </div>
								  </li>
								  <li>
								    <a href="#slide2">
								    </a>
								      <div data-scroll-reveal="enter bottom but wait 1s" class="slider-detils">
								    	<h3>Lorem Ipsum has been the industry's</h3>
								    	<span>Aliquam viverra consectetur nibh a blan dit.</span>
								    	</div>
								  </li>
								  <li>
								    <a href="#slide3">
								    </a>
								      <div data-scroll-reveal="enter bottom but wait 1.5s" class="slider-detils">
								      	<h3>There are many variations of passages </h3>
								    	<span>Proin at amet consectetur adipisc lacinia.</span>
								    </div>
								  </li>
								</ul>
							</div>
						</div>
					</div>
					<div class="clear"> </div>
				</div>
                <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="缃戠珯妯℃澘">缃戠珯妯℃澘</a></div>
						<!---slider---->
				<link rel="stylesheet" href="css/slippry.css">
				<script src="js/jquery-ui.js" type="text/javascript"></script>
				<script src="js/scripts-f0e4e0c2.js" type="text/javascript"></script>
				<script>
					  jQuery('#jquery-demo').slippry({
					  // general elements & wrapper
					  slippryWrapper: '<div class="sy-box jquery-demo" />', // wrapper to wrap everything, including pager
					  // options
					  adaptiveHeight: false, // height of the sliders adapts to current slide
					  useCSS: false, // true, false -> fallback to js if no browser support
					  autoHover: false,
					  transition: 'fade'
					});
				</script>
				<!---scrooling-script--->
					<!----//End-image-slider---->
					<div class="simple-text">
						<div class="wrap">
							<h4>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</h4>
							<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
						</div>
					</div>
			<div class="Recent-wroks"><!-- start services -->
				<div class="wrap">
				<div class="Recent-wrok">
					<h5 class="heading">Recent wrok</h5>
					<!----start-img-cursual---->
					<div id="owl-demo" class="owl-carousel">
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/11.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/1.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Lorem ipsum dolor amet,consectetur adipisicing elit, sed do eiusmod tempor incididunt dolore magna aliqua.
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/22.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/2.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/33.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/3.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									On the other hand, we denounce with righteous indignation and dislike men who are so beguiled  pleasure of the moment,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/44.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/4.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Lorem ipsum dolor amet,consectetur adipisicing elit, sed do eiusmod tempor incididunt dolore magna aliqua.
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/11.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/1.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/22.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/2.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									On the other hand, we denounce with righteous indignation and dislike men who are so beguiled  pleasure of the moment,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/44.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/4.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/33.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/3.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									On the other hand, we denounce with righteous indignation and dislike men who are so beguiled  pleasure of the moment,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/11.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/1.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Lorem ipsum dolor amet,consectetur adipisicing elit, sed do eiusmod tempor incididunt dolore magna aliqua.
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/44.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/4.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/33.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img src="images/3.jpg" >
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									On the other hand, we denounce with righteous indignation and dislike men who are so beguiled  pleasure of the moment,
								</p>
							</div>
						</div>
						<div class="item">
							<div class="cau_left">
								<div id="nivo-lightbox-demo"> <p> <a href="images/22.jpg" data-lightbox-gallery="gallery1" id="nivo-lightbox-demo"> <span class="rollover"> </span></a> </p></div>
								<img  src="images/2.jpg">
							</div>
							<div class="cau_left">
								<h4><a href="#">Lorem ipsum</a></h4>
								<p>
									Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium,
								</p>
							</div>
						</div>
					</div>
					<!----//End-img-cursual---->
				</div>
				 <script type="text/javascript" src="js/nivo-lightbox.min.js"></script>
				<script type="text/javascript">
				$(document).ready(function(){
				    $('#nivo-lightbox-demo a').nivoLightbox({ effect: 'fade' });
				});
				</script>

				</div>
			</div>
			  	 
			 
			<div class="footer">
				<div class="wrap">
					<div class="footer-left">
						<h3>About eracle</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
						<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident.</p>
					<div class="detail">
						<ul>
							<li><a href="#">home/</a></li>
							<li><a href="#">term of services/</a></li>
							<li><a href="#">license/</a></li>
							<li><a href="#">pess</a></li>
							<div class="clear"> </div>	
						</ul>
					</div>
					<div class="soc_icons soc_icons1">
							<ul>
								<li><a class="icon1" href="#"> </a> </li>
								<li><a class="icon2" href="#"> </a></li>
								<li><a class="icon3" href="#"> </a></li>
								<div class="clear"> </div>	
							</ul>
								
					</div>
					</div>
					<div class="footer-right">
						<h3>twitter</h3>
						<div class="comments1">
							<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident. consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.</p>
							<span>~12 hours ago</span>
						</div>
						<div class="comments1">
							<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
						
						</div>
					</div>
					<div class="clear"> </div>	
				</div>
			</div>
			<div class="copy">
				       <p>漏 2014 Template. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="妯℃澘涔嬪">妯℃澘涔嬪</a> 
- 
Collect from <a href="http://www.cssmoban.com/" title="缃戦〉妯℃澘" target="_blank">缃戦〉妯℃澘</a> </p>
			  </div>
</body>
</html>