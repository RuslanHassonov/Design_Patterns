package StateDP;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please insert your PIN.");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted.");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("No card inserted.");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("No card inserted.");
    }
}
