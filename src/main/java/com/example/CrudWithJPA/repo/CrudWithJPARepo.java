package com.example.CrudWithJPA.repo;

import com.example.CrudWithJPA.Entity.StudentRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrudWithJPARepo extends CrudRepository<StudentRequest, Long> {

    List<StudentRequest> findByName(String name);


}
