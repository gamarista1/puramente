package io.intercom.android.sdk.ui.component;

import B.l;
import C.C1086d;
import I.f;
import I.g;
import M0.e;
import V.O;
import V.Q;
import V.V;
import Y.C1500m;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import c1.h;
import g0.c;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2721d;
import v.C2722e;
import w.C2777V;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class JumpToBottomKt$JumpToBottom$2 implements q {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C6787a $onClick;

    JumpToBottomKt$JumpToBottom$2(C6787a aVar, long j10, long j11) {
        this.$onClick = aVar;
        this.$backgroundColor = j10;
        this.$contentColor = j11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1086d) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1086d dVar, C1500m mVar, int i10) {
        C6496s.h(dVar, "$this$BadgedBox");
        if ((i10 & 81) != 16 || !mVar.i()) {
            mVar.T(-1483775543);
            Object A10 = mVar.A();
            C2777V v10 = A10;
            if (A10 == C1500m.f10026a.a()) {
                C2777V v11 = new C2777V(Boolean.FALSE);
                v11.h(Boolean.TRUE);
                mVar.r(v11);
                v10 = v11;
            }
            mVar.M();
            i floatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((d) mVar.m(C1644k0.e())).t1(JumpToBottomKt.getJumpBottomPadding()));
            final C6787a aVar = this.$onClick;
            final long j10 = this.$backgroundColor;
            final long j11 = this.$contentColor;
            C2721d.f((C2777V) v10, (k0.i) null, floatingButtonEnterTransition, (k) null, (String) null, c.e(600504953, true, new q() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C2722e eVar, C1500m mVar, int i10) {
                    C6496s.h(eVar, "$this$AnimatedVisibility");
                    k0.i n10 = androidx.compose.foundation.layout.q.n(n.i(k0.i.f23074a, JumpToBottomKt.getJumpBottomPadding()), h.j((float) 40));
                    f a10 = g.a(50);
                    C6787a aVar = aVar;
                    long j10 = j10;
                    final long j11 = j11;
                    C1500m mVar2 = mVar;
                    Q.a(aVar, n10, a10, j10, 0, (O) null, (l) null, c.e(-1997870085, true, new p() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((C1500m) obj, ((Number) obj2).intValue());
                            return C6514M.f71813a;
                        }

                        public final void invoke(C1500m mVar, int i10) {
                            if ((i10 & 11) != 2 || !mVar.i()) {
                                V.a(e.c(R.drawable.intercom_ic_chevron_down, mVar, 0), "Jump to bottom", androidx.compose.foundation.layout.q.n(k0.i.f23074a, h.j((float) 24)), j11, mVar, 440, 0);
                                return;
                            }
                            mVar.I();
                        }
                    }, mVar2, 54), mVar2, 12582960, 112);
                }
            }, mVar, 54), mVar, C2777V.f27247d | 196608, 26);
            return;
        }
        mVar.I();
    }
}
