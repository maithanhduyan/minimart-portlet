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

package com.minimart.portlet.khuyenmai.service.persistence;

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

import com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException;
import com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai;
import com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiImpl;
import com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the loai hinh khuyen mai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see LoaiHinhKhuyenMaiPersistence
 * @see LoaiHinhKhuyenMaiUtil
 * @generated
 */
public class LoaiHinhKhuyenMaiPersistenceImpl extends BasePersistenceImpl<LoaiHinhKhuyenMai>
	implements LoaiHinhKhuyenMaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LoaiHinhKhuyenMaiUtil} to access the loai hinh khuyen mai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LoaiHinhKhuyenMaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiModelImpl.FINDER_CACHE_ENABLED,
			LoaiHinhKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiModelImpl.FINDER_CACHE_ENABLED,
			LoaiHinhKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_TH = new FinderPath(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiModelImpl.FINDER_CACHE_ENABLED,
			LoaiHinhKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_TH",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH =
		new FinderPath(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiModelImpl.FINDER_CACHE_ENABLED,
			LoaiHinhKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_TH",
			new String[] { String.class.getName(), Boolean.class.getName() },
			LoaiHinhKhuyenMaiModelImpl.TEN_COLUMN_BITMASK |
			LoaiHinhKhuyenMaiModelImpl.TRANGTHAI_COLUMN_BITMASK |
			LoaiHinhKhuyenMaiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_TH = new FinderPath(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_TH",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @return the matching loai hinh khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHinhKhuyenMai> findByTEN_TH(String ten, boolean trangThai)
		throws SystemException {
		return findByTEN_TH(ten, trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of loai hinh khuyen mais
	 * @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	 * @return the range of matching loai hinh khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHinhKhuyenMai> findByTEN_TH(String ten, boolean trangThai,
		int start, int end) throws SystemException {
		return findByTEN_TH(ten, trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of loai hinh khuyen mais
	 * @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching loai hinh khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHinhKhuyenMai> findByTEN_TH(String ten, boolean trangThai,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH;
			finderArgs = new Object[] { ten, trangThai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_TH;
			finderArgs = new Object[] {
					ten, trangThai,
					
					start, end, orderByComparator
				};
		}

		List<LoaiHinhKhuyenMai> list = (List<LoaiHinhKhuyenMai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LoaiHinhKhuyenMai loaiHinhKhuyenMai : list) {
				if (!Validator.equals(ten, loaiHinhKhuyenMai.getTen()) ||
						(trangThai != loaiHinhKhuyenMai.getTrangThai())) {
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

			query.append(_SQL_SELECT_LOAIHINHKHUYENMAI_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TH_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_TH_TRANGTHAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LoaiHinhKhuyenMaiModelImpl.ORDER_BY_JPQL);
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

				qPos.add(trangThai);

				if (!pagination) {
					list = (List<LoaiHinhKhuyenMai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiHinhKhuyenMai>(list);
				}
				else {
					list = (List<LoaiHinhKhuyenMai>)QueryUtil.list(q,
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
	 * Returns the first loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai hinh khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a matching loai hinh khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai findByTEN_TH_First(String ten, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHinhKhuyenMaiException, SystemException {
		LoaiHinhKhuyenMai loaiHinhKhuyenMai = fetchByTEN_TH_First(ten,
				trangThai, orderByComparator);

		if (loaiHinhKhuyenMai != null) {
			return loaiHinhKhuyenMai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHinhKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the first loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching loai hinh khuyen mai, or <code>null</code> if a matching loai hinh khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai fetchByTEN_TH_First(String ten, boolean trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		List<LoaiHinhKhuyenMai> list = findByTEN_TH(ten, trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai hinh khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a matching loai hinh khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai findByTEN_TH_Last(String ten, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHinhKhuyenMaiException, SystemException {
		LoaiHinhKhuyenMai loaiHinhKhuyenMai = fetchByTEN_TH_Last(ten,
				trangThai, orderByComparator);

		if (loaiHinhKhuyenMai != null) {
			return loaiHinhKhuyenMai;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLoaiHinhKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the last loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching loai hinh khuyen mai, or <code>null</code> if a matching loai hinh khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai fetchByTEN_TH_Last(String ten, boolean trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_TH(ten, trangThai);

		if (count == 0) {
			return null;
		}

		List<LoaiHinhKhuyenMai> list = findByTEN_TH(ten, trangThai, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the loai hinh khuyen mais before and after the current loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param loaiHinhKhuyenMaiId the primary key of the current loai hinh khuyen mai
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next loai hinh khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai[] findByTEN_TH_PrevAndNext(
		long loaiHinhKhuyenMaiId, String ten, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchLoaiHinhKhuyenMaiException, SystemException {
		LoaiHinhKhuyenMai loaiHinhKhuyenMai = findByPrimaryKey(loaiHinhKhuyenMaiId);

		Session session = null;

		try {
			session = openSession();

			LoaiHinhKhuyenMai[] array = new LoaiHinhKhuyenMaiImpl[3];

			array[0] = getByTEN_TH_PrevAndNext(session, loaiHinhKhuyenMai, ten,
					trangThai, orderByComparator, true);

			array[1] = loaiHinhKhuyenMai;

			array[2] = getByTEN_TH_PrevAndNext(session, loaiHinhKhuyenMai, ten,
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

	protected LoaiHinhKhuyenMai getByTEN_TH_PrevAndNext(Session session,
		LoaiHinhKhuyenMai loaiHinhKhuyenMai, String ten, boolean trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LOAIHINHKHUYENMAI_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_TH_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_TH_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_TH_TEN_2);
		}

		query.append(_FINDER_COLUMN_TEN_TH_TRANGTHAI_2);

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
			query.append(LoaiHinhKhuyenMaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		qPos.add(trangThai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(loaiHinhKhuyenMai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LoaiHinhKhuyenMai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_TH(String ten, boolean trangThai)
		throws SystemException {
		for (LoaiHinhKhuyenMai loaiHinhKhuyenMai : findByTEN_TH(ten, trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(loaiHinhKhuyenMai);
		}
	}

	/**
	 * Returns the number of loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @return the number of matching loai hinh khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_TH(String ten, boolean trangThai)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_TH;

		Object[] finderArgs = new Object[] { ten, trangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_LOAIHINHKHUYENMAI_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TH_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_TH_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
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

	private static final String _FINDER_COLUMN_TEN_TH_TEN_1 = "loaiHinhKhuyenMai.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_TH_TEN_2 = "loaiHinhKhuyenMai.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_TH_TEN_3 = "(loaiHinhKhuyenMai.ten IS NULL OR loaiHinhKhuyenMai.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_TH_TRANGTHAI_2 = "loaiHinhKhuyenMai.trangThai = ?";

	public LoaiHinhKhuyenMaiPersistenceImpl() {
		setModelClass(LoaiHinhKhuyenMai.class);
	}

	/**
	 * Caches the loai hinh khuyen mai in the entity cache if it is enabled.
	 *
	 * @param loaiHinhKhuyenMai the loai hinh khuyen mai
	 */
	@Override
	public void cacheResult(LoaiHinhKhuyenMai loaiHinhKhuyenMai) {
		EntityCacheUtil.putResult(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiImpl.class, loaiHinhKhuyenMai.getPrimaryKey(),
			loaiHinhKhuyenMai);

		loaiHinhKhuyenMai.resetOriginalValues();
	}

	/**
	 * Caches the loai hinh khuyen mais in the entity cache if it is enabled.
	 *
	 * @param loaiHinhKhuyenMais the loai hinh khuyen mais
	 */
	@Override
	public void cacheResult(List<LoaiHinhKhuyenMai> loaiHinhKhuyenMais) {
		for (LoaiHinhKhuyenMai loaiHinhKhuyenMai : loaiHinhKhuyenMais) {
			if (EntityCacheUtil.getResult(
						LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
						LoaiHinhKhuyenMaiImpl.class,
						loaiHinhKhuyenMai.getPrimaryKey()) == null) {
				cacheResult(loaiHinhKhuyenMai);
			}
			else {
				loaiHinhKhuyenMai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loai hinh khuyen mais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LoaiHinhKhuyenMaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LoaiHinhKhuyenMaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loai hinh khuyen mai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LoaiHinhKhuyenMai loaiHinhKhuyenMai) {
		EntityCacheUtil.removeResult(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiImpl.class, loaiHinhKhuyenMai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LoaiHinhKhuyenMai> loaiHinhKhuyenMais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LoaiHinhKhuyenMai loaiHinhKhuyenMai : loaiHinhKhuyenMais) {
			EntityCacheUtil.removeResult(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
				LoaiHinhKhuyenMaiImpl.class, loaiHinhKhuyenMai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loai hinh khuyen mai with the primary key. Does not add the loai hinh khuyen mai to the database.
	 *
	 * @param loaiHinhKhuyenMaiId the primary key for the new loai hinh khuyen mai
	 * @return the new loai hinh khuyen mai
	 */
	@Override
	public LoaiHinhKhuyenMai create(long loaiHinhKhuyenMaiId) {
		LoaiHinhKhuyenMai loaiHinhKhuyenMai = new LoaiHinhKhuyenMaiImpl();

		loaiHinhKhuyenMai.setNew(true);
		loaiHinhKhuyenMai.setPrimaryKey(loaiHinhKhuyenMaiId);

		return loaiHinhKhuyenMai;
	}

	/**
	 * Removes the loai hinh khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loaiHinhKhuyenMaiId the primary key of the loai hinh khuyen mai
	 * @return the loai hinh khuyen mai that was removed
	 * @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai remove(long loaiHinhKhuyenMaiId)
		throws NoSuchLoaiHinhKhuyenMaiException, SystemException {
		return remove((Serializable)loaiHinhKhuyenMaiId);
	}

	/**
	 * Removes the loai hinh khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loai hinh khuyen mai
	 * @return the loai hinh khuyen mai that was removed
	 * @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai remove(Serializable primaryKey)
		throws NoSuchLoaiHinhKhuyenMaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LoaiHinhKhuyenMai loaiHinhKhuyenMai = (LoaiHinhKhuyenMai)session.get(LoaiHinhKhuyenMaiImpl.class,
					primaryKey);

			if (loaiHinhKhuyenMai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLoaiHinhKhuyenMaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(loaiHinhKhuyenMai);
		}
		catch (NoSuchLoaiHinhKhuyenMaiException nsee) {
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
	protected LoaiHinhKhuyenMai removeImpl(LoaiHinhKhuyenMai loaiHinhKhuyenMai)
		throws SystemException {
		loaiHinhKhuyenMai = toUnwrappedModel(loaiHinhKhuyenMai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(loaiHinhKhuyenMai)) {
				loaiHinhKhuyenMai = (LoaiHinhKhuyenMai)session.get(LoaiHinhKhuyenMaiImpl.class,
						loaiHinhKhuyenMai.getPrimaryKeyObj());
			}

			if (loaiHinhKhuyenMai != null) {
				session.delete(loaiHinhKhuyenMai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (loaiHinhKhuyenMai != null) {
			clearCache(loaiHinhKhuyenMai);
		}

		return loaiHinhKhuyenMai;
	}

	@Override
	public LoaiHinhKhuyenMai updateImpl(
		com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai loaiHinhKhuyenMai)
		throws SystemException {
		loaiHinhKhuyenMai = toUnwrappedModel(loaiHinhKhuyenMai);

		boolean isNew = loaiHinhKhuyenMai.isNew();

		LoaiHinhKhuyenMaiModelImpl loaiHinhKhuyenMaiModelImpl = (LoaiHinhKhuyenMaiModelImpl)loaiHinhKhuyenMai;

		Session session = null;

		try {
			session = openSession();

			if (loaiHinhKhuyenMai.isNew()) {
				session.save(loaiHinhKhuyenMai);

				loaiHinhKhuyenMai.setNew(false);
			}
			else {
				session.merge(loaiHinhKhuyenMai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LoaiHinhKhuyenMaiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((loaiHinhKhuyenMaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						loaiHinhKhuyenMaiModelImpl.getOriginalTen(),
						loaiHinhKhuyenMaiModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_TH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH,
					args);

				args = new Object[] {
						loaiHinhKhuyenMaiModelImpl.getTen(),
						loaiHinhKhuyenMaiModelImpl.getTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_TH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH,
					args);
			}
		}

		EntityCacheUtil.putResult(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			LoaiHinhKhuyenMaiImpl.class, loaiHinhKhuyenMai.getPrimaryKey(),
			loaiHinhKhuyenMai);

		return loaiHinhKhuyenMai;
	}

	protected LoaiHinhKhuyenMai toUnwrappedModel(
		LoaiHinhKhuyenMai loaiHinhKhuyenMai) {
		if (loaiHinhKhuyenMai instanceof LoaiHinhKhuyenMaiImpl) {
			return loaiHinhKhuyenMai;
		}

		LoaiHinhKhuyenMaiImpl loaiHinhKhuyenMaiImpl = new LoaiHinhKhuyenMaiImpl();

		loaiHinhKhuyenMaiImpl.setNew(loaiHinhKhuyenMai.isNew());
		loaiHinhKhuyenMaiImpl.setPrimaryKey(loaiHinhKhuyenMai.getPrimaryKey());

		loaiHinhKhuyenMaiImpl.setLoaiHinhKhuyenMaiId(loaiHinhKhuyenMai.getLoaiHinhKhuyenMaiId());
		loaiHinhKhuyenMaiImpl.setCompanyId(loaiHinhKhuyenMai.getCompanyId());
		loaiHinhKhuyenMaiImpl.setUserId(loaiHinhKhuyenMai.getUserId());
		loaiHinhKhuyenMaiImpl.setUserName(loaiHinhKhuyenMai.getUserName());
		loaiHinhKhuyenMaiImpl.setCreateDate(loaiHinhKhuyenMai.getCreateDate());
		loaiHinhKhuyenMaiImpl.setModifiedDate(loaiHinhKhuyenMai.getModifiedDate());
		loaiHinhKhuyenMaiImpl.setTen(loaiHinhKhuyenMai.getTen());
		loaiHinhKhuyenMaiImpl.setTrangThai(loaiHinhKhuyenMai.isTrangThai());
		loaiHinhKhuyenMaiImpl.setTileGiamGia(loaiHinhKhuyenMai.getTileGiamGia());
		loaiHinhKhuyenMaiImpl.setNgayBatDau(loaiHinhKhuyenMai.getNgayBatDau());
		loaiHinhKhuyenMaiImpl.setNgayHetHan(loaiHinhKhuyenMai.getNgayHetHan());
		loaiHinhKhuyenMaiImpl.setImageid(loaiHinhKhuyenMai.getImageid());
		loaiHinhKhuyenMaiImpl.setGhiChu(loaiHinhKhuyenMai.getGhiChu());

		return loaiHinhKhuyenMaiImpl;
	}

	/**
	 * Returns the loai hinh khuyen mai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai hinh khuyen mai
	 * @return the loai hinh khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLoaiHinhKhuyenMaiException, SystemException {
		LoaiHinhKhuyenMai loaiHinhKhuyenMai = fetchByPrimaryKey(primaryKey);

		if (loaiHinhKhuyenMai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLoaiHinhKhuyenMaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return loaiHinhKhuyenMai;
	}

	/**
	 * Returns the loai hinh khuyen mai with the primary key or throws a {@link com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException} if it could not be found.
	 *
	 * @param loaiHinhKhuyenMaiId the primary key of the loai hinh khuyen mai
	 * @return the loai hinh khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai findByPrimaryKey(long loaiHinhKhuyenMaiId)
		throws NoSuchLoaiHinhKhuyenMaiException, SystemException {
		return findByPrimaryKey((Serializable)loaiHinhKhuyenMaiId);
	}

	/**
	 * Returns the loai hinh khuyen mai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai hinh khuyen mai
	 * @return the loai hinh khuyen mai, or <code>null</code> if a loai hinh khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LoaiHinhKhuyenMai loaiHinhKhuyenMai = (LoaiHinhKhuyenMai)EntityCacheUtil.getResult(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
				LoaiHinhKhuyenMaiImpl.class, primaryKey);

		if (loaiHinhKhuyenMai == _nullLoaiHinhKhuyenMai) {
			return null;
		}

		if (loaiHinhKhuyenMai == null) {
			Session session = null;

			try {
				session = openSession();

				loaiHinhKhuyenMai = (LoaiHinhKhuyenMai)session.get(LoaiHinhKhuyenMaiImpl.class,
						primaryKey);

				if (loaiHinhKhuyenMai != null) {
					cacheResult(loaiHinhKhuyenMai);
				}
				else {
					EntityCacheUtil.putResult(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
						LoaiHinhKhuyenMaiImpl.class, primaryKey,
						_nullLoaiHinhKhuyenMai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LoaiHinhKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
					LoaiHinhKhuyenMaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return loaiHinhKhuyenMai;
	}

	/**
	 * Returns the loai hinh khuyen mai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loaiHinhKhuyenMaiId the primary key of the loai hinh khuyen mai
	 * @return the loai hinh khuyen mai, or <code>null</code> if a loai hinh khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiHinhKhuyenMai fetchByPrimaryKey(long loaiHinhKhuyenMaiId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)loaiHinhKhuyenMaiId);
	}

	/**
	 * Returns all the loai hinh khuyen mais.
	 *
	 * @return the loai hinh khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHinhKhuyenMai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the loai hinh khuyen mais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai hinh khuyen mais
	 * @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	 * @return the range of loai hinh khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHinhKhuyenMai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the loai hinh khuyen mais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of loai hinh khuyen mais
	 * @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of loai hinh khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiHinhKhuyenMai> findAll(int start, int end,
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

		List<LoaiHinhKhuyenMai> list = (List<LoaiHinhKhuyenMai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOAIHINHKHUYENMAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOAIHINHKHUYENMAI;

				if (pagination) {
					sql = sql.concat(LoaiHinhKhuyenMaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LoaiHinhKhuyenMai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiHinhKhuyenMai>(list);
				}
				else {
					list = (List<LoaiHinhKhuyenMai>)QueryUtil.list(q,
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
	 * Removes all the loai hinh khuyen mais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LoaiHinhKhuyenMai loaiHinhKhuyenMai : findAll()) {
			remove(loaiHinhKhuyenMai);
		}
	}

	/**
	 * Returns the number of loai hinh khuyen mais.
	 *
	 * @return the number of loai hinh khuyen mais
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

				Query q = session.createQuery(_SQL_COUNT_LOAIHINHKHUYENMAI);

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
	 * Initializes the loai hinh khuyen mai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LoaiHinhKhuyenMai>> listenersList = new ArrayList<ModelListener<LoaiHinhKhuyenMai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LoaiHinhKhuyenMai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LoaiHinhKhuyenMaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOAIHINHKHUYENMAI = "SELECT loaiHinhKhuyenMai FROM LoaiHinhKhuyenMai loaiHinhKhuyenMai";
	private static final String _SQL_SELECT_LOAIHINHKHUYENMAI_WHERE = "SELECT loaiHinhKhuyenMai FROM LoaiHinhKhuyenMai loaiHinhKhuyenMai WHERE ";
	private static final String _SQL_COUNT_LOAIHINHKHUYENMAI = "SELECT COUNT(loaiHinhKhuyenMai) FROM LoaiHinhKhuyenMai loaiHinhKhuyenMai";
	private static final String _SQL_COUNT_LOAIHINHKHUYENMAI_WHERE = "SELECT COUNT(loaiHinhKhuyenMai) FROM LoaiHinhKhuyenMai loaiHinhKhuyenMai WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "loaiHinhKhuyenMai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LoaiHinhKhuyenMai exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LoaiHinhKhuyenMai exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LoaiHinhKhuyenMaiPersistenceImpl.class);
	private static LoaiHinhKhuyenMai _nullLoaiHinhKhuyenMai = new LoaiHinhKhuyenMaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LoaiHinhKhuyenMai> toCacheModel() {
				return _nullLoaiHinhKhuyenMaiCacheModel;
			}
		};

	private static CacheModel<LoaiHinhKhuyenMai> _nullLoaiHinhKhuyenMaiCacheModel =
		new CacheModel<LoaiHinhKhuyenMai>() {
			@Override
			public LoaiHinhKhuyenMai toEntityModel() {
				return _nullLoaiHinhKhuyenMai;
			}
		};
}