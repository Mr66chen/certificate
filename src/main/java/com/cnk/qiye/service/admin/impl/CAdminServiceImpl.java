package com.cnk.qiye.service.admin.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CAdminMapper;
import com.cnk.qiye.mapper.CCertificateMapper;
import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CCertificate;
import com.cnk.qiye.service.admin.CAdminService;

@Service
public class CAdminServiceImpl implements CAdminService {

	private Logger log = LogManager.getLogger(getClass());

	@Autowired
	CAdminMapper cAdminMapper;

	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		try {
			CAdmin cAdmin= cAdminMapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询管理员信息成功",cAdmin);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id查询管理员信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询管理员信息失败",null);
	}

	@Override
	public CommonResult deleteByPrimaryKey(Long id) {
		try {
			cAdminMapper.deleteByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id删除管理员信息成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id删除管理员信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id删除管理员信息失败",null);
	}

	@Override
	public CommonResult insert(CAdmin cAdmin) {
		try {
			cAdminMapper.insert(cAdmin);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"添加管理员信息成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:添加管理员信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"添加管理员信息失败",null);
	}

	@Override
	public CommonResult updateByPrimaryKey(CAdmin cAdmin) {
		try {
			cAdminMapper.updateByPrimaryKey(cAdmin);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id更新管理员信息成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id更新管理员信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id更新管理员信息失败",null);
	}

}
