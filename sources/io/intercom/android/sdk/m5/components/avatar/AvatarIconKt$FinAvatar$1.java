package io.intercom.android.sdk.m5.components.avatar;

import Y.C1500m;
import Z3.f;
import Z3.w;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AvatarIconKt$FinAvatar$1 implements r {
    final /* synthetic */ AvatarWrapper $avatarWrapper;
    final /* synthetic */ i $roundedModifier;

    AvatarIconKt$FinAvatar$1(AvatarWrapper avatarWrapper, i iVar) {
        this.$avatarWrapper = avatarWrapper;
        this.$roundedModifier = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((w) obj, (f.b.c) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(w wVar, f.b.c cVar, C1500m mVar, int i10) {
        C6496s.h(wVar, "$this$SubcomposeAsyncImage");
        C6496s.h(cVar, "it");
        if ((i10 & 641) != 128 || !mVar.i()) {
            AvatarIconKt.FinAvatarPlaceholder(this.$avatarWrapper, this.$roundedModifier, 0.0f, mVar, 8, 4);
        } else {
            mVar.I();
        }
    }
}
