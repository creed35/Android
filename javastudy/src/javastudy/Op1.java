package javastudy;

import java.util.Scanner;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ����
		int remainder = 25%2; //����Ÿ�� ������ = ��
		System.out.println("�������� "+ remainder + "��");
		
		//�񱳿�����
		int x=0, y=1;
		boolean z;
		
		z=((x<1) || (y--<1)); //0<1 or y<1
		System.out.println("����� :" +z);
		
		z=((x<1) && (y--<1)); //0<1 or y<1
		System.out.println("����� :" +z);
		
		//���Կ�����
		int value=1;
		value -= 2; // value=value-2
		System.out.println("��� " + value);
		
		//��ȣ������
		x=1;
		y=1;
		System.out.println("x="+x+" x++="+ x++); //x=x+1
		System.out.println("x="+x+" x++="+ --x);
		System.out.println("y="+y+" y++="+ y++);
		System.out.println("y="+y+" y++="+ --y);
		
		//���ǿ�����
		x=3;
		y=(x==1)? 10 : 20; //����?���϶���: �����϶� ��;
		System.out.println("����� : "+y);
		
		//�ǽ����� 1
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.printf("%d �� %d ���� %d �̴�.", a, b, a+b);
	
	}

}
