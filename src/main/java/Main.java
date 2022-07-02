/**
 * 1. Class
 * 2. Object
 * 3. Property
 * 4. Method
 * 5. Inhertinace
 * 6. Polymoprhism
 * 7. Encapsulation
 * 5. Singelton
 * 7. POJO
 * 9. Constructor
 * 10. Getter
 * 11. Setter
 * 13. 
 */

public class Main {
    public static void main(String[] args) {
        CallerService callerService = new CallerService();

        User piyush = new User("Piyush", new Nokia("XKSHD"));
        User manish = new User("Manish", new Samsung());
        User ram = new User("Ram", new Iphone());
        User jitu = new User("Jitu", new Nokia("NSKSN"));

        callerService.call(piyush, manish);
        callerService.videoCall(piyush, manish);
        callerService.videoCall(manish, ram);
    }
}
