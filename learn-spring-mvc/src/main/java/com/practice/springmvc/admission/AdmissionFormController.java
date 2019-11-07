package com.practice.springmvc.admission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionFormController {

	@RequestMapping(value = "/admission-form", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		final ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	@RequestMapping(value = "/submit-admission-form", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
			@RequestParam("standard") String standard) {
		final ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you are as Name - " + name + " Class Name - " + standard);
		return model;
	}
}
