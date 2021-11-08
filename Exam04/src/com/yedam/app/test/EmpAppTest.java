package com.yedam.app.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpAppTest {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String password = "hr";

		    conn = DriverManager.getConnection(url, id, password);
		} catch ( SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
		
	
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM employees where salary = between 5000 and 10000";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("===급여가 5000에서 10000사이인 사원목록");
				
				System.out.println("사원번호: "+rs.getInt("employee_id") + "이름: "+rs.getString("first_name")+
						  rs.getString("email")+"급여: "+rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//최고연봉
		Statement stmt;
		try {
			stmt = conn.createStatement();
			String sql1 = "SELECT MAX(salary) AS 최고연봉 FROM employees where job_id = ST_CLERK";
			ResultSet rs = stmt.executeQuery(sql1);

			while (rs.next()) {
			System.out.println("==직책이 'ST_CLERK'인 사원중 최고연봉 : "+rs.getInt("Salary AS 최고연봉"));
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		



	// 입사일이 5월 달인 평균급여
	    try {
		stmt = conn.createStatement();
		String sql2 = "SELECT AVG(salary) AS 평균 FROM employees where hire_date = 05";
		ResultSet rs = stmt.executeQuery(sql2);

		while(rs.next()) {
			System.out.println("==5월에 입사한 사원들의 평균 연봉 : "+rs.getInt("salary AS 평균"));
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
		stmt = conn.createStatement();
		String sql3 = "SELECT * FROM employees where job_id = SA_REP And salary >= 10000";
		ResultSet rs = stmt.executeQuery(sql3);

		if(rs.next()) {
			System.out.println("==직책이 'SA_REP이며 급여가 10000이상인 사원 목록 =='");
			System.out.println("사원번호: "+rs.getInt("employee_id"+", 이름: "+rs.getString("first_name")
			+ ", 이메일 : "+rs.getString("email")+ " ,급여: "+rs.getInt("salary")));
		}
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();

	    }
}

