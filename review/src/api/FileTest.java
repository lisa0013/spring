package api;

import java.io.File;

/*
 * 자바 API : 메서드 -> 인수, 리턴
 */
public class FileTest {
	public static void main(String[] args) {
		
		// temp 파일 목록 / 삭제 / 정보확인
		File file = new File("c:/temp/pdf_files.zip");
		file.renameTo(new File("c:/temp/영쪄.zip"));
		
		
	}
}
