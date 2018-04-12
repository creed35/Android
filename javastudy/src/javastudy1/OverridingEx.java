package javastudy1;

class Shape {
	public void draw() {
		System.out.println("����");
	} //������ ����Ÿ�� �޼����̸�(�Ű�����..)
}

class Line extends Shape {
	public void draw() {
		System.out.println("��");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("�簢��");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("��");
	}
}

public class OverridingEx {
	static void paint(Shape p) {
		p.draw(); //����Ŭ������ �ִ� draw()
	}

	public static void main(String[] args) {
		//�ż��� ȣ��
		Line line = new Line();
		paint(line); //Shape line ==> line�� draw ȣ��
		//�������̵� �� �޼���� 
		//�ϴ� ���ļ� ����� ���̹Ƿ�
		//���� Ŭ������ �ִ� �޼��尡 �켱������ ����
		paint(new Line());
		line.draw(); //����
		
	}

}
