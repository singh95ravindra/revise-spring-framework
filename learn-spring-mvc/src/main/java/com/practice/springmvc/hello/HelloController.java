package com.practice.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome/{name}")
	public ModelAndView helloWorld(@PathVariable("name") String name) {
		final ModelAndView helloView = new ModelAndView("HelloPage");
		helloView.addObject("welcomeMessage", "welcome " + name);
		return helloView;
	}

}
