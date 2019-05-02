package com.springBoot.com.springBoot.Example.staticFilter;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilterClass {
	
	@RequestMapping(path="/get_static_filter_results",method = RequestMethod.GET)
	public staticFilterBean getBean() {
		return new staticFilterBean("value1","value2","value3");
	}

}
