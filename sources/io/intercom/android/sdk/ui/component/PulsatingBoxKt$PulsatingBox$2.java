package io.intercom.android.sdk.ui.component;

import C.C1088f;
import Y.C1500m;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import c1.h;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import o0.C2348k;
import o0.C2349l;
import r0.g2;
import w.C2782a;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PulsatingBoxKt$PulsatingBox$2 implements q {
    final /* synthetic */ C2782a $animatedScale;
    final /* synthetic */ q $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ long $pulseColor;
    final /* synthetic */ g2 $pulseShape;

    PulsatingBoxKt$PulsatingBox$2(boolean z10, C2782a aVar, g2 g2Var, long j10, q qVar) {
        this.$enabled = z10;
        this.$animatedScale = aVar;
        this.$pulseShape = g2Var;
        this.$pulseColor = j10;
        this.$content = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1088f fVar, C1500m mVar, int i10) {
        int i11;
        C1088f fVar2 = fVar;
        C1500m mVar2 = mVar;
        C6496s.h(fVar2, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(fVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            mVar2.T(1154915079);
            if (this.$enabled) {
                d.a(fVar2.e(b.c(C2349l.b(C2348k.a(androidx.compose.foundation.layout.q.o(i.f23074a, fVar.d(), fVar.g()), ((Number) this.$animatedScale.m()).floatValue()), h.j((float) 2), this.$pulseShape, false, 0, 0, 28, (Object) null), this.$pulseColor, this.$pulseShape), c.f23044a.e()), mVar2, 0);
            }
            mVar.M();
            this.$content.invoke(fVar2, mVar2, Integer.valueOf(i11 & 14));
            return;
        }
        mVar.I();
    }
}
