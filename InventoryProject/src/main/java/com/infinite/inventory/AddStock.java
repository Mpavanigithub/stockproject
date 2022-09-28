package com.infinite.inventory;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStock {
	public static void main(String[] args) {
		Stock stock = new Stock();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stockid ");
		stock.setStockid(sc.next());
		System.out.println("Enter ItemName  ");
		stock.setItemName(sc.next());
		System.out.println("Enter Price");
		stock.setPrice(sc.nextDouble());
		System.out.println("Enter QuantityAvailable ");
		stock.setQuantityAvail(sc.nextInt());
		StockDAO dao = new StockDAO();
		try {
			System.out.println(dao.addStock(stock));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
