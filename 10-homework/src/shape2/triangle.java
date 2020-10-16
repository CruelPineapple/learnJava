package shape2;

 class triangle extends shape{
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    private double side;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;
    public triangle(double s,double h){
        side=s;
        height=h;
    }
    @Override
    double area() {
        return side*height/2;
    }
}
