package sg;

import Fg.B0;
import Fg.N0;
import Gg.g;
import Gg.n;
import Lf.i;
import Of.C5490h;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: sg.c  reason: case insensitive filesystem */
public final class C6719c implements C6718b {

    /* renamed from: a  reason: collision with root package name */
    private final B0 f73533a;

    /* renamed from: b  reason: collision with root package name */
    private n f73534b;

    public C6719c(B0 b02) {
        C6496s.h(b02, "projection");
        this.f73533a = b02;
        a().b();
        N0 n02 = N0.INVARIANT;
    }

    public B0 a() {
        return this.f73533a;
    }

    public Void b() {
        return null;
    }

    public final n c() {
        return this.f73534b;
    }

    /* renamed from: d */
    public C6719c n(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        B0 n10 = a().n(gVar);
        C6496s.g(n10, "refine(...)");
        return new C6719c(n10);
    }

    public final void e(n nVar) {
        this.f73534b = nVar;
    }

    public List getParameters() {
        return C6565s.n();
    }

    public Collection l() {
        Object obj;
        if (a().b() == N0.OUT_VARIANCE) {
            obj = a().getType();
        } else {
            obj = m().I();
        }
        C6496s.e(obj);
        return C6565s.e(obj);
    }

    public i m() {
        i m10 = a().getType().N0().m();
        C6496s.g(m10, "getBuiltIns(...)");
        return m10;
    }

    public /* bridge */ /* synthetic */ C5490h o() {
        return (C5490h) b();
    }

    public boolean p() {
        return false;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + a() + ')';
    }
}
