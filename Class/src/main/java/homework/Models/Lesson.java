package Models;

import java.util.Date;

/**
 * Represents the lessons of the group
 */
public class Lesson {
    private int id;
    private byte hours;
    private boolean isDone;
    private Group group;
    private Date lessonDate;
    private Date plannedLessonDate;

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getHours() {
        return hours;
    }

    public void setHours(byte hours) {
        this.hours = hours;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Date getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Date getPlannedLessonDate() {
        return plannedLessonDate;
    }

    public void setPlannedLessonDate(Date plannedLessonDate) {
        this.plannedLessonDate = plannedLessonDate;
    }
}
