package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
	public Account() {
	}
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
		System.out.println("");
	}
    
    
    
    //필요한 메소드 작성
	public void deposit(int money) {
		balance = balance + money;
	}
	
	public void withdraw(int money) {
		balance = balance - money;
	}
	public void showBalance() {
		System.out.print(balance);
	}
}
