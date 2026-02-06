package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.C1092j;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import b1.j;
import b1.k;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PoweredByBadgeKt$PoweredByBadge$1 implements q {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ int $iconId;
    final /* synthetic */ String $text;

    PoweredByBadgeKt$PoweredByBadge$1(int i10, long j10, String str) {
        this.$iconId = i10;
        this.$contentColor = j10;
        this.$text = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$Card");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i j10 = n.j(aVar, PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding);
            C1085c.f b10 = C1085c.f882a.b();
            c.C0368c i11 = c.f23044a.i();
            int i12 = this.$iconId;
            long j11 = this.$contentColor;
            String str = this.$text;
            F b11 = W.b(b10, i11, mVar2, 54);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, j10);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, b11, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b12 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b12);
            }
            F1.b(a12, e10, aVar2.d());
            Z z10 = Z.f873a;
            V.a(e.c(i12, mVar2, 0), (String) null, androidx.compose.foundation.layout.q.n(aVar, PoweredByBadgeKt.IconSize), j11, mVar, 440, 0);
            a0.a(androidx.compose.foundation.layout.q.r(aVar, c1.h.j((float) 8)), mVar2, 6);
            String str2 = str;
            T0.b(str2, (i) null, j11, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, PoweredByBadgeKt.getTextStyle(mVar2, 0), mVar, 0, 0, 65530);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
