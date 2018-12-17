package StateDP;

public class HasCard implements ATMState{
    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You cannot enter a second card.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinEntered) {

        if (pinEntered == 1234){
            System.out.println("Correct PIN entered.");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPinState());
        }else {
            System.out.println("Incorrect PIN, try again.");
            atmMachine.correctPinEntered = false;
            System.out.println("Your card has been ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("You haven't entered your PIN.");

    }
}
