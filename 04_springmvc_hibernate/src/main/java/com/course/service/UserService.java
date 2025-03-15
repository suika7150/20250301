package com.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.Dao.UserDao;
import com.course.entity.User;

@Service
public class UserService {

	 @Autowired
	    private UserDao userDao; 
	    
	    /**
	     * 檢查登入邏輯
	     * @param username
	     * @param password
	     * @return
	     */
	    public User checkUser(String username, String password) {
	        User user = userDao.findByUsername(username);

	        // 檢查帳號是否存在
	        if (user != null) {
	            // 檢查密碼是否正確
	            if (password.equals(user.getPassword())) {
	                return user;
	            }
	        }
	        return null;
	    }
	
}
