package com.test.demoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demoapi.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}