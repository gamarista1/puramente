package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V.C1404s;
import V.O0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import b1.j;
import c1.h;
import g0.c;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import o0.C2342e;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.s;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FinAnswerRowKt$FinAnswerRow$2 implements s {
    final /* synthetic */ FinRowStyle $finAnswerStyle;

    FinAnswerRowKt$FinAnswerRow$2(FinRowStyle finRowStyle) {
        this.$finAnswerStyle = finRowStyle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke((C1092j) obj, (Part) obj2, (C6787a) obj3, (C1500m) obj4, ((Number) obj5).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, Part part, C6787a aVar, C1500m mVar, int i10) {
        final Part part2 = part;
        final C6787a aVar2 = aVar;
        C6496s.h(jVar, "$this$ClickableMessageRow");
        C6496s.h(part2, "part");
        C6496s.h(aVar2, "onClick");
        g2 shape = this.$finAnswerStyle.getBubbleStyle().getShape();
        long r62 = this.$finAnswerStyle.getBubbleStyle().m321getColor0d7_KjU();
        C2868g borderStroke = this.$finAnswerStyle.getBubbleStyle().getBorderStroke();
        final FinRowStyle finRowStyle = this.$finAnswerStyle;
        C1500m mVar2 = mVar;
        O0.a((i) null, shape, r62, 0, 0.0f, 0.0f, borderStroke, c.e(-289009406, true, new p() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C1500m) obj, ((Number) obj2).intValue());
                return C6514M.f71813a;
            }

            public final void invoke(C1500m mVar, int i10) {
                C1500m mVar2 = mVar;
                if ((i10 & 11) != 2 || !mVar.i()) {
                    i h10 = n.h(i.f23074a, finRowStyle.getBubbleStyle().getPadding());
                    C1085c.f n10 = C1085c.f882a.n(h.j((float) 16));
                    Part part = part2;
                    FinRowStyle finRowStyle = finRowStyle;
                    C6787a aVar = aVar2;
                    F a10 = C1090h.a(n10, k0.c.f23044a.k(), mVar2, 6);
                    int i11 = 0;
                    int a11 = C1494j.a(mVar2, 0);
                    C1523y p10 = mVar.p();
                    i e10 = k0.h.e(mVar2, h10);
                    C1241g.a aVar2 = C1241g.f3853J;
                    C6787a a12 = aVar2.a();
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
                    F1.b(a13, a10, aVar2.c());
                    F1.b(a13, p10, aVar2.e());
                    p b10 = aVar2.b();
                    if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                        a13.r(Integer.valueOf(a11));
                        a13.V(Integer.valueOf(a11), b10);
                    }
                    F1.b(a13, e10, aVar2.d());
                    C1093k kVar = C1093k.f978a;
                    io.intercom.android.sdk.models.Metadata metadata = part.getMetadata();
                    mVar2.T(-179719045);
                    if (metadata != null) {
                        Iterable<Avatar> avatars = metadata.getAvatars();
                        ArrayList arrayList = new ArrayList(C6565s.y(avatars, 10));
                        for (Avatar avatarWrapper : avatars) {
                            arrayList.add(new AvatarWrapper(avatarWrapper, false, 2, (DefaultConstructorMarker) null));
                        }
                        FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), (i) null, metadata.getSuffix(), metadata.getTimestamp(), part.getAiAnswerInfo(), mVar, 8, 4);
                    }
                    mVar.M();
                    mVar2.T(-179704098);
                    List<Block> blocks = part.getBlocks();
                    C6496s.g(blocks, "getBlocks(...)");
                    for (Block block : blocks) {
                        i a14 = C2342e.a(i.f23074a, finRowStyle.getContentShape());
                        C6496s.e(block);
                        BlockViewKt.BlockView(a14, new BlockRenderData(block, C2544x0.k(C1404s.c(finRowStyle.getBubbleStyle().m321getColor0d7_KjU(), mVar2, i11)), (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, BlockRenderTextStyle.m433copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0, (V0.p) null, 0, (C2544x0) null, C2544x0.k(IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m673getActionContrastWhite0d7_KjU()), (j) null, 47, (Object) null), 12, (DefaultConstructorMarker) null), false, (SuffixText) null, false, (String) null, (ImageRenderType) null, aVar, (C6798l) null, (C6798l) null, mVar, 64, 892);
                        aVar = aVar;
                        finRowStyle = finRowStyle;
                        i11 = 0;
                    }
                    mVar.M();
                    mVar2.T(-179682236);
                    List<Source> sources = part.getSources();
                    C6496s.g(sources, "getSources(...)");
                    if (!sources.isEmpty()) {
                        IntercomDividerKt.IntercomDivider((i) null, mVar2, 0, 1);
                        List<Source> sources2 = part.getSources();
                        C6496s.g(sources2, "getSources(...)");
                        FinAnswerRowKt.FinAnswerSources(sources2, mVar2, 8);
                    }
                    mVar.M();
                    mVar.u();
                    return;
                }
                mVar.I();
            }
        }, mVar2, 54), mVar2, 12582912, 57);
    }
}
