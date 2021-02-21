package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10951 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextInt()) {
			int i = s.nextInt();
			int j = s.nextInt();
			arr.add(i + j);
		}
		
		for(int k = 0; k < arr.size(); k++) {
			System.out.println(arr.get(k));
		}
	}
}