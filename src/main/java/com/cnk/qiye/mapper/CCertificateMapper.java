package com.cnk.qiye.mapper;

import com.cnk.qiye.pojo.CCertificate;

/**
 * 证书
 * @author 黄山
 *
 */
public interface CCertificateMapper {
	
	/**
	 * 根据id查询证书
	 */
	public CCertificate selectByPrimaryKey(Long id);
	
	/**
	 * 根据id删除证书
	 */
	public void deleteByPrimaryKey(Long id);
	
	/**
	 * 插入证书
	 */
	public void insert(CCertificate cCertificate);
	
	/**
	 * 根据id更新证书
	 */
	public void updateByPrimaryKey(CCertificate cCertificate);
}