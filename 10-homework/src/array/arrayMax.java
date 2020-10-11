package array;

import java.util.Arrays;
import java.util.Scanner;

class arrayMax {
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    private int[] array=new int[10];
    private int max;
    public void setValue(){
        Scanner scan=new Scanner(System.in);
        System.out.println("输入十个数字，用空格隔开");
        String[] input =scan.nextLine().split(" ");
        for (int i=0;i<10;i++){
            array[i]=Integer.parseInt(input[i]);
        }
    }
    public void maxVolume(){
        Arrays.sort(array);
        max=array[9];
        System.out.println("最大值为："+max);
    }
}
