package com.Infinite.Agent;

import java.sql.SQLException;
import java.util.Scanner;

public class AddAgentMain {
	public static void main(String[] args) {
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter agent Name ");
		agent.setName(sc.next());
		System.out.println("Enter city ");
		agent.setCity(sc.next());
		//System.out.println("Enter  Gender");
		//agent.setGender(sc.next());
		System.out.println("Enter maritalstatus ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter premium ");
		agent.setPremium(sc.nextDouble());
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.addAgent(agent));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
