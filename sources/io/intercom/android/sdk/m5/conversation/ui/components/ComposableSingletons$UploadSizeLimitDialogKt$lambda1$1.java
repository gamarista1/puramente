package io.intercom.android.sdk.m5.conversation.ui.components;

import C.Y;
import M0.i;
import V.T0;
import V0.h;
import V0.n;
import V0.p;
import Y.C1500m;
import b1.j;
import b1.k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$UploadSizeLimitDialogKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$UploadSizeLimitDialogKt$lambda1$1 implements q {
    public static final ComposableSingletons$UploadSizeLimitDialogKt$lambda1$1 INSTANCE = new ComposableSingletons$UploadSizeLimitDialogKt$lambda1$1();

    ComposableSingletons$UploadSizeLimitDialogKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$TextButton");
        if ((i10 & 81) != 16 || !mVar.i()) {
            String a10 = i.a(R.string.intercom_ok, mVar2, 0);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            T0.b(a10, (k0.i) null, intercomTheme.getColors(mVar2, i11).m673getActionContrastWhite0d7_KjU(), 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i11).getType04SemiBold(), mVar, 0, 0, 65530);
            return;
        }
        mVar.I();
    }
}
