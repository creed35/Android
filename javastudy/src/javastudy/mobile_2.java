package javastudy;

import java.util.Scanner;

public class mobile_2 {

	public static void main(String[] args) {
		// ����1. �� ������ �Է� �޾� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��� ����
		System.out.println("���� �Է����ּ���");	
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.printf("%d�� %d�� ���� %d �̴�.\n", a, b, a+b );
				
		// ����2. ���簢���� ����, ���θ� �Է� �޾� ���̸� ���ϴ� ���α׷��� �ۼ��� ���� 
		System.out.println("���簢�� ����, ���θ� �Է��Ͻÿ�");
		
		Scanner in1 = new Scanner(System.in);
		
		int c = in1.nextInt();
		int d = in1.nextInt();
		
		System.out.printf("%d�� %d�� ���� %d �̴�.", c, d, c*d );		
		
		// ����3. ������ ���� �Է� �޾� ���� �ڸ� ���ϴ� ������ �ڵ带  �ۼ��غ���.
		// ���� ��� 356�̶�� 300�� ���� �� �ֵ��� �غ���.
			System.out.println("\n���ڸ� �Է��ϼ���:");
			int e = in1.nextInt();

			System.out.printf("%3d\n", e);
			
			//���� : �� ������ ������ �Է¹޾� ���, ���, �������� ���ϱ�\
			
			Scanner in2 = new Scanner (System.in);
			//Ű����� �Է¹ޱ� ���� ��ü ���� ==> 1�ܰ�
			System.out.println("������ �Է��ϼ���:");
			int time = in2.nextInt();
			//2�ܰ� : Ű����� �Է��� ���� �о��
			//nextInt() : //������ ����
			
			int hour = (time/60)/60; // ����/3600 ==> 1�ð��� 60*6
			int minute = time%3600/60; // �� ==> time ������ ��
			int second = time%60; //��0
			
			System.out.println
			(time +"�ʴ�" + hour +"��" + minute + "��" + second + "��");
			
	//���� : �Էµ� ������ ¦������ Ȧ������ ���
			//((����%2)==0)? "¦��" : "Ȧ��"
			
			System.out.println("������ �Է��ϼ���");
						
			int num = in2.nextInt();
			int odd = num%2;
			
			String result = (odd==0)? "¦��": "Ȧ��";
			System.out.println("���:" + result);
			
		}			
	

}