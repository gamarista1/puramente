package J;

import Q0.T;
import V0.h;
import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;

final class X {

    /* renamed from: a  reason: collision with root package name */
    private t f2988a;

    /* renamed from: b  reason: collision with root package name */
    private d f2989b;

    /* renamed from: c  reason: collision with root package name */
    private h.b f2990c;

    /* renamed from: d  reason: collision with root package name */
    private T f2991d;

    /* renamed from: e  reason: collision with root package name */
    private Object f2992e;

    /* renamed from: f  reason: collision with root package name */
    private long f2993f = a();

    public X(t tVar, d dVar, h.b bVar, T t10, Object obj) {
        this.f2988a = tVar;
        this.f2989b = dVar;
        this.f2990c = bVar;
        this.f2991d = t10;
        this.f2992e = obj;
    }

    private final long a() {
        return N.b(this.f2991d, this.f2989b, this.f2990c, (String) null, 0, 24, (Object) null);
    }

    public final long b() {
        return this.f2993f;
    }

    public final void c(t tVar, d dVar, h.b bVar, T t10, Object obj) {
        if (tVar != this.f2988a || !C6496s.c(dVar, this.f2989b) || !C6496s.c(bVar, this.f2990c) || !C6496s.c(t10, this.f2991d) || !C6496s.c(obj, this.f2992e)) {
            this.f2988a = tVar;
            this.f2989b = dVar;
            this.f2990c = bVar;
            this.f2991d = t10;
            this.f2992e = obj;
            this.f2993f = a();
        }
    }
}
