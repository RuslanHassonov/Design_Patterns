package FactoryDP.Factories;

//use getShape method to get an object of required shape

import FactoryDP.Interfaces.Shape;
import FactoryDP.Shapes.Circle;
import FactoryDP.Shapes.Rectangle;
import FactoryDP.Shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType == null){
            return null;
        }
        return null;

    }

}
