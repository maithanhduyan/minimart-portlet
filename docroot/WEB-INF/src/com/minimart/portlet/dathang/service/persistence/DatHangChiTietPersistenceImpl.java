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

package com.minimart.portlet.dathang.service.persistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.dathang.NoSuchDatHangChiTietException;
import com.minimart.portlet.dathang.model.DatHangChiTiet;
import com.minimart.portlet.dathang.model.impl.DatHangChiTietImpl;
import com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dat hang chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHangChiTietPersistence
 * @see DatHangChiTietUtil
 * @generated
 */
public class DatHangChiTietPersistenceImpl extends BasePersistenceImpl<DatHangChiTiet>
	implements DatHangChiTietPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DatHangChiTietUtil} to access the dat hang chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DatHangChiTietImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DatHangChiTietImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DatHangChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DHID_MHID =
		new FinderPath(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DatHangChiTietImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDHID_MHID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DHID_MHID =
		new FinderPath(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DatHangChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDHID_MHID",
			new String[] { Long.class.getName(), Long.class.getName() },
			DatHangChiTietModelImpl.DATHANGID_COLUMN_BITMASK |
			DatHangChiTietModelImpl.MAHANGID_COLUMN_BITMASK |
			DatHangChiTietModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DHID_MHID = new FinderPath(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDHID_MHID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @return the matching dat hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHangChiTiet> findByDHID_MHID(long datHangId, long maHangId)
		throws SystemException {
		return findByDHID_MHID(datHangId, maHangId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @param start the lower bound of the range of dat hang chi tiets
	 * @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	 * @return the range of matching dat hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHangChiTiet> findByDHID_MHID(long datHangId, long maHangId,
		int start, int end) throws SystemException {
		return findByDHID_MHID(datHangId, maHangId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @param start the lower bound of the range of dat hang chi tiets
	 * @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dat hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHangChiTiet> findByDHID_MHID(long datHangId, long maHangId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DHID_MHID;
			finderArgs = new Object[] { datHangId, maHangId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DHID_MHID;
			finderArgs = new Object[] {
					datHangId, maHangId,
					
					start, end, orderByComparator
				};
		}

		List<DatHangChiTiet> list = (List<DatHangChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DatHangChiTiet datHangChiTiet : list) {
				if ((datHangId != datHangChiTiet.getDatHangId()) ||
						(maHangId != datHangChiTiet.getMaHangId())) {
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

			query.append(_SQL_SELECT_DATHANGCHITIET_WHERE);

			query.append(_FINDER_COLUMN_DHID_MHID_DATHANGID_2);

			query.append(_FINDER_COLUMN_DHID_MHID_MAHANGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DatHangChiTietModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(datHangId);

				qPos.add(maHangId);

				if (!pagination) {
					list = (List<DatHangChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DatHangChiTiet>(list);
				}
				else {
					list = (List<DatHangChiTiet>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dat hang chi tiet
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a matching dat hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet findByDHID_MHID_First(long datHangId, long maHangId,
		OrderByComparator orderByComparator)
		throws NoSuchDatHangChiTietException, SystemException {
		DatHangChiTiet datHangChiTiet = fetchByDHID_MHID_First(datHangId,
				maHangId, orderByComparator);

		if (datHangChiTiet != null) {
			return datHangChiTiet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("datHangId=");
		msg.append(datHangId);

		msg.append(", maHangId=");
		msg.append(maHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDatHangChiTietException(msg.toString());
	}

	/**
	 * Returns the first dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dat hang chi tiet, or <code>null</code> if a matching dat hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet fetchByDHID_MHID_First(long datHangId, long maHangId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DatHangChiTiet> list = findByDHID_MHID(datHangId, maHangId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dat hang chi tiet
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a matching dat hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet findByDHID_MHID_Last(long datHangId, long maHangId,
		OrderByComparator orderByComparator)
		throws NoSuchDatHangChiTietException, SystemException {
		DatHangChiTiet datHangChiTiet = fetchByDHID_MHID_Last(datHangId,
				maHangId, orderByComparator);

		if (datHangChiTiet != null) {
			return datHangChiTiet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("datHangId=");
		msg.append(datHangId);

		msg.append(", maHangId=");
		msg.append(maHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDatHangChiTietException(msg.toString());
	}

	/**
	 * Returns the last dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dat hang chi tiet, or <code>null</code> if a matching dat hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet fetchByDHID_MHID_Last(long datHangId, long maHangId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDHID_MHID(datHangId, maHangId);

		if (count == 0) {
			return null;
		}

		List<DatHangChiTiet> list = findByDHID_MHID(datHangId, maHangId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dat hang chi tiets before and after the current dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	 *
	 * @param datHangChiTietId the primary key of the current dat hang chi tiet
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dat hang chi tiet
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet[] findByDHID_MHID_PrevAndNext(long datHangChiTietId,
		long datHangId, long maHangId, OrderByComparator orderByComparator)
		throws NoSuchDatHangChiTietException, SystemException {
		DatHangChiTiet datHangChiTiet = findByPrimaryKey(datHangChiTietId);

		Session session = null;

		try {
			session = openSession();

			DatHangChiTiet[] array = new DatHangChiTietImpl[3];

			array[0] = getByDHID_MHID_PrevAndNext(session, datHangChiTiet,
					datHangId, maHangId, orderByComparator, true);

			array[1] = datHangChiTiet;

			array[2] = getByDHID_MHID_PrevAndNext(session, datHangChiTiet,
					datHangId, maHangId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DatHangChiTiet getByDHID_MHID_PrevAndNext(Session session,
		DatHangChiTiet datHangChiTiet, long datHangId, long maHangId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATHANGCHITIET_WHERE);

		query.append(_FINDER_COLUMN_DHID_MHID_DATHANGID_2);

		query.append(_FINDER_COLUMN_DHID_MHID_MAHANGID_2);

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
			query.append(DatHangChiTietModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(datHangId);

		qPos.add(maHangId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(datHangChiTiet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DatHangChiTiet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63; from the database.
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDHID_MHID(long datHangId, long maHangId)
		throws SystemException {
		for (DatHangChiTiet datHangChiTiet : findByDHID_MHID(datHangId,
				maHangId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(datHangChiTiet);
		}
	}

	/**
	 * Returns the number of dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	 *
	 * @param datHangId the dat hang ID
	 * @param maHangId the ma hang ID
	 * @return the number of matching dat hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDHID_MHID(long datHangId, long maHangId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DHID_MHID;

		Object[] finderArgs = new Object[] { datHangId, maHangId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DATHANGCHITIET_WHERE);

			query.append(_FINDER_COLUMN_DHID_MHID_DATHANGID_2);

			query.append(_FINDER_COLUMN_DHID_MHID_MAHANGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(datHangId);

				qPos.add(maHangId);

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

	private static final String _FINDER_COLUMN_DHID_MHID_DATHANGID_2 = "datHangChiTiet.datHangId = ? AND ";
	private static final String _FINDER_COLUMN_DHID_MHID_MAHANGID_2 = "datHangChiTiet.maHangId = ?";

	public DatHangChiTietPersistenceImpl() {
		setModelClass(DatHangChiTiet.class);
	}

	/**
	 * Caches the dat hang chi tiet in the entity cache if it is enabled.
	 *
	 * @param datHangChiTiet the dat hang chi tiet
	 */
	@Override
	public void cacheResult(DatHangChiTiet datHangChiTiet) {
		EntityCacheUtil.putResult(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietImpl.class, datHangChiTiet.getPrimaryKey(),
			datHangChiTiet);

		datHangChiTiet.resetOriginalValues();
	}

	/**
	 * Caches the dat hang chi tiets in the entity cache if it is enabled.
	 *
	 * @param datHangChiTiets the dat hang chi tiets
	 */
	@Override
	public void cacheResult(List<DatHangChiTiet> datHangChiTiets) {
		for (DatHangChiTiet datHangChiTiet : datHangChiTiets) {
			if (EntityCacheUtil.getResult(
						DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
						DatHangChiTietImpl.class, datHangChiTiet.getPrimaryKey()) == null) {
				cacheResult(datHangChiTiet);
			}
			else {
				datHangChiTiet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dat hang chi tiets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DatHangChiTietImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DatHangChiTietImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dat hang chi tiet.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DatHangChiTiet datHangChiTiet) {
		EntityCacheUtil.removeResult(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietImpl.class, datHangChiTiet.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DatHangChiTiet> datHangChiTiets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DatHangChiTiet datHangChiTiet : datHangChiTiets) {
			EntityCacheUtil.removeResult(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
				DatHangChiTietImpl.class, datHangChiTiet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dat hang chi tiet with the primary key. Does not add the dat hang chi tiet to the database.
	 *
	 * @param datHangChiTietId the primary key for the new dat hang chi tiet
	 * @return the new dat hang chi tiet
	 */
	@Override
	public DatHangChiTiet create(long datHangChiTietId) {
		DatHangChiTiet datHangChiTiet = new DatHangChiTietImpl();

		datHangChiTiet.setNew(true);
		datHangChiTiet.setPrimaryKey(datHangChiTietId);

		return datHangChiTiet;
	}

	/**
	 * Removes the dat hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param datHangChiTietId the primary key of the dat hang chi tiet
	 * @return the dat hang chi tiet that was removed
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet remove(long datHangChiTietId)
		throws NoSuchDatHangChiTietException, SystemException {
		return remove((Serializable)datHangChiTietId);
	}

	/**
	 * Removes the dat hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dat hang chi tiet
	 * @return the dat hang chi tiet that was removed
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet remove(Serializable primaryKey)
		throws NoSuchDatHangChiTietException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DatHangChiTiet datHangChiTiet = (DatHangChiTiet)session.get(DatHangChiTietImpl.class,
					primaryKey);

			if (datHangChiTiet == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDatHangChiTietException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(datHangChiTiet);
		}
		catch (NoSuchDatHangChiTietException nsee) {
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
	protected DatHangChiTiet removeImpl(DatHangChiTiet datHangChiTiet)
		throws SystemException {
		datHangChiTiet = toUnwrappedModel(datHangChiTiet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(datHangChiTiet)) {
				datHangChiTiet = (DatHangChiTiet)session.get(DatHangChiTietImpl.class,
						datHangChiTiet.getPrimaryKeyObj());
			}

			if (datHangChiTiet != null) {
				session.delete(datHangChiTiet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (datHangChiTiet != null) {
			clearCache(datHangChiTiet);
		}

		return datHangChiTiet;
	}

	@Override
	public DatHangChiTiet updateImpl(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet)
		throws SystemException {
		datHangChiTiet = toUnwrappedModel(datHangChiTiet);

		boolean isNew = datHangChiTiet.isNew();

		DatHangChiTietModelImpl datHangChiTietModelImpl = (DatHangChiTietModelImpl)datHangChiTiet;

		Session session = null;

		try {
			session = openSession();

			if (datHangChiTiet.isNew()) {
				session.save(datHangChiTiet);

				datHangChiTiet.setNew(false);
			}
			else {
				session.merge(datHangChiTiet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DatHangChiTietModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((datHangChiTietModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DHID_MHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						datHangChiTietModelImpl.getOriginalDatHangId(),
						datHangChiTietModelImpl.getOriginalMaHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DHID_MHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DHID_MHID,
					args);

				args = new Object[] {
						datHangChiTietModelImpl.getDatHangId(),
						datHangChiTietModelImpl.getMaHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DHID_MHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DHID_MHID,
					args);
			}
		}

		EntityCacheUtil.putResult(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DatHangChiTietImpl.class, datHangChiTiet.getPrimaryKey(),
			datHangChiTiet);

		return datHangChiTiet;
	}

	protected DatHangChiTiet toUnwrappedModel(DatHangChiTiet datHangChiTiet) {
		if (datHangChiTiet instanceof DatHangChiTietImpl) {
			return datHangChiTiet;
		}

		DatHangChiTietImpl datHangChiTietImpl = new DatHangChiTietImpl();

		datHangChiTietImpl.setNew(datHangChiTiet.isNew());
		datHangChiTietImpl.setPrimaryKey(datHangChiTiet.getPrimaryKey());

		datHangChiTietImpl.setDatHangChiTietId(datHangChiTiet.getDatHangChiTietId());
		datHangChiTietImpl.setCompanyId(datHangChiTiet.getCompanyId());
		datHangChiTietImpl.setUserId(datHangChiTiet.getUserId());
		datHangChiTietImpl.setUserName(datHangChiTiet.getUserName());
		datHangChiTietImpl.setCreateDate(datHangChiTiet.getCreateDate());
		datHangChiTietImpl.setModifiedDate(datHangChiTiet.getModifiedDate());
		datHangChiTietImpl.setSoLuong(datHangChiTiet.getSoLuong());
		datHangChiTietImpl.setDonGia(datHangChiTiet.getDonGia());
		datHangChiTietImpl.setThanhTien(datHangChiTiet.getThanhTien());
		datHangChiTietImpl.setTiLeGiamGia(datHangChiTiet.getTiLeGiamGia());
		datHangChiTietImpl.setGhiChu(datHangChiTiet.getGhiChu());
		datHangChiTietImpl.setTrangThai(datHangChiTiet.isTrangThai());
		datHangChiTietImpl.setBaoHanh(datHangChiTiet.getBaoHanh());
		datHangChiTietImpl.setDonViTinhId(datHangChiTiet.getDonViTinhId());
		datHangChiTietImpl.setDatHangId(datHangChiTiet.getDatHangId());
		datHangChiTietImpl.setMaHangId(datHangChiTiet.getMaHangId());

		return datHangChiTietImpl;
	}

	/**
	 * Returns the dat hang chi tiet with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dat hang chi tiet
	 * @return the dat hang chi tiet
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDatHangChiTietException, SystemException {
		DatHangChiTiet datHangChiTiet = fetchByPrimaryKey(primaryKey);

		if (datHangChiTiet == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDatHangChiTietException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return datHangChiTiet;
	}

	/**
	 * Returns the dat hang chi tiet with the primary key or throws a {@link com.minimart.portlet.dathang.NoSuchDatHangChiTietException} if it could not be found.
	 *
	 * @param datHangChiTietId the primary key of the dat hang chi tiet
	 * @return the dat hang chi tiet
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet findByPrimaryKey(long datHangChiTietId)
		throws NoSuchDatHangChiTietException, SystemException {
		return findByPrimaryKey((Serializable)datHangChiTietId);
	}

	/**
	 * Returns the dat hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dat hang chi tiet
	 * @return the dat hang chi tiet, or <code>null</code> if a dat hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DatHangChiTiet datHangChiTiet = (DatHangChiTiet)EntityCacheUtil.getResult(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
				DatHangChiTietImpl.class, primaryKey);

		if (datHangChiTiet == _nullDatHangChiTiet) {
			return null;
		}

		if (datHangChiTiet == null) {
			Session session = null;

			try {
				session = openSession();

				datHangChiTiet = (DatHangChiTiet)session.get(DatHangChiTietImpl.class,
						primaryKey);

				if (datHangChiTiet != null) {
					cacheResult(datHangChiTiet);
				}
				else {
					EntityCacheUtil.putResult(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
						DatHangChiTietImpl.class, primaryKey,
						_nullDatHangChiTiet);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DatHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
					DatHangChiTietImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return datHangChiTiet;
	}

	/**
	 * Returns the dat hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param datHangChiTietId the primary key of the dat hang chi tiet
	 * @return the dat hang chi tiet, or <code>null</code> if a dat hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHangChiTiet fetchByPrimaryKey(long datHangChiTietId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)datHangChiTietId);
	}

	/**
	 * Returns all the dat hang chi tiets.
	 *
	 * @return the dat hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHangChiTiet> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dat hang chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dat hang chi tiets
	 * @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	 * @return the range of dat hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHangChiTiet> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dat hang chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dat hang chi tiets
	 * @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dat hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHangChiTiet> findAll(int start, int end,
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

		List<DatHangChiTiet> list = (List<DatHangChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DATHANGCHITIET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATHANGCHITIET;

				if (pagination) {
					sql = sql.concat(DatHangChiTietModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DatHangChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DatHangChiTiet>(list);
				}
				else {
					list = (List<DatHangChiTiet>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the dat hang chi tiets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DatHangChiTiet datHangChiTiet : findAll()) {
			remove(datHangChiTiet);
		}
	}

	/**
	 * Returns the number of dat hang chi tiets.
	 *
	 * @return the number of dat hang chi tiets
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

				Query q = session.createQuery(_SQL_COUNT_DATHANGCHITIET);

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

	/**
	 * Initializes the dat hang chi tiet persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.dathang.model.DatHangChiTiet")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DatHangChiTiet>> listenersList = new ArrayList<ModelListener<DatHangChiTiet>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DatHangChiTiet>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DatHangChiTietImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DATHANGCHITIET = "SELECT datHangChiTiet FROM DatHangChiTiet datHangChiTiet";
	private static final String _SQL_SELECT_DATHANGCHITIET_WHERE = "SELECT datHangChiTiet FROM DatHangChiTiet datHangChiTiet WHERE ";
	private static final String _SQL_COUNT_DATHANGCHITIET = "SELECT COUNT(datHangChiTiet) FROM DatHangChiTiet datHangChiTiet";
	private static final String _SQL_COUNT_DATHANGCHITIET_WHERE = "SELECT COUNT(datHangChiTiet) FROM DatHangChiTiet datHangChiTiet WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "datHangChiTiet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DatHangChiTiet exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DatHangChiTiet exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DatHangChiTietPersistenceImpl.class);
	private static DatHangChiTiet _nullDatHangChiTiet = new DatHangChiTietImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DatHangChiTiet> toCacheModel() {
				return _nullDatHangChiTietCacheModel;
			}
		};

	private static CacheModel<DatHangChiTiet> _nullDatHangChiTietCacheModel = new CacheModel<DatHangChiTiet>() {
			@Override
			public DatHangChiTiet toEntityModel() {
				return _nullDatHangChiTiet;
			}
		};
}