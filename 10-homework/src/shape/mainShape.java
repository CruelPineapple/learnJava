package shape;

public class mainShape {
    public static void main(String[] args){
        circle circle1=new circle(5);
        System.out.println("圆的面积为"+circle1.area());
        rectangle rectangle1=new rectangle(10,20);
        System.out.println("矩形面积为"+rectangle1.area());
    }
}
