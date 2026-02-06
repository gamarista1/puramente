package io.intercom.android.sdk.tickets;

import B.k;
import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import O0.g;
import Q0.A;
import Q0.T;
import V.T0;
import V.V;
import V0.o;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.n;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.s;
import b1.t;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.e2;
import r0.g2;
import t0.C2606g;
import v.C2722e;
import x.C2843G;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketProgressBannerKt$TicketProgressBanner$1 implements q {
    final /* synthetic */ String $name;
    final /* synthetic */ C6787a $onClick;

    TicketProgressBannerKt$TicketProgressBanner$1(C6787a aVar, String str) {
        this.$onClick = aVar;
        this.$name = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(eVar, "$this$AnimatedVisibility");
        i.a aVar = i.f23074a;
        i v10 = androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.h(aVar, 0.0f, 1, (Object) null), (c.C0368c) null, false, 3, (Object) null);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        i d10 = b.d(v10, intercomTheme.getColors(mVar2, i11).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null);
        mVar2.T(669306758);
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = k.a();
            mVar2.r(A10);
        }
        mVar.M();
        i b10 = d.b(d10, (l) A10, (C2843G) null, false, (String) null, (g) null, this.$onClick, 28, (Object) null);
        String str = this.$name;
        C1085c cVar = C1085c.f882a;
        C1085c.m g10 = cVar.g();
        c.a aVar2 = c.f23044a;
        F a10 = C1090h.a(g10, aVar2.k(), mVar2, 0);
        int a11 = C1494j.a(mVar2, 0);
        C1523y p10 = mVar.p();
        i e10 = h.e(mVar2, b10);
        C1241g.a aVar3 = C1241g.f3853J;
        C6787a a12 = aVar3.a();
        if (mVar.j() == null) {
            C1494j.c();
        }
        mVar.F();
        if (mVar.f()) {
            mVar2.U(a12);
        } else {
            mVar.q();
        }
        C1500m a13 = F1.a(mVar);
        F1.b(a13, a10, aVar3.c());
        F1.b(a13, p10, aVar3.e());
        p b11 = aVar3.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b11);
        }
        F1.b(a13, e10, aVar3.d());
        C1093k kVar = C1093k.f978a;
        float f10 = (float) 12;
        a0.a(androidx.compose.foundation.layout.q.i(aVar, c1.h.j(f10)), mVar2, 6);
        i k10 = n.k(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.h(aVar, 0.0f, 1, (Object) null), (c.C0368c) null, false, 3, (Object) null), c1.h.j((float) 16), 0.0f, 2, (Object) null);
        F b12 = W.b(cVar.b(), aVar2.i(), mVar2, 54);
        int a14 = C1494j.a(mVar2, 0);
        C1523y p11 = mVar.p();
        i e11 = h.e(mVar2, k10);
        C6787a a15 = aVar3.a();
        if (mVar.j() == null) {
            C1494j.c();
        }
        mVar.F();
        if (mVar.f()) {
            mVar2.U(a15);
        } else {
            mVar.q();
        }
        C1500m a16 = F1.a(mVar);
        F1.b(a16, b12, aVar3.c());
        F1.b(a16, p11, aVar3.e());
        p b13 = aVar3.b();
        if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
            a16.r(Integer.valueOf(a14));
            a16.V(Integer.valueOf(a14), b13);
        }
        F1.b(a16, e11, aVar3.d());
        Z z10 = Z.f873a;
        int i12 = i11;
        V.a(e.c(R.drawable.intercom_ticket_detail_icon, mVar2, 0), (String) null, (i) null, intercomTheme.getColors(mVar2, i11).m673getActionContrastWhite0d7_KjU(), mVar, 56, 4);
        a0.a(androidx.compose.foundation.layout.q.r(aVar, c1.h.j((float) 8)), mVar2, 6);
        T c10 = T.c(intercomTheme.getTypography(mVar2, i12).getType04Point5(), intercomTheme.getColors(mVar2, i12).m673getActionContrastWhite0d7_KjU(), 0, V0.p.f8210b.d(), (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (b1.k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777210, (Object) null);
        T0.b(str, (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (b1.k) null, (j) null, 0, t.f19154a.b(), false, 1, 0, (C6798l) null, c10, mVar, 0, 3120, 55294);
        mVar.u();
        i i13 = androidx.compose.foundation.layout.q.i(aVar, c1.h.j(f10));
        C1500m mVar3 = mVar;
        a0.a(i13, mVar3, 6);
        IntercomDividerKt.IntercomDivider((i) null, mVar3, 0, 1);
        mVar.u();
    }
}
