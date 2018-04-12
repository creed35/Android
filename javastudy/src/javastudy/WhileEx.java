package javastudy;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		//1-10까지합 ==> for를 while문으로
		
		int i=1, sum=0;
		while (i<=10) {
			sum += i;
			i++;  //for(int i=0; i<=10; i++)
		}
		System.out.println("결과 : "+sum);
		
		// 사용자로 부터 입력받은 정수를 모두 더해서
		// 합계평균 구하기
		
		int count = 0;
		int n = 0;
		int sum1 = 0;
		double avg = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력>>");
		
		Scanner scanner = new Scanner(System.in);
		
		while ((n=scanner.nextInt())!=0) {
			sum1 += n;
			count++;
		}
		avg=sum1/count;
		
		System.out.println("더한 총갯수 : "+count);
		System.out.println("총합 : "+sum1);
		System.out.println("평균 : "+ avg);

		int a = 0, sum2 = 0;
		for (a=1; a<=20; a++)
			if (a%3==0) {
				sum2 += a;
			}
		System.out.println("3의배수의 합은 : " + sum2);
		
		int b = 0, sum3 = 0;
		
		for (b=1; b<=20; b++)
			if (b%3!=0 && b%2!=0) {
			sum3 += b;
			}
		System.out.println("2,3의배수가 아닌수의 합은 : " + sum3);
		
	}


	
}
