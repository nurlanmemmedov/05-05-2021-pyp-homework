package Models;

/**
 *  Represents address. This table contains no relations and must be deleted separately.
 */
public class Address {
    private int id;
    private String line;
    private double latitude;
    private double longitude;
    private String description;

    /**
     * this method merges the address information to string
     * @return the address as string
     */
    public String getAsString(){
        return "Line: "+ line + ", Latitude: " + latitude + ", Longitude: " + longitude + ", Description: " + description;
    }


    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
