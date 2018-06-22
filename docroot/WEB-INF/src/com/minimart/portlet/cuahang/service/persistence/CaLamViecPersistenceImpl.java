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

package com.minimart.portlet.cuahang.service.persistence;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.cuahang.NoSuchCaLamViecException;
import com.minimart.portlet.cuahang.model.CaLamViec;
import com.minimart.portlet.cuahang.model.impl.CaLamViecImpl;
import com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the ca lam viec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see CaLamViecPersistence
 * @see CaLamViecUtil
 * @generated
 */
public class CaLamViecPersistenceImpl extends BasePersistenceImpl<CaLamViec>
	implements CaLamViecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CaLamViecUtil} to access the ca lam viec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CaLamViecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecModelImpl.FINDER_CACHE_ENABLED, CaLamViecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecModelImpl.FINDER_CACHE_ENABLED, CaLamViecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD = new FinderPath(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecModelImpl.FINDER_CACHE_ENABLED, CaLamViecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_HD",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD =
		new FinderPath(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecModelImpl.FINDER_CACHE_ENABLED, CaLamViecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() },
			CaLamViecModelImpl.TEN_COLUMN_BITMASK |
			CaLamViecModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HD = new FinderPath(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the ca lam viecs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the matching ca lam viecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CaLamViec> findByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		return findByTEN_HD(ten, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ca lam viecs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of ca lam viecs
	 * @param end the upper bound of the range of ca lam viecs (not inclusive)
	 * @return the range of matching ca lam viecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CaLamViec> findByTEN_HD(String ten, boolean hoatDong,
		int start, int end) throws SystemException {
		return findByTEN_HD(ten, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ca lam viecs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of ca lam viecs
	 * @param end the upper bound of the range of ca lam viecs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ca lam viecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CaLamViec> findByTEN_HD(String ten, boolean hoatDong,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD;
			finderArgs = new Object[] { ten, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD;
			finderArgs = new Object[] {
					ten, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<CaLamViec> list = (List<CaLamViec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CaLamViec caLamViec : list) {
				if (!Validator.equals(ten, caLamViec.getTen()) ||
						(hoatDong != caLamViec.getHoatDong())) {
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

			query.append(_SQL_SELECT_CALAMVIEC_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HD_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CaLamViecModelImpl.ORDER_BY_JPQL);
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

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<CaLamViec>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CaLamViec>(list);
				}
				else {
					list = (List<CaLamViec>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ca lam viec
	 * @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a matching ca lam viec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec findByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchCaLamViecException, SystemException {
		CaLamViec caLamViec = fetchByTEN_HD_First(ten, hoatDong,
				orderByComparator);

		if (caLamViec != null) {
			return caLamViec;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCaLamViecException(msg.toString());
	}

	/**
	 * Returns the first ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ca lam viec, or <code>null</code> if a matching ca lam viec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec fetchByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<CaLamViec> list = findByTEN_HD(ten, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ca lam viec
	 * @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a matching ca lam viec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec findByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchCaLamViecException, SystemException {
		CaLamViec caLamViec = fetchByTEN_HD_Last(ten, hoatDong,
				orderByComparator);

		if (caLamViec != null) {
			return caLamViec;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCaLamViecException(msg.toString());
	}

	/**
	 * Returns the last ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ca lam viec, or <code>null</code> if a matching ca lam viec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec fetchByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_HD(ten, hoatDong);

		if (count == 0) {
			return null;
		}

		List<CaLamViec> list = findByTEN_HD(ten, hoatDong, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ca lam viecs before and after the current ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param caLamViecId the primary key of the current ca lam viec
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ca lam viec
	 * @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec[] findByTEN_HD_PrevAndNext(long caLamViecId, String ten,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchCaLamViecException, SystemException {
		CaLamViec caLamViec = findByPrimaryKey(caLamViecId);

		Session session = null;

		try {
			session = openSession();

			CaLamViec[] array = new CaLamViecImpl[3];

			array[0] = getByTEN_HD_PrevAndNext(session, caLamViec, ten,
					hoatDong, orderByComparator, true);

			array[1] = caLamViec;

			array[2] = getByTEN_HD_PrevAndNext(session, caLamViec, ten,
					hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CaLamViec getByTEN_HD_PrevAndNext(Session session,
		CaLamViec caLamViec, String ten, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CALAMVIEC_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_HD_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_HD_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_HD_TEN_2);
		}

		query.append(_FINDER_COLUMN_TEN_HD_HOATDONG_2);

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
			query.append(CaLamViecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(caLamViec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CaLamViec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ca lam viecs where ten = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		for (CaLamViec caLamViec : findByTEN_HD(ten, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(caLamViec);
		}
	}

	/**
	 * Returns the number of ca lam viecs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the number of matching ca lam viecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_HD;

		Object[] finderArgs = new Object[] { ten, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CALAMVIEC_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HD_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				qPos.add(hoatDong);

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

	private static final String _FINDER_COLUMN_TEN_HD_TEN_1 = "caLamViec.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_2 = "caLamViec.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_3 = "(caLamViec.ten IS NULL OR caLamViec.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HD_HOATDONG_2 = "caLamViec.hoatDong = ?";

	public CaLamViecPersistenceImpl() {
		setModelClass(CaLamViec.class);
	}

	/**
	 * Caches the ca lam viec in the entity cache if it is enabled.
	 *
	 * @param caLamViec the ca lam viec
	 */
	@Override
	public void cacheResult(CaLamViec caLamViec) {
		EntityCacheUtil.putResult(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecImpl.class, caLamViec.getPrimaryKey(), caLamViec);

		caLamViec.resetOriginalValues();
	}

	/**
	 * Caches the ca lam viecs in the entity cache if it is enabled.
	 *
	 * @param caLamViecs the ca lam viecs
	 */
	@Override
	public void cacheResult(List<CaLamViec> caLamViecs) {
		for (CaLamViec caLamViec : caLamViecs) {
			if (EntityCacheUtil.getResult(
						CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
						CaLamViecImpl.class, caLamViec.getPrimaryKey()) == null) {
				cacheResult(caLamViec);
			}
			else {
				caLamViec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ca lam viecs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CaLamViecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CaLamViecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ca lam viec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CaLamViec caLamViec) {
		EntityCacheUtil.removeResult(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecImpl.class, caLamViec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CaLamViec> caLamViecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CaLamViec caLamViec : caLamViecs) {
			EntityCacheUtil.removeResult(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
				CaLamViecImpl.class, caLamViec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ca lam viec with the primary key. Does not add the ca lam viec to the database.
	 *
	 * @param caLamViecId the primary key for the new ca lam viec
	 * @return the new ca lam viec
	 */
	@Override
	public CaLamViec create(long caLamViecId) {
		CaLamViec caLamViec = new CaLamViecImpl();

		caLamViec.setNew(true);
		caLamViec.setPrimaryKey(caLamViecId);

		return caLamViec;
	}

	/**
	 * Removes the ca lam viec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param caLamViecId the primary key of the ca lam viec
	 * @return the ca lam viec that was removed
	 * @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec remove(long caLamViecId)
		throws NoSuchCaLamViecException, SystemException {
		return remove((Serializable)caLamViecId);
	}

	/**
	 * Removes the ca lam viec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ca lam viec
	 * @return the ca lam viec that was removed
	 * @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec remove(Serializable primaryKey)
		throws NoSuchCaLamViecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CaLamViec caLamViec = (CaLamViec)session.get(CaLamViecImpl.class,
					primaryKey);

			if (caLamViec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCaLamViecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(caLamViec);
		}
		catch (NoSuchCaLamViecException nsee) {
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
	protected CaLamViec removeImpl(CaLamViec caLamViec)
		throws SystemException {
		caLamViec = toUnwrappedModel(caLamViec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(caLamViec)) {
				caLamViec = (CaLamViec)session.get(CaLamViecImpl.class,
						caLamViec.getPrimaryKeyObj());
			}

			if (caLamViec != null) {
				session.delete(caLamViec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (caLamViec != null) {
			clearCache(caLamViec);
		}

		return caLamViec;
	}

	@Override
	public CaLamViec updateImpl(
		com.minimart.portlet.cuahang.model.CaLamViec caLamViec)
		throws SystemException {
		caLamViec = toUnwrappedModel(caLamViec);

		boolean isNew = caLamViec.isNew();

		CaLamViecModelImpl caLamViecModelImpl = (CaLamViecModelImpl)caLamViec;

		Session session = null;

		try {
			session = openSession();

			if (caLamViec.isNew()) {
				session.save(caLamViec);

				caLamViec.setNew(false);
			}
			else {
				session.merge(caLamViec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CaLamViecModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((caLamViecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						caLamViecModelImpl.getOriginalTen(),
						caLamViecModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);

				args = new Object[] {
						caLamViecModelImpl.getTen(),
						caLamViecModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
			CaLamViecImpl.class, caLamViec.getPrimaryKey(), caLamViec);

		return caLamViec;
	}

	protected CaLamViec toUnwrappedModel(CaLamViec caLamViec) {
		if (caLamViec instanceof CaLamViecImpl) {
			return caLamViec;
		}

		CaLamViecImpl caLamViecImpl = new CaLamViecImpl();

		caLamViecImpl.setNew(caLamViec.isNew());
		caLamViecImpl.setPrimaryKey(caLamViec.getPrimaryKey());

		caLamViecImpl.setCaLamViecId(caLamViec.getCaLamViecId());
		caLamViecImpl.setCompanyId(caLamViec.getCompanyId());
		caLamViecImpl.setUserId(caLamViec.getUserId());
		caLamViecImpl.setUserName(caLamViec.getUserName());
		caLamViecImpl.setCreateDate(caLamViec.getCreateDate());
		caLamViecImpl.setModifiedDate(caLamViec.getModifiedDate());
		caLamViecImpl.setTen(caLamViec.getTen());
		caLamViecImpl.setCuaHangId(caLamViec.getCuaHangId());
		caLamViecImpl.setGioVaoLam(caLamViec.getGioVaoLam());
		caLamViecImpl.setGioRaVe(caLamViec.getGioRaVe());
		caLamViecImpl.setGioNghiGiuaCaTu(caLamViec.getGioNghiGiuaCaTu());
		caLamViecImpl.setGioNghiGiuaCaDen(caLamViec.getGioNghiGiuaCaDen());
		caLamViecImpl.setTiLeLuong(caLamViec.getTiLeLuong());
		caLamViecImpl.setHoatDong(caLamViec.isHoatDong());

		return caLamViecImpl;
	}

	/**
	 * Returns the ca lam viec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ca lam viec
	 * @return the ca lam viec
	 * @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCaLamViecException, SystemException {
		CaLamViec caLamViec = fetchByPrimaryKey(primaryKey);

		if (caLamViec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCaLamViecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return caLamViec;
	}

	/**
	 * Returns the ca lam viec with the primary key or throws a {@link com.minimart.portlet.cuahang.NoSuchCaLamViecException} if it could not be found.
	 *
	 * @param caLamViecId the primary key of the ca lam viec
	 * @return the ca lam viec
	 * @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec findByPrimaryKey(long caLamViecId)
		throws NoSuchCaLamViecException, SystemException {
		return findByPrimaryKey((Serializable)caLamViecId);
	}

	/**
	 * Returns the ca lam viec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ca lam viec
	 * @return the ca lam viec, or <code>null</code> if a ca lam viec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CaLamViec caLamViec = (CaLamViec)EntityCacheUtil.getResult(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
				CaLamViecImpl.class, primaryKey);

		if (caLamViec == _nullCaLamViec) {
			return null;
		}

		if (caLamViec == null) {
			Session session = null;

			try {
				session = openSession();

				caLamViec = (CaLamViec)session.get(CaLamViecImpl.class,
						primaryKey);

				if (caLamViec != null) {
					cacheResult(caLamViec);
				}
				else {
					EntityCacheUtil.putResult(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
						CaLamViecImpl.class, primaryKey, _nullCaLamViec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CaLamViecModelImpl.ENTITY_CACHE_ENABLED,
					CaLamViecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return caLamViec;
	}

	/**
	 * Returns the ca lam viec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param caLamViecId the primary key of the ca lam viec
	 * @return the ca lam viec, or <code>null</code> if a ca lam viec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CaLamViec fetchByPrimaryKey(long caLamViecId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)caLamViecId);
	}

	/**
	 * Returns all the ca lam viecs.
	 *
	 * @return the ca lam viecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CaLamViec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ca lam viecs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ca lam viecs
	 * @param end the upper bound of the range of ca lam viecs (not inclusive)
	 * @return the range of ca lam viecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CaLamViec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ca lam viecs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ca lam viecs
	 * @param end the upper bound of the range of ca lam viecs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ca lam viecs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CaLamViec> findAll(int start, int end,
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

		List<CaLamViec> list = (List<CaLamViec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CALAMVIEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CALAMVIEC;

				if (pagination) {
					sql = sql.concat(CaLamViecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CaLamViec>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CaLamViec>(list);
				}
				else {
					list = (List<CaLamViec>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ca lam viecs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CaLamViec caLamViec : findAll()) {
			remove(caLamViec);
		}
	}

	/**
	 * Returns the number of ca lam viecs.
	 *
	 * @return the number of ca lam viecs
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

				Query q = session.createQuery(_SQL_COUNT_CALAMVIEC);

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
	 * Initializes the ca lam viec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.cuahang.model.CaLamViec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CaLamViec>> listenersList = new ArrayList<ModelListener<CaLamViec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CaLamViec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CaLamViecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CALAMVIEC = "SELECT caLamViec FROM CaLamViec caLamViec";
	private static final String _SQL_SELECT_CALAMVIEC_WHERE = "SELECT caLamViec FROM CaLamViec caLamViec WHERE ";
	private static final String _SQL_COUNT_CALAMVIEC = "SELECT COUNT(caLamViec) FROM CaLamViec caLamViec";
	private static final String _SQL_COUNT_CALAMVIEC_WHERE = "SELECT COUNT(caLamViec) FROM CaLamViec caLamViec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "caLamViec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CaLamViec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CaLamViec exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CaLamViecPersistenceImpl.class);
	private static CaLamViec _nullCaLamViec = new CaLamViecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CaLamViec> toCacheModel() {
				return _nullCaLamViecCacheModel;
			}
		};

	private static CacheModel<CaLamViec> _nullCaLamViecCacheModel = new CacheModel<CaLamViec>() {
			@Override
			public CaLamViec toEntityModel() {
				return _nullCaLamViec;
			}
		};
}