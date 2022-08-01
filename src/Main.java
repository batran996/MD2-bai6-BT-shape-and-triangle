public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("pink",false);
        System.out.println("=======triangle=========");
        Triangle triangle = new Triangle("green", true, 4.0, 5.0, 6.5);
        System.out.println(triangle);
        triangle = new Triangle("green",true,4.0,5.0,6.5);
        System.out.println(triangle);

    }
}