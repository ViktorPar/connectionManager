<%@ include file="/init.jsp"%>

<%
	Connection connection = null;
%>

<portlet:actionURL var="createConnectionURL" name="createConnection">
	<portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:actionURL>  
<portlet:actionURL var="openConnectionURL" name="openConnection">
	<portlet:param name="mvcPath" value="/connected.jsp"/>
</portlet:actionURL> 

<aui:form action="<%=createConnectionURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=connection%>" model="<%=Connection.class%>" />

	<aui:fieldset>
		<aui:input name="email" />
		<aui:input name="password" />
		<aui:input name="name" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="Register" />
	</aui:button-row>
</aui:form>

<aui:form action="<%=openConnectionURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=connection%>" model="<%=Connection.class%>" />

	<aui:fieldset>
		<aui:input name="email" />
		<aui:input name="password" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="Connect" />
	</aui:button-row>
</aui:form>

<liferay-ui:error key="error" message="User does not exist" />