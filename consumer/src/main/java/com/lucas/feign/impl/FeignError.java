package com.lucas.feign.impl;

import com.lucas.entity.Student;
import com.lucas.feign.ProviderFeign;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FeignError implements ProviderFeign
{
    @Override
    public List<Student> finAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
