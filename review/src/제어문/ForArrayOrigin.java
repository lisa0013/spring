package 제어문;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

// 평균을 계산하고 평균 미달 성적만 출력
// 충점계산 -> 평균계산 -> 평균미달성적출력
public class ForArrayOrigin {
	public static void main(String[] args) throws FileNotFoundException {

		// 파일을 읽기 위한 file 객체 생성(파일 경로 지정)
		File file = new File("src/resources/engScore.txt");
		// Scanner로 파일 내용 읽기
		Scanner sc = new Scanner(file);

		int score; // 한 번에 읽어온 점수를 저장할 변수
		int total = 0; // 점수들의 합을 저장할 변수, 초기값 0

		// 첫 번쨰 입력값을 읽어 배열 크기(cnt)로 사용
		int cnt = sc.nextInt();
		
		// cnt 크기만큼 점수를 저장할 정수 배열 생성
		int[] a = new int[cnt]; // ArrayList.size()

		// cnt만큼 반복하여 점수 입력받기
		for (int i = 0; i < cnt; i++) {
			score = sc.nextInt(); // 점수 한 개 읽기
			a[i] = score; // 읽은 점수를 배열에 저장
			total += score; // 총점에 누적 합산
		}

		// 총점 출력
		System.out.println("total=" + total);

		// 평균 미달 성적 개수를 저장할 변수
		int low = 0;

		// 평균 계산 (총점 / 개수)
		int avg = total / cnt;

		// 평균보다 낮은 점수만 출력하는 반복문
		for (int i = 0; i < cnt; i++) {
			if (avg > a[i]) { // 평균보다 작으면
				// 평균 미달 성적 출력
				System.out.println(a[i]);
				// low++; // 미달 건수 증가 시길 수도 있음(필요시)
			}
		}

	}

}
