package DataModel;

/**
 * Created by kwitkowski on 2017-04-05.
 */
public class Insurance {

    private String code;
    private double amount;
    private int period;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Insurance(String iCode, double iAmount, int iPeriod ) {
        this.code = iCode;
        this.amount = iAmount;
        this.period = iPeriod;
    }
}
