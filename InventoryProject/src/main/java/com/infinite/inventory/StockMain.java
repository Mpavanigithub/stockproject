package com.infinite.inventory;

import java.sql.SQLException;
import java.util.Scanner;



public class StockMain {
	public static void main(String[] args) {
		StockDAO dao = new StockDAO();
		Stock stock = new Stock();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter ItemName ");
		stock.setItemName(sc.next());
		System.out.println("Enter Price ");
		stock.setPrice(sc.nextDouble());
		System.out.println("Enter QuantityAvail  ");
		stock.setQuantityAvail(sc.nextInt());
		try {
			System.out.println(dao.generatestockid());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}