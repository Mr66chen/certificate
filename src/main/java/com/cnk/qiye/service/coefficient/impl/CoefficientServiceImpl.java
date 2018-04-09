package com.cnk.qiye.service.coefficient.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CCoefficientMapper;
import com.cnk.qiye.pojo.CCoefficient;
import com.cnk.qiye.service.coefficient.CoefficientService;

/**
 * 
 * 难度系数service实现
 * @author Fury
 */
@Service
public class CoefficientServiceImpl implements CoefficientService {
	private Logger log = LogManager.getLogger(getClass());

	@Autowired
	CCoefficientMapper cCoefficientMapper;

	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		try {
			CCoefficient cCoefficient = cCoefficientMapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(), "根据id查询难度成功", cCoefficient);
		} catch (Exception e) {
			log.error("CoefficientServiceImpl:根据id查询难度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(), "根据id查询难度失败", null);
	}

	@Override
	public CommonResult deleteByPrimaryKey(Long id) {
		try {
			cCoefficientMapper.deleteByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(), "根据id删除难度成功", null);
		} catch (Exception e) {
			log.error("CoefficientServiceImpl:根据id删除难度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(), "根据id删除难度失败", null);
	}

	@Override
	public CommonResult insert(CCoefficient cCoefficient) {
		try {
			cCoefficientMapper.insert(cCoefficient);
			return new CommonResult(StatusConstant.SUCCESS.getCode(), "添加难度成功", null);
		} catch (Exception e) {
			log.error("CoefficientServiceImpl:添加难度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(), "添加难度失败", null);
	}

	@Override
	public CommonResult updateByPrimaryKey(CCoefficient cCoefficient) {
		try {
			cCoefficientMapper.updateByPrimaryKey(cCoefficient);
			return new CommonResult(StatusConstant.SUCCESS.getCode(), "根据id更新难度成功", null);
		} catch (Exception e) {
			log.error("CoefficientServiceImpl:根据id更新难度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(), "根据id更新难度失败", null);
		
	}

}
