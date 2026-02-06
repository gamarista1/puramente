package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V.C1404s;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import b1.j;
import c1.h;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import o0.C2342e;
import r0.C2544x0;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FinStreamingRowKt$FinStreamingRow$1$1 implements p {
    final /* synthetic */ List<Block> $blocks;
    final /* synthetic */ FinRowStyle $finAnswerStyle;
    final /* synthetic */ StreamingPart $streamingPart;

    FinStreamingRowKt$FinStreamingRow$1$1(FinRowStyle finRowStyle, StreamingPart streamingPart, List<? extends Block> list) {
        this.$finAnswerStyle = finRowStyle;
        this.$streamingPart = streamingPart;
        this.$blocks = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i h10 = n.h(i.f23074a, this.$finAnswerStyle.getBubbleStyle().getPadding());
            C1085c.f n10 = C1085c.f882a.n(h.j((float) 16));
            StreamingPart streamingPart = this.$streamingPart;
            List<Block> list = this.$blocks;
            FinRowStyle finRowStyle = this.$finAnswerStyle;
            F a10 = C1090h.a(n10, c.f23044a.k(), mVar2, 6);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, h10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a12 = aVar.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar.c());
            F1.b(a13, p10, aVar.e());
            p b10 = aVar.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar.d());
            C1093k kVar = C1093k.f978a;
            io.intercom.android.sdk.models.Metadata metadata = streamingPart.getMetadata();
            mVar2.T(-989627254);
            if (metadata != null) {
                Iterable<Avatar> avatars = metadata.getAvatars();
                ArrayList arrayList = new ArrayList(C6565s.y(avatars, 10));
                for (Avatar avatarWrapper : avatars) {
                    arrayList.add(new AvatarWrapper(avatarWrapper, false, 2, (DefaultConstructorMarker) null));
                }
                FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), (i) null, metadata.getSuffix(), metadata.getTimestamp(), (AiAnswerInfo) null, mVar, 196616, 4);
            }
            mVar.M();
            mVar2.T(-989612763);
            int i11 = 0;
            for (Object next : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C6565s.x();
                }
                FinStreamingRowKt.FinStreamingBlock(new BlockRenderData((Block) next, C2544x0.k(C1404s.c(finRowStyle.getBubbleStyle().m321getColor0d7_KjU(), mVar2, 0)), (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, BlockRenderTextStyle.m433copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0, (V0.p) null, 0, (C2544x0) null, C2544x0.k(IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m673getActionContrastWhite0d7_KjU()), (j) null, 47, (Object) null), 12, (DefaultConstructorMarker) null), C2342e.a(i.f23074a, finRowStyle.getContentShape()), i11 == C6565s.p(list), mVar, 8, 0);
                i11 = i12;
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
