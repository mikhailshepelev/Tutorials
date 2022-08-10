package section_11_namings_packages_static_final_keywords.static_demo;

public class Main {

    public int multiplier = 7;

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3nd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

//        int answer = multiply(6);
//        System.out.println("The answer is " + answer);
//        System.out.println("Multiplier is " + multiplier);
    }

    public int multiply(int number) {
        return number * multiplier;
    }
}
