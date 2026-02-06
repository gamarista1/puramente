package io.intercom.android.sdk.helpcenter.search;

import Y.C1500m;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomArticleSearchActivity$SearchScreenContent$1 implements p {
    final /* synthetic */ C6787a $onBackClick;
    final /* synthetic */ C6798l $onTextChanged;

    IntercomArticleSearchActivity$SearchScreenContent$1(C6787a aVar, C6798l lVar) {
        this.$onBackClick = aVar;
        this.$onTextChanged = lVar;
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
            HelpCenterSearchTopBarKt.HelpCenterSearchTopBar(this.$onBackClick, this.$onTextChanged, new h(), mVar, 384);
        } else {
            mVar.I();
        }
    }
}
