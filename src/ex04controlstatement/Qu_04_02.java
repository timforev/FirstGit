package ex04controlstatement;
/*
문제2)다음 예제는 두개의 if문을 사용하고 있다.이를 하나의 if문으로 변경해보자
파일명 : Qu_04_02.java

 */
public class Qu_04_02 {

	public static void main(String[] args) {
		
		int num = 121;
		if (num>0 && (num % 2)==0) {
			System.out.println("양수이면서 짝수");			
		}
		else {
			System.out.println("양수이면서 짝수가 아닙니다.");
		}
	}
}
