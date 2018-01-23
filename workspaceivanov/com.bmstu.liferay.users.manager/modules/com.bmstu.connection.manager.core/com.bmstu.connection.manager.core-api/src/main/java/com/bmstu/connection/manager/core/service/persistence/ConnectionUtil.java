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

import com.bmstu.connection.manager.core.model.Connection;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the connection service. This utility wraps {@link com.bmstu.connection.manager.core.service.persistence.impl.ConnectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Parhomenko
 * @see ConnectionPersistence
 * @see com.bmstu.connection.manager.core.service.persistence.impl.ConnectionPersistenceImpl
 * @generated
 */
@ProviderType
public class ConnectionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Connection connection) {
		getPersistence().clearCache(connection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Connection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Connection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Connection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Connection> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Connection update(Connection connection) {
		return getPersistence().update(connection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Connection update(Connection connection,
		ServiceContext serviceContext) {
		return getPersistence().update(connection, serviceContext);
	}

	/**
	* Returns all the connections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching connections
	*/
	public static List<Connection> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Connection> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Connection> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Connection> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Connection> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public static Connection findByUuid_First(java.lang.String uuid,
		OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Connection> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public static Connection findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last connection in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Connection> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the connections before and after the current connection in the ordered set where uuid = &#63;.
	*
	* @param connectionId the primary key of the current connection
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next connection
	* @throws NoSuchConnectionException if a connection with the primary key could not be found
	*/
	public static Connection[] findByUuid_PrevAndNext(long connectionId,
		java.lang.String uuid, OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(connectionId, uuid, orderByComparator);
	}

	/**
	* Removes all the connections where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of connections where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching connections
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the connection where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchConnectionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public static Connection findByUUID_G(java.lang.String uuid, long groupId)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the connection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the connection where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the connection where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the connection that was removed
	*/
	public static Connection removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of connections where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching connections
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the connections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching connections
	*/
	public static List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Connection> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Connection> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public static Connection findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Connection> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public static Connection findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last connection in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Connection> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Connection[] findByUuid_C_PrevAndNext(long connectionId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(connectionId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the connections where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of connections where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching connections
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the connections where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @return the matching connections
	*/
	public static List<Connection> findByConnectionId(long connectionId) {
		return getPersistence().findByConnectionId(connectionId);
	}

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
	public static List<Connection> findByConnectionId(long connectionId,
		int start, int end) {
		return getPersistence().findByConnectionId(connectionId, start, end);
	}

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
	public static List<Connection> findByConnectionId(long connectionId,
		int start, int end, OrderByComparator<Connection> orderByComparator) {
		return getPersistence()
				   .findByConnectionId(connectionId, start, end,
			orderByComparator);
	}

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
	public static List<Connection> findByConnectionId(long connectionId,
		int start, int end, OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByConnectionId(connectionId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public static Connection findByConnectionId_First(long connectionId,
		OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence()
				   .findByConnectionId_First(connectionId, orderByComparator);
	}

	/**
	* Returns the first connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByConnectionId_First(long connectionId,
		OrderByComparator<Connection> orderByComparator) {
		return getPersistence()
				   .fetchByConnectionId_First(connectionId, orderByComparator);
	}

	/**
	* Returns the last connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection
	* @throws NoSuchConnectionException if a matching connection could not be found
	*/
	public static Connection findByConnectionId_Last(long connectionId,
		OrderByComparator<Connection> orderByComparator)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence()
				   .findByConnectionId_Last(connectionId, orderByComparator);
	}

	/**
	* Returns the last connection in the ordered set where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching connection, or <code>null</code> if a matching connection could not be found
	*/
	public static Connection fetchByConnectionId_Last(long connectionId,
		OrderByComparator<Connection> orderByComparator) {
		return getPersistence()
				   .fetchByConnectionId_Last(connectionId, orderByComparator);
	}

	/**
	* Removes all the connections where connectionId = &#63; from the database.
	*
	* @param connectionId the connection ID
	*/
	public static void removeByConnectionId(long connectionId) {
		getPersistence().removeByConnectionId(connectionId);
	}

	/**
	* Returns the number of connections where connectionId = &#63;.
	*
	* @param connectionId the connection ID
	* @return the number of matching connections
	*/
	public static int countByConnectionId(long connectionId) {
		return getPersistence().countByConnectionId(connectionId);
	}

	/**
	* Caches the connection in the entity cache if it is enabled.
	*
	* @param connection the connection
	*/
	public static void cacheResult(Connection connection) {
		getPersistence().cacheResult(connection);
	}

	/**
	* Caches the connections in the entity cache if it is enabled.
	*
	* @param connections the connections
	*/
	public static void cacheResult(List<Connection> connections) {
		getPersistence().cacheResult(connections);
	}

	/**
	* Creates a new connection with the primary key. Does not add the connection to the database.
	*
	* @param connectionId the primary key for the new connection
	* @return the new connection
	*/
	public static Connection create(long connectionId) {
		return getPersistence().create(connectionId);
	}

	/**
	* Removes the connection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionId the primary key of the connection
	* @return the connection that was removed
	* @throws NoSuchConnectionException if a connection with the primary key could not be found
	*/
	public static Connection remove(long connectionId)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence().remove(connectionId);
	}

	public static Connection updateImpl(Connection connection) {
		return getPersistence().updateImpl(connection);
	}

	/**
	* Returns the connection with the primary key or throws a {@link NoSuchConnectionException} if it could not be found.
	*
	* @param connectionId the primary key of the connection
	* @return the connection
	* @throws NoSuchConnectionException if a connection with the primary key could not be found
	*/
	public static Connection findByPrimaryKey(long connectionId)
		throws com.bmstu.connection.manager.core.exception.NoSuchConnectionException {
		return getPersistence().findByPrimaryKey(connectionId);
	}

	/**
	* Returns the connection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param connectionId the primary key of the connection
	* @return the connection, or <code>null</code> if a connection with the primary key could not be found
	*/
	public static Connection fetchByPrimaryKey(long connectionId) {
		return getPersistence().fetchByPrimaryKey(connectionId);
	}

	public static java.util.Map<java.io.Serializable, Connection> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the connections.
	*
	* @return the connections
	*/
	public static List<Connection> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Connection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Connection> findAll(int start, int end,
		OrderByComparator<Connection> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Connection> findAll(int start, int end,
		OrderByComparator<Connection> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the connections from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of connections.
	*
	* @return the number of connections
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ConnectionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ConnectionPersistence, ConnectionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ConnectionPersistence.class);
}