package io.intercom.android.sdk.ui.component;

import C.C1085c;
import C.W;
import C.Z;
import H0.F;
import J0.C1241g;
import M0.e;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import b1.t;
import c1.h;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/ui/common/StringProvider;", "errorMessages", "Llf/M;", "ErrorMessageLayout", "(Lk0/i;Ljava/util/List;LY/m;II)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ErrorMessageLayoutKt {
    public static final void ErrorMessageLayout(i iVar, List<? extends StringProvider> list, C1500m mVar, int i10, int i11) {
        i.a aVar;
        List<? extends StringProvider> list2 = list;
        int i12 = i11;
        C6496s.h(list2, "errorMessages");
        C1500m h10 = mVar.h(-1308212592);
        if ((i12 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        float f10 = (float) 4;
        i m10 = n.m(q.h(aVar, 0.0f, 1, (Object) null), 0.0f, h.j(f10), 0.0f, h.j(f10), 5, (Object) null);
        F b10 = W.b(C1085c.f882a.f(), c.f23044a.i(), h10, 48);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, m10);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a11 = aVar2.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a11);
        } else {
            h10.q();
        }
        C1500m a12 = F1.a(h10);
        F1.b(a12, b10, aVar2.c());
        F1.b(a12, p10, aVar2.e());
        p b11 = aVar2.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar2.d());
        Z z10 = Z.f873a;
        V.a(e.c(R.drawable.intercom_ic_error, h10, 0), (String) null, q.r(i.f23074a, h.j((float) 16)), IntercomTheme.INSTANCE.getColors(h10, 6).m689getError0d7_KjU(), h10, 440, 0);
        StringBuilder sb2 = new StringBuilder();
        h10.T(-1467578667);
        int i13 = 0;
        for (Object next : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C6565s.x();
            }
            sb2.append(((StringProvider) next).getText(h10, 0));
            if (i13 != list.size() - 1) {
                sb2.append(". ");
            }
            i13 = i14;
        }
        h10.M();
        String sb3 = sb2.toString();
        String str = sb3;
        C6496s.g(sb3, "toString(...)");
        i m11 = n.m(q.h(i.f23074a, 0.0f, 1, (Object) null), h.j(f10), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        i iVar2 = aVar;
        T0.b(str, m11, intercomTheme.getColors(h10, 6).m689getError0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, t.f19154a.b(), false, 1, 0, (C6798l) null, intercomTheme.getTypography(h10, 6).getType04(), h10, 48, 3120, 55288);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6344i(iVar2, list2, i10, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorMessageLayout$lambda$2(i iVar, List list, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$errorMessages");
        ErrorMessageLayout(iVar, list, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
