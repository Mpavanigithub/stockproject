package com.infinite.inventory;

public class Stock {
	private String  stockid;
	private String ItemName;
	private double Price;
	private int QuantityAvail;
	
	
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		this.ItemName = itemName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	public int getQuantityAvail() {
		return QuantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.QuantityAvail = quantityAvail;
	}
	@Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", ItemName=" + ItemName + ", Price=" + Price + ", QuantityAvail="
				+ QuantityAvail + "]";
	}
	public Stock(String stockid, String itemName, double price, int quantityAvail) {
		
		this.stockid = stockid;
		ItemName = itemName;
		Price = price;
		QuantityAvail = quantityAvail;
	}
	public Stock() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
