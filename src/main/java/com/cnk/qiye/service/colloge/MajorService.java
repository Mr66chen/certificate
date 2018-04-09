package com.cnk.qiye.service.colloge;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CMajor;

/**
 * 专业service
 * @author 黄山
 *
 */
public interface MajorService {

	//查询学院列表
	public CommonResult findMajorList();
	
	/**
	 * 根据id查询专业
	 */
	public CommonResult selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除专业
	 */
	public CommonResult deleteByPrimaryKey(Long id);
	
	/**
	 * 插入（添加）专业
	 */
	public CommonResult insert(CMajor cMajor);
	
	/**
	 * 根据id更新专业
	 */
	public CommonResult updateByPrimaryKey(CMajor cMajor);
}
