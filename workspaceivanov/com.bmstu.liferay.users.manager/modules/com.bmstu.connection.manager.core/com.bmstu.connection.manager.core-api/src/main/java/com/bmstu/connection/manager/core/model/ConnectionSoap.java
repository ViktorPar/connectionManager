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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bmstu.connection.manager.core.service.http.ConnectionServiceSoap}.
 *
 * @author Parhomenko
 * @see com.bmstu.connection.manager.core.service.http.ConnectionServiceSoap
 * @generated
 */
@ProviderType
public class ConnectionSoap implements Serializable {
	public static ConnectionSoap toSoapModel(Connection model) {
		ConnectionSoap soapModel = new ConnectionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setConnectionId(model.getConnectionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setAdmin(model.getAdmin());
		soapModel.setName(model.getName());
		soapModel.setEmail(model.getEmail());
		soapModel.setPassword(model.getPassword());
		soapModel.setConnectionAttributes(model.getConnectionAttributes());

		return soapModel;
	}

	public static ConnectionSoap[] toSoapModels(Connection[] models) {
		ConnectionSoap[] soapModels = new ConnectionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConnectionSoap[][] toSoapModels(Connection[][] models) {
		ConnectionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConnectionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConnectionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConnectionSoap[] toSoapModels(List<Connection> models) {
		List<ConnectionSoap> soapModels = new ArrayList<ConnectionSoap>(models.size());

		for (Connection model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConnectionSoap[soapModels.size()]);
	}

	public ConnectionSoap() {
	}

	public long getPrimaryKey() {
		return _connectionId;
	}

	public void setPrimaryKey(long pk) {
		setConnectionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getConnectionId() {
		return _connectionId;
	}

	public void setConnectionId(long connectionId) {
		_connectionId = connectionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public boolean getAdmin() {
		return _admin;
	}

	public boolean isAdmin() {
		return _admin;
	}

	public void setAdmin(boolean admin) {
		_admin = admin;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getConnectionAttributes() {
		return _connectionAttributes;
	}

	public void setConnectionAttributes(String connectionAttributes) {
		_connectionAttributes = connectionAttributes;
	}

	private String _uuid;
	private long _connectionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private boolean _admin;
	private String _name;
	private String _email;
	private String _password;
	private String _connectionAttributes;
}