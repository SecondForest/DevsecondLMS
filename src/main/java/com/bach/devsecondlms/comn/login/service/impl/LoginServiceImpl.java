package com.bach.devsecondlms.comn.login.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bach.devsecondlms.comn.login.mapper.LoginMapper;
import com.bach.devsecondlms.comn.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public Map<String, Object> select(Map<String, Object> map) {
		return loginMapper.select(map);
	}

}