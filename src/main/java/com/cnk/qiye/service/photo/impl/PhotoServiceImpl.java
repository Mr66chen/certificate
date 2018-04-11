package com.cnk.qiye.service.photo.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CPhotoMapper;
import com.cnk.qiye.pojo.CPhoto;
import com.cnk.qiye.service.photo.PhotoService;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
@Service
public class PhotoServiceImpl implements PhotoService {
	
	private Logger log = LogManager.getLogger(getClass());
	
	@Autowired
	private CPhotoMapper cphotomapper;
	/**
	 * 插入图片数据
	 */
	@Override
	public void insert(CPhoto cphoto) {
		cphotomapper.insert(cphoto);		
	}
	/**
	 * 根据id删除图片数据
	 */
	@Override
	public void deleteByPrimaryKey(long id) {
		try {
			cphotomapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id删除图片失败");
			e.printStackTrace();
		}
	}
	/**
	 * 根据id修改图片数据
	 */
	@Override
	public void updateByPrimaryKey(CPhoto cphoto, long id) {
		
		try {
			if(id==cphoto.getId()) {
				cphotomapper.updateByPrimaryKey(cphoto);
			}
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id修改图片失败");
			e.printStackTrace();
		}
	}
	/**
	 * 根据id查图片数据
	 */
	@Override
	public CommonResult selectByPrimaryKey(long id) {
		CPhoto cPhoto;
		try {
			cPhoto = cphotomapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询图片成功",cPhoto);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id查询图片失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询图片失败",null);
		
	}
	
	
	
}
