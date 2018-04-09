package com.cnk.qiye.service.cIntroduce;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CIntroduce;

public interface CIntroduceService {
	/**
	 * 根据id查询证书详细介绍表
	 */
	public CommonResult selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除证书详细介绍表
	 */
	public CommonResult deleteByPrimaryKey(Long id);
	
	/**
	 * 插入证书详细介绍表
	 */
	public CommonResult insert(CIntroduce cIntroduce);
	
	/**
	 * 根据id更新证书详细介绍表
	 */
	public CommonResult updateByPrimaryKey(CIntroduce cIntroduce);

}
