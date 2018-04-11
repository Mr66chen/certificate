package com.cnk.qiye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CPhoto;
import com.cnk.qiye.service.photo.PhotoService;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
@Controller
@RequestMapping("/test")
public class PhotoController {
	
	@Autowired
	private PhotoService photoservice;
	/**
	 * 插入图片数据
	 */
	@RequestMapping("/insertPhoto")
	public void insert() {
		CPhoto cphoto=new CPhoto();
		cphoto.setId((long) 22);
		cphoto.setPhotoCategoryId((long) 2);
		cphoto.setPhotoTitle("b");
		cphoto.setPhotoDesc("b");
		photoservice.insert(cphoto);
	}
	/**
	 * 根据id删除图片数据
	 */
	@RequestMapping("/deletePhotoByPrimaryKey")
	public void deleteByPrimaryKey() {
		CPhoto cphoto=new CPhoto();
		cphoto.setId((long) 22);
		photoservice.deleteByPrimaryKey(cphoto.getId());
	}
	/**
	 * 根据id更新图片数据
	 */
	@RequestMapping("/updatePhotoByPrimaryKey")
	public void updateByPrimaryKey() {
		CPhoto cphoto=new CPhoto();
		cphoto.setId((long) 22);
		cphoto.setPhotoCategoryId((long) 3);
		cphoto.setPhotoTitle("c");
		cphoto.setPhotoDesc("c");
		photoservice.updateByPrimaryKey(cphoto,(long) 22);
	}
	/**
	 * 根据id查找图片数据
	 */
	@RequestMapping("/selectPhotoByPrimaryKey")
	public CommonResult selectByPrimaryKey() {
		long id = 22;
		CommonResult result = photoservice.selectByPrimaryKey(id);
		return result;
	}
};
