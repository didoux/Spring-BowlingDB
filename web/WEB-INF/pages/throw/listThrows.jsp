<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.throw-resources"/>
<html>
<head>
<title>List <fmt:message key="throw.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="throw.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newThrow"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="throw.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="throw.id.title"/></th>
					<th class="thead"><fmt:message key="throw.frameid.title"/></th>
					<th class="thead"><fmt:message key="throw.nbr.title"/></th>
					<th class="thead"><fmt:message key="throw.nbrofpinsdown.title"/></th>
					<th class="thead"><fmt:message key="throw.1pin.title"/></th>
					<th class="thead"><fmt:message key="throw.2pin.title"/></th>
					<th class="thead"><fmt:message key="throw.3pin.title"/></th>
					<th class="thead"><fmt:message key="throw.4pin.title"/></th>
					<th class="thead"><fmt:message key="throw.5pin.title"/></th>
					<th class="thead"><fmt:message key="throw.6pin.title"/></th>
					<th class="thead"><fmt:message key="throw.7pin.title"/></th>
					<th class="thead"><fmt:message key="throw.8pin.title"/></th>
					<th class="thead"><fmt:message key="throw.9pin.title"/></th>
					<th class="thead"><fmt:message key="throw.10pin.title"/></th>
					<th class="thead"><fmt:message key="throw.pinbinaryarray.title"/></th>
					<th class="thead"><fmt:message key="throw.ballnametxt.title"/></th>
					<th class="thead"><fmt:message key="throw.target.title"/></th>
					<th class="thead"><fmt:message key="throw.position.title"/></th>
					<th class="thead"><fmt:message key="throw.notetxt.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${throws}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectThrow?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editThrow?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteThrow?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.frameId}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.nbr}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.nbrOfPinsDown}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.1pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.2pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.3pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.4pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.5pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.6pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.7pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.8pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.9pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.10pin}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.pinBinaryArray}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ballNameTxt}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.target}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.position}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.noteTxt}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>