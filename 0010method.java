public class c{
    public static void main{
    int N = 1024;
    int n =0;
    int M,z;
    int m = 0;
        for(N;N>1;N--){
            for(int i = N;i>1;i--){
                if(N % i == 0){
                    n++;
                }
                if(n == 0){
                    M = N+2;
                    for(int a = M;a>1;a--){
                        if(M % a == 0){
                            m++;
                    }
                }
                if(m == 0){
                    z++;
                }
            }
        }
    System.out.println(z);
    }
}

