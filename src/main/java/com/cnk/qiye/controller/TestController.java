package com.cnk.qiye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.service.certificate.CertificateService;

/**
 * 测试controller
 * @author 黄山
 *
 */
@RestController

public class TestController {
	
	@Autowired
	private CertificateService certificateService;

	@RequestMapping("/test")
	public CommonResult selectByPrimaryKey(){
		Long id = 1L;
		CommonResult result = certificateService.selectByPrimaryKey(id);
		return result;
	}
}
