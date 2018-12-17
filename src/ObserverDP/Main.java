package ObserverDP;

public class Main {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(453.21);
        stockGrabber.setGoogPrice(342.12);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(999.99);
        stockGrabber.setAaplPrice(999.99);
        stockGrabber.setGoogPrice(999.99);

        //Delete one of the observers
        stockGrabber.unregister(observer1);
        stockGrabber.setIbmPrice(999.99);
        stockGrabber.setAaplPrice(999.99);
        stockGrabber.setGoogPrice(999.99);

    }
}
