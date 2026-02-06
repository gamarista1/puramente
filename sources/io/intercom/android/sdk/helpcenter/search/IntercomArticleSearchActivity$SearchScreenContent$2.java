package io.intercom.android.sdk.helpcenter.search;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomArticleSearchActivity$SearchScreenContent$2 implements q {
    final /* synthetic */ ArticleSearchState $articleSearchState;
    final /* synthetic */ C6798l $onArticleClicked;

    IntercomArticleSearchActivity$SearchScreenContent$2(ArticleSearchState articleSearchState, C6798l lVar) {
        this.$articleSearchState = articleSearchState;
        this.$onArticleClicked = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(N n10, C1500m mVar, int i10) {
        C6496s.h(n10, "paddingValues");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(n10) ? 4 : 2;
        }
        if ((i10 & 91) != 18 || !mVar.i()) {
            i h10 = n.h(b.d(androidx.compose.foundation.layout.q.f(i.f23074a, 0.0f, 1, (Object) null), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), n10);
            ArticleSearchState articleSearchState = this.$articleSearchState;
            C6798l lVar = this.$onArticleClicked;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar, 0);
            int a11 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar, h10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a12 = aVar.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar.c());
            F1.b(a13, p10, aVar.e());
            p b10 = aVar.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar.d());
            C1093k kVar = C1093k.f978a;
            IntercomArticleSearchScreenKt.IntercomArticleSearchScreen(articleSearchState, new i(), lVar, mVar, 48);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
