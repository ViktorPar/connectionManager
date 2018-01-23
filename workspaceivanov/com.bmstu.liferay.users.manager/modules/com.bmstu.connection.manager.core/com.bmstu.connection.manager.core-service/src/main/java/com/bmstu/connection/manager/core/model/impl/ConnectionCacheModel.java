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

package com.bmstu.connection.manager.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.connection.manager.core.model.Connection;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Connection in entity cache.
 *
 * @author Parhomenko
 * @see Connection
 * @generated
 */
@ProviderType
public class ConnectionCacheModel implements CacheModel<Connection>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ConnectionCacheModel)) {
			return false;
		}

		ConnectionCacheModel connectionCacheModel = (ConnectionCacheModel)obj;

		if (connectionId == connectionCacheModel.connectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, connectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", connectionId=");
		sb.append(connectionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", admin=");
		sb.append(admin);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", password=");
		sb.append(password);
		sb.append(", connectionAttributes=");
		sb.append(connectionAttributes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Connection toEntityModel() {
		ConnectionImpl connectionImpl = new ConnectionImpl();

		if (uuid == null) {
			connectionImpl.setUuid(StringPool.BLANK);
		}
		else {
			connectionImpl.setUuid(uuid);
		}

		connectionImpl.setConnectionId(connectionId);
		connectionImpl.setGroupId(groupId);
		connectionImpl.setCompanyId(companyId);
		connectionImpl.setUserId(userId);

		if (userName == null) {
			connectionImpl.setUserName(StringPool.BLANK);
		}
		else {
			connectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			connectionImpl.setCreateDate(null);
		}
		else {
			connectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			connectionImpl.setModifiedDate(null);
		}
		else {
			connectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		connectionImpl.setStatus(status);
		connectionImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			connectionImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			connectionImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			connectionImpl.setStatusDate(null);
		}
		else {
			connectionImpl.setStatusDate(new Date(statusDate));
		}

		connectionImpl.setAdmin(admin);

		if (name == null) {
			connectionImpl.setName(StringPool.BLANK);
		}
		else {
			connectionImpl.setName(name);
		}

		if (email == null) {
			connectionImpl.setEmail(StringPool.BLANK);
		}
		else {
			connectionImpl.setEmail(email);
		}

		if (password == null) {
			connectionImpl.setPassword(StringPool.BLANK);
		}
		else {
			connectionImpl.setPassword(password);
		}

		if (connectionAttributes == null) {
			connectionImpl.setConnectionAttributes(StringPool.BLANK);
		}
		else {
			connectionImpl.setConnectionAttributes(connectionAttributes);
		}

		connectionImpl.resetOriginalValues();

		return connectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		connectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();

		admin = objectInput.readBoolean();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		password = objectInput.readUTF();
		connectionAttributes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(connectionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		objectOutput.writeBoolean(admin);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		if (connectionAttributes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(connectionAttributes);
		}
	}

	public String uuid;
	public long connectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public boolean admin;
	public String name;
	public String email;
	public String password;
	public String connectionAttributes;
}