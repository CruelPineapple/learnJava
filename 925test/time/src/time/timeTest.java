package time;

public class timeTest
{
    public static void main(String[] args) {
        Time1 time=new Time1();
        time.setTime(21, 15, 30);
        displayTime("设置的时间", time);
}
    private static void displayTime(String header,Time1 t)
    {
        System.out.printf("%s%n通用时间: %s%n标准时间: %s%n",header, t.toUniversalString(), t.toString());
    }
    //目前vscode提供的debugger学会了自动encoding UTF-8
    //手动编译运行需要编译所有的源文件，并退回上级目录以(本程序为例)time.timeTest运行
    //推测语义是运行package "time"中的timeTest
}
