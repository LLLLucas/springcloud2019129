package com.lucas.feign;

import com.lucas.entity.Student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider")

public interface ProviderFeign {
    @GetMapping("/provider/findAll")
    public List<Student> finAll();
    @GetMapping("/provider/index")
    public String index();
}
