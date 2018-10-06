package com.example.CrudWithJPA.Controller;

import com.example.CrudWithJPA.Entity.StudentRequest;
import com.example.CrudWithJPA.repo.CrudWithJPARepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class CrudJPAController {

    @Autowired
    private CrudWithJPARepo repo;

    Logger logger = LoggerFactory.getLogger(CrudJPAController.class);

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public StudentRequest addStudentDetails(@RequestBody StudentRequest stduentRequest) {

       return repo.save(stduentRequest);

    }

    @RequestMapping(value = "/findByID/{id}", method = RequestMethod.GET)
    public Optional<StudentRequest> findById(@PathVariable long id) {
         StudentRequest result = new StudentRequest();
         logger.info("id is" +id);
         return repo.findById(id);
    }

    @RequestMapping(value="/findAll", method = RequestMethod.GET)
    public List<StudentRequest> findAll() {

        List<StudentRequest> lis = new ArrayList<StudentRequest>();
        repo.findAll().forEach(lis::add);
        return lis;

    }

    @RequestMapping(value="/findByName/{name}", method = RequestMethod.GET)
    public List<StudentRequest> findByName(@PathVariable String name) {

        List<StudentRequest> lis = new ArrayList<StudentRequest>();
        return repo.findByName(name);

    }

}
