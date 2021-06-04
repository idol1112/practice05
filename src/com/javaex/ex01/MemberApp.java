package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member jung = new Member();
		
		jung.setName("정우성");
		jung.setId("jws");
		jung.setPoint(50000);
		jung.showInfo();
		
		Member yoo = new Member();
		
		yoo.setName("유재석");
		yoo.setId("yjs");
		yoo.setPoint(30000);
		yoo.showInfo();
		
		Member lee = new Member();
		
		lee.setName("이효리");
		lee.setId("lhr");
		lee.setPoint(40000);
		lee.showInfo();
	}

}
