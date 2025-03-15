package com.course.Dao;

import org.springframework.stereotype.Repository;

import com.course.entity.User;

public class UserDaoImpl implements UserDao {
	
	@Repository
	public class UserDaoImpl implements UserDao {

		@Override
		public User findByUsername(String username) {
			// 呼叫DB
			return null;
		}

		@Override
		public void addUser(String username, String password) {
			System.out.println("Add User");
			
		}
	

}
