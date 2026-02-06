package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import B.l;
import C.N;
import P.K;
import V.Q0;
import W0.c0;
import Y.C1500m;
import Y.C1510r0;
import androidx.compose.foundation.layout.n;
import c1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.g2;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class GifGridKt$GifGrid$1$1$3 implements q {
    final /* synthetic */ l $interactionSource;
    final /* synthetic */ C1510r0 $searchText;

    GifGridKt$GifGrid$1$1$3(C1510r0 r0Var, l lVar) {
        this.$searchText = r0Var;
        this.$interactionSource = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((p) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(p pVar, C1500m mVar, int i10) {
        int i11;
        p pVar2 = pVar;
        C6496s.h(pVar2, "it");
        C1500m mVar2 = mVar;
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.C(pVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            Q0 q02 = Q0.f6883a;
            c0 c10 = c0.f8551a.c();
            N a10 = n.a(h.j((float) 0));
            C2544x0.a aVar = C2544x0.f25560b;
            q02.b((String) this.$searchText.getValue(), pVar, true, true, c10, this.$interactionSource, false, (p) null, ComposableSingletons$GifGridKt.INSTANCE.m267getLambda1$intercom_sdk_base_release(), (p) null, (p) null, (p) null, (p) null, (p) null, (g2) null, q02.d(0, 0, 0, 0, aVar.g(), aVar.g(), 0, 0, 0, 0, (K) null, aVar.g(), aVar.g(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, mVar, 221184, 432, 0, 0, 3072, 2147477455, 4095), a10, (p) null, mVar, ((i11 << 3) & 112) | 100887936, 102236160, 163520);
            return;
        }
        mVar.I();
    }
}
