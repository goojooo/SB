package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;

@Controller
public class StudentOperationController {
	//Homepage
	@GetMapping
	public String showWelcomePage()
	{
		System.out.println("StudentOperationController.showWelcomePage()");
		
		return "welcome";
	}
	
	//show registration
	@GetMapping("/register")
	public String showStudentRegistrationForm()
	{
		System.out.println("StudentOperationController.showStudentRegistrationForm()");
		return "register_student";
	}
	
    @PostMapping("/register")
    public String registerStudent(@ModelAttribute("stud") Student s,
                                  Map<String, Object> map) {

        System.out.println("Register method called");

        String result;

        if (s.getAverage() <= 35) {
            result = "Fail";
        } else if (s.getAverage() < 50) {
            result = "Third Class";
        } else if (s.getAverage() < 60) {
            result = "Second Class";
        } else if (s.getAverage() < 75) {
            result = "First Class";
        } else {
            result = "Distinction";
        }

        // store result in model
        map.put("resultMsg", result);
        map.put("studData", s);

        return "display"; // display.jsp
    }
}
