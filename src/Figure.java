
interface Figure {
    double calculateSurfaceArea();
    double calculateVolume();
}


class Cube implements Figure {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube: side = " + side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cube cube = (Cube) obj;
        return Double.compare(cube.side, side) == 0;
    }
}


class Sphere implements Figure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sphere sphere = (Sphere) obj;
        return Double.compare(sphere.radius, radius) == 0;
    }
}

