package javastudy;

import java.util.Scanner;

public class mobile_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���̸� �Է��Ͻÿ�");
		int age = scanner.nextInt();
		if ((age >= 20) && (age < 30)) {
			System.out.print("20���Դϴ�.");
			System.out.println("20��� �ູ�մϴ�.");
		} else {
			System.out.println("20�밡 �ƴմϴ�.");
		}

		char grade;

		System.out.print("������ �Է��ϼ���(0~100):");
		int score = scanner.nextInt();
		
		System.out.print("�г��� �Է��ϼ���(1~4):");
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

		System.out.println("������" + grade + "�Դϴ�.");

		switch(grade) {
		case 'A':
			System.out.println("�����մϴ�.");
			System.out.println("���߽��ϴ�.");
			break;
		case 'B':
			System.out.println("���ƿ�.");
			break;
		case 'C':
			System.out.println("����ϼ���.");
			break;
		default:
			System.out.println("Ż���Դϴ�!");		
		}
		
//���� 1		
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
		
//Ű���带 �Է¹޾Ƽ� ó��	
		
		System.out.println("���� ���� �Է��ϼ���");
		int months = 0;
		months = scanner.nextInt();
		switch(months) {
		case 3: 
		case 4: 
		case 5:
			System.out.println("���� ����");
			break;
		case 6: 
		case 7: 
		case 8:
			System.out.println("����");
			break;
		case 9: 
		case 10: 
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
		}
		
//������� ������ �������� �ۼ��ϴ� ��
		int sc = 0;
		System.out.print("������ �Է��ϼ���>>");
		sc =scanner.nextInt();
		switch(sc/10) { //���� �ڸ��� 99~90 / 10=>9
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