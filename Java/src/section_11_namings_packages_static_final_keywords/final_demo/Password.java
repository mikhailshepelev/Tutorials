package section_11_namings_packages_static_final_keywords.final_demo;

public class Password {
    private static final int key = 748576362;
    private final int enctyptedPassword;

    public Password(int enctyptedPassword) {
        this.enctyptedPassword = encryptDecrypt(enctyptedPassword);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.enctyptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.enctyptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
