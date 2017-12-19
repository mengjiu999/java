package day1;

import java.util.Scanner;

public class SuShuDui {
	public static void main(String[] args) {

		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int n = 0;

		for (int i = 3; i <= num; i++) {
			if (isPrime(i)) {
				if(isPrime(i+2)) {
					n++;
				}
				else {
					i++;//跳过偶数
				}
			}
		}
		System.out.println(n);
	}

	public static boolean isPrime(int num) {
		boolean flag = true;
		int temp = (int) Math.sqrt(num);
		int i;
		for (i = 2; i <= temp; i++) {
			if (num % i == 0)
				flag = false;
		}
		return flag;
	}
}
