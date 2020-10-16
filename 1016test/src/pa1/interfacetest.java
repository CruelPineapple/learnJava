package pa1;

interface A
{
    double g=9.8;
    void show();
}
class B implements A
{
    public void show(){
        System.out.println("g="+g);
    }//类必须实现接口继承的全部方法
}
public class interfacetest {
    public static void main(String[] args){
        B b=new B();
        b.show();
        A a=new B();
        a.show();
    }
}
