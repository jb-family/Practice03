package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		// 1에서 100까지 수에서 5의배수이면서 7의 배수인 수 출력
		int i = 1;
		while(i <= 100) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
	}
}
