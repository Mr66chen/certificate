package com.cnk.qiye.service.photo;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CPhoto;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
public interface PhotoService {
	/**
	 * 插入图片数据
	 */
	public void insert(CPhoto cphoto);
	/**
	 * 删除图片数据
	 */
	public void deleteByPrimaryKey(long id);
	
	/**
	 * 修改图片数据
	 */
	public void updateByPrimaryKey(CPhoto cphoto, long id);
	/**
	 * 查找图片数据
	 */
	public CommonResult selectByPrimaryKey(long id);
	
	

}
