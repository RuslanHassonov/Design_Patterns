package StateDP;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMAchine){
        this.atmMachine = newATMMAchine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM is out of money.");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM is out of money.");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("ATM is out of money.");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("ATM is out of money.");

    }
}
