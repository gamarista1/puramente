package io.intercom.android.sdk.m5.helpcenter.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$CollectionRowComponentKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$CollectionRowComponentKt$lambda1$1 implements p {
    public static final ComposableSingletons$CollectionRowComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$CollectionRowComponentKt$lambda1$1();

    ComposableSingletons$CollectionRowComponentKt$lambda1$1() {
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
            CollectionRowComponentKt.CollectionRowComponent(new CollectionRowData("", "Lorem Ipsum Dolor Sit", 0, "Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit Lorem Ipsum Dolor Sit", 3, 2), new y(), (i) null, mVar, 48, 4);
        } else {
            mVar.I();
        }
    }
}
