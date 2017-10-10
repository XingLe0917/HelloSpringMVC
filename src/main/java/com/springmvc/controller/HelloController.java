package com.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//url:  http://localhost:8081/HelloSpringMVC/hello/mvc

@Controller 
@RequestMapping(value="/hello")  //类级别的RequestMapping，告诉DispatcherServlet由这个类负责处理以及URL。HandlerMapping依靠这个标签来工作
public class HelloController {
		
	    @RequestMapping(value="/mvc",method=RequestMethod.GET)  
	    public String HelloWorld(Model model){  
	        model.addAttribute("message","Hello Spring MVC.");  
	        return "HelloWorld";  
	    }  
	    
	    @RequestMapping(value="/cookie",method=RequestMethod.GET)  
	    public String cookie(HttpServletRequest request, 
                HttpServletResponse response,Model model){  
	        model.addAttribute("message","Hello Spring MVC.");  
	        response.addCookie(new Cookie("userName", "xingle")); 
	        Cookie[] cookies = request.getCookies(); 
	        if (cookies != null) { 
	            for (Cookie cookie : cookies) { 
	                if (cookie.getName().equals("userName")) { 
	                    String userName = cookie.getValue(); 
//	                    System.out.println(userName);
	                    model.addAttribute("userName",userName);  
	                } 
	            } 
	        } 
	        return "HelloWorld";  
	    }  
	    
}
