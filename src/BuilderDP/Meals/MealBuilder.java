package BuilderDP.Meals;

import BuilderDP.FoodItems.ChickenBurger;
import BuilderDP.FoodItems.Coke;
import BuilderDP.FoodItems.Pepsi;
import BuilderDP.FoodItems.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
