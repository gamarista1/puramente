package io.intercom.android.sdk.m5.components.avatar;

import Y.C1500m;
import Z3.f;
import Z3.w;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AvatarIconKt$DefaultAvatar$1$1$2 implements r {
    final /* synthetic */ AvatarWrapper $avatarWrapper;
    final /* synthetic */ long $placeHolderTextSize;
    final /* synthetic */ long $textColor;

    AvatarIconKt$DefaultAvatar$1$1$2(AvatarWrapper avatarWrapper, long j10, long j11) {
        this.$avatarWrapper = avatarWrapper;
        this.$textColor = j10;
        this.$placeHolderTextSize = j11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((w) obj, (f.b.C0194b) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(w wVar, f.b.C0194b bVar, C1500m mVar, int i10) {
        C6496s.h(wVar, "$this$SubcomposeAsyncImage");
        C6496s.h(bVar, "it");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(wVar) ? 4 : 2;
        }
        if ((i10 & 651) != 130 || !mVar.i()) {
            AvatarIconKt.DefaultAvatar_Rd90Nhg$Placeholder(this.$avatarWrapper, this.$textColor, this.$placeHolderTextSize, wVar.e(i.f23074a, c.f23044a.e()), mVar, 0, 0);
        } else {
            mVar.I();
        }
    }
}
