package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		int num = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= num; i++) {	// i가 입력한 값보다 크다면 반복문 실행(입력한 값의 수만큼)
			result += i;	// result = result + i 
		}
			System.out.println("합계 :" + result);
	
		sc.close();
	}
}
