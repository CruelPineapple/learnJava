package reverse;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("输入一个整数");
        int num= scan.nextInt();
        int length=getLength(num);
        int[] reverseArr=new int[length];
        insertArrReverse(num,reverseArr);
        System.out.println("这是一个"+length+"位数");
        System.out.println("逆序输出：");
        printArr(reverseArr);
        System.out.println("各位数和为"+getSum(reverseArr));
    }
    private static int getSum(int[] arr){
        int sum=0;
        for (int item : arr) {
            sum = sum + item;
        }
        return sum;
    }
    private static void printArr(int[] arr){
        int cnt;
        for (cnt=0;cnt<arr.length;cnt++){
            System.out.print(arr[cnt]);
        }
    }
    private static void insertArrReverse(int n,int[] arr){
        int i=0;
        while (n!=0){
            arr[i]=n%10;
            n=n/10;
            i++;
        }
    }
    private static int getLength(int n){
        if (n==0){
            return 1;
        }
        int length=0;
        for (int temp=n;temp!=0;temp/=10){
            length++;
        }
        return length;
    }
}
