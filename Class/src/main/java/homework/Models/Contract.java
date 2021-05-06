package Models;

/**
 * Represents the contract between the student and Code Academy
 */
public class Contract {
    private int id;
    private String ContractNumber;
    private Contact studentContact;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractNumber() {
        return ContractNumber;
    }

    public void setContractNumber(String contractNumber) {
        ContractNumber = contractNumber;
    }

    public Contact getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(Contact studentContact) {
        this.studentContact = studentContact;
    }
}
