package Oh;

public abstract class d {

    /* renamed from: d  reason: collision with root package name */
    private static volatile e f64548d = e.f64552u;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuffer f64549a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f64550b;

    /* renamed from: c  reason: collision with root package name */
    private final e f64551c;

    public d(Object obj, e eVar, StringBuffer stringBuffer) {
        eVar = eVar == null ? b() : eVar;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f64549a = stringBuffer;
        this.f64551c = eVar;
        this.f64550b = obj;
        eVar.G(stringBuffer, obj);
    }

    public static e b() {
        return f64548d;
    }

    public d a(String str, Object obj) {
        this.f64551c.a(this.f64549a, str, obj, (Boolean) null);
        return this;
    }

    public Object c() {
        return this.f64550b;
    }

    public StringBuffer d() {
        return this.f64549a;
    }

    public e e() {
        return this.f64551c;
    }

    public String toString() {
        if (c() == null) {
            d().append(e().S());
        } else {
            this.f64551c.z(d(), c());
        }
        return d().toString();
    }
}
