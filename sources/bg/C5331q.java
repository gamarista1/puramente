package Bg;

import Of.N;
import Of.O;
import Of.T;
import kotlin.jvm.internal.C6496s;
import ng.b;

/* renamed from: Bg.q  reason: case insensitive filesystem */
public final class C5331q implements C5324j {

    /* renamed from: a  reason: collision with root package name */
    private final O f62576a;

    public C5331q(O o10) {
        C6496s.h(o10, "packageFragmentProvider");
        this.f62576a = o10;
    }

    public C5323i a(b bVar) {
        C5323i a10;
        C6496s.h(bVar, "classId");
        for (N n10 : T.c(this.f62576a, bVar.f())) {
            if ((n10 instanceof r) && (a10 = ((r) n10).H0().a(bVar)) != null) {
                return a10;
            }
        }
        return null;
    }
}
