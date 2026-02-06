package io.intercom.android.sdk.m5.components;

import Q.b;
import S.e;
import V.V;
import Y.C1500m;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-7$1  reason: invalid class name */
final class ComposableSingletons$TopActionBarKt$lambda7$1 implements p {
    public static final ComposableSingletons$TopActionBarKt$lambda7$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda7$1();

    ComposableSingletons$TopActionBarKt$lambda7$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            V.b(e.a(b.f5154a.a()), (String) null, (i) null, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m697getOnHeader0d7_KjU(), mVar, 48, 4);
        } else {
            mVar.I();
        }
    }
}
