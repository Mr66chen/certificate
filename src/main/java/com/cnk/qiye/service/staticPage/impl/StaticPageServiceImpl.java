package com.cnk.qiye.service.staticPage.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.cnk.qiye.service.staticPage.StaticPageService;

import freemarker.template.Configuration;
import freemarker.template.Template;


/**
 * 证书静态页实现类
 * @author 黄山
 *
 */
public class StaticPageServiceImpl implements StaticPageService,ServletContextAware{

	//声明 注入
	private Configuration conf;
	private ServletContext servletContext;
	//手动注入 配置路径
	public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
		this.conf = freeMarkerConfigurer.getConfiguration();
	}
	
	/**
	 * 页面静态化
	 */
	@Override
	public void certificateStaticPage(Map<String, Object> root, String id) {
		Writer out = null;
		//输出全路径  ***证书的输出路径：/frontPage/certificate/开头
		String path = getPath("/frontPage/certificate/"+id+".html");
		File f = new File(path);
		File parentFile = f.getParentFile();
		if(!parentFile.exists()){
			parentFile.mkdirs();
		}
		try {
			//模板导入
			Template template = conf.getTemplate("index3.html");
			//输出路径
			out = new OutputStreamWriter(new FileOutputStream(f),"UTF-8");
			 //执行
			template.process(root, out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 为了获取上下文
	 */
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	//获取路径
	public String getPath(String name){
		return servletContext.getRealPath(name);
	}


}
