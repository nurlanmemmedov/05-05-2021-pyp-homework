package Models;

/**
 * Represents the different type of programs of the education
 * for example: Web Development is education and 'Weekend morning groups' is the education program
 */
public class EducationProgram {
    private int id;
    private String name;
    private Education education;
    private int hours;
    private byte finishTimeWithWeeks;

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

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public byte getFinishTimeWithWeeks() {
        return finishTimeWithWeeks;
    }

    public void setFinishTimeWithWeeks(byte finishTimeWithWeeks) {
        this.finishTimeWithWeeks = finishTimeWithWeeks;
    }
}
