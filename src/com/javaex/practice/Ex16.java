package com.javaex.practice;

public class Ex16 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b =y++ *2;
		
		System.out.println("a="+a); // a=4
		System.out.println("b="+b); // b=2
		System.out.println("x="+x); // x=2 한번 연산이 되었기 때문에 변경(++x)
		System.out.println("y="+y); // y=2 (y++)

	}


}
