package com.Infinite.Agent;

public class Agent {
	private int AgentId;
	private String Name;
	private String City;
	private Gender gender;
	private int MaritalStatus;
	private double Premium;
	public int getAgentId() {
		return AgentId;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", Name=" + Name + ", City=" + City + ", gender=" + gender
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	public Agent(int agentId, String name, String city, Gender gender, int maritalStatus, double premium) {
	
		AgentId = agentId;
		Name = name;
		City = city;
		this.gender = gender;
		MaritalStatus = maritalStatus;
		Premium = premium;
	}
	public Agent() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
