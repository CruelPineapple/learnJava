package student;

import java.util.Scanner;

class student {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private int num;
    private String name;
    private String sex;
    public void getValue(){
        Scanner scan=new Scanner(System.in);
        System.out.println("输入学生的信息(学号,姓名,性别,用空格隔开)");
        String[] s=scan.nextLine().split( " ");
        num=Integer.parseInt(s[0]);
        name=s[1];
        sex=s[2];
    }
    public void display(){
        System.out.println("学号:"+num);
        System.out.println("姓名:"+name);
        System.out.println("性别:"+sex);
    }
}
