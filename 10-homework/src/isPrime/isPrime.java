package isPrime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args){
        System.out.println("输入一个数字");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        System.out.println("输入另一个数字");
        int num2=input.nextInt();
        System.out.println(num1+"~"+num2+"之间的素数有");
        for (int i=num1;i<num2;i++){
            if (Prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean Prime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
