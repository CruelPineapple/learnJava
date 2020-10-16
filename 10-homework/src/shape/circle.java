package shape;

 class circle extends shape{
  public double getRadius() {
   return radius;
  }

  public void setRadius(double radius) {
   this.radius = radius;
  }

  private double radius;
  public circle(double r){
   radius=r;
  }
  @Override
  double area() {
    return 3.14*3.14*radius;
  }
 }
