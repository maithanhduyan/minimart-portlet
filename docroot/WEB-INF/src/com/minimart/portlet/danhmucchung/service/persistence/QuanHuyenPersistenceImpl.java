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

import com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException;
import com.minimart.portlet.danhmucchung.model.QuanHuyen;
import com.minimart.portlet.danhmucchung.model.impl.QuanHuyenImpl;
import com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the quan huyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see QuanHuyenPersistence
 * @see QuanHuyenUtil
 * @generated
 */
public class QuanHuyenPersistenceImpl extends BasePersistenceImpl<QuanHuyen>
	implements QuanHuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QuanHuyenUtil} to access the quan huyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QuanHuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, QuanHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, QuanHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TEN = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, QuanHuyenImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTEN",
			new String[] { String.class.getName() },
			QuanHuyenModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN",
			new String[] { String.class.getName() });

	/**
	 * Returns the quan huyen where ten = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException} if it could not be found.
	 *
	 * @param ten the ten
	 * @return the matching quan huyen
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen findByTEN(String ten)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = fetchByTEN(ten);

		if (quanHuyen == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ten=");
			msg.append(ten);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQuanHuyenException(msg.toString());
		}

		return quanHuyen;
	}

	/**
	 * Returns the quan huyen where ten = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ten the ten
	 * @return the matching quan huyen, or <code>null</code> if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByTEN(String ten) throws SystemException {
		return fetchByTEN(ten, true);
	}

	/**
	 * Returns the quan huyen where ten = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ten the ten
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching quan huyen, or <code>null</code> if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByTEN(String ten, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ten };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TEN,
					finderArgs, this);
		}

		if (result instanceof QuanHuyen) {
			QuanHuyen quanHuyen = (QuanHuyen)result;

			if (!Validator.equals(ten, quanHuyen.getTen())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QUANHUYEN_WHERE);

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

				List<QuanHuyen> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
						finderArgs, list);
				}
				else {
					QuanHuyen quanHuyen = list.get(0);

					result = quanHuyen;

					cacheResult(quanHuyen);

					if ((quanHuyen.getTen() == null) ||
							!quanHuyen.getTen().equals(ten)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
							finderArgs, quanHuyen);
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
			return (QuanHuyen)result;
		}
	}

	/**
	 * Removes the quan huyen where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @return the quan huyen that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen removeByTEN(String ten)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = findByTEN(ten);

		return remove(quanHuyen);
	}

	/**
	 * Returns the number of quan huyens where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching quan huyens
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

			query.append(_SQL_COUNT_QUANHUYEN_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "quanHuyen.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "quanHuyen.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(quanHuyen.ten IS NULL OR quanHuyen.ten = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_MA = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, QuanHuyenImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMA",
			new String[] { String.class.getName() },
			QuanHuyenModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MA = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMA",
			new String[] { String.class.getName() });

	/**
	 * Returns the quan huyen where ma = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException} if it could not be found.
	 *
	 * @param ma the ma
	 * @return the matching quan huyen
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen findByMA(String ma)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = fetchByMA(ma);

		if (quanHuyen == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQuanHuyenException(msg.toString());
		}

		return quanHuyen;
	}

	/**
	 * Returns the quan huyen where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ma the ma
	 * @return the matching quan huyen, or <code>null</code> if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByMA(String ma) throws SystemException {
		return fetchByMA(ma, true);
	}

	/**
	 * Returns the quan huyen where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching quan huyen, or <code>null</code> if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByMA(String ma, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MA,
					finderArgs, this);
		}

		if (result instanceof QuanHuyen) {
			QuanHuyen quanHuyen = (QuanHuyen)result;

			if (!Validator.equals(ma, quanHuyen.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QUANHUYEN_WHERE);

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

				List<QuanHuyen> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
						finderArgs, list);
				}
				else {
					QuanHuyen quanHuyen = list.get(0);

					result = quanHuyen;

					cacheResult(quanHuyen);

					if ((quanHuyen.getMa() == null) ||
							!quanHuyen.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
							finderArgs, quanHuyen);
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
			return (QuanHuyen)result;
		}
	}

	/**
	 * Removes the quan huyen where ma = &#63; from the database.
	 *
	 * @param ma the ma
	 * @return the quan huyen that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen removeByMA(String ma)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = findByMA(ma);

		return remove(quanHuyen);
	}

	/**
	 * Returns the number of quan huyens where ma = &#63;.
	 *
	 * @param ma the ma
	 * @return the number of matching quan huyens
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

			query.append(_SQL_COUNT_QUANHUYEN_WHERE);

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

	private static final String _FINDER_COLUMN_MA_MA_1 = "quanHuyen.ma IS NULL";
	private static final String _FINDER_COLUMN_MA_MA_2 = "quanHuyen.ma = ?";
	private static final String _FINDER_COLUMN_MA_MA_3 = "(quanHuyen.ma IS NULL OR quanHuyen.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, QuanHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, QuanHuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			QuanHuyenModelImpl.TEN_COLUMN_BITMASK |
			QuanHuyenModelImpl.MA_COLUMN_BITMASK |
			QuanHuyenModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA_TT = new FinderPath(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the quan huyens where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the matching quan huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QuanHuyen> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai) throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quan huyens where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of quan huyens
	 * @param end the upper bound of the range of quan huyens (not inclusive)
	 * @return the range of matching quan huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QuanHuyen> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai, int start, int end) throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quan huyens where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of quan huyens
	 * @param end the upper bound of the range of quan huyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quan huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QuanHuyen> findByTEN_MA_TT(String ten, String ma,
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

		List<QuanHuyen> list = (List<QuanHuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QuanHuyen quanHuyen : list) {
				if (!Validator.equals(ten, quanHuyen.getTen()) ||
						!Validator.equals(ma, quanHuyen.getMa()) ||
						(trangThai != quanHuyen.getTrangThai())) {
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

			query.append(_SQL_SELECT_QUANHUYEN_WHERE);

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
				query.append(QuanHuyenModelImpl.ORDER_BY_JPQL);
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
					list = (List<QuanHuyen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QuanHuyen>(list);
				}
				else {
					list = (List<QuanHuyen>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first quan huyen in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quan huyen
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen findByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = fetchByTEN_MA_TT_First(ten, ma, trangThai,
				orderByComparator);

		if (quanHuyen != null) {
			return quanHuyen;
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

		throw new NoSuchQuanHuyenException(msg.toString());
	}

	/**
	 * Returns the first quan huyen in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quan huyen, or <code>null</code> if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		List<QuanHuyen> list = findByTEN_MA_TT(ten, ma, trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quan huyen in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quan huyen
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen findByTEN_MA_TT_Last(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = fetchByTEN_MA_TT_Last(ten, ma, trangThai,
				orderByComparator);

		if (quanHuyen != null) {
			return quanHuyen;
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

		throw new NoSuchQuanHuyenException(msg.toString());
	}

	/**
	 * Returns the last quan huyen in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quan huyen, or <code>null</code> if a matching quan huyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByTEN_MA_TT_Last(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTEN_MA_TT(ten, ma, trangThai);

		if (count == 0) {
			return null;
		}

		List<QuanHuyen> list = findByTEN_MA_TT(ten, ma, trangThai, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quan huyens before and after the current quan huyen in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param quanHuyenId the primary key of the current quan huyen
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quan huyen
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a quan huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen[] findByTEN_MA_TT_PrevAndNext(long quanHuyenId,
		String ten, String ma, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = findByPrimaryKey(quanHuyenId);

		Session session = null;

		try {
			session = openSession();

			QuanHuyen[] array = new QuanHuyenImpl[3];

			array[0] = getByTEN_MA_TT_PrevAndNext(session, quanHuyen, ten, ma,
					trangThai, orderByComparator, true);

			array[1] = quanHuyen;

			array[2] = getByTEN_MA_TT_PrevAndNext(session, quanHuyen, ten, ma,
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

	protected QuanHuyen getByTEN_MA_TT_PrevAndNext(Session session,
		QuanHuyen quanHuyen, String ten, String ma, boolean trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QUANHUYEN_WHERE);

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
			query.append(QuanHuyenModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(quanHuyen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QuanHuyen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quan huyens where ten = &#63; and ma = &#63; and trangThai = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA_TT(String ten, String ma, boolean trangThai)
		throws SystemException {
		for (QuanHuyen quanHuyen : findByTEN_MA_TT(ten, ma, trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(quanHuyen);
		}
	}

	/**
	 * Returns the number of quan huyens where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the number of matching quan huyens
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

			query.append(_SQL_COUNT_QUANHUYEN_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_1 = "quanHuyen.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_2 = "quanHuyen.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_3 = "(quanHuyen.ten IS NULL OR quanHuyen.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_1 = "quanHuyen.ma IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_2 = "quanHuyen.ma = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_3 = "(quanHuyen.ma IS NULL OR quanHuyen.ma = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TRANGTHAI_2 = "quanHuyen.trangThai = ?";

	public QuanHuyenPersistenceImpl() {
		setModelClass(QuanHuyen.class);
	}

	/**
	 * Caches the quan huyen in the entity cache if it is enabled.
	 *
	 * @param quanHuyen the quan huyen
	 */
	@Override
	public void cacheResult(QuanHuyen quanHuyen) {
		EntityCacheUtil.putResult(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenImpl.class, quanHuyen.getPrimaryKey(), quanHuyen);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
			new Object[] { quanHuyen.getTen() }, quanHuyen);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
			new Object[] { quanHuyen.getMa() }, quanHuyen);

		quanHuyen.resetOriginalValues();
	}

	/**
	 * Caches the quan huyens in the entity cache if it is enabled.
	 *
	 * @param quanHuyens the quan huyens
	 */
	@Override
	public void cacheResult(List<QuanHuyen> quanHuyens) {
		for (QuanHuyen quanHuyen : quanHuyens) {
			if (EntityCacheUtil.getResult(
						QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
						QuanHuyenImpl.class, quanHuyen.getPrimaryKey()) == null) {
				cacheResult(quanHuyen);
			}
			else {
				quanHuyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all quan huyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QuanHuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QuanHuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the quan huyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuanHuyen quanHuyen) {
		EntityCacheUtil.removeResult(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenImpl.class, quanHuyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(quanHuyen);
	}

	@Override
	public void clearCache(List<QuanHuyen> quanHuyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QuanHuyen quanHuyen : quanHuyens) {
			EntityCacheUtil.removeResult(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
				QuanHuyenImpl.class, quanHuyen.getPrimaryKey());

			clearUniqueFindersCache(quanHuyen);
		}
	}

	protected void cacheUniqueFindersCache(QuanHuyen quanHuyen) {
		if (quanHuyen.isNew()) {
			Object[] args = new Object[] { quanHuyen.getTen() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args, quanHuyen);

			args = new Object[] { quanHuyen.getMa() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args, quanHuyen);
		}
		else {
			QuanHuyenModelImpl quanHuyenModelImpl = (QuanHuyenModelImpl)quanHuyen;

			if ((quanHuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { quanHuyen.getTen() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args,
					quanHuyen);
			}

			if ((quanHuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { quanHuyen.getMa() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args,
					quanHuyen);
			}
		}
	}

	protected void clearUniqueFindersCache(QuanHuyen quanHuyen) {
		QuanHuyenModelImpl quanHuyenModelImpl = (QuanHuyenModelImpl)quanHuyen;

		Object[] args = new Object[] { quanHuyen.getTen() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);

		if ((quanHuyenModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
			args = new Object[] { quanHuyenModelImpl.getOriginalTen() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);
		}

		args = new Object[] { quanHuyen.getMa() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);

		if ((quanHuyenModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
			args = new Object[] { quanHuyenModelImpl.getOriginalMa() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);
		}
	}

	/**
	 * Creates a new quan huyen with the primary key. Does not add the quan huyen to the database.
	 *
	 * @param quanHuyenId the primary key for the new quan huyen
	 * @return the new quan huyen
	 */
	@Override
	public QuanHuyen create(long quanHuyenId) {
		QuanHuyen quanHuyen = new QuanHuyenImpl();

		quanHuyen.setNew(true);
		quanHuyen.setPrimaryKey(quanHuyenId);

		return quanHuyen;
	}

	/**
	 * Removes the quan huyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quanHuyenId the primary key of the quan huyen
	 * @return the quan huyen that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a quan huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen remove(long quanHuyenId)
		throws NoSuchQuanHuyenException, SystemException {
		return remove((Serializable)quanHuyenId);
	}

	/**
	 * Removes the quan huyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quan huyen
	 * @return the quan huyen that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a quan huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen remove(Serializable primaryKey)
		throws NoSuchQuanHuyenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QuanHuyen quanHuyen = (QuanHuyen)session.get(QuanHuyenImpl.class,
					primaryKey);

			if (quanHuyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuanHuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(quanHuyen);
		}
		catch (NoSuchQuanHuyenException nsee) {
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
	protected QuanHuyen removeImpl(QuanHuyen quanHuyen)
		throws SystemException {
		quanHuyen = toUnwrappedModel(quanHuyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quanHuyen)) {
				quanHuyen = (QuanHuyen)session.get(QuanHuyenImpl.class,
						quanHuyen.getPrimaryKeyObj());
			}

			if (quanHuyen != null) {
				session.delete(quanHuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (quanHuyen != null) {
			clearCache(quanHuyen);
		}

		return quanHuyen;
	}

	@Override
	public QuanHuyen updateImpl(
		com.minimart.portlet.danhmucchung.model.QuanHuyen quanHuyen)
		throws SystemException {
		quanHuyen = toUnwrappedModel(quanHuyen);

		boolean isNew = quanHuyen.isNew();

		QuanHuyenModelImpl quanHuyenModelImpl = (QuanHuyenModelImpl)quanHuyen;

		Session session = null;

		try {
			session = openSession();

			if (quanHuyen.isNew()) {
				session.save(quanHuyen);

				quanHuyen.setNew(false);
			}
			else {
				session.merge(quanHuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QuanHuyenModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((quanHuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						quanHuyenModelImpl.getOriginalTen(),
						quanHuyenModelImpl.getOriginalMa(),
						quanHuyenModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);

				args = new Object[] {
						quanHuyenModelImpl.getTen(), quanHuyenModelImpl.getMa(),
						quanHuyenModelImpl.getTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);
			}
		}

		EntityCacheUtil.putResult(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
			QuanHuyenImpl.class, quanHuyen.getPrimaryKey(), quanHuyen);

		clearUniqueFindersCache(quanHuyen);
		cacheUniqueFindersCache(quanHuyen);

		return quanHuyen;
	}

	protected QuanHuyen toUnwrappedModel(QuanHuyen quanHuyen) {
		if (quanHuyen instanceof QuanHuyenImpl) {
			return quanHuyen;
		}

		QuanHuyenImpl quanHuyenImpl = new QuanHuyenImpl();

		quanHuyenImpl.setNew(quanHuyen.isNew());
		quanHuyenImpl.setPrimaryKey(quanHuyen.getPrimaryKey());

		quanHuyenImpl.setQuanHuyenId(quanHuyen.getQuanHuyenId());
		quanHuyenImpl.setCompanyId(quanHuyen.getCompanyId());
		quanHuyenImpl.setUserId(quanHuyen.getUserId());
		quanHuyenImpl.setUserName(quanHuyen.getUserName());
		quanHuyenImpl.setCreateDate(quanHuyen.getCreateDate());
		quanHuyenImpl.setModifiedDate(quanHuyen.getModifiedDate());
		quanHuyenImpl.setTen(quanHuyen.getTen());
		quanHuyenImpl.setMa(quanHuyen.getMa());
		quanHuyenImpl.setTrangThai(quanHuyen.isTrangThai());

		return quanHuyenImpl;
	}

	/**
	 * Returns the quan huyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the quan huyen
	 * @return the quan huyen
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a quan huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuanHuyenException, SystemException {
		QuanHuyen quanHuyen = fetchByPrimaryKey(primaryKey);

		if (quanHuyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuanHuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return quanHuyen;
	}

	/**
	 * Returns the quan huyen with the primary key or throws a {@link com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException} if it could not be found.
	 *
	 * @param quanHuyenId the primary key of the quan huyen
	 * @return the quan huyen
	 * @throws com.minimart.portlet.danhmucchung.NoSuchQuanHuyenException if a quan huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen findByPrimaryKey(long quanHuyenId)
		throws NoSuchQuanHuyenException, SystemException {
		return findByPrimaryKey((Serializable)quanHuyenId);
	}

	/**
	 * Returns the quan huyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quan huyen
	 * @return the quan huyen, or <code>null</code> if a quan huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QuanHuyen quanHuyen = (QuanHuyen)EntityCacheUtil.getResult(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
				QuanHuyenImpl.class, primaryKey);

		if (quanHuyen == _nullQuanHuyen) {
			return null;
		}

		if (quanHuyen == null) {
			Session session = null;

			try {
				session = openSession();

				quanHuyen = (QuanHuyen)session.get(QuanHuyenImpl.class,
						primaryKey);

				if (quanHuyen != null) {
					cacheResult(quanHuyen);
				}
				else {
					EntityCacheUtil.putResult(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
						QuanHuyenImpl.class, primaryKey, _nullQuanHuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QuanHuyenModelImpl.ENTITY_CACHE_ENABLED,
					QuanHuyenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return quanHuyen;
	}

	/**
	 * Returns the quan huyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quanHuyenId the primary key of the quan huyen
	 * @return the quan huyen, or <code>null</code> if a quan huyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QuanHuyen fetchByPrimaryKey(long quanHuyenId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)quanHuyenId);
	}

	/**
	 * Returns all the quan huyens.
	 *
	 * @return the quan huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QuanHuyen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quan huyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of quan huyens
	 * @param end the upper bound of the range of quan huyens (not inclusive)
	 * @return the range of quan huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QuanHuyen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quan huyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of quan huyens
	 * @param end the upper bound of the range of quan huyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quan huyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QuanHuyen> findAll(int start, int end,
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

		List<QuanHuyen> list = (List<QuanHuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QUANHUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QUANHUYEN;

				if (pagination) {
					sql = sql.concat(QuanHuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QuanHuyen>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QuanHuyen>(list);
				}
				else {
					list = (List<QuanHuyen>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the quan huyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QuanHuyen quanHuyen : findAll()) {
			remove(quanHuyen);
		}
	}

	/**
	 * Returns the number of quan huyens.
	 *
	 * @return the number of quan huyens
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

				Query q = session.createQuery(_SQL_COUNT_QUANHUYEN);

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
	 * Initializes the quan huyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.danhmucchung.model.QuanHuyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QuanHuyen>> listenersList = new ArrayList<ModelListener<QuanHuyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QuanHuyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QuanHuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QUANHUYEN = "SELECT quanHuyen FROM QuanHuyen quanHuyen";
	private static final String _SQL_SELECT_QUANHUYEN_WHERE = "SELECT quanHuyen FROM QuanHuyen quanHuyen WHERE ";
	private static final String _SQL_COUNT_QUANHUYEN = "SELECT COUNT(quanHuyen) FROM QuanHuyen quanHuyen";
	private static final String _SQL_COUNT_QUANHUYEN_WHERE = "SELECT COUNT(quanHuyen) FROM QuanHuyen quanHuyen WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "quanHuyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QuanHuyen exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QuanHuyen exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QuanHuyenPersistenceImpl.class);
	private static QuanHuyen _nullQuanHuyen = new QuanHuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QuanHuyen> toCacheModel() {
				return _nullQuanHuyenCacheModel;
			}
		};

	private static CacheModel<QuanHuyen> _nullQuanHuyenCacheModel = new CacheModel<QuanHuyen>() {
			@Override
			public QuanHuyen toEntityModel() {
				return _nullQuanHuyen;
			}
		};
}