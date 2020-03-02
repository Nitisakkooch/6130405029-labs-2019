/*

*/
package koochaiyaphum.nitisak.lab5;

public  class TestShapeV2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("First rectangle Area = " + r1.getArea() + "Perimeter = " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(2.0, 3.0, "Pink", true);
        System.out.println(r2);
        System.out.println("Second rectangle Area = " + r2.getArea() + "Perimeter = " + r2.getPerimeter());

        Shape s1;
        s1 = new Circle(2.0, "Red", false);
        System.out.println("Circle : Area = " + s1.getArea() + "Perimeter = " + s1.getPerimeter());
        ((Circle) s1).setRadius(4.2);
        System.out.println("Circle : Area = " + ((Circle) s1).getRadius());
        s1 = new Circle(3.0, 2.5, "Purple", true);
        System.out.println("Rectangle : Area = " + s1.getArea() + "Perimeter = " + s1.getPerimeter());
        ((Rectangle) s1).setWigth(8.1);
        System.out.println("Rectangle has width of " + ((Rectangle) s1).setWigth() + " and height of " + ((Rectangle) s1).getLength());
    }
    
}