package N9;

/* renamed from: N9.s  reason: case insensitive filesystem */
public class C3069s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f33285a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33286b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33287c;

    /* renamed from: d  reason: collision with root package name */
    public final long f33288d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33289e;

    public C3069s(Object obj) {
        this(obj, -1);
    }

    public C3069s a(Object obj) {
        if (this.f33285a.equals(obj)) {
            return this;
        }
        return new C3069s(obj, this.f33286b, this.f33287c, this.f33288d, this.f33289e);
    }

    public boolean b() {
        if (this.f33286b != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3069s)) {
            return false;
        }
        C3069s sVar = (C3069s) obj;
        if (this.f33285a.equals(sVar.f33285a) && this.f33286b == sVar.f33286b && this.f33287c == sVar.f33287c && this.f33288d == sVar.f33288d && this.f33289e == sVar.f33289e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f33285a.hashCode()) * 31) + this.f33286b) * 31) + this.f33287c) * 31) + ((int) this.f33288d)) * 31) + this.f33289e;
    }

    public C3069s(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public C3069s(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public C3069s(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    protected C3069s(C3069s sVar) {
        this.f33285a = sVar.f33285a;
        this.f33286b = sVar.f33286b;
        this.f33287c = sVar.f33287c;
        this.f33288d = sVar.f33288d;
        this.f33289e = sVar.f33289e;
    }

    private C3069s(Object obj, int i10, int i11, long j10, int i12) {
        this.f33285a = obj;
        this.f33286b = i10;
        this.f33287c = i11;
        this.f33288d = j10;
        this.f33289e = i12;
    }
}
