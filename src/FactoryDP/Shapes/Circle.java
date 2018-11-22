package FactoryDP.Shapes;

import FactoryDP.Interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method - Circle is drawn.");
    }
}
