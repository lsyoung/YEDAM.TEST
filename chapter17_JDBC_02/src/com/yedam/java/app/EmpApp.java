package com.yedam.java.app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		/*EmpDAO dao = EmpDAO.getInstance();
		List<Emp> datas = dao.selectAll();
		for(Emp emp : datas) {
			System.out.println(emp);
		}*/
		//empclass에서 toString override
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		EmpDAO dao = EmpDAO.getInstance();
		Emp emp = null;
		int employeeId = 0;
		
		while(run) {
			System.out.println("==1.등록 2.수정 3.삭제 4.사원조회 5.사원전체조회 6.종료==");
			System.out.println("선택 > ");
			int menuNo = scanner.nextInt();
			
			switch(menuNo) {
			case 1://등록
				emp = new Emp();
				//외부에서 값을 받아 저장
				System.out.println("사번>>");
				emp.setEmployeeId(scanner.nextInt());
				//int employeeId = scanner.nextInt();
				//emp.setEmployeeID(employeeID);
				System.out.println("이름>>");
				emp.setFirstName(scanner.next());
				System.out.println("성>>");
				emp.setLastName(scanner.next());
				System.out.println("이메일>>");
				emp.setEmail(scanner.next());
				System.out.println("전화번호>>");
				emp.setPhoneNumber(scanner.next());
				System.out.println("입사일>>");
				emp.setHireDate(Date.valueOf(scanner.next()));//YYYY-MM-DD형태만 변환가능
				System.out.println("직급>>");
				emp.setJobId(scanner.next());
				System.out.println("연봉>>");
				emp.setSalary(scanner.nextInt());
				System.out.println("상여>>");
				emp.setCommissionPct(scanner.nextDouble());
				System.out.println("상사>>");
				emp.setManagerId(scanner.nextInt());
				System.out.println("부서>>");
				emp.setDepartmentId(scanner.nextInt());
				
				dao.insert(emp);
				break;
			case 2://수정
				emp = new Emp(); //새로 초기화를 계속 해줘야함
				
				System.out.println("사번>>");
				emp.setEmployeeId(scanner.nextInt());
				System.out.println("성>>");
				emp.setLastName(scanner.next());
				
				dao.update(emp);
				break;
			case 3://삭제
				System.out.println("사번>>");
				employeeId = scanner.nextInt();
				
				dao.delete(employeeId);
				
				break;
			case 4: //사원조회
				System.out.println("사번>>");
				employeeId = scanner.nextInt();
				emp =dao.selectOne(employeeId);
				if( emp == null) {
					System.out.println("해당사원이 없습니다.");
				}else {
				System.out.println(emp);
				}
				break;
			case 5: //전체사원조회
			
				List<Emp> datas = dao.selectAll();
				for(Emp data : datas) {
					System.out.println(data);
				}
				break;
			case 6:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
