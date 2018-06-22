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

package com.minimart.portlet.danhmucchung.service.persistence;

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

import com.minimart.portlet.danhmucchung.NoSuchDuongException;
import com.minimart.portlet.danhmucchung.model.Duong;
import com.minimart.portlet.danhmucchung.model.impl.DuongImpl;
import com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the duong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DuongPersistence
 * @see DuongUtil
 * @generated
 */
public class DuongPersistenceImpl extends BasePersistenceImpl<Duong>
	implements DuongPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DuongUtil} to access the duong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DuongImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, DuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, DuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TEN = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, DuongImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTEN",
			new String[] { String.class.getName() },
			DuongModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN",
			new String[] { String.class.getName() });

	/**
	 * Returns the duong where ten = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchDuongException} if it could not be found.
	 *
	 * @param ten the ten
	 * @return the matching duong
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong findByTEN(String ten)
		throws NoSuchDuongException, SystemException {
		Duong duong = fetchByTEN(ten);

		if (duong == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ten=");
			msg.append(ten);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDuongException(msg.toString());
		}

		return duong;
	}

	/**
	 * Returns the duong where ten = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ten the ten
	 * @return the matching duong, or <code>null</code> if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByTEN(String ten) throws SystemException {
		return fetchByTEN(ten, true);
	}

	/**
	 * Returns the duong where ten = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ten the ten
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching duong, or <code>null</code> if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByTEN(String ten, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ten };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TEN,
					finderArgs, this);
		}

		if (result instanceof Duong) {
			Duong duong = (Duong)result;

			if (!Validator.equals(ten, duong.getTen())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DUONG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TEN_2);
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

				List<Duong> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
						finderArgs, list);
				}
				else {
					Duong duong = list.get(0);

					result = duong;

					cacheResult(duong);

					if ((duong.getTen() == null) ||
							!duong.getTen().equals(ten)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
							finderArgs, duong);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Duong)result;
		}
	}

	/**
	 * Removes the duong where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @return the duong that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong removeByTEN(String ten)
		throws NoSuchDuongException, SystemException {
		Duong duong = findByTEN(ten);

		return remove(duong);
	}

	/**
	 * Returns the number of duongs where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN(String ten) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN;

		Object[] finderArgs = new Object[] { ten };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DUONG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TEN_2);
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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "duong.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "duong.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(duong.ten IS NULL OR duong.ten = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_MA = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, DuongImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMA",
			new String[] { String.class.getName() },
			DuongModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MA = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMA",
			new String[] { String.class.getName() });

	/**
	 * Returns the duong where ma = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchDuongException} if it could not be found.
	 *
	 * @param ma the ma
	 * @return the matching duong
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong findByMA(String ma)
		throws NoSuchDuongException, SystemException {
		Duong duong = fetchByMA(ma);

		if (duong == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDuongException(msg.toString());
		}

		return duong;
	}

	/**
	 * Returns the duong where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ma the ma
	 * @return the matching duong, or <code>null</code> if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByMA(String ma) throws SystemException {
		return fetchByMA(ma, true);
	}

	/**
	 * Returns the duong where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching duong, or <code>null</code> if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByMA(String ma, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MA,
					finderArgs, this);
		}

		if (result instanceof Duong) {
			Duong duong = (Duong)result;

			if (!Validator.equals(ma, duong.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DUONG_WHERE);

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_MA_MA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMa) {
					qPos.add(ma);
				}

				List<Duong> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
						finderArgs, list);
				}
				else {
					Duong duong = list.get(0);

					result = duong;

					cacheResult(duong);

					if ((duong.getMa() == null) || !duong.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
							finderArgs, duong);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Duong)result;
		}
	}

	/**
	 * Removes the duong where ma = &#63; from the database.
	 *
	 * @param ma the ma
	 * @return the duong that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong removeByMA(String ma)
		throws NoSuchDuongException, SystemException {
		Duong duong = findByMA(ma);

		return remove(duong);
	}

	/**
	 * Returns the number of duongs where ma = &#63;.
	 *
	 * @param ma the ma
	 * @return the number of matching duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMA(String ma) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MA;

		Object[] finderArgs = new Object[] { ma };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DUONG_WHERE);

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_MA_MA_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMa) {
					qPos.add(ma);
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

	private static final String _FINDER_COLUMN_MA_MA_1 = "duong.ma IS NULL";
	private static final String _FINDER_COLUMN_MA_MA_2 = "duong.ma = ?";
	private static final String _FINDER_COLUMN_MA_MA_3 = "(duong.ma IS NULL OR duong.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, DuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, DuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			DuongModelImpl.TEN_COLUMN_BITMASK |
			DuongModelImpl.MA_COLUMN_BITMASK |
			DuongModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA_TT = new FinderPath(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the matching duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Duong> findByTEN_MA_TT(String ten, String ma, boolean trangThai)
		throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of duongs
	 * @param end the upper bound of the range of duongs (not inclusive)
	 * @return the range of matching duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Duong> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai, int start, int end) throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of duongs
	 * @param end the upper bound of the range of duongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Duong> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT;
			finderArgs = new Object[] { ten, ma, trangThai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_TT;
			finderArgs = new Object[] {
					ten, ma, trangThai,
					
					start, end, orderByComparator
				};
		}

		List<Duong> list = (List<Duong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Duong duong : list) {
				if (!Validator.equals(ten, duong.getTen()) ||
						!Validator.equals(ma, duong.getMa()) ||
						(trangThai != duong.getTrangThai())) {
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

			query.append(_SQL_SELECT_DUONG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_2);
			}

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_TEN_MA_TT_MA_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_TT_TRANGTHAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DuongModelImpl.ORDER_BY_JPQL);
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

				if (bindMa) {
					qPos.add(ma);
				}

				qPos.add(trangThai);

				if (!pagination) {
					list = (List<Duong>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Duong>(list);
				}
				else {
					list = (List<Duong>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching duong
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong findByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchDuongException, SystemException {
		Duong duong = fetchByTEN_MA_TT_First(ten, ma, trangThai,
				orderByComparator);

		if (duong != null) {
			return duong;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ma=");
		msg.append(ma);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDuongException(msg.toString());
	}

	/**
	 * Returns the first duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching duong, or <code>null</code> if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		List<Duong> list = findByTEN_MA_TT(ten, ma, trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching duong
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong findByTEN_MA_TT_Last(String ten, String ma, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchDuongException, SystemException {
		Duong duong = fetchByTEN_MA_TT_Last(ten, ma, trangThai,
				orderByComparator);

		if (duong != null) {
			return duong;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ma=");
		msg.append(ma);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDuongException(msg.toString());
	}

	/**
	 * Returns the last duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching duong, or <code>null</code> if a matching duong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByTEN_MA_TT_Last(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTEN_MA_TT(ten, ma, trangThai);

		if (count == 0) {
			return null;
		}

		List<Duong> list = findByTEN_MA_TT(ten, ma, trangThai, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the duongs before and after the current duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param duongId the primary key of the current duong
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next duong
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong[] findByTEN_MA_TT_PrevAndNext(long duongId, String ten,
		String ma, boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchDuongException, SystemException {
		Duong duong = findByPrimaryKey(duongId);

		Session session = null;

		try {
			session = openSession();

			Duong[] array = new DuongImpl[3];

			array[0] = getByTEN_MA_TT_PrevAndNext(session, duong, ten, ma,
					trangThai, orderByComparator, true);

			array[1] = duong;

			array[2] = getByTEN_MA_TT_PrevAndNext(session, duong, ten, ma,
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

	protected Duong getByTEN_MA_TT_PrevAndNext(Session session, Duong duong,
		String ten, String ma, boolean trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DUONG_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_2);
		}

		boolean bindMa = false;

		if (ma == null) {
			query.append(_FINDER_COLUMN_TEN_MA_TT_MA_1);
		}
		else if (ma.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_TT_MA_3);
		}
		else {
			bindMa = true;

			query.append(_FINDER_COLUMN_TEN_MA_TT_MA_2);
		}

		query.append(_FINDER_COLUMN_TEN_MA_TT_TRANGTHAI_2);

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
			query.append(DuongModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		if (bindMa) {
			qPos.add(ma);
		}

		qPos.add(trangThai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(duong);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Duong> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA_TT(String ten, String ma, boolean trangThai)
		throws SystemException {
		for (Duong duong : findByTEN_MA_TT(ten, ma, trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(duong);
		}
	}

	/**
	 * Returns the number of duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the number of matching duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_MA_TT(String ten, String ma, boolean trangThai)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_MA_TT;

		Object[] finderArgs = new Object[] { ten, ma, trangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DUONG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_MA_TT_TEN_2);
			}

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TT_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_TEN_MA_TT_MA_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_TT_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				if (bindMa) {
					qPos.add(ma);
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

	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_1 = "duong.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_2 = "duong.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_3 = "(duong.ten IS NULL OR duong.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_1 = "duong.ma IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_2 = "duong.ma = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_3 = "(duong.ma IS NULL OR duong.ma = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TRANGTHAI_2 = "duong.trangThai = ?";

	public DuongPersistenceImpl() {
		setModelClass(Duong.class);
	}

	/**
	 * Caches the duong in the entity cache if it is enabled.
	 *
	 * @param duong the duong
	 */
	@Override
	public void cacheResult(Duong duong) {
		EntityCacheUtil.putResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongImpl.class, duong.getPrimaryKey(), duong);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
			new Object[] { duong.getTen() }, duong);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
			new Object[] { duong.getMa() }, duong);

		duong.resetOriginalValues();
	}

	/**
	 * Caches the duongs in the entity cache if it is enabled.
	 *
	 * @param duongs the duongs
	 */
	@Override
	public void cacheResult(List<Duong> duongs) {
		for (Duong duong : duongs) {
			if (EntityCacheUtil.getResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
						DuongImpl.class, duong.getPrimaryKey()) == null) {
				cacheResult(duong);
			}
			else {
				duong.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all duongs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DuongImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DuongImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the duong.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Duong duong) {
		EntityCacheUtil.removeResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongImpl.class, duong.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(duong);
	}

	@Override
	public void clearCache(List<Duong> duongs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Duong duong : duongs) {
			EntityCacheUtil.removeResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
				DuongImpl.class, duong.getPrimaryKey());

			clearUniqueFindersCache(duong);
		}
	}

	protected void cacheUniqueFindersCache(Duong duong) {
		if (duong.isNew()) {
			Object[] args = new Object[] { duong.getTen() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args, duong);

			args = new Object[] { duong.getMa() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args, duong);
		}
		else {
			DuongModelImpl duongModelImpl = (DuongModelImpl)duong;

			if ((duongModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { duong.getTen() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args, duong);
			}

			if ((duongModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { duong.getMa() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args, duong);
			}
		}
	}

	protected void clearUniqueFindersCache(Duong duong) {
		DuongModelImpl duongModelImpl = (DuongModelImpl)duong;

		Object[] args = new Object[] { duong.getTen() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);

		if ((duongModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
			args = new Object[] { duongModelImpl.getOriginalTen() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);
		}

		args = new Object[] { duong.getMa() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);

		if ((duongModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
			args = new Object[] { duongModelImpl.getOriginalMa() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);
		}
	}

	/**
	 * Creates a new duong with the primary key. Does not add the duong to the database.
	 *
	 * @param duongId the primary key for the new duong
	 * @return the new duong
	 */
	@Override
	public Duong create(long duongId) {
		Duong duong = new DuongImpl();

		duong.setNew(true);
		duong.setPrimaryKey(duongId);

		return duong;
	}

	/**
	 * Removes the duong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param duongId the primary key of the duong
	 * @return the duong that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong remove(long duongId)
		throws NoSuchDuongException, SystemException {
		return remove((Serializable)duongId);
	}

	/**
	 * Removes the duong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the duong
	 * @return the duong that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong remove(Serializable primaryKey)
		throws NoSuchDuongException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Duong duong = (Duong)session.get(DuongImpl.class, primaryKey);

			if (duong == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDuongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(duong);
		}
		catch (NoSuchDuongException nsee) {
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
	protected Duong removeImpl(Duong duong) throws SystemException {
		duong = toUnwrappedModel(duong);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(duong)) {
				duong = (Duong)session.get(DuongImpl.class,
						duong.getPrimaryKeyObj());
			}

			if (duong != null) {
				session.delete(duong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (duong != null) {
			clearCache(duong);
		}

		return duong;
	}

	@Override
	public Duong updateImpl(com.minimart.portlet.danhmucchung.model.Duong duong)
		throws SystemException {
		duong = toUnwrappedModel(duong);

		boolean isNew = duong.isNew();

		DuongModelImpl duongModelImpl = (DuongModelImpl)duong;

		Session session = null;

		try {
			session = openSession();

			if (duong.isNew()) {
				session.save(duong);

				duong.setNew(false);
			}
			else {
				session.merge(duong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DuongModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((duongModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						duongModelImpl.getOriginalTen(),
						duongModelImpl.getOriginalMa(),
						duongModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);

				args = new Object[] {
						duongModelImpl.getTen(), duongModelImpl.getMa(),
						duongModelImpl.getTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);
			}
		}

		EntityCacheUtil.putResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
			DuongImpl.class, duong.getPrimaryKey(), duong);

		clearUniqueFindersCache(duong);
		cacheUniqueFindersCache(duong);

		return duong;
	}

	protected Duong toUnwrappedModel(Duong duong) {
		if (duong instanceof DuongImpl) {
			return duong;
		}

		DuongImpl duongImpl = new DuongImpl();

		duongImpl.setNew(duong.isNew());
		duongImpl.setPrimaryKey(duong.getPrimaryKey());

		duongImpl.setDuongId(duong.getDuongId());
		duongImpl.setCompanyId(duong.getCompanyId());
		duongImpl.setUserId(duong.getUserId());
		duongImpl.setUserName(duong.getUserName());
		duongImpl.setCreateDate(duong.getCreateDate());
		duongImpl.setModifiedDate(duong.getModifiedDate());
		duongImpl.setTen(duong.getTen());
		duongImpl.setMa(duong.getMa());
		duongImpl.setTrangThai(duong.isTrangThai());

		return duongImpl;
	}

	/**
	 * Returns the duong with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the duong
	 * @return the duong
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDuongException, SystemException {
		Duong duong = fetchByPrimaryKey(primaryKey);

		if (duong == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDuongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return duong;
	}

	/**
	 * Returns the duong with the primary key or throws a {@link com.minimart.portlet.danhmucchung.NoSuchDuongException} if it could not be found.
	 *
	 * @param duongId the primary key of the duong
	 * @return the duong
	 * @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong findByPrimaryKey(long duongId)
		throws NoSuchDuongException, SystemException {
		return findByPrimaryKey((Serializable)duongId);
	}

	/**
	 * Returns the duong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the duong
	 * @return the duong, or <code>null</code> if a duong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Duong duong = (Duong)EntityCacheUtil.getResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
				DuongImpl.class, primaryKey);

		if (duong == _nullDuong) {
			return null;
		}

		if (duong == null) {
			Session session = null;

			try {
				session = openSession();

				duong = (Duong)session.get(DuongImpl.class, primaryKey);

				if (duong != null) {
					cacheResult(duong);
				}
				else {
					EntityCacheUtil.putResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
						DuongImpl.class, primaryKey, _nullDuong);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DuongModelImpl.ENTITY_CACHE_ENABLED,
					DuongImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return duong;
	}

	/**
	 * Returns the duong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param duongId the primary key of the duong
	 * @return the duong, or <code>null</code> if a duong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Duong fetchByPrimaryKey(long duongId) throws SystemException {
		return fetchByPrimaryKey((Serializable)duongId);
	}

	/**
	 * Returns all the duongs.
	 *
	 * @return the duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Duong> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the duongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of duongs
	 * @param end the upper bound of the range of duongs (not inclusive)
	 * @return the range of duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Duong> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the duongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of duongs
	 * @param end the upper bound of the range of duongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of duongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Duong> findAll(int start, int end,
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

		List<Duong> list = (List<Duong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DUONG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DUONG;

				if (pagination) {
					sql = sql.concat(DuongModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Duong>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Duong>(list);
				}
				else {
					list = (List<Duong>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the duongs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Duong duong : findAll()) {
			remove(duong);
		}
	}

	/**
	 * Returns the number of duongs.
	 *
	 * @return the number of duongs
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

				Query q = session.createQuery(_SQL_COUNT_DUONG);

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
	 * Initializes the duong persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.danhmucchung.model.Duong")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Duong>> listenersList = new ArrayList<ModelListener<Duong>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Duong>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DuongImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DUONG = "SELECT duong FROM Duong duong";
	private static final String _SQL_SELECT_DUONG_WHERE = "SELECT duong FROM Duong duong WHERE ";
	private static final String _SQL_COUNT_DUONG = "SELECT COUNT(duong) FROM Duong duong";
	private static final String _SQL_COUNT_DUONG_WHERE = "SELECT COUNT(duong) FROM Duong duong WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "duong.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Duong exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Duong exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DuongPersistenceImpl.class);
	private static Duong _nullDuong = new DuongImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Duong> toCacheModel() {
				return _nullDuongCacheModel;
			}
		};

	private static CacheModel<Duong> _nullDuongCacheModel = new CacheModel<Duong>() {
			@Override
			public Duong toEntityModel() {
				return _nullDuong;
			}
		};
}