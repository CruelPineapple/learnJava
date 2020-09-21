public class compareStr{
    public static void main(String args[]){
        int a=10;
        int b=10;
        System.out.println(a==b);//true
        String str1=new String("abc");
        String str2=new String("abc");
        System.out.println(str1.equals(str2));//true
        System.out.println(str1==str2);//false
        //this compares the pointer of two srings,to judge whether they point the same object
        String str3="abc";
        String str4="abc";
        System.out.println(str3==str4);//true here, the two string shares the same memory
        System.out.println(str3.equals(str4));//true
        System.out.println("中文");//编译存在中文的程序时，使用javac -encoding UTF-8 fileName.java
    }
}
