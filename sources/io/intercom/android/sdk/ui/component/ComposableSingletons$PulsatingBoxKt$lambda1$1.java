package io.intercom.android.sdk.ui.component;

import C.C1086d;
import Y.C1500m;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import c1.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$PulsatingBoxKt$lambda1$1 implements q {
    public static final ComposableSingletons$PulsatingBoxKt$lambda1$1 INSTANCE = new ComposableSingletons$PulsatingBoxKt$lambda1$1();

    ComposableSingletons$PulsatingBoxKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1086d) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1086d dVar, C1500m mVar, int i10) {
        C6496s.h(dVar, "$this$PulsatingBox");
        if ((i10 & 81) != 16 || !mVar.i()) {
            d.a(b.d(androidx.compose.foundation.layout.q.n(i.f23074a, h.j((float) 100)), C2544x0.f25560b.i(), (g2) null, 2, (Object) null), mVar, 6);
        } else {
            mVar.I();
        }
    }
}
