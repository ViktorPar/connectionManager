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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Connection service. Represents a row in the &quot;CM_Connection&quot; database table, with each column mapped to a property of this class.
 *
 * @author Parhomenko
 * @see ConnectionModel
 * @see com.bmstu.connection.manager.core.model.impl.ConnectionImpl
 * @see com.bmstu.connection.manager.core.model.impl.ConnectionModelImpl
 * @generated
 */
@ImplementationClassName("com.bmstu.connection.manager.core.model.impl.ConnectionImpl")
@ProviderType
public interface Connection extends ConnectionModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.bmstu.connection.manager.core.model.impl.ConnectionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Connection, Long> CONNECTION_ID_ACCESSOR = new Accessor<Connection, Long>() {
			@Override
			public Long get(Connection connection) {
				return connection.getConnectionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Connection> getTypeClass() {
				return Connection.class;
			}
		};
}