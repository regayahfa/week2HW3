public class Cirlce extends Shape{
    private double radius=1.0;

    public Cirlce(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
  public Cirlce(double radius){
this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2* Math.PI*radius;
    }
    public double getPerimeter(double Perimeter){
        return Perimeter;
    }

    @Override
    public String toString() {
        return "Cirlce{" +
                "radius=" + radius +
                '}';
    }
}
