package io.intercom.android.sdk.survey.block;

import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.block.ComposableSingletons$AttachmentBlockKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$AttachmentBlockKt$lambda1$1 implements p {
    public static final ComposableSingletons$AttachmentBlockKt$lambda1$1 INSTANCE = new ComposableSingletons$AttachmentBlockKt$lambda1$1();

    ComposableSingletons$AttachmentBlockKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Block build = new Block.Builder().withAttachments(C6565s.e(new BlockAttachment.Builder().withName("Attachment Name.type").build())).build();
            C6496s.g(build, "build(...)");
            AttachmentBlockKt.AttachmentBlock((i) null, new BlockRenderData(build, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, 30, (DefaultConstructorMarker) null), false, mVar, 448, 1);
            return;
        }
        mVar.I();
    }
}
