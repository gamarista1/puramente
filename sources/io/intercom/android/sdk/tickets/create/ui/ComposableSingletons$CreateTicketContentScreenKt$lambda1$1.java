package io.intercom.android.sdk.tickets.create.ui;

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
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda1$1 implements q {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda1$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$TextButton");
        if ((i10 & 81) != 16 || !mVar.i()) {
            T0.b(i.a(R.string.intercom_cancel, mVar2, 0), (k0.i) null, 0, 0, (n) null, p.f8210b.d(), (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04Point5(), mVar, 196608, 0, 65502);
            return;
        }
        mVar.I();
    }
}
