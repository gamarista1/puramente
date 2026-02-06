package io.intercom.android.sdk.m5.helpcenter.ui;

import C.N;
import C.f0;
import C.i0;
import C.l0;
import V.C1415x0;
import Y.C1500m;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.C2005a;
import g0.c;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import j3.C2128E;
import j3.x;
import java.util.List;
import k0.i;
import k3.C2160l;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterScreenKt$HelpCenterScreen$1 implements p {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ int $navIcon;
    final /* synthetic */ C6787a $onCloseClick;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    HelpCenterScreenKt$HelpCenterScreen$1(int i10, HelpCenterViewModel helpCenterViewModel, C6787a aVar, List<String> list) {
        this.$navIcon = i10;
        this.$viewModel = helpCenterViewModel;
        this.$onCloseClick = aVar;
        this.$collectionIds = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            final x d10 = C2160l.d(new C2128E[0], mVar2, 8);
            final Context context = (Context) mVar2.m(AndroidCompositionLocals_androidKt.g());
            i d11 = i0.d(b.d(i.f23074a, IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), l0.b(f0.f925a, mVar2, 8));
            final int i11 = this.$navIcon;
            final HelpCenterViewModel helpCenterViewModel = this.$viewModel;
            final C6787a aVar = this.$onCloseClick;
            final x xVar = d10;
            C2005a e10 = c.e(1261102927, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0(x xVar, C6787a aVar) {
                    C6496s.h(xVar, "$navController");
                    C6496s.h(aVar, "$onCloseClick");
                    if (xVar.K() == null) {
                        aVar.invoke();
                    } else {
                        xVar.X();
                    }
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$1(Context context) {
                    C6496s.h(context, "$context");
                    context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, false));
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    int i11;
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        C c10 = new C(xVar, aVar);
                        D d10 = new D(context);
                        if (xVar.K() == null) {
                            i11 = i11;
                        } else {
                            i11 = R.drawable.intercom_ic_back;
                        }
                        HelpCenterTopBarKt.HelpCenterTopBar(c10, d10, i11, helpCenterViewModel.getScreenTitle(), mVar, StringProvider.$stable << 9, 0);
                        return;
                    }
                    mVar.I();
                }
            }, mVar2, 54);
            final List<String> list = this.$collectionIds;
            final HelpCenterViewModel helpCenterViewModel2 = this.$viewModel;
            C1415x0.a(d11, e10, (p) null, (p) null, (p) null, 0, 0, 0, (f0) null, c.e(900356900, true, new q() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(N n10, C1500m mVar, int i10) {
                    String str;
                    C6496s.h(n10, "paddingValues");
                    if ((i10 & 14) == 0) {
                        i10 |= mVar.S(n10) ? 4 : 2;
                    }
                    if ((i10 & 91) != 18 || !mVar.i()) {
                        if (list.size() == 1) {
                            str = "COLLECTION_DETAILS";
                        } else {
                            str = "COLLECTIONS";
                        }
                        HelpCenterScreenKt.HelpCenterNavGraph(helpCenterViewModel2, d10, str, list, n.h(i.f23074a, n10), mVar, 4168, 0);
                        return;
                    }
                    mVar.I();
                }
            }, mVar2, 54), mVar, 805306416, 508);
            return;
        }
        mVar.I();
    }
}
