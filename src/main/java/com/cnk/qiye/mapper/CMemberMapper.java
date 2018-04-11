package com.cnk.qiye.mapper;

import com.cnk.qiye.pojo.CMember;


/**
 * 前台会员表
 * @author 黄山
 *
 */
public interface CMemberMapper {
	/**
	 * 增加会员数据
	 */
	public void insert(CMember cmember);
	
	/**
	 * 删除会员数据
	 */
	public void deleteByPrimaryKey(long id);
	
	/**
	 * 修改会员数据
	 */
	public void updateByPrimaryKey(CMember cmember);
	
	/**
	 * 查找会员数据
	 */
	public CMember selectByPrimaryKey(long id);
}