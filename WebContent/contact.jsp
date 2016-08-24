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
		<div class="header_bottom">
		</div>
		<!-----end-header-------->
		<!---start-getintouch---->
			<div class="get-intouch" id="contact">
				<div class="wrap">
					<h3>Contact Us</h3>
				<div class="get-intouch-grids">
					<div class="get-intouch-left-address">
						<h4>Cras at ultrices erat, sed vulputate eros nunc at augue gravida!</h4>
						<p>2345 Setwant natrer, 1234</p>
						<p>Washington. United States.</p>
						<p>(401) 1234 567</p>
						<p><a href="mailto:hello@mykingdom.com">hello@mykingdom.com</a></p>
					</div>
					<div class="get-intouch-center-form">
						<h5>Say hello!</h5>
						<form method="post" action="contact-post.html">
							<input class="frist" type="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}">
							<input type="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
							<textarea onfocus="if(this.value == 'Your Message') this.value='';" onblur="if(this.value == '') this.value='Your Message';" >Your Message</textarea>
							<input type="submit" value="Send message" />
							<div class="clear"> </div>
						</form>
					</div>
					<!-- aToolTip js -->
						<script type="text/javascript" src="js/jquery.atooltip.js"></script>
						<script type="text/javascript">
							$(function(){ 
								$('a.normalTip').aToolTip();
								}); 
						</script>
					<div class="clear"> </div>
				</div>
				</div>
				<div class="map">
					<iframe width="100%" height="200" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=India&amp;aq=0&amp;oq=indi&amp;sll=44.746733,-108.533936&amp;sspn=5.859437,13.392334&amp;ie=UTF8&amp;hq=&amp;hnear=India&amp;ll=20.593684,78.96288&amp;spn=3.787665,6.696167&amp;t=m&amp;z=8&amp;output=embed"> </iframe>
				</div>
			</div>
			<!---//End-getintouch---->
			<!----start footer------>
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
							<span>~2 days ago</span>
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