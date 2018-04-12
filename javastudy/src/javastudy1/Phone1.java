package javastudy1;

import java.util.Scanner;

public class Phone1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름과 전화번호를 입력>>");
	String name1=scanner.next();
	String tel1 = scanner.next();
	Phone a = new Phone(name1, tel1); //객체 생성
	System.out.println(a.getName() + "의번호"+a.getTel());
	
	System.out.println("사는지역과 핸드폰번호를 입력>>");
	String name2=scanner.next();
	String tel2 = scanner.next();
	Phone b = new Phone(name2, tel2); //객체 생성
	System.out.println(b.getName() + ","+b.getTel());

	}

}
