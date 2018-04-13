package com.cnk.qiye.service.photocategory.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CPhotoCategoryMapper;
import com.cnk.qiye.pojo.CPhotoCategory;
import com.cnk.qiye.service.photocategory.PhotoCategoryService;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
@Service
public class PhotoCategoryServiceImpl implements PhotoCategoryService{
	
	private Logger log = LogManager.getLogger(getClass());
	
	@Autowired
	private CPhotoCategoryMapper cphotocategorymapper;
	/**
	 * 插入图片类目数据
	 */
	@Override	
	public void insert(CPhotoCategory cphotocategory) {
		cphotocategorymapper.insert(cphotocategory);
	}
	/**
	 * 根据id删除图片类目数据
	 */
	@Override
	public void deleteByPrimaryKey(long id) {
		try {
			cphotocategorymapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id删除图片类目失败");
			e.printStackTrace();
		}
	}
	/**
	 * 根据id修改图片类目数据
	 */
	@Override
	public void updateByPrimaryKey(CPhotoCategory cphotocategory,long id) {
		try {
			if(id==cphotocategory.getId()) {
				cphotocategorymapper.updateByPrimaryKey(cphotocategory);
			}
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id修改图片类目失败");
			e.printStackTrace();
		}
	}
	/**
	 * 根据id查图片类目数据
	 */
	@Override
	public CommonResult selectByPrimaryKey(long id) {
		CPhotoCategory cphotocategory;
		try {
			cphotocategory = cphotocategorymapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询图片类目成功",cphotocategory);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id查询图片类目失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询图片类目失败",null);
	}
	
}
