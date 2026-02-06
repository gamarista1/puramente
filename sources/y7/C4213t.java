package y7;

/* renamed from: y7.t  reason: case insensitive filesystem */
public enum C4213t {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);
    

    /* renamed from: a  reason: collision with root package name */
    private final boolean f49800a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f49801b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f49802c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f49803d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f49804e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f49805f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f49806g;

    private C4213t(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f49800a = z10;
        this.f49801b = z11;
        this.f49802c = z12;
        this.f49803d = z13;
        this.f49804e = z14;
        this.f49805f = z15;
        this.f49806g = z16;
    }

    public final boolean b() {
        return this.f49804e;
    }

    public final boolean c() {
        return this.f49803d;
    }

    public final boolean e() {
        return this.f49800a;
    }

    public final boolean f() {
        return this.f49806g;
    }

    public final boolean i() {
        return this.f49801b;
    }

    public final boolean j() {
        return this.f49802c;
    }
}
