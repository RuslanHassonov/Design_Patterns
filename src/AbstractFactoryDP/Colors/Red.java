package AbstractFactoryDP.Colors;

import AbstractFactoryDP.Interfaces.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red:: fill() method - Red color.");
    }
}
