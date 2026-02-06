package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.Y;
import M0.i;
import Q0.T;
import V.T0;
import V0.h;
import V0.n;
import V0.p;
import Y.C1500m;
import b1.j;
import b1.k;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$BubbleMessageRowKt$lambda1$1 implements q {
    public static final ComposableSingletons$BubbleMessageRowKt$lambda1$1 INSTANCE = new ComposableSingletons$BubbleMessageRowKt$lambda1$1();

    ComposableSingletons$BubbleMessageRowKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C6496s.h(y10, "$this$Button");
        if ((i10 & 81) != 16 || !mVar.i()) {
            T0.b(i.a(R.string.intercom_retry, mVar, 0), (k0.i) null, 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, mVar, 0, 0, 131070);
        } else {
            mVar.I();
        }
    }
}
