package method;
/*
 * 참조변수 참조객체
 * 불변(상수)
 * 기본형타입		: int, double -> 불변
 * wrapper 클래스 : Integer -> 불변
 * String -> 불변
 */
public class RefTest {
	public static void main(String[] args) {
		int a = 10;
		int b = a; // 값을 복사
		b = 20; // a 변경되나? -> 불변
		
		String[] arr = new String[] {"hello", "scott"}; // 객체 참조 변수
		String[] dest = arr;
		dest[0] = "bye";
		System.out.println(arr[0]); // -> 가변
	}
}
