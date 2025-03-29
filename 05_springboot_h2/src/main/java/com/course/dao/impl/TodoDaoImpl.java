package com.course.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.course.TodoDto;
import com.course.dao.TodoDao;

@Repository
public class TodoDaoImpl implements TodoDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(TodoDto todoDto) {
		String sql = "INSERT INTO TODO (TITLE, DUEDATE, STATUS) VALUES (?, ?, ?);";
	    jdbcTemplate.update(sql, todoItem.getTitle(), todoItem.getDueDate(), todoItem.getStatus());
	}

	@Override
	public void update(TodoDto todoDto) {
		String  = "INSERT INTO TODO (TITLE, DUEDATE, STATUS) VALUES (?, ?, ?);";
	    jdbcTemplate.update(sql, todoItem.getTitle(), todoItem.getDueDate(), todoItem.getStatus());
		
	}

	@Override
	public void delete(Long id) {
		String  = "INSERT INTO TODO (TITLE, DUEDATE, STATUS) VALUES (?, ?, ?);";
	    jdbcTemplate.update(sql, todoItem.getTitle(), todoItem.getDueDate(), todoItem.getStatus());
		
	}
	
}
