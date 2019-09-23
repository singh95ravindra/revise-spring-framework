package com.practice.springmvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		final ModelAndView helloView = new ModelAndView("HelloPage");
		helloView.addObject("welcomeMessage", "Hi there, welcome to spring mvc!");
		return helloView;
	}

}
