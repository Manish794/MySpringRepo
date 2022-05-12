package com.manish.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manish.spring.entity.UserEntity;

@Repository
public interface MyUserRepository extends JpaRepository<UserEntity, String> {
	
	UserEntity findByEmail(String email);
	UserEntity findByEmailAndPassword(String email, String password);
	List<UserEntity> findAllByPhone(long phone);
	
}
