package io.intercom.android.sdk.ui.component;

import Y.C1500m;
import io.intercom.android.sdk.ui.R;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import x.C2868g;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$IntercomButtonKt$lambda2$1 implements p {
    public static final ComposableSingletons$IntercomButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda2$1();

    ComposableSingletons$IntercomButtonKt$lambda2$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            IntercomButtonKt.IntercomButton((i) null, IntercomButton.INSTANCE.m583primaryStyleKlgxPg(0, 0, (C2868g) null, mVar, 3072, 7), "Button", Integer.valueOf(R.drawable.intercom_send), new C6338c(), mVar, 24960, 1);
        } else {
            mVar.I();
        }
    }
}
