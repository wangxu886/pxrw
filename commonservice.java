package com.example.demo.Commonmapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DepartmentMapper;

@Service
public class CommonService {
	@Autowired
    public DepartmentMapper dep;
    public String login(String username, String password){
        return dep.login(username, password);
    }
}
