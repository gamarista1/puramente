package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2722e;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MessageListKt$MessageList$13$1$5 implements q {
    final /* synthetic */ ContentRow $item;

    MessageListKt$MessageList$13$1$5(ContentRow contentRow) {
        this.$item = contentRow;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C6496s.h(eVar, "$this$AnimatedVisibility");
        TypingIndicatorKt.m327TypingIndicator6a0pyJM(n.k(androidx.compose.foundation.layout.q.h(i.f23074a, 0.0f, 1, (Object) null), h.j((float) 16), 0.0f, 2, (Object) null), ((ContentRow.TypingIndicatorRow) this.$item).getCurrentlyTypingState(), h.j((float) 36), mVar, 454, 0);
    }
}
