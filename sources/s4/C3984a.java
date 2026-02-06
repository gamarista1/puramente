package s4;

/* renamed from: s4.a  reason: case insensitive filesystem */
public class C3984a {

    /* renamed from: a  reason: collision with root package name */
    public String f48014a;

    /* renamed from: b  reason: collision with root package name */
    public String f48015b;

    /* renamed from: c  reason: collision with root package name */
    public String f48016c;

    public C3984a(String str, String str2, String str3) {
        this.f48014a = str;
        this.f48015b = str3 == null ? "" : str3;
        this.f48016c = str2;
    }

    public String a() {
        return this.f48015b + "/" + C3985b.b(this.f48014a, this.f48016c);
    }
}
