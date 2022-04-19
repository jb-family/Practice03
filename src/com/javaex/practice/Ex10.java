package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int max = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("숫자 :");
			int num = sc.nextInt();
			
			if (i == 0) { // i 가 0인지 확인 true면 출력 false면 else if문 실행
				max = num;  
			}else if (max < num) {	// 0보다 입력한 값이 크면 입력한 값이 max로 대입된다.  그리고나서 반복하다가 i가 0이 되면 입력한 값이 max에 대입된다.
				max = num;			
			}
			 
		}	
		
		System.out.println("최대값은 " + max + "입니다.");		
				
				
		
			
		
		
		sc.close();
	} 
}
		