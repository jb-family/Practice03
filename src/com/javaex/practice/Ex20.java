package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String sign;
		int random = 47;
		
		System.out.println("====================");
		System.out.println("  [숫자맞추기게임 시작]");
		System.out.println("====================");
		
		while(true) {
			System.out.print(">>");
			 num = sc.nextInt();
			 if(num > random) {
				 System.out.println("더 낮게");
			 } else if (num < random) {
				 System.out.println("더 높게");
			 } else if (num == random) {
				 if(num == random) {
				 System.out.println("맞았습니다.");
				 System.out.print("게임을 종료하시겠습니까?(y/n)");
				 sign = sc.next();
				if(sign.equals("y")) {
					System.out.println("====================");
					System.out.println("  [숫자맞추기게임 종료]");
					System.out.println("====================");
					break;
				 }else if (sign.equals("n")) {
					System.out.println("====================");
					System.out.println("  [숫자맞추기게임 시작]");
					System.out.println("====================");
					continue;
			 	}
			 }
		 	}
		} //while문 종료
		
		sc.close();
	}
}
