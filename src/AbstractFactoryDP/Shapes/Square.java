package AbstractFactoryDP.Shapes;

import AbstractFactoryDP.Interfaces.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square:: draw() method - Square is drawn.");
    }
}
