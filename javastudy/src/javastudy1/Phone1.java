package javastudy1;

import java.util.Scanner;

public class Phone1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("�̸��� ��ȭ��ȣ�� �Է�>>");
	String name1=scanner.next();
	String tel1 = scanner.next();
	Phone a = new Phone(name1, tel1); //��ü ����
	System.out.println(a.getName() + "�ǹ�ȣ"+a.getTel());
	
	System.out.println("��������� �ڵ�����ȣ�� �Է�>>");
	String name2=scanner.next();
	String tel2 = scanner.next();
	Phone b = new Phone(name2, tel2); //��ü ����
	System.out.println(b.getName() + ","+b.getTel());

	}

}
