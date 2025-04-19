package com.course.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

	// SQL : select * from todo where title = ?
	public List<TodoEntity> findByTitle(String title);

	List<TodoEntity> findByDueDate(Date dueDate);
	
	// SQL : select * from todo where title = ? and status = ?
	List<TodoEntity> findByTitleAndStatus(String title, Integer status);
	
	// SQL語句：select * from todo where due_date > ?
	List<TodoEntity> findByDueDateGreaterThan(Date dueDate);
		
	// SQL語句：select * from todo where due_date between ? and ?
	List<TodoEntity> findByDueDateBetween(Date startDate, Date endDate);
		
	// SQL語句：select * from todo where title like ?
	List<TodoEntity> findByTitleLike(String title);
		
	// SQL語句：select * from todo where id in (?, ?, ?);
	List<TodoEntity> findByIdIn(List<Long> ids);
		
	// SQL語句：select * from todo order by title;
	List<TodoEntity> findAllByOrderByTitleDesc();
}
