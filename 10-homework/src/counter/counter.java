package counter;

import java.util.Scanner;

public class counter {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double num1,num2;
        try {
            System.out.println("输入一个数字");
            num1=scan.nextDouble();
        }catch (Exception e){
            System.out.println("你输入的不是数字");
            return;
        }
        try {
            System.out.println("输入另一个数字");
            num2=scan.nextDouble();
        }catch (Exception e){
            System.out.println("你输入的不是数字");
            return;
        }
        System.out.println("输入+,-,*,/");
        if (scan.hasNext()){
            String str=scan.next();
            char[] chars=str.toCharArray();
            double sum = 0;
            switch (chars[0]) {
                case '+' -> sum = num1 + num2;
                case '-' -> sum = num1 - num2;
                case '*' -> sum = num1 * num2;
                case '/' -> sum = num1 / num2;
                default -> System.out.println("输入的不是运算符！");
            }//增强switch
            System.out.println(num1+""+chars[0]+num2+"="+sum);
        }


    }
}
