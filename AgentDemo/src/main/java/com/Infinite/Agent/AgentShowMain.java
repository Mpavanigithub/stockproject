package com.Infinite.Agent;

import java.sql.SQLException;
import java.util.List;

public class AgentShowMain {
	public static void main(String[] args) {
		AgentDAO dao = new AgentDAO();
		try {
			List<Agent> agentList  = dao.showAgent();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
	


