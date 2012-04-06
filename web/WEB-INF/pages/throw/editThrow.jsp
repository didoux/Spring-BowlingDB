<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.throw-resources"/>
<html>
<head>
<title>Edit <fmt:message key="throw.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="throw.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexThrow"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveThrow" method="POST" modelAttribute="throw">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="throw_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${throw.id}
						&nbsp;
									<form:hidden id="throw_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.frameid.title"/>:
						</td>
						<td>
							<form:input id="throw_frameId" path="frameId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_frameId",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.frameid.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.nbr.title"/>:
						</td>
						<td>
							<form:input id="throw_nbr" path="nbr" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_nbr",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.nbr.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.nbrofpinsdown.title"/>:
						</td>
						<td>
							<form:input id="throw_nbrOfPinsDown" path="nbrOfPinsDown" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_nbrOfPinsDown",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.nbrofpinsdown.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.1pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_1pin" path="1pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_1pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.2pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_2pin" path="2pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_2pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.3pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_3pin" path="3pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_3pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.4pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_4pin" path="4pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_4pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.5pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_5pin" path="5pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_5pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.6pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_6pin" path="6pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_6pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.7pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_7pin" path="7pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_7pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.8pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_8pin" path="8pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_8pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.9pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_9pin" path="9pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_9pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.10pin.title"/>:
						</td>
						<td>
							<form:checkbox id="throw_10pin" path="10pin" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_10pin",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.pinbinaryarray.title"/>:
						</td>
						<td>
							<form:input id="throw_pinBinaryArray" path="pinBinaryArray" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_pinBinaryArray",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.pinbinaryarray.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.ballnametxt.title"/>:
						</td>
						<td>
							<form:input id="throw_ballNameTxt" path="ballNameTxt" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_ballNameTxt",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.ballnametxt.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.target.title"/>:
						</td>
						<td>
							<form:input id="throw_target" path="target" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_target",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.target.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.position.title"/>:
						</td>
						<td>
							<form:input id="throw_position" path="position" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_position",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.position.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="throw.notetxt.title"/>:
						</td>
						<td>
							<form:input id="throw_noteTxt" path="noteTxt" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "throw_noteTxt",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="throw.notetxt.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>