/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bmstu.connection.manager.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Connection}.
 * </p>
 *
 * @author Parhomenko
 * @see Connection
 * @generated
 */
@ProviderType
public class ConnectionWrapper implements Connection, ModelWrapper<Connection> {
	public ConnectionWrapper(Connection connection) {
		_connection = connection;
	}

	@Override
	public Class<?> getModelClass() {
		return Connection.class;
	}

	@Override
	public String getModelClassName() {
		return Connection.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("connectionId", getConnectionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("admin", getAdmin());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("password", getPassword());
		attributes.put("connectionAttributes", getConnectionAttributes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long connectionId = (Long)attributes.get("connectionId");

		if (connectionId != null) {
			setConnectionId(connectionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		Boolean admin = (Boolean)attributes.get("admin");

		if (admin != null) {
			setAdmin(admin);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String connectionAttributes = (String)attributes.get(
				"connectionAttributes");

		if (connectionAttributes != null) {
			setConnectionAttributes(connectionAttributes);
		}
	}

	@Override
	public Connection toEscapedModel() {
		return new ConnectionWrapper(_connection.toEscapedModel());
	}

	@Override
	public Connection toUnescapedModel() {
		return new ConnectionWrapper(_connection.toUnescapedModel());
	}

	/**
	* Returns the admin of this connection.
	*
	* @return the admin of this connection
	*/
	@Override
	public boolean getAdmin() {
		return _connection.getAdmin();
	}

	/**
	* Returns <code>true</code> if this connection is admin.
	*
	* @return <code>true</code> if this connection is admin; <code>false</code> otherwise
	*/
	@Override
	public boolean isAdmin() {
		return _connection.isAdmin();
	}

	/**
	* Returns <code>true</code> if this connection is approved.
	*
	* @return <code>true</code> if this connection is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _connection.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _connection.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this connection is denied.
	*
	* @return <code>true</code> if this connection is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _connection.isDenied();
	}

	/**
	* Returns <code>true</code> if this connection is a draft.
	*
	* @return <code>true</code> if this connection is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _connection.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _connection.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this connection is expired.
	*
	* @return <code>true</code> if this connection is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _connection.isExpired();
	}

	/**
	* Returns <code>true</code> if this connection is inactive.
	*
	* @return <code>true</code> if this connection is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _connection.isInactive();
	}

	/**
	* Returns <code>true</code> if this connection is incomplete.
	*
	* @return <code>true</code> if this connection is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _connection.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _connection.isNew();
	}

	/**
	* Returns <code>true</code> if this connection is pending.
	*
	* @return <code>true</code> if this connection is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _connection.isPending();
	}

	/**
	* Returns <code>true</code> if this connection is scheduled.
	*
	* @return <code>true</code> if this connection is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _connection.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _connection.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Connection> toCacheModel() {
		return _connection.toCacheModel();
	}

	@Override
	public int compareTo(Connection connection) {
		return _connection.compareTo(connection);
	}

	/**
	* Returns the status of this connection.
	*
	* @return the status of this connection
	*/
	@Override
	public int getStatus() {
		return _connection.getStatus();
	}

	@Override
	public int hashCode() {
		return _connection.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _connection.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ConnectionWrapper((Connection)_connection.clone());
	}

	/**
	* Returns the connection attributes of this connection.
	*
	* @return the connection attributes of this connection
	*/
	@Override
	public java.lang.String getConnectionAttributes() {
		return _connection.getConnectionAttributes();
	}

	/**
	* Returns the email of this connection.
	*
	* @return the email of this connection
	*/
	@Override
	public java.lang.String getEmail() {
		return _connection.getEmail();
	}

	/**
	* Returns the name of this connection.
	*
	* @return the name of this connection
	*/
	@Override
	public java.lang.String getName() {
		return _connection.getName();
	}

	/**
	* Returns the password of this connection.
	*
	* @return the password of this connection
	*/
	@Override
	public java.lang.String getPassword() {
		return _connection.getPassword();
	}

	/**
	* Returns the status by user name of this connection.
	*
	* @return the status by user name of this connection
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _connection.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this connection.
	*
	* @return the status by user uuid of this connection
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _connection.getStatusByUserUuid();
	}

	/**
	* Returns the user name of this connection.
	*
	* @return the user name of this connection
	*/
	@Override
	public java.lang.String getUserName() {
		return _connection.getUserName();
	}

	/**
	* Returns the user uuid of this connection.
	*
	* @return the user uuid of this connection
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _connection.getUserUuid();
	}

	/**
	* Returns the uuid of this connection.
	*
	* @return the uuid of this connection
	*/
	@Override
	public java.lang.String getUuid() {
		return _connection.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _connection.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _connection.toXmlString();
	}

	/**
	* Returns the create date of this connection.
	*
	* @return the create date of this connection
	*/
	@Override
	public Date getCreateDate() {
		return _connection.getCreateDate();
	}

	/**
	* Returns the modified date of this connection.
	*
	* @return the modified date of this connection
	*/
	@Override
	public Date getModifiedDate() {
		return _connection.getModifiedDate();
	}

	/**
	* Returns the status date of this connection.
	*
	* @return the status date of this connection
	*/
	@Override
	public Date getStatusDate() {
		return _connection.getStatusDate();
	}

	/**
	* Returns the company ID of this connection.
	*
	* @return the company ID of this connection
	*/
	@Override
	public long getCompanyId() {
		return _connection.getCompanyId();
	}

	/**
	* Returns the connection ID of this connection.
	*
	* @return the connection ID of this connection
	*/
	@Override
	public long getConnectionId() {
		return _connection.getConnectionId();
	}

	/**
	* Returns the group ID of this connection.
	*
	* @return the group ID of this connection
	*/
	@Override
	public long getGroupId() {
		return _connection.getGroupId();
	}

	/**
	* Returns the primary key of this connection.
	*
	* @return the primary key of this connection
	*/
	@Override
	public long getPrimaryKey() {
		return _connection.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this connection.
	*
	* @return the status by user ID of this connection
	*/
	@Override
	public long getStatusByUserId() {
		return _connection.getStatusByUserId();
	}

	/**
	* Returns the user ID of this connection.
	*
	* @return the user ID of this connection
	*/
	@Override
	public long getUserId() {
		return _connection.getUserId();
	}

	@Override
	public void persist() {
		_connection.persist();
	}

	/**
	* Sets whether this connection is admin.
	*
	* @param admin the admin of this connection
	*/
	@Override
	public void setAdmin(boolean admin) {
		_connection.setAdmin(admin);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_connection.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this connection.
	*
	* @param companyId the company ID of this connection
	*/
	@Override
	public void setCompanyId(long companyId) {
		_connection.setCompanyId(companyId);
	}

	/**
	* Sets the connection attributes of this connection.
	*
	* @param connectionAttributes the connection attributes of this connection
	*/
	@Override
	public void setConnectionAttributes(java.lang.String connectionAttributes) {
		_connection.setConnectionAttributes(connectionAttributes);
	}

	/**
	* Sets the connection ID of this connection.
	*
	* @param connectionId the connection ID of this connection
	*/
	@Override
	public void setConnectionId(long connectionId) {
		_connection.setConnectionId(connectionId);
	}

	/**
	* Sets the create date of this connection.
	*
	* @param createDate the create date of this connection
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_connection.setCreateDate(createDate);
	}

	/**
	* Sets the email of this connection.
	*
	* @param email the email of this connection
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_connection.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_connection.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_connection.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_connection.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this connection.
	*
	* @param groupId the group ID of this connection
	*/
	@Override
	public void setGroupId(long groupId) {
		_connection.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this connection.
	*
	* @param modifiedDate the modified date of this connection
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_connection.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this connection.
	*
	* @param name the name of this connection
	*/
	@Override
	public void setName(java.lang.String name) {
		_connection.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_connection.setNew(n);
	}

	/**
	* Sets the password of this connection.
	*
	* @param password the password of this connection
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_connection.setPassword(password);
	}

	/**
	* Sets the primary key of this connection.
	*
	* @param primaryKey the primary key of this connection
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_connection.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_connection.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this connection.
	*
	* @param status the status of this connection
	*/
	@Override
	public void setStatus(int status) {
		_connection.setStatus(status);
	}

	/**
	* Sets the status by user ID of this connection.
	*
	* @param statusByUserId the status by user ID of this connection
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_connection.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this connection.
	*
	* @param statusByUserName the status by user name of this connection
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_connection.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this connection.
	*
	* @param statusByUserUuid the status by user uuid of this connection
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_connection.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this connection.
	*
	* @param statusDate the status date of this connection
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_connection.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this connection.
	*
	* @param userId the user ID of this connection
	*/
	@Override
	public void setUserId(long userId) {
		_connection.setUserId(userId);
	}

	/**
	* Sets the user name of this connection.
	*
	* @param userName the user name of this connection
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_connection.setUserName(userName);
	}

	/**
	* Sets the user uuid of this connection.
	*
	* @param userUuid the user uuid of this connection
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_connection.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this connection.
	*
	* @param uuid the uuid of this connection
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_connection.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectionWrapper)) {
			return false;
		}

		ConnectionWrapper connectionWrapper = (ConnectionWrapper)obj;

		if (Objects.equals(_connection, connectionWrapper._connection)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _connection.getStagedModelType();
	}

	@Override
	public Connection getWrappedModel() {
		return _connection;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _connection.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _connection.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_connection.resetOriginalValues();
	}

	private final Connection _connection;
}