package javastudy;

import java.util.Scanner;

public class Opex1 {

	public static void main(String[] args) {
		//���� : �� ������ ������ �Է¹޾� ���, ���, �������� ���ϱ�\
		
		Scanner scanner = new Scanner (System.in);
		//Ű����� �Է¹ޱ� ���� ��ü ���� ==> 1�ܰ�
		System.out.println("������ �Է��ϼ���:");
		int time = scanner.nextInt();
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
					
		int num = scanner.nextInt();
		int odd = num%2;
		
		String result = (odd==0)? "¦��": "Ȧ��";
		System.out.println("���:" + result);
		
		

	}

}
