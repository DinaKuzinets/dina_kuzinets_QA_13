public class Quadratic {

    int a;
    int b;
    int c;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int discriminant() {
        return b * b - 4 * a * c;
    }
}
