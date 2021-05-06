package Models;

/**
 * Represents the departments inside the Code Academy,
 * example: Talant department, Software development department
 */
public class Department {
    private int id;
    private String name;
    private String description;

    // getters anda setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
