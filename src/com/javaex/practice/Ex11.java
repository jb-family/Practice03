package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int result = 0;
		int result1 = 0;
		
		
		for(int a = 1; a <= num; a++) {
			
			if(a % 2 != 0 ) {
				result += a;
			}
			else if(a % 2 == 0 ) {
				result1 += a;
			}
		}	
			if(result % 2 == 0)  {
				System.out.println("결과 값 " + result);	
			}
			else {
				System.out.println("결과 값 " + result1);
			}
			
		
		
		
		
		
		sc.close();
	}
}
