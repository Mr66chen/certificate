package com.cnk.qiye.service.member;

import com.cnk.qiye.common.CommonResult;
import com.cnk.qiye.pojo.CMember;


/**
* @author Nazzey 
* @date 2018年4月9日  
*/
public interface MemberService {
	/**
	 * 增加会员数据
	 */
	public void insert(CMember cmember);
	
	/**
	 * 删除会员数据
	 */
	public void deleteByPrimaryKey(Long id);
	
	/**
	 * 修改会员数据
	 */
	public void updateByPrimaryKey(CMember cmember, long id);
	
	/**
	 * 查找会员数据
	 */
	public CommonResult selectByPrimaryKey(Long id);

	
}
