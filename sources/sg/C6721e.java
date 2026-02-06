package sg;

import Eg.f;
import Eg.n;
import Fg.B0;
import Fg.C5398z;
import Fg.D0;
import Fg.E0;
import Fg.M;
import Fg.N0;
import Fg.S;
import Fg.Y;
import Fg.r0;
import Of.m0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;

/* renamed from: sg.e  reason: case insensitive filesystem */
public abstract class C6721e {

    /* renamed from: sg.e$a */
    public static final class a extends C5398z {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f73536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(E0 e02, boolean z10) {
            super(e02);
            this.f73536d = z10;
        }

        public boolean b() {
            return this.f73536d;
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [Of.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Fg.B0 e(Fg.S r4) {
            /*
                r3 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                Fg.B0 r0 = super.e(r4)
                r1 = 0
                if (r0 == 0) goto L_0x001f
                Fg.v0 r4 = r4.N0()
                Of.h r4 = r4.o()
                boolean r2 = r4 instanceof Of.m0
                if (r2 == 0) goto L_0x001b
                r1 = r4
                Of.m0 r1 = (Of.m0) r1
            L_0x001b:
                Fg.B0 r1 = sg.C6721e.c(r0, r1)
            L_0x001f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.C6721e.a.e(Fg.S):Fg.B0");
        }
    }

    /* access modifiers changed from: private */
    public static final B0 c(B0 b02, m0 m0Var) {
        if (m0Var == null || b02.b() == N0.INVARIANT) {
            return b02;
        }
        if (m0Var.n() != b02.b()) {
            return new D0(e(b02));
        }
        if (!b02.a()) {
            return new D0(b02.getType());
        }
        n nVar = f.f62842e;
        C6496s.g(nVar, "NO_LOCKS");
        return new D0(new Y(nVar, new C6720d(b02)));
    }

    /* access modifiers changed from: private */
    public static final S d(B0 b02) {
        S type = b02.getType();
        C6496s.g(type, "getType(...)");
        return type;
    }

    public static final S e(B0 b02) {
        C6496s.h(b02, "typeProjection");
        return new C6717a(b02, (C6718b) null, false, (r0) null, 14, (DefaultConstructorMarker) null);
    }

    public static final boolean f(S s10) {
        C6496s.h(s10, "<this>");
        return s10.N0() instanceof C6718b;
    }

    public static final E0 g(E0 e02, boolean z10) {
        C6496s.h(e02, "<this>");
        if (!(e02 instanceof M)) {
            return new a(e02, z10);
        }
        M m10 = (M) e02;
        m0[] j10 = m10.j();
        Iterable<Pair> D12 = C6559l.D1(m10.i(), m10.j());
        ArrayList arrayList = new ArrayList(C6565s.y(D12, 10));
        for (Pair pair : D12) {
            arrayList.add(c((B0) pair.c(), (m0) pair.d()));
        }
        return new M(j10, (B0[]) arrayList.toArray(new B0[0]), z10);
    }

    public static /* synthetic */ E0 h(E0 e02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(e02, z10);
    }
}
