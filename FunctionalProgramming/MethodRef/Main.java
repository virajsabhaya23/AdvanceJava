package FunctionalProgramming.MethodRef;

public class Main {
    public static void main(String[] args) {
        
        //Hard way
        // Square s = new Square(4);
        // Shapes shapes = (Square square) -> {
        //     return square.calculateArea();
        // };
        // System.out.println("Area: "+ shapes.getArea(s));

        //method references
        Square s = new Square(4);
        Shapes shapes = Square::calculateArea;
        System.out.println("Area: "+ shapes.getArea(s));
    }
}
