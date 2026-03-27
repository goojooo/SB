package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IActorADAO;
import com.example.demo.vo.ActorVO;

@Service
public class GetActorDetailsImpl implements IGetActorDetails {

	@Autowired
	private  IActorADAO dao;
	@Override
	public List<ActorVO> showActorDetails() throws SQLException {
		return  dao.getAllActorDetails();
	}

}
