package ObserverDP;

//Uses the Subject Interface to update all Observers
//This is the ConcreteSubject class of the Subject interface

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){

        observers = new ArrayList<Observer>();
    }


    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }

    }

    public void setIbmPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGOOGPRice){
        this.googPrice = newGOOGPRice;
        notifyObserver();
    }
}
