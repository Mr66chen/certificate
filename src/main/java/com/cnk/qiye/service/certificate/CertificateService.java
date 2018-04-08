package com.cnk.qiye.service.certificate;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CCertificate;

public interface CertificateService {

	/**
	 * 根据id查询证书信息
	 */
	public CommonResult selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除证书
	 */
	public CommonResult deleteByPrimaryKey(Long id);
	
	/**
	 * 插入（添加）证书
	 */
	public CommonResult insert(CCertificate cCertificate);
	
	/**
	 * 根据id更新证书信息
	 */
	public CommonResult updateByPrimaryKey(CCertificate cCertificate);
	
}

