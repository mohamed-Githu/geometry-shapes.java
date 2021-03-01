package geometyshapes;

public class Triangle extends geometryArea {
    private double altezza;
    private double len;
    
    Triangle(double altezza, double len) {
        this.altezza = altezza;
        this.len = len;
    }
    
    @Override
    public double area() {
        return (altezza * len) / 2;
    }
}
