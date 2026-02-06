package io.intercom.android.sdk.survey.block;

import C.C1092j;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationRatingBlockKt$ConversationRatingBlock$1 implements q {
    final /* synthetic */ BlockRenderData $blockRenderData;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ long $textColor;

    ConversationRatingBlockKt$ConversationRatingBlock$1(BlockRenderData blockRenderData, long j10, String str) {
        this.$blockRenderData = blockRenderData;
        this.$textColor = j10;
        this.$conversationId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i h10 = androidx.compose.foundation.layout.q.h(aVar, 0.0f, 1, (Object) null);
            c e10 = c.f23044a.e();
            BlockRenderData blockRenderData = this.$blockRenderData;
            long j10 = this.$textColor;
            String str = this.$conversationId;
            F h11 = d.h(e10, false);
            int a10 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e11 = h.e(mVar, h10);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, h11, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e11, aVar2.d());
            f fVar = f.f12848a;
            BlockViewKt.m445RenderLegacyBlockssW7UJKQ(blockRenderData.getBlock(), j10, n.i(aVar, c1.h.j((float) 16)), str, mVar, 392, 0);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
