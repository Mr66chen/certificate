package com.cnk.qiye.service.coefficient;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CCoefficient;
/**
 * 难度系数service
 * @author Fury
 * 
 */
public interface CoefficientService {

	/**
	 * 根据id查询难度系数
	 */
	public CommonResult selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除难度系数
	 */
	public CommonResult deleteByPrimaryKey(Long id);
	
	/**
	 * 插入（添加）难度系数
	 */
	public CommonResult insert(CCoefficient cCoefficient);
	
	/**
	 * 根据id更新难度系数
	 */
	public CommonResult updateByPrimaryKey(CCoefficient cCoefficient);
	
}

