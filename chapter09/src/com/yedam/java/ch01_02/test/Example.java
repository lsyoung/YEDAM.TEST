package com.yedam.java.ch01_02.test;

public class Example {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		cb.setOnClickListener(new Background());
		cb.select();

	}

}
