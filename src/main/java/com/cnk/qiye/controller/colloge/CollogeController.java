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
import com.cnk.qiye.pojo.CPhoto;
import com.cnk.qiye.service.colloge.CollogeService;
import com.cnk.qiye.service.colloge.MajorService;
import com.cnk.qiye.service.photo.PhotoService;

/**
 * 学院与专业controller
 * @author 黄山
 *
 */
@RestController
@RequestMapping("/certificate")
public class CollogeController {

	//返回的map
	private static Map<String,Object> collogeMap = new HashMap<>();
	private static Map<String,Object> majorMap = new HashMap<>();
	
	@Autowired
	private CollogeService collogeService;
	
	@Autowired
	private MajorService majorService;
	
	@Autowired
	private PhotoService photoService;
	
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
	
	@RequestMapping("couselPhoto/certificatePhoto")
	public Map<String,Object> catPhotoList(){
		CommonResult result = photoService.selectByPrimaryKey(1L);
		
		if(result.getCode()==StatusConstant.FAILD.getCode()){
			collogeMap.put("data", StatusConstant.FAILD.getMsg());
		}else{
			CPhoto data = (CPhoto)result.getData();
			collogeMap.put("data", data);
		}
		return collogeMap;
	}
}
