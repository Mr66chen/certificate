package com.cnk.qiye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CIntroduce;
import com.cnk.qiye.service.cHot.CHotService;
import com.cnk.qiye.service.cIntroduce.CIntroduceService;
import com.cnk.qiye.service.certificate.CertificateService;
import com.cnk.qiye.service.coefficient.CoefficientService;

/**
 * 测试controller
 * @author 黄山
 *
 */
@RestController

public class TestController {
	
	@Autowired
	private CoefficientService coefficientService;
	
	@Autowired
	private CHotService cHotService;
	
	@Autowired
	private CIntroduceService cIntroduceService;
	

	@RequestMapping("/test")
	public CommonResult selectByPrimaryKey(){
		Long id = 1L;
		CommonResult result = cIntroduceService.selectByPrimaryKey(id);
		return result;
	}
}
