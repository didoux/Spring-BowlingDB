<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.application-resources"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
    <head>
        <title><fmt:message key="application.title"/></title>
		<style type="text/css" media="screen">
			@import url("${pageContext.request.contextPath}/resources/dojo/resources/dojo.css");
			@import url("${pageContext.request.contextPath}/resources/dijit/themes/tundra/tundra.css");
		</style>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/dojo/dojo.js" djconfig="parseOnLoad: true" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/spring/Spring.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/spring/Spring-Dojo.js"></script>
		<script type="text/javascript">dojo.require("dojo.parser");</script>
		
		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" /> 
		<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/index.jsp")){ %>
		<link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet" type="text/css" /> 
		<% } %>     
		<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/pages/login.jsp")){ %>
		<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" /> 
		<% } %>		
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.gif" />
		<decorator:head />
    </head>
	<body class="tundra spring">
		<div id="wrapper">
			<jsp:include page="/WEB-INF/sitemesh-common/header.jsp" />
		    <% if (!((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/index.jsp")){ %>
		    <div id="nav">
				<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/index.jsp"><span><img src="${pageContext.request.contextPath}/images/icons/back.gif" /><fmt:message key="navigation.backToDashboard"/></span></a></div>
		    </div>
			<% } %>     
			<div id="contentwrapper">      
				<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/index.jsp")){ %>
		        <jsp:include page="/WEB-INF/sitemesh-common/dashboard.jsp" />
				<% }else{ %>
				<decorator:body />
				<% } %>
				<div class="hidden">&nbsp;</div>     
			</div><!-- end contentwrapper -->   
			<jsp:include page="/WEB-INF/sitemesh-common/footer.jsp" />
		</div><!-- end wrapper -->
		<img src="${pageContext.request.contextPath}/images/button_hover.gif" class="hidden"/>
		<img src="${pageContext.request.contextPath}/images/button_span_hover.gif" class="hidden"/>
	</body>
</html>



