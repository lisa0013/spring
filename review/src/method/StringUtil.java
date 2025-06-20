package method;

public class StringUtil {

	public String upper(String str) {
		str = "HELLO";
		return str;
	}
	
	public void upper(String[] strs) { // 참조 변수로 넘기면 값이 바뀐다.
		strs[0] = "HELLO";
	}
}
