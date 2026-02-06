package Fe;

public enum B {
    GetURL("v1/url"),
    GetApp("v1/app-link-settings"),
    RegisterInstall("v1/install"),
    RegisterOpen("v1/open"),
    ContentEvent("v1/content-events"),
    TrackStandardEvent("v2/event/standard"),
    TrackCustomEvent("v2/event/custom"),
    GetLATD("v1/cpid/latd"),
    QRCode("v1/qr-code");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f30824a;

    private B(String str) {
        this.f30824a = str;
    }

    public String b() {
        return this.f30824a;
    }

    public String toString() {
        return this.f30824a;
    }
}
