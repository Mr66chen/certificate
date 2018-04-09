package com.cnk.qiye.service.cHot;

import com.cnk.qiye.common.CommonResult;

import com.cnk.qiye.pojo.CHot;
/**
 * 热度service
 * @author Fury
 */
public interface CHotService {
	/**
	 * 根据id查询热度
	 */
	public CommonResult selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除热度
	 */
	public CommonResult deleteByPrimaryKey(Long id);
	
	/**
	 * 插入热度
	 */
	public CommonResult insert(CHot cHot);
	
	/**
	 * 根据id更新热度
	 */
	public CommonResult updateByPrimaryKey(CHot cHot);


}
