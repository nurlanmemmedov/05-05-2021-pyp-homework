package Models;

import Enums.Gender;

/**
 * Represents the student studied in Code Academy
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Contact contact;
    private Group group;
    private byte age;
    private Gender gender;
    private double totalPoint;
    private boolean isFinished;
    private boolean isFromGuarantee;

    /**
     * This method is written for getting full name of the student
     * @return full name
     */
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(double totalPoint) {
        this.totalPoint = totalPoint;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public boolean isFromGuarantee() {
        return isFromGuarantee;
    }

    public void setFromGuarantee(boolean fromGuarantee) {
        isFromGuarantee = fromGuarantee;
    }
}
