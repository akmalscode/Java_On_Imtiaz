package java_Basic;

import java.util.Scanner;

//public class IsPrime {
//	public static void main(String[] args) {
//
//		for (int num = 2; num <= 100; num++) {
//			boolean isPrime = true;
//
//			for (int i = 2; i <= num / 2; i++) {
//				if (num % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if (isPrime) {
//				System.out.print(num + " ");
//			}
//		}
//	}
//}

public class IsPrime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int num = 2; num <= n; num++) {
			boolean isPrime = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(num + " ");
			}
		}
	}
}