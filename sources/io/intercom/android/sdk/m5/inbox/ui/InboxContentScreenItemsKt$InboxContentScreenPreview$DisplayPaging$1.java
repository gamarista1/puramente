package io.intercom.android.sdk.m5.inbox.ui;

import C.C1085c;
import C.N;
import D.A;
import D.C1109b;
import D.x;
import Y.C1500m;
import io.intercom.android.sdk.models.Conversation;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import n3.C2331a;
import yf.p;
import z.n;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1 implements p {
    final /* synthetic */ C2331a $lazyPagingItems;

    InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(C2331a aVar) {
        this.$lazyPagingItems = aVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(C2331a aVar, x xVar) {
        C6496s.h(aVar, "$lazyPagingItems");
        C6496s.h(xVar, "$this$LazyColumn");
        InboxContentScreenItemsKt.inboxContentScreenItems(xVar, aVar, new g());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(Conversation conversation) {
        C6496s.h(conversation, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            C1109b.a((i) null, (A) null, (N) null, false, (C1085c.m) null, (c.b) null, (n) null, false, new h(this.$lazyPagingItems), mVar, 0, 255);
        } else {
            mVar.I();
        }
    }
}
