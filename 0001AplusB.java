package day1;

import java.util.Scanner;
public class AplusB {
		
	public static void main(String[] args) {
		int a = 0, b = 0;
		int pa = 0, pb = 0;
		int da = 0, db = 0;

		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		da = in.nextInt();
		db = in.nextInt();
		do {
			if (a % 10 == da)
				pa = pa * 10 + da;
			if (b % 10 == db)
				pb = pb * 10 + db;
			a = a / 10;
			b = b / 10;
		} while (a != 0 && b != 0);
		
		System.out.println(pa+pb);
	}

}
