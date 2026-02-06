package io.intercom.android.sdk.m5.helpcenter.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.helpcenter.sections.Avatar;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionSummaryComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$CollectionSummaryComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$CollectionSummaryComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$CollectionSummaryComponentKt$lambda1$1();

    ComposableSingletons$CollectionSummaryComponentKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            CollectionSummaryComponentKt.CollectionSummaryComponent(new CollectionDetailsUiState.Content("123456", "Recording videos", "How to set up screen and camera recording through our app or Chrome extension.", 5, C6565s.q(new Author("", "Hannah", new Avatar("", "SK")), new Author("", "Bob", new Avatar("", "PS")), new Author("", "Anna", new Avatar("", "VR"))), C6565s.n()), (i) null, mVar, 8, 2);
            return;
        }
        mVar.I();
    }
}
