package com.cnk.qiye.mapper;

import com.cnk.qiye.pojo.CPhoto;

/**
 * 图片
 * @author 黄山
 *
 */
public interface CPhotoMapper {
	/**
	 * 插入图片数据
	 */
	public void insert(CPhoto cphoto);
	
	/**
	 * 删除图片数据
	 */
	public void deleteByPrimaryKey(Long id);
	
	/**
	 * 修改图片数据
	 */
	public void updateByPrimaryKey(CPhoto cphoto);
	
	/**
	 * 查找图片数据
	 */
	public CPhoto selectByPrimaryKey(Long id);
}