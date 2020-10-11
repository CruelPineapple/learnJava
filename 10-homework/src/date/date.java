package date;

import java.util.Scanner;

class date {
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private int year;
    private int month;
    private int day;
    public void setDate(){
        Scanner scan=new Scanner(System.in);
        System.out.println("输入年，月，日（空格分隔）");
        String[] input =scan.nextLine().split(" ");
        year=Integer.parseInt(input[0]);
        month=Integer.parseInt(input[1]);
        day=Integer.parseInt(input[2]);
    }
    public void showDate(){
        System.out.println("输入的日期是："+year+"年"+month+"月"+day+"日");
    }
}
