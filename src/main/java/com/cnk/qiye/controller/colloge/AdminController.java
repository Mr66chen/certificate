package com.cnk.qiye.controller.colloge;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CColloge;
import com.cnk.qiye.service.admin.CAdminService;
import com.cnk.qiye.service.colloge.MajorService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private CAdminService cAdminSerivce;
	/**
	 * 插入管理员信息
	 * @return
	 */
	@RequestMapping("/insert")
	public CommonResult insert(){
		CAdmin cadmin = new CAdmin();
		cadmin.setId(3L);
		cadmin.setUsername("zhangsan");
		cadmin.setPassword("123456");
		cadmin.setSalt("哈哈");
		CommonResult result = cAdminSerivce.insert(cadmin);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/delete")
	public CommonResult delete(){
		CommonResult result = cAdminSerivce.deleteByPrimaryKey(3L);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/select")
	public CommonResult select(){
		CommonResult result = cAdminSerivce.selectByPrimaryKey(3L);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/updata")
	public CommonResult updata(){
		CAdmin cAdmin = new CAdmin();
		cAdmin.setId(1L);
		cAdmin.setUsername("lisi");
		cAdmin.setPassword("123456");
		cAdmin.setSalt("哈哈");
		CommonResult result = cAdminSerivce.updateByPrimaryKey(cAdmin);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
}
