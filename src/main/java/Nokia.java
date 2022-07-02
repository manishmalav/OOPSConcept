// This is called polymorphism
public class Nokia implements VoicePhone{

    private String IMEI;

    public Nokia(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public void call(VoicePhone voicePhone) {

    }
}
