package shape2;

public class shapeMain {
    public static void main(String[] args){
        square square1=new square(5);
        System.out.println("正方形面积为"+square1.area());
        triangle triangle1=new triangle(4,8);
        System.out.println("三角形面积为"+triangle1.area());
    }
}
