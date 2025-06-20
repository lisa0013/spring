package method;

/*
 * 메서드 선언/ 매개변수 / 리턴타입 / call by reference/value
 */
public class MainApp {
	
	public static void main(String[] args) {
		int kor = 100;
		int eng = 100;
		
		Calc calc = new Calc(kor, eng);
		
		calc.printMsg("header");
		calc.add();
		calc.printMsg("footer");
	}
	

	
}
