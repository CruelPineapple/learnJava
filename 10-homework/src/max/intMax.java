package max;

public class intMax {
    private static int max(int a,int b,int c){
        if (a>b&&a>c){
            return a;
        }else if (b>a&&b>c){
            return b;
        }else if (c>a&&c>b){
            return c;
        }else {
            System.out.println("没有最大数");
            return -1;
        }
    }
    public static void main(String[] args){
        System.out.println(max(7,8,9));
    }
}
