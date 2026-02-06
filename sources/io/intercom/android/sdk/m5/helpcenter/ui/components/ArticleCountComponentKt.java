package io.intercom.android.sdk.m5.helpcenter.ui.components;

import V.B0;
import V.T0;
import V0.h;
import V0.n;
import V0.p;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.Phrase;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.C2550z0;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lk0/i;", "modifier", "", "count", "Llf/M;", "ArticleCountComponent", "(Lk0/i;ILY/m;II)V", "ArticleCountComponentPreview", "(LY/m;I)V", "SingleArticleCountComponentPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ArticleCountComponentKt {
    public static final void ArticleCountComponent(i iVar, int i10, C1500m mVar, int i11, int i12) {
        int i13;
        i iVar2;
        int i14;
        i.a aVar;
        CharSequence charSequence;
        int i15;
        int i16 = i10;
        int i17 = i11;
        int i18 = i12;
        C1500m h10 = mVar.h(-731744304);
        int i19 = i18 & 1;
        if (i19 != 0) {
            i13 = i17 | 6;
            iVar2 = iVar;
        } else if ((i17 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i17;
        } else {
            iVar2 = iVar;
            i13 = i17;
        }
        if ((i18 & 2) != 0) {
            i13 |= 48;
        } else if ((i17 & 112) == 0) {
            if (h10.d(i16)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        int i20 = i13;
        if ((i20 & 91) != 18 || !h10.i()) {
            if (i19 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            if (i16 == 1) {
                h10.T(1038713318);
                charSequence = Phrase.from((Context) h10.m(AndroidCompositionLocals_androidKt.g()), R.string.intercom_single_article).format();
                h10.M();
            } else {
                h10.T(1038811929);
                charSequence = Phrase.from((Context) h10.m(AndroidCompositionLocals_androidKt.g()), R.string.intercom_multiple_articles).put("total_articles", i16).format();
                h10.M();
            }
            iVar2 = aVar;
            T0.b(charSequence.toString(), iVar2, C2550z0.d(4285887861L), 0, (n) null, (p) null, (h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(h10, IntercomTheme.$stable).getType04Point5(), h10, ((i20 << 3) & 112) | 384, 0, 65528);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6198a(iVar2, i16, i17, i18));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleCountComponent$lambda$0(i iVar, int i10, int i11, int i12, C1500m mVar, int i13) {
        ArticleCountComponent(iVar, i10, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void ArticleCountComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1155458330);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m342getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6200c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleCountComponentPreview$lambda$1(int i10, C1500m mVar, int i11) {
        ArticleCountComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void SingleArticleCountComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1795936462);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ArticleCountComponentKt.INSTANCE.m343getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6199b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SingleArticleCountComponentPreview$lambda$2(int i10, C1500m mVar, int i11) {
        SingleArticleCountComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
