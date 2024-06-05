package GENERIC_INTERFACES;

public class RectangleCalculator implements ShapeCalculator<Double>{

    @Override
    public Double calculateArea(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double calculatePerimeter(Double a, Double b) {
        return a * 2 + b * 2;
    }
}
