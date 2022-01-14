package section_6_oop_part_1_classes_constructors_and_inheritance.carpet_cost_exercise;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
