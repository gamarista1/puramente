package io.intercom.android.sdk.m5.conversation.ui.components.row;

import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2722e;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class QuickRepliesKt$AnimatedQuickReplies$2 implements q {
    final /* synthetic */ C6798l $onReplyClicked;
    final /* synthetic */ List<ReplyOption> $replyOptions;

    QuickRepliesKt$AnimatedQuickReplies$2(List<ReplyOption> list, C6798l lVar) {
        this.$replyOptions = list;
        this.$onReplyClicked = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C6496s.h(eVar, "$this$AnimatedVisibility");
        float f10 = (float) 16;
        QuickRepliesKt.ReplyOptions(n.m(androidx.compose.foundation.layout.q.h(i.f23074a, 0.0f, 1, (Object) null), h.j(f10), 0.0f, h.j(f10), 0.0f, 10, (Object) null), this.$replyOptions, this.$onReplyClicked, mVar, 70, 0);
    }
}
