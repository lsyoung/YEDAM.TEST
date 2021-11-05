package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	private String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	private String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String connectedId = "hr";
	private String connectedPwd = "hr";

	// 각메소드에서 공통적으로 사용하는 필드
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// DB연결하기
	public void connect() {
		try {
			Class.forName(jdbc_driver);

			// 2. DB 서버 접속하기
			String url = jdbc_url;
			String id = connectedId;
			String password = connectedPwd;

			Connection conn = DriverManager.getConnection(jdbc_url, id, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	// 자원해제하기
	public void disconnect() {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 조회 - 전체 조회
	public List<Emp> selectAll() {
		// 값을 담을 변수 선언
		List<Emp> list = new ArrayList<>();
		try {
			// DB 연결하기
			connect();
			Statement stmt = conn.createStatement();
			String select = "select * from employees order by employee_id";
			ResultSet rs = stmt.executeQuery(select);

			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행시키기 위해 finally구문 사용
			// 자원 및 db 연결해제
			disconnect();
		}
		return list;
	}
	// 조회 - 단건조회 or 상세조회
	public Emp selectOne(int employeeId) {
		// 값을 담을 변수 선언
		Emp emp = new Emp();
		try {
			// DB연결하기
			connect();
			// SQL 실행문
			Statement stmt = conn.createStatement();
			String select = "SELECT * FROM employees WHERE employee_id = " + employeeId;

			ResultSet rs = stmt.executeQuery(select);

			while (rs.next()) {// while문 if문 둘다 가능함 if가 가능한 이유 == employeeId는 고유값이기 때문에

				emp.setEmployeeId(rs.getInt("employee_id"));// rs에서 employee_id 컬럼값을 가져와서 emp에 입력함
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("mamager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원 해제하기
			disconnect();
		}
		// 리턴전에 자원해제하기
		return emp;
	}

	// 등록
	public void inser(Emp emp) {
		try {
			// db연결
			connect();

			String insert = "insert into employees values (?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setString(6, "21/11/05");
			pstmt.setString(7, emp.getJobId());
			pstmt.setInt(8, emp.getSalary());
			pstmt.setDouble(9, emp.getCommissionPct());
			pstmt.setInt(10, emp.getManagerId());
			pstmt.setInt(11, emp.getDepartmentId());

			// SQL실행
			int result = pstmt.executeUpdate();
			// 결과값을 받아와서 출력하기
			System.out.println(result + "건이 완료 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		// 수정

		// 삭제
	}
}
