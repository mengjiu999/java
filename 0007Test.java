//求数列1，1，2，3，5，8……第40个数的值
public class Test{
    public static void main(String arg[]){
        System.out.println(f(40));
    }
    public static int f(int n){
        if(n == 1||n == 2){
            return 1;
        }else{
            return f(n-1)+f(n-2);
        }
    }
}
