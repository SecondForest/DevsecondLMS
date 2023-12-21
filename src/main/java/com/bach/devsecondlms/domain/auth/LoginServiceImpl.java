package com.bach.devsecondlms.domain.auth;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bach.devsecondlms.domain.auth.LoginMapper;
import com.bach.devsecondlms.domain.auth.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public Map<String, Object> select(Map<String, Object> map) {
		return loginMapper.select(map);
	}

}