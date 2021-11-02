package com.yedam.java.ch01_02.test;

public class CheckBox {
	OnSelectListener listener;

	void setOnClickListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect();
	}
}
