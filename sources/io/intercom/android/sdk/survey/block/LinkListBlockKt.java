package io.intercom.android.sdk.survey.block;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "block", "Lr0/x0;", "textColor", "", "conversationId", "Llf/M;", "LinkListBlock-cf5BqRc", "(Lk0/i;Lio/intercom/android/sdk/blocks/lib/models/Block;JLjava/lang/String;LY/m;II)V", "LinkListBlock", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LinkListBlockKt {
    /* renamed from: LinkListBlock-cf5BqRc  reason: not valid java name */
    public static final void m456LinkListBlockcf5BqRc(i iVar, Block block, long j10, String str, C1500m mVar, int i10, int i11) {
        i iVar2;
        Block block2 = block;
        String str2 = str;
        C6496s.h(block2, "block");
        C6496s.h(str2, "conversationId");
        C1500m h10 = mVar.h(-1519911583);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        i iVar3 = iVar2;
        C1500m mVar2 = h10;
        IntercomCardKt.IntercomCard(iVar3, IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, h10, IntercomCardStyle.$stable << 15, 31), c.e(-46303019, true, new LinkListBlockKt$LinkListBlock$1(block2, j10, str2), h10, 54), mVar2, (i10 & 14) | 384 | (IntercomCardStyle.Style.$stable << 3), 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(iVar2, block, j10, str, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M LinkListBlock_cf5BqRc$lambda$0(i iVar, Block block, long j10, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(block, "$block");
        C6496s.h(str, "$conversationId");
        m456LinkListBlockcf5BqRc(iVar, block, j10, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
