package com.manish.spring.id;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.util.CollectionUtils;

import com.manish.spring.entity.UserEntity;

public class UserIdGenerator implements IdentifierGenerator {
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String newId = "U-001";
		CriteriaBuilder builder = session.getFactory().getCriteriaBuilder();
		CriteriaQuery<UserEntity> query = builder.createQuery(UserEntity.class);
		Root<UserEntity> root = query.from(UserEntity.class);
		query.select(root).orderBy(builder.desc(root.get("uid")));

		Query q = session.createQuery(query);
		List resultList = q.setMaxResults(1).getResultList();
		if (!CollectionUtils.isEmpty(resultList)) {
			UserEntity userEntity = (UserEntity) resultList.get(0);
			String userId = userEntity.getUid();
			if (null != userId) {
				int id = Integer.parseInt(userId.substring(2));
				id++;
				if (id < 10) {
					newId = "U-00" + id;
				} else if (id < 100) {
					newId = "U-0" + id;
				} else {
					newId = "U-" + id;
				}
			}
		}
		return newId;
	}

}
