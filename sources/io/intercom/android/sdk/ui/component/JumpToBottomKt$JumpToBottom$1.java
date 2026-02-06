package io.intercom.android.sdk.ui.component;

import C.C1086d;
import Y.C1500m;
import androidx.compose.foundation.layout.l;
import c1.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class JumpToBottomKt$JumpToBottom$1 implements q {
    final /* synthetic */ long $badgeColor;
    final /* synthetic */ long $badgeContentColor;
    final /* synthetic */ String $badgeText;

    JumpToBottomKt$JumpToBottom$1(String str, long j10, long j11) {
        this.$badgeText = str;
        this.$badgeColor = j10;
        this.$badgeContentColor = j11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1086d) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1086d dVar, C1500m mVar, int i10) {
        C6496s.h(dVar, "$this$BadgedBox");
        if ((i10 & 81) != 16 || !mVar.i()) {
            String str = this.$badgeText;
            if (str != null) {
                JumpToBottomKt.m604UnreadBadgeeaDK9VM(l.a(i.f23074a, h.j(h.j((float) -5) - JumpToBottomKt.getJumpBottomPadding()), JumpToBottomKt.getJumpBottomPadding()), str, this.$badgeColor, this.$badgeContentColor, mVar, 6, 0);
                return;
            }
            return;
        }
        mVar.I();
    }
}
