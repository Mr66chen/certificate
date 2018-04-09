package com.cnk.qiye.controller.colloge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.pojo.CAdmin;
import com.cnk.qiye.pojo.CColloge;
import com.cnk.qiye.pojo.CMajor;
import com.cnk.qiye.service.colloge.CollogeService;
import com.cnk.qiye.service.colloge.MajorService;

/**
 * 学院与专业controller
 * @author 黄山
 *
 */
@RestController
@RequestMapping("/api")
public class CollogeController {

	//返回的map
	private static Map<String,Object> collogeMap = new HashMap<>();
	private static Map<String,Object> majorMap = new HashMap<>();
	
	@Autowired
	private CollogeService collogeService;
	
	@Autowired
	private MajorService majorService;
	/**
	 * 查询数据库，返回学院列表
	 * @return
	 */
	@RequestMapping("/verticalNav/colloge")
	public Map<String,Object> catCollogeList(){
		CommonResult result = collogeService.findCollogeList();
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			collogeMap.put("data", StatusConstant.FAILD.getMsg());
		}else{
			List<CColloge> data = (List<CColloge>)result.getData();
			collogeMap.put("data", data);
		}
		return collogeMap;
	}
	
	@RequestMapping("/	/insert")
	public CommonResult insert(){
		CColloge cColloge = new CColloge();
		cColloge.setId(1L);
		cColloge.setCollegeName("计算机");
		cColloge.setCollegeDesc("哈哈哈");
		cColloge.setCollegeStatus(true);
		CommonResult result = collogeService.insert(cColloge);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/controller/delete")
	public CommonResult delete(){
		CommonResult result = collogeService.deleteByPrimaryKey(1L);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/controller/select")
	public CommonResult select(){
		CommonResult result = collogeService.selectByPrimaryKey(1L);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/controller/updata")
	public CommonResult updata(){
		CColloge cColloge = new CColloge();
		cColloge.setId(1L);
		cColloge.setCollegeName("经管");
		cColloge.setCollegeDesc("呵呵呵");
		cColloge.setCollegeStatus(true);
		CommonResult result = collogeService.updateByPrimaryKey(cColloge);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/major/insert")
	public CommonResult Minsert(){
		CMajor cMajor = new CMajor();
		cMajor.setId(1L);
		cMajor.setMajorName("吃鸡");
		cMajor.setMajorDesc("呵呵呵");
		cMajor.setMajorStatus(true);
		cMajor.setCollogeId(1L);
		CommonResult result = majorService.insert(cMajor);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/major/delete")
	public CommonResult Mdelete(){
		CommonResult result = majorService.deleteByPrimaryKey(1L);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/major/select")
	public CommonResult Mselect(){
		CommonResult result = majorService.selectByPrimaryKey(1L);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	@RequestMapping("/major/updata")
	public CommonResult Mupdata(){
		CMajor cMajor = new CMajor();
		cMajor.setId(1L);
		cMajor.setMajorName("DOTA");
		cMajor.setMajorDesc("哈哈哈");
		cMajor.setMajorStatus(true);
		cMajor.setCollogeId(3L);
		CommonResult result = majorService.updateByPrimaryKey(cMajor);
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			return result;
		}else{
			return result;
		}
	}
	
	
}
