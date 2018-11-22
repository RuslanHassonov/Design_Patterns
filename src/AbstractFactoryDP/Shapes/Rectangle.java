package AbstractFactoryDP.Shapes;

import AbstractFactoryDP.Interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle:: draw() method - Rectangle is drawn.");
    }
}
