package io.intercom.android.sdk.ui.component;

import C.Y;
import Q0.A;
import Q0.T;
import V.T0;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import X0.e;
import Y.C1500m;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.s;
import c1.w;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.e2;
import t0.C2606g;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class JumpToBottomKt$UnreadBadge$1 implements q {
    final /* synthetic */ String $badgeText;
    final /* synthetic */ long $contentColor;

    JumpToBottomKt$UnreadBadge$1(long j10, String str) {
        this.$contentColor = j10;
        this.$badgeText = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C6496s.h(y10, "$this$Badge");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i.a aVar = i.f23074a;
            T type05 = IntercomTheme.INSTANCE.getTypography(mVar, 6).getType05();
            int a10 = j.f19110b.a();
            T0.b(this.$badgeText, aVar, 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, T.c(type05, this.$contentColor, w.f(10), p.f8210b.e(), (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, a10, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16744440, (Object) null), mVar, 48, 0, 65532);
            return;
        }
        mVar.I();
    }
}
