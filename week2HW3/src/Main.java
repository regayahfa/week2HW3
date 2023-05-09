public class Main {
    public static void main(String[] args) {
        System.out.println("--------------RECTANGLE----------------");
        Rectangle AR1=new Rectangle("RED",true,2.0,1.5);
System.out.println(AR1);
        System.out.println(AR1.getColor());
        System.out.println(AR1.isFilled());
        System.out.println(AR1.getArea());

        System.out.println("------------CIRCLE------------------");

        Cirlce AR2=new Cirlce("green",true,2.0);
        System.out.println(AR2.getColor());
        System.out.println(AR2.isFilled());
       System.out.println(AR2.getArea());

        System.out.println("-------------Square-----------------");
        Square SQ3=new Square("blue",true,1.5,1.5);
        System.out.println(SQ3.getColor());
        System.out.println(SQ3.isFilled());
        System.out.println(SQ3.getSid());

    }


}