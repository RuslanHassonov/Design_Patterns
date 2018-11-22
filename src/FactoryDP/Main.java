package FactoryDP;

// --- FACTORY DESIGN PATTERN --- //

import FactoryDP.Factories.ShapeFactory;
import FactoryDP.Interfaces.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("Square");
        shape.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();
    }
}
