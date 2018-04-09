package com.cnk.qiye.service.cIntroduce.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CIntroduceMapper;
import com.cnk.qiye.pojo.CHot;
import com.cnk.qiye.pojo.CIntroduce;
import com.cnk.qiye.service.cIntroduce.CIntroduceService;
@Service
public class CIntroduceServiceImpl implements CIntroduceService {
	private Logger log = LogManager.getLogger(getClass());
	@Autowired
	CIntroduceMapper cIntroduceMapper;
	
	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		try {
			CIntroduce cIntroduce=cIntroduceMapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询证书详细介绍表成功",cIntroduce);
		} catch (Exception e) {
			log.error("CIntroduceServiceImpl:根据id查询证书详细介绍表失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询证书详细介绍表失败",null);
	}

	@Override
	public CommonResult deleteByPrimaryKey(Long id) {
		try {
			cIntroduceMapper.deleteByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id删除证书详细介绍表成功",null);
		} catch (Exception e) {
			log.error("CIntroduceServiceImpl:根据id删除证书详细介绍表失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id删除证书详细介绍表失败",null);
	}

	@Override
	public CommonResult insert(CIntroduce cIntroduce) {
		try {
			cIntroduceMapper.insert(cIntroduce);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"添加证书详细介绍表成功",null);
		} catch (Exception e) {
			log.error("CIntroduceServiceImpl:添加证书详细介绍表失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"添加证书详细介绍表失败",null);
	}

	@Override
	public CommonResult updateByPrimaryKey(CIntroduce cIntroduce) {
		try {
			cIntroduceMapper.updateByPrimaryKey(cIntroduce);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"更新证书详细介绍表成功",null);
		} catch (Exception e) {
			log.error("CIntroduceServiceImpl:更新证书详细介绍表失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"更新证书详细介绍表失败",null);
	}

}
