package com.yedam.java.ch01_02;

public class Button {
	OnClickListner listener;

	void setOnClickListener(OnClickListner listener) {
		this.listener = listener;
	}
	 void touch() {
		 listener.onClick();
	 }
	
	static interface OnClickListner{
		void onClick();
	}
}
