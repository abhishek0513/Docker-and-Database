package com.example.spring_docker_with_Database;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Students>getStudents(){
//        return List.of(
//                new Students(1, "John", 32),
//                new Students(3, "Smith", 12),
//                new Students(5, "Philip", 38)
//        );
        return repo.findAll();

    }
}
