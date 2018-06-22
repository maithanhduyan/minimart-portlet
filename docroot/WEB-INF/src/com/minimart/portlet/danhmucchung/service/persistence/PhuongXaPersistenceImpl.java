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

import com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;
import com.minimart.portlet.danhmucchung.model.PhuongXa;
import com.minimart.portlet.danhmucchung.model.impl.PhuongXaImpl;
import com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the phuong xa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see PhuongXaPersistence
 * @see PhuongXaUtil
 * @generated
 */
public class PhuongXaPersistenceImpl extends BasePersistenceImpl<PhuongXa>
	implements PhuongXaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PhuongXaUtil} to access the phuong xa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PhuongXaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, PhuongXaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, PhuongXaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TEN = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, PhuongXaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTEN",
			new String[] { String.class.getName() },
			PhuongXaModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN",
			new String[] { String.class.getName() });

	/**
	 * Returns the phuong xa where ten = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchPhuongXaException} if it could not be found.
	 *
	 * @param ten the ten
	 * @return the matching phuong xa
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa findByTEN(String ten)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = fetchByTEN(ten);

		if (phuongXa == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ten=");
			msg.append(ten);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPhuongXaException(msg.toString());
		}

		return phuongXa;
	}

	/**
	 * Returns the phuong xa where ten = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ten the ten
	 * @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByTEN(String ten) throws SystemException {
		return fetchByTEN(ten, true);
	}

	/**
	 * Returns the phuong xa where ten = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ten the ten
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByTEN(String ten, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ten };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TEN,
					finderArgs, this);
		}

		if (result instanceof PhuongXa) {
			PhuongXa phuongXa = (PhuongXa)result;

			if (!Validator.equals(ten, phuongXa.getTen())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PHUONGXA_WHERE);

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

				List<PhuongXa> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
						finderArgs, list);
				}
				else {
					PhuongXa phuongXa = list.get(0);

					result = phuongXa;

					cacheResult(phuongXa);

					if ((phuongXa.getTen() == null) ||
							!phuongXa.getTen().equals(ten)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
							finderArgs, phuongXa);
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
			return (PhuongXa)result;
		}
	}

	/**
	 * Removes the phuong xa where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @return the phuong xa that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa removeByTEN(String ten)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = findByTEN(ten);

		return remove(phuongXa);
	}

	/**
	 * Returns the number of phuong xas where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching phuong xas
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

			query.append(_SQL_COUNT_PHUONGXA_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "phuongXa.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "phuongXa.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(phuongXa.ten IS NULL OR phuongXa.ten = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_MA = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, PhuongXaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMA",
			new String[] { String.class.getName() },
			PhuongXaModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MA = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMA",
			new String[] { String.class.getName() });

	/**
	 * Returns the phuong xa where ma = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchPhuongXaException} if it could not be found.
	 *
	 * @param ma the ma
	 * @return the matching phuong xa
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa findByMA(String ma)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = fetchByMA(ma);

		if (phuongXa == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPhuongXaException(msg.toString());
		}

		return phuongXa;
	}

	/**
	 * Returns the phuong xa where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ma the ma
	 * @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByMA(String ma) throws SystemException {
		return fetchByMA(ma, true);
	}

	/**
	 * Returns the phuong xa where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByMA(String ma, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MA,
					finderArgs, this);
		}

		if (result instanceof PhuongXa) {
			PhuongXa phuongXa = (PhuongXa)result;

			if (!Validator.equals(ma, phuongXa.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PHUONGXA_WHERE);

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

				List<PhuongXa> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
						finderArgs, list);
				}
				else {
					PhuongXa phuongXa = list.get(0);

					result = phuongXa;

					cacheResult(phuongXa);

					if ((phuongXa.getMa() == null) ||
							!phuongXa.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
							finderArgs, phuongXa);
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
			return (PhuongXa)result;
		}
	}

	/**
	 * Removes the phuong xa where ma = &#63; from the database.
	 *
	 * @param ma the ma
	 * @return the phuong xa that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa removeByMA(String ma)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = findByMA(ma);

		return remove(phuongXa);
	}

	/**
	 * Returns the number of phuong xas where ma = &#63;.
	 *
	 * @param ma the ma
	 * @return the number of matching phuong xas
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

			query.append(_SQL_COUNT_PHUONGXA_WHERE);

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

	private static final String _FINDER_COLUMN_MA_MA_1 = "phuongXa.ma IS NULL";
	private static final String _FINDER_COLUMN_MA_MA_2 = "phuongXa.ma = ?";
	private static final String _FINDER_COLUMN_MA_MA_3 = "(phuongXa.ma IS NULL OR phuongXa.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, PhuongXaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, PhuongXaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			PhuongXaModelImpl.TEN_COLUMN_BITMASK |
			PhuongXaModelImpl.MA_COLUMN_BITMASK |
			PhuongXaModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA_TT = new FinderPath(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the matching phuong xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhuongXa> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai) throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of phuong xas
	 * @param end the upper bound of the range of phuong xas (not inclusive)
	 * @return the range of matching phuong xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhuongXa> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai, int start, int end) throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of phuong xas
	 * @param end the upper bound of the range of phuong xas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching phuong xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhuongXa> findByTEN_MA_TT(String ten, String ma,
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

		List<PhuongXa> list = (List<PhuongXa>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PhuongXa phuongXa : list) {
				if (!Validator.equals(ten, phuongXa.getTen()) ||
						!Validator.equals(ma, phuongXa.getMa()) ||
						(trangThai != phuongXa.getTrangThai())) {
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

			query.append(_SQL_SELECT_PHUONGXA_WHERE);

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
				query.append(PhuongXaModelImpl.ORDER_BY_JPQL);
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
					list = (List<PhuongXa>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PhuongXa>(list);
				}
				else {
					list = (List<PhuongXa>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching phuong xa
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa findByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = fetchByTEN_MA_TT_First(ten, ma, trangThai,
				orderByComparator);

		if (phuongXa != null) {
			return phuongXa;
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

		throw new NoSuchPhuongXaException(msg.toString());
	}

	/**
	 * Returns the first phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		List<PhuongXa> list = findByTEN_MA_TT(ten, ma, trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching phuong xa
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa findByTEN_MA_TT_Last(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = fetchByTEN_MA_TT_Last(ten, ma, trangThai,
				orderByComparator);

		if (phuongXa != null) {
			return phuongXa;
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

		throw new NoSuchPhuongXaException(msg.toString());
	}

	/**
	 * Returns the last phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByTEN_MA_TT_Last(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTEN_MA_TT(ten, ma, trangThai);

		if (count == 0) {
			return null;
		}

		List<PhuongXa> list = findByTEN_MA_TT(ten, ma, trangThai, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the phuong xas before and after the current phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param phuongXaId the primary key of the current phuong xa
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next phuong xa
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa[] findByTEN_MA_TT_PrevAndNext(long phuongXaId, String ten,
		String ma, boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = findByPrimaryKey(phuongXaId);

		Session session = null;

		try {
			session = openSession();

			PhuongXa[] array = new PhuongXaImpl[3];

			array[0] = getByTEN_MA_TT_PrevAndNext(session, phuongXa, ten, ma,
					trangThai, orderByComparator, true);

			array[1] = phuongXa;

			array[2] = getByTEN_MA_TT_PrevAndNext(session, phuongXa, ten, ma,
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

	protected PhuongXa getByTEN_MA_TT_PrevAndNext(Session session,
		PhuongXa phuongXa, String ten, String ma, boolean trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PHUONGXA_WHERE);

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
			query.append(PhuongXaModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(phuongXa);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PhuongXa> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA_TT(String ten, String ma, boolean trangThai)
		throws SystemException {
		for (PhuongXa phuongXa : findByTEN_MA_TT(ten, ma, trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(phuongXa);
		}
	}

	/**
	 * Returns the number of phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the number of matching phuong xas
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

			query.append(_SQL_COUNT_PHUONGXA_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_1 = "phuongXa.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_2 = "phuongXa.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_3 = "(phuongXa.ten IS NULL OR phuongXa.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_1 = "phuongXa.ma IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_2 = "phuongXa.ma = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_3 = "(phuongXa.ma IS NULL OR phuongXa.ma = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TRANGTHAI_2 = "phuongXa.trangThai = ?";

	public PhuongXaPersistenceImpl() {
		setModelClass(PhuongXa.class);
	}

	/**
	 * Caches the phuong xa in the entity cache if it is enabled.
	 *
	 * @param phuongXa the phuong xa
	 */
	@Override
	public void cacheResult(PhuongXa phuongXa) {
		EntityCacheUtil.putResult(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaImpl.class, phuongXa.getPrimaryKey(), phuongXa);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
			new Object[] { phuongXa.getTen() }, phuongXa);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
			new Object[] { phuongXa.getMa() }, phuongXa);

		phuongXa.resetOriginalValues();
	}

	/**
	 * Caches the phuong xas in the entity cache if it is enabled.
	 *
	 * @param phuongXas the phuong xas
	 */
	@Override
	public void cacheResult(List<PhuongXa> phuongXas) {
		for (PhuongXa phuongXa : phuongXas) {
			if (EntityCacheUtil.getResult(
						PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
						PhuongXaImpl.class, phuongXa.getPrimaryKey()) == null) {
				cacheResult(phuongXa);
			}
			else {
				phuongXa.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phuong xas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PhuongXaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PhuongXaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phuong xa.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PhuongXa phuongXa) {
		EntityCacheUtil.removeResult(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaImpl.class, phuongXa.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(phuongXa);
	}

	@Override
	public void clearCache(List<PhuongXa> phuongXas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PhuongXa phuongXa : phuongXas) {
			EntityCacheUtil.removeResult(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
				PhuongXaImpl.class, phuongXa.getPrimaryKey());

			clearUniqueFindersCache(phuongXa);
		}
	}

	protected void cacheUniqueFindersCache(PhuongXa phuongXa) {
		if (phuongXa.isNew()) {
			Object[] args = new Object[] { phuongXa.getTen() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args, phuongXa);

			args = new Object[] { phuongXa.getMa() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args, phuongXa);
		}
		else {
			PhuongXaModelImpl phuongXaModelImpl = (PhuongXaModelImpl)phuongXa;

			if ((phuongXaModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { phuongXa.getTen() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args,
					phuongXa);
			}

			if ((phuongXaModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { phuongXa.getMa() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args,
					phuongXa);
			}
		}
	}

	protected void clearUniqueFindersCache(PhuongXa phuongXa) {
		PhuongXaModelImpl phuongXaModelImpl = (PhuongXaModelImpl)phuongXa;

		Object[] args = new Object[] { phuongXa.getTen() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);

		if ((phuongXaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
			args = new Object[] { phuongXaModelImpl.getOriginalTen() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);
		}

		args = new Object[] { phuongXa.getMa() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);

		if ((phuongXaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
			args = new Object[] { phuongXaModelImpl.getOriginalMa() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);
		}
	}

	/**
	 * Creates a new phuong xa with the primary key. Does not add the phuong xa to the database.
	 *
	 * @param phuongXaId the primary key for the new phuong xa
	 * @return the new phuong xa
	 */
	@Override
	public PhuongXa create(long phuongXaId) {
		PhuongXa phuongXa = new PhuongXaImpl();

		phuongXa.setNew(true);
		phuongXa.setPrimaryKey(phuongXaId);

		return phuongXa;
	}

	/**
	 * Removes the phuong xa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param phuongXaId the primary key of the phuong xa
	 * @return the phuong xa that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa remove(long phuongXaId)
		throws NoSuchPhuongXaException, SystemException {
		return remove((Serializable)phuongXaId);
	}

	/**
	 * Removes the phuong xa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phuong xa
	 * @return the phuong xa that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa remove(Serializable primaryKey)
		throws NoSuchPhuongXaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PhuongXa phuongXa = (PhuongXa)session.get(PhuongXaImpl.class,
					primaryKey);

			if (phuongXa == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPhuongXaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phuongXa);
		}
		catch (NoSuchPhuongXaException nsee) {
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
	protected PhuongXa removeImpl(PhuongXa phuongXa) throws SystemException {
		phuongXa = toUnwrappedModel(phuongXa);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phuongXa)) {
				phuongXa = (PhuongXa)session.get(PhuongXaImpl.class,
						phuongXa.getPrimaryKeyObj());
			}

			if (phuongXa != null) {
				session.delete(phuongXa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phuongXa != null) {
			clearCache(phuongXa);
		}

		return phuongXa;
	}

	@Override
	public PhuongXa updateImpl(
		com.minimart.portlet.danhmucchung.model.PhuongXa phuongXa)
		throws SystemException {
		phuongXa = toUnwrappedModel(phuongXa);

		boolean isNew = phuongXa.isNew();

		PhuongXaModelImpl phuongXaModelImpl = (PhuongXaModelImpl)phuongXa;

		Session session = null;

		try {
			session = openSession();

			if (phuongXa.isNew()) {
				session.save(phuongXa);

				phuongXa.setNew(false);
			}
			else {
				session.merge(phuongXa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PhuongXaModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((phuongXaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						phuongXaModelImpl.getOriginalTen(),
						phuongXaModelImpl.getOriginalMa(),
						phuongXaModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);

				args = new Object[] {
						phuongXaModelImpl.getTen(), phuongXaModelImpl.getMa(),
						phuongXaModelImpl.getTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);
			}
		}

		EntityCacheUtil.putResult(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
			PhuongXaImpl.class, phuongXa.getPrimaryKey(), phuongXa);

		clearUniqueFindersCache(phuongXa);
		cacheUniqueFindersCache(phuongXa);

		return phuongXa;
	}

	protected PhuongXa toUnwrappedModel(PhuongXa phuongXa) {
		if (phuongXa instanceof PhuongXaImpl) {
			return phuongXa;
		}

		PhuongXaImpl phuongXaImpl = new PhuongXaImpl();

		phuongXaImpl.setNew(phuongXa.isNew());
		phuongXaImpl.setPrimaryKey(phuongXa.getPrimaryKey());

		phuongXaImpl.setPhuongXaId(phuongXa.getPhuongXaId());
		phuongXaImpl.setCompanyId(phuongXa.getCompanyId());
		phuongXaImpl.setUserId(phuongXa.getUserId());
		phuongXaImpl.setUserName(phuongXa.getUserName());
		phuongXaImpl.setCreateDate(phuongXa.getCreateDate());
		phuongXaImpl.setModifiedDate(phuongXa.getModifiedDate());
		phuongXaImpl.setTen(phuongXa.getTen());
		phuongXaImpl.setMa(phuongXa.getMa());
		phuongXaImpl.setTrangThai(phuongXa.isTrangThai());

		return phuongXaImpl;
	}

	/**
	 * Returns the phuong xa with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phuong xa
	 * @return the phuong xa
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPhuongXaException, SystemException {
		PhuongXa phuongXa = fetchByPrimaryKey(primaryKey);

		if (phuongXa == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPhuongXaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phuongXa;
	}

	/**
	 * Returns the phuong xa with the primary key or throws a {@link com.minimart.portlet.danhmucchung.NoSuchPhuongXaException} if it could not be found.
	 *
	 * @param phuongXaId the primary key of the phuong xa
	 * @return the phuong xa
	 * @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa findByPrimaryKey(long phuongXaId)
		throws NoSuchPhuongXaException, SystemException {
		return findByPrimaryKey((Serializable)phuongXaId);
	}

	/**
	 * Returns the phuong xa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phuong xa
	 * @return the phuong xa, or <code>null</code> if a phuong xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PhuongXa phuongXa = (PhuongXa)EntityCacheUtil.getResult(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
				PhuongXaImpl.class, primaryKey);

		if (phuongXa == _nullPhuongXa) {
			return null;
		}

		if (phuongXa == null) {
			Session session = null;

			try {
				session = openSession();

				phuongXa = (PhuongXa)session.get(PhuongXaImpl.class, primaryKey);

				if (phuongXa != null) {
					cacheResult(phuongXa);
				}
				else {
					EntityCacheUtil.putResult(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
						PhuongXaImpl.class, primaryKey, _nullPhuongXa);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PhuongXaModelImpl.ENTITY_CACHE_ENABLED,
					PhuongXaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phuongXa;
	}

	/**
	 * Returns the phuong xa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param phuongXaId the primary key of the phuong xa
	 * @return the phuong xa, or <code>null</code> if a phuong xa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongXa fetchByPrimaryKey(long phuongXaId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)phuongXaId);
	}

	/**
	 * Returns all the phuong xas.
	 *
	 * @return the phuong xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhuongXa> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phuong xas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phuong xas
	 * @param end the upper bound of the range of phuong xas (not inclusive)
	 * @return the range of phuong xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhuongXa> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the phuong xas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phuong xas
	 * @param end the upper bound of the range of phuong xas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of phuong xas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhuongXa> findAll(int start, int end,
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

		List<PhuongXa> list = (List<PhuongXa>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHUONGXA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHUONGXA;

				if (pagination) {
					sql = sql.concat(PhuongXaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PhuongXa>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PhuongXa>(list);
				}
				else {
					list = (List<PhuongXa>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the phuong xas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PhuongXa phuongXa : findAll()) {
			remove(phuongXa);
		}
	}

	/**
	 * Returns the number of phuong xas.
	 *
	 * @return the number of phuong xas
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

				Query q = session.createQuery(_SQL_COUNT_PHUONGXA);

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
	 * Initializes the phuong xa persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.danhmucchung.model.PhuongXa")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PhuongXa>> listenersList = new ArrayList<ModelListener<PhuongXa>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PhuongXa>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PhuongXaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHUONGXA = "SELECT phuongXa FROM PhuongXa phuongXa";
	private static final String _SQL_SELECT_PHUONGXA_WHERE = "SELECT phuongXa FROM PhuongXa phuongXa WHERE ";
	private static final String _SQL_COUNT_PHUONGXA = "SELECT COUNT(phuongXa) FROM PhuongXa phuongXa";
	private static final String _SQL_COUNT_PHUONGXA_WHERE = "SELECT COUNT(phuongXa) FROM PhuongXa phuongXa WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phuongXa.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PhuongXa exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PhuongXa exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PhuongXaPersistenceImpl.class);
	private static PhuongXa _nullPhuongXa = new PhuongXaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PhuongXa> toCacheModel() {
				return _nullPhuongXaCacheModel;
			}
		};

	private static CacheModel<PhuongXa> _nullPhuongXaCacheModel = new CacheModel<PhuongXa>() {
			@Override
			public PhuongXa toEntityModel() {
				return _nullPhuongXa;
			}
		};
}