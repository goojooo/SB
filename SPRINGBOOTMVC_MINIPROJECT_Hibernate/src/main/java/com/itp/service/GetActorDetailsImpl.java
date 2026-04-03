package com.itp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.repository.IActorDao;
import com.itp.vo.ActorVo;
@Service
public class GetActorDetailsImpl  implements IGetActorSDetails {
  
	@Autowired
	private IActorDao dao;
	
	@Override
	public List<ActorVo> showActorDetails() throws SQLException {
	 //TODO Auto-generated method stub
		return dao.getAllActorDetails();
	}

	@Override
	public String registerActor(ActorVo vo)throws SQLException  {
		  int result= dao.registerActorRepo(vo);
				if(result >0)
					return"Registration succesful";
				else
					return"Registration Failed";

	        
	    }
	@Override
	public String deleteActor(int id) throws SQLException {

	    int count = dao.deleteActorById(id);
	    if (count == 0) {
	        return "Actor not found with id: " + id;
	    }

	    return id + " Actor is deleted";
	}

	 // ✅ GET BY ID
    @Override
    public ActorVo getActorById(int id) {
        return dao.getActorById(id);
    }


	@Override
	public String updateActor(ActorVo vo) {
		 int count = dao.updateActorRepo(vo);
		    if (count == 0) {
		        return "Actor not updated with id: " + vo;
		    }

		    return vo + " Actor is updated Successfully";
		}


}
