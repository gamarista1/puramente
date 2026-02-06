package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import Y.C1500m;
import io.intercom.android.sdk.blocks.lib.models.Block;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$GifGridKt$lambda2$1 implements p {
    public static final ComposableSingletons$GifGridKt$lambda2$1 INSTANCE = new ComposableSingletons$GifGridKt$lambda2$1();

    ComposableSingletons$GifGridKt$lambda2$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(Block block) {
        C6496s.h(block, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            GifGridKt.GifGrid((i) null, C6565s.n(), new E(), new F(), mVar, 3504, 1);
        } else {
            mVar.I();
        }
    }
}
