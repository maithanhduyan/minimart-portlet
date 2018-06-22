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

package com.minimart.portlet.banhang.service.persistence;

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

import com.minimart.portlet.banhang.NoSuchDonHangChiTietException;
import com.minimart.portlet.banhang.model.DonHangChiTiet;
import com.minimart.portlet.banhang.model.impl.DonHangChiTietImpl;
import com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the don hang chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonHangChiTietPersistence
 * @see DonHangChiTietUtil
 * @generated
 */
public class DonHangChiTietPersistenceImpl extends BasePersistenceImpl<DonHangChiTiet>
	implements DonHangChiTietPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DonHangChiTietUtil} to access the don hang chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DonHangChiTietImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DonHangChiTietImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DonHangChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DH_MH_HD = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DonHangChiTietImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDH_MH_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_MH_HD =
		new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DonHangChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDH_MH_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			DonHangChiTietModelImpl.DONHANGID_COLUMN_BITMASK |
			DonHangChiTietModelImpl.MATHANGID_COLUMN_BITMASK |
			DonHangChiTietModelImpl.HOATDONG_COLUMN_BITMASK |
			DonHangChiTietModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DH_MH_HD = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDH_MH_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @return the matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findByDH_MH_HD(long donHangId, long matHangId,
		boolean hoatDong) throws SystemException {
		return findByDH_MH_HD(donHangId, matHangId, hoatDong,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hang chi tiets
	 * @param end the upper bound of the range of don hang chi tiets (not inclusive)
	 * @return the range of matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findByDH_MH_HD(long donHangId, long matHangId,
		boolean hoatDong, int start, int end) throws SystemException {
		return findByDH_MH_HD(donHangId, matHangId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hang chi tiets
	 * @param end the upper bound of the range of don hang chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findByDH_MH_HD(long donHangId, long matHangId,
		boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_MH_HD;
			finderArgs = new Object[] { donHangId, matHangId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DH_MH_HD;
			finderArgs = new Object[] {
					donHangId, matHangId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<DonHangChiTiet> list = (List<DonHangChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DonHangChiTiet donHangChiTiet : list) {
				if ((donHangId != donHangChiTiet.getDonHangId()) ||
						(matHangId != donHangChiTiet.getMatHangId()) ||
						(hoatDong != donHangChiTiet.getHoatDong())) {
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

			query.append(_SQL_SELECT_DONHANGCHITIET_WHERE);

			query.append(_FINDER_COLUMN_DH_MH_HD_DONHANGID_2);

			query.append(_FINDER_COLUMN_DH_MH_HD_MATHANGID_2);

			query.append(_FINDER_COLUMN_DH_MH_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DonHangChiTietModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(donHangId);

				qPos.add(matHangId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<DonHangChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonHangChiTiet>(list);
				}
				else {
					list = (List<DonHangChiTiet>)QueryUtil.list(q,
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
	 * Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet findByDH_MH_HD_First(long donHangId, long matHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDonHangChiTietException, SystemException {
		DonHangChiTiet donHangChiTiet = fetchByDH_MH_HD_First(donHangId,
				matHangId, hoatDong, orderByComparator);

		if (donHangChiTiet != null) {
			return donHangChiTiet;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("donHangId=");
		msg.append(donHangId);

		msg.append(", matHangId=");
		msg.append(matHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangChiTietException(msg.toString());
	}

	/**
	 * Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet fetchByDH_MH_HD_First(long donHangId, long matHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<DonHangChiTiet> list = findByDH_MH_HD(donHangId, matHangId,
				hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet findByDH_MH_HD_Last(long donHangId, long matHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDonHangChiTietException, SystemException {
		DonHangChiTiet donHangChiTiet = fetchByDH_MH_HD_Last(donHangId,
				matHangId, hoatDong, orderByComparator);

		if (donHangChiTiet != null) {
			return donHangChiTiet;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("donHangId=");
		msg.append(donHangId);

		msg.append(", matHangId=");
		msg.append(matHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangChiTietException(msg.toString());
	}

	/**
	 * Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet fetchByDH_MH_HD_Last(long donHangId, long matHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDH_MH_HD(donHangId, matHangId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<DonHangChiTiet> list = findByDH_MH_HD(donHangId, matHangId,
				hoatDong, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the don hang chi tiets before and after the current don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangChiTietId the primary key of the current don hang chi tiet
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet[] findByDH_MH_HD_PrevAndNext(long donHangChiTietId,
		long donHangId, long matHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchDonHangChiTietException, SystemException {
		DonHangChiTiet donHangChiTiet = findByPrimaryKey(donHangChiTietId);

		Session session = null;

		try {
			session = openSession();

			DonHangChiTiet[] array = new DonHangChiTietImpl[3];

			array[0] = getByDH_MH_HD_PrevAndNext(session, donHangChiTiet,
					donHangId, matHangId, hoatDong, orderByComparator, true);

			array[1] = donHangChiTiet;

			array[2] = getByDH_MH_HD_PrevAndNext(session, donHangChiTiet,
					donHangId, matHangId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DonHangChiTiet getByDH_MH_HD_PrevAndNext(Session session,
		DonHangChiTiet donHangChiTiet, long donHangId, long matHangId,
		boolean hoatDong, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DONHANGCHITIET_WHERE);

		query.append(_FINDER_COLUMN_DH_MH_HD_DONHANGID_2);

		query.append(_FINDER_COLUMN_DH_MH_HD_MATHANGID_2);

		query.append(_FINDER_COLUMN_DH_MH_HD_HOATDONG_2);

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
			query.append(DonHangChiTietModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(donHangId);

		qPos.add(matHangId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(donHangChiTiet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DonHangChiTiet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDH_MH_HD(long donHangId, long matHangId,
		boolean hoatDong) throws SystemException {
		for (DonHangChiTiet donHangChiTiet : findByDH_MH_HD(donHangId,
				matHangId, hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(donHangChiTiet);
		}
	}

	/**
	 * Returns the number of don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param matHangId the mat hang ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDH_MH_HD(long donHangId, long matHangId, boolean hoatDong)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DH_MH_HD;

		Object[] finderArgs = new Object[] { donHangId, matHangId, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DONHANGCHITIET_WHERE);

			query.append(_FINDER_COLUMN_DH_MH_HD_DONHANGID_2);

			query.append(_FINDER_COLUMN_DH_MH_HD_MATHANGID_2);

			query.append(_FINDER_COLUMN_DH_MH_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(donHangId);

				qPos.add(matHangId);

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

	private static final String _FINDER_COLUMN_DH_MH_HD_DONHANGID_2 = "donHangChiTiet.donHangId = ? AND ";
	private static final String _FINDER_COLUMN_DH_MH_HD_MATHANGID_2 = "donHangChiTiet.matHangId = ? AND ";
	private static final String _FINDER_COLUMN_DH_MH_HD_HOATDONG_2 = "donHangChiTiet.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DH_HD = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DonHangChiTietImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDH_HD",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_HD = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED,
			DonHangChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDH_HD",
			new String[] { Long.class.getName(), Boolean.class.getName() },
			DonHangChiTietModelImpl.DONHANGID_COLUMN_BITMASK |
			DonHangChiTietModelImpl.HOATDONG_COLUMN_BITMASK |
			DonHangChiTietModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DH_HD = new FinderPath(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDH_HD",
			new String[] { Long.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @return the matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findByDH_HD(long donHangId, boolean hoatDong)
		throws SystemException {
		return findByDH_HD(donHangId, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hang chi tiets
	 * @param end the upper bound of the range of don hang chi tiets (not inclusive)
	 * @return the range of matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findByDH_HD(long donHangId, boolean hoatDong,
		int start, int end) throws SystemException {
		return findByDH_HD(donHangId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hang chi tiets
	 * @param end the upper bound of the range of don hang chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findByDH_HD(long donHangId, boolean hoatDong,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_HD;
			finderArgs = new Object[] { donHangId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DH_HD;
			finderArgs = new Object[] {
					donHangId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<DonHangChiTiet> list = (List<DonHangChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DonHangChiTiet donHangChiTiet : list) {
				if ((donHangId != donHangChiTiet.getDonHangId()) ||
						(hoatDong != donHangChiTiet.getHoatDong())) {
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

			query.append(_SQL_SELECT_DONHANGCHITIET_WHERE);

			query.append(_FINDER_COLUMN_DH_HD_DONHANGID_2);

			query.append(_FINDER_COLUMN_DH_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DonHangChiTietModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(donHangId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<DonHangChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonHangChiTiet>(list);
				}
				else {
					list = (List<DonHangChiTiet>)QueryUtil.list(q,
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
	 * Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet findByDH_HD_First(long donHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchDonHangChiTietException, SystemException {
		DonHangChiTiet donHangChiTiet = fetchByDH_HD_First(donHangId, hoatDong,
				orderByComparator);

		if (donHangChiTiet != null) {
			return donHangChiTiet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("donHangId=");
		msg.append(donHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangChiTietException(msg.toString());
	}

	/**
	 * Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet fetchByDH_HD_First(long donHangId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<DonHangChiTiet> list = findByDH_HD(donHangId, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet findByDH_HD_Last(long donHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchDonHangChiTietException, SystemException {
		DonHangChiTiet donHangChiTiet = fetchByDH_HD_Last(donHangId, hoatDong,
				orderByComparator);

		if (donHangChiTiet != null) {
			return donHangChiTiet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("donHangId=");
		msg.append(donHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangChiTietException(msg.toString());
	}

	/**
	 * Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet fetchByDH_HD_Last(long donHangId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDH_HD(donHangId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<DonHangChiTiet> list = findByDH_HD(donHangId, hoatDong, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the don hang chi tiets before and after the current don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangChiTietId the primary key of the current don hang chi tiet
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet[] findByDH_HD_PrevAndNext(long donHangChiTietId,
		long donHangId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDonHangChiTietException, SystemException {
		DonHangChiTiet donHangChiTiet = findByPrimaryKey(donHangChiTietId);

		Session session = null;

		try {
			session = openSession();

			DonHangChiTiet[] array = new DonHangChiTietImpl[3];

			array[0] = getByDH_HD_PrevAndNext(session, donHangChiTiet,
					donHangId, hoatDong, orderByComparator, true);

			array[1] = donHangChiTiet;

			array[2] = getByDH_HD_PrevAndNext(session, donHangChiTiet,
					donHangId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DonHangChiTiet getByDH_HD_PrevAndNext(Session session,
		DonHangChiTiet donHangChiTiet, long donHangId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DONHANGCHITIET_WHERE);

		query.append(_FINDER_COLUMN_DH_HD_DONHANGID_2);

		query.append(_FINDER_COLUMN_DH_HD_HOATDONG_2);

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
			query.append(DonHangChiTietModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(donHangId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(donHangChiTiet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DonHangChiTiet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDH_HD(long donHangId, boolean hoatDong)
		throws SystemException {
		for (DonHangChiTiet donHangChiTiet : findByDH_HD(donHangId, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(donHangChiTiet);
		}
	}

	/**
	 * Returns the number of don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the don hang ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDH_HD(long donHangId, boolean hoatDong)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DH_HD;

		Object[] finderArgs = new Object[] { donHangId, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DONHANGCHITIET_WHERE);

			query.append(_FINDER_COLUMN_DH_HD_DONHANGID_2);

			query.append(_FINDER_COLUMN_DH_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(donHangId);

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

	private static final String _FINDER_COLUMN_DH_HD_DONHANGID_2 = "donHangChiTiet.donHangId = ? AND ";
	private static final String _FINDER_COLUMN_DH_HD_HOATDONG_2 = "donHangChiTiet.hoatDong = ?";

	public DonHangChiTietPersistenceImpl() {
		setModelClass(DonHangChiTiet.class);
	}

	/**
	 * Caches the don hang chi tiet in the entity cache if it is enabled.
	 *
	 * @param donHangChiTiet the don hang chi tiet
	 */
	@Override
	public void cacheResult(DonHangChiTiet donHangChiTiet) {
		EntityCacheUtil.putResult(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietImpl.class, donHangChiTiet.getPrimaryKey(),
			donHangChiTiet);

		donHangChiTiet.resetOriginalValues();
	}

	/**
	 * Caches the don hang chi tiets in the entity cache if it is enabled.
	 *
	 * @param donHangChiTiets the don hang chi tiets
	 */
	@Override
	public void cacheResult(List<DonHangChiTiet> donHangChiTiets) {
		for (DonHangChiTiet donHangChiTiet : donHangChiTiets) {
			if (EntityCacheUtil.getResult(
						DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
						DonHangChiTietImpl.class, donHangChiTiet.getPrimaryKey()) == null) {
				cacheResult(donHangChiTiet);
			}
			else {
				donHangChiTiet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all don hang chi tiets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DonHangChiTietImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DonHangChiTietImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the don hang chi tiet.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DonHangChiTiet donHangChiTiet) {
		EntityCacheUtil.removeResult(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietImpl.class, donHangChiTiet.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DonHangChiTiet> donHangChiTiets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DonHangChiTiet donHangChiTiet : donHangChiTiets) {
			EntityCacheUtil.removeResult(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
				DonHangChiTietImpl.class, donHangChiTiet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new don hang chi tiet with the primary key. Does not add the don hang chi tiet to the database.
	 *
	 * @param donHangChiTietId the primary key for the new don hang chi tiet
	 * @return the new don hang chi tiet
	 */
	@Override
	public DonHangChiTiet create(long donHangChiTietId) {
		DonHangChiTiet donHangChiTiet = new DonHangChiTietImpl();

		donHangChiTiet.setNew(true);
		donHangChiTiet.setPrimaryKey(donHangChiTietId);

		return donHangChiTiet;
	}

	/**
	 * Removes the don hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param donHangChiTietId the primary key of the don hang chi tiet
	 * @return the don hang chi tiet that was removed
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet remove(long donHangChiTietId)
		throws NoSuchDonHangChiTietException, SystemException {
		return remove((Serializable)donHangChiTietId);
	}

	/**
	 * Removes the don hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the don hang chi tiet
	 * @return the don hang chi tiet that was removed
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet remove(Serializable primaryKey)
		throws NoSuchDonHangChiTietException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DonHangChiTiet donHangChiTiet = (DonHangChiTiet)session.get(DonHangChiTietImpl.class,
					primaryKey);

			if (donHangChiTiet == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDonHangChiTietException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(donHangChiTiet);
		}
		catch (NoSuchDonHangChiTietException nsee) {
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
	protected DonHangChiTiet removeImpl(DonHangChiTiet donHangChiTiet)
		throws SystemException {
		donHangChiTiet = toUnwrappedModel(donHangChiTiet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(donHangChiTiet)) {
				donHangChiTiet = (DonHangChiTiet)session.get(DonHangChiTietImpl.class,
						donHangChiTiet.getPrimaryKeyObj());
			}

			if (donHangChiTiet != null) {
				session.delete(donHangChiTiet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (donHangChiTiet != null) {
			clearCache(donHangChiTiet);
		}

		return donHangChiTiet;
	}

	@Override
	public DonHangChiTiet updateImpl(
		com.minimart.portlet.banhang.model.DonHangChiTiet donHangChiTiet)
		throws SystemException {
		donHangChiTiet = toUnwrappedModel(donHangChiTiet);

		boolean isNew = donHangChiTiet.isNew();

		DonHangChiTietModelImpl donHangChiTietModelImpl = (DonHangChiTietModelImpl)donHangChiTiet;

		Session session = null;

		try {
			session = openSession();

			if (donHangChiTiet.isNew()) {
				session.save(donHangChiTiet);

				donHangChiTiet.setNew(false);
			}
			else {
				session.merge(donHangChiTiet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DonHangChiTietModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((donHangChiTietModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_MH_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						donHangChiTietModelImpl.getOriginalDonHangId(),
						donHangChiTietModelImpl.getOriginalMatHangId(),
						donHangChiTietModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DH_MH_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_MH_HD,
					args);

				args = new Object[] {
						donHangChiTietModelImpl.getDonHangId(),
						donHangChiTietModelImpl.getMatHangId(),
						donHangChiTietModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DH_MH_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_MH_HD,
					args);
			}

			if ((donHangChiTietModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						donHangChiTietModelImpl.getOriginalDonHangId(),
						donHangChiTietModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DH_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_HD,
					args);

				args = new Object[] {
						donHangChiTietModelImpl.getDonHangId(),
						donHangChiTietModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DH_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DH_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DonHangChiTietImpl.class, donHangChiTiet.getPrimaryKey(),
			donHangChiTiet);

		return donHangChiTiet;
	}

	protected DonHangChiTiet toUnwrappedModel(DonHangChiTiet donHangChiTiet) {
		if (donHangChiTiet instanceof DonHangChiTietImpl) {
			return donHangChiTiet;
		}

		DonHangChiTietImpl donHangChiTietImpl = new DonHangChiTietImpl();

		donHangChiTietImpl.setNew(donHangChiTiet.isNew());
		donHangChiTietImpl.setPrimaryKey(donHangChiTiet.getPrimaryKey());

		donHangChiTietImpl.setDonHangChiTietId(donHangChiTiet.getDonHangChiTietId());
		donHangChiTietImpl.setCompanyId(donHangChiTiet.getCompanyId());
		donHangChiTietImpl.setUserId(donHangChiTiet.getUserId());
		donHangChiTietImpl.setUserName(donHangChiTiet.getUserName());
		donHangChiTietImpl.setCreateDate(donHangChiTiet.getCreateDate());
		donHangChiTietImpl.setModifiedDate(donHangChiTiet.getModifiedDate());
		donHangChiTietImpl.setDonHangId(donHangChiTiet.getDonHangId());
		donHangChiTietImpl.setMatHangId(donHangChiTiet.getMatHangId());
		donHangChiTietImpl.setSoLuong(donHangChiTiet.getSoLuong());
		donHangChiTietImpl.setDonViTinhId(donHangChiTiet.getDonViTinhId());
		donHangChiTietImpl.setThanhTien(donHangChiTiet.getThanhTien());
		donHangChiTietImpl.setTiLeGiamGia(donHangChiTiet.getTiLeGiamGia());
		donHangChiTietImpl.setKichThuoc(donHangChiTiet.getKichThuoc());
		donHangChiTietImpl.setHanSuDung(donHangChiTiet.getHanSuDung());
		donHangChiTietImpl.setHoatDong(donHangChiTiet.isHoatDong());
		donHangChiTietImpl.setHuy(donHangChiTiet.isHuy());

		return donHangChiTietImpl;
	}

	/**
	 * Returns the don hang chi tiet with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the don hang chi tiet
	 * @return the don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDonHangChiTietException, SystemException {
		DonHangChiTiet donHangChiTiet = fetchByPrimaryKey(primaryKey);

		if (donHangChiTiet == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDonHangChiTietException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return donHangChiTiet;
	}

	/**
	 * Returns the don hang chi tiet with the primary key or throws a {@link com.minimart.portlet.banhang.NoSuchDonHangChiTietException} if it could not be found.
	 *
	 * @param donHangChiTietId the primary key of the don hang chi tiet
	 * @return the don hang chi tiet
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet findByPrimaryKey(long donHangChiTietId)
		throws NoSuchDonHangChiTietException, SystemException {
		return findByPrimaryKey((Serializable)donHangChiTietId);
	}

	/**
	 * Returns the don hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the don hang chi tiet
	 * @return the don hang chi tiet, or <code>null</code> if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DonHangChiTiet donHangChiTiet = (DonHangChiTiet)EntityCacheUtil.getResult(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
				DonHangChiTietImpl.class, primaryKey);

		if (donHangChiTiet == _nullDonHangChiTiet) {
			return null;
		}

		if (donHangChiTiet == null) {
			Session session = null;

			try {
				session = openSession();

				donHangChiTiet = (DonHangChiTiet)session.get(DonHangChiTietImpl.class,
						primaryKey);

				if (donHangChiTiet != null) {
					cacheResult(donHangChiTiet);
				}
				else {
					EntityCacheUtil.putResult(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
						DonHangChiTietImpl.class, primaryKey,
						_nullDonHangChiTiet);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DonHangChiTietModelImpl.ENTITY_CACHE_ENABLED,
					DonHangChiTietImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return donHangChiTiet;
	}

	/**
	 * Returns the don hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param donHangChiTietId the primary key of the don hang chi tiet
	 * @return the don hang chi tiet, or <code>null</code> if a don hang chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHangChiTiet fetchByPrimaryKey(long donHangChiTietId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)donHangChiTietId);
	}

	/**
	 * Returns all the don hang chi tiets.
	 *
	 * @return the don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don hang chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of don hang chi tiets
	 * @param end the upper bound of the range of don hang chi tiets (not inclusive)
	 * @return the range of don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the don hang chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of don hang chi tiets
	 * @param end the upper bound of the range of don hang chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of don hang chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHangChiTiet> findAll(int start, int end,
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

		List<DonHangChiTiet> list = (List<DonHangChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DONHANGCHITIET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DONHANGCHITIET;

				if (pagination) {
					sql = sql.concat(DonHangChiTietModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DonHangChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonHangChiTiet>(list);
				}
				else {
					list = (List<DonHangChiTiet>)QueryUtil.list(q,
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
	 * Removes all the don hang chi tiets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DonHangChiTiet donHangChiTiet : findAll()) {
			remove(donHangChiTiet);
		}
	}

	/**
	 * Returns the number of don hang chi tiets.
	 *
	 * @return the number of don hang chi tiets
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

				Query q = session.createQuery(_SQL_COUNT_DONHANGCHITIET);

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
	 * Initializes the don hang chi tiet persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.banhang.model.DonHangChiTiet")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DonHangChiTiet>> listenersList = new ArrayList<ModelListener<DonHangChiTiet>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DonHangChiTiet>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DonHangChiTietImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DONHANGCHITIET = "SELECT donHangChiTiet FROM DonHangChiTiet donHangChiTiet";
	private static final String _SQL_SELECT_DONHANGCHITIET_WHERE = "SELECT donHangChiTiet FROM DonHangChiTiet donHangChiTiet WHERE ";
	private static final String _SQL_COUNT_DONHANGCHITIET = "SELECT COUNT(donHangChiTiet) FROM DonHangChiTiet donHangChiTiet";
	private static final String _SQL_COUNT_DONHANGCHITIET_WHERE = "SELECT COUNT(donHangChiTiet) FROM DonHangChiTiet donHangChiTiet WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "donHangChiTiet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DonHangChiTiet exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DonHangChiTiet exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DonHangChiTietPersistenceImpl.class);
	private static DonHangChiTiet _nullDonHangChiTiet = new DonHangChiTietImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DonHangChiTiet> toCacheModel() {
				return _nullDonHangChiTietCacheModel;
			}
		};

	private static CacheModel<DonHangChiTiet> _nullDonHangChiTietCacheModel = new CacheModel<DonHangChiTiet>() {
			@Override
			public DonHangChiTiet toEntityModel() {
				return _nullDonHangChiTiet;
			}
		};
}