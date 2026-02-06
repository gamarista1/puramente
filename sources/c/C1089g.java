package C;

import androidx.compose.foundation.layout.f;
import c1.b;
import c1.d;
import c1.h;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: C.g  reason: case insensitive filesystem */
final class C1089g implements C1088f, C1086d {

    /* renamed from: a  reason: collision with root package name */
    private final d f927a;

    /* renamed from: b  reason: collision with root package name */
    private final long f928b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f929c;

    public /* synthetic */ C1089g(d dVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10);
    }

    public long c() {
        return this.f928b;
    }

    public float d() {
        d dVar = this.f927a;
        if (b.h(c())) {
            return dVar.E(b.l(c()));
        }
        return h.f19213b.b();
    }

    public i e(i iVar, c cVar) {
        return this.f929c.e(iVar, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1089g)) {
            return false;
        }
        C1089g gVar = (C1089g) obj;
        if (C6496s.c(this.f927a, gVar.f927a) && b.f(this.f928b, gVar.f928b)) {
            return true;
        }
        return false;
    }

    public i f(i iVar) {
        return this.f929c.f(iVar);
    }

    public float g() {
        d dVar = this.f927a;
        if (b.g(c())) {
            return dVar.E(b.k(c()));
        }
        return h.f19213b.b();
    }

    public int hashCode() {
        return (this.f927a.hashCode() * 31) + b.o(this.f928b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f927a + ", constraints=" + b.q(this.f928b) + ')';
    }

    private C1089g(d dVar, long j10) {
        this.f927a = dVar;
        this.f928b = j10;
        this.f929c = f.f12848a;
    }
}
