package taylor;

import java.util.Scanner;

public class taylor {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
//        String[] s = scan.nextLine().split(" ");
        double x=Double.parseDouble(scan.next());
        int i;
        int n=8;
        double cos=1,t=1;
        for (i=1;i<=n;i++){
            t *=x*x;
            t /=2*i*(2*i-1);
            t *= -1;
            cos +=t;
        }
        System.out.println("cos("+x+")="+cos);
    }
}
