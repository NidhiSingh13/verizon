package com.springBoot.com.springBoot.Example;


import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

//import static org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver.setDefaultLocale;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
    @Bean
    public LocaleResolver localResolver() {
    	SessionLocaleResolver localeObj = new SessionLocaleResolver();
    	localeObj.setDefaultLocale(Locale.US);
    	return  localeObj;
    	
    }
    
    //As we are using localecontextHandler at controller place use AcceptHeaderLocaleResolver in place of the SessionLocaleResolver as we
    //have to tell your application that we are accepting  header
    
    
//  @Bean
//  public LocaleResolver localResolver() {
//  	AcceptHeaderLocaleResolver localeObj = new AcceptHeaderLocaleResolver();
//  	localeObj.setDefaultLocale(Locale.US);
//  	return  localeObj;
//  }
 
  
//    @Bean
//    public ResourceBundleMessageSource bundleMessage() {
//    	ResourceBundleMessageSource src = new ResourceBundleMessageSource();
//    	src.setBasename("messages");
//    	return src;
//    			
//    }
}
