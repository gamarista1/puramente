package x;

import androidx.compose.foundation.BorderModifierNodeElement;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o0.C2341d;
import o0.C2345h;
import q0.C2415a;
import q0.C2416b;
import q0.C2421g;
import q0.C2425k;
import r0.C2472Y;
import r0.C2514n0;
import r0.C2547y0;
import r0.S1;
import r0.T1;
import r0.W1;
import r0.g2;
import r0.h2;
import t0.C2602c;
import t0.C2605f;
import t0.C2606g;
import t0.C2609j;
import t0.C2610k;
import yf.C6798l;

/* renamed from: x.e  reason: case insensitive filesystem */
public abstract class C2866e {

    /* renamed from: x.e$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27936a = new a();

        a() {
            super(1);
        }

        public final void a(C2602c cVar) {
            cVar.H1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.e$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2514n0 f27937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f27938b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f27939c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2606g f27940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2514n0 n0Var, long j10, long j11, C2606g gVar) {
            super(1);
            this.f27937a = n0Var;
            this.f27938b = j10;
            this.f27939c = j11;
            this.f27940d = gVar;
        }

        public final void a(C2602c cVar) {
            cVar.H1();
            C2605f.c1(cVar, this.f27937a, this.f27938b, this.f27939c, 0.0f, this.f27940d, (C2547y0) null, 0, 104, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    public static final i e(i iVar, C2868g gVar, g2 g2Var) {
        return g(iVar, gVar.b(), gVar.a(), g2Var);
    }

    public static final i f(i iVar, float f10, long j10, g2 g2Var) {
        return g(iVar, f10, new h2(j10, (DefaultConstructorMarker) null), g2Var);
    }

    public static final i g(i iVar, float f10, C2514n0 n0Var, g2 g2Var) {
        return iVar.h(new BorderModifierNodeElement(f10, n0Var, g2Var, (DefaultConstructorMarker) null));
    }

    private static final C2425k h(float f10, C2425k kVar) {
        float f11 = f10;
        return new C2425k(f10, f11, kVar.j() - f11, kVar.d() - f11, l(kVar.h(), f10), l(kVar.i(), f10), l(kVar.c(), f10), l(kVar.b(), f10), (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final S1 i(S1 s12, C2425k kVar, float f10, boolean z10) {
        s12.reset();
        S1.a(s12, kVar, (S1.b) null, 2, (Object) null);
        if (!z10) {
            S1 a10 = C2472Y.a();
            S1.a(a10, h(f10, kVar), (S1.b) null, 2, (Object) null);
            s12.l(s12, a10, W1.f25474a.a());
        }
        return s12;
    }

    /* access modifiers changed from: private */
    public static final C2345h j(C2341d dVar) {
        return dVar.o(a.f27936a);
    }

    /* access modifiers changed from: private */
    public static final C2345h k(C2341d dVar, C2514n0 n0Var, long j10, long j11, boolean z10, float f10) {
        long j12;
        long j13;
        C2606g gVar;
        if (z10) {
            j12 = C2421g.f25320b.c();
        } else {
            j12 = j10;
        }
        if (z10) {
            j13 = dVar.d();
        } else {
            j13 = j11;
        }
        if (z10) {
            gVar = C2609j.f25944a;
        } else {
            gVar = new C2610k(f10, 0.0f, 0, 0, (T1) null, 30, (DefaultConstructorMarker) null);
        }
        return dVar.o(new b(n0Var, j12, j13, gVar));
    }

    /* access modifiers changed from: private */
    public static final long l(long j10, float f10) {
        return C2416b.a(Math.max(0.0f, C2415a.d(j10) - f10), Math.max(0.0f, C2415a.e(j10) - f10));
    }
}
