package io.intercom.android.sdk.m5.conversation.ui.components.row;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import Q0.A;
import Q0.T;
import V.B0;
import V.T0;
import V0.o;
import X0.e;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.q;
import b1.s;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.e2;
import r0.g2;
import t0.C2606g;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/models/Part;", "part", "Llf/M;", "AskedAboutRow", "(Lk0/i;Lio/intercom/android/sdk/models/Part;LY/m;II)V", "AskedAboutRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AskedAboutRowKt {
    public static final void AskedAboutRow(i iVar, Part part, C1500m mVar, int i10, int i11) {
        i.a aVar;
        Part part2 = part;
        int i12 = i11;
        C6496s.h(part2, "part");
        C1500m h10 = mVar.h(1277406973);
        if ((i12 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        i k10 = n.k(aVar, h.j((float) 16), 0.0f, 2, (Object) null);
        C1085c.m g10 = C1085c.f882a.g();
        c.a aVar2 = c.f23044a;
        F a10 = C1090h.a(g10, aVar2.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, k10);
        C1241g.a aVar3 = C1241g.f3853J;
        C6787a a12 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a12);
        } else {
            h10.q();
        }
        C1500m a13 = F1.a(h10);
        F1.b(a13, a10, aVar3.c());
        F1.b(a13, p10, aVar3.e());
        p b10 = aVar3.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar3.d());
        C1093k kVar = C1093k.f978a;
        String a14 = M0.i.a(R.string.intercom_asked_about, h10, 0);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        T c10 = T.c(intercomTheme.getTypography(h10, i13).getType04Point5(), intercomTheme.getColors(h10, i13).m686getDescriptionText0d7_KjU(), 0, (V0.p) null, (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, j.f19110b.a(), 0, 0, (q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16744446, (Object) null);
        i.a aVar4 = i.f23074a;
        i.a aVar5 = aVar4;
        Context context2 = context;
        i iVar2 = aVar;
        T0.b(a14, n.m(kVar.b(aVar4, aVar2.g()), 0.0f, 0.0f, 0.0f, h.j((float) 8), 7, (Object) null), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, c10, h10, 0, 0, 65532);
        List<Block> blocks = part.getBlocks();
        C6496s.g(blocks, "getBlocks(...)");
        Block block = (Block) C6565s.q0(blocks);
        h10.T(-1827593873);
        if (block != null) {
            i h11 = androidx.compose.foundation.layout.q.h(aVar5, 0.0f, 1, (Object) null);
            IntercomCardStyle.Style r62 = IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, h10, IntercomCardStyle.$stable << 15, 31);
            IntercomCardKt.IntercomCard(new C6128a(context2, block), h11, false, r62, (l) null, g0.c.e(-1866574392, true, new AskedAboutRowKt$AskedAboutRow$1$1$2(block), h10, 54), h10, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
        }
        h10.M();
        h10.u();
        Y0 k11 = h10.k();
        if (k11 != null) {
            k11.a(new C6130b(iVar2, part2, i10, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AskedAboutRow$lambda$2$lambda$1$lambda$0(Context context, Block block) {
        C6496s.h(context, "$context");
        C6496s.h(block, "$it");
        ArticleActivity.Companion companion = ArticleActivity.Companion;
        String articleId = block.getArticleId();
        C6496s.g(articleId, "getArticleId(...)");
        context.startActivity(companion.buildIntent(context, new ArticleActivity.ArticleActivityArguments(articleId, "conversation", false, true)));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M AskedAboutRow$lambda$3(i iVar, Part part, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(part, "$part");
        AskedAboutRow(iVar, part, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void AskedAboutRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(97963709);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$AskedAboutRowKt.INSTANCE.m282getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6132c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M AskedAboutRowPreview$lambda$4(int i10, C1500m mVar, int i11) {
        AskedAboutRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
