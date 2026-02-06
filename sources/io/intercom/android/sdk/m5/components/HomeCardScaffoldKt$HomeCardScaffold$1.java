package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HomeCardScaffoldKt$HomeCardScaffold$1 implements q {
    final /* synthetic */ String $cardTitle;
    final /* synthetic */ p $content;

    HomeCardScaffoldKt$HomeCardScaffold$1(String str, p pVar) {
        this.$cardTitle = str;
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i m10 = n.m(aVar, 0.0f, 0.0f, 0.0f, h.j((float) 4), 7, (Object) null);
            String str = this.$cardTitle;
            p pVar = this.$content;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, m10);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
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
            F1.b(a13, a10, aVar2.c());
            F1.b(a13, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            String str2 = str;
            T0.b(str2, n.k(n.m(aVar, 0.0f, h.j((float) 16), 0.0f, h.j((float) 6), 5, (Object) null), h.j((float) 20), 0.0f, 2, (Object) null), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04SemiBold(), mVar, 48, 0, 65532);
            pVar.invoke(mVar, 0);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
