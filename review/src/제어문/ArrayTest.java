package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) throws FileNotFoundException {
		
		int[] a = new int[5]; // 길이가 5개인 배열
		
		for(int i = 0; i < 5; i++) {
			a[i] = 10; // 5번 도는 동안 10이 들어감
		}
	}	
}
