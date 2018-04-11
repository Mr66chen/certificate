package com.cnk.qiye.service.memberimpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.constant.StatusConstant;
import com.cnk.qiye.mapper.CMemberMapper;
import com.cnk.qiye.pojo.CMember;
import com.cnk.qiye.service.member.MemberService;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
@Service
public class MemberServiceImpl implements MemberService{
	
	private Logger log = LogManager.getLogger(getClass());
	
	@Autowired
	private CMemberMapper cmembermapper;
	/**
	 * 增加会员数据
	 */
	@Override
	public void insert(CMember cmember) {
		
		cmembermapper.insert(cmember);
	}
	/**
	 * 根据id删除会员数据
	 */
	@Override
	public void deleteByPrimaryKey(Long id) {
		try {
			cmembermapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id删除会员失败");
			e.printStackTrace();
		}
		
	}
	/**
	 * 根据id修改会员数据
	 */
	@Override
	public void updateByPrimaryKey(CMember cmember,long id) {
		try {
			if(id==cmember.getId()) {
				cmembermapper.updateByPrimaryKey(cmember);
			}
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id修改会员失败");
			e.printStackTrace();
		}
		
	}
	/**
	 * 根据id查找会员数据
	 */
	@Override
	public CommonResult selectByPrimaryKey(Long id) {
		CMember cmember;
		try {
			cmember = cmembermapper.selectByPrimaryKey(id);
			return new CommonResult(StatusConstant.SUCCESS.getCode(),"根据id查询会员成功",cmember);
		} catch (Exception e) {
			log.error("CertificateServiceImpl:根据id查询图片失败");
			e.printStackTrace();
		}
		return new CommonResult(StatusConstant.FAILD.getCode(),"根据id查询会员失败",null);
	}
	



}
