public class int{
    public static void main(String [] args){
        int B =145;
        int m,n,i;
        int z = 0;
        m = B / 100;
        n = (B % 100)/10;
        i = B % 10;
        for(m;m != 0;m--){
            System.out.print("B");
        }
        for(n;n != 0;n--){
            System.out.print("S");
        }
        for(n;n != 0;n--){
            z++;
            System.out.print(z);
        }
    }
}
