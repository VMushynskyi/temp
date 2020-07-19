package patterns.strategy;

public class PayingMethods {
    private PayingStrategy payingStrategy;

    public void setPayingStrategy(PayingStrategy payingStrategy){
        this.payingStrategy = payingStrategy;
    }
}
