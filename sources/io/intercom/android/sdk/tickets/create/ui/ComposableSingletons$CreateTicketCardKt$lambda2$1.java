package io.intercom.android.sdk.tickets.create.ui;

import Y.C1500m;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2544x0;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$CreateTicketCardKt$lambda2$1 implements p {
    public static final ComposableSingletons$CreateTicketCardKt$lambda2$1 INSTANCE = new ComposableSingletons$CreateTicketCardKt$lambda2$1();

    ComposableSingletons$CreateTicketCardKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            i h10 = q.h(i.f23074a, 0.0f, 1, (Object) null);
            Block access$getSampleBlock$p = CreateTicketCardKt.sampleBlock;
            C6496s.g(access$getSampleBlock$p, "access$getSampleBlock$p(...)");
            CreateTicketCardKt.CreateTicketCard(h10, new BlockRenderData(access$getSampleBlock$p, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, 30, (DefaultConstructorMarker) null), false, (C6787a) null, mVar, 454, 8);
            return;
        }
        mVar.I();
    }
}
