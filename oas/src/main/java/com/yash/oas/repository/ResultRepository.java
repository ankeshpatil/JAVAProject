package com.yash.oas.repository;

import java.util.List;

import com.yash.oas.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
	
//	@Query("Select r from Result r where r.email =:email")
//	public List<Result> findByEmailEmail(@Param(value = "email") String email);
	public List<Result> findByEmailEmail(String email);

}
