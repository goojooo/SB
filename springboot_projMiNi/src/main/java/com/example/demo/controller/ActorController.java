package com.example.demo.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/register")
	public String registerActor()
	{
		
	}
	
	@PostMapping("/register")
	public String registerActor(Map<String, Object> map,
			@ModelAttribute("actor") ActorVO vo ) throws SQLException {
		System.out.println("ActorController.registerActor()");
		
		return "show_report";
	}
	
	@GetMapping("/remove")
	public String removeActorById(@RequestParam("no") int id, 
			Map<String, Object> map) {
		String msg = service.deleteActor(id);
		map.put("resultMsg", msg);
		
		return "forward:report";
	}
	
}

