package Models;

/**
 * Represents the mentors
 * mentors are like the assistant of the teachers in the group
 */
public class Mentor {
    private int id;
    private Worker worker;
    private byte rate;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public byte getRate() {
        return rate;
    }

    public void setRate(byte rate) {
        this.rate = rate;
    }
}
