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

import com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;
import com.minimart.portlet.danhmucchung.model.TinhThanhPho;
import com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoImpl;
import com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tinh thanh pho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TinhThanhPhoPersistence
 * @see TinhThanhPhoUtil
 * @generated
 */
public class TinhThanhPhoPersistenceImpl extends BasePersistenceImpl<TinhThanhPho>
	implements TinhThanhPhoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TinhThanhPhoUtil} to access the tinh thanh pho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TinhThanhPhoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, TinhThanhPhoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, TinhThanhPhoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TEN = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, TinhThanhPhoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTEN",
			new String[] { String.class.getName() },
			TinhThanhPhoModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN",
			new String[] { String.class.getName() });

	/**
	 * Returns the tinh thanh pho where ten = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException} if it could not be found.
	 *
	 * @param ten the ten
	 * @return the matching tinh thanh pho
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho findByTEN(String ten)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = fetchByTEN(ten);

		if (tinhThanhPho == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ten=");
			msg.append(ten);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTinhThanhPhoException(msg.toString());
		}

		return tinhThanhPho;
	}

	/**
	 * Returns the tinh thanh pho where ten = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ten the ten
	 * @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByTEN(String ten) throws SystemException {
		return fetchByTEN(ten, true);
	}

	/**
	 * Returns the tinh thanh pho where ten = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ten the ten
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByTEN(String ten, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ten };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TEN,
					finderArgs, this);
		}

		if (result instanceof TinhThanhPho) {
			TinhThanhPho tinhThanhPho = (TinhThanhPho)result;

			if (!Validator.equals(ten, tinhThanhPho.getTen())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TINHTHANHPHO_WHERE);

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

				List<TinhThanhPho> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
						finderArgs, list);
				}
				else {
					TinhThanhPho tinhThanhPho = list.get(0);

					result = tinhThanhPho;

					cacheResult(tinhThanhPho);

					if ((tinhThanhPho.getTen() == null) ||
							!tinhThanhPho.getTen().equals(ten)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
							finderArgs, tinhThanhPho);
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
			return (TinhThanhPho)result;
		}
	}

	/**
	 * Removes the tinh thanh pho where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @return the tinh thanh pho that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho removeByTEN(String ten)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = findByTEN(ten);

		return remove(tinhThanhPho);
	}

	/**
	 * Returns the number of tinh thanh phos where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching tinh thanh phos
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

			query.append(_SQL_COUNT_TINHTHANHPHO_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "tinhThanhPho.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "tinhThanhPho.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(tinhThanhPho.ten IS NULL OR tinhThanhPho.ten = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_MA = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, TinhThanhPhoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMA",
			new String[] { String.class.getName() },
			TinhThanhPhoModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MA = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMA",
			new String[] { String.class.getName() });

	/**
	 * Returns the tinh thanh pho where ma = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException} if it could not be found.
	 *
	 * @param ma the ma
	 * @return the matching tinh thanh pho
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho findByMA(String ma)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = fetchByMA(ma);

		if (tinhThanhPho == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("ma=");
			msg.append(ma);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTinhThanhPhoException(msg.toString());
		}

		return tinhThanhPho;
	}

	/**
	 * Returns the tinh thanh pho where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ma the ma
	 * @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByMA(String ma) throws SystemException {
		return fetchByMA(ma, true);
	}

	/**
	 * Returns the tinh thanh pho where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ma the ma
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByMA(String ma, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { ma };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MA,
					finderArgs, this);
		}

		if (result instanceof TinhThanhPho) {
			TinhThanhPho tinhThanhPho = (TinhThanhPho)result;

			if (!Validator.equals(ma, tinhThanhPho.getMa())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TINHTHANHPHO_WHERE);

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

				List<TinhThanhPho> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
						finderArgs, list);
				}
				else {
					TinhThanhPho tinhThanhPho = list.get(0);

					result = tinhThanhPho;

					cacheResult(tinhThanhPho);

					if ((tinhThanhPho.getMa() == null) ||
							!tinhThanhPho.getMa().equals(ma)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
							finderArgs, tinhThanhPho);
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
			return (TinhThanhPho)result;
		}
	}

	/**
	 * Removes the tinh thanh pho where ma = &#63; from the database.
	 *
	 * @param ma the ma
	 * @return the tinh thanh pho that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho removeByMA(String ma)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = findByMA(ma);

		return remove(tinhThanhPho);
	}

	/**
	 * Returns the number of tinh thanh phos where ma = &#63;.
	 *
	 * @param ma the ma
	 * @return the number of matching tinh thanh phos
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

			query.append(_SQL_COUNT_TINHTHANHPHO_WHERE);

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

	private static final String _FINDER_COLUMN_MA_MA_1 = "tinhThanhPho.ma IS NULL";
	private static final String _FINDER_COLUMN_MA_MA_2 = "tinhThanhPho.ma = ?";
	private static final String _FINDER_COLUMN_MA_MA_3 = "(tinhThanhPho.ma IS NULL OR tinhThanhPho.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, TinhThanhPhoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT =
		new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, TinhThanhPhoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			},
			TinhThanhPhoModelImpl.TEN_COLUMN_BITMASK |
			TinhThanhPhoModelImpl.MA_COLUMN_BITMASK |
			TinhThanhPhoModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA_TT = new FinderPath(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA_TT",
			new String[] {
				String.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the matching tinh thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TinhThanhPho> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai) throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of tinh thanh phos
	 * @param end the upper bound of the range of tinh thanh phos (not inclusive)
	 * @return the range of matching tinh thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TinhThanhPho> findByTEN_MA_TT(String ten, String ma,
		boolean trangThai, int start, int end) throws SystemException {
		return findByTEN_MA_TT(ten, ma, trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of tinh thanh phos
	 * @param end the upper bound of the range of tinh thanh phos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tinh thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TinhThanhPho> findByTEN_MA_TT(String ten, String ma,
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

		List<TinhThanhPho> list = (List<TinhThanhPho>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TinhThanhPho tinhThanhPho : list) {
				if (!Validator.equals(ten, tinhThanhPho.getTen()) ||
						!Validator.equals(ma, tinhThanhPho.getMa()) ||
						(trangThai != tinhThanhPho.getTrangThai())) {
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

			query.append(_SQL_SELECT_TINHTHANHPHO_WHERE);

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
				query.append(TinhThanhPhoModelImpl.ORDER_BY_JPQL);
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
					list = (List<TinhThanhPho>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TinhThanhPho>(list);
				}
				else {
					list = (List<TinhThanhPho>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tinh thanh pho
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho findByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = fetchByTEN_MA_TT_First(ten, ma, trangThai,
				orderByComparator);

		if (tinhThanhPho != null) {
			return tinhThanhPho;
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

		throw new NoSuchTinhThanhPhoException(msg.toString());
	}

	/**
	 * Returns the first tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByTEN_MA_TT_First(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		List<TinhThanhPho> list = findByTEN_MA_TT(ten, ma, trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tinh thanh pho
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho findByTEN_MA_TT_Last(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = fetchByTEN_MA_TT_Last(ten, ma, trangThai,
				orderByComparator);

		if (tinhThanhPho != null) {
			return tinhThanhPho;
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

		throw new NoSuchTinhThanhPhoException(msg.toString());
	}

	/**
	 * Returns the last tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByTEN_MA_TT_Last(String ten, String ma,
		boolean trangThai, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTEN_MA_TT(ten, ma, trangThai);

		if (count == 0) {
			return null;
		}

		List<TinhThanhPho> list = findByTEN_MA_TT(ten, ma, trangThai,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tinh thanh phos before and after the current tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param tinhThanhPhoId the primary key of the current tinh thanh pho
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tinh thanh pho
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho[] findByTEN_MA_TT_PrevAndNext(long tinhThanhPhoId,
		String ten, String ma, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = findByPrimaryKey(tinhThanhPhoId);

		Session session = null;

		try {
			session = openSession();

			TinhThanhPho[] array = new TinhThanhPhoImpl[3];

			array[0] = getByTEN_MA_TT_PrevAndNext(session, tinhThanhPho, ten,
					ma, trangThai, orderByComparator, true);

			array[1] = tinhThanhPho;

			array[2] = getByTEN_MA_TT_PrevAndNext(session, tinhThanhPho, ten,
					ma, trangThai, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TinhThanhPho getByTEN_MA_TT_PrevAndNext(Session session,
		TinhThanhPho tinhThanhPho, String ten, String ma, boolean trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TINHTHANHPHO_WHERE);

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
			query.append(TinhThanhPhoModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tinhThanhPho);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TinhThanhPho> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA_TT(String ten, String ma, boolean trangThai)
		throws SystemException {
		for (TinhThanhPho tinhThanhPho : findByTEN_MA_TT(ten, ma, trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tinhThanhPho);
		}
	}

	/**
	 * Returns the number of tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param trangThai the trang thai
	 * @return the number of matching tinh thanh phos
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

			query.append(_SQL_COUNT_TINHTHANHPHO_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_1 = "tinhThanhPho.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_2 = "tinhThanhPho.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TEN_3 = "(tinhThanhPho.ten IS NULL OR tinhThanhPho.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_1 = "tinhThanhPho.ma IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_2 = "tinhThanhPho.ma = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_MA_3 = "(tinhThanhPho.ma IS NULL OR tinhThanhPho.ma = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TT_TRANGTHAI_2 = "tinhThanhPho.trangThai = ?";

	public TinhThanhPhoPersistenceImpl() {
		setModelClass(TinhThanhPho.class);
	}

	/**
	 * Caches the tinh thanh pho in the entity cache if it is enabled.
	 *
	 * @param tinhThanhPho the tinh thanh pho
	 */
	@Override
	public void cacheResult(TinhThanhPho tinhThanhPho) {
		EntityCacheUtil.putResult(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoImpl.class, tinhThanhPho.getPrimaryKey(), tinhThanhPho);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN,
			new Object[] { tinhThanhPho.getTen() }, tinhThanhPho);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA,
			new Object[] { tinhThanhPho.getMa() }, tinhThanhPho);

		tinhThanhPho.resetOriginalValues();
	}

	/**
	 * Caches the tinh thanh phos in the entity cache if it is enabled.
	 *
	 * @param tinhThanhPhos the tinh thanh phos
	 */
	@Override
	public void cacheResult(List<TinhThanhPho> tinhThanhPhos) {
		for (TinhThanhPho tinhThanhPho : tinhThanhPhos) {
			if (EntityCacheUtil.getResult(
						TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
						TinhThanhPhoImpl.class, tinhThanhPho.getPrimaryKey()) == null) {
				cacheResult(tinhThanhPho);
			}
			else {
				tinhThanhPho.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tinh thanh phos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TinhThanhPhoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TinhThanhPhoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tinh thanh pho.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TinhThanhPho tinhThanhPho) {
		EntityCacheUtil.removeResult(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoImpl.class, tinhThanhPho.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tinhThanhPho);
	}

	@Override
	public void clearCache(List<TinhThanhPho> tinhThanhPhos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TinhThanhPho tinhThanhPho : tinhThanhPhos) {
			EntityCacheUtil.removeResult(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
				TinhThanhPhoImpl.class, tinhThanhPho.getPrimaryKey());

			clearUniqueFindersCache(tinhThanhPho);
		}
	}

	protected void cacheUniqueFindersCache(TinhThanhPho tinhThanhPho) {
		if (tinhThanhPho.isNew()) {
			Object[] args = new Object[] { tinhThanhPho.getTen() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args,
				tinhThanhPho);

			args = new Object[] { tinhThanhPho.getMa() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args,
				tinhThanhPho);
		}
		else {
			TinhThanhPhoModelImpl tinhThanhPhoModelImpl = (TinhThanhPhoModelImpl)tinhThanhPho;

			if ((tinhThanhPhoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tinhThanhPho.getTen() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TEN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TEN, args,
					tinhThanhPho);
			}

			if ((tinhThanhPhoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tinhThanhPho.getMa() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MA, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MA, args,
					tinhThanhPho);
			}
		}
	}

	protected void clearUniqueFindersCache(TinhThanhPho tinhThanhPho) {
		TinhThanhPhoModelImpl tinhThanhPhoModelImpl = (TinhThanhPhoModelImpl)tinhThanhPho;

		Object[] args = new Object[] { tinhThanhPho.getTen() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);

		if ((tinhThanhPhoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TEN.getColumnBitmask()) != 0) {
			args = new Object[] { tinhThanhPhoModelImpl.getOriginalTen() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TEN, args);
		}

		args = new Object[] { tinhThanhPho.getMa() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);

		if ((tinhThanhPhoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MA.getColumnBitmask()) != 0) {
			args = new Object[] { tinhThanhPhoModelImpl.getOriginalMa() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MA, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MA, args);
		}
	}

	/**
	 * Creates a new tinh thanh pho with the primary key. Does not add the tinh thanh pho to the database.
	 *
	 * @param tinhThanhPhoId the primary key for the new tinh thanh pho
	 * @return the new tinh thanh pho
	 */
	@Override
	public TinhThanhPho create(long tinhThanhPhoId) {
		TinhThanhPho tinhThanhPho = new TinhThanhPhoImpl();

		tinhThanhPho.setNew(true);
		tinhThanhPho.setPrimaryKey(tinhThanhPhoId);

		return tinhThanhPho;
	}

	/**
	 * Removes the tinh thanh pho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tinhThanhPhoId the primary key of the tinh thanh pho
	 * @return the tinh thanh pho that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho remove(long tinhThanhPhoId)
		throws NoSuchTinhThanhPhoException, SystemException {
		return remove((Serializable)tinhThanhPhoId);
	}

	/**
	 * Removes the tinh thanh pho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tinh thanh pho
	 * @return the tinh thanh pho that was removed
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho remove(Serializable primaryKey)
		throws NoSuchTinhThanhPhoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TinhThanhPho tinhThanhPho = (TinhThanhPho)session.get(TinhThanhPhoImpl.class,
					primaryKey);

			if (tinhThanhPho == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTinhThanhPhoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tinhThanhPho);
		}
		catch (NoSuchTinhThanhPhoException nsee) {
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
	protected TinhThanhPho removeImpl(TinhThanhPho tinhThanhPho)
		throws SystemException {
		tinhThanhPho = toUnwrappedModel(tinhThanhPho);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tinhThanhPho)) {
				tinhThanhPho = (TinhThanhPho)session.get(TinhThanhPhoImpl.class,
						tinhThanhPho.getPrimaryKeyObj());
			}

			if (tinhThanhPho != null) {
				session.delete(tinhThanhPho);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tinhThanhPho != null) {
			clearCache(tinhThanhPho);
		}

		return tinhThanhPho;
	}

	@Override
	public TinhThanhPho updateImpl(
		com.minimart.portlet.danhmucchung.model.TinhThanhPho tinhThanhPho)
		throws SystemException {
		tinhThanhPho = toUnwrappedModel(tinhThanhPho);

		boolean isNew = tinhThanhPho.isNew();

		TinhThanhPhoModelImpl tinhThanhPhoModelImpl = (TinhThanhPhoModelImpl)tinhThanhPho;

		Session session = null;

		try {
			session = openSession();

			if (tinhThanhPho.isNew()) {
				session.save(tinhThanhPho);

				tinhThanhPho.setNew(false);
			}
			else {
				session.merge(tinhThanhPho);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TinhThanhPhoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tinhThanhPhoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tinhThanhPhoModelImpl.getOriginalTen(),
						tinhThanhPhoModelImpl.getOriginalMa(),
						tinhThanhPhoModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);

				args = new Object[] {
						tinhThanhPhoModelImpl.getTen(),
						tinhThanhPhoModelImpl.getMa(),
						tinhThanhPhoModelImpl.getTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_TT,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_TT,
					args);
			}
		}

		EntityCacheUtil.putResult(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
			TinhThanhPhoImpl.class, tinhThanhPho.getPrimaryKey(), tinhThanhPho);

		clearUniqueFindersCache(tinhThanhPho);
		cacheUniqueFindersCache(tinhThanhPho);

		return tinhThanhPho;
	}

	protected TinhThanhPho toUnwrappedModel(TinhThanhPho tinhThanhPho) {
		if (tinhThanhPho instanceof TinhThanhPhoImpl) {
			return tinhThanhPho;
		}

		TinhThanhPhoImpl tinhThanhPhoImpl = new TinhThanhPhoImpl();

		tinhThanhPhoImpl.setNew(tinhThanhPho.isNew());
		tinhThanhPhoImpl.setPrimaryKey(tinhThanhPho.getPrimaryKey());

		tinhThanhPhoImpl.setTinhThanhPhoId(tinhThanhPho.getTinhThanhPhoId());
		tinhThanhPhoImpl.setCompanyId(tinhThanhPho.getCompanyId());
		tinhThanhPhoImpl.setUserId(tinhThanhPho.getUserId());
		tinhThanhPhoImpl.setUserName(tinhThanhPho.getUserName());
		tinhThanhPhoImpl.setCreateDate(tinhThanhPho.getCreateDate());
		tinhThanhPhoImpl.setModifiedDate(tinhThanhPho.getModifiedDate());
		tinhThanhPhoImpl.setTen(tinhThanhPho.getTen());
		tinhThanhPhoImpl.setMa(tinhThanhPho.getMa());
		tinhThanhPhoImpl.setTrangThai(tinhThanhPho.isTrangThai());

		return tinhThanhPhoImpl;
	}

	/**
	 * Returns the tinh thanh pho with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tinh thanh pho
	 * @return the tinh thanh pho
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTinhThanhPhoException, SystemException {
		TinhThanhPho tinhThanhPho = fetchByPrimaryKey(primaryKey);

		if (tinhThanhPho == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTinhThanhPhoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tinhThanhPho;
	}

	/**
	 * Returns the tinh thanh pho with the primary key or throws a {@link com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException} if it could not be found.
	 *
	 * @param tinhThanhPhoId the primary key of the tinh thanh pho
	 * @return the tinh thanh pho
	 * @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho findByPrimaryKey(long tinhThanhPhoId)
		throws NoSuchTinhThanhPhoException, SystemException {
		return findByPrimaryKey((Serializable)tinhThanhPhoId);
	}

	/**
	 * Returns the tinh thanh pho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tinh thanh pho
	 * @return the tinh thanh pho, or <code>null</code> if a tinh thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TinhThanhPho tinhThanhPho = (TinhThanhPho)EntityCacheUtil.getResult(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
				TinhThanhPhoImpl.class, primaryKey);

		if (tinhThanhPho == _nullTinhThanhPho) {
			return null;
		}

		if (tinhThanhPho == null) {
			Session session = null;

			try {
				session = openSession();

				tinhThanhPho = (TinhThanhPho)session.get(TinhThanhPhoImpl.class,
						primaryKey);

				if (tinhThanhPho != null) {
					cacheResult(tinhThanhPho);
				}
				else {
					EntityCacheUtil.putResult(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
						TinhThanhPhoImpl.class, primaryKey, _nullTinhThanhPho);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TinhThanhPhoModelImpl.ENTITY_CACHE_ENABLED,
					TinhThanhPhoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tinhThanhPho;
	}

	/**
	 * Returns the tinh thanh pho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tinhThanhPhoId the primary key of the tinh thanh pho
	 * @return the tinh thanh pho, or <code>null</code> if a tinh thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TinhThanhPho fetchByPrimaryKey(long tinhThanhPhoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)tinhThanhPhoId);
	}

	/**
	 * Returns all the tinh thanh phos.
	 *
	 * @return the tinh thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TinhThanhPho> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tinh thanh phos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tinh thanh phos
	 * @param end the upper bound of the range of tinh thanh phos (not inclusive)
	 * @return the range of tinh thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TinhThanhPho> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tinh thanh phos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tinh thanh phos
	 * @param end the upper bound of the range of tinh thanh phos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tinh thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TinhThanhPho> findAll(int start, int end,
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

		List<TinhThanhPho> list = (List<TinhThanhPho>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TINHTHANHPHO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TINHTHANHPHO;

				if (pagination) {
					sql = sql.concat(TinhThanhPhoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TinhThanhPho>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TinhThanhPho>(list);
				}
				else {
					list = (List<TinhThanhPho>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tinh thanh phos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TinhThanhPho tinhThanhPho : findAll()) {
			remove(tinhThanhPho);
		}
	}

	/**
	 * Returns the number of tinh thanh phos.
	 *
	 * @return the number of tinh thanh phos
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

				Query q = session.createQuery(_SQL_COUNT_TINHTHANHPHO);

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
	 * Initializes the tinh thanh pho persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.danhmucchung.model.TinhThanhPho")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TinhThanhPho>> listenersList = new ArrayList<ModelListener<TinhThanhPho>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TinhThanhPho>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TinhThanhPhoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TINHTHANHPHO = "SELECT tinhThanhPho FROM TinhThanhPho tinhThanhPho";
	private static final String _SQL_SELECT_TINHTHANHPHO_WHERE = "SELECT tinhThanhPho FROM TinhThanhPho tinhThanhPho WHERE ";
	private static final String _SQL_COUNT_TINHTHANHPHO = "SELECT COUNT(tinhThanhPho) FROM TinhThanhPho tinhThanhPho";
	private static final String _SQL_COUNT_TINHTHANHPHO_WHERE = "SELECT COUNT(tinhThanhPho) FROM TinhThanhPho tinhThanhPho WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tinhThanhPho.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TinhThanhPho exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TinhThanhPho exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TinhThanhPhoPersistenceImpl.class);
	private static TinhThanhPho _nullTinhThanhPho = new TinhThanhPhoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TinhThanhPho> toCacheModel() {
				return _nullTinhThanhPhoCacheModel;
			}
		};

	private static CacheModel<TinhThanhPho> _nullTinhThanhPhoCacheModel = new CacheModel<TinhThanhPho>() {
			@Override
			public TinhThanhPho toEntityModel() {
				return _nullTinhThanhPho;
			}
		};
}