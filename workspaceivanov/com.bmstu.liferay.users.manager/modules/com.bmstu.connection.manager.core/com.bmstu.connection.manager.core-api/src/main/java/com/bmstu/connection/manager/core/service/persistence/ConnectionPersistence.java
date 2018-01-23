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

package com.bmstu.connection.manager.core.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.connection.manager.core.exception.NoSuchConnectionException;
import com.bmstu.connection.manager.core.model.Connection;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the connection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Parhomenko
 * @see com.bmstu.connection.manager.core.service.persistence.impl.ConnectionPersistenceImpl
 * @see ConnectionUtil
 * @generated
 */
@ProviderType
public interface ConnectionPersistence extends BasePersistence<Connection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConnectionUtil} to access the connection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the connections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching connections
	*/
	public java.util.List<Connection> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the connections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @return the range of matching connections
	*/
	public java.util.List<Connection> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the connections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching connections
	*/
	public java.util.List<Connection> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns an ordered range of all the connections where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching connections
	*/
	public java.util.List<Connection> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public Connection findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Returns the first connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns the last connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public Connection findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Returns the last connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns the connections before and after the current connection in the ordered set where uuid = &#63;.
	*
	* @param connectionId the primary key of the current connection
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next connection
	* @throws NoSuchConnectionException if a connection with the primary key could not be found
	*/
	public Connection[] findByUuid_PrevAndNext(long connectionId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Removes all the connections where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of connections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching connections
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the connection where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchConnectionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public Connection findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchConnectionException;

	/**
	* Returns the connection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the connection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the connection where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the connection that was removed
	*/
	public Connection removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchConnectionException;

	/**
	* Returns the number of connections where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching connections
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the connections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching connections
	*/
	public java.util.List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the connections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @return the range of matching connections
	*/
	public java.util.List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the connections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching connections
	*/
	public java.util.List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns an ordered range of all the connections where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching connections
	*/
	public java.util.List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public Connection findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Returns the first connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns the last connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public Connection findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Returns the last connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns the connections before and after the current connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param connectionId the primary key of the current connection
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next connection
	* @throws NoSuchConnectionException if a connection with the primary key could not be found
	*/
	public Connection[] findByUuid_C_PrevAndNext(long connectionId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Removes all the connections where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of connections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching connections
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the connections where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @return the matching connections
	*/
	public java.util.List<Connection> findByConnectionId(long connectionId);

	/**
	* Returns a range of all the connections where connectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param connectionId the connection ID
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @return the range of matching connections
	*/
	public java.util.List<Connection> findByConnectionId(long connectionId,
		int start, int end);

	/**
	* Returns an ordered range of all the connections where connectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param connectionId the connection ID
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching connections
	*/
	public java.util.List<Connection> findByConnectionId(long connectionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns an ordered range of all the connections where connectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param connectionId the connection ID
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching connections
	*/
	public java.util.List<Connection> findByConnectionId(long connectionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public Connection findByConnectionId_First(long connectionId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Returns the first connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByConnectionId_First(long connectionId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns the last connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public Connection findByConnectionId_Last(long connectionId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator)
		throws NoSuchConnectionException;

	/**
	* Returns the last connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public Connection fetchByConnectionId_Last(long connectionId,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Removes all the connections where connectionId = &#63; from the database.
	*
	* @param connectionId the connection ID
	*/
	public void removeByConnectionId(long connectionId);

	/**
	* Returns the number of connections where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @return the number of matching connections
	*/
	public int countByConnectionId(long connectionId);

	/**
	* Caches the connection in the entity cache if it is enabled.
	*
	* @param connection the connection
	*/
	public void cacheResult(Connection connection);

	/**
	* Caches the connections in the entity cache if it is enabled.
	*
	* @param connections the connections
	*/
	public void cacheResult(java.util.List<Connection> connections);

	/**
	* Creates a new connection with the primary key. Does not add the connection to the database.
	*
	* @param connectionId the primary key for the new connection
	* @return the new connection
	*/
	public Connection create(long connectionId);

	/**
	* Removes the connection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionId the primary key of the connection
	* @return the connection that was removed
	* @throws NoSuchConnectionException if a connection with the primary key could not be found
	*/
	public Connection remove(long connectionId)
		throws NoSuchConnectionException;

	public Connection updateImpl(Connection connection);

	/**
	* Returns the connection with the primary key or throws a {@link NoSuchConnectionException} if it could not be found.
	*
	* @param connectionId the primary key of the connection
	* @return the connection
	* @throws NoSuchConnectionException if a connection with the primary key could not be found
	*/
	public Connection findByPrimaryKey(long connectionId)
		throws NoSuchConnectionException;

	/**
	* Returns the connection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param connectionId the primary key of the connection
	* @return the connection, or <code>null</code> if a connection with the primary key could not be found
	*/
	public Connection fetchByPrimaryKey(long connectionId);

	@Override
	public java.util.Map<java.io.Serializable, Connection> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the connections.
	*
	* @return the connections
	*/
	public java.util.List<Connection> findAll();

	/**
	* Returns a range of all the connections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @return the range of connections
	*/
	public java.util.List<Connection> findAll(int start, int end);

	/**
	* Returns an ordered range of all the connections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connections
	*/
	public java.util.List<Connection> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator);

	/**
	* Returns an ordered range of all the connections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ConnectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connections
	* @param end the upper bound of the range of connections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of connections
	*/
	public java.util.List<Connection> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the connections from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of connections.
	*
	* @return the number of connections
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}