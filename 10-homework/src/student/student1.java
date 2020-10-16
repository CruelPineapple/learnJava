package student;

import java.util.Scanner;

class student1 extends student{
     private int age;
     private String addr;
     public void getValue1(){
         Scanner scan=new Scanner(System.in);
         System.out.println("输入学生的信息(学号,姓名,性别,年龄,地址,用空格隔开)");
         String[] s=scan.nextLine().split(" ");
         setNum(Integer.parseInt(s[0]));
         setName(s[1]);
         setSex(s[2]);
         age=Integer.parseInt(s[3]);
         addr=s[4];
     }
     public void display1(){
         System.out.println("学号:"+getNum());
         System.out.println("姓名:"+getName());
         System.out.println("性别:"+getSex());
         System.out.println("年龄:"+age);
         System.out.println("地址:"+addr);
     }
}
