package geometyshapes;

public class Circle extends geometryArea {
    private double raggio;
    
    Circle(double raggio) {
        this.raggio = raggio;
    }
    
    @Override
    public double area() {
        return raggio * raggio * 3.14;
    }
}
