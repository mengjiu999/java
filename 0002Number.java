package day1;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		int num = 0;
		int g = 0, s = 0, b = 0;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();

		g = num % 10;
		b = num / 100;
		s = num / 10 % 10;
		
		for(int i=0;i<b;i++)
		{
			System.out.print("B");
		}
		for(int i=0;i<s;i++)
		{
			System.out.print("S");
		}
		for(int i=1;i<=g;i++)
		{
			System.out.print(i);
		}
	}
}