package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.models.Avatar;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$BotAndHumansFacePileKt$lambda2$1 implements p {
    public static final ComposableSingletons$BotAndHumansFacePileKt$lambda2$1 INSTANCE = new ComposableSingletons$BotAndHumansFacePileKt$lambda2$1();

    ComposableSingletons$BotAndHumansFacePileKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Avatar create = Avatar.create("", "VR");
            C6496s.g(create, "create(...)");
            BotAndHumansFacePileKt.m138BotAndHumansFacePilehGBTI10((i) null, create, new Pair((Object) null, Avatar.create("", "SK")), h.j((float) 32), "Fin", mVar, 28224, 1);
            return;
        }
        mVar.I();
    }
}
