package StateDP;

import javax.annotation.processing.SupportedSourceVersion;

public class HasPin implements ATMState{

    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You have already inserted a card.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You have already entered your PIN.");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine){
            System.out.println("Insufficient funds on your account.");
            System.out.println("Your card is ejected.");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }else{
            System.out.println(cashToWithdraw + "$ amount has been withdrawn.");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

            System.out.println("Your card is ejected.");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if (atmMachine.cashInMachine <= 0){
                System.out.println("ATM is out of money.");
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }

    }


}
