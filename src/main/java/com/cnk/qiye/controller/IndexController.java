package com.cnk.qiye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 首页
 * @author 黄山
 *
 */
@Controller
public class IndexController {

	/**
	 * 跳转前台首页
	 * @return
	 */
	@RequestMapping("/")
	public String goIndex(){
		System.out.println("go Index");
		return "index";
	}
	
	@RequestMapping("/tab")
	public String goTab(){
		System.out.println("go Tab");
		return "tab";
	}
}
