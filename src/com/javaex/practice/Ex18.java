package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num = sc.nextInt();
		int i = 0;
		int j = 0;
		 
		if(i < num) {
			for (i = num; i > 0; i--) {
					for (j = i; j > 0; j--) {
						System.out.print("*");	
					}	System.out.println("");
				}	// num을 i값에 대입 후 0보다 클때까지만 i 반목문 실행 (3입력시 3번반복)
					// i반복문 실행 후 j반복문 3번 반복 3>2>1번 "*" 출력
					// j반복문 끝나면 i반복문으로 가서 i값 -1되어 반복 .... 0보다 클때까지 계속반복
					// *** ** * 찍고나서 첫번째 for문 탈출 
			for (i = 1; i < num; i++) {	// i = 3 num = 3
				for (j = 0; j <= i; j++) {	// j = 1
					System.out.print("*");	
				}	System.out.println("");
			}		// i가 입력한 값보다 작을때까지 반복 (3입력 시 1->2 2번반복)
		}			// j는 i와 같거나 작을때 j값증가된다. 
					// i는 1부터 시작하니 두번 반복되고 j는 0부터 시작이기 때문에  
					// j반복문에서는 i보다 한번더인 2번반복하고 -> 3번반복되어 출력된다.
				
		sc.close();
		
	}
}
