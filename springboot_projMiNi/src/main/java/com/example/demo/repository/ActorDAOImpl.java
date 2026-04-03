package com.example.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.vo.ActorVO;

@Repository
public class ActorDAOImpl implements IActorADAO {

	private static final String selectQuery = "select actorID, actorName, actorAddr, actorCategory, actorFees from actors";
	private static final String insertQuery = "";
	@Override
	public List<ActorVO> getAllActorDetails() throws SQLException {
		
		List<ActorVO> list = new ArrayList<>();
		
			try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bollywood","root","gojo");
					PreparedStatement ps = con.prepareStatement(selectQuery);
					ResultSet rs = ps.executeQuery())
			{
				while (rs.next())
				{
					ActorVO vo = new ActorVO();
					vo.setActorID(rs.getInt(1));
					vo.setActorName(rs.getString(2));
					vo.setActorAddr(rs.getString(3));
					vo.setActorCategory(rs.getString(4));
					vo.setActorFees(rs.getInt(5));
					list.add(vo);				
				}
			}
			
		
		return list;
	}

	@Override
	public int registerActorRepo(ActorVO vo) throws SQLException {
		int result = 0;
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bollywood","root","gojo");
					PreparedStatement ps = con.prepareStatement(insertQuery)){
			
		}
					
		return 0;
	}

}
