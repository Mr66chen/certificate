package com.cnk.qiye.service.cHot.impl;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CHotMapper;
import com.cnk.qiye.pojo.CHot;
import com.cnk.qiye.service.cHot.CHotService;

/**
 * 热度service实现
 * @author Fury
 * 
 */
@Service
public class CHotServiceImpl implements CHotService {
	private Logger log = LogManager.getLogger(getClass());
	@Autowired
	CHotMapper cHotMapper;

	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		try {
			CHot cHot=cHotMapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询热度成功",cHot);
		} catch (Exception e) {
			log.error("CHotServiceImpl:根据id查询热度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询热度失败",null);
	}

	@Override
	public CommonResult deleteByPrimaryKey(Long id) {
		try {
			cHotMapper.deleteByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id删除热度成功",null);
		} catch (Exception e) {
			log.error("CHotServiceImpl:根据id删除热度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id删除热度失败",null);
	}

	@Override
	public CommonResult insert(CHot cHot) {
		try {
			cHotMapper.insert(cHot);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"添加热度成功",null);
		} catch (Exception e) {
			log.error("CHotServiceImpl:添加热度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"添加热度失败",null);
	}

	@Override
	public CommonResult updateByPrimaryKey(CHot cHot) {
		try {
			cHotMapper.updateByPrimaryKey(cHot);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id更新热度成功",null);
		} catch (Exception e) {
			log.error("CHotServiceImpl:根据id更新热度失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id更新热度失败",null);
	}

}
