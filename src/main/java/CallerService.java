
// Service class
public class CallerService {

    public void call(User u1, User u2) {
        System.out.println(u1.getName() + " voice calling " + u2.getName());
        u1.getPhone().call(u2.getPhone());
    }

    public void videoCall(User u1, User u2) {
        if(u1.getPhone() instanceof SmartPhone && u2.getPhone() instanceof SmartPhone) {
            System.out.println(u1.getName() + " video calling " + u2.getName());
            // This is called casting
            ((SmartPhone) u1.getPhone()).videoCall((SmartPhone) u2.getPhone());
        } else {
            System.out.println("Video Call not supported");
        }
    }
}
