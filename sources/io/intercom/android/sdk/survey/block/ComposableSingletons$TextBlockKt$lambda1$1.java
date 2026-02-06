package io.intercom.android.sdk.survey.block;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2544x0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TextBlockKt$lambda1$1 implements p {
    public static final ComposableSingletons$TextBlockKt$lambda1$1 INSTANCE = new ComposableSingletons$TextBlockKt$lambda1$1();

    ComposableSingletons$TextBlockKt$lambda1$1() {
    }

    private static final Block invoke$lambda$0$buildBlock(String str, String str2) {
        return new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withAlign(str).withText(str2).build();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i h10 = q.h(aVar, 0.0f, 1, (Object) null);
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, h10);
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
            Block invoke$lambda$0$buildBlock = invoke$lambda$0$buildBlock(BlockAlignment.LEFT, "Left");
            C6496s.g(invoke$lambda$0$buildBlock, "invoke$lambda$0$buildBlock(...)");
            BlockRenderData blockRenderData = new BlockRenderData(invoke$lambda$0$buildBlock, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, 30, (DefaultConstructorMarker) null);
            C1500m mVar3 = mVar;
            String str = "invoke$lambda$0$buildBlock(...)";
            TextBlockKt.TextBlock(q.h(aVar, 0.0f, 1, (Object) null), blockRenderData, (SuffixText) null, (C6798l) null, mVar3, 70, 12);
            Block invoke$lambda$0$buildBlock2 = invoke$lambda$0$buildBlock("center", "Center");
            C6496s.g(invoke$lambda$0$buildBlock2, str);
            TextBlockKt.TextBlock(q.h(aVar, 0.0f, 1, (Object) null), new BlockRenderData(invoke$lambda$0$buildBlock2, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, 30, (DefaultConstructorMarker) null), (SuffixText) null, (C6798l) null, mVar3, 70, 12);
            Block invoke$lambda$0$buildBlock3 = invoke$lambda$0$buildBlock(BlockAlignment.RIGHT, "Right");
            C6496s.g(invoke$lambda$0$buildBlock3, str);
            TextBlockKt.TextBlock(q.h(aVar, 0.0f, 1, (Object) null), new BlockRenderData(invoke$lambda$0$buildBlock3, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, 30, (DefaultConstructorMarker) null), (SuffixText) null, (C6798l) null, mVar3, 70, 12);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
