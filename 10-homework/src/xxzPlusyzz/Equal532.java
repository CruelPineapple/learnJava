package xxzPlusyzz;

import java.util.Arrays;

public class Equal532 {
    public static void main(String[] args){
        int sum=532;
        int[] result=new int[30];
        Arrays.fill(result,-1);
        judge(sum,result);
        printResult(result);
    }
    public static void printResult(int[] result){
        int cnt=1,index=3*cnt-1;
        System.out.println("可能的值为：");
        while (result[index]!=-1){
            System.out.println("x="+result[index-2]+",y="+result[index-1]+",z="+result[index]);
            cnt++;
            index=3*cnt-1;
        }
    }
    public static void judge(int sum,int[] result){
        int x,y,z,cnt=0,index;
        for (x=0;x<=9;x++){
            for (y=0;y<=9;y++){
                for (z=0;z<=9;z++){
                    if(110*x+z+100*y+11*z==sum){
                        cnt++;
                        index=3*cnt-1;
                        result[index-2]=x;
                        result[index-1]=y;
                        result[index]=z;
                    }
                }
            }
        }
    }
}
