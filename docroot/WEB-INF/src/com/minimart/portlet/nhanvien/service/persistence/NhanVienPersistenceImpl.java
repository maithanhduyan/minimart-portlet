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

package com.minimart.portlet.nhanvien.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.nhanvien.NoSuchNhanVienException;
import com.minimart.portlet.nhanvien.model.NhanVien;
import com.minimart.portlet.nhanvien.model.impl.NhanVienImpl;
import com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the nhan vien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhanVienPersistence
 * @see NhanVienUtil
 * @generated
 */
public class NhanVienPersistenceImpl extends BasePersistenceImpl<NhanVien>
	implements NhanVienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NhanVienUtil} to access the nhan vien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NhanVienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			NhanVienModelImpl.UUID_COLUMN_BITMASK |
			NhanVienModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the nhan viens where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<NhanVien> list = (List<NhanVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhanVien nhanVien : list) {
				if (!Validator.equals(uuid, nhanVien.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhanVien>(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByUuid_First(uuid, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhanVien> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByUuid_Last(uuid, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63;.
	 *
	 * @param nhanVienId the primary key of the current nhan vien
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien[] findByUuid_PrevAndNext(long nhanVienId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = findByPrimaryKey(nhanVienId);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByUuid_PrevAndNext(session, nhanVien, uuid,
					orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByUuid_PrevAndNext(session, nhanVien, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByUuid_PrevAndNext(Session session,
		NhanVien nhanVien, String uuid, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (NhanVien nhanVien : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "nhanVien.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "nhanVien.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(nhanVien.uuid IS NULL OR nhanVien.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			NhanVienModelImpl.UUID_COLUMN_BITMASK |
			NhanVienModelImpl.COMPANYID_COLUMN_BITMASK |
			NhanVienModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<NhanVien> list = (List<NhanVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhanVien nhanVien : list) {
				if (!Validator.equals(uuid, nhanVien.getUuid()) ||
						(companyId != nhanVien.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhanVien>(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhanVien> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param nhanVienId the primary key of the current nhan vien
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien[] findByUuid_C_PrevAndNext(long nhanVienId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = findByPrimaryKey(nhanVienId);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, nhanVien, uuid,
					companyId, orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByUuid_C_PrevAndNext(session, nhanVien, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByUuid_C_PrevAndNext(Session session,
		NhanVien nhanVien, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (NhanVien nhanVien : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "nhanVien.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "nhanVien.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(nhanVien.uuid IS NULL OR nhanVien.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "nhanVien.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HO = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_HO",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_HO",
			new String[] { String.class.getName(), String.class.getName() },
			NhanVienModelImpl.TEN_COLUMN_BITMASK |
			NhanVienModelImpl.HO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HO = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HO",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the nhan viens where ten = &#63; and ho = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @return the matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByTEN_HO(String ten, String ho)
		throws SystemException {
		return findByTEN_HO(ten, ho, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where ten = &#63; and ho = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByTEN_HO(String ten, String ho, int start, int end)
		throws SystemException {
		return findByTEN_HO(ten, ho, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where ten = &#63; and ho = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByTEN_HO(String ten, String ho, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO;
			finderArgs = new Object[] { ten, ho };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HO;
			finderArgs = new Object[] { ten, ho, start, end, orderByComparator };
		}

		List<NhanVien> list = (List<NhanVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhanVien nhanVien : list) {
				if (!Validator.equals(ten, nhanVien.getTen()) ||
						!Validator.equals(ho, nhanVien.getHo())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HO_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HO_TEN_2);
			}

			boolean bindHo = false;

			if (ho == null) {
				query.append(_FINDER_COLUMN_TEN_HO_HO_1);
			}
			else if (ho.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_HO_3);
			}
			else {
				bindHo = true;

				query.append(_FINDER_COLUMN_TEN_HO_HO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				if (bindHo) {
					qPos.add(ho);
				}

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhanVien>(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByTEN_HO_First(String ten, String ho,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByTEN_HO_First(ten, ho, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ho=");
		msg.append(ho);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByTEN_HO_First(String ten, String ho,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhanVien> list = findByTEN_HO(ten, ho, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByTEN_HO_Last(String ten, String ho,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByTEN_HO_Last(ten, ho, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ho=");
		msg.append(ho);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByTEN_HO_Last(String ten, String ho,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_HO(ten, ho);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByTEN_HO(ten, ho, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	 *
	 * @param nhanVienId the primary key of the current nhan vien
	 * @param ten the ten
	 * @param ho the ho
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien[] findByTEN_HO_PrevAndNext(long nhanVienId, String ten,
		String ho, OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = findByPrimaryKey(nhanVienId);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByTEN_HO_PrevAndNext(session, nhanVien, ten, ho,
					orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByTEN_HO_PrevAndNext(session, nhanVien, ten, ho,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByTEN_HO_PrevAndNext(Session session,
		NhanVien nhanVien, String ten, String ho,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_HO_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_HO_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_HO_TEN_2);
		}

		boolean bindHo = false;

		if (ho == null) {
			query.append(_FINDER_COLUMN_TEN_HO_HO_1);
		}
		else if (ho.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_HO_HO_3);
		}
		else {
			bindHo = true;

			query.append(_FINDER_COLUMN_TEN_HO_HO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		if (bindHo) {
			qPos.add(ho);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where ten = &#63; and ho = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HO(String ten, String ho) throws SystemException {
		for (NhanVien nhanVien : findByTEN_HO(ten, ho, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where ten = &#63; and ho = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @return the number of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_HO(String ten, String ho) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_HO;

		Object[] finderArgs = new Object[] { ten, ho };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HO_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HO_TEN_2);
			}

			boolean bindHo = false;

			if (ho == null) {
				query.append(_FINDER_COLUMN_TEN_HO_HO_1);
			}
			else if (ho.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_HO_3);
			}
			else {
				bindHo = true;

				query.append(_FINDER_COLUMN_TEN_HO_HO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				if (bindHo) {
					qPos.add(ho);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TEN_HO_TEN_1 = "nhanVien.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TEN_2 = "nhanVien.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TEN_3 = "(nhanVien.ten IS NULL OR nhanVien.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HO_HO_1 = "nhanVien.ho IS NULL";
	private static final String _FINDER_COLUMN_TEN_HO_HO_2 = "nhanVien.ho = ?";
	private static final String _FINDER_COLUMN_TEN_HO_HO_3 = "(nhanVien.ho IS NULL OR nhanVien.ho = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HO_TH =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_HO_TH",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO_TH =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_HO_TH",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			NhanVienModelImpl.TEN_COLUMN_BITMASK |
			NhanVienModelImpl.HO_COLUMN_BITMASK |
			NhanVienModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HO_TH = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HO_TH",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @return the matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByTEN_HO_TH(String ten, String ho,
		boolean trangThai) throws SystemException {
		return findByTEN_HO_TH(ten, ho, trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByTEN_HO_TH(String ten, String ho,
		boolean trangThai, int start, int end) throws SystemException {
		return findByTEN_HO_TH(ten, ho, trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByTEN_HO_TH(String ten, String ho,
		boolean trangThai, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO_TH;
			finderArgs = new Object[] { ten, ho, trangThai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HO_TH;
			finderArgs = new Object[] {
					ten, ho, trangThai,
					
					start, end, orderByComparator
				};
		}

		List<NhanVien> list = (List<NhanVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhanVien nhanVien : list) {
				if (!Validator.equals(ten, nhanVien.getTen()) ||
						!Validator.equals(ho, nhanVien.getHo()) ||
						(trangThai != nhanVien.getTrangThai())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_2);
			}

			boolean bindHo = false;

			if (ho == null) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_HO_1);
			}
			else if (ho.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_HO_3);
			}
			else {
				bindHo = true;

				query.append(_FINDER_COLUMN_TEN_HO_TH_HO_2);
			}

			query.append(_FINDER_COLUMN_TEN_HO_TH_TRANGTHAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				if (bindHo) {
					qPos.add(ho);
				}

				qPos.add(trangThai);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhanVien>(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByTEN_HO_TH_First(String ten, String ho,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByTEN_HO_TH_First(ten, ho, trangThai,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ho=");
		msg.append(ho);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByTEN_HO_TH_First(String ten, String ho,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		List<NhanVien> list = findByTEN_HO_TH(ten, ho, trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByTEN_HO_TH_Last(String ten, String ho,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByTEN_HO_TH_Last(ten, ho, trangThai,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ho=");
		msg.append(ho);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByTEN_HO_TH_Last(String ten, String ho,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTEN_HO_TH(ten, ho, trangThai);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByTEN_HO_TH(ten, ho, trangThai, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * @param nhanVienId the primary key of the current nhan vien
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien[] findByTEN_HO_TH_PrevAndNext(long nhanVienId, String ten,
		String ho, boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = findByPrimaryKey(nhanVienId);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByTEN_HO_TH_PrevAndNext(session, nhanVien, ten, ho,
					trangThai, orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByTEN_HO_TH_PrevAndNext(session, nhanVien, ten, ho,
					trangThai, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByTEN_HO_TH_PrevAndNext(Session session,
		NhanVien nhanVien, String ten, String ho, boolean trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_2);
		}

		boolean bindHo = false;

		if (ho == null) {
			query.append(_FINDER_COLUMN_TEN_HO_TH_HO_1);
		}
		else if (ho.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_HO_TH_HO_3);
		}
		else {
			bindHo = true;

			query.append(_FINDER_COLUMN_TEN_HO_TH_HO_2);
		}

		query.append(_FINDER_COLUMN_TEN_HO_TH_TRANGTHAI_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		if (bindHo) {
			qPos.add(ho);
		}

		qPos.add(trangThai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HO_TH(String ten, String ho, boolean trangThai)
		throws SystemException {
		for (NhanVien nhanVien : findByTEN_HO_TH(ten, ho, trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ho the ho
	 * @param trangThai the trang thai
	 * @return the number of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_HO_TH(String ten, String ho, boolean trangThai)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_HO_TH;

		Object[] finderArgs = new Object[] { ten, ho, trangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HO_TH_TEN_2);
			}

			boolean bindHo = false;

			if (ho == null) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_HO_1);
			}
			else if (ho.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HO_TH_HO_3);
			}
			else {
				bindHo = true;

				query.append(_FINDER_COLUMN_TEN_HO_TH_HO_2);
			}

			query.append(_FINDER_COLUMN_TEN_HO_TH_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				if (bindHo) {
					qPos.add(ho);
				}

				qPos.add(trangThai);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TEN_HO_TH_TEN_1 = "nhanVien.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TH_TEN_2 = "nhanVien.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TH_TEN_3 = "(nhanVien.ten IS NULL OR nhanVien.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TH_HO_1 = "nhanVien.ho IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TH_HO_2 = "nhanVien.ho = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TH_HO_3 = "(nhanVien.ho IS NULL OR nhanVien.ho = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HO_TH_TRANGTHAI_2 = "nhanVien.trangThai = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGHIT7 = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNGHIT7",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7 =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNGHIT7",
			new String[] { Boolean.class.getName() },
			NhanVienModelImpl.NGHITHU7_COLUMN_BITMASK |
			NhanVienModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGHIT7 = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNGHIT7",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the nhan viens where nghiThu7 = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @return the matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByNGHIT7(boolean nghiThu7)
		throws SystemException {
		return findByNGHIT7(nghiThu7, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where nghiThu7 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByNGHIT7(boolean nghiThu7, int start, int end)
		throws SystemException {
		return findByNGHIT7(nghiThu7, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where nghiThu7 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByNGHIT7(boolean nghiThu7, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7;
			finderArgs = new Object[] { nghiThu7 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGHIT7;
			finderArgs = new Object[] { nghiThu7, start, end, orderByComparator };
		}

		List<NhanVien> list = (List<NhanVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhanVien nhanVien : list) {
				if ((nghiThu7 != nhanVien.getNghiThu7())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			query.append(_FINDER_COLUMN_NGHIT7_NGHITHU7_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nghiThu7);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhanVien>(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where nghiThu7 = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByNGHIT7_First(boolean nghiThu7,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByNGHIT7_First(nghiThu7, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nghiThu7=");
		msg.append(nghiThu7);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where nghiThu7 = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByNGHIT7_First(boolean nghiThu7,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhanVien> list = findByNGHIT7(nghiThu7, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where nghiThu7 = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByNGHIT7_Last(boolean nghiThu7,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByNGHIT7_Last(nghiThu7, orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nghiThu7=");
		msg.append(nghiThu7);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where nghiThu7 = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByNGHIT7_Last(boolean nghiThu7,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNGHIT7(nghiThu7);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByNGHIT7(nghiThu7, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where nghiThu7 = &#63;.
	 *
	 * @param nhanVienId the primary key of the current nhan vien
	 * @param nghiThu7 the nghi thu7
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien[] findByNGHIT7_PrevAndNext(long nhanVienId,
		boolean nghiThu7, OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = findByPrimaryKey(nhanVienId);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByNGHIT7_PrevAndNext(session, nhanVien, nghiThu7,
					orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByNGHIT7_PrevAndNext(session, nhanVien, nghiThu7,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByNGHIT7_PrevAndNext(Session session,
		NhanVien nhanVien, boolean nghiThu7,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		query.append(_FINDER_COLUMN_NGHIT7_NGHITHU7_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nghiThu7);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where nghiThu7 = &#63; from the database.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNGHIT7(boolean nghiThu7) throws SystemException {
		for (NhanVien nhanVien : findByNGHIT7(nghiThu7, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where nghiThu7 = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @return the number of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNGHIT7(boolean nghiThu7) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGHIT7;

		Object[] finderArgs = new Object[] { nghiThu7 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			query.append(_FINDER_COLUMN_NGHIT7_NGHITHU7_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nghiThu7);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NGHIT7_NGHITHU7_2 = "nhanVien.nghiThu7 = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGHIT7_CN =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNGHIT7_CN",
			new String[] {
				Boolean.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7_CN =
		new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, NhanVienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNGHIT7_CN",
			new String[] { Boolean.class.getName(), Boolean.class.getName() },
			NhanVienModelImpl.NGHITHU7_COLUMN_BITMASK |
			NhanVienModelImpl.NGHICHUNHAT_COLUMN_BITMASK |
			NhanVienModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGHIT7_CN = new FinderPath(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNGHIT7_CN",
			new String[] { Boolean.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @return the matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByNGHIT7_CN(boolean nghiThu7, boolean nghiChuNhat)
		throws SystemException {
		return findByNGHIT7_CN(nghiThu7, nghiChuNhat, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByNGHIT7_CN(boolean nghiThu7,
		boolean nghiChuNhat, int start, int end) throws SystemException {
		return findByNGHIT7_CN(nghiThu7, nghiChuNhat, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findByNGHIT7_CN(boolean nghiThu7,
		boolean nghiChuNhat, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7_CN;
			finderArgs = new Object[] { nghiThu7, nghiChuNhat };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGHIT7_CN;
			finderArgs = new Object[] {
					nghiThu7, nghiChuNhat,
					
					start, end, orderByComparator
				};
		}

		List<NhanVien> list = (List<NhanVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhanVien nhanVien : list) {
				if ((nghiThu7 != nhanVien.getNghiThu7()) ||
						(nghiChuNhat != nhanVien.getNghiChuNhat())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_NHANVIEN_WHERE);

			query.append(_FINDER_COLUMN_NGHIT7_CN_NGHITHU7_2);

			query.append(_FINDER_COLUMN_NGHIT7_CN_NGHICHUNHAT_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhanVienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nghiThu7);

				qPos.add(nghiChuNhat);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhanVien>(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByNGHIT7_CN_First(boolean nghiThu7,
		boolean nghiChuNhat, OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByNGHIT7_CN_First(nghiThu7, nghiChuNhat,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nghiThu7=");
		msg.append(nghiThu7);

		msg.append(", nghiChuNhat=");
		msg.append(nghiChuNhat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the first nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByNGHIT7_CN_First(boolean nghiThu7,
		boolean nghiChuNhat, OrderByComparator orderByComparator)
		throws SystemException {
		List<NhanVien> list = findByNGHIT7_CN(nghiThu7, nghiChuNhat, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByNGHIT7_CN_Last(boolean nghiThu7, boolean nghiChuNhat,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByNGHIT7_CN_Last(nghiThu7, nghiChuNhat,
				orderByComparator);

		if (nhanVien != null) {
			return nhanVien;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nghiThu7=");
		msg.append(nghiThu7);

		msg.append(", nghiChuNhat=");
		msg.append(nghiChuNhat);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhanVienException(msg.toString());
	}

	/**
	 * Returns the last nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByNGHIT7_CN_Last(boolean nghiThu7,
		boolean nghiChuNhat, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNGHIT7_CN(nghiThu7, nghiChuNhat);

		if (count == 0) {
			return null;
		}

		List<NhanVien> list = findByNGHIT7_CN(nghiThu7, nghiChuNhat, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhan viens before and after the current nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * @param nhanVienId the primary key of the current nhan vien
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien[] findByNGHIT7_CN_PrevAndNext(long nhanVienId,
		boolean nghiThu7, boolean nghiChuNhat,
		OrderByComparator orderByComparator)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = findByPrimaryKey(nhanVienId);

		Session session = null;

		try {
			session = openSession();

			NhanVien[] array = new NhanVienImpl[3];

			array[0] = getByNGHIT7_CN_PrevAndNext(session, nhanVien, nghiThu7,
					nghiChuNhat, orderByComparator, true);

			array[1] = nhanVien;

			array[2] = getByNGHIT7_CN_PrevAndNext(session, nhanVien, nghiThu7,
					nghiChuNhat, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhanVien getByNGHIT7_CN_PrevAndNext(Session session,
		NhanVien nhanVien, boolean nghiThu7, boolean nghiChuNhat,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHANVIEN_WHERE);

		query.append(_FINDER_COLUMN_NGHIT7_CN_NGHITHU7_2);

		query.append(_FINDER_COLUMN_NGHIT7_CN_NGHICHUNHAT_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(NhanVienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nghiThu7);

		qPos.add(nghiChuNhat);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhanVien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhanVien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63; from the database.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNGHIT7_CN(boolean nghiThu7, boolean nghiChuNhat)
		throws SystemException {
		for (NhanVien nhanVien : findByNGHIT7_CN(nghiThu7, nghiChuNhat,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	 *
	 * @param nghiThu7 the nghi thu7
	 * @param nghiChuNhat the nghi chu nhat
	 * @return the number of matching nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNGHIT7_CN(boolean nghiThu7, boolean nghiChuNhat)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGHIT7_CN;

		Object[] finderArgs = new Object[] { nghiThu7, nghiChuNhat };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NHANVIEN_WHERE);

			query.append(_FINDER_COLUMN_NGHIT7_CN_NGHITHU7_2);

			query.append(_FINDER_COLUMN_NGHIT7_CN_NGHICHUNHAT_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nghiThu7);

				qPos.add(nghiChuNhat);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NGHIT7_CN_NGHITHU7_2 = "nhanVien.nghiThu7 = ? AND ";
	private static final String _FINDER_COLUMN_NGHIT7_CN_NGHICHUNHAT_2 = "nhanVien.nghiChuNhat = ?";

	public NhanVienPersistenceImpl() {
		setModelClass(NhanVien.class);
	}

	/**
	 * Caches the nhan vien in the entity cache if it is enabled.
	 *
	 * @param nhanVien the nhan vien
	 */
	@Override
	public void cacheResult(NhanVien nhanVien) {
		EntityCacheUtil.putResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienImpl.class, nhanVien.getPrimaryKey(), nhanVien);

		nhanVien.resetOriginalValues();
	}

	/**
	 * Caches the nhan viens in the entity cache if it is enabled.
	 *
	 * @param nhanViens the nhan viens
	 */
	@Override
	public void cacheResult(List<NhanVien> nhanViens) {
		for (NhanVien nhanVien : nhanViens) {
			if (EntityCacheUtil.getResult(
						NhanVienModelImpl.ENTITY_CACHE_ENABLED,
						NhanVienImpl.class, nhanVien.getPrimaryKey()) == null) {
				cacheResult(nhanVien);
			}
			else {
				nhanVien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nhan viens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NhanVienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NhanVienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nhan vien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NhanVien nhanVien) {
		EntityCacheUtil.removeResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienImpl.class, nhanVien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NhanVien> nhanViens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NhanVien nhanVien : nhanViens) {
			EntityCacheUtil.removeResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
				NhanVienImpl.class, nhanVien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	 *
	 * @param nhanVienId the primary key for the new nhan vien
	 * @return the new nhan vien
	 */
	@Override
	public NhanVien create(long nhanVienId) {
		NhanVien nhanVien = new NhanVienImpl();

		nhanVien.setNew(true);
		nhanVien.setPrimaryKey(nhanVienId);

		String uuid = PortalUUIDUtil.generate();

		nhanVien.setUuid(uuid);

		return nhanVien;
	}

	/**
	 * Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhanVienId the primary key of the nhan vien
	 * @return the nhan vien that was removed
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien remove(long nhanVienId)
		throws NoSuchNhanVienException, SystemException {
		return remove((Serializable)nhanVienId);
	}

	/**
	 * Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nhan vien
	 * @return the nhan vien that was removed
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien remove(Serializable primaryKey)
		throws NoSuchNhanVienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NhanVien nhanVien = (NhanVien)session.get(NhanVienImpl.class,
					primaryKey);

			if (nhanVien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNhanVienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhanVien);
		}
		catch (NoSuchNhanVienException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected NhanVien removeImpl(NhanVien nhanVien) throws SystemException {
		nhanVien = toUnwrappedModel(nhanVien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhanVien)) {
				nhanVien = (NhanVien)session.get(NhanVienImpl.class,
						nhanVien.getPrimaryKeyObj());
			}

			if (nhanVien != null) {
				session.delete(nhanVien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhanVien != null) {
			clearCache(nhanVien);
		}

		return nhanVien;
	}

	@Override
	public NhanVien updateImpl(
		com.minimart.portlet.nhanvien.model.NhanVien nhanVien)
		throws SystemException {
		nhanVien = toUnwrappedModel(nhanVien);

		boolean isNew = nhanVien.isNew();

		NhanVienModelImpl nhanVienModelImpl = (NhanVienModelImpl)nhanVien;

		if (Validator.isNull(nhanVien.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			nhanVien.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (nhanVien.isNew()) {
				session.save(nhanVien);

				nhanVien.setNew(false);
			}
			else {
				session.merge(nhanVien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NhanVienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { nhanVienModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { nhanVienModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhanVienModelImpl.getOriginalUuid(),
						nhanVienModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						nhanVienModelImpl.getUuid(),
						nhanVienModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhanVienModelImpl.getOriginalTen(),
						nhanVienModelImpl.getOriginalHo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO,
					args);

				args = new Object[] {
						nhanVienModelImpl.getTen(), nhanVienModelImpl.getHo()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO,
					args);
			}

			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO_TH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhanVienModelImpl.getOriginalTen(),
						nhanVienModelImpl.getOriginalHo(),
						nhanVienModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HO_TH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO_TH,
					args);

				args = new Object[] {
						nhanVienModelImpl.getTen(), nhanVienModelImpl.getHo(),
						nhanVienModelImpl.getTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HO_TH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HO_TH,
					args);
			}

			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhanVienModelImpl.getOriginalNghiThu7()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGHIT7, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7,
					args);

				args = new Object[] { nhanVienModelImpl.getNghiThu7() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGHIT7, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7,
					args);
			}

			if ((nhanVienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7_CN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhanVienModelImpl.getOriginalNghiThu7(),
						nhanVienModelImpl.getOriginalNghiChuNhat()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGHIT7_CN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7_CN,
					args);

				args = new Object[] {
						nhanVienModelImpl.getNghiThu7(),
						nhanVienModelImpl.getNghiChuNhat()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGHIT7_CN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGHIT7_CN,
					args);
			}
		}

		EntityCacheUtil.putResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
			NhanVienImpl.class, nhanVien.getPrimaryKey(), nhanVien);

		return nhanVien;
	}

	protected NhanVien toUnwrappedModel(NhanVien nhanVien) {
		if (nhanVien instanceof NhanVienImpl) {
			return nhanVien;
		}

		NhanVienImpl nhanVienImpl = new NhanVienImpl();

		nhanVienImpl.setNew(nhanVien.isNew());
		nhanVienImpl.setPrimaryKey(nhanVien.getPrimaryKey());

		nhanVienImpl.setUuid(nhanVien.getUuid());
		nhanVienImpl.setNhanVienId(nhanVien.getNhanVienId());
		nhanVienImpl.setCompanyId(nhanVien.getCompanyId());
		nhanVienImpl.setUserId(nhanVien.getUserId());
		nhanVienImpl.setUserName(nhanVien.getUserName());
		nhanVienImpl.setCreateDate(nhanVien.getCreateDate());
		nhanVienImpl.setModifiedDate(nhanVien.getModifiedDate());
		nhanVienImpl.setTen(nhanVien.getTen());
		nhanVienImpl.setHo(nhanVien.getHo());
		nhanVienImpl.setTrangThai(nhanVien.isTrangThai());
		nhanVienImpl.setNghiThu7(nhanVien.isNghiThu7());
		nhanVienImpl.setNghiChuNhat(nhanVien.isNghiChuNhat());
		nhanVienImpl.setCachTinhLuong(nhanVien.getCachTinhLuong());
		nhanVienImpl.setLuongCa(nhanVien.getLuongCa());
		nhanVienImpl.setLuongThang(nhanVien.getLuongThang());
		nhanVienImpl.setImage(nhanVien.getImage());
		nhanVienImpl.setDiaChiId(nhanVien.getDiaChiId());

		return nhanVienImpl;
	}

	/**
	 * Returns the nhan vien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhan vien
	 * @return the nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNhanVienException, SystemException {
		NhanVien nhanVien = fetchByPrimaryKey(primaryKey);

		if (nhanVien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNhanVienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhanVien;
	}

	/**
	 * Returns the nhan vien with the primary key or throws a {@link com.minimart.portlet.nhanvien.NoSuchNhanVienException} if it could not be found.
	 *
	 * @param nhanVienId the primary key of the nhan vien
	 * @return the nhan vien
	 * @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien findByPrimaryKey(long nhanVienId)
		throws NoSuchNhanVienException, SystemException {
		return findByPrimaryKey((Serializable)nhanVienId);
	}

	/**
	 * Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhan vien
	 * @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NhanVien nhanVien = (NhanVien)EntityCacheUtil.getResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
				NhanVienImpl.class, primaryKey);

		if (nhanVien == _nullNhanVien) {
			return null;
		}

		if (nhanVien == null) {
			Session session = null;

			try {
				session = openSession();

				nhanVien = (NhanVien)session.get(NhanVienImpl.class, primaryKey);

				if (nhanVien != null) {
					cacheResult(nhanVien);
				}
				else {
					EntityCacheUtil.putResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
						NhanVienImpl.class, primaryKey, _nullNhanVien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NhanVienModelImpl.ENTITY_CACHE_ENABLED,
					NhanVienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhanVien;
	}

	/**
	 * Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nhanVienId the primary key of the nhan vien
	 * @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhanVien fetchByPrimaryKey(long nhanVienId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)nhanVienId);
	}

	/**
	 * Returns all the nhan viens.
	 *
	 * @return the nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhan viens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @return the range of nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhan viens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhan viens
	 * @param end the upper bound of the range of nhan viens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhanVien> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<NhanVien> list = (List<NhanVien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NHANVIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHANVIEN;

				if (pagination) {
					sql = sql.concat(NhanVienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhanVien>(list);
				}
				else {
					list = (List<NhanVien>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the nhan viens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NhanVien nhanVien : findAll()) {
			remove(nhanVien);
		}
	}

	/**
	 * Returns the number of nhan viens.
	 *
	 * @return the number of nhan viens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NHANVIEN);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the nhan vien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.nhanvien.model.NhanVien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NhanVien>> listenersList = new ArrayList<ModelListener<NhanVien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NhanVien>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(NhanVienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NHANVIEN = "SELECT nhanVien FROM NhanVien nhanVien";
	private static final String _SQL_SELECT_NHANVIEN_WHERE = "SELECT nhanVien FROM NhanVien nhanVien WHERE ";
	private static final String _SQL_COUNT_NHANVIEN = "SELECT COUNT(nhanVien) FROM NhanVien nhanVien";
	private static final String _SQL_COUNT_NHANVIEN_WHERE = "SELECT COUNT(nhanVien) FROM NhanVien nhanVien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhanVien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NhanVien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NhanVien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NhanVienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static NhanVien _nullNhanVien = new NhanVienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NhanVien> toCacheModel() {
				return _nullNhanVienCacheModel;
			}
		};

	private static CacheModel<NhanVien> _nullNhanVienCacheModel = new CacheModel<NhanVien>() {
			@Override
			public NhanVien toEntityModel() {
				return _nullNhanVien;
			}
		};
}