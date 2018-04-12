package javastudy;

import java.util.Scanner;

public class javaPrac {
	public static void main(String[] args) {
	
	
		int mach;
		int distance;
		
		mach = 340;
		distance = mach * 60 * 60;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
		
		double radius;
		double area;
		
		radius = 10.0;
		area = radius * radius * 3.14;
		
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
		
		char ga1 = '가';
		char ga2 = '\uac00';
		
		boolean cham = true;
		boolean	geojit = false;
		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "가 아니면 " + geojit + "입니다.");
		
		int ii;
		double d;
		byte p;
		
		ii = 7/4;
		System.out.println(ii);
		d = 7/4;
		System.out.println(d);
		d = 7/ (double) 4;
		System.out.println(d);
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x*y);
		
		int remainder = 25 % 2;
		System.out.println("25 / 2의 나머지는 " + remainder + "입니다.");
		
		int a = 0, b = 1;
		System.out.println((a < 1) || (b-- < 1));
		System.out.println("a = " + a + ", b = "+ b);
		
		a = 0;
		b = 1;
		System.out.println((a < 1) | (b-- < 1));
		System.out.println("a = " + a + ", b = "+ b);
		
		int value = 1;
		value += 1;
		System.out.println("값 = " + value);
		value -= 1;
		System.out.println("값 = " + value);
		value <<= 3;
		System.out.println("값 = " + value);
		value %= 3;
		System.out.println("값 = " + value);
		
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne은 " + plusOne + "입니다.");
		System.out.println("minusOne은 " + minusOne + "입니다.");
		
		int e = 1, f = 1;
		System.out.println("e = " + e + ", f = " + ++e);
		System.out.println("f = " + f + ", f = " + f++);
		System.out.println("e = " + e + ", f = " + f);
		
		int g = 1;
		int h;
		h = (g==1) ? 10 : 20;
		System.out.println(h);
		h = (g > 1) ? g++ : g + 20;
		System.out.println(g);
		System.out.println(h);
		
		int i = 5;
		int j = 10;
		int k = ++i * j--;
		System.out.printf("%d\t%d\t%d\n", i, j, k);
		
		int year = 2018;
		System.out.println(year % 2 == 0 && year % 3 != 0 && year % 400 == 0);
		
//연습문제
//1. 두 정수를 입력 받아 합을 구하여 출력하는 프로그램을 작성해 보기
		Scanner re = new Scanner(System.in);
		
		int l = re.nextInt();
		int m = re.nextInt();
		
		System.out.printf("%d 더하기 %d 는 %d 이다.", l, m, l+m);
	
//2. 직사각형의 가로, 세로를 입력 받아 넓이를 구하는 프로그램을 작성해 보자	
		Scanner su = new Scanner(System.in);
		
		System.out.println("\n가로를 입력하세요:");
		int n = su.nextInt();
		
		System.out.println("\n세로를 입력하세요:");
		int o = su.nextInt();
		
		System.out.printf("가로 : %d, 세로 : %d, 면적 : %d\n", n, o, n*o);

//문제 : 임의의 수를 입력 받아 십의 자리 이하는 버리는 코드를  작성해보자.
//예를 들면 356이라면 300이 나올 수 있도록 해보자.
		
		System.out.println("\n숫자를 입력하세요:");
		int pp = su.nextInt();

		System.out.printf("%3d\n", pp);
		
//문제 : 초 단위로 정수를 입력받아 몇시, 몇분, 몇초인지 구하기\
		
		Scanner scanner = new Scanner (System.in);
		//키보드로 입력받기 위한 객체 생성 ==> 1단계
		System.out.println("정수를 입력하세요:");
		int time = scanner.nextInt();
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
					
		int num = scanner.nextInt();
		int odd = num%2;
		
		String result = (odd==0)? "짝수": "홀수";
		System.out.println("결과:" + result);
		
	}

}
