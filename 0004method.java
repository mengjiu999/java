public class a{
	public static void main(String [] args){
		double a = 100;
		double b = 100;
		for(int i = 19;i>=1;i--){
			b = b/2;
			a = a + 2*b;
		}
		System.out.println(a);
	}
}
