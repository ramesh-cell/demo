package com.inetsolv.demo.repositories;

import com.inetsolv.demo.entities.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<Subject,String> {
}
