package com.microservices.servicediscovery.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.servicediscovery.bean.Promotion;

@RestController
public class PromotionService {

	@Autowired
	private DiscoveryClient discoveryClient;
	
//	ADD PROMOTION
	@RequestMapping(value = "/promotion", method=RequestMethod.POST)
	public ResponseEntity<Promotion> add(@RequestBody Promotion promo) {
		Connection c = null;
	    Statement stmt = null;
	    String sql = "";
		try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	         stmt = c.createStatement();
	         sql = "INSERT INTO PROMOTIONS (name, method, type, description, expDate, amount, min, max)" + String.format("VALUES ('%s', '%s', '%s', '%s', '%s', %d, %d, %d);", promo.getName(), promo.getMethod(), promo.getType(), promo.getDescription(), promo.getExpDate(), promo.getAmount(), promo.getMin(), promo.getMax());
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	         
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
		return new ResponseEntity<Promotion>(promo, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/promotion/product", method=RequestMethod.POST)
	public ResponseEntity<Promotion> add2(@RequestBody Promotion promo) {
		Connection c = null;
	    Statement stmt = null;
	    String sql = "";
		try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	         stmt = c.createStatement();
	         sql = "INSERT INTO PROMOTIONS (name, method, type, description, expDate, amount, min, max)" + String.format("VALUES ('%s', '%s', '%s', '%s', '%s', %d, %d, %d);", promo.getName(), promo.getMethod(), promo.getType(), promo.getDescription(), promo.getExpDate(), promo.getAmount(), promo.getMin(), promo.getMax());
	         stmt.executeUpdate(sql);
	         
	         
	         sql = "SELECT id FROM PROMOTIONS WHERE name=\"" + promo.getName() + "\";";
	         ResultSet rs = stmt.executeQuery( sql );
	         int id = 0;
	         while ( rs.next() ) {
	             id = rs.getInt("id");
	             System.out.println( "ID = " + id );
	          }
	         
	         
	         sql = "INSERT INTO PRODUCT_PROMOTIONS (id, productId)" + String.format("VALUES (%d, %d);", id, promo.getProductId());
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
	         
	         
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
		return new ResponseEntity<Promotion>(promo, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/promotion", method=RequestMethod.GET)
	public  ResponseEntity<List<Promotion>> get() {
		
		ArrayList<Promotion> query = new ArrayList<Promotion>();
		
		Connection c = null;
	    Statement stmt = null;
	    String sql = "";
	    
		try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	         stmt = c.createStatement();
	         sql = "SELECT PROMOTIONS.id, PROMOTIONS.name, PROMOTIONS.method, PROMOTIONS.type, PROMOTIONS.description, PROMOTIONS.expDate, PROMOTIONS.amount, PROMOTIONS.min, PROMOTIONS.max, PRODUCT_PROMOTIONS.productId FROM PROMOTIONS LEFT JOIN PRODUCT_PROMOTIONS ON PROMOTIONS.id=PRODUCT_PROMOTIONS.id";
	         ResultSet rs = stmt.executeQuery( sql );
	         
	         
	         
	         while ( rs.next() ) {
	        	 Promotion temp = new Promotion(rs.getInt("id"), rs.getString("name"), rs.getString("method"), rs.getString("type"), rs.getString("description"), rs.getDate("expDate"), rs.getInt("amount"), rs.getInt("min"), rs.getInt("max"), rs.getInt("productId"));
	        	 System.out.println('1');
	        	 query.add(temp);
	          }
	         
	         
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
		
		 return new ResponseEntity<List<Promotion>>(query, HttpStatus.OK);
	}

	@RequestMapping(value = "/shiba", method=RequestMethod.GET)
	public String shiba() {
		return "SHIBA IS THE CUTEST DOG IN THE UNIVERSE";
	}
}
