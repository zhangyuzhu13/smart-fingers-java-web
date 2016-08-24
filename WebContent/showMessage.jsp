<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>银座·园艺创智天地 儿童手工DIY工坊</title>
 

<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="css/magnific-popup.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
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
			 
		<!------start-768px-menu---->
			<div class="header_sub">
				<div class="h_menu">
					<ul>
						<ul>
							<li class="active"><a href="index.jsp">网站首页</a></li>
                            <li><a href="<s:url action='ShowCourseAction'/>">手工制作</a></li>    
                  			<li><a href="<s:url action='ShowCourseAction'/>"> 动画教程</a>   </li>
                  			<li><a href="<s:url action='ShowMessageAction'/>"> 留言互动</a>   </li>
                            <li><a href="contact.jsp">联系我们</a></li>
						
				
				 
		    		 
					</ul>
				</ul>
				</div>
				<div class="clear"> </div>
			</div>
	</div>
</div>
<!--------start-blog----------->
<div class="blog">
	<div class="main">
		  	<div class="wrap">
			 	<div class="single-top">
				 <div class="wrapper_single">
					  <div class="wrapper_top">
                      <s:iterator id="messages" value="#request.messages">
    				  <s:if test="#messages.id!=null" >
						<div class="grid_1 alpha">
							<div class="date">
								<s:property value="#messages.message_date" />
							</div>
						</div>
					 	<div class="content span_2_of_single">
						   		 
								<div class="content">
									<div class="span-1-of-1">
										<a href="pages.html"><img src="${pageContext.request.contextPath}/images/messages/<s:property value='#messages.message_image_path'/>" height="200" width="380"></a>
									</div>
									<div class="span-1-of-2">
						 				 <p><s:property value="#messages.message_text" /></p>
						 				<p>留言人： <s:property value="#messages.user.user_name" /> </p>
						 			</div>
						 			<div class="clear"> </div>
								</div>	
								
						</div>
						<div class="clear"> </div>
					<br/><br/><br/>
					</s:if>
    				</s:iterator>
    
    				<s:a href="./UploadMessage.jsp">参与评论</s:a> 
				</div> 	
		</div>
		<div class="rsidebar span_1_of_3">
				<div class="search_box">
                	 
                      
					<form>
					   <input type="text" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
				    </form>
			 	</div>
               <div class="social_2">	
               	<h4>Follow Us</h4>
	           <ul>	
				    <li class="facebook"><a href="#"><span> </span></a></li>
				    <li class="twitter"><a href="#"><span> </span></a></li>	 	
					<li class="google"><a href="#"><span> </span></a></li>
			  </ul>
		 	  </div>
               <div class="email_box">
					<form>
						<div class="email">
					  		 <input type="text" value="Enter Your e-mail" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Enter Your e-mail';}">
					  	</div>
					  	 <div class="button">
						   	 <span><input type="submit" value="Subscribe"></span>
						</div>
				    </form>
			 	</div>
			 	 
		        <div class="popularpost">
		        	<h4>Popular Post</h4>
		        	<div class="image_b">
		        		<a href="#"><img src="images/sb5.jpg"/></a>
		        	</div>
		        	<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
		        	<div class="link_1">
		        		<p><a href="#">Sep 26,2013 </a></p>
		        		<a href="#" class="arrow_btn right">Read More</a>
		        		<div class="clear"> </div>
		        	</div>
		        </div>
		       
		        <div class="tags">
		        	<h4>Tags</h4>
		        	<ul>
		        		<li><a href="#">design</a></li>
		        		<li><a href="#">development</a></li>
		        		<li><a href="#">multipurpose</a></li>
		        		<li><a href="#">seo</a></li>
		        		<div class="clear"> </div>
		        	</ul>
		        </div>
		</div>
		
		<div class="clear"> </div>
	</div>	
	<div class="pages">
							<ul>
								<li class="preview"><a href="#"><span> </span></a></li>
								<li><a href="#">1 </a></li>
								<li><a href="#">2 </a></li>
								<li><a href="#">3 </a></li>
								<li><a href="#">4 </a></li>
								<li><a href="#">5 </a></li>
								<li><a href="#">.... </a></li>
								<li><a href="#">78</a></li>
								<li class="next"><a href="#"><span> </span></a></li>
								<div class="clear"> </div>
							</ul>
						</div>
<!----//End-content---->
	</div>
</div>	
</div>	
<!--------//end-blog----------->
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
				       <p> 2014 Template. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> 
- 
Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a> </p>
			  </div>
	</body>
</html>