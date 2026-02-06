package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import V.T0;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$GifGridKt$lambda1$1 implements p {
    public static final ComposableSingletons$GifGridKt$lambda1$1 INSTANCE = new ComposableSingletons$GifGridKt$lambda1$1();

    ComposableSingletons$GifGridKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i k10 = n.k(i.f23074a, h.j((float) 8), 0.0f, 2, (Object) null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            T0.b(M0.i.a(R.string.intercom_search_gif, mVar2, 0), k10, intercomTheme.getColors(mVar2, i11).m686getDescriptionText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i11).getType04(), mVar, 48, 0, 65528);
            return;
        }
        mVar.I();
    }
}
