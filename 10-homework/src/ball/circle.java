package ball;

import java.text.DecimalFormat;
import java.util.Scanner;

class circle {
    private int radius;
    public void getValue(){
        System.out.println("输入球半径");
        Scanner scan=new Scanner(System.in);
        radius=scan.nextInt();
    }
    public void volume(){
        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println("球体积为："+df.format(radius*radius*radius*3.14*4/3));
    }
}
