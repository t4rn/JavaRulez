package DataModel;

import java.util.List;

/**
 * Created by kwitkowski on 2017-04-05.
 */
public class Application {
    private String owner;
    private String firm;
    private double amount;
    private boolean isOk;
    private int level;
    private boolean IsActive;
    private List<Insurance> insurances;

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    // Zwraca dane wniosku
    public String getAllInfo() {

        return  String.format("Owner = '%s %s' Amount = '%f' Level = '%d' IsOk = '%b' IsActive = '%b'",
                this.getOwner(), this.getFirm(), this.getAmount(), this.getLevel(), this.isOk(), this.isActive());
    }


    @Override
    public String toString()
    {
        return getAllInfo();
    }
}
