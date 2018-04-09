package com.cnk.qiye.mapper;

import com.cnk.qiye.pojo.CCoefficient;

/**
 * 难度表
 * @author 黄山
 *
 */
public interface CCoefficientMapper {
	
	/**
	 * 根据id查询难度系数
	 */
	public CCoefficient selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除难度系数
	 */
	public void deleteByPrimaryKey(Long id);
	
	/**
	 * 插入难度系数
	 */
	public void insert(CCoefficient cCoefficient);
	
	/**
	 * 根据id更新难度系数
	 */
	public void updateByPrimaryKey(CCoefficient cCoefficient);
}