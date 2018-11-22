package BuilderDP.FoodItems;

import BuilderDP.Interfaces.Item;
import BuilderDP.Interfaces.Packing;
import BuilderDP.Packings.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
