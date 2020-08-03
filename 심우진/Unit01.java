package algorithm;

/**
 * @author wj
 	1. 
 	임의의 시험 점수를 입력(혹은 랜덤으로)받아 
	90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 
	60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	
	2.
	안녕하세요 를 5번 출력 하자
	결과)
	안녕하세요
	안녕하세요
	안녕하세요
	안녕하세요
	안녕하세요
 */

public class Unit01 {
	public static void main(String[] args) {
		System.out.println("문제 1)");
		
		int score = (int)(Math.random()*100);
		System.out.println("점수: "+score);
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		System.out.println("----------------------");
		
		System.out.println("문제 2)");
		
		for(int i=0; i<5; i++) {
			System.out.println("안녕하세요");
		}
	}
}
