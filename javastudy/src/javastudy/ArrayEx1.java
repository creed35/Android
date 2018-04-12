package javastudy;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수를 이용한 예
		int score1, score2, score3;
		score1 = 100;
		score2 = 33;
		score3 = 44;
		
		int sum= score1 + score2 + score3;
		
		System.out.println(sum);
		
		//배열을 이용한 예
		int sum1 = 0;
		int[] scores = {100,33,44};
		//int scores[] = {100,33,44}; //같은표현
		
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
			//sum1 = sum1 + scores[i];
			//i==0 ==> sum1 + scores[0];
		}
		System.out.println(sum1);
		
		
		//배열 new 연산자로 선언
		String[] name = new String[3];
		//타입[] 배열명 = new 타입 [배열크기];
		
		name[0] = "김일성";
		name[1] = "김정일";
		name[2] = "김정은";
		//String [] name = {"이름1", "이름2", "이름3"};
		//배열에 값 저장
		
		//배열값 출력
			for(int i1=0; i1<name.length; i1++) {
				System.out.println(name[i1]);
			}
		
		//키보드로 부터 입력받아서 최대값
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		
		int max = 0;
		System.out.println("5개의 정수를 입력하세요>>");
		
		//배열에 값 저장하기
		for (int i2=0; i2<intArray.length; i2++) {
			intArray[i2] = scanner.nextInt();
			
			//최대값 비교하기
			if(intArray[i2] > max) {
				//현재 배열에 저장된 값과 max변수 비교
				max = intArray[i2];
			}
			
		}
		
		//배열값 처리한 결과값
		System.out.println("가장큰값은"+max+ "입니다.");
		
		//배열 접근을 for-each 문으로 사용한 예
		
		String f[] = {"값1", "값2", "값3"};
		//배열 값에 접근 (for-each문)
		for (String s : f) { //f[0], f[1]...
			System.out.println(s + " , ");
		}
		//for(int i=0; i<f.length; i++) {
		//f[1];
		
		//5개의 정수를 입력받아서 3의 배수만 출력하기
		//꼭 배열이용
		
		//1> 배열선언
		//2> 입력받은 값을 배열에 값으로 저장
		
		//3> 배열에 값이 %3==0 같다면 출력하기
		
		int n[] = new int[5];
		
		System.out.println("5개의 정수를 입력하세요>>");
		
		//배열에 값 저장하기
		for (int i3=0; i3<n.length; i3++) {
			n[i3] = scanner.nextInt();
			
			//최대값 비교하기
			if(n[i3]%3==0) {
				//현재 배열에 저장된 값과 max변수 비교
				System.out.print(n[i3] + " ,");
			}
		}	
	}

}
