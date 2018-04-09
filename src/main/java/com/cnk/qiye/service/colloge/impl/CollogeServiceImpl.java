package com.cnk.qiye.service.colloge.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CCollogeMapper;
import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CColloge;
import com.cnk.qiye.service.colloge.CollogeService;

/**
 * 学院service实现
 * @author 黄山
 *
 */
@Service
public class CollogeServiceImpl implements CollogeService {

	private Logger log = LogManager.getLogger(getClass());
	
	@Autowired
	private CCollogeMapper cCollogeMapper;
	
	/**
	 * 查询学院列表
	 */
	@Override
	public CommonResult findCollogeList() {
		
		try {
			List<CColloge> list = cCollogeMapper.selectList();
			return new CommonResult(StatusConstant.SUCCESS.getCode(),StatusConstant.SUCCESS.getMsg() , list);
		} catch (Exception e) {
			e.printStackTrace();
			return new CommonResult(StatusConstant.FAILD.getCode(),"CollogeServiceImpl:查询学院列表失败", null);
		}
		
	}

	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		try {
			CColloge cColloge= cCollogeMapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询学院成功",cColloge);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id查询学院信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询学院信息失败",null);
	}

	@Override
	public CommonResult deleteByPrimaryKey(Long id) {
		try {
			cCollogeMapper.deleteByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id删除学院信息成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id删除学院信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id删除学院信息失败",null);
	}

	@Override
	public CommonResult insert(CColloge cColloge) {
		try {
			cCollogeMapper.insert(cColloge);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"添加学院信息成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:添加学院信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"添加学院信息失败",null);
	}

	@Override
	public CommonResult updateByPrimaryKey(CColloge cColloge) {
		try {
			cCollogeMapper.updateByPrimaryKey(cColloge);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id更新学院信息成功",null);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id更新学院信息失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id更新学院信息失败",null);
	}
	
	

}
