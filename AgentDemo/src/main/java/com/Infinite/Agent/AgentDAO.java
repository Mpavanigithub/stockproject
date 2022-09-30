package com.Infinite.Agent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentDAO {
	 Connection connection;
     PreparedStatement pst;
     
     public String addAgent(Agent agent)
     		throws ClassNotFoundException, SQLException {
     connection = ConnectionHelper.getConnection();
     String cmd = "insert into Employ(Name,City, maritalStatus,premium)"+"values(?,?,?,?)";
     pst = connection.prepareStatement(cmd);
     pst.setString(1,agent.getName());
     pst.setString(2,agent.getCity());
     pst.setInt(3,agent.getMaritalStatus());
     pst.setDouble(4,agent.getPremium());
     pst.executeUpdate();
     return "Record Inserted";
      }
     public List<Agent> showAgent() throws ClassNotFoundException, SQLException{
     List<Agent> agentList = new ArrayList<Agent>();
     connection = ConnectionHelper.getConnection();
 	String cmd = "Select * from Agent";
 	pst = connection.prepareStatement(cmd);
 	ResultSet rs  =pst.executeQuery();
 	Agent agent = null;
 	while(rs.next()){
 		agent = new Agent();
 		agent.setAgentId(rs.getInt("AgentId"));
 		agent.setName(rs.getString("Name"));
 		agent.setCity(rs.getString("City"));
 		//agent.setGender(rs.gete("gender"));
 		agent.setMaritalStatus(rs.getInt("MaritalStatus"));
 		agent.setPremium(rs.getDouble("Premium"));
 		agentList.add(agent);
 		
 	}
 	return agentList;
 }

}
