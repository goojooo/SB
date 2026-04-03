package com.itp.repository;

import java.sql.SQLException;
import java.util.List;

import com.itp.vo.ActorVo;

public interface IActorDao {
   
	public List<ActorVo> getAllActorDetails() throws SQLException;

	public int registerActorRepo(ActorVo vo)throws SQLException;

	public int deleteActorById(int id);

	ActorVo getActorById(int id);
	public int updateActorRepo(ActorVo vo);


	
}
