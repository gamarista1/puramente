package io.intercom.android.sdk.m5.home.ui;

import C.C1086d;
import Y.C1500m;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import v.C2722e;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$2$4$2$1 implements q {
    final /* synthetic */ C1086d $this_Box;
    final /* synthetic */ HomeUiState.Content.ContentHeader.CloseButtonColor $this_with;

    HomeScreenKt$HomeScreen$2$4$2$1(C1086d dVar, HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor) {
        this.$this_Box = dVar;
        this.$this_with = closeButtonColor;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C6496s.h(eVar, "$this$AnimatedVisibility");
        d.a(b.d(this.$this_Box.e(androidx.compose.foundation.layout.q.f(i.f23074a, 0.0f, 1, (Object) null), c.f23044a.e()), ColorExtensionsKt.toComposeColor(this.$this_with.getBackgroundColor(), this.$this_with.getBackgroundOpacity()), (g2) null, 2, (Object) null), mVar, 0);
    }
}
