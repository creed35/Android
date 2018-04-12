package javastudy;

import java.util.Scanner;

public class mobile_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("나이를 입력하시오");
		int age = scanner.nextInt();
		if ((age >= 20) && (age < 30)) {
			System.out.print("20대입니다.");
			System.out.println("20대라서 행복합니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}

		char grade;

		System.out.print("점수를 입력하세요(0~100):");
		int score = scanner.nextInt();
		
		System.out.print("학년을 입력하세요(1~4):");
		int year = scanner.nextInt();
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60) {
			if(year != 4) grade = 'D';
			else grade = 'F';
		}

		else
			grade = 'F';

		System.out.println("학점은" + grade + "입니다.");

		switch(grade) {
		case 'A':
			System.out.println("축하합니다.");
			System.out.println("잘했습니다.");
			break;
		case 'B':
			System.out.println("좋아요.");
			break;
		case 'C':
			System.out.println("노력하세요.");
			break;
		default:
			System.out.println("탈락입니다!");		
		}
		
//문제 1		
		switch(grade) {
		case 'A':
			System.out.println("EXCELLENT");
			break;
		case 'B':
			System.out.println("EXCELLENT");
			break;
		case 'C':
			System.out.println("GOOD");
			break;
		case 'D':
			System.out.println("GOOD");
			break;
		default:
			System.out.println("BYE");		
		}
		
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("sk");
			break;
		case 6:
			System.out.println("KTF");
			break;
		default:
			System.out.println("unknown");	
		
		}
		
//키보드를 입력받아서 처리	
		
		System.out.println("현재 월을 입력하세요");
		int months = 0;
		months = scanner.nextInt();
		switch(months) {
		case 3: 
		case 4: 
		case 5:
			System.out.println("현재 봄임");
			break;
		case 6: 
		case 7: 
		case 8:
			System.out.println("여름");
			break;
		case 9: 
		case 10: 
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
		}
		
//연산식을 간단한 수식으로 작성하는 예
		int sc = 0;
		System.out.print("점수를 입력하세요>>");
		sc =scanner.nextInt();
		switch(sc/10) { //십의 자릿수 99~90 / 10=>9
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;		
		default:
			System.out.println("F");		
		
		}

				
		scanner.close();

	}
}