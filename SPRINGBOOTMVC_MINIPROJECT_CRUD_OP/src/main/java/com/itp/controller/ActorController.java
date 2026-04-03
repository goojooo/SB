package com.itp.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itp.service.IGetActorSDetails;
import com.itp.vo.ActorVo;

@Controller
public class ActorController {
	@Autowired 
	private IGetActorSDetails service;
	  
	  //handler method for display home page
	  @GetMapping("/")
	  public String showWelcomePage()
	  {
		  System.out.println("ActorController.showWelcomePage()");
		  return "welcome";
	  }
      
	  @GetMapping("/report")
	  //handler for registration
	  public String showReport(Map<String,Object>map) throws SQLException
	  {
		  List<ActorVo> list=service.showActorDetails();
		  map.put("listVo", list);
		  return "show_report";
	  }
	  @GetMapping("/register")
	    public String showAddActorFormPage(@ModelAttribute("actor")ActorVo vo) {

	        System.out.println("ActorOperationsController.showAddActorFormPage()");

	        return "register_actor_form";
	    }
	  
	  @PostMapping("/register")
	  public String registerActor(Map<String, Object> map,
	                             @ModelAttribute("actor") ActorVo vo)throws SQLException {

	      System.out.println("ActorOperationsController.registerActor()");

	      // use services
	      String msg = service.registerActor(vo);

	      List<ActorVo> listVo = service.showActorDetails();

	      map.put("resultMsg", msg);
	      map.put("listVo", listVo);

	      return "show_report";
	  }
	  @GetMapping("/remove")
	  public String removeActorById(@RequestParam("no") int id,
	                               Map<String, Object> map) throws SQLException {

	      String msg = service.deleteActor(id);

	      map.put("resultMsg", msg);

	      return "forward:report";
	      
	  }
	  
	// ✅ EDIT
	    @GetMapping("/edit")
	    public String edit(@RequestParam("no") int id,
	                       @ModelAttribute("actor") ActorVo vo) throws SQLException {

	        ActorVo a = service.getActorById(id);

	        vo.setAid(a.getAid());
	        vo.setAname(a.getAname());
	        vo.setAddrs(a.getAddrs());
	        vo.setCat(a.getCat());
	        vo.setFees(a.getFees());

	        return "edit_actor_form";
	    }

	    // ✅ UPDATE
	    @PostMapping("/edit")
	    public String update(Map<String, Object> map,
	                         @ModelAttribute("actor") ActorVo vo) throws SQLException {

	        map.put("resultMsg", service.updateActor(vo));
	        map.put("listVo", service.showActorDetails());

	        return "show_report";
	    }
	  
	  
	  
}