package com.example.CrudWithJPA.Controller;

import com.example.CrudWithJPA.Entity.StudentRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CrudJPAController {

    @RequestMapping(value = "addStudent", method = RequestMethod.POST)
    public void addStudentDetails(@RequestBody StudentRequest stduentRequest) {

    }
}
