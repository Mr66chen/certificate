package com.cnk.qiye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CPhotoCategory;
import com.cnk.qiye.service.photocategory.PhotoCategoryService;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
@Controller
@RequestMapping("/test")
public class PhotoCategoryController {
	@Autowired
	private PhotoCategoryService photocategoryservice;
	
	/**
	 * 插入图片类目数据
	 */
	@RequestMapping("/insertPhotocategory")
	public void insert() {
		CPhotoCategory cphotocategory=new CPhotoCategory();
		cphotocategory.setId((long) 22);
		cphotocategory.setPhotoCategoryName("bb");
		cphotocategory.setPhotoCategoryDesc("b");
		cphotocategory.setPhotoCategoryStatus(true);
		photocategoryservice.insert(cphotocategory);
	}
	
	/**
	 * 根据id删除图片类目数据
	 */
	@RequestMapping("/deletePhotocategoryByPrimaryKey")
	public void deleteByPrimaryKey() {
		CPhotoCategory cphotocategory=new CPhotoCategory();
		cphotocategory.setId((long) 22);
		photocategoryservice.deleteByPrimaryKey(cphotocategory.getId());
	}
	
	/**
	 * 根据id修改图片类目数据
	 */
	@RequestMapping("/updatePhotocategoryByPrimaryKey")
	public void updateByPrimaryKey() {
		CPhotoCategory cphotocategory=new CPhotoCategory();
		cphotocategory.setId((long) 22);
		cphotocategory.setPhotoCategoryName("cc");
		cphotocategory.setPhotoCategoryDesc("c");
		cphotocategory.setPhotoCategoryStatus(false);
		photocategoryservice.updateByPrimaryKey(cphotocategory, 22);
	}
	
	/**
	 * 根据id查图片类目数据
	 */
	@RequestMapping("/selectPhotocategoryByPrimaryKey")
	public CommonResult selectByPrimaryKey() {
		long id = 22;
		CommonResult result = photocategoryservice.selectByPrimaryKey(id);
		return result;
	}
}







