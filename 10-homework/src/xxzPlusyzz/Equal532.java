package xxzPlusyzz;

public class Equal532 {

    public static void main(String[] args){
        int sum = 532;
        result R = new result();
        int x, y, z;
        for (x = 0; x <= 9; x++) {
            for (y = 0; y <= 9; y++) {
                for (z = 0; z <= 9; z++) {
                    if (110 * x + z + 100 * y + 11 * z == sum) {
                        R.insert(x,y,z);
                    }
                }
            }
        }
        System.out.println("可能的答案为：");
        R.printResult();
    }
}
