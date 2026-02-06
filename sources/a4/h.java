package A4;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f29371a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29372b;

    /* renamed from: c  reason: collision with root package name */
    public final float f29373c;

    public h(String str, float f10, float f11) {
        this.f29371a = str;
        this.f29373c = f11;
        this.f29372b = f10;
    }

    public boolean a(String str) {
        if (this.f29371a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f29371a.endsWith("\r")) {
            String str2 = this.f29371a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
