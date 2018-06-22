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

package com.minimart.portlet.ketoan.service.persistence;

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

import com.minimart.portlet.ketoan.NoSuchThuChiException;
import com.minimart.portlet.ketoan.model.ThuChi;
import com.minimart.portlet.ketoan.model.impl.ThuChiImpl;
import com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the thu chi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see ThuChiPersistence
 * @see ThuChiUtil
 * @generated
 */
public class ThuChiPersistenceImpl extends BasePersistenceImpl<ThuChi>
	implements ThuChiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ThuChiUtil} to access the thu chi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ThuChiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN",
			new String[] { String.class.getName() },
			ThuChiModelImpl.TEN_COLUMN_BITMASK |
			ThuChiModelImpl.TENDOITUONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the thu chis where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByTEN(String ten) throws SystemException {
		return findByTEN(ten, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thu chis where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @return the range of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByTEN(String ten, int start, int end)
		throws SystemException {
		return findByTEN(ten, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thu chis where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByTEN(String ten, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN;
			finderArgs = new Object[] { ten };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN;
			finderArgs = new Object[] { ten, start, end, orderByComparator };
		}

		List<ThuChi> list = (List<ThuChi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThuChi thuChi : list) {
				if (!Validator.equals(ten, thuChi.getTen())) {
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

			query.append(_SQL_SELECT_THUCHI_WHERE);

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

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThuChiModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThuChi>(list);
				}
				else {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first thu chi in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByTEN_First(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = fetchByTEN_First(ten, orderByComparator);

		if (thuChi != null) {
			return thuChi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThuChiException(msg.toString());
	}

	/**
	 * Returns the first thu chi in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thu chi, or <code>null</code> if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByTEN_First(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThuChi> list = findByTEN(ten, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thu chi in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByTEN_Last(String ten, OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = fetchByTEN_Last(ten, orderByComparator);

		if (thuChi != null) {
			return thuChi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThuChiException(msg.toString());
	}

	/**
	 * Returns the last thu chi in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thu chi, or <code>null</code> if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByTEN_Last(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN(ten);

		if (count == 0) {
			return null;
		}

		List<ThuChi> list = findByTEN(ten, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thu chis before and after the current thu chi in the ordered set where ten = &#63;.
	 *
	 * @param thuChiId the primary key of the current thu chi
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi[] findByTEN_PrevAndNext(long thuChiId, String ten,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = findByPrimaryKey(thuChiId);

		Session session = null;

		try {
			session = openSession();

			ThuChi[] array = new ThuChiImpl[3];

			array[0] = getByTEN_PrevAndNext(session, thuChi, ten,
					orderByComparator, true);

			array[1] = thuChi;

			array[2] = getByTEN_PrevAndNext(session, thuChi, ten,
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

	protected ThuChi getByTEN_PrevAndNext(Session session, ThuChi thuChi,
		String ten, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THUCHI_WHERE);

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
			query.append(ThuChiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thuChi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThuChi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thu chis where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN(String ten) throws SystemException {
		for (ThuChi thuChi : findByTEN(ten, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thuChi);
		}
	}

	/**
	 * Returns the number of thu chis where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching thu chis
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

			query.append(_SQL_COUNT_THUCHI_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "thuChi.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "thuChi.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(thuChi.ten IS NULL OR thuChi.ten = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LYDO = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLYDO",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LYDO = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLYDO",
			new String[] { String.class.getName() },
			ThuChiModelImpl.LYDOTHUCHI_COLUMN_BITMASK |
			ThuChiModelImpl.TEN_COLUMN_BITMASK |
			ThuChiModelImpl.TENDOITUONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LYDO = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLYDO",
			new String[] { String.class.getName() });

	/**
	 * Returns all the thu chis where lyDoThuChi = &#63;.
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @return the matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByLYDO(String lyDoThuChi) throws SystemException {
		return findByLYDO(lyDoThuChi, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thu chis where lyDoThuChi = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @return the range of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByLYDO(String lyDoThuChi, int start, int end)
		throws SystemException {
		return findByLYDO(lyDoThuChi, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thu chis where lyDoThuChi = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByLYDO(String lyDoThuChi, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LYDO;
			finderArgs = new Object[] { lyDoThuChi };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LYDO;
			finderArgs = new Object[] { lyDoThuChi, start, end, orderByComparator };
		}

		List<ThuChi> list = (List<ThuChi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThuChi thuChi : list) {
				if (!Validator.equals(lyDoThuChi, thuChi.getLyDoThuChi())) {
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

			query.append(_SQL_SELECT_THUCHI_WHERE);

			boolean bindLyDoThuChi = false;

			if (lyDoThuChi == null) {
				query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_1);
			}
			else if (lyDoThuChi.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_3);
			}
			else {
				bindLyDoThuChi = true;

				query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThuChiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLyDoThuChi) {
					qPos.add(lyDoThuChi);
				}

				if (!pagination) {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThuChi>(list);
				}
				else {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first thu chi in the ordered set where lyDoThuChi = &#63;.
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByLYDO_First(String lyDoThuChi,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = fetchByLYDO_First(lyDoThuChi, orderByComparator);

		if (thuChi != null) {
			return thuChi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lyDoThuChi=");
		msg.append(lyDoThuChi);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThuChiException(msg.toString());
	}

	/**
	 * Returns the first thu chi in the ordered set where lyDoThuChi = &#63;.
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thu chi, or <code>null</code> if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByLYDO_First(String lyDoThuChi,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThuChi> list = findByLYDO(lyDoThuChi, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thu chi in the ordered set where lyDoThuChi = &#63;.
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByLYDO_Last(String lyDoThuChi,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = fetchByLYDO_Last(lyDoThuChi, orderByComparator);

		if (thuChi != null) {
			return thuChi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lyDoThuChi=");
		msg.append(lyDoThuChi);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThuChiException(msg.toString());
	}

	/**
	 * Returns the last thu chi in the ordered set where lyDoThuChi = &#63;.
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thu chi, or <code>null</code> if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByLYDO_Last(String lyDoThuChi,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLYDO(lyDoThuChi);

		if (count == 0) {
			return null;
		}

		List<ThuChi> list = findByLYDO(lyDoThuChi, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thu chis before and after the current thu chi in the ordered set where lyDoThuChi = &#63;.
	 *
	 * @param thuChiId the primary key of the current thu chi
	 * @param lyDoThuChi the ly do thu chi
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi[] findByLYDO_PrevAndNext(long thuChiId, String lyDoThuChi,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = findByPrimaryKey(thuChiId);

		Session session = null;

		try {
			session = openSession();

			ThuChi[] array = new ThuChiImpl[3];

			array[0] = getByLYDO_PrevAndNext(session, thuChi, lyDoThuChi,
					orderByComparator, true);

			array[1] = thuChi;

			array[2] = getByLYDO_PrevAndNext(session, thuChi, lyDoThuChi,
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

	protected ThuChi getByLYDO_PrevAndNext(Session session, ThuChi thuChi,
		String lyDoThuChi, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THUCHI_WHERE);

		boolean bindLyDoThuChi = false;

		if (lyDoThuChi == null) {
			query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_1);
		}
		else if (lyDoThuChi.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_3);
		}
		else {
			bindLyDoThuChi = true;

			query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_2);
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
			query.append(ThuChiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLyDoThuChi) {
			qPos.add(lyDoThuChi);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thuChi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThuChi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thu chis where lyDoThuChi = &#63; from the database.
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLYDO(String lyDoThuChi) throws SystemException {
		for (ThuChi thuChi : findByLYDO(lyDoThuChi, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thuChi);
		}
	}

	/**
	 * Returns the number of thu chis where lyDoThuChi = &#63;.
	 *
	 * @param lyDoThuChi the ly do thu chi
	 * @return the number of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLYDO(String lyDoThuChi) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LYDO;

		Object[] finderArgs = new Object[] { lyDoThuChi };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THUCHI_WHERE);

			boolean bindLyDoThuChi = false;

			if (lyDoThuChi == null) {
				query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_1);
			}
			else if (lyDoThuChi.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_3);
			}
			else {
				bindLyDoThuChi = true;

				query.append(_FINDER_COLUMN_LYDO_LYDOTHUCHI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLyDoThuChi) {
					qPos.add(lyDoThuChi);
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

	private static final String _FINDER_COLUMN_LYDO_LYDOTHUCHI_1 = "thuChi.lyDoThuChi IS NULL";
	private static final String _FINDER_COLUMN_LYDO_LYDOTHUCHI_2 = "thuChi.lyDoThuChi = ?";
	private static final String _FINDER_COLUMN_LYDO_LYDOTHUCHI_3 = "(thuChi.lyDoThuChi IS NULL OR thuChi.lyDoThuChi = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NVID = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNVID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NVID = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, ThuChiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNVID",
			new String[] { Long.class.getName() },
			ThuChiModelImpl.NHANVIENID_COLUMN_BITMASK |
			ThuChiModelImpl.TEN_COLUMN_BITMASK |
			ThuChiModelImpl.TENDOITUONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NVID = new FinderPath(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNVID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the thu chis where nhanVienId = &#63;.
	 *
	 * @param nhanVienId the nhan vien ID
	 * @return the matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByNVID(long nhanVienId) throws SystemException {
		return findByNVID(nhanVienId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thu chis where nhanVienId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nhanVienId the nhan vien ID
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @return the range of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByNVID(long nhanVienId, int start, int end)
		throws SystemException {
		return findByNVID(nhanVienId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the thu chis where nhanVienId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param nhanVienId the nhan vien ID
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findByNVID(long nhanVienId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NVID;
			finderArgs = new Object[] { nhanVienId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NVID;
			finderArgs = new Object[] { nhanVienId, start, end, orderByComparator };
		}

		List<ThuChi> list = (List<ThuChi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ThuChi thuChi : list) {
				if ((nhanVienId != thuChi.getNhanVienId())) {
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

			query.append(_SQL_SELECT_THUCHI_WHERE);

			query.append(_FINDER_COLUMN_NVID_NHANVIENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ThuChiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nhanVienId);

				if (!pagination) {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThuChi>(list);
				}
				else {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first thu chi in the ordered set where nhanVienId = &#63;.
	 *
	 * @param nhanVienId the nhan vien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByNVID_First(long nhanVienId,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = fetchByNVID_First(nhanVienId, orderByComparator);

		if (thuChi != null) {
			return thuChi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nhanVienId=");
		msg.append(nhanVienId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThuChiException(msg.toString());
	}

	/**
	 * Returns the first thu chi in the ordered set where nhanVienId = &#63;.
	 *
	 * @param nhanVienId the nhan vien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thu chi, or <code>null</code> if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByNVID_First(long nhanVienId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ThuChi> list = findByNVID(nhanVienId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thu chi in the ordered set where nhanVienId = &#63;.
	 *
	 * @param nhanVienId the nhan vien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByNVID_Last(long nhanVienId,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = fetchByNVID_Last(nhanVienId, orderByComparator);

		if (thuChi != null) {
			return thuChi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nhanVienId=");
		msg.append(nhanVienId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchThuChiException(msg.toString());
	}

	/**
	 * Returns the last thu chi in the ordered set where nhanVienId = &#63;.
	 *
	 * @param nhanVienId the nhan vien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thu chi, or <code>null</code> if a matching thu chi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByNVID_Last(long nhanVienId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNVID(nhanVienId);

		if (count == 0) {
			return null;
		}

		List<ThuChi> list = findByNVID(nhanVienId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thu chis before and after the current thu chi in the ordered set where nhanVienId = &#63;.
	 *
	 * @param thuChiId the primary key of the current thu chi
	 * @param nhanVienId the nhan vien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi[] findByNVID_PrevAndNext(long thuChiId, long nhanVienId,
		OrderByComparator orderByComparator)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = findByPrimaryKey(thuChiId);

		Session session = null;

		try {
			session = openSession();

			ThuChi[] array = new ThuChiImpl[3];

			array[0] = getByNVID_PrevAndNext(session, thuChi, nhanVienId,
					orderByComparator, true);

			array[1] = thuChi;

			array[2] = getByNVID_PrevAndNext(session, thuChi, nhanVienId,
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

	protected ThuChi getByNVID_PrevAndNext(Session session, ThuChi thuChi,
		long nhanVienId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_THUCHI_WHERE);

		query.append(_FINDER_COLUMN_NVID_NHANVIENID_2);

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
			query.append(ThuChiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(nhanVienId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(thuChi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ThuChi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thu chis where nhanVienId = &#63; from the database.
	 *
	 * @param nhanVienId the nhan vien ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNVID(long nhanVienId) throws SystemException {
		for (ThuChi thuChi : findByNVID(nhanVienId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(thuChi);
		}
	}

	/**
	 * Returns the number of thu chis where nhanVienId = &#63;.
	 *
	 * @param nhanVienId the nhan vien ID
	 * @return the number of matching thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNVID(long nhanVienId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NVID;

		Object[] finderArgs = new Object[] { nhanVienId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_THUCHI_WHERE);

			query.append(_FINDER_COLUMN_NVID_NHANVIENID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(nhanVienId);

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

	private static final String _FINDER_COLUMN_NVID_NHANVIENID_2 = "thuChi.nhanVienId = ?";

	public ThuChiPersistenceImpl() {
		setModelClass(ThuChi.class);
	}

	/**
	 * Caches the thu chi in the entity cache if it is enabled.
	 *
	 * @param thuChi the thu chi
	 */
	@Override
	public void cacheResult(ThuChi thuChi) {
		EntityCacheUtil.putResult(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiImpl.class, thuChi.getPrimaryKey(), thuChi);

		thuChi.resetOriginalValues();
	}

	/**
	 * Caches the thu chis in the entity cache if it is enabled.
	 *
	 * @param thuChis the thu chis
	 */
	@Override
	public void cacheResult(List<ThuChi> thuChis) {
		for (ThuChi thuChi : thuChis) {
			if (EntityCacheUtil.getResult(
						ThuChiModelImpl.ENTITY_CACHE_ENABLED, ThuChiImpl.class,
						thuChi.getPrimaryKey()) == null) {
				cacheResult(thuChi);
			}
			else {
				thuChi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all thu chis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ThuChiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ThuChiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the thu chi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThuChi thuChi) {
		EntityCacheUtil.removeResult(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiImpl.class, thuChi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ThuChi> thuChis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ThuChi thuChi : thuChis) {
			EntityCacheUtil.removeResult(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
				ThuChiImpl.class, thuChi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new thu chi with the primary key. Does not add the thu chi to the database.
	 *
	 * @param thuChiId the primary key for the new thu chi
	 * @return the new thu chi
	 */
	@Override
	public ThuChi create(long thuChiId) {
		ThuChi thuChi = new ThuChiImpl();

		thuChi.setNew(true);
		thuChi.setPrimaryKey(thuChiId);

		return thuChi;
	}

	/**
	 * Removes the thu chi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param thuChiId the primary key of the thu chi
	 * @return the thu chi that was removed
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi remove(long thuChiId)
		throws NoSuchThuChiException, SystemException {
		return remove((Serializable)thuChiId);
	}

	/**
	 * Removes the thu chi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the thu chi
	 * @return the thu chi that was removed
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi remove(Serializable primaryKey)
		throws NoSuchThuChiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ThuChi thuChi = (ThuChi)session.get(ThuChiImpl.class, primaryKey);

			if (thuChi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThuChiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thuChi);
		}
		catch (NoSuchThuChiException nsee) {
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
	protected ThuChi removeImpl(ThuChi thuChi) throws SystemException {
		thuChi = toUnwrappedModel(thuChi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thuChi)) {
				thuChi = (ThuChi)session.get(ThuChiImpl.class,
						thuChi.getPrimaryKeyObj());
			}

			if (thuChi != null) {
				session.delete(thuChi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (thuChi != null) {
			clearCache(thuChi);
		}

		return thuChi;
	}

	@Override
	public ThuChi updateImpl(com.minimart.portlet.ketoan.model.ThuChi thuChi)
		throws SystemException {
		thuChi = toUnwrappedModel(thuChi);

		boolean isNew = thuChi.isNew();

		ThuChiModelImpl thuChiModelImpl = (ThuChiModelImpl)thuChi;

		Session session = null;

		try {
			session = openSession();

			if (thuChi.isNew()) {
				session.save(thuChi);

				thuChi.setNew(false);
			}
			else {
				session.merge(thuChi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ThuChiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((thuChiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { thuChiModelImpl.getOriginalTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);

				args = new Object[] { thuChiModelImpl.getTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);
			}

			if ((thuChiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LYDO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thuChiModelImpl.getOriginalLyDoThuChi()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LYDO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LYDO,
					args);

				args = new Object[] { thuChiModelImpl.getLyDoThuChi() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LYDO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LYDO,
					args);
			}

			if ((thuChiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NVID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						thuChiModelImpl.getOriginalNhanVienId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NVID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NVID,
					args);

				args = new Object[] { thuChiModelImpl.getNhanVienId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NVID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NVID,
					args);
			}
		}

		EntityCacheUtil.putResult(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
			ThuChiImpl.class, thuChi.getPrimaryKey(), thuChi);

		return thuChi;
	}

	protected ThuChi toUnwrappedModel(ThuChi thuChi) {
		if (thuChi instanceof ThuChiImpl) {
			return thuChi;
		}

		ThuChiImpl thuChiImpl = new ThuChiImpl();

		thuChiImpl.setNew(thuChi.isNew());
		thuChiImpl.setPrimaryKey(thuChi.getPrimaryKey());

		thuChiImpl.setThuChiId(thuChi.getThuChiId());
		thuChiImpl.setCompanyId(thuChi.getCompanyId());
		thuChiImpl.setUserId(thuChi.getUserId());
		thuChiImpl.setUserName(thuChi.getUserName());
		thuChiImpl.setCreateDate(thuChi.getCreateDate());
		thuChiImpl.setModifiedDate(thuChi.getModifiedDate());
		thuChiImpl.setTen(thuChi.getTen());
		thuChiImpl.setTenDoiTuong(thuChi.getTenDoiTuong());
		thuChiImpl.setDiaChiId(thuChi.getDiaChiId());
		thuChiImpl.setLoai(thuChi.getLoai());
		thuChiImpl.setLoaiDoiTuong(thuChi.getLoaiDoiTuong());
		thuChiImpl.setThu(thuChi.getThu());
		thuChiImpl.setChi(thuChi.getChi());
		thuChiImpl.setNhaCungCapId(thuChi.getNhaCungCapId());
		thuChiImpl.setKhachHangId(thuChi.getKhachHangId());
		thuChiImpl.setNhanVienId(thuChi.getNhanVienId());
		thuChiImpl.setTheTraTruocId(thuChi.getTheTraTruocId());
		thuChiImpl.setTaiKhoanNganHangId(thuChi.getTaiKhoanNganHangId());
		thuChiImpl.setDatHangId(thuChi.getDatHangId());
		thuChiImpl.setBangLuongId(thuChi.getBangLuongId());
		thuChiImpl.setLyDoThuChi(thuChi.getLyDoThuChi());

		return thuChiImpl;
	}

	/**
	 * Returns the thu chi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the thu chi
	 * @return the thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchThuChiException, SystemException {
		ThuChi thuChi = fetchByPrimaryKey(primaryKey);

		if (thuChi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchThuChiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return thuChi;
	}

	/**
	 * Returns the thu chi with the primary key or throws a {@link com.minimart.portlet.ketoan.NoSuchThuChiException} if it could not be found.
	 *
	 * @param thuChiId the primary key of the thu chi
	 * @return the thu chi
	 * @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi findByPrimaryKey(long thuChiId)
		throws NoSuchThuChiException, SystemException {
		return findByPrimaryKey((Serializable)thuChiId);
	}

	/**
	 * Returns the thu chi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the thu chi
	 * @return the thu chi, or <code>null</code> if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ThuChi thuChi = (ThuChi)EntityCacheUtil.getResult(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
				ThuChiImpl.class, primaryKey);

		if (thuChi == _nullThuChi) {
			return null;
		}

		if (thuChi == null) {
			Session session = null;

			try {
				session = openSession();

				thuChi = (ThuChi)session.get(ThuChiImpl.class, primaryKey);

				if (thuChi != null) {
					cacheResult(thuChi);
				}
				else {
					EntityCacheUtil.putResult(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
						ThuChiImpl.class, primaryKey, _nullThuChi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ThuChiModelImpl.ENTITY_CACHE_ENABLED,
					ThuChiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return thuChi;
	}

	/**
	 * Returns the thu chi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param thuChiId the primary key of the thu chi
	 * @return the thu chi, or <code>null</code> if a thu chi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ThuChi fetchByPrimaryKey(long thuChiId) throws SystemException {
		return fetchByPrimaryKey((Serializable)thuChiId);
	}

	/**
	 * Returns all the thu chis.
	 *
	 * @return the thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thu chis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @return the range of thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the thu chis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of thu chis
	 * @param end the upper bound of the range of thu chis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thu chis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ThuChi> findAll(int start, int end,
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

		List<ThuChi> list = (List<ThuChi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THUCHI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THUCHI;

				if (pagination) {
					sql = sql.concat(ThuChiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ThuChi>(list);
				}
				else {
					list = (List<ThuChi>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the thu chis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ThuChi thuChi : findAll()) {
			remove(thuChi);
		}
	}

	/**
	 * Returns the number of thu chis.
	 *
	 * @return the number of thu chis
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

				Query q = session.createQuery(_SQL_COUNT_THUCHI);

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
	 * Initializes the thu chi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.ketoan.model.ThuChi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ThuChi>> listenersList = new ArrayList<ModelListener<ThuChi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ThuChi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ThuChiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THUCHI = "SELECT thuChi FROM ThuChi thuChi";
	private static final String _SQL_SELECT_THUCHI_WHERE = "SELECT thuChi FROM ThuChi thuChi WHERE ";
	private static final String _SQL_COUNT_THUCHI = "SELECT COUNT(thuChi) FROM ThuChi thuChi";
	private static final String _SQL_COUNT_THUCHI_WHERE = "SELECT COUNT(thuChi) FROM ThuChi thuChi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thuChi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ThuChi exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ThuChi exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ThuChiPersistenceImpl.class);
	private static ThuChi _nullThuChi = new ThuChiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ThuChi> toCacheModel() {
				return _nullThuChiCacheModel;
			}
		};

	private static CacheModel<ThuChi> _nullThuChiCacheModel = new CacheModel<ThuChi>() {
			@Override
			public ThuChi toEntityModel() {
				return _nullThuChi;
			}
		};
}