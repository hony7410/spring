package com.sh.starapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;

public class PostgresqlConnectionTest {

	private static final String URL = "com.postgresql.";
	
	
	@Test
	public void testConnection() throws Exception{
		String url = "jdbc:postgresql://localhost/postgres";
		Properties props = new Properties();
		props.setProperty("user","user");
		props.setProperty("password","password");
		
		
		try {
			Connection conn = DriverManager.getConnection(url, props);
			System.out.println(conn);
			System.out.println("접속성공");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
