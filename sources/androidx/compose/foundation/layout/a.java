package androidx.compose.foundation.layout;

import Ef.m;
import H0.C1180a;
import H0.C1181b;
import H0.C1192m;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import android.support.v4.media.session.c;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import c1.h;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

public abstract class a {

    /* renamed from: androidx.compose.foundation.layout.a$a  reason: collision with other inner class name */
    static final class C0243a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1180a f12810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f12811b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12813d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f12814e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ U f12815f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f12816g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0243a(C1180a aVar, float f10, int i10, int i11, int i12, U u10, int i13) {
            super(1);
            this.f12810a = aVar;
            this.f12811b = f10;
            this.f12812c = i10;
            this.f12813d = i11;
            this.f12814e = i12;
            this.f12815f = u10;
            this.f12816g = i13;
        }

        public final void a(U.a aVar) {
            int i10;
            int X02;
            int i11 = 0;
            if (a.d(this.f12810a)) {
                i10 = 0;
            } else {
                if (!h.m(this.f12811b, h.f19213b.c())) {
                    X02 = this.f12812c;
                } else {
                    X02 = (this.f12813d - this.f12814e) - this.f12815f.X0();
                }
                i10 = X02;
            }
            if (a.d(this.f12810a)) {
                if (!h.m(this.f12811b, h.f19213b.c())) {
                    i11 = this.f12812c;
                } else {
                    i11 = (this.f12816g - this.f12814e) - this.f12815f.R0();
                }
            }
            U.a.l(aVar, this.f12815f, i10, i11, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1180a f12817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f12818b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f12819c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C1180a aVar, float f10, float f11) {
            super(1);
            this.f12817a = aVar;
            this.f12818b = f10;
            this.f12819c = f11;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final G c(H h10, C1180a aVar, float f10, float f11, E e10, long j10) {
        long d10;
        int i10;
        int i11;
        int i12;
        int i13;
        int max;
        int R02;
        H h11 = h10;
        float f12 = f10;
        float f13 = f11;
        if (d(aVar)) {
            d10 = c1.b.d(j10, 0, 0, 0, 0, 11, (Object) null);
        } else {
            d10 = c1.b.d(j10, 0, 0, 0, 0, 14, (Object) null);
        }
        U v02 = e10.v0(d10);
        C1180a aVar2 = aVar;
        int k02 = v02.k0(aVar);
        if (k02 == Integer.MIN_VALUE) {
            k02 = 0;
        }
        if (d(aVar)) {
            i10 = v02.R0();
        } else {
            i10 = v02.X0();
        }
        if (d(aVar)) {
            i11 = c1.b.k(j10);
        } else {
            i11 = c1.b.l(j10);
        }
        h.a aVar3 = h.f19213b;
        if (!h.m(f12, aVar3.c())) {
            i12 = h10.E0(f12);
        } else {
            i12 = 0;
        }
        int i14 = i11 - i10;
        int l10 = m.l(i12 - k02, 0, i14);
        if (!h.m(f13, aVar3.c())) {
            i13 = h10.E0(f13);
        } else {
            i13 = 0;
        }
        int l11 = m.l((i13 - i10) + k02, 0, i14 - l10);
        if (d(aVar)) {
            max = v02.X0();
        } else {
            max = Math.max(v02.X0() + l10 + l11, c1.b.n(j10));
        }
        int i15 = max;
        if (d(aVar)) {
            R02 = Math.max(v02.R0() + l10 + l11, c1.b.m(j10));
        } else {
            R02 = v02.R0();
        }
        int i16 = R02;
        return H.N(h10, i15, i16, (Map) null, new C0243a(aVar, f10, l10, i15, l11, v02, i16), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean d(C1180a aVar) {
        return aVar instanceof C1192m;
    }

    public static final i e(i iVar, C1180a aVar, float f10, float f11) {
        C6798l a10;
        if (C1676z0.b()) {
            a10 = new b(aVar, f10, f11);
        } else {
            a10 = C1676z0.a();
        }
        return iVar.h(new AlignmentLineOffsetDpElement(aVar, f10, f11, a10, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i f(i iVar, C1180a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = h.f19213b.c();
        }
        if ((i10 & 4) != 0) {
            f11 = h.f19213b.c();
        }
        return e(iVar, aVar, f10, f11);
    }

    public static final i g(i iVar, float f10, float f11) {
        i iVar2;
        i iVar3;
        h.a aVar = h.f19213b;
        if (!h.m(f10, aVar.c())) {
            iVar2 = f(i.f23074a, C1181b.a(), f10, 0.0f, 4, (Object) null);
        } else {
            iVar2 = i.f23074a;
        }
        i h10 = iVar.h(iVar2);
        if (!h.m(f11, aVar.c())) {
            iVar3 = f(i.f23074a, C1181b.b(), 0.0f, f11, 2, (Object) null);
        } else {
            iVar3 = i.f23074a;
        }
        return h10.h(iVar3);
    }
}
