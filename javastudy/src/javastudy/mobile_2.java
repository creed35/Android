package javastudy;

import java.util.Scanner;

public class mobile_2 {

	public static void main(String[] args) {
		// 문제1. 두 정수를 입력 받아 합을 구하여 출력하는 프로그램을 작성해 보기
		System.out.println("값을 입력해주세요");	
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.printf("%d와 %d의 합은 %d 이다.\n", a, b, a+b );
				
		// 문제2. 직사각형의 가로, 세로를 입력 받아 넓이를 구하는 프로그램을 작성해 보자 
		System.out.println("직사각형 가로, 세로를 입력하시오");
		
		Scanner in1 = new Scanner(System.in);
		
		int c = in1.nextInt();
		int d = in1.nextInt();
		
		System.out.printf("%d와 %d의 합은 %d 이다.", c, d, c*d );		
		
		// 문제3. 임의의 수를 입력 받아 십의 자리 이하는 버리는 코드를  작성해보자.
		// 예를 들면 356이라면 300이 나올 수 있도록 해보자.
			System.out.println("\n숫자를 입력하세요:");
			int e = in1.nextInt();

			System.out.printf("%3d\n", e);
			
			//문제 : 초 단위로 정수를 입력받아 몇시, 몇분, 몇초인지 구하기\
			
			Scanner in2 = new Scanner (System.in);
			//키보드로 입력받기 위한 객체 생성 ==> 1단계
			System.out.println("정수를 입력하세요:");
			int time = in2.nextInt();
			//2단계 : 키보드로 입력한 값을 읽어옴
			//nextInt() : //정수로 저장
			
			int hour = (time/60)/60; // 정수/3600 ==> 1시간은 60*6
			int minute = time%3600/60; // 분 ==> time 나머지 값
			int second = time%60; //초0
			
			System.out.println
			(time +"초는" + hour +"시" + minute + "분" + second + "초");
			
	//문제 : 입력된 정수가 짝수인지 홀수인지 출력
			//((변수%2)==0)? "짝수" : "홀수"
			
			System.out.println("정수를 입력하세요");
						
			int num = in2.nextInt();
			int odd = num%2;
			
			String result = (odd==0)? "짝수": "홀수";
			System.out.println("결과:" + result);
			
		}			
	

}