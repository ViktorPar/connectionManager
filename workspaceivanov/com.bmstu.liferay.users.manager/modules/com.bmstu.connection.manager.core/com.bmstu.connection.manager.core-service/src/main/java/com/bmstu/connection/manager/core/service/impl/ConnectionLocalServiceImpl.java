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

package com.bmstu.connection.manager.core.service.impl;

import java.util.Date;

import com.bmstu.connection.manager.core.model.Connection;
import com.bmstu.connection.manager.core.service.base.ConnectionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the connection local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bmstu.connection.manager.core.service.ConnectionLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Parhomenko
 * @see ConnectionLocalServiceBaseImpl
 * @see com.bmstu.connection.manager.core.service.ConnectionLocalServiceUtil
 */
public class ConnectionLocalServiceImpl extends ConnectionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bmstu.connection.manager.core.service.ConnectionLocalServiceUtil} to
	 * access the connection local service.
	 */

	@Override
	public Connection openConnection(long userId, boolean isAdmin, String email, String name, String password,
			String connectionAttributes, ServiceContext serviceContext) throws PortalException {
		String finalName = nullToEmpty(name);
		String finalConnectionAttributes = nullToEmpty(connectionAttributes);

		validate(email, password);

		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		Date currentDate = new Date();

		Connection connection = connectionPersistence.create(counterLocalService.increment());

		connection.setUuid(serviceContext.getUuid());
		connection.setUserId(userId);
		connection.setGroupId(groupId);
		connection.setCompanyId(user.getCompanyId());
		connection.setUserName(user.getFullName());
		connection.setCreateDate(serviceContext.getCreateDate(currentDate));
		connection.setModifiedDate(serviceContext.getModifiedDate(currentDate));
		connection.setAdmin(isAdmin);
		connection.setEmail(email);
		connection.setName(finalName);
		connection.setPassword(password);
		connection.setConnectionAttributes(finalConnectionAttributes);
		connection.setExpandoBridgeAttributes(serviceContext);

		connectionPersistence.update(connection);

		return connection;
	}

	@Override
	public Connection closeConnection(long connectionId, ServiceContext serviceContext) throws PortalException {
		Connection connection = getConnection(connectionId);
		connection = deleteConnection(connection);

		return connection;
	}

	private void validate(String email, String password) {
		if (Validator.isNull(email)) {
			throw new IllegalArgumentException("email can't be null");
		}
		if (Validator.isNull(password)) {
			throw new IllegalArgumentException("password can't be null");
		}
	}

	private String nullToEmpty(String string) {
		return string == null ? "" : string;
	}
}