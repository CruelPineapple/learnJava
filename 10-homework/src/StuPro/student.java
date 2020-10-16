package StuPro;

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

     private int num;
    private String name;
    public student(){

    }
    public student(int n,String e){
        num=n;
        name=e;
    }
    public void show(){
        System.out.println("学号:"+num);
        System.out.println("姓名:"+name);
    }
}
