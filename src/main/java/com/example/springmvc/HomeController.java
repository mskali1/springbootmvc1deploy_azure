package com.example.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return ("index.jsp");
		
	}
	
//	@RequestMapping("add")
//	public String add(HttpServletRequest req) {
//		
//		int a = Integer.parseInt(req.getParameter("num1"));
//		int b = Integer.parseInt(req.getParameter("num2"));
//		
//		int c = a + b;
//		HttpSession session = req.getSession();
//		session.setAttribute("num3", c);
//		
//		return ("result.jsp");
//		
//	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j,HttpSession session) {
		
		
		int num3 = i + j;
		session.setAttribute("num3",num3 );
		return ("result.jsp");
	}

}



















