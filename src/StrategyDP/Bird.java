package StrategyDP;

public class Bird extends Animal {

    public Bird(){
        super();
        setSound("Tweet-tweet!");

        flyingType = new ItFlies();
    }
}
