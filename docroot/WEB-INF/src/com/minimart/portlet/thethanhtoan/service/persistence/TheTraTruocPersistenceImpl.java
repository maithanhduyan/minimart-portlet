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

package com.minimart.portlet.thethanhtoan.service.persistence;

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
import com.liferay.portal.kernel.util.CalendarUtil;
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

import com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;
import com.minimart.portlet.thethanhtoan.model.TheTraTruoc;
import com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocImpl;
import com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the the tra truoc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TheTraTruocPersistence
 * @see TheTraTruocUtil
 * @generated
 */
public class TheTraTruocPersistenceImpl extends BasePersistenceImpl<TheTraTruoc>
	implements TheTraTruocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TheTraTruocUtil} to access the the tra truoc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TheTraTruocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAYHH = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNGAYHH",
			new String[] {
				Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH =
		new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNGAYHH",
			new String[] { Date.class.getName() },
			TheTraTruocModelImpl.NGAYHETHAN_COLUMN_BITMASK |
			TheTraTruocModelImpl.TENTHE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGAYHH = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNGAYHH",
			new String[] { Date.class.getName() });

	/**
	 * Returns all the the tra truocs where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @return the matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByNGAYHH(Date ngayHetHan)
		throws SystemException {
		return findByNGAYHH(ngayHetHan, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the the tra truocs where ngayHetHan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayHetHan the ngay het han
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @return the range of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByNGAYHH(Date ngayHetHan, int start, int end)
		throws SystemException {
		return findByNGAYHH(ngayHetHan, start, end, null);
	}

	/**
	 * Returns an ordered range of all the the tra truocs where ngayHetHan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayHetHan the ngay het han
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByNGAYHH(Date ngayHetHan, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH;
			finderArgs = new Object[] { ngayHetHan };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAYHH;
			finderArgs = new Object[] { ngayHetHan, start, end, orderByComparator };
		}

		List<TheTraTruoc> list = (List<TheTraTruoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TheTraTruoc theTraTruoc : list) {
				if (!Validator.equals(ngayHetHan, theTraTruoc.getNgayHetHan())) {
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

			query.append(_SQL_SELECT_THETRATRUOC_WHERE);

			boolean bindNgayHetHan = false;

			if (ngayHetHan == null) {
				query.append(_FINDER_COLUMN_NGAYHH_NGAYHETHAN_1);
			}
			else {
				bindNgayHetHan = true;

				query.append(_FINDER_COLUMN_NGAYHH_NGAYHETHAN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TheTraTruocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayHetHan) {
					qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
				}

				if (!pagination) {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TheTraTruoc>(list);
				}
				else {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first the tra truoc in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByNGAYHH_First(Date ngayHetHan,
		OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = fetchByNGAYHH_First(ngayHetHan,
				orderByComparator);

		if (theTraTruoc != null) {
			return theTraTruoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayHetHan=");
		msg.append(ngayHetHan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTheTraTruocException(msg.toString());
	}

	/**
	 * Returns the first the tra truoc in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByNGAYHH_First(Date ngayHetHan,
		OrderByComparator orderByComparator) throws SystemException {
		List<TheTraTruoc> list = findByNGAYHH(ngayHetHan, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last the tra truoc in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByNGAYHH_Last(Date ngayHetHan,
		OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = fetchByNGAYHH_Last(ngayHetHan,
				orderByComparator);

		if (theTraTruoc != null) {
			return theTraTruoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayHetHan=");
		msg.append(ngayHetHan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTheTraTruocException(msg.toString());
	}

	/**
	 * Returns the last the tra truoc in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByNGAYHH_Last(Date ngayHetHan,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNGAYHH(ngayHetHan);

		if (count == 0) {
			return null;
		}

		List<TheTraTruoc> list = findByNGAYHH(ngayHetHan, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the the tra truocs before and after the current the tra truoc in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param theTraTruocId the primary key of the current the tra truoc
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc[] findByNGAYHH_PrevAndNext(long theTraTruocId,
		Date ngayHetHan, OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = findByPrimaryKey(theTraTruocId);

		Session session = null;

		try {
			session = openSession();

			TheTraTruoc[] array = new TheTraTruocImpl[3];

			array[0] = getByNGAYHH_PrevAndNext(session, theTraTruoc,
					ngayHetHan, orderByComparator, true);

			array[1] = theTraTruoc;

			array[2] = getByNGAYHH_PrevAndNext(session, theTraTruoc,
					ngayHetHan, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TheTraTruoc getByNGAYHH_PrevAndNext(Session session,
		TheTraTruoc theTraTruoc, Date ngayHetHan,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THETRATRUOC_WHERE);

		boolean bindNgayHetHan = false;

		if (ngayHetHan == null) {
			query.append(_FINDER_COLUMN_NGAYHH_NGAYHETHAN_1);
		}
		else {
			bindNgayHetHan = true;

			query.append(_FINDER_COLUMN_NGAYHH_NGAYHETHAN_2);
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
			query.append(TheTraTruocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNgayHetHan) {
			qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(theTraTruoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TheTraTruoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the the tra truocs where ngayHetHan = &#63; from the database.
	 *
	 * @param ngayHetHan the ngay het han
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNGAYHH(Date ngayHetHan) throws SystemException {
		for (TheTraTruoc theTraTruoc : findByNGAYHH(ngayHetHan,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(theTraTruoc);
		}
	}

	/**
	 * Returns the number of the tra truocs where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @return the number of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNGAYHH(Date ngayHetHan) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGAYHH;

		Object[] finderArgs = new Object[] { ngayHetHan };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THETRATRUOC_WHERE);

			boolean bindNgayHetHan = false;

			if (ngayHetHan == null) {
				query.append(_FINDER_COLUMN_NGAYHH_NGAYHETHAN_1);
			}
			else {
				bindNgayHetHan = true;

				query.append(_FINDER_COLUMN_NGAYHH_NGAYHETHAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayHetHan) {
					qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
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

	private static final String _FINDER_COLUMN_NGAYHH_NGAYHETHAN_1 = "theTraTruoc.ngayHetHan IS NULL";
	private static final String _FINDER_COLUMN_NGAYHH_NGAYHETHAN_2 = "theTraTruoc.ngayHetHan = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TT = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTT",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TT = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTT",
			new String[] { String.class.getName() },
			TheTraTruocModelImpl.TRANGTHAI_COLUMN_BITMASK |
			TheTraTruocModelImpl.TENTHE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TT = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTT",
			new String[] { String.class.getName() });

	/**
	 * Returns all the the tra truocs where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByTT(String trangThai)
		throws SystemException {
		return findByTT(trangThai, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the the tra truocs where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @return the range of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByTT(String trangThai, int start, int end)
		throws SystemException {
		return findByTT(trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the the tra truocs where trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByTT(String trangThai, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TT;
			finderArgs = new Object[] { trangThai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TT;
			finderArgs = new Object[] { trangThai, start, end, orderByComparator };
		}

		List<TheTraTruoc> list = (List<TheTraTruoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TheTraTruoc theTraTruoc : list) {
				if (!Validator.equals(trangThai, theTraTruoc.getTrangThai())) {
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

			query.append(_SQL_SELECT_THETRATRUOC_WHERE);

			boolean bindTrangThai = false;

			if (trangThai == null) {
				query.append(_FINDER_COLUMN_TT_TRANGTHAI_1);
			}
			else if (trangThai.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TT_TRANGTHAI_3);
			}
			else {
				bindTrangThai = true;

				query.append(_FINDER_COLUMN_TT_TRANGTHAI_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TheTraTruocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTrangThai) {
					qPos.add(trangThai);
				}

				if (!pagination) {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TheTraTruoc>(list);
				}
				else {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first the tra truoc in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByTT_First(String trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = fetchByTT_First(trangThai, orderByComparator);

		if (theTraTruoc != null) {
			return theTraTruoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTheTraTruocException(msg.toString());
	}

	/**
	 * Returns the first the tra truoc in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByTT_First(String trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		List<TheTraTruoc> list = findByTT(trangThai, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last the tra truoc in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByTT_Last(String trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = fetchByTT_Last(trangThai, orderByComparator);

		if (theTraTruoc != null) {
			return theTraTruoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTheTraTruocException(msg.toString());
	}

	/**
	 * Returns the last the tra truoc in the ordered set where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByTT_Last(String trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTT(trangThai);

		if (count == 0) {
			return null;
		}

		List<TheTraTruoc> list = findByTT(trangThai, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the the tra truocs before and after the current the tra truoc in the ordered set where trangThai = &#63;.
	 *
	 * @param theTraTruocId the primary key of the current the tra truoc
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc[] findByTT_PrevAndNext(long theTraTruocId,
		String trangThai, OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = findByPrimaryKey(theTraTruocId);

		Session session = null;

		try {
			session = openSession();

			TheTraTruoc[] array = new TheTraTruocImpl[3];

			array[0] = getByTT_PrevAndNext(session, theTraTruoc, trangThai,
					orderByComparator, true);

			array[1] = theTraTruoc;

			array[2] = getByTT_PrevAndNext(session, theTraTruoc, trangThai,
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

	protected TheTraTruoc getByTT_PrevAndNext(Session session,
		TheTraTruoc theTraTruoc, String trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THETRATRUOC_WHERE);

		boolean bindTrangThai = false;

		if (trangThai == null) {
			query.append(_FINDER_COLUMN_TT_TRANGTHAI_1);
		}
		else if (trangThai.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TT_TRANGTHAI_3);
		}
		else {
			bindTrangThai = true;

			query.append(_FINDER_COLUMN_TT_TRANGTHAI_2);
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
			query.append(TheTraTruocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTrangThai) {
			qPos.add(trangThai);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(theTraTruoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TheTraTruoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the the tra truocs where trangThai = &#63; from the database.
	 *
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTT(String trangThai) throws SystemException {
		for (TheTraTruoc theTraTruoc : findByTT(trangThai, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(theTraTruoc);
		}
	}

	/**
	 * Returns the number of the tra truocs where trangThai = &#63;.
	 *
	 * @param trangThai the trang thai
	 * @return the number of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTT(String trangThai) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TT;

		Object[] finderArgs = new Object[] { trangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THETRATRUOC_WHERE);

			boolean bindTrangThai = false;

			if (trangThai == null) {
				query.append(_FINDER_COLUMN_TT_TRANGTHAI_1);
			}
			else if (trangThai.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TT_TRANGTHAI_3);
			}
			else {
				bindTrangThai = true;

				query.append(_FINDER_COLUMN_TT_TRANGTHAI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTrangThai) {
					qPos.add(trangThai);
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

	private static final String _FINDER_COLUMN_TT_TRANGTHAI_1 = "theTraTruoc.trangThai IS NULL";
	private static final String _FINDER_COLUMN_TT_TRANGTHAI_2 = "theTraTruoc.trangThai = ?";
	private static final String _FINDER_COLUMN_TT_TRANGTHAI_3 = "(theTraTruoc.trangThai IS NULL OR theTraTruoc.trangThai = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAYHH_KHOA =
		new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNGAYHH_KHOA",
			new String[] {
				Date.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH_KHOA =
		new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, TheTraTruocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNGAYHH_KHOA",
			new String[] { Date.class.getName(), Boolean.class.getName() },
			TheTraTruocModelImpl.NGAYHETHAN_COLUMN_BITMASK |
			TheTraTruocModelImpl.KHOA_COLUMN_BITMASK |
			TheTraTruocModelImpl.TENTHE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGAYHH_KHOA = new FinderPath(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNGAYHH_KHOA",
			new String[] { Date.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @return the matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByNGAYHH_KHOA(Date ngayHetHan, boolean khoa)
		throws SystemException {
		return findByNGAYHH_KHOA(ngayHetHan, khoa, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @return the range of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByNGAYHH_KHOA(Date ngayHetHan, boolean khoa,
		int start, int end) throws SystemException {
		return findByNGAYHH_KHOA(ngayHetHan, khoa, start, end, null);
	}

	/**
	 * Returns an ordered range of all the the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findByNGAYHH_KHOA(Date ngayHetHan, boolean khoa,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH_KHOA;
			finderArgs = new Object[] { ngayHetHan, khoa };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAYHH_KHOA;
			finderArgs = new Object[] {
					ngayHetHan, khoa,
					
					start, end, orderByComparator
				};
		}

		List<TheTraTruoc> list = (List<TheTraTruoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TheTraTruoc theTraTruoc : list) {
				if (!Validator.equals(ngayHetHan, theTraTruoc.getNgayHetHan()) ||
						(khoa != theTraTruoc.getKhoa())) {
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

			query.append(_SQL_SELECT_THETRATRUOC_WHERE);

			boolean bindNgayHetHan = false;

			if (ngayHetHan == null) {
				query.append(_FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_1);
			}
			else {
				bindNgayHetHan = true;

				query.append(_FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_2);
			}

			query.append(_FINDER_COLUMN_NGAYHH_KHOA_KHOA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TheTraTruocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayHetHan) {
					qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
				}

				qPos.add(khoa);

				if (!pagination) {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TheTraTruoc>(list);
				}
				else {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByNGAYHH_KHOA_First(Date ngayHetHan, boolean khoa,
		OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = fetchByNGAYHH_KHOA_First(ngayHetHan, khoa,
				orderByComparator);

		if (theTraTruoc != null) {
			return theTraTruoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayHetHan=");
		msg.append(ngayHetHan);

		msg.append(", khoa=");
		msg.append(khoa);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTheTraTruocException(msg.toString());
	}

	/**
	 * Returns the first the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByNGAYHH_KHOA_First(Date ngayHetHan, boolean khoa,
		OrderByComparator orderByComparator) throws SystemException {
		List<TheTraTruoc> list = findByNGAYHH_KHOA(ngayHetHan, khoa, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByNGAYHH_KHOA_Last(Date ngayHetHan, boolean khoa,
		OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = fetchByNGAYHH_KHOA_Last(ngayHetHan, khoa,
				orderByComparator);

		if (theTraTruoc != null) {
			return theTraTruoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayHetHan=");
		msg.append(ngayHetHan);

		msg.append(", khoa=");
		msg.append(khoa);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTheTraTruocException(msg.toString());
	}

	/**
	 * Returns the last the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByNGAYHH_KHOA_Last(Date ngayHetHan, boolean khoa,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNGAYHH_KHOA(ngayHetHan, khoa);

		if (count == 0) {
			return null;
		}

		List<TheTraTruoc> list = findByNGAYHH_KHOA(ngayHetHan, khoa, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the the tra truocs before and after the current the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * @param theTraTruocId the primary key of the current the tra truoc
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc[] findByNGAYHH_KHOA_PrevAndNext(long theTraTruocId,
		Date ngayHetHan, boolean khoa, OrderByComparator orderByComparator)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = findByPrimaryKey(theTraTruocId);

		Session session = null;

		try {
			session = openSession();

			TheTraTruoc[] array = new TheTraTruocImpl[3];

			array[0] = getByNGAYHH_KHOA_PrevAndNext(session, theTraTruoc,
					ngayHetHan, khoa, orderByComparator, true);

			array[1] = theTraTruoc;

			array[2] = getByNGAYHH_KHOA_PrevAndNext(session, theTraTruoc,
					ngayHetHan, khoa, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TheTraTruoc getByNGAYHH_KHOA_PrevAndNext(Session session,
		TheTraTruoc theTraTruoc, Date ngayHetHan, boolean khoa,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THETRATRUOC_WHERE);

		boolean bindNgayHetHan = false;

		if (ngayHetHan == null) {
			query.append(_FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_1);
		}
		else {
			bindNgayHetHan = true;

			query.append(_FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_2);
		}

		query.append(_FINDER_COLUMN_NGAYHH_KHOA_KHOA_2);

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
			query.append(TheTraTruocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNgayHetHan) {
			qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
		}

		qPos.add(khoa);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(theTraTruoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TheTraTruoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the the tra truocs where ngayHetHan = &#63; and khoa = &#63; from the database.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNGAYHH_KHOA(Date ngayHetHan, boolean khoa)
		throws SystemException {
		for (TheTraTruoc theTraTruoc : findByNGAYHH_KHOA(ngayHetHan, khoa,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(theTraTruoc);
		}
	}

	/**
	 * Returns the number of the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param khoa the khoa
	 * @return the number of matching the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNGAYHH_KHOA(Date ngayHetHan, boolean khoa)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGAYHH_KHOA;

		Object[] finderArgs = new Object[] { ngayHetHan, khoa };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_THETRATRUOC_WHERE);

			boolean bindNgayHetHan = false;

			if (ngayHetHan == null) {
				query.append(_FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_1);
			}
			else {
				bindNgayHetHan = true;

				query.append(_FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_2);
			}

			query.append(_FINDER_COLUMN_NGAYHH_KHOA_KHOA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayHetHan) {
					qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
				}

				qPos.add(khoa);

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

	private static final String _FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_1 = "theTraTruoc.ngayHetHan IS NULL AND ";
	private static final String _FINDER_COLUMN_NGAYHH_KHOA_NGAYHETHAN_2 = "theTraTruoc.ngayHetHan = ? AND ";
	private static final String _FINDER_COLUMN_NGAYHH_KHOA_KHOA_2 = "theTraTruoc.khoa = ?";

	public TheTraTruocPersistenceImpl() {
		setModelClass(TheTraTruoc.class);
	}

	/**
	 * Caches the the tra truoc in the entity cache if it is enabled.
	 *
	 * @param theTraTruoc the the tra truoc
	 */
	@Override
	public void cacheResult(TheTraTruoc theTraTruoc) {
		EntityCacheUtil.putResult(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocImpl.class, theTraTruoc.getPrimaryKey(), theTraTruoc);

		theTraTruoc.resetOriginalValues();
	}

	/**
	 * Caches the the tra truocs in the entity cache if it is enabled.
	 *
	 * @param theTraTruocs the the tra truocs
	 */
	@Override
	public void cacheResult(List<TheTraTruoc> theTraTruocs) {
		for (TheTraTruoc theTraTruoc : theTraTruocs) {
			if (EntityCacheUtil.getResult(
						TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
						TheTraTruocImpl.class, theTraTruoc.getPrimaryKey()) == null) {
				cacheResult(theTraTruoc);
			}
			else {
				theTraTruoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all the tra truocs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TheTraTruocImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TheTraTruocImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the the tra truoc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TheTraTruoc theTraTruoc) {
		EntityCacheUtil.removeResult(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocImpl.class, theTraTruoc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TheTraTruoc> theTraTruocs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TheTraTruoc theTraTruoc : theTraTruocs) {
			EntityCacheUtil.removeResult(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
				TheTraTruocImpl.class, theTraTruoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new the tra truoc with the primary key. Does not add the the tra truoc to the database.
	 *
	 * @param theTraTruocId the primary key for the new the tra truoc
	 * @return the new the tra truoc
	 */
	@Override
	public TheTraTruoc create(long theTraTruocId) {
		TheTraTruoc theTraTruoc = new TheTraTruocImpl();

		theTraTruoc.setNew(true);
		theTraTruoc.setPrimaryKey(theTraTruocId);

		return theTraTruoc;
	}

	/**
	 * Removes the the tra truoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param theTraTruocId the primary key of the the tra truoc
	 * @return the the tra truoc that was removed
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc remove(long theTraTruocId)
		throws NoSuchTheTraTruocException, SystemException {
		return remove((Serializable)theTraTruocId);
	}

	/**
	 * Removes the the tra truoc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the the tra truoc
	 * @return the the tra truoc that was removed
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc remove(Serializable primaryKey)
		throws NoSuchTheTraTruocException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TheTraTruoc theTraTruoc = (TheTraTruoc)session.get(TheTraTruocImpl.class,
					primaryKey);

			if (theTraTruoc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTheTraTruocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(theTraTruoc);
		}
		catch (NoSuchTheTraTruocException nsee) {
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
	protected TheTraTruoc removeImpl(TheTraTruoc theTraTruoc)
		throws SystemException {
		theTraTruoc = toUnwrappedModel(theTraTruoc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(theTraTruoc)) {
				theTraTruoc = (TheTraTruoc)session.get(TheTraTruocImpl.class,
						theTraTruoc.getPrimaryKeyObj());
			}

			if (theTraTruoc != null) {
				session.delete(theTraTruoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (theTraTruoc != null) {
			clearCache(theTraTruoc);
		}

		return theTraTruoc;
	}

	@Override
	public TheTraTruoc updateImpl(
		com.minimart.portlet.thethanhtoan.model.TheTraTruoc theTraTruoc)
		throws SystemException {
		theTraTruoc = toUnwrappedModel(theTraTruoc);

		boolean isNew = theTraTruoc.isNew();

		TheTraTruocModelImpl theTraTruocModelImpl = (TheTraTruocModelImpl)theTraTruoc;

		Session session = null;

		try {
			session = openSession();

			if (theTraTruoc.isNew()) {
				session.save(theTraTruoc);

				theTraTruoc.setNew(false);
			}
			else {
				session.merge(theTraTruoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TheTraTruocModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((theTraTruocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						theTraTruocModelImpl.getOriginalNgayHetHan()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAYHH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH,
					args);

				args = new Object[] { theTraTruocModelImpl.getNgayHetHan() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAYHH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH,
					args);
			}

			if ((theTraTruocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						theTraTruocModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TT,
					args);

				args = new Object[] { theTraTruocModelImpl.getTrangThai() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TT,
					args);
			}

			if ((theTraTruocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH_KHOA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						theTraTruocModelImpl.getOriginalNgayHetHan(),
						theTraTruocModelImpl.getOriginalKhoa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAYHH_KHOA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH_KHOA,
					args);

				args = new Object[] {
						theTraTruocModelImpl.getNgayHetHan(),
						theTraTruocModelImpl.getKhoa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAYHH_KHOA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAYHH_KHOA,
					args);
			}
		}

		EntityCacheUtil.putResult(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
			TheTraTruocImpl.class, theTraTruoc.getPrimaryKey(), theTraTruoc);

		return theTraTruoc;
	}

	protected TheTraTruoc toUnwrappedModel(TheTraTruoc theTraTruoc) {
		if (theTraTruoc instanceof TheTraTruocImpl) {
			return theTraTruoc;
		}

		TheTraTruocImpl theTraTruocImpl = new TheTraTruocImpl();

		theTraTruocImpl.setNew(theTraTruoc.isNew());
		theTraTruocImpl.setPrimaryKey(theTraTruoc.getPrimaryKey());

		theTraTruocImpl.setTheTraTruocId(theTraTruoc.getTheTraTruocId());
		theTraTruocImpl.setCompanyId(theTraTruoc.getCompanyId());
		theTraTruocImpl.setUserId(theTraTruoc.getUserId());
		theTraTruocImpl.setUserName(theTraTruoc.getUserName());
		theTraTruocImpl.setCreateDate(theTraTruoc.getCreateDate());
		theTraTruocImpl.setModifiedDate(theTraTruoc.getModifiedDate());
		theTraTruocImpl.setTenThe(theTraTruoc.getTenThe());
		theTraTruocImpl.setNhomTheTraTruocId(theTraTruoc.getNhomTheTraTruocId());
		theTraTruocImpl.setKhoa(theTraTruoc.isKhoa());
		theTraTruocImpl.setNgayHetHan(theTraTruoc.getNgayHetHan());
		theTraTruocImpl.setTrangThai(theTraTruoc.getTrangThai());
		theTraTruocImpl.setUserModifiledId(theTraTruoc.getUserModifiledId());

		return theTraTruocImpl;
	}

	/**
	 * Returns the the tra truoc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the the tra truoc
	 * @return the the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTheTraTruocException, SystemException {
		TheTraTruoc theTraTruoc = fetchByPrimaryKey(primaryKey);

		if (theTraTruoc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTheTraTruocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return theTraTruoc;
	}

	/**
	 * Returns the the tra truoc with the primary key or throws a {@link com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException} if it could not be found.
	 *
	 * @param theTraTruocId the primary key of the the tra truoc
	 * @return the the tra truoc
	 * @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc findByPrimaryKey(long theTraTruocId)
		throws NoSuchTheTraTruocException, SystemException {
		return findByPrimaryKey((Serializable)theTraTruocId);
	}

	/**
	 * Returns the the tra truoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the the tra truoc
	 * @return the the tra truoc, or <code>null</code> if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TheTraTruoc theTraTruoc = (TheTraTruoc)EntityCacheUtil.getResult(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
				TheTraTruocImpl.class, primaryKey);

		if (theTraTruoc == _nullTheTraTruoc) {
			return null;
		}

		if (theTraTruoc == null) {
			Session session = null;

			try {
				session = openSession();

				theTraTruoc = (TheTraTruoc)session.get(TheTraTruocImpl.class,
						primaryKey);

				if (theTraTruoc != null) {
					cacheResult(theTraTruoc);
				}
				else {
					EntityCacheUtil.putResult(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
						TheTraTruocImpl.class, primaryKey, _nullTheTraTruoc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TheTraTruocModelImpl.ENTITY_CACHE_ENABLED,
					TheTraTruocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return theTraTruoc;
	}

	/**
	 * Returns the the tra truoc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param theTraTruocId the primary key of the the tra truoc
	 * @return the the tra truoc, or <code>null</code> if a the tra truoc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TheTraTruoc fetchByPrimaryKey(long theTraTruocId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)theTraTruocId);
	}

	/**
	 * Returns all the the tra truocs.
	 *
	 * @return the the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the the tra truocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @return the range of the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the the tra truocs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of the tra truocs
	 * @param end the upper bound of the range of the tra truocs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of the tra truocs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TheTraTruoc> findAll(int start, int end,
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

		List<TheTraTruoc> list = (List<TheTraTruoc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THETRATRUOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THETRATRUOC;

				if (pagination) {
					sql = sql.concat(TheTraTruocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TheTraTruoc>(list);
				}
				else {
					list = (List<TheTraTruoc>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the the tra truocs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TheTraTruoc theTraTruoc : findAll()) {
			remove(theTraTruoc);
		}
	}

	/**
	 * Returns the number of the tra truocs.
	 *
	 * @return the number of the tra truocs
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

				Query q = session.createQuery(_SQL_COUNT_THETRATRUOC);

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
	 * Initializes the the tra truoc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.thethanhtoan.model.TheTraTruoc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TheTraTruoc>> listenersList = new ArrayList<ModelListener<TheTraTruoc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TheTraTruoc>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TheTraTruocImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THETRATRUOC = "SELECT theTraTruoc FROM TheTraTruoc theTraTruoc";
	private static final String _SQL_SELECT_THETRATRUOC_WHERE = "SELECT theTraTruoc FROM TheTraTruoc theTraTruoc WHERE ";
	private static final String _SQL_COUNT_THETRATRUOC = "SELECT COUNT(theTraTruoc) FROM TheTraTruoc theTraTruoc";
	private static final String _SQL_COUNT_THETRATRUOC_WHERE = "SELECT COUNT(theTraTruoc) FROM TheTraTruoc theTraTruoc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "theTraTruoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TheTraTruoc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TheTraTruoc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TheTraTruocPersistenceImpl.class);
	private static TheTraTruoc _nullTheTraTruoc = new TheTraTruocImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TheTraTruoc> toCacheModel() {
				return _nullTheTraTruocCacheModel;
			}
		};

	private static CacheModel<TheTraTruoc> _nullTheTraTruocCacheModel = new CacheModel<TheTraTruoc>() {
			@Override
			public TheTraTruoc toEntityModel() {
				return _nullTheTraTruoc;
			}
		};
}