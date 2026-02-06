package io.intercom.android.sdk.survey.block;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import g0.c;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "blockRenderData", "Lr0/x0;", "textColor", "", "conversationId", "Llf/M;", "ConversationRatingBlock-cf5BqRc", "(Lk0/i;Lio/intercom/android/sdk/survey/block/BlockRenderData;JLjava/lang/String;LY/m;II)V", "ConversationRatingBlock", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationRatingBlockKt {
    /* renamed from: ConversationRatingBlock-cf5BqRc  reason: not valid java name */
    public static final void m455ConversationRatingBlockcf5BqRc(i iVar, BlockRenderData blockRenderData, long j10, String str, C1500m mVar, int i10, int i11) {
        i iVar2;
        BlockRenderData blockRenderData2 = blockRenderData;
        String str2 = str;
        C6496s.h(blockRenderData2, "blockRenderData");
        C6496s.h(str2, "conversationId");
        C1500m h10 = mVar.h(1714913761);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        IntercomCardKt.IntercomCard(q.h(iVar2, 0.0f, 1, (Object) null), IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, h10, IntercomCardStyle.$stable << 15, 31), c.e(1828616789, true, new ConversationRatingBlockKt$ConversationRatingBlock$1(blockRenderData2, j10, str2), h10, 54), h10, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(iVar2, blockRenderData, j10, str, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationRatingBlock_cf5BqRc$lambda$0(i iVar, BlockRenderData blockRenderData, long j10, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockRenderData, "$blockRenderData");
        C6496s.h(str, "$conversationId");
        m455ConversationRatingBlockcf5BqRc(iVar, blockRenderData, j10, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
