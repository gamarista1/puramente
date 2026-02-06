package io.intercom.android.sdk.survey.block;

import Q0.A;
import Q0.C;
import Q0.L;
import Q0.T;
import V.B0;
import V.T0;
import V0.o;
import V0.p;
import X0.e;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.q;
import b1.s;
import c1.h;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.Map;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import r0.C2550z0;
import r0.e2;
import r0.g2;
import t0.C2606g;
import w1.b;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/blocks/lib/models/Block;", "block", "Lk0/i;", "modifier", "Lkotlin/Function1;", "LQ0/L;", "Llf/M;", "onLayoutResult", "CodeBlock", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Lk0/i;Lyf/l;LY/m;II)V", "CodeBlockPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CodeBlockKt {
    public static final void CodeBlock(Block block, i iVar, C6798l lVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        C6277m mVar2;
        C6496s.h(block, "block");
        C1500m h10 = mVar.h(-1370899294);
        if ((i11 & 2) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            mVar2 = new C6277m();
        } else {
            mVar2 = lVar;
        }
        Spanned a10 = b.a(block.getText(), 0);
        C6496s.g(a10, "fromHtml(...)");
        i iVar2 = aVar;
        C6798l lVar2 = mVar2;
        T0.c(BlockExtensionsKt.toAnnotatedString$default(a10, (Context) h10.m(AndroidCompositionLocals_androidKt.g()), (C) null, 2, (Object) null), androidx.compose.foundation.b.d(n.j(aVar, h.j((float) 16), h.j((float) 12)), C2550z0.d(4285098354L), (g2) null, 2, (Object) null), C2544x0.f25560b.i(), 0, (V0.n) null, (p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (Map) null, lVar2, T.c(IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04(), 0, 0, (p) null, (V0.n) null, (o) null, V0.h.f8176b.b(), (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777183, (Object) null), h10, 384, (i10 << 12) & 3670016, 65528);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new n(block, iVar2, mVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CodeBlock$lambda$0(L l10) {
        C6496s.h(l10, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M CodeBlock$lambda$1(Block block, i iVar, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(block, "$block");
        CodeBlock(block, iVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void CodeBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1610207419);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CodeBlockKt.INSTANCE.m448getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6276l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CodeBlockPreview$lambda$2(int i10, C1500m mVar, int i11) {
        CodeBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
