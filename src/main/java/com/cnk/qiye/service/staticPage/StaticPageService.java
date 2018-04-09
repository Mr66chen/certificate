package com.cnk.qiye.service.staticPage;

import java.util.Map;

/**
 * 证书静态化页面service
 * @author 黄山
 *
 */
public interface StaticPageService {

	//静态化证书
	public void certificateStaticPage(Map<String,Object> root,String id);
}
