package com.eq.dao.common;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public abstract class AbstractImpl<E extends BaseEntity> implements BaseInte<E> {

	protected Class<E> entityClass;

	public AbstractImpl(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEM();

	@Override
	public <PK> E getReference(PK id) {
		return getEM().getReference(this.entityClass, id);
	}

	@Override
	public <PK> void delete(PK id) {
		E entity = get(id);
		getEM().remove(entity);
	}

	@Override
	public void deleteEntity(E entity) {
		getEM().remove(entity);
	}

	@Override
	public <PK> E get(PK id) {
		return getEM().find(this.entityClass, id);
	}

	@Override
	public void save(E entity) {
		getEM().persist(entity);
	}

	@Override
	public void update(E entity) {
		getEM().merge(entity);
	}

	@Override
	public Long count(String qlString, Map<String, Object> paramValues) {
		TypedQuery<Long> countQuery = getEM().createQuery(qlString, Long.class);
		setParametersToQuery(countQuery, paramValues);
		try {
			return countQuery.getSingleResult();
		} catch (NoResultException e) {
			return 0l;
		}
	}

	@Override
	public <X> List<X> findList(String qlString, Class<X> retType, Map<String, Object> paramValues) {
		return null;
	}

	@Override
	public List<E> findList(String qlString, Map<String, Object> paramValues) {
		TypedQuery<E> query = getEM().createQuery(qlString, this.entityClass);
		setParametersToQuery(query, paramValues);
		return query.getResultList();
	}

	@Override
	public E findOne(String qlString, Map<String, Object> paramValues) {
		TypedQuery<E> query = getEM().createQuery(qlString, this.entityClass);
		setParametersToQuery(query, paramValues);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public <X> List<X> findPageList(String qlString, Class<X> retType, int startRow, int pageSize,
			Map<String, Object> paramValues) {
		assert startRow >= 0;
		assert pageSize >= 0;

		TypedQuery<X> query = getEM().createQuery(qlString, retType);
		setParametersToQuery(query, paramValues);
		if (pageSize != 0)
			query.setFirstResult(startRow).setMaxResults(pageSize);
		return query.getResultList();
	}

	@Override
	public List<E> findPageList(String qlString, int startRow, int pageSize, Map<String, Object> paramValues) {
		assert startRow >= 0;
		assert pageSize >= 0;

		TypedQuery<E> query = getEM().createQuery(qlString, this.entityClass);
		setParametersToQuery(query, paramValues);
		if (pageSize != 0)
			query.setFirstResult(startRow).setMaxResults(pageSize);
		return query.getResultList();
	}

	protected void setParametersToQuery(Query query, Map<String, Object> paramValues) {
		for (Map.Entry<String, Object> entry : paramValues.entrySet())
			query.setParameter(entry.getKey(), entry.getValue());
	}

}
