package Pa;

public enum o {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f52143a;

    private o(String str) {
        this.f52143a = str;
    }

    public final String toString() {
        return this.f52143a;
    }
}
