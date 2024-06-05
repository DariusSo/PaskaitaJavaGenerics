package GENERIC_INTERFACES;

import static java.lang.Math.sqrt;

public class TriangleCalculator implements ShapeCalculator<Double>{

    @Override
    public Double calculateArea(Double a, Double b) {
        return a * b / 2;
    }

    @Override
    public Double calculatePerimeter(Double a, Double b) {
        return sqrt(a * a + b * b);
    }
}
