package xxzPlusyzz;

class result {

    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }

    public int[] getZ() {
        return z;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    private int[] x=new int[10];

    public void setY(int[] y) {
        this.y = y;
    }

    private int[] y=new int[10];

    public void setZ(int[] z) {
        this.z = z;
    }

    private int[] z=new int[10];
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
