package com.manish.spring.repo;

import java.util.Base64;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manish.spring.domain.Login;
import com.manish.spring.domain.User;
import com.manish.spring.entity.UserEntity;
import com.manish.spring.transformer.UserTransformer;

@Repository
public class UserRepository {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public User addUser(User user) {
		user.setUid(null);
		UserEntity userEntity = UserTransformer.transformUser(user);
		entityManager.persist(userEntity);
		return UserTransformer.transformUserEntity(userEntity);
	}

	public User login(Login login) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserEntity> criteriaQuery = builder.createQuery(UserEntity.class);
		Root<UserEntity> root = criteriaQuery.from(UserEntity.class);
		criteriaQuery.select(root);

		Predicate emailPre = builder.equal(root.get("email"), login.getEmail());
		Predicate passPre = builder.equal(root.get("password"),
				Base64.getEncoder().encodeToString(login.getPassword().getBytes()));
		criteriaQuery.where(builder.and(emailPre, passPre));

		Query q = entityManager.createQuery(criteriaQuery);
		return UserTransformer.transformUserEntity((UserEntity) q.getSingleResult());
	}

	@Transactional
	public User updateUser(User reqUser) {
		UserEntity entity = entityManager.find(UserEntity.class, reqUser.getUid());
		if (entity == null) {
			return null;
		}
		UserTransformer.updateUserEntity(entity, reqUser);
		entityManager.merge(entity);
		return UserTransformer.transformUserEntity(entity);
	}

	public List<User> getAllUser() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserEntity> criteriaQuery = builder.createQuery(UserEntity.class);
		Root<UserEntity> root = criteriaQuery.from(UserEntity.class);
		criteriaQuery.select(root);

		Query q = entityManager.createQuery(criteriaQuery);
		List<UserEntity> entities = q.getResultList();
		return UserTransformer.transformUserEntities(entities);
	}

	public User searchUser(String uid) {
		UserEntity entity = entityManager.find(UserEntity.class, uid);
		if (entity == null) {
			return null;
		}
		return UserTransformer.transformUserEntity(entity);
	}

	public User searchUserByEmail(String email) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserEntity> criteriaQuery = builder.createQuery(UserEntity.class);
		Root<UserEntity> root = criteriaQuery.from(UserEntity.class);
		criteriaQuery.select(root);

		Predicate pr1 = builder.equal(root.get("email"), email);
		criteriaQuery.where(pr1);

		Query q = entityManager.createQuery(criteriaQuery);
		return UserTransformer.transformUserEntity((UserEntity) q.getSingleResult());
	}

	public List<User> searchUserByPhone(Long phone) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserEntity> criteriaQuery = builder.createQuery(UserEntity.class);
		Root<UserEntity> root = criteriaQuery.from(UserEntity.class);
		criteriaQuery.select(root);

		Predicate pr1 = builder.equal(root.get("phone"), phone);
		criteriaQuery.where(pr1);

		Query q = entityManager.createQuery(criteriaQuery);
		List<UserEntity> entities = q.getResultList();
		return UserTransformer.transformUserEntities(entities);
	}

	@Transactional
	public boolean deleteAllUser() {

		return false;
	}

	@Transactional
	public boolean deleteUser(String uid) {
		UserEntity entity = entityManager.find(UserEntity.class, uid);
		if (entity == null) {
			return false;
		}
		entityManager.remove(entity);
		return true;
	}

}
