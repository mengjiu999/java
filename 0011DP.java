//正整数A的DA（一位整数）部分定义为由A中所有DA组成的新整数PA，例如，给定A=386276，DA = 6，则A的“6部分“PA是66，因为A中有2个6，现给定A,DA,B,DB,请计算PA + PB
public class DP{
    public static void main(String [] args){
        int A = 1234568765;
        int DA = 6;
        int B =13247632;
        int DB = 6;
        int PA,PB,i;
        for(A;A != 0;A /= 10){
            if(A%10 == DA){
                PA = PA*10 + DA;
            }
        }
        for(B;B != 0;B /= 10){
            if(B%10 == BA){
                PB = PB*10 + DB;
            }
        }
        i = PA + PB;
        System.out.println(i);
    }
}
