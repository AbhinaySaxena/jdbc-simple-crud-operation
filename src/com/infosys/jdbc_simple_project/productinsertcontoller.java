package com.infosys.jdbc_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class productinsertcontoller {
	
	public static void main(String[] args) {
		
	Connection connection=null;
	try {
	//step-1 load/register Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step-2 create connection
	String url="jdbc:mysql://localhost:3306/jdbc_simple_project";
	String user="root";
	String pass="W@2915djkq#";
	
	connection=DriverManager.getConnection(url,user,pass);
	
	//step-3 create statement
	Statement statement=connection.createStatement();
	
	//step-4 Execute query
	String insertQuery="insert into prduct (id,name,color,price) values(102,'marker','blue',30)";
	statement.execute(insertQuery);
	
	System.out.println("Data==============insert=============");
	}catch(ClassNotFoundException |SQLException e) {
		e.printStackTrace();	
	}
	finally {
		try{
			//Step-5 close the connection
			if(connection!=null) {
				connection.close();	
			}else {
				System.out.println("idiot first establish connection");
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
