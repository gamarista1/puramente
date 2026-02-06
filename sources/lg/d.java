package Lg;

import Fg.S;
import Gg.e;
import Of.m0;
import kotlin.jvm.internal.C6496s;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private final m0 f64076a;

    /* renamed from: b  reason: collision with root package name */
    private final S f64077b;

    /* renamed from: c  reason: collision with root package name */
    private final S f64078c;

    public d(m0 m0Var, S s10, S s11) {
        C6496s.h(m0Var, "typeParameter");
        C6496s.h(s10, "inProjection");
        C6496s.h(s11, "outProjection");
        this.f64076a = m0Var;
        this.f64077b = s10;
        this.f64078c = s11;
    }

    public final S a() {
        return this.f64077b;
    }

    public final S b() {
        return this.f64078c;
    }

    public final m0 c() {
        return this.f64076a;
    }

    public final boolean d() {
        return e.f63178a.c(this.f64077b, this.f64078c);
    }
}
