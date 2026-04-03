package com.example.demo.repository;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.vo.ActorVO;

public interface IActorADAO { // What to do

	public List<ActorVO> getAllActorDetails() throws SQLException;
	public int registerActorRepo(ActorVO vo) throws SQLException;
}
