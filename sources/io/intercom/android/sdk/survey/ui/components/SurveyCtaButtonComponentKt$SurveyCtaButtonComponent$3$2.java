package io.intercom.android.sdk.survey.ui.components;

import C.Y;
import Q0.T;
import V.T0;
import V0.h;
import V0.n;
import V0.p;
import Y.C1500m;
import b1.j;
import b1.k;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2 implements q {
    final /* synthetic */ String $primaryCtaText;
    final /* synthetic */ long $textColor;

    SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2(String str, long j10) {
        this.$primaryCtaText = str;
        this.$textColor = j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C6496s.h(y10, "$this$Button");
        if ((i10 & 81) != 16 || !mVar.i()) {
            T0.b(this.$primaryCtaText, (i) null, this.$textColor, 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, mVar, 0, 0, 131066);
        } else {
            mVar.I();
        }
    }
}
