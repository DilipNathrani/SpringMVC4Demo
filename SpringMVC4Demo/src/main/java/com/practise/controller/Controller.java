package com.practise.controller;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practise.model.Student;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "enroll";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(@Valid  Student student,BindingResult result,Model model) {
		if(result.hasErrors()) {
			result.reject("firstName", "error");
			model.addAttribute("student",student);
			String a = result.getFieldError("LastName").toString();
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