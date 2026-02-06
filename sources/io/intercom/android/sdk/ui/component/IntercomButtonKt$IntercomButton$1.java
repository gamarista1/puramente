package io.intercom.android.sdk.ui.component;

import C.Y;
import C.a0;
import M0.e;
import Q0.T;
import V.T0;
import V.V;
import V0.h;
import V0.n;
import V0.p;
import Y.C1500m;
import b1.j;
import b1.k;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomButtonKt$IntercomButton$1 implements q {
    final /* synthetic */ IntercomButton.Style $style;
    final /* synthetic */ String $text;
    final /* synthetic */ Integer $trailingIconId;

    IntercomButtonKt$IntercomButton$1(IntercomButton.Style style, String str, Integer num) {
        this.$style = style;
        this.$text = str;
        this.$trailingIconId = num;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(y10, "$this$OutlinedButton");
        if ((i10 & 81) != 16 || !mVar.i()) {
            T type04 = IntercomTheme.INSTANCE.getTypography(mVar2, 6).getType04();
            T0.b(this.$text, (i) null, this.$style.m589getContentColor0d7_KjU(), 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, type04, mVar, 0, 0, 65530);
            Integer num = this.$trailingIconId;
            if (num != null) {
                IntercomButton.Style style = this.$style;
                int intValue = num.intValue();
                i.a aVar = i.f23074a;
                C1500m mVar3 = mVar;
                a0.a(androidx.compose.foundation.layout.q.r(aVar, c1.h.j((float) 6)), mVar3, 6);
                V.a(e.c(intValue, mVar3, 0), (String) null, androidx.compose.foundation.layout.q.n(aVar, c1.h.j((float) 16)), style.m589getContentColor0d7_KjU(), mVar3, 440, 0);
                return;
            }
            return;
        }
        mVar.I();
    }
}
