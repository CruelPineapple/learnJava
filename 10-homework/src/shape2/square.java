package shape2;

 class square extends shape{
     public double getSide() {
         return side;
     }

     public void setSide(double side) {
         this.side = side;
     }

     private double side;
     public square(double s){
         side=s;
     }
     @Override
     double area() {
         return side*side;
     }
 }
