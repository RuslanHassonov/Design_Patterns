package StrategyDP;

//The super class that allows subclasses Dog and Bird to extend from it
//Provides interaction with interface Flies as it holds connection with an instance variable

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flies flyingType;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double newHeight) {
        if (newHeight > 0) {
            this.height = newHeight;
        } else {
            System.out.println("Height must be bigger than 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setFavFood(String newFavFood) {
        this.favFood = newFavFood;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSound(String newSound) {
        this.sound = newSound;
    }

    public String getSound() {
        return sound;
    }

    //Calls the fly method from Flies interface that has been adjusted to Dog or Bird
    /* BAD
    * You don't want to add methods to the super class.
    * You need to separate what is different between subclasses
    * and the super class
    public void fly(){

        System.out.println("I'm flying");

    }
    */


    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flies newFlyType){
        this.flyingType = newFlyType;
    }
}
