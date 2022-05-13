package com.manish.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.manish.spring.entity.UserEntity;

@RepositoryRestResource(path = "users")
public interface MyUserRepository extends JpaRepository<UserEntity, String> {
	
	UserEntity findByEmail(String email);
	UserEntity findByEmailAndPassword(String email, String password);
	List<UserEntity> findAllByPhone(long phone);
	List<UserEntity> findAllByFullName(String fullName);
	List<UserEntity> findAllByEmailIn(List<String> emails);
	
}
