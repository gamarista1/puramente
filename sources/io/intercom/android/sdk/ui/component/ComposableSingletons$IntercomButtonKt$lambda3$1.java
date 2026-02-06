package io.intercom.android.sdk.ui.component;

import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.ui.R;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.C2544x0;
import x.C2869h;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$IntercomButtonKt$lambda3$1 implements p {
    public static final ComposableSingletons$IntercomButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda3$1();

    ComposableSingletons$IntercomButtonKt$lambda3$1() {
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
            int i11 = R.drawable.intercom_send;
            IntercomButton intercomButton = IntercomButton.INSTANCE;
            C2544x0.a aVar = C2544x0.f25560b;
            IntercomButtonKt.IntercomButton((i) null, intercomButton.m582outlinedStyleKlgxPg(aVar.i(), aVar.a(), C2869h.a(h.j((float) 1), aVar.c()), mVar, 3510, 0), "Button", Integer.valueOf(i11), new C6339d(), mVar, 24960, 1);
            return;
        }
        mVar.I();
    }
}
