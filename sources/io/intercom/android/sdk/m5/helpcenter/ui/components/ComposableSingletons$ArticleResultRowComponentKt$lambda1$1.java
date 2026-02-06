package io.intercom.android.sdk.m5.helpcenter.ui.components;

import Y.C1500m;
import androidx.compose.foundation.b;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleResultRowComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ArticleResultRowComponentKt$lambda1$1();

    ComposableSingletons$ArticleResultRowComponentKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ArticleResultRowComponentKt.ArticleResultRowComponent(new ArticleSearchResultRow.ArticleResultRow("", "<highlight>Lorem Ipsum</highlight> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", "There are many variations of passages of <highlight>Lorem Ipsum</highlight> available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.", 0), new x(), b.d(i.f23074a, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), mVar, 48, 0);
            return;
        }
        mVar.I();
    }
}
