package io.intercom.android.sdk.m5.conversation.ui.components.row;

import H0.F;
import J0.C1241g;
import Q0.L;
import V.B0;
import V.O0;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import c1.h;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import q0.C2416b;
import q0.C2422h;
import q0.C2428n;
import r0.C2544x0;
import r0.C2547y0;
import t0.C2602c;
import t0.C2605f;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "blocks", "Lio/intercom/android/sdk/models/StreamingPart;", "streamingPart", "Lk0/i;", "modifier", "Llf/M;", "FinStreamingRow", "(Ljava/util/List;Lio/intercom/android/sdk/models/StreamingPart;Lk0/i;LY/m;II)V", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "blockRenderData", "", "showCursor", "FinStreamingBlock", "(Lio/intercom/android/sdk/survey/block/BlockRenderData;Lk0/i;ZLY/m;II)V", "FinStreamingRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FinStreamingRowKt {
    public static final void FinStreamingBlock(BlockRenderData blockRenderData, i iVar, boolean z10, C1500m mVar, int i10, int i11) {
        i iVar2;
        boolean z11;
        int i12 = i10;
        C6496s.h(blockRenderData, "blockRenderData");
        C1500m h10 = mVar.h(1420678116);
        if ((i11 & 2) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        boolean z12 = false;
        if ((i11 & 4) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        h10.T(-382486785);
        Object A10 = h10.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = u1.d((Object) null, (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        h10.M();
        d dVar = (d) h10.m(C1644k0.e());
        Pair a10 = C6502A.a(Float.valueOf(dVar.t1(h.j((float) 3)) * dVar.r1()), Float.valueOf(dVar.t1(h.j((float) 12)) * dVar.r1()));
        float floatValue = ((Number) a10.a()).floatValue();
        float floatValue2 = ((Number) a10.b()).floatValue();
        h10.T(-382476587);
        if ((((i12 & 896) ^ 384) > 256 && h10.b(z11)) || (i12 & 384) == 256) {
            z12 = true;
        }
        boolean c10 = z12 | h10.c(floatValue2) | h10.c(floatValue);
        Object A11 = h10.A();
        if (c10 || A11 == aVar.a()) {
            A11 = new S(z11, r0Var, floatValue2, floatValue);
            h10.r(A11);
        }
        h10.M();
        i d10 = b.d(iVar2, (C6798l) A11);
        h10.T(-382442246);
        Object A12 = h10.A();
        if (A12 == aVar.a()) {
            A12 = new T(r0Var);
            h10.r(A12);
        }
        h10.M();
        BlockViewKt.BlockView(d10, blockRenderData, false, (SuffixText) null, false, (String) null, (ImageRenderType) null, (C6787a) null, (C6798l) null, (C6798l) A12, h10, 805306432, 508);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new U(blockRenderData, iVar2, z11, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinStreamingBlock$lambda$6$lambda$5(boolean z10, C1510r0 r0Var, float f10, float f11, C2602c cVar) {
        L l10;
        float f12 = f10;
        float f13 = f11;
        C6496s.h(r0Var, "$layoutResult");
        C6496s.h(cVar, "$this$drawWithContent");
        cVar.H1();
        if (z10 && (l10 = (L) r0Var.getValue()) != null) {
            int n10 = l10.n() - 1;
            float m10 = l10.m(n10) - l10.v(n10);
            float v10 = l10.v(n10);
            float f14 = (float) 2;
            C2605f.L0(cVar, C2544x0.f25560b.a(), C2422h.a(l10.t(n10) + 12.0f, v10 + ((m10 / f14) - (f12 / f14))), C2428n.a(f13, f12), C2416b.a(f13, f13), (C2606g) null, 0.0f, (C2547y0) null, 0, 240, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FinStreamingBlock$lambda$8$lambda$7(C1510r0 r0Var, L l10) {
        C6496s.h(r0Var, "$layoutResult");
        C6496s.h(l10, "it");
        r0Var.setValue(l10);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M FinStreamingBlock$lambda$9(BlockRenderData blockRenderData, i iVar, boolean z10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockRenderData, "$blockRenderData");
        FinStreamingBlock(blockRenderData, iVar, z10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void FinStreamingRow(List<? extends Block> list, StreamingPart streamingPart, i iVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        List<? extends Block> list2 = list;
        StreamingPart streamingPart2 = streamingPart;
        C6496s.h(list2, "blocks");
        C6496s.h(streamingPart2, "streamingPart");
        C1500m h10 = mVar.h(-918532595);
        if ((i11 & 4) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        FinRowStyle finRowStyle = FinAnswerRowKt.getFinRowStyle(GroupingPosition.STANDALONE, h10, 6);
        i h11 = n.h(aVar, finRowStyle.getRowPadding());
        F h12 = androidx.compose.foundation.layout.d.h(c.f23044a.o(), false);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, h11);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a11 = aVar2.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a11);
        } else {
            h10.q();
        }
        C1500m a12 = F1.a(h10);
        F1.b(a12, h12, aVar2.c());
        F1.b(a12, p10, aVar2.e());
        p b10 = aVar2.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b10);
        }
        F1.b(a12, e10, aVar2.d());
        f fVar = f.f12848a;
        i iVar2 = aVar;
        O0.a((i) null, finRowStyle.getBubbleStyle().getShape(), finRowStyle.getBubbleStyle().m321getColor0d7_KjU(), 0, 0.0f, 0.0f, finRowStyle.getBubbleStyle().getBorderStroke(), g0.c.e(610304332, true, new FinStreamingRowKt$FinStreamingRow$1$1(finRowStyle, streamingPart2, list2), h10, 54), h10, 12582912, 57);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new V(list, streamingPart, iVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinStreamingRow$lambda$1(List list, StreamingPart streamingPart, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$blocks");
        C6496s.h(streamingPart, "$streamingPart");
        FinStreamingRow(list, streamingPart, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void FinStreamingRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1248993407);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$FinStreamingRowKt.INSTANCE.m298getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new W(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FinStreamingRowPreview$lambda$10(int i10, C1500m mVar, int i11) {
        FinStreamingRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
