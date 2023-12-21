package com.bach.devsecondlms.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bach.devsecondlms.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

    @RequestMapping("/")
    public String main() {
    	return "login";
    }
    
    @PostMapping("/select")
    public @ResponseBody Map<String, Object> select(@RequestBody Map<String, Object> param) {
    	Map<String, Object> data = new HashMap<>();

    	Map<String, Object> result = loginService.select(param);
    	
    	return result;
    }
}