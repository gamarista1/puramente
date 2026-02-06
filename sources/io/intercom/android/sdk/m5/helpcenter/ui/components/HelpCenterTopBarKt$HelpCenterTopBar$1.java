package io.intercom.android.sdk.m5.helpcenter.ui.components;

import B.l;
import C.Y;
import Q.b;
import S.e;
import V.S;
import V.U;
import V.V;
import Y.C1500m;
import g0.c;
import io.intercom.android.sdk.R;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterTopBarKt$HelpCenterTopBar$1 implements q {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C6787a $onSearchClick;

    HelpCenterTopBarKt$HelpCenterTopBar$1(C6787a aVar, long j10) {
        this.$onSearchClick = aVar;
        this.$contentColor = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C6496s.h(y10, "$this$TopActionBar");
        if ((i10 & 81) != 16 || !mVar.i()) {
            C6787a aVar = this.$onSearchClick;
            final long j10 = this.$contentColor;
            U.b(aVar, (i) null, false, (S) null, (l) null, c.e(739646154, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        V.b(e.a(b.f5154a.a()), M0.i.a(R.string.intercom_search_help_articles, mVar, 0), (i) null, j10, mVar, 0, 4);
                    } else {
                        mVar.I();
                    }
                }
            }, mVar, 54), mVar, 196608, 30);
            return;
        }
        mVar.I();
    }
}
