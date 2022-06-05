package interface1;

public class Demo2 {


    public static void main(String[] args) {

        double result;

        Rectangle rectangle = new Rectangle(123, 231, 34, 45);
        result = rectangle.getArea();
        System.out.println(result);
        result = rectangle.getPerimetr();
        System.out.println(result);

        System.out.println("\n");

        Figure circle = new Circle(233, 127, 12);
        result = circle.getArea();
        System.out.println(result);
        result = circle.getPerimetr();
        System.out.println(result);


        System.out.println("\n");

        Movable movable = new Circle(13, 16, 3);
        movable.movable(12, 24);


        System.out.println("\n");

        Ellipse ellipse = new Ellipse(235, 156, 27, 13);
        result = ellipse.getArea();
        System.out.println(result);
        result = ellipse.getPerimetr();
        System.out.println(result);

        System.out.println("\n");

        Scalable scalable = new Ellipse(23, 15, 28, 19);
        scalable.scalable();

        Test test = new Test();
        test.resize(ellipse);
    }
}

     class Test {
        void resize(Scalable scalable) {
            scalable.scalable();
        }

     }

