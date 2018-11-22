package SingletonDP;

// --- Singleton Design Pattern --- //

public class Main {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        object.ShowMessage();

    }
}
