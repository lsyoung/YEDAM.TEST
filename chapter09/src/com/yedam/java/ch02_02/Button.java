package com.yedam.java.ch02_02;

public class Button {
	//필드 선언
	OnClickListener listener;
	
	void setOnClicklistener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}

	
	//중첩 인터페이스
	static interface OnClickListener{
		void onClick();
	}
}
