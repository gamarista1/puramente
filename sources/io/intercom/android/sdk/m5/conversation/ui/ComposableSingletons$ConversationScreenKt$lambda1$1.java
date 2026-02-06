package io.intercom.android.sdk.m5.conversation.ui;

import V.G0;
import V.L0;
import Y.C1500m;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationScreenKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ConversationScreenKt$lambda1$1 implements q {
    public static final ComposableSingletons$ConversationScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationScreenKt$lambda1$1();

    ComposableSingletons$ConversationScreenKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((G0) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(G0 g02, C1500m mVar, int i10) {
        int i11;
        G0 g03 = g02;
        C1500m mVar2 = mVar;
        C6496s.h(g03, "it");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(g03) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            L0.d(g02, (i) null, false, intercomTheme.getShapes(mVar2, i12).e(), 0, 0, ColorExtensionsKt.m714getAccessibleColorOnDarkBackground8_81llA(intercomTheme.getColors(mVar2, i12).m672getAction0d7_KjU()), 0, 0, mVar, i11 & 14, 438);
            return;
        }
        mVar.I();
    }
}
