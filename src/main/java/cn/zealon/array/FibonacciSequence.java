package cn.zealon.array;

/**
 * 斐波那契数列
 * @auther: Zealon
 * @Date: 2018-11-26 16:14
 */
public class FibonacciSequence {

    public static void main(String[] args){
        int count = fib1(6);
        System.out.println(count);
    }

    public static int getRabbit(int month){
        if (month == 1 || month == 2){
            return 1;
        }else {
            int temp = 1;
            for (int i = 3; i <= month; i++) {
                int current = temp;
            }
        }
        return 0;
    }

    // 递归算法
    public static int fib1(int n){
        if (n<1){
            return -1;
        }
        if (n==1 || n==2){
            return 1;
        }
        return fib1(n-1)+fib1(n-2);
    }
}
