package io.intercom.android.sdk.tickets;

import C.Y;
import M0.e;
import V.V;
import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$FIleAttachmentListKt$lambda1$1 implements q {
    public static final ComposableSingletons$FIleAttachmentListKt$lambda1$1 INSTANCE = new ComposableSingletons$FIleAttachmentListKt$lambda1$1();

    ComposableSingletons$FIleAttachmentListKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C6496s.h(y10, "$this$FileAttachment");
        if ((i10 & 81) != 16 || !mVar.i()) {
            V.a(e.c(R.drawable.intercom_ic_alert_circle, mVar, 0), "Error Icon", androidx.compose.foundation.layout.q.n(i.f23074a, h.j((float) 16)), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m689getError0d7_KjU(), mVar, 440, 0);
            return;
        }
        mVar.I();
    }
}
