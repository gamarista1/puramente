package v5;

public enum k {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f48802a;

    private k(String str) {
        this.f48802a = str;
    }

    public final String b() {
        return this.f48802a;
    }
}
