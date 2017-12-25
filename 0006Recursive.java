//递归调用
public class Recursive{
    public static void main(string arg[]){
        System.out.println(method(5));
    }
//只有执行方法才占内存
    public static int method(int n){
        if(n == 1){
            return 1;
        }else{
            return n*method(n-1);
        }
    }
}
