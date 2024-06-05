package GENERIC_INTERFACES;

public interface ShapeCalculator <T extends Number>{
    T calculateArea(T a, T b);
    T calculatePerimeter(T a, T b);
}
