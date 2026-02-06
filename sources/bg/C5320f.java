package Bg;

import Ag.a;
import Fg.S;
import Of.H;
import Of.M;
import Pf.c;
import ig.b;
import ig.n;
import kg.C6436c;
import kg.e;
import kotlin.jvm.internal.C6496s;
import tg.g;

/* renamed from: Bg.f  reason: case insensitive filesystem */
public final class C5320f extends C5315a implements C5319e {

    /* renamed from: b  reason: collision with root package name */
    private final C5321g f62527b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5320f(H h10, M m10, a aVar) {
        super(aVar);
        C6496s.h(h10, "module");
        C6496s.h(m10, "notFoundClasses");
        C6496s.h(aVar, "protocol");
        this.f62527b = new C5321g(h10, m10);
    }

    /* renamed from: n */
    public c i(b bVar, C6436c cVar) {
        C6496s.h(bVar, "proto");
        C6496s.h(cVar, "nameResolver");
        return this.f62527b.a(bVar, cVar);
    }

    /* renamed from: o */
    public g e(N n10, n nVar, S s10) {
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        C6496s.h(s10, "expectedType");
        return null;
    }

    /* renamed from: p */
    public g d(N n10, n nVar, S s10) {
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        C6496s.h(s10, "expectedType");
        b.C1013b.c cVar = (b.C1013b.c) e.a(nVar, m().b());
        if (cVar == null) {
            return null;
        }
        return this.f62527b.f(s10, cVar, n10.b());
    }
}
