package com.yedam.java.ch02.set;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);// 멤버 name,obj name같고 두개 나이같을때
		} else {
			return false;
		}
	}

}
