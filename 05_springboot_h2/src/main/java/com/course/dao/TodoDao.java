package com.course.dao;

import com.course.TodoDto;

public interface TodoDao {

	void add(TodoDto todoDto);
	
	void update(TodoDto todoDto);
	
	void delete(Long id);
	
}
