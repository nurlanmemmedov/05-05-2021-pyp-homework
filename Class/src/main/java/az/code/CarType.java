package az.code;

public enum CarType {
    SEDAN("Sedan type", 5),
    SUV("SUB type", 2),
    SPORT("Sport type", 1);

    String label;
    int index;

    CarType(String label, int index) {
        this.label = label;
        this.index = index;
    }

}
