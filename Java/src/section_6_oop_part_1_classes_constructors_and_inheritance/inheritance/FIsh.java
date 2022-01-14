package section_6_oop_part_1_classes_constructors_and_inheritance.inheritance;

public class FIsh extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public FIsh(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
