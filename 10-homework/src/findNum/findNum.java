package findNum;


public class findNum {
    public static void main(String[] args){
        int start=100,end=200;
        boolean printed=false;
        System.out.println("100～200中同时满足用3除余2，用5除余3和用7除余2的整数是：");
        for (int i=start;i<=end;i++){
            if (i%3==2&&i%5==3&&i%7==2){
                System.out.println(i);
                printed=true;
            }
        }
        if (!printed){
            System.out.println("没有符合要求的数");
        }
    }
}
