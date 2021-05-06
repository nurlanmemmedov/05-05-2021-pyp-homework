package Models;

import Enums.PaymentMethodType;

/**
 * Represents the methods of payment
 * for example : Web development -> one time - 1000AZN , 6 months - 1500AZN
 */
public class PaymentMethod {
    private int id;
    private PaymentMethodType type;
    private Education education;
    private double interestPrice;



    // setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaymentMethodType getType() {
        return type;
    }

    public void setType(PaymentMethodType type) {
        this.type = type;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public double getInterestPrice() {
        return interestPrice;
    }

    public void setInterestPrice(double interestPrice) {
        this.interestPrice = interestPrice;
    }
}
