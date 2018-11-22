package BuilderDP.FoodItems;

import BuilderDP.Interfaces.Item;
import BuilderDP.Interfaces.Packing;
import BuilderDP.Packings.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
