package We;

public enum D0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Unknown("__unknown__");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f65567a;

    public static final class a {
    }

    private D0(String str) {
        this.f65567a = str;
    }
}
