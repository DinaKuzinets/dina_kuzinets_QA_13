

public class App {

    public static void main(String[] args) {
        Square s = new Square(7);
        System.out.println("Square area is " + s.area());

        Rectangle r = new Rectangle(7, 15);
        System.out.println("Rectangle area is " + r.area());

        Quadratic q = new Quadratic(17, 18, 20);
        if (q.a == 0) {
            System.out.println("It is not a quadratic equation");
        } else if (q.discriminant() > 0) {
            System.out.println("Number of roots of the quadratic is 2");
        } else if (q.discriminant() == 0) {
            System.out.println("Number of roots of the quadratic is 1");
        } else if (q.discriminant() < 0) {
            System.out.println("Number of roots of the quadratic is 0. There is no solution");
        }

    }
}
