package javastudy;

import java.util.Scanner;

public class javaPrac {
	public static void main(String[] args) {
	
	
		int mach;
		int distance;
		
		mach = 340;
		distance = mach * 60 * 60;
		System.out.println("�Ҹ��� 1�ð� ���� ���� �Ÿ� : " + distance + "m");
		
		double radius;
		double area;
		
		radius = 10.0;
		area = radius * radius * 3.14;
		
		System.out.println("�������� " + radius + "�� ���� ���� : " + area);
		
		char ga1 = '��';
		char ga2 = '\uac00';
		
		boolean cham = true;
		boolean	geojit = false;
		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "�� �ƴϸ� " + geojit + "�Դϴ�.");
		
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
		System.out.printf("%d * %d�� %d�Դϴ�.\n", x, y, x*y);
		
		int remainder = 25 % 2;
		System.out.println("25 / 2�� �������� " + remainder + "�Դϴ�.");
		
		int a = 0, b = 1;
		System.out.println((a < 1) || (b-- < 1));
		System.out.println("a = " + a + ", b = "+ b);
		
		a = 0;
		b = 1;
		System.out.println((a < 1) | (b-- < 1));
		System.out.println("a = " + a + ", b = "+ b);
		
		int value = 1;
		value += 1;
		System.out.println("�� = " + value);
		value -= 1;
		System.out.println("�� = " + value);
		value <<= 3;
		System.out.println("�� = " + value);
		value %= 3;
		System.out.println("�� = " + value);
		
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne�� " + plusOne + "�Դϴ�.");
		System.out.println("minusOne�� " + minusOne + "�Դϴ�.");
		
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
		
//��������
//1. �� ������ �Է� �޾� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��� ����
		Scanner re = new Scanner(System.in);
		
		int l = re.nextInt();
		int m = re.nextInt();
		
		System.out.printf("%d ���ϱ� %d �� %d �̴�.", l, m, l+m);
	
//2. ���簢���� ����, ���θ� �Է� �޾� ���̸� ���ϴ� ���α׷��� �ۼ��� ����	
		Scanner su = new Scanner(System.in);
		
		System.out.println("\n���θ� �Է��ϼ���:");
		int n = su.nextInt();
		
		System.out.println("\n���θ� �Է��ϼ���:");
		int o = su.nextInt();
		
		System.out.printf("���� : %d, ���� : %d, ���� : %d\n", n, o, n*o);

//���� : ������ ���� �Է� �޾� ���� �ڸ� ���ϴ� ������ �ڵ带  �ۼ��غ���.
//���� ��� 356�̶�� 300�� ���� �� �ֵ��� �غ���.
		
		System.out.println("\n���ڸ� �Է��ϼ���:");
		int pp = su.nextInt();

		System.out.printf("%3d\n", pp);
		
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
