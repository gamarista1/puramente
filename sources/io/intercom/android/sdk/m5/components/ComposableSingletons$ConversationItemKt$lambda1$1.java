package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.g2;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ConversationItemKt$lambda1$1 implements p {
    public static final ComposableSingletons$ConversationItemKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationItemKt$lambda1$1();

    ComposableSingletons$ConversationItemKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            i d10 = b.d(q.h(i.f23074a, 0.0f, 1, (Object) null), IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null);
            Ticket.Status status = r15;
            Ticket.Status status2 = new Ticket.Status("Resolved", "resolved", (String) null, false, 0, 28, (DefaultConstructorMarker) null);
            float f10 = (float) 16;
            ConversationItemKt.ConversationItem(ConversationItemKt.sampleConversation(new Ticket((String) null, (String) null, "Feature request", (String) null, (String) null, (String) null, status, (List) null, (List) null, 0, (Participant.Builder) null, (String) null, (Ticket.ConversationButton) null, (Boolean) null, 0, 32699, (DefaultConstructorMarker) null), true), d10, n.b(h.j(f10), h.j(f10)), false, new r(), mVar, 24584, 8);
            return;
        }
        mVar.I();
    }
}
