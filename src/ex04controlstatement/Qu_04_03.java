package ex04controlstatement;
/*
문제3) 아래 코드의 삼항연산자를 if~else문으로 변경하시오. 
단, 실행결과는 동일해야 합니다.
파일명 : Qu_04_03.java
샘플코드]

 */
public class Qu_04_03 {

	public static void main(String[] args) {

		int num1=50, num2=100;
		int big, diff;

		//big = (num1>num2)? num1:num2; //조건?참:거짓;  
		if(num1>num2) {
			big = num1;
		}
		else {
			big = num2;
		}
		System.out.println(big);
		
		//diff = (num1>num2)? num1-num2: num2-num1;
		if(num1>num2) {
			diff = num1-num2;
		}
		else {
			diff = num2-num1;
		}
		System.out.println(diff); 
	}
}
