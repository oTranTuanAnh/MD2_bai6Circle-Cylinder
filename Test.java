public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,"red");
        System.out.println(c1);
        System.out.println(c1.getArea());

        Cylinder cy = new Cylinder(5, "green", 10);
        System.out.println(cy);
        System.out.println(cy.getVolume());
    }
}
