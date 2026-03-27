package com.example.demo.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.IGetActorDetails;
import com.example.demo.vo.ActorVO;

@Controller
public class ActorController {

	@Autowired
	private IGetActorDetails service ;
	
	@GetMapping
		public String showPage()
		{
			System.out.println("ActorController.showPage()");
			
			return "welcome";
		}
	
	@GetMapping("/report")
	public String showReport(Map <String, Object> map) throws SQLException {
		List<ActorVO> list=service.showActorDetails();
		map.put("listDetails", list);
		
		return "show_report";
	}
}

