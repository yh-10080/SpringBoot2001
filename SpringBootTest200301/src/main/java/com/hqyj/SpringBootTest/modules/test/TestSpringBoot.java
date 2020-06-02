package com.hqyj.SpringBootTest.modules.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestSpringBoot {

	/**
	 * 127.0.0.1/test.desc
	 * @return
	 */
	@RequestMapping("/test/desc")
	@ResponseBody
	public String addTestDsce(){
		return "This is spring module";
	}
	
}
