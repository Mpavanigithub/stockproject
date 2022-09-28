package com.infinite.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class StockDAO {
	Connection connection;
    PreparedStatement pst;
    
    public Stock searchStock(String sid)
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Stock where stockid=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, sid);
		ResultSet rs = pst.executeQuery();
		Stock stock = null;
		if(rs.next()) {
			stock = new Stock();
			stock.setStockid(rs.getString("stockId"));
			stock.setItemName(rs.getString("ItemName"));
			stock.setPrice(rs.getDouble("Price"));
			stock.setQuantityAvail(rs.getInt("QuantityAvail"));
			
		}
		return stock;
    	
    }
    
    public String addStock(Stock stock)
    		throws ClassNotFoundException, SQLException {
    connection = ConnectionHelper.getConnection();
    String cmd = "insert into Stock(stockid,ItemName,Price,QuantityAvail)"+"values(?,?,?,?)";
    pst = connection.prepareStatement(cmd);
    pst.setString(1,stock.getStockid());
    pst.setString(2,stock.getItemName());
    pst.setDouble(3,stock.getPrice());
    pst.setInt(4,stock.getQuantityAvail());
    pst.executeUpdate();
    return "Item Inserted";
    }
    
    
    
    public String generatestockid()
    		throws ClassNotFoundException, SQLException{
    	String cmd = "select max(stockId) sid from stock ";
    connection = ConnectionHelper.getConnection();
    pst = connection.prepareStatement(cmd);
    ResultSet rs = pst.executeQuery();
    rs.next();
    String stockid = rs.getString("sid");
    int id=Integer.parseInt(stockid.substring(1));
    id++;
    stockid=String.format("S%03d", id);
    return stockid;
    
    }

}
