package javastudy;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		//1-10������ ==> for�� while������
		
		int i=1, sum=0;
		while (i<=10) {
			sum += i;
			i++;  //for(int i=0; i<=10; i++)
		}
		System.out.println("��� : "+sum);
		
		// ����ڷ� ���� �Է¹��� ������ ��� ���ؼ�
		// �հ���� ���ϱ�
		
		int count = 0;
		int n = 0;
		int sum1 = 0;
		double avg = 0;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է�>>");
		
		Scanner scanner = new Scanner(System.in);
		
		while ((n=scanner.nextInt())!=0) {
			sum1 += n;
			count++;
		}
		avg=sum1/count;
		
		System.out.println("���� �Ѱ��� : "+count);
		System.out.println("���� : "+sum1);
		System.out.println("��� : "+ avg);

		int a = 0, sum2 = 0;
		for (a=1; a<=20; a++)
			if (a%3==0) {
				sum2 += a;
			}
		System.out.println("3�ǹ���� ���� : " + sum2);
		
		int b = 0, sum3 = 0;
		
		for (b=1; b<=20; b++)
			if (b%3!=0 && b%2!=0) {
			sum3 += b;
			}
		System.out.println("2,3�ǹ���� �ƴѼ��� ���� : " + sum3);
		
	}


	
}
