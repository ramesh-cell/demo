package com.inetsolv.demo.repositories;

import com.inetsolv.demo.entities.Department;
import com.inetsolv.demo.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department,String> {
}
