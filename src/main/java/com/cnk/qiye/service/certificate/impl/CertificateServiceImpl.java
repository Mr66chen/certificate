package com.cnk.qiye.service.certificate.impl;

import org.apache.logging.log4j.LogManager;
/**
 *证书service实现 
 * @author Fury
 */
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CCertificateMapper;
import com.cnk.qiye.pojo.CCertificate;
import com.cnk.qiye.service.certificate.CertificateService;
@Service
public class CertificateServiceImpl implements CertificateService {
	private Logger log = LogManager.getLogger(getClass());
	
	@Autowired
	CCertificateMapper cCertificateMapper;

	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		try {
			CCertificate cCertificate=cCertificateMapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询证书成功",cCertificate);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id查询证书失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询证书失败",null);
	}

	@Override
	public CommonResult deleteByPrimaryKey(Long id) {
		try {
			cCertificateMapper.deleteByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id删除证书成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id删除证书失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id删除证书失败",null);
	}

	@Override
	public CommonResult insert(CCertificate cCertificate) {
		try {
			cCertificateMapper.insert(cCertificate);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"添加证书成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:添加证书失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"添加证书失败",null);
	}

	@Override
	public CommonResult updateByPrimaryKey(CCertificate cCertificate) {
		try {
			cCertificateMapper.updateByPrimaryKey(cCertificate);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id更新证书成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id更新证书失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id更新证书失败",null);

	}

}
