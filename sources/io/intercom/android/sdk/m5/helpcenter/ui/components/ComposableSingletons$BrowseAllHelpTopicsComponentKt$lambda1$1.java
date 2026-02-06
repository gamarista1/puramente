package io.intercom.android.sdk.m5.helpcenter.ui.components;

import C.Y;
import C.a0;
import M0.e;
import Q0.A;
import Q0.T;
import V.T0;
import V.V;
import V0.n;
import V0.o;
import V0.p;
import Y.C1500m;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.s;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.e2;
import t0.C2606g;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda1$1 implements q {
    public static final ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda1$1();

    ComposableSingletons$BrowseAllHelpTopicsComponentKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$OutlinedButton");
        if ((i10 & 81) != 16 || !mVar.i()) {
            V.a(e.c(R.drawable.intercom_article_book_icon, mVar2, 0), (String) null, (i) null, 0, mVar, 56, 12);
            a0.a(androidx.compose.foundation.layout.q.r(i.f23074a, h.j((float) 6)), mVar2, 6);
            String a10 = M0.i.a(R.string.intercom_browse_all_help_topics, mVar2, 0);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            T0.b(a10, (i) null, 0, 0, (n) null, (p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, T.c(intercomTheme.getTypography(mVar2, i11).getType04Point5(), intercomTheme.getColors(mVar2, i11).m700getPrimaryText0d7_KjU(), 0, (p) null, (n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null), mVar, 0, 0, 65534);
            return;
        }
        mVar.I();
    }
}
