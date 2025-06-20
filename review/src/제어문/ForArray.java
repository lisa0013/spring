package 제어문;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForArray {
	public static void main(String[] args) throws FileNotFoundException {
		
		// 파일 입력 준비 (파일 경로: src/resources/engScore.txt) 
		File file = new File("src/resources/engScore.txt");
		// Scanner를 통해 파일의 내용을 읽음
		Scanner sc = new Scanner(file);

		int score; // 점수를 읽어 저장할 변수
		int total = 0; // 점수의 합을 저장할 변수 (초기값 0)
		
		int cnt = sc.nextInt(); // 첫 번째 값은 점수의 개수를 의미(배열 크기 결정)
		int[] a = new int[cnt]; // ArrayList.size() 점수를 저장할 크기 cnt짜리 배열 생성

		// cnt번 반복하면서 점수 입력받고 배열에 저장 + 합계 게산 
		for (int i = 0; i < cnt; i++) {
			score = sc.nextInt(); // 점수를 입력받음
			a[i] = score; // 점수를 배열 a의 i번쨰에 저장
			total += score; // 점수를 합계에 더함
		}

		// 배열 저장된 점수를 출력
		for (int i = 0; i < cnt; i++) {
			System.out.println(a[i]);
		}
		// 최종 합계 출력
		System.out.println(total);
	}
}
