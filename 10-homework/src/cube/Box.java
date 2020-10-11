package cube;

import java.util.Scanner;

class Box {
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int length;
    private int width;
    private int height;

    public boolean isIfGet() {
        return ifGet;
    }

    public void setIfGet(boolean ifGet) {
        this.ifGet = ifGet;
    }

    private boolean ifGet=false;
    public void getValue(){
        System.out.println("输入长方体的长");
        Scanner scan=new Scanner(System.in);
        length=scan.nextInt();
        System.out.println("输入长方体的宽");
        width=scan.nextInt();
        System.out.println("输入长方体的高");
        height=scan.nextInt();
        ifGet=true;
    }
    public void volume(){
            int v;
            v=length*width*height;
            System.out.println("长方体体积为"+v);
    }
}
