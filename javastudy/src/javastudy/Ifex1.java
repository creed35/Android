package javastudy;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Ifex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���>>");

		int age = scanner1.nextInt();
		// �ܼ� if��
		if ((age >= 20) && (age < 30)) {
			System.out.println("20�� �Դϴ�.");
		} else {
			System.out.println("20�밡 �ƴմϴ�.");
		}

		// if~else if (���� if��, ���� if�� ==> ������ ������..

		System.out.println("������ �Է��ϼ���>>");

		int score = scanner1.nextInt();
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
			System.out.println("����� �Դϴ�.");
		}
		System.out.println("������ " + grade + "�Դϴ�.");
		// System.out.printf("������ %c�Դϴ�.", grade);

		// ��ø if�� ==> if�� ���Ǿȿ� �Ǵٸ� if���� ���� ���

		System.out.println("���� �Է� :>>");
		int score1 = scanner1.nextInt();

		System.out.println("�г��� �Է��ϼ���>>");
		int year = scanner1.nextInt();

		if (score1 >= 60) {
			if (year != 4) {
				System.out.println("�հ�");
			} else if (score1 >= 70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		} else { // 60�� �̸��̸�
			System.out.println("���հ�");

		}
	}

}