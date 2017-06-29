package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//url:  http://localhost:8080/HelloSpringMVC/hello/mvc

@Controller 
@RequestMapping(value="/hello")  //类级别的RequestMapping，告诉DispatcherServlet由这个类负责处理以及URL。HandlerMapping依靠这个标签来工作
public class HelloController {
		
	    @RequestMapping(value="/mvc",method=RequestMethod.GET)  
	    public String HelloWorld(Model model){  
		  
	        model.addAttribute("message","Hello Spring MVC!!!");  
	       
	        return "HelloWorld";  
	    }  
}
