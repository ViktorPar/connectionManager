<%@ include file="/init.jsp"%>

<% 
long connectionId = (Long)renderRequest.getPortletSession().getAttribute("connectionId");
Connection connection = ConnectionLocalServiceUtil.getConnection(connectionId);
%>

<portlet:actionURL var="closeConnectionURL" name="closeConnection">
	<portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:actionURL>  

<p>
	<b><liferay-ui:message key="connection-opened" /></b>
</p>

<aui:form action="<%=closeConnectionURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%= connection %>" model="<%=Connection.class%>" />

	<aui:fieldset>
		<aui:input name="connectionId" type="hidden" value='<%= connectionId %>'/>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="Disconnect" />
	</aui:button-row>
</aui:form>