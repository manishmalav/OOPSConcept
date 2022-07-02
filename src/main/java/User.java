// Model/Entity Class
public class User {
    private String name;
    private VoicePhone voicePhone;

    // Constructor
    public User(String name, VoicePhone voicePhone) {
        this.name = name;
        this.voicePhone = voicePhone;
    }

    // Getter
    public String getName() {
        return name;
    }

    public VoicePhone getPhone() {
        return voicePhone;
    }
}
