package com.bach.devsecondlms.comn.login;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
	public Map<String, Object> select(Map<String, Object> map);
}
