package io.intercom.android.sdk.m5.conversation.ui.components;

import C.C1086d;
import V.C1383h;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2550z0;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1 implements q {
    final /* synthetic */ String $badgeText;
    final /* synthetic */ boolean $showBadge;
    final /* synthetic */ boolean $showUnreadDot;

    HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1(boolean z10, String str, boolean z11) {
        this.$showUnreadDot = z10;
        this.$badgeText = str;
        this.$showBadge = z11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1086d) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1086d dVar, C1500m mVar, int i10) {
        C6496s.h(dVar, "$this$BadgedBox");
        if ((i10 & 81) == 16 && mVar.i()) {
            mVar.I();
        } else if (this.$showUnreadDot) {
            mVar.T(-1594599123);
            float f10 = (float) 10;
            C1383h.a(n.m(i.f23074a, 0.0f, h.j(f10), h.j(f10), 0.0f, 9, (Object) null), C2550z0.d(4292544041L), 0, (q) null, mVar, 48, 12);
            mVar.M();
        } else {
            mVar.T(-1594405776);
            if (this.$badgeText == null || !this.$showBadge) {
                mVar.M();
                return;
            }
            HeaderMenuItemRowKt.UnreadBadge(n.m(i.f23074a, 0.0f, h.j((float) 4), h.j((float) 2), 0.0f, 9, (Object) null), this.$badgeText, mVar, 0, 0);
            mVar.M();
        }
    }
}
