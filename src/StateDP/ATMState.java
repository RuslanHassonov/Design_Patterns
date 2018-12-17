package StateDP;

//Different states expected
//HasCard, NoCard, HasPin, NoCash
public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
