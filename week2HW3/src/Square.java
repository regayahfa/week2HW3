public class Square extends Rectangle{

    public Square(String color,boolean filled,double width,double length) {
        super(color, filled, width, length);
    }

    public Square(double width, double length) {
        super(width, length);
    }



    public double getSid(){
        return 2*(getLength()+getWidth());
    }
    public void  setSid(double sid){

    }
}
