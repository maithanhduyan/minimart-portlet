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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.cuahang.NoSuchTangCaException;
import com.minimart.portlet.cuahang.model.TangCa;
import com.minimart.portlet.cuahang.model.impl.TangCaImpl;
import com.minimart.portlet.cuahang.model.impl.TangCaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tang ca service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TangCaPersistence
 * @see TangCaUtil
 * @generated
 */
public class TangCaPersistenceImpl extends BasePersistenceImpl<TangCa>
	implements TangCaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TangCaUtil} to access the tang ca persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TangCaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaModelImpl.FINDER_CACHE_ENABLED, TangCaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaModelImpl.FINDER_CACHE_ENABLED, TangCaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_CH_CLV_HD =
		new FinderPath(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaModelImpl.FINDER_CACHE_ENABLED, TangCaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUID_CH_CLV_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_CH_CLV_HD =
		new FinderPath(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaModelImpl.FINDER_CACHE_ENABLED, TangCaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUID_CH_CLV_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			TangCaModelImpl.USERID_COLUMN_BITMASK |
			TangCaModelImpl.CUAHANGID_COLUMN_BITMASK |
			TangCaModelImpl.CALAMVIECID_COLUMN_BITMASK |
			TangCaModelImpl.HOATDONG_COLUMN_BITMASK |
			TangCaModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UID_CH_CLV_HD = new FinderPath(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUID_CH_CLV_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @return the matching tang cas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TangCa> findByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong) throws SystemException {
		return findByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId, hoatDong,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of tang cas
	 * @param end the upper bound of the range of tang cas (not inclusive)
	 * @return the range of matching tang cas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TangCa> findByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong, int start, int end)
		throws SystemException {
		return findByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId, hoatDong,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of tang cas
	 * @param end the upper bound of the range of tang cas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tang cas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TangCa> findByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_CH_CLV_HD;
			finderArgs = new Object[] { userId, cuaHangId, caLamViecId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UID_CH_CLV_HD;
			finderArgs = new Object[] {
					userId, cuaHangId, caLamViecId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<TangCa> list = (List<TangCa>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TangCa tangCa : list) {
				if ((userId != tangCa.getUserId()) ||
						(cuaHangId != tangCa.getCuaHangId()) ||
						(caLamViecId != tangCa.getCaLamViecId()) ||
						(hoatDong != tangCa.getHoatDong())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_TANGCA_WHERE);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_USERID_2);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_CUAHANGID_2);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_CALAMVIECID_2);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TangCaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(cuaHangId);

				qPos.add(caLamViecId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<TangCa>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TangCa>(list);
				}
				else {
					list = (List<TangCa>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tang ca
	 * @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a matching tang ca could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa findByUID_CH_CLV_HD_First(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchTangCaException, SystemException {
		TangCa tangCa = fetchByUID_CH_CLV_HD_First(userId, cuaHangId,
				caLamViecId, hoatDong, orderByComparator);

		if (tangCa != null) {
			return tangCa;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", cuaHangId=");
		msg.append(cuaHangId);

		msg.append(", caLamViecId=");
		msg.append(caLamViecId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTangCaException(msg.toString());
	}

	/**
	 * Returns the first tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tang ca, or <code>null</code> if a matching tang ca could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa fetchByUID_CH_CLV_HD_First(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<TangCa> list = findByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId,
				hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tang ca
	 * @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a matching tang ca could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa findByUID_CH_CLV_HD_Last(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchTangCaException, SystemException {
		TangCa tangCa = fetchByUID_CH_CLV_HD_Last(userId, cuaHangId,
				caLamViecId, hoatDong, orderByComparator);

		if (tangCa != null) {
			return tangCa;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", cuaHangId=");
		msg.append(cuaHangId);

		msg.append(", caLamViecId=");
		msg.append(caLamViecId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTangCaException(msg.toString());
	}

	/**
	 * Returns the last tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tang ca, or <code>null</code> if a matching tang ca could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa fetchByUID_CH_CLV_HD_Last(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId,
				hoatDong);

		if (count == 0) {
			return null;
		}

		List<TangCa> list = findByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId,
				hoatDong, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tang cas before and after the current tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * @param tangCaId the primary key of the current tang ca
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tang ca
	 * @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa[] findByUID_CH_CLV_HD_PrevAndNext(long tangCaId, long userId,
		long cuaHangId, long caLamViecId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchTangCaException, SystemException {
		TangCa tangCa = findByPrimaryKey(tangCaId);

		Session session = null;

		try {
			session = openSession();

			TangCa[] array = new TangCaImpl[3];

			array[0] = getByUID_CH_CLV_HD_PrevAndNext(session, tangCa, userId,
					cuaHangId, caLamViecId, hoatDong, orderByComparator, true);

			array[1] = tangCa;

			array[2] = getByUID_CH_CLV_HD_PrevAndNext(session, tangCa, userId,
					cuaHangId, caLamViecId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TangCa getByUID_CH_CLV_HD_PrevAndNext(Session session,
		TangCa tangCa, long userId, long cuaHangId, long caLamViecId,
		boolean hoatDong, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TANGCA_WHERE);

		query.append(_FINDER_COLUMN_UID_CH_CLV_HD_USERID_2);

		query.append(_FINDER_COLUMN_UID_CH_CLV_HD_CUAHANGID_2);

		query.append(_FINDER_COLUMN_UID_CH_CLV_HD_CALAMVIECID_2);

		query.append(_FINDER_COLUMN_UID_CH_CLV_HD_HOATDONG_2);

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
			query.append(TangCaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		qPos.add(cuaHangId);

		qPos.add(caLamViecId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tangCa);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TangCa> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong) throws SystemException {
		for (TangCa tangCa : findByUID_CH_CLV_HD(userId, cuaHangId,
				caLamViecId, hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(tangCa);
		}
	}

	/**
	 * Returns the number of tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	 *
	 * @param userId the user ID
	 * @param cuaHangId the cua hang ID
	 * @param caLamViecId the ca lam viec ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching tang cas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UID_CH_CLV_HD;

		Object[] finderArgs = new Object[] {
				userId, cuaHangId, caLamViecId, hoatDong
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_TANGCA_WHERE);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_USERID_2);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_CUAHANGID_2);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_CALAMVIECID_2);

			query.append(_FINDER_COLUMN_UID_CH_CLV_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(cuaHangId);

				qPos.add(caLamViecId);

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

	private static final String _FINDER_COLUMN_UID_CH_CLV_HD_USERID_2 = "tangCa.userId = ? AND ";
	private static final String _FINDER_COLUMN_UID_CH_CLV_HD_CUAHANGID_2 = "tangCa.cuaHangId = ? AND ";
	private static final String _FINDER_COLUMN_UID_CH_CLV_HD_CALAMVIECID_2 = "tangCa.caLamViecId = ? AND ";
	private static final String _FINDER_COLUMN_UID_CH_CLV_HD_HOATDONG_2 = "tangCa.hoatDong = ?";

	public TangCaPersistenceImpl() {
		setModelClass(TangCa.class);
	}

	/**
	 * Caches the tang ca in the entity cache if it is enabled.
	 *
	 * @param tangCa the tang ca
	 */
	@Override
	public void cacheResult(TangCa tangCa) {
		EntityCacheUtil.putResult(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaImpl.class, tangCa.getPrimaryKey(), tangCa);

		tangCa.resetOriginalValues();
	}

	/**
	 * Caches the tang cas in the entity cache if it is enabled.
	 *
	 * @param tangCas the tang cas
	 */
	@Override
	public void cacheResult(List<TangCa> tangCas) {
		for (TangCa tangCa : tangCas) {
			if (EntityCacheUtil.getResult(
						TangCaModelImpl.ENTITY_CACHE_ENABLED, TangCaImpl.class,
						tangCa.getPrimaryKey()) == null) {
				cacheResult(tangCa);
			}
			else {
				tangCa.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tang cas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TangCaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TangCaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tang ca.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TangCa tangCa) {
		EntityCacheUtil.removeResult(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaImpl.class, tangCa.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TangCa> tangCas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TangCa tangCa : tangCas) {
			EntityCacheUtil.removeResult(TangCaModelImpl.ENTITY_CACHE_ENABLED,
				TangCaImpl.class, tangCa.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tang ca with the primary key. Does not add the tang ca to the database.
	 *
	 * @param tangCaId the primary key for the new tang ca
	 * @return the new tang ca
	 */
	@Override
	public TangCa create(long tangCaId) {
		TangCa tangCa = new TangCaImpl();

		tangCa.setNew(true);
		tangCa.setPrimaryKey(tangCaId);

		return tangCa;
	}

	/**
	 * Removes the tang ca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tangCaId the primary key of the tang ca
	 * @return the tang ca that was removed
	 * @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa remove(long tangCaId)
		throws NoSuchTangCaException, SystemException {
		return remove((Serializable)tangCaId);
	}

	/**
	 * Removes the tang ca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tang ca
	 * @return the tang ca that was removed
	 * @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa remove(Serializable primaryKey)
		throws NoSuchTangCaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TangCa tangCa = (TangCa)session.get(TangCaImpl.class, primaryKey);

			if (tangCa == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTangCaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tangCa);
		}
		catch (NoSuchTangCaException nsee) {
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
	protected TangCa removeImpl(TangCa tangCa) throws SystemException {
		tangCa = toUnwrappedModel(tangCa);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tangCa)) {
				tangCa = (TangCa)session.get(TangCaImpl.class,
						tangCa.getPrimaryKeyObj());
			}

			if (tangCa != null) {
				session.delete(tangCa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tangCa != null) {
			clearCache(tangCa);
		}

		return tangCa;
	}

	@Override
	public TangCa updateImpl(com.minimart.portlet.cuahang.model.TangCa tangCa)
		throws SystemException {
		tangCa = toUnwrappedModel(tangCa);

		boolean isNew = tangCa.isNew();

		TangCaModelImpl tangCaModelImpl = (TangCaModelImpl)tangCa;

		Session session = null;

		try {
			session = openSession();

			if (tangCa.isNew()) {
				session.save(tangCa);

				tangCa.setNew(false);
			}
			else {
				session.merge(tangCa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TangCaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tangCaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_CH_CLV_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tangCaModelImpl.getOriginalUserId(),
						tangCaModelImpl.getOriginalCuaHangId(),
						tangCaModelImpl.getOriginalCaLamViecId(),
						tangCaModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_CH_CLV_HD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_CH_CLV_HD,
					args);

				args = new Object[] {
						tangCaModelImpl.getUserId(),
						tangCaModelImpl.getCuaHangId(),
						tangCaModelImpl.getCaLamViecId(),
						tangCaModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UID_CH_CLV_HD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UID_CH_CLV_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(TangCaModelImpl.ENTITY_CACHE_ENABLED,
			TangCaImpl.class, tangCa.getPrimaryKey(), tangCa);

		return tangCa;
	}

	protected TangCa toUnwrappedModel(TangCa tangCa) {
		if (tangCa instanceof TangCaImpl) {
			return tangCa;
		}

		TangCaImpl tangCaImpl = new TangCaImpl();

		tangCaImpl.setNew(tangCa.isNew());
		tangCaImpl.setPrimaryKey(tangCa.getPrimaryKey());

		tangCaImpl.setTangCaId(tangCa.getTangCaId());
		tangCaImpl.setCompanyId(tangCa.getCompanyId());
		tangCaImpl.setUserId(tangCa.getUserId());
		tangCaImpl.setUserName(tangCa.getUserName());
		tangCaImpl.setCreateDate(tangCa.getCreateDate());
		tangCaImpl.setModifiedDate(tangCa.getModifiedDate());
		tangCaImpl.setTen(tangCa.getTen());
		tangCaImpl.setCuaHangId(tangCa.getCuaHangId());
		tangCaImpl.setCaLamViecId(tangCa.getCaLamViecId());
		tangCaImpl.setNhanVienId(tangCa.getNhanVienId());
		tangCaImpl.setTangCaTu(tangCa.getTangCaTu());
		tangCaImpl.setTangCaDen(tangCa.getTangCaDen());
		tangCaImpl.setHoatDong(tangCa.isHoatDong());

		return tangCaImpl;
	}

	/**
	 * Returns the tang ca with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tang ca
	 * @return the tang ca
	 * @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTangCaException, SystemException {
		TangCa tangCa = fetchByPrimaryKey(primaryKey);

		if (tangCa == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTangCaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tangCa;
	}

	/**
	 * Returns the tang ca with the primary key or throws a {@link com.minimart.portlet.cuahang.NoSuchTangCaException} if it could not be found.
	 *
	 * @param tangCaId the primary key of the tang ca
	 * @return the tang ca
	 * @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa findByPrimaryKey(long tangCaId)
		throws NoSuchTangCaException, SystemException {
		return findByPrimaryKey((Serializable)tangCaId);
	}

	/**
	 * Returns the tang ca with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tang ca
	 * @return the tang ca, or <code>null</code> if a tang ca with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TangCa tangCa = (TangCa)EntityCacheUtil.getResult(TangCaModelImpl.ENTITY_CACHE_ENABLED,
				TangCaImpl.class, primaryKey);

		if (tangCa == _nullTangCa) {
			return null;
		}

		if (tangCa == null) {
			Session session = null;

			try {
				session = openSession();

				tangCa = (TangCa)session.get(TangCaImpl.class, primaryKey);

				if (tangCa != null) {
					cacheResult(tangCa);
				}
				else {
					EntityCacheUtil.putResult(TangCaModelImpl.ENTITY_CACHE_ENABLED,
						TangCaImpl.class, primaryKey, _nullTangCa);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TangCaModelImpl.ENTITY_CACHE_ENABLED,
					TangCaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tangCa;
	}

	/**
	 * Returns the tang ca with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tangCaId the primary key of the tang ca
	 * @return the tang ca, or <code>null</code> if a tang ca with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TangCa fetchByPrimaryKey(long tangCaId) throws SystemException {
		return fetchByPrimaryKey((Serializable)tangCaId);
	}

	/**
	 * Returns all the tang cas.
	 *
	 * @return the tang cas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TangCa> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tang cas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tang cas
	 * @param end the upper bound of the range of tang cas (not inclusive)
	 * @return the range of tang cas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TangCa> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tang cas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tang cas
	 * @param end the upper bound of the range of tang cas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tang cas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TangCa> findAll(int start, int end,
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

		List<TangCa> list = (List<TangCa>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TANGCA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TANGCA;

				if (pagination) {
					sql = sql.concat(TangCaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TangCa>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TangCa>(list);
				}
				else {
					list = (List<TangCa>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the tang cas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TangCa tangCa : findAll()) {
			remove(tangCa);
		}
	}

	/**
	 * Returns the number of tang cas.
	 *
	 * @return the number of tang cas
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

				Query q = session.createQuery(_SQL_COUNT_TANGCA);

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
	 * Initializes the tang ca persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.cuahang.model.TangCa")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TangCa>> listenersList = new ArrayList<ModelListener<TangCa>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TangCa>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TangCaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TANGCA = "SELECT tangCa FROM TangCa tangCa";
	private static final String _SQL_SELECT_TANGCA_WHERE = "SELECT tangCa FROM TangCa tangCa WHERE ";
	private static final String _SQL_COUNT_TANGCA = "SELECT COUNT(tangCa) FROM TangCa tangCa";
	private static final String _SQL_COUNT_TANGCA_WHERE = "SELECT COUNT(tangCa) FROM TangCa tangCa WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tangCa.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TangCa exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TangCa exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TangCaPersistenceImpl.class);
	private static TangCa _nullTangCa = new TangCaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TangCa> toCacheModel() {
				return _nullTangCaCacheModel;
			}
		};

	private static CacheModel<TangCa> _nullTangCaCacheModel = new CacheModel<TangCa>() {
			@Override
			public TangCa toEntityModel() {
				return _nullTangCa;
			}
		};
}