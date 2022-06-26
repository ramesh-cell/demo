package com.inetsolv.demo.repositories;

import com.inetsolv.demo.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {


    List<Student> findByName(String name);
    Student findByEmailAndName(String email,String name);
    Student findByNameOrEmail(String email,String name);

    List<Student> findByDepartmentDepartmentName(String deptname);

    List<Student> findBySubjectsSubjectName(String subName);

    List<Student> findByEmailIsLike(String email);

    List<Student> findByNameStartsWith(String name);

}
