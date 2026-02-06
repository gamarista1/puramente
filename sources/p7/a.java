package P7;

import com.facebook.react.bridge.WritableMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f33511a;

    /* renamed from: b  reason: collision with root package name */
    private final WritableMap f33512b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33513c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33514d;

    /* renamed from: e  reason: collision with root package name */
    private final e f33515e;

    public a(String str, WritableMap writableMap, long j10, boolean z10) {
        this(str, writableMap, j10, z10, f.f33531b);
    }

    /* access modifiers changed from: package-private */
    public WritableMap a() {
        return this.f33512b;
    }

    /* access modifiers changed from: package-private */
    public e b() {
        return this.f33515e;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f33511a;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f33513c;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f33514d;
    }

    public a(String str, WritableMap writableMap, long j10, boolean z10, e eVar) {
        this.f33511a = str;
        this.f33512b = writableMap;
        this.f33513c = j10;
        this.f33514d = z10;
        this.f33515e = eVar;
    }

    public a(a aVar) {
        this.f33511a = aVar.f33511a;
        this.f33512b = aVar.f33512b.copy();
        this.f33513c = aVar.f33513c;
        this.f33514d = aVar.f33514d;
        e eVar = aVar.f33515e;
        if (eVar != null) {
            this.f33515e = eVar.copy();
        } else {
            this.f33515e = null;
        }
    }
}
