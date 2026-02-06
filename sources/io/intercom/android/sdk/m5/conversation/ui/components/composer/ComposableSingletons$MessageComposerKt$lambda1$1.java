package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import M0.e;
import V.V;
import Y.C1500m;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$MessageComposerKt$lambda1$1 implements p {
    public static final ComposableSingletons$MessageComposerKt$lambda1$1 INSTANCE = new ComposableSingletons$MessageComposerKt$lambda1$1();

    ComposableSingletons$MessageComposerKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            V.a(e.c(R.drawable.intercom_ic_up_arrow, mVar, 0), (String) null, q.n(i.f23074a, h.j((float) 24)), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m695getOnActionContrastWhite0d7_KjU(), mVar, 440, 0);
            return;
        }
        mVar.I();
    }
}
