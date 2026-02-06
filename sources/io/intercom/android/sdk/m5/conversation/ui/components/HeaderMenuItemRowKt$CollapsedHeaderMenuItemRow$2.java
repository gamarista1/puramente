package io.intercom.android.sdk.m5.conversation.ui.components;

import B.l;
import C.C1086d;
import M0.e;
import V.S;
import V.U;
import V.V;
import Y.C1500m;
import c1.h;
import g0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2 implements q {
    final /* synthetic */ int $icon;
    final /* synthetic */ String $label;
    final /* synthetic */ C6787a $onClick;
    final /* synthetic */ long $tint;

    HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2(C6787a aVar, int i10, String str, long j10) {
        this.$onClick = aVar;
        this.$icon = i10;
        this.$label = str;
        this.$tint = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1086d) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1086d dVar, C1500m mVar, int i10) {
        C6496s.h(dVar, "$this$BadgedBox");
        if ((i10 & 81) != 16 || !mVar.i()) {
            C6787a aVar = this.$onClick;
            final int i11 = this.$icon;
            final String str = this.$label;
            final long j10 = this.$tint;
            U.b(aVar, (i) null, false, (S) null, (l) null, c.e(-900464534, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        V.a(e.c(i11, mVar, 0), str, androidx.compose.foundation.layout.q.n(i.f23074a, h.j((float) 24)), j10, mVar, 392, 0);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 196608, 30);
            return;
        }
        mVar.I();
    }
}
