package com.cnk.qiye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/houtai")
	public String gohoutai(){
		System.out.println("go Index");
		return "indexq";
	}
	
	@RequestMapping("/{page}")
	public String goPage(@PathVariable String page){
		System.out.println(page);
		return page;
	}
	
	@RequestMapping("/tab")
	public String goTab(){
		System.out.println("go Tab");
		return "tab";
	}
}
