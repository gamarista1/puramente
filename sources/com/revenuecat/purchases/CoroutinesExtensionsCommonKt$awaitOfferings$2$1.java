package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import qf.f;
import yf.C6798l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class CoroutinesExtensionsCommonKt$awaitOfferings$2$1 extends C6494p implements C6798l {
    CoroutinesExtensionsCommonKt$awaitOfferings$2$1(Object obj) {
        super(1, obj, f.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Offerings) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Offerings offerings) {
        C6496s.h(offerings, "p0");
        ((C6658d) this.receiver).resumeWith(v.b(offerings));
    }
}
