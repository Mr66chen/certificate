package com.cnk.qiye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CMember;
import com.cnk.qiye.service.member.MemberService;

/**
* @author Nazzey 
* @date 2018年4月9日  
*/
@Controller
@RequestMapping("/test")
public class MemberController {
	
	@Autowired
	private MemberService memberservice;
	
	/**
	 * 增加会员数据
	 */
	@RequestMapping("/insertMember")
	public void insert() {	
		CMember cmember=new CMember();
		cmember.setId((long) 222);
		cmember.setUsername("fzy");
		cmember.setPassword("456789");
		cmember.setSalt("2");
		memberservice.insert(cmember);
	}
	
	/**
	 * 根据id删除会员数据
	 */
	@RequestMapping("/deleteMemberByPrimaryKey")
	public void deleteByPrimaryKey() {
		CMember cmember=new CMember();
		cmember.setId((long) 222);
		memberservice.deleteByPrimaryKey(cmember.getId());
	}
	/**
	 * 根据id修改会员数据
	 */
	@RequestMapping("/updateMemberByPrimaryKey")
	public void  updateByPrimaryKey() {	
		CMember cmember=new CMember();
		cmember.setId((long) 222);
		cmember.setUsername("fzy11");
		cmember.setPassword("456789");
		cmember.setSalt("3");
		memberservice.updateByPrimaryKey(cmember,cmember.getId());
	}
	/**
	 * 根据id查找会员数据
	 */
	@RequestMapping("/selectMemberByPrimaryKey")
	public CommonResult selectByPrimaryKey() {
		long id = 222;
		CommonResult result = memberservice.selectByPrimaryKey(id);
		return result;
	}
}
