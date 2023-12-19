package com.bach.devsecondlms.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bach.devsecondlms.mapper.LoginMapper;

@Service
public class LoginService {
	@Autowired
	private LoginMapper loginMapper;

	public void select(Map<String, Object> data) {
		// TODO Auto-generated method stub
		
	}
	
}
