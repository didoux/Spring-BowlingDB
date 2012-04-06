<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.throw-resources"/>
<html>
<head>
<title>View <fmt:message key="throw.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="throw.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexThrow"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.id.title"/>:
						</td>
						<td>
							${throw.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.frameid.title"/>:
						</td>
						<td>
							${throw.frameId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.nbr.title"/>:
						</td>
						<td>
							${throw.nbr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.nbrofpinsdown.title"/>:
						</td>
						<td>
							${throw.nbrOfPinsDown}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.1pin.title"/>:
						</td>
						<td>
							${throw.1pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.2pin.title"/>:
						</td>
						<td>
							${throw.2pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.3pin.title"/>:
						</td>
						<td>
							${throw.3pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.4pin.title"/>:
						</td>
						<td>
							${throw.4pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.5pin.title"/>:
						</td>
						<td>
							${throw.5pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.6pin.title"/>:
						</td>
						<td>
							${throw.6pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.7pin.title"/>:
						</td>
						<td>
							${throw.7pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.8pin.title"/>:
						</td>
						<td>
							${throw.8pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.9pin.title"/>:
						</td>
						<td>
							${throw.9pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.10pin.title"/>:
						</td>
						<td>
							${throw.10pin}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.pinbinaryarray.title"/>:
						</td>
						<td>
							${throw.pinBinaryArray}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.ballnametxt.title"/>:
						</td>
						<td>
							${throw.ballNameTxt}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.target.title"/>:
						</td>
						<td>
							${throw.target}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.position.title"/>:
						</td>
						<td>
							${throw.position}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.notetxt.title"/>:
						</td>
						<td>
							${throw.noteTxt}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>