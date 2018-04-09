package com.cnk.qiye.mapper;

import com.cnk.qiye.pojo.CAdmin;

/**
 * 后台管理员
 * @author 付方舟
 *
 */
public interface CAdminMapper {
	/*
	 * 增加后台管理员
	 */
	public void insert(CAdmin cadmin);
	
	/*
	 * 根据id删除后台管理员
	 */
	public void deleteByPrimaryKey(Long id);
	
	/*
	 * 传入一个pojo，根据id更新后台管理员
	 */
	public void updateByPrimaryKey(CAdmin cadmin);
	
	/*
	 * 根据id查询后台管理员，查询后台管理员，返回一个pojo
	 */
	public CAdmin selectByPrimaryKey(Long id);
	
}