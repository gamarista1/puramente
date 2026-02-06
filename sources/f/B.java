package F;

import c1.b;
import c1.c;
import c1.d;
import kotlin.jvm.internal.C6496s;
import yf.p;

final class B implements C1166a {

    /* renamed from: a  reason: collision with root package name */
    private final p f1920a;

    /* renamed from: b  reason: collision with root package name */
    private long f1921b = c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private float f1922c;

    /* renamed from: d  reason: collision with root package name */
    private C f1923d;

    public B(p pVar) {
        this.f1920a = pVar;
    }

    public C a(d dVar, long j10) {
        if (this.f1923d == null || !b.f(this.f1921b, j10) || this.f1922c != dVar.getDensity()) {
            this.f1921b = j10;
            this.f1922c = dVar.getDensity();
            C c10 = (C) this.f1920a.invoke(dVar, b.a(j10));
            this.f1923d = c10;
            return c10;
        }
        C c11 = this.f1923d;
        C6496s.e(c11);
        return c11;
    }
}
