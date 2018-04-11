package com.cnk.qiye.service.photocategory;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CPhoto;
import com.cnk.qiye.pojo.CPhotoCategory;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
public interface PhotoCategoryService {
	/**
	 * 插入图片类目数据
	 */
	public void insert(CPhotoCategory cphotocategory);
	
	/**
	 * 删除图片类目数据
	 */
	public void deleteByPrimaryKey(long id);
	
	/**
	 * 修改图片类目数据
	 */
	public void updateByPrimaryKey(CPhotoCategory cphotocategory,long id);
	
	/**
	 * 查找图片类目数据
	 */
	public CommonResult selectByPrimaryKey(long id);
}
