package e0;

import f0.c;

/* renamed from: e0.a  reason: case insensitive filesystem */
public final class C1939a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f19523a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f19524b;

    public C1939a(Object obj, Object obj2) {
        this.f19523a = obj;
        this.f19524b = obj2;
    }

    public final boolean a() {
        if (this.f19524b != c.f19592a) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f19523a != c.f19592a) {
            return true;
        }
        return false;
    }

    public final Object c() {
        return this.f19524b;
    }

    public final Object d() {
        return this.f19523a;
    }

    public final C1939a e(Object obj) {
        return new C1939a(this.f19523a, obj);
    }

    public final C1939a f(Object obj) {
        return new C1939a(obj, this.f19524b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1939a() {
        /*
            r1 = this;
            f0.c r0 = f0.c.f19592a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C1939a.<init>():void");
    }

    public C1939a(Object obj) {
        this(obj, c.f19592a);
    }
}
