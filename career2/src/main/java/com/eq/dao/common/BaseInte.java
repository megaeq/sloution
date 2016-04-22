package com.eq.dao.common;

import java.util.List;
import java.util.Map;

import com.eq.dao.common.BaseEntity;

public interface BaseInte<E extends BaseEntity> {
	public <PK> E getReference(PK id);

	public <PK> void delete(PK id);

	public void deleteEntity(E entity);

	public <PK> E get(PK id);

	public void save(E entity);

	public void update(E entity);

	public Long count(String qlString, Map<String, Object> paramValues);

	public <X> List<X> findList(String qlString, Class<X> retType, Map<String, Object> paramValues);

	public List<E> findList(String qlString, Map<String, Object> paramValues);

	public E findOne(String qlString, Map<String, Object> paramValues);

	public <X> List<X> findPageList(String qlString, Class<X> retType, int startRow, int pageSize,
			Map<String, Object> paramValues);

	public List<E> findPageList(String qlString, int startRow, int pageSize, Map<String, Object> paramValues);
}
