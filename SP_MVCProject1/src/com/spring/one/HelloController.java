package com.spring.one;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HelloController {

	@RequestMapping("/hello.ds")
	public String disp(@RequestParam("name")String name,Model m) {
		// TODO Auto-generated method stub
		System.out.println("HelloController.disp()");
		m.addAttribute("msg","Hello..."+name);
		return "success";
	}
}
