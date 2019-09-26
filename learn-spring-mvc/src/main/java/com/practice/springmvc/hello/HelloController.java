package com.practice.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		final ModelAndView helloView = new ModelAndView("HelloPage");
		helloView.addObject("welcomeMessage", "Hi there, welcome to spring mvc!");
		return helloView;
	}

}
