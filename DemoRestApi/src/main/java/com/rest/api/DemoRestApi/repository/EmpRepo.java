package com.rest.api.DemoRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.DemoRestApi.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
