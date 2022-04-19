package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int money;
		int plusMius = 0;
		int check = 0;
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			select = sc.nextInt();
			if(select == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			if(select != 4) {
				check = plusMius;				// check = plusMius;
				if(select == 1) {
					System.out.print("예금액 > ");
					money = sc.nextInt();
					plusMius += money;			// plusMius; = plusMius + money;	
					System.out.println(plusMius);
				}else if (select == 2) {
					System.out.print("출금액 > ");
					money = sc.nextInt();
					plusMius -= money;			// plusMius = plusMius - money;
					System.out.println(plusMius);
				}
				else if (select == 3) {
					System.out.println("잔고액 > " + check);
					
				}else {
					System.out.println("다시 입력해주세요.");
				}
			}
		} 
		sc.close();
	}
}
