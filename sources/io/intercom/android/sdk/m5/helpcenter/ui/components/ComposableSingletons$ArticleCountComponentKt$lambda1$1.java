package io.intercom.android.sdk.m5.helpcenter.ui.components;

import Y.C1500m;
import androidx.compose.foundation.b;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.g2;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleCountComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ArticleCountComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$ArticleCountComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ArticleCountComponentKt$lambda1$1();

    ComposableSingletons$ArticleCountComponentKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ArticleCountComponentKt.ArticleCountComponent(b.d(i.f23074a, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), 12, mVar, 48, 0);
        } else {
            mVar.I();
        }
    }
}
