package javastudy;

import java.util.Scanner;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 선언
		int remainder = 25%2; //변수타입 변수명 = 값
		System.out.println("나머지는 "+ remainder + "임");
		
		//비교연산자
		int x=0, y=1;
		boolean z;
		
		z=((x<1) || (y--<1)); //0<1 or y<1
		System.out.println("결과는 :" +z);
		
		z=((x<1) && (y--<1)); //0<1 or y<1
		System.out.println("결과는 :" +z);
		
		//대입연산자
		int value=1;
		value -= 2; // value=value-2
		System.out.println("결과 " + value);
		
		//부호연산자
		x=1;
		y=1;
		System.out.println("x="+x+" x++="+ x++); //x=x+1
		System.out.println("x="+x+" x++="+ --x);
		System.out.println("y="+y+" y++="+ y++);
		System.out.println("y="+y+" y++="+ --y);
		
		//조건연산자
		x=3;
		y=(x==1)? 10 : 20; //조건?참일때값: 거짓일때 값;
		System.out.println("결과는 : "+y);
		
		//실습문제 1
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.printf("%d 와 %d 합은 %d 이다.", a, b, a+b);
	
	}

}
