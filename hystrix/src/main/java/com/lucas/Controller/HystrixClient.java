package com.lucas.Controller;

import com.lucas.entity.Student;
import com.lucas.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hystrix")
public class HystrixClient {
    @Autowired
    private ProviderFeign feign;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return feign.finAll();
    }
    @GetMapping("/index")
    public String index(){
        return feign.index();
    }
}
