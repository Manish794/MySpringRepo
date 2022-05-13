package com.manish.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "datarest_users")
@Data
public class UserEntity {

	@Id
	@GenericGenerator(name = "user_id_generator", strategy = "com.manish.spring.id.UserIdGenerator")
	@GeneratedValue(generator = "user_id_generator")
	private String uid;
	private String fullName;
	private String email;
	private long phone;
	private String password;
}
