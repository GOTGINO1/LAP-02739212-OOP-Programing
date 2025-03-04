import it.utils.shape.Circle;
import it.utils.shape.Rectangle;
import it.utils.shape.Shape;
import it.utils.shape.Triangle;

public class TestShape {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.inputParameters();
        System.out.println("Circle radius: "+ circle.getRadius());
        System.out.println("Circle area: "+ circle.getArea());
        System.out.println("Circle circumference: "+ circle.getCircumference());
        Triangle triangle = new Triangle();
        triangle.inputParameters();
        System.out.println("Triangle base: "+ triangle.getBase() +"height: "+ triangle.getHeight());
        System.out.println("Triangle area: "+ triangle.getArea());
        Rectangle rectangle = new Rectangle();
        rectangle.inputParameters();
        System.out.println("Rectangle Width: "+ rectangle.getWidth() + "height: "+ rectangle.getHeight());
        System.out.println("Rectangle Area: "+ rectangle.getArea());
    }
}