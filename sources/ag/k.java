package ag;

import Eg.n;
import Of.H;
import Xf.E;
import cg.e;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final d f67077a;

    /* renamed from: b  reason: collision with root package name */
    private final p f67078b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f67079c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f67080d;

    /* renamed from: e  reason: collision with root package name */
    private final e f67081e;

    public k(d dVar, p pVar, Lazy lazy) {
        C6496s.h(dVar, "components");
        C6496s.h(pVar, "typeParameterResolver");
        C6496s.h(lazy, "delegateForDefaultTypeQualifiers");
        this.f67077a = dVar;
        this.f67078b = pVar;
        this.f67079c = lazy;
        this.f67080d = lazy;
        this.f67081e = new e(this, pVar);
    }

    public final d a() {
        return this.f67077a;
    }

    public final E b() {
        return (E) this.f67080d.getValue();
    }

    public final Lazy c() {
        return this.f67079c;
    }

    public final H d() {
        return this.f67077a.m();
    }

    public final n e() {
        return this.f67077a.u();
    }

    public final p f() {
        return this.f67078b;
    }

    public final e g() {
        return this.f67081e;
    }
}
