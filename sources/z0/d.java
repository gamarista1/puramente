package Z0;

import Q0.C;
import Q0.z;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import X0.e;
import Y0.g;
import android.graphics.Typeface;
import b1.C1869a;
import b1.k;
import b1.s;
import c1.v;
import c1.x;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2427m;
import r0.C2544x0;
import r0.e2;
import t0.C2606g;
import yf.r;

public abstract class d {
    public static final C a(g gVar, C c10, r rVar, c1.d dVar, boolean z10) {
        int i10;
        int i11;
        long g10 = v.g(c10.k());
        x.a aVar = x.f19246b;
        if (x.g(g10, aVar.b())) {
            gVar.setTextSize(dVar.N0(c10.k()));
        } else if (x.g(g10, aVar.a())) {
            gVar.setTextSize(gVar.getTextSize() * v.h(c10.k()));
        }
        if (d(c10)) {
            h i12 = c10.i();
            p n10 = c10.n();
            if (n10 == null) {
                n10 = p.f8210b.c();
            }
            n l10 = c10.l();
            if (l10 != null) {
                i10 = l10.i();
            } else {
                i10 = n.f8200b.b();
            }
            n c11 = n.c(i10);
            o m10 = c10.m();
            if (m10 != null) {
                i11 = m10.k();
            } else {
                i11 = o.f8204b.a();
            }
            gVar.setTypeface((Typeface) rVar.invoke(i12, n10, c11, o.e(i11)));
        }
        if (c10.p() != null && !C6496s.c(c10.p(), e.f9568c.a())) {
            a.f10383a.b(gVar, c10.p());
        }
        if (c10.j() != null && !C6496s.c(c10.j(), "")) {
            gVar.setFontFeatureSettings(c10.j());
        }
        if (c10.u() != null && !C6496s.c(c10.u(), b1.o.f19137c.a())) {
            gVar.setTextScaleX(gVar.getTextScaleX() * c10.u().b());
            gVar.setTextSkewX(gVar.getTextSkewX() + c10.u().c());
        }
        gVar.f(c10.g());
        gVar.e(c10.f(), C2427m.f25341b.a(), c10.c());
        gVar.h(c10.r());
        gVar.i(c10.s());
        gVar.g(c10.h());
        if (x.g(v.g(c10.o()), aVar.b()) && v.h(c10.o()) != 0.0f) {
            float textSize = gVar.getTextSize() * gVar.getTextScaleX();
            float N02 = dVar.N0(c10.o());
            if (textSize != 0.0f) {
                gVar.setLetterSpacing(N02 / textSize);
            }
        } else if (x.g(v.g(c10.o()), aVar.a())) {
            gVar.setLetterSpacing(v.h(c10.o()));
        }
        return c(c10.o(), z10, c10.d(), c10.e());
    }

    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    private static final C c(long j10, boolean z10, long j11, C1869a aVar) {
        boolean z11;
        boolean z12;
        long j12;
        C1869a aVar2;
        long j13 = j11;
        boolean z13 = false;
        if (!z10 || !x.g(v.g(j10), x.f19246b.b()) || v.h(j10) == 0.0f) {
            z11 = false;
        } else {
            z11 = true;
        }
        C2544x0.a aVar3 = C2544x0.f25560b;
        if (C2544x0.q(j13, aVar3.h()) || C2544x0.q(j13, aVar3.g())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (aVar != null) {
            if (!C1869a.e(aVar.h(), C1869a.f19059b.a())) {
                z13 = true;
            }
        }
        if (!z11 && !z12 && !z13) {
            return null;
        }
        if (z11) {
            j12 = j10;
        } else {
            j12 = v.f19242b.a();
        }
        if (!z12) {
            j13 = aVar3.h();
        }
        long j14 = j13;
        if (z13) {
            aVar2 = aVar;
        } else {
            aVar2 = null;
        }
        return new C(0, 0, (p) null, (n) null, (o) null, (h) null, (String) null, j12, aVar2, (b1.o) null, (e) null, j14, (k) null, (e2) null, (z) null, (C2606g) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean d(C c10) {
        if (c10.i() == null && c10.l() == null && c10.n() == null) {
            return false;
        }
        return true;
    }

    public static final void e(g gVar, s sVar) {
        int i10;
        if (sVar == null) {
            sVar = s.f19145c.a();
        }
        if (sVar.c()) {
            i10 = gVar.getFlags() | 128;
        } else {
            i10 = gVar.getFlags() & -129;
        }
        gVar.setFlags(i10);
        int b10 = sVar.b();
        s.b.a aVar = s.b.f19150a;
        if (s.b.e(b10, aVar.b())) {
            gVar.setFlags(gVar.getFlags() | 64);
            gVar.setHinting(0);
        } else if (s.b.e(b10, aVar.a())) {
            gVar.getFlags();
            gVar.setHinting(1);
        } else if (s.b.e(b10, aVar.c())) {
            gVar.getFlags();
            gVar.setHinting(0);
        } else {
            gVar.getFlags();
        }
    }
}
