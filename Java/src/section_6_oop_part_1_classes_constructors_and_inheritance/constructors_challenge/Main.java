package section_6_oop_part_1_classes_constructors_and_inheritance.constructors_challenge;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account(); // ("12345", 0, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withdrawal(100.55);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
