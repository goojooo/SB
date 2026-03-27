package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.vo.ActorVO;

public interface IGetActorDetails {

	public List <ActorVO> showActorDetails() throws SQLException;
}
