package AbstractFactoryDP;

// --- Abstract Factory Design Patter --- //

import AbstractFactoryDP.Factories.AbstractFactory;
import AbstractFactoryDP.Factories.FactoryProducer;
import AbstractFactoryDP.Interfaces.Color;
import AbstractFactoryDP.Interfaces.Shape;

public class Main {
    public static void main(String[] args) {

        //get a shape factory from Factory Producer
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get and draw some shapes
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //get a color factory from Factory Producer
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get and fill some colors
        Color color = colorFactory.getColor("BLUE");
        color.fill();
        Color color1 = colorFactory.getColor("GREEN");
        color1.fill();
        Color color2 = colorFactory.getColor("RED");
        color2.fill();




    }
}
