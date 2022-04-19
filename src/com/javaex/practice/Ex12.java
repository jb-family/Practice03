package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		
		for(int i = num; i >= 1; i--) {
			sum *= i; // sum = sum * i
			
		}System.out.println("sum :" + sum);
		
		
		
		sc.close();
	}
}
