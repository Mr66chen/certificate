package com.cnk.qiye.mapper;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CPhoto;
import com.cnk.qiye.pojo.CPhotoCategory;

/**
 * 图片类目
 * @author 黄山
 *
 */
public interface CPhotoCategoryMapper {
	/**
	 * 插入图片类目数据
	 */
	public void insert(CPhotoCategory cphotocategory);
	
	/**
	 * 删除图片类目数据
	 */
	public void deleteByPrimaryKey(Long id);
	
	/**
	 * 修改图片类目数据
	 */
	public void updateByPrimaryKey(CPhotoCategory cphotocategory);
	
	/**
	 * 查找图片类目数据
	 */
	public CPhotoCategory selectByPrimaryKey(Long id);
	
}