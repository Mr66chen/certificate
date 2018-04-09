package com.cnk.qiye.mapper;

import java.util.List;

import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CColloge;
import com.cnk.qiye.pojo.CMajor;

/**
 * 专业表
 * @author 付方舟
 *
 */
public interface CMajorMapper {
	
	
	/*
	 * 查询专业列表
	 */
	public List<CMajor> selectList();
	
	/*
	 * 插入专业
	 */
	public void insert(CMajor cMajor);
	
	/*
	 * 根据id删除专业
	 */
	public void deleteByPrimaryKey(Long id);
	
	/*
	 * 传入一个pojo，根据id更新专业
	 */
	public void updateByPrimaryKey(CMajor cMajor);
	
	/*
	 * 根据id查询专业，返回一个pojo
	 */
	public CMajor selectByPrimaryKey(Long id);
}