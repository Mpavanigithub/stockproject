package com.infinite.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStockMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String sid;
		System.out.println("Enter Stockid ");
		sid = sc.next();
		StockDAO dao = new StockDAO();
		try {
			System.out.println(dao.searchStock(sid));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
