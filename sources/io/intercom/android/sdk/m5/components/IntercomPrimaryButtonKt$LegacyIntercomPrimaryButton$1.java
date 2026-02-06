package io.intercom.android.sdk.m5.components;

import C.Y;
import C.a0;
import Q0.A;
import Q0.T;
import V.T0;
import V.V;
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
final class IntercomPrimaryButtonKt$LegacyIntercomPrimaryButton$1 implements q {
    final /* synthetic */ String $text;
    final /* synthetic */ Integer $trailingIconId;

    IntercomPrimaryButtonKt$LegacyIntercomPrimaryButton$1(String str, Integer num) {
        this.$text = str;
        this.$trailingIconId = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$LegacyIntercomPrimaryButton");
        if ((i10 & 81) != 16 || !mVar.i()) {
            String str = this.$text;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            int i12 = i11;
            IntercomTheme intercomTheme2 = intercomTheme;
            T0.b(str, (i) null, 0, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, T.c(intercomTheme.getTypography(mVar2, i11).getType04(), intercomTheme.getColors(mVar2, i11).m694getOnAction0d7_KjU(), 0, (p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null), mVar, 0, 0, 65534);
            Integer num = this.$trailingIconId;
            if (num != null) {
                int intValue = num.intValue();
                i.a aVar = i.f23074a;
                C1500m mVar3 = mVar;
                a0.a(androidx.compose.foundation.layout.q.r(aVar, c1.h.j((float) 6)), mVar3, 6);
                V.a(M0.e.c(intValue, mVar3, 0), (String) null, androidx.compose.foundation.layout.q.n(aVar, c1.h.j((float) 16)), intercomTheme2.getColors(mVar3, i12).m694getOnAction0d7_KjU(), mVar3, 440, 0);
                return;
            }
            return;
        }
        mVar.I();
    }
}
