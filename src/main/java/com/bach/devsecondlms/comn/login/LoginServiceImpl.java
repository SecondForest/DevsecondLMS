package com.bach.devsecondlms.comn.login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bach.devsecondlms.comn.login.LoginMapper;
import com.bach.devsecondlms.comn.login.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public Map<String, Object> select(Map<String, Object> map) {
		return loginMapper.select(map);
	}

}