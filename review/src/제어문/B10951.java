package 제어문;

import java.util.Scanner;

public class B10951 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		
		// 갯수 입력
		int score; // 첫번째 숫자를 저장할 변수
		int score2; // 두번째 숫자를 저장할 변수
		int total = 0; // 두 숫자의 합을 저장할 변수 (초기값 0)
		
		int cnt = sc.nextInt(); // 몇 번 반복할지(입력 쌍의 개수)를 사용자로부터 입력받음
		
		// cnt만큼 반복하면서 입력과 출력 수행
		for(int i = 0; i < cnt; i++) {
			score = sc.nextInt();
			score2 = sc.nextInt();
			total = score + score2;
			// 두 수 입력받고 합계 출력
			System.out.println(total);
		}
	
		
	}
}
