package com.bach.devsecondlms.login.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bach.devsecondlms.login.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService loginService;

    @PostMapping("/select")
    public @ResponseBody Map<String, Object> select(@RequestBody Map<String, Object> param) {
        Map<String, Object> result = new HashMap<>();
		Map<String, Object> data = (Map<String, Object>) param.get("data");
        
        loginService.select(data);
        
        return result;
    }
}