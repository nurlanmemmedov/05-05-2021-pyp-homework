package Models;

import java.util.Date;

/**
 * Represents the tasks
 * for example: home works, final projects
 */
public class Task {
    private int id;
    private String title;
    private String description;
    private String subject;
    private Instructor instructor;
    private Date taskDate;
    private Date mustAnswered;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public Date getMustAnswered() {
        return mustAnswered;
    }

    public void setMustAnswered(Date mustAnswered) {
        this.mustAnswered = mustAnswered;
    }
}
