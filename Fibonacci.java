public class Fibonacci{
    public static void main(){
        long a = 0;
        long b = 1;
        long c,count=1;
        while(count>0){
            c = a + b;
            System.out.println(a+"+"+b+"="+c);
            a = b;
            b = c;
            
            count++;

            // The output of fibonacci series might come as negative integers from the no. -6246583658587674878 as long datatype overflows its capacity limit.
        }
    }
}
