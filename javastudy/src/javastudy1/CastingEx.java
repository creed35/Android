package javastudy1;

//person Ŭ����
class Person {
	String name;
	String id;
	// name �Ű������� �ִ� ������
	public Person(String name) {
		super();
		this.name = name;
	}	
	
}

//student Ŭ���� (����)
class Student extends Person {
	String grade;
	String department;
	//������ �ڵ� �ϼ��� �ȵ� ==> ������ �߰�
	public Student(String name) {
		super(name); //����Ŭ������ ������ ȣ��	
	}	
	public String toString() {
		return "�� �̸��� " + name + ", ���̵��" + id
				+ ", Grade��" + grade + ", �а���" + department;
	}	
}

public class CastingEx {
	public static void main(String[] args) {
		Person p = new Student("�̿켮");
		//p=s�� ������ ǥ��(�� ĳ����)
		//������ ������ ����
		//���� = ���� (��ĳ����)
		//������ ������ ���� ����
		Student s = (Student) p;
		
		s.id = "1234";
		s.grade = "A���";
		s.department = "�����";	
		
		//������ �ϱ�
		System.out.println(s.id);
		
		//Ŭ�����ȿ� toString()�޼��带 ���� ����ϱ�
		System.out.println(s);
		System.out.println(s.toString());

	}

}
