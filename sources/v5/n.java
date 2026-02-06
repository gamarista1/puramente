package v5;

public enum n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f48848a;

    private n(String str) {
        this.f48848a = str;
    }

    public final String b() {
        return this.f48848a;
    }
}
