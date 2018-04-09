package com.cnk.qiye.mapper;

import com.cnk.qiye.pojo.CCoefficient;
import com.cnk.qiye.pojo.CHot;

/**
 * 热度表
 * @author 黄山
 *
 */
public interface CHotMapper {
	
	/**
	 * 根据id查询热度
	 */
	public CHot selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除热度
	 */
	public void deleteByPrimaryKey(Long id);
	
	/**
	 * 插入热度
	 */
	public void insert(CHot cHot);
	
	/**
	 * 根据id更新热度
	 */
	public void updateByPrimaryKey(CHot cHot);
}