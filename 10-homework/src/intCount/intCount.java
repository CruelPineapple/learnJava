package intCount;

public class intCount {
    private static int count(char[] p){
        String str=new String(p);
        return str.length();
    }
    public static void main(String[] args){
        char[] p=new char[90];
        System.out.println(count(p));
    }
}
