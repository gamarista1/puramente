package io.intercom.android.sdk.helpcenter.search;

import Q0.C;
import Q0.C1321d;
import Q0.z;
import Sg.p;
import V.O0;
import V0.h;
import V0.n;
import V0.o;
import X0.e;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C1869a;
import b1.k;
import g0.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.e2;
import r0.g2;
import t0.C2606g;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "state", "Lkotlin/Function0;", "Llf/M;", "onClearSearchClick", "Lkotlin/Function1;", "", "onArticleClicked", "IntercomArticleSearchScreen", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;Lyf/a;Lyf/l;LY/m;I)V", "Landroid/content/Context;", "context", "searchTerm", "LQ0/d;", "getNoResultsMessage", "(Landroid/content/Context;Ljava/lang/String;)LQ0/d;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomArticleSearchScreenKt {
    public static final void IntercomArticleSearchScreen(ArticleSearchState articleSearchState, C6787a aVar, C6798l lVar, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        ArticleSearchState articleSearchState2 = articleSearchState;
        C6787a aVar2 = aVar;
        C6798l lVar2 = lVar;
        int i15 = i10;
        C6496s.h(articleSearchState2, "state");
        C6496s.h(aVar2, "onClearSearchClick");
        C6496s.h(lVar2, "onArticleClicked");
        C1500m h10 = mVar.h(-1211464960);
        if ((i15 & 14) == 0) {
            if (h10.S(articleSearchState2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i15;
        } else {
            i11 = i15;
        }
        if ((i15 & 112) == 0) {
            if (h10.C(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i15 & 896) == 0) {
            if (h10.C(lVar2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) != 146 || !h10.i()) {
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            long r82 = intercomTheme.getColors(h10, i16).m678getBackground0d7_KjU();
            long r10 = intercomTheme.getColors(h10, i16).m700getPrimaryText0d7_KjU();
            O0.a((i) null, (g2) null, r82, r10, 0.0f, 0.0f, (C2868g) null, c.e(1420291739, true, new IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1(articleSearchState2, lVar2, aVar2, (Context) h10.m(AndroidCompositionLocals_androidKt.g())), h10, 54), h10, 12582912, 115);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new m(articleSearchState2, aVar2, lVar2, i15));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomArticleSearchScreen$lambda$0(ArticleSearchState articleSearchState, C6787a aVar, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(articleSearchState, "$state");
        C6496s.h(aVar, "$onClearSearchClick");
        C6496s.h(lVar, "$onArticleClicked");
        IntercomArticleSearchScreen(articleSearchState, aVar, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public static final C1321d getNoResultsMessage(Context context, String str) {
        String str2 = '\'' + str + '\'';
        String string = context.getString(R.string.intercom_no_results_for_searchterm);
        C6496s.g(string, "getString(...)");
        String D10 = p.D(string, "{searchTerm}", str2, false, 4, (Object) null);
        C1321d.a aVar = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
        int b02 = p.b0(D10, str2, 0, false, 6, (Object) null);
        String substring = D10.substring(0, b02);
        C6496s.g(substring, "substring(...)");
        aVar.h(substring);
        int m10 = aVar.m(new C(0, 0, V0.p.f8210b.a(), (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65531, (DefaultConstructorMarker) null));
        try {
            String substring2 = D10.substring(b02, str2.length() + b02);
            C6496s.g(substring2, "substring(...)");
            aVar.h(substring2);
            C6514M m11 = C6514M.f71813a;
            aVar.j(m10);
            String substring3 = D10.substring(b02 + str2.length());
            C6496s.g(substring3, "substring(...)");
            aVar.h(substring3);
            return aVar.n();
        } catch (Throwable th2) {
            aVar.j(m10);
            throw th2;
        }
    }
}
