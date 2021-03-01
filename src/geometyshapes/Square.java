package geometyshapes;

public class Square extends geometryArea {
    private double len;
    
    Square(double len) {
        this.len = len;
    }
    
    @Override
    public double area() {
        return len * len;
    }
}
