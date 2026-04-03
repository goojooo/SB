package com.itp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itp.vo.ActorVo;
@Repository 
public class ActorDaoImpl implements IActorDao{
    //select query
	private static final  String GeT_All_query="select id,name,address,category,fees from actor_table";
	 // INSERT QUERY
    private static final String INSERT_QUERY =
            "INSERT INTO actor_table(name, address, category, fees) VALUES(?,?,?,?)";

    // DELETE QUERY
    private static final String DELETE_QUERY =
            "DELETE FROM actor_table WHERE id=?";

    private static final String GET_BY_ID =
            "SELECT id,name,address,category,fees FROM actor_table WHERE id=?";
    
    
    
    // UPDATE QUERY
    private static final String UPDATE_QUERY =
            "UPDATE actor_table SET name=?, address=?, category=?, fees=? WHERE id=?";

	
	
	
	@Override
	public List<ActorVo> getAllActorDetails() throws SQLException  {
		
		List<ActorVo> list=new ArrayList<>();
		// create query
		try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Bollywood", "root", "Root");
			//create prepared statement object
			 PreparedStatement ps = con.prepareStatement(GeT_All_query);
			 
			   ResultSet rs = ps.executeQuery()){
			   
			 while(rs.next())
			 {   
				 //create empty of object
				 ActorVo vo=new ActorVo();
				 vo.setAid(rs.getInt("id"));
				 vo.setAname(rs.getString("name"));
	             vo.setAddrs(rs.getString("address"));
	             vo.setCat(rs.getString("category"));
	             vo.setFees(rs.getDouble("fees"));
	             list.add(vo);
			 }
			 
		}
		return list;
	}




	@Override
	public int registerActorRepo(ActorVo vo) {

	    int result = 0;
	    //ResultSet rs = null;

	    try (Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/Bollywood", "root", "gojo");

	         PreparedStatement ps = con.prepareStatement(INSERT_QUERY)) {

	        ps.setString(1, vo.getAname());
	        ps.setString(2, vo.getAddrs());
	        ps.setString(3, vo.getCat());
	        ps.setDouble(4, vo.getFees());
            //returns 1 if success
	        result = ps.executeUpdate();
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }

	    return result;
	}
	
	@Override
	public int deleteActorById(int id) {

	    int count = 0;

	    try (
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/Bollywood", "root", "gojo");

	        PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
	    ) {

	        ps.setInt(1, id);

	        count = ps.executeUpdate();
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }

	    return count;
	}

	@Override
    public ActorVo getActorById(int id) {

        ActorVo vo = null;

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Bollywood", "root", "gojo");

             PreparedStatement ps = con.prepareStatement(GET_BY_ID)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                vo = new ActorVo();
                vo.setAid(rs.getInt("id"));
                vo.setAname(rs.getString("name"));
                vo.setAddrs(rs.getString("address"));
                vo.setCat(rs.getString("category"));
                vo.setFees(rs.getDouble("fees"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return vo;
    }



	@Override
	public int updateActorRepo(ActorVo vo) {
		int count = 0;

	    try (
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/Bollywood", "root", "gojo");

	        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
	    ) {

	        ps.setString(1, vo.getAname());
	        ps.setString(2, vo.getAddrs());
	        ps.setString(3, vo.getCat());
	        ps.setDouble(4, vo.getFees());
	        ps.setInt(5, vo.getAid());

	        count = ps.executeUpdate();
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }

	    return count;
	}
}
