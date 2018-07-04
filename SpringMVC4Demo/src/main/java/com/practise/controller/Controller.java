package com.practise.controller;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practise.model.StudentModel;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		StudentModel studentModel = new StudentModel();
		model.addAttribute("student",studentModel);
		return "enroll";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(@Valid StudentModel student,BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			model.addAttribute("student",student);
			return "enroll";
		}
		
		model.addAttribute("success","dear "+student.getFirstName()+", your Registration completed successfully");
		return "success";
		
	}
	
	
	@ModelAttribute("countries")
	public List<String> initializeCountries(){
		List<String> countries = new ArrayList<>();
			countries.add("USA");
	        countries.add("CANADA");
	        countries.add("FRANCE");
	        countries.add("GERMANY");
	        countries.add("ITALY");
	        countries.add("OTHER");
	        return countries;
		
	}
	
	/*@RequestMapping(value="/helloagain",method = RequestMethod.GET)
	public String sayHelloaAgain(ModelMap model) {
		model.addAttribute("greeting","Hello world again, from Spring 4 MVC");
		return "welcome";
	}	*/
}