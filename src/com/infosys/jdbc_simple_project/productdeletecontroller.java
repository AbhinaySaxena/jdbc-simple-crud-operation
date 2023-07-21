package com.infosys.jdbc_simple_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
public class productdeletecontroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter your product id to delete");
		
		int id=sc.nextInt();
		
		Connection connection=null;
		try {
			//Step-1 load/register Driver
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			
			//step-2 create connection
			String url="jdbc:mysql://localhost:3306/jdbc_simple_project";
			String user="root";
			String pass="W@2915djq#";
			
			connection =DriverManager.getConnection(url,user,pass);
			
			//Step-3 Create statement
			Statement statement=connection.createStatement();
			
			//Step-4 execute query
			String deleteProductQuery="Delete From product Where id="+id;
			
			int a=statement.executeUpdate(deleteProductQuery);
			System.out.println("a - "+a);
			if(a==1) {
			System.out.println("Data----Deleted");
			}else {
				System.out.println("given id is not present");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
	}
}


			 
			
	
	
	


