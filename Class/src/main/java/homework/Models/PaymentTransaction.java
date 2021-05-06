package Models;

import Enums.TransactionType;

import java.util.Date;

/**
 * Represents the transactions of student payments
 */
public class PaymentTransaction {
    private int id;
    private StudentPayment payment;
    private TransactionType type;
    private double amount;
    private boolean isPaid;
    private Date paidAt;
    private Date mustPaid;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentPayment getPayment() {
        return payment;
    }

    public void setPayment(StudentPayment payment) {
        this.payment = payment;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }

    public Date getMustPaid() {
        return mustPaid;
    }

    public void setMustPaid(Date mustPaid) {
        this.mustPaid = mustPaid;
    }
}
