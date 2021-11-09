package com.yedam.app.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpAppTest {
	
	public static void main(String[] args) {
	      Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String id = "hr";
				String password = "hr";

				conn = DriverManager.getConnection(url, id, password);
			} catch (SQLException | ClassNotFoundException e) {

				e.printStackTrace();
			}

			try {
				stmt = conn.createStatement();
				String sql = "SELECT * FROM employees where salary between 5000 and 10000";
				rs = stmt.executeQuery(sql);

				System.out.println("====급여가 5000에서 10000사이인 사원목록====");
				while(rs.next()) {
					

					System.out.println("사원번호: " + rs.getInt("employee_id") + " 이름: " + rs.getString("first_name")
							+ rs.getString("email") + " 급여: " + rs.getInt("salary"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			// 최고연봉

			try {
				stmt = conn.createStatement();
				String sql = "SELECT MAX(salary) AS 최고연봉 FROM employees where job_id = 'ST_CLERK'";
				rs = stmt.executeQuery(sql);

				if (rs.next()) {
					System.out.println("==직책이 'ST_CLERK'인 사원중 최고연봉 : " + rs.getInt("최고연봉"));

				} else {
					System.out.println("해당 사원이 존재하지 않습니다.");
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

			// 입사일이 5월 달인 평균급여
			try {
				stmt = conn.createStatement();
				String sql = "SELECT AVG(salary)  AS 평균 FROM employees where TO_CHAR(hire_date,'MM') = '05'";
				rs = stmt.executeQuery(sql);

				if (rs.next()) {
					System.out.println("==5월에 입사한 사원들의 평균 연봉 : " + rs.getInt("평균"));
				}else {
					System.out.println("해당 사원이 존재하지 않습니다.");
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

			try {
				stmt = conn.createStatement();
				String sql = "SELECT * FROM employees where job_id ='SA_REP' And salary >= 10000";
				rs = stmt.executeQuery(sql);

				if (rs.next()) {
					System.out.println("==직책이 'SA_REP이며 급여가 10000이상인 사원 목록 =='");
					System.out.println("사원번호: " + rs.getInt("employee_id") + ", 이름: " + rs.getString("first_name")
							+ ", 이메일 : " + rs.getString("email") + " ,급여: " + rs.getInt("salary"));
				} else {
					System.out.println("사원이 존재하지않습니다.");
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

	    
}
}
