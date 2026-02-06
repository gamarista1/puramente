package V;

import U.g;
import U.p;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.I0;
import Y.o1;
import c1.h;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import x.C2843G;
import x.C2845I;
import yf.C6787a;

/* renamed from: V.u0  reason: case insensitive filesystem */
public abstract class C1409u0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f8056a = C1521x.f(b.f8061a);

    /* renamed from: b  reason: collision with root package name */
    private static final I0 f8057b = C1521x.d((o1) null, a.f8060a, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C1411v0 f8058c;

    /* renamed from: d  reason: collision with root package name */
    private static final C1411v0 f8059d;

    /* renamed from: V.u0$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8060a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final C1405s0 invoke() {
            return new C1405s0(0, (g) null, 3, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: V.u0$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8061a = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        h.a aVar = h.f19213b;
        float c10 = aVar.c();
        C2544x0.a aVar2 = C2544x0.f25560b;
        f8058c = new C1411v0(true, c10, aVar2.h(), (DefaultConstructorMarker) null);
        f8059d = new C1411v0(false, aVar.c(), aVar2.h(), (DefaultConstructorMarker) null);
    }

    public static final I0 a() {
        return f8057b;
    }

    public static final C2845I b(boolean z10, float f10, long j10) {
        if (!h.m(f10, h.f19213b.c()) || !C2544x0.q(j10, C2544x0.f25560b.h())) {
            return new C1411v0(z10, f10, j10, (DefaultConstructorMarker) null);
        }
        if (z10) {
            return f8058c;
        }
        return f8059d;
    }

    public static /* synthetic */ C2845I c(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = h.f19213b.c();
        }
        if ((i10 & 4) != 0) {
            j10 = C2544x0.f25560b.h();
        }
        return b(z10, f10, j10);
    }

    public static final C2843G d(boolean z10, float f10, long j10, C1500m mVar, int i10, int i11) {
        C2843G g10;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            f10 = h.f19213b.c();
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            j10 = C2544x0.f25560b.h();
        }
        long j11 = j10;
        if (C1506p.H()) {
            C1506p.Q(-1315814667, i10, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        mVar.T(-1280632857);
        if (((Boolean) mVar.m(f8056a)).booleanValue()) {
            g10 = p.f(z11, f11, j11, mVar, i10 & 1022, 0);
        } else {
            g10 = b(z11, f11, j11);
        }
        mVar.M();
        if (C1506p.H()) {
            C1506p.P();
        }
        return g10;
    }
}
