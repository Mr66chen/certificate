package com.cnk.qiye.mapper;

import com.cnk.qiye.pojo.CIntroduce;

/**
 * 介绍表
 * @author 黄山
 *
 */
public interface CIntroduceMapper {
	/**
	 * 根据id查询证书详细介绍表
	 */
	public CIntroduce selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除证书详细介绍表
	 */
	public void deleteByPrimaryKey(Long id);
	
	/**
	 * 插入证书详细介绍表
	 */
	public void insert(CIntroduce cIntroduce);
	
	/**
	 * 根据id更新证书详细介绍表
	 */
	public void updateByPrimaryKey(CIntroduce cIntroduce);
}