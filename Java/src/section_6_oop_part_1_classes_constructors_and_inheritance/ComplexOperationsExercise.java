package section_6_oop_part_1_classes_constructors_and_inheritance;

public class ComplexOperationsExercise {
    private double real;
    private double imaginary;

    public ComplexOperationsExercise(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexOperationsExercise complexOperationsExercise) {
        this.real += complexOperationsExercise.real;
        this.imaginary += complexOperationsExercise.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexOperationsExercise complexOperationsExercise) {
        this.real -= complexOperationsExercise.real;
        this.imaginary -= complexOperationsExercise.imaginary;
    }
}
