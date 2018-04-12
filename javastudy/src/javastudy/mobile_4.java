package javastudy;

import java.util.Scanner;

public class mobile_4 {
	public static void main(String[] args) {
		int score1 = 100;
		int score2 = 90;
		int score3 = 50;
		int score4 = 95;
		int score5 = 85;
		
		int sum = score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		double average = sum / 5;
		
		System.out.println(sum);
		System.out.println(average);
		
		int[] scores = {100, 40, 50, 35, 85};
		int sum1 = 0;
		
		for (int i=0; i<5; i++) 
			sum1 += scores[i];
		double average1 = sum1 / 5;
		
		System.out.println(sum1);
		System.out.println(average1);
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[];
		intArray = new int[5];
		int max = 0;
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("가장 큰 수는 "+ max + "입니다.");
		
		scanner.close();
		
		
		
	}

}
