package com.manish.spring.transformer;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.manish.spring.domain.User;
import com.manish.spring.entity.UserEntity;

public class UserTransformer {

	public static UserEntity transformUser(User user) {
		if (user != null) {
			UserEntity entity = new UserEntity();
			entity.setUid(user.getUid());
			entity.setFullName(user.getFullName());
			entity.setEmail(user.getEmail());
			entity.setPhone(user.getPhone());
			entity.setPassword(Base64.getEncoder().encodeToString(user.getPassword().getBytes()));
			return entity;
		}
		return null;
	}

	public static User transformUserEntity(UserEntity entity) {
		if (entity != null) {
			return User.builder()
					.uid(entity.getUid())
					.fullName(entity.getFullName())
					.email(entity.getEmail())
					.phone(entity.getPhone())
					.password(entity.getPassword())
					.build();
		}
		return null;
	}
	
	public static List<User> transformUserEntities(List<UserEntity> entities) {
		if (entities != null) {
			List<User> users = new ArrayList<>();
			for(UserEntity entity : entities) {
				users.add(transformUserEntity(entity));
			}
			return users;
		}
		return null;
	}
	

	public static void updateUserEntity(UserEntity entity, User user) {
		if (user != null && entity != null) {
			entity.setUid(user.getUid());
			entity.setFullName(user.getFullName());
			entity.setEmail(user.getEmail());
			entity.setPhone(user.getPhone());
			entity.setPassword(Base64.getEncoder().encodeToString(user.getPassword().getBytes()));
		}

	}

}
