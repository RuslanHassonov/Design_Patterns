package ObserverDP;

//Represents (implements the interface) each Observer that is monitoring changes in the Subject
//ConcreteObserver that implements the Observer interface

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    //Used as a counter
    private static int observerIDTracker = 0;
    //Holds the ID to track observers
    private int observerID;
    //Holds reference to the ConcreteSubject StockGrabber in this instance
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        //Message to notify us of a new observer
        System.out.println("\nNew Observer " + this.observerID);
        //Add this observer to the 'registered' ArrayList int Subject
        stockGrabber.register(this);
    }

    //Called to update all observers
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.printf("Observer %d:\n - IBM: %.2f\n - Apple: %.2f\n - Google: %.2f\n", observerID, ibmPrice, aaplPrice, googPrice);
    }
}
