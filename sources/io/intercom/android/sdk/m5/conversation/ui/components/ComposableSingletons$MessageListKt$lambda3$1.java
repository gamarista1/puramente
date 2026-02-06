package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import androidx.compose.foundation.o;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$MessageListKt$lambda3$1 implements p {
    public static final ComposableSingletons$MessageListKt$lambda3$1 INSTANCE = new ComposableSingletons$MessageListKt$lambda3$1();

    ComposableSingletons$MessageListKt$lambda3$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(ReplyOption replyOption) {
        C6496s.h(replyOption, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            List c10 = C6565s.c();
            c10.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
            MessageListKt.MessageList((i) null, C6565s.a(c10), (o) null, (C6798l) null, new C6116h(), (C6798l) null, (C6798l) null, (C6798l) null, (C6787a) null, (C6798l) null, false, (C6798l) null, mVar, 24640, 0, 4077);
            return;
        }
        mVar.I();
    }
}
