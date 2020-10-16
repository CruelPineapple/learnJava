package StuPro;

 class student1 extends student{
     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getAddr() {
         return addr;
     }

     public void setAddr(String addr) {
         this.addr = addr;
     }

     public student getMonitor() {
         return monitor;
     }

     public void setMonitor(student monitor) {
         this.monitor = monitor;
     }

     private int age;
    private String addr;
    private student monitor=new student();
    public student1(){

    }
    public student1(int number,String stuName,int stuAge,String stuAddr,int monitorNum,String monitorName){
        setNum(number);
        setName(stuName);
        age=stuAge;
        addr=stuAddr;
        monitor.setNum(monitorNum);
        monitor.setName(monitorName);
    }
    public void show(){
        System.out.println("学号："+getNum());
        System.out.println("姓名："+getName());
        System.out.println("年龄："+age);
        System.out.println("地址："+addr);
        System.out.println("班长学号："+monitor.getNum());
        System.out.println("班长姓名："+monitor.getName());
    }
}
