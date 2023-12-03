public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(3);

        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube toString: " + cube.toString());
        System.out.println("Cube equals Sphere: " + cube.equals(sphere));

        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere toString: " + sphere.toString());
    }
}
