package com.lucas.controller;

import com.lucas.entity.Student;
import com.lucas.feign.ProviderFeign;
import com.lucas.feign.impl.FeignError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ProviderClient {
    @Autowired
    ProviderFeign providerFeign;
    @GetMapping("/findAll")
    public List<Student> findAll(){
        List<Student> students = providerFeign.finAll();
        return students;
    }
    @GetMapping("/index")
    public String index(){
        String index = providerFeign.index();
        return index;
    }
}
