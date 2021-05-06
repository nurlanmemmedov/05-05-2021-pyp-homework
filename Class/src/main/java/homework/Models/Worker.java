package Models;

import java.util.Date;

/**
 * Represents the workers
 */
public class Worker {
    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private String background;
    private int age;
    private Contact contact;
    private double salary;
    private Date joinedAt;
    private Department department;
    private File profilePhoto;

    /**
     * This method is written for getting full name of the worker
     * @return full name
     */
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    /**
     * This method is written for getting the path of profile photo
     * @return the path of profile photo
     */
    public String getImagePath(){
        return this.profilePhoto.getPath();
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Date joinedAt) {
        this.joinedAt = joinedAt;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public File getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(File profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
