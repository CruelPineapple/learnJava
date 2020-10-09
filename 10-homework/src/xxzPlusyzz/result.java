package xxzPlusyzz;

public class result {

        private final int[] x;
        private final int[] y;
        private final int[] z;
        public result(){
            x=new int[10];
            y=new int[10];
            z=new int[10];
        }
        private int index=0;
        public void insert(int a,int b,int c){
            index++;
            this.x[index]=a;
            this.y[index]=b;
            this.z[index]=c;
        }
        public void printResult(){
            for (;this.index>0;this.index--){
                System.out.println("x="+x[index]+",y="+y[index]+",z="+z[index]);
            }
        }
}
