package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationController {

    @GetMapping("/data")
    public String showData(@RequestParam int sno,
                           @RequestParam String sname) {

        System.out.println("StudentOperationController.showData()");
        System.out.println("request param values " + sno + "---" + sname);

        return "show_report"; // logical view name
    }
}