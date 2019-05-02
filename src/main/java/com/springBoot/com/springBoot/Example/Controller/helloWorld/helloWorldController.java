package com.springBoot.com.springBoot.Example.Controller.helloWorld;





import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api")
public class helloWorldController {
	
	@Autowired
	 MessageSource bundleMessage;
	
	
	@RequestMapping(method= RequestMethod.GET,path="/hello-world")
	public String getHelloWorld()
	{
		return "hello world";
	}
	
	@RequestMapping(method= RequestMethod.GET,path="/hello-world-bean")
	public BeanClass getBean() {
	 return new BeanClass("hello from Bean");
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/hello-world-bean-getOne")
	public Bean getHelloWorldBean() {
		return new Bean("hello world from another bean");
	}
	@RequestMapping(method=RequestMethod.GET,path="/pathVariable/{name}")
	public Bean getByPathVariable(@PathVariable String name) {
		System.out.println(name);
		return new Bean(String.format("hello welcome to the world of Spring Boot,%s", name));
	}
	
//	@RequestMapping(method=RequestMethod.GET,path="/hello-world-internalization")
//	public String getByInteranlization(@RequestHeader(name="Accept-language",required=true)Locale locale) {
//		return bundleMessage.getMessage("good.morning.message",null, locale);
//	}
	
	
	//LocaleContextHolder.getLocale() USED TO GET LOCALE FROM REQUEST HANDLER WE DONO HAVE TO PASS @RequestHeader
	@RequestMapping(method=RequestMethod.GET,path="/hello-world-internalization")
	public String getByInteranlization() {
		return bundleMessage.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
	}
}
