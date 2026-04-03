package com.itp.service;

import java.sql.SQLException;
import java.util.List;

import com.itp.vo.ActorVo;


public interface IGetActorSDetails {
    public List<ActorVo> showActorDetails()  throws SQLException;

	public String registerActor(ActorVo vo)throws SQLException;

	public String deleteActor(int id) throws SQLException;

	// ✅ UPDATE
    ActorVo getActorById(int id) throws SQLException;

    String updateActor(ActorVo vo) throws SQLException;
    
}
