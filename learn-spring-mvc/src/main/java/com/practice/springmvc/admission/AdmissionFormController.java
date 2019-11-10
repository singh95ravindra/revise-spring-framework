package com.practice.springmvc.admission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.springmvc.model.Student;

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
		final Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentStandard(standard);

		final ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("student1", student1);
		return model;
	}

	@RequestMapping(value = "/submit-admission-form2", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm2(@ModelAttribute("student1") Student student1) {

		final ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}
}
