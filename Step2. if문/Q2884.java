package baekjoon;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		
		if(m >= 45) System.out.println(h + " " + (m - 45));
		else {
			if(h == 0) System.out.println(23 + " " + (m + 15));
			else System.out.println((h - 1) + " " + (m + 15));
		}
	}
}