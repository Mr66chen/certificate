package com.cnk.qiye.service.colloge;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CColloge;


/**
 * 学院service
 * @author 付方舟
 *
 */
public interface CollogeService {

	//查询学院列表
	public CommonResult findCollogeList();
	
	/**
	 * 根据id查询管理员信息
	 */
	public CommonResult selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除管理员信息
	 */
	public CommonResult deleteByPrimaryKey(Long id);
	
	/**
	 * 插入（添加）管理员信息
	 */
	public CommonResult insert(CColloge cColloge);
	
	/**
	 * 根据id更新管理员信息
	 */
	public CommonResult updateByPrimaryKey(CColloge cColloge);
}
