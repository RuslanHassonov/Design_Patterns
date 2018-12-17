package StrategyDP;

public class Main {

    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly() + " - " + sparky.getSound());
        System.out.println("Bird: " + tweety.tryToFly() + " - " + tweety.getSound());

        //Dynamically change the ability to fly when needed

        sparky.setFlyingAbility(new ItFlies());
        System.out.println("Dog: " + sparky.tryToFly() + " - " + sparky.getSound());
    }
}
