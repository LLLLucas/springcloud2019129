package com.lucas.controller;

import com.lucas.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        Student student=new Student();
        student.setId("1");
        student.setName("name1");
        student.setAddress("1");
        student.setAge("18");
        student.setTel("10081");
        Student student2=new Student();
        student2.setId("2");
        student2.setName("name2");
        student2.setAddress("2");
        student2.setAge("19");
        student2.setTel("10086");
        List<Student> s=new ArrayList<>();
        s.add(student);
        s.add(student2);
        return s;
    }
    @GetMapping("/index")
    public String index(){
        return "端口号是："+this.port;
    }
}
