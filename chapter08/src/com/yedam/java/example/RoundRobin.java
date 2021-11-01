package com.yedam.java.example;

public class RoundRobin implements Scheduler {

	@Override // 상담원 한명씩 돌아가며 동일하게 상담업무 배분
	public void getNextCall() {
		System.out.println("상담전화 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다. ");

	}

}
