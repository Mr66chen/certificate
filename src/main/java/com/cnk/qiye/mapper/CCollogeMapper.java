package com.cnk.qiye.mapper;

import java.util.List;

import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CColloge;

/**
 * 学院表
 * @author 付方舟
 *
 */
public interface CCollogeMapper {
	
	/*
	 * 查询学院列表
	 */
	public List<CColloge> selectList();
	
	/*
	 * 增加学院
	 */
	public void insert(CColloge colloge);
	
	/*
	 * 根据id删除学院
	 */
	public void deleteByPrimaryKey(Long id);
	
	/*
	 * 传入一个pojo，根据id更新学院
	 */
	public void updateByPrimaryKey(CColloge colloge);
	
	/*
	 * 根据id查询学院，返回一个pojo
	 */
	public CColloge selectByPrimaryKey(Long id);
}