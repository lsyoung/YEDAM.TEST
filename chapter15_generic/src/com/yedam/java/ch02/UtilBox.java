package com.yedam.java.ch02;

import com.yedam.java.ch01.Box;

public class UtilBox {
	
	public static <T> Box <T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}

}
