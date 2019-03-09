package com.lyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 作者 lyj
 * @version 创建时间：2019年3月9日 下午10:29:06
 * 类说明
 */
@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(){
		return "hello";
	}
	
	@GetMapping("center")
	public String center(){
		return "center";
	}
	
}
