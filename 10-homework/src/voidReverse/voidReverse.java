package voidReverse;

public class voidReverse {
    public static void main(String[] args){
        int num=23453;
        reverse(num);
    }
    private static void reverse(int n){
        int length=0;
        if (n==0){
            length=1;
        }
        for (int temp=n;temp!=0;temp/=10){
            length++;
        }
        int[] reverseArr=new int[length];
        int i=0;
        while (n!=0){
            reverseArr[i]=n%10;
            n=n/10;
            i++;
        }
        for (int item:reverseArr){
            System.out.print(item);
        }
    }
}
