package Models;

/**
 *  Represents rooms inside the Code Academy
 */
public class ClassRoom {
    private int id;
    private String name;
    private int capacity;
    private Education education;


    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Education getEducationProgram() {
        return education;
    }

    public void setEducationProgram(Education education) {
        this.education = education;
    }
}
