package shape;

 class rectangle extends shape{
     public double getLength() {
         return length;
     }

     public void setLength(double length) {
         this.length = length;
     }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     private double length;
     private double width;
     public rectangle(double l,double w){
         length=l;
         width=w;
     }
     @Override
     double area() {
         return length*width;
     }
 }
