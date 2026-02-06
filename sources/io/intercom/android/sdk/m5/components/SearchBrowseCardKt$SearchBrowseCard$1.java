package io.intercom.android.sdk.m5.components;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.W;
import C.Y;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import O0.g;
import Q0.T;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.P;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.n1;
import b1.j;
import b1.k;
import b1.t;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Collection;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import o0.C2342e;
import qf.C6658d;
import r0.C2544x0;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SearchBrowseCardKt$SearchBrowseCard$1 implements q {
    final /* synthetic */ boolean $accessToTeammateEnabled;
    final /* synthetic */ List<AvatarWrapper> $avatars;
    final /* synthetic */ Context $context;
    final /* synthetic */ HomeCards.HomeHelpCenterData $helpCenterData;
    final /* synthetic */ boolean $isSearchFirstEnabled;
    final /* synthetic */ MetricTracker $metricTracker;

    SearchBrowseCardKt$SearchBrowseCard$1(boolean z10, HomeCards.HomeHelpCenterData homeHelpCenterData, boolean z11, List<AvatarWrapper> list, MetricTracker metricTracker, Context context) {
        this.$isSearchFirstEnabled = z10;
        this.$helpCenterData = homeHelpCenterData;
        this.$accessToTeammateEnabled = z11;
        this.$avatars = list;
        this.$metricTracker = metricTracker;
        this.$context = context;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$7$lambda$0(MetricTracker metricTracker, Context context) {
        C6496s.h(metricTracker, "$metricTracker");
        C6496s.h(context, "$context");
        metricTracker.clickedSearchBrowseCard();
        context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, true));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$7$lambda$6$lambda$5$lambda$3(MetricTracker metricTracker, SuggestedArticle suggestedArticle, Context context) {
        C6496s.h(metricTracker, "$metricTracker");
        C6496s.h(suggestedArticle, "$it");
        C6496s.h(context, "$context");
        metricTracker.clickedArticleSuggestion(suggestedArticle.getId());
        context.startActivity(ArticleActivity.Companion.buildIntent(context, new ArticleActivity.ArticleActivityArguments(suggestedArticle.getId(), "search_browse_card", true, false, 8, (DefaultConstructorMarker) null)));
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        float f10;
        int i11;
        long j10;
        float f11;
        float f12;
        int i12;
        int i13;
        int i14;
        i iVar;
        C1500m mVar2;
        MetricTracker metricTracker;
        i iVar2;
        C1500m mVar3 = mVar;
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            boolean z10 = this.$isSearchFirstEnabled || !this.$helpCenterData.getSuggestedArticles().isEmpty();
            HomeCards.HomeHelpCenterData homeHelpCenterData = this.$helpCenterData;
            boolean z11 = this.$isSearchFirstEnabled;
            boolean z12 = this.$accessToTeammateEnabled;
            List<AvatarWrapper> list = this.$avatars;
            MetricTracker metricTracker2 = this.$metricTracker;
            Context context = this.$context;
            i.a aVar = i.f23074a;
            C1085c cVar = C1085c.f882a;
            C1085c.m g10 = cVar.g();
            c.a aVar2 = c.f23044a;
            F a10 = C1090h.a(g10, aVar2.k(), mVar3, 0);
            int a11 = C1494j.a(mVar3, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar3, aVar);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar3.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            if (z10) {
                f10 = c1.h.j((float) 8);
                i11 = 0;
            } else {
                i11 = 0;
                f10 = c1.h.j((float) 0);
            }
            float f13 = (float) i11;
            float j11 = c1.h.j(f13);
            float j12 = z10 ? c1.h.j((float) 8) : c1.h.j(f13);
            if (z10) {
                f13 = (float) 8;
            }
            i l10 = n.l(aVar, j12, f10, c1.h.j(f13), j11);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            i a14 = C2342e.a(l10, intercomTheme.getShapes(mVar3, i15).e());
            mVar3.T(343614299);
            if (z10) {
                j10 = C2544x0.o(intercomTheme.getColors(mVar3, i15).m700getPrimaryText0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            } else {
                j10 = C2544x0.f25560b.g();
            }
            mVar.M();
            i d10 = d.d(b.d(a14, j10, (g2) null, 2, (Object) null), false, (String) null, (g) null, new W0(metricTracker2, context), 7, (Object) null);
            F h10 = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int a15 = C1494j.a(mVar3, 0);
            C1523y p11 = mVar.p();
            i e11 = h.e(mVar3, d10);
            C6787a a16 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar3.U(a16);
            } else {
                mVar.q();
            }
            C1500m a17 = F1.a(mVar);
            F1.b(a17, h10, aVar3.c());
            F1.b(a17, p11, aVar3.e());
            p b11 = aVar3.b();
            if (a17.f() || !C6496s.c(a17.A(), Integer.valueOf(a15))) {
                a17.r(Integer.valueOf(a15));
                a17.V(Integer.valueOf(a15), b11);
            }
            F1.b(a17, e11, aVar3.d());
            f fVar = f.f12848a;
            i h11 = androidx.compose.foundation.layout.q.h(aVar, 0.0f, 1, (Object) null);
            float j13 = z10 ? c1.h.j((float) 8) : c1.h.j((float) 16);
            if (z10) {
                f11 = (float) 12;
            } else {
                f11 = (float) 20;
            }
            i j14 = n.j(h11, j13, c1.h.j(f11));
            F b12 = W.b(cVar.d(), aVar2.i(), mVar3, 54);
            int a18 = C1494j.a(mVar3, 0);
            C1523y p12 = mVar.p();
            i e12 = h.e(mVar3, j14);
            C6787a a19 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar3.U(a19);
            } else {
                mVar.q();
            }
            C1500m a20 = F1.a(mVar);
            F1.b(a20, b12, aVar3.c());
            F1.b(a20, p12, aVar3.e());
            p b13 = aVar3.b();
            if (a20.f() || !C6496s.c(a20.A(), Integer.valueOf(a18))) {
                a20.r(Integer.valueOf(a18));
                a20.V(Integer.valueOf(a18), b13);
            }
            F1.b(a20, e12, aVar3.d());
            Z z13 = Z.f873a;
            i.a aVar4 = aVar;
            MetricTracker metricTracker3 = metricTracker2;
            Context context2 = context;
            List<AvatarWrapper> list2 = list;
            boolean z14 = z12;
            boolean z15 = z11;
            int i16 = i15;
            IntercomTheme intercomTheme2 = intercomTheme;
            T0.b(M0.i.a(R.string.intercom_search_for_help, mVar3, 0), (i) null, 0, 0, (V0.n) null, V0.p.f8210b.d(), (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, (T) null, mVar, 196608, 0, 131038);
            int i17 = R.drawable.intercom_gif_search_icon;
            float f14 = (float) 16;
            C1500m mVar4 = mVar;
            int i18 = 0;
            V.a(e.c(i17, mVar4, 0), (String) null, n1.a(androidx.compose.foundation.layout.q.n(aVar4, c1.h.j(f14)), String.valueOf(i17)), intercomTheme2.getColors(mVar4, i16).m673getActionContrastWhite0d7_KjU(), mVar, 56, 0);
            mVar.u();
            mVar.u();
            List<SuggestedArticle> suggestedArticles = homeHelpCenterData.getSuggestedArticles();
            mVar4.T(343677342);
            Collection collection = suggestedArticles;
            int i19 = 2;
            int i20 = 6;
            if (!collection.isEmpty()) {
                F a21 = C1090h.a(cVar.g(), aVar2.k(), mVar4, 0);
                int a22 = C1494j.a(mVar4, 0);
                C1523y p13 = mVar.p();
                i e13 = h.e(mVar4, aVar4);
                C6787a a23 = aVar3.a();
                if (mVar.j() == null) {
                    C1494j.c();
                }
                mVar.F();
                if (mVar.f()) {
                    mVar4.U(a23);
                } else {
                    mVar.q();
                }
                C1500m a24 = F1.a(mVar);
                F1.b(a24, a21, aVar3.c());
                F1.b(a24, p13, aVar3.e());
                p b14 = aVar3.b();
                if (a24.f() || !C6496s.c(a24.A(), Integer.valueOf(a22))) {
                    a24.r(Integer.valueOf(a22));
                    a24.V(Integer.valueOf(a22), b14);
                }
                F1.b(a24, e13, aVar3.d());
                mVar4.T(-562735944);
                if (!collection.isEmpty()) {
                    metricTracker = metricTracker3;
                    iVar2 = null;
                    P.g("", new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(metricTracker, suggestedArticles, (C6658d<? super SearchBrowseCardKt$SearchBrowseCard$1$1$3$1>) null), mVar4, 70);
                } else {
                    metricTracker = metricTracker3;
                    iVar2 = null;
                }
                mVar.M();
                mVar4.T(-562722162);
                int i21 = 0;
                for (Object next : suggestedArticles) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        C6565s.x();
                    }
                    SuggestedArticle suggestedArticle = (SuggestedArticle) next;
                    mVar4.T(-562722315);
                    if (i21 == 0) {
                        a0.a(androidx.compose.foundation.layout.q.i(i.f23074a, c1.h.j((float) 4)), mVar4, i20);
                    }
                    mVar.M();
                    i.a aVar5 = i.f23074a;
                    Context context3 = context2;
                    float f15 = (float) 4;
                    i a25 = n1.a(n.m(d.d(androidx.compose.foundation.layout.q.h(aVar5, 0.0f, 1, iVar2), false, (String) null, (g) null, new X0(metricTracker, suggestedArticle, context3), 7, (Object) null), c1.h.j(f14), c1.h.j(f15), 0.0f, c1.h.j(f15), 4, (Object) null), "suggested article");
                    F b15 = W.b(C1085c.f882a.f(), c.f23044a.i(), mVar4, 48);
                    int a26 = C1494j.a(mVar4, i18);
                    C1523y p14 = mVar.p();
                    i e14 = h.e(mVar4, a25);
                    C1241g.a aVar6 = C1241g.f3853J;
                    C6787a a27 = aVar6.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar4.U(a27);
                    } else {
                        mVar.q();
                    }
                    C1500m a28 = F1.a(mVar);
                    F1.b(a28, b15, aVar6.c());
                    F1.b(a28, p14, aVar6.e());
                    p b16 = aVar6.b();
                    if (a28.f() || !C6496s.c(a28.A(), Integer.valueOf(a26))) {
                        a28.r(Integer.valueOf(a26));
                        a28.V(Integer.valueOf(a26), b16);
                    }
                    F1.b(a28, e14, aVar6.d());
                    Context context4 = context3;
                    float f16 = f14;
                    T0.b(suggestedArticle.getTitle(), Y.b(Z.f873a, aVar5, 1.0f, false, 2, (Object) null), 0, 0, (V0.n) null, V0.p.f8210b.c(), (V0.h) null, 0, (k) null, (j) null, 0, t.f19154a.b(), false, 2, 0, (C6798l) null, (T) null, mVar, 196608, 3120, 120796);
                    i.a aVar7 = aVar5;
                    C1500m mVar5 = mVar;
                    IntercomChevronKt.IntercomChevron(n.k(aVar7, c1.h.j((float) 20), 0.0f, 2, (Object) null), mVar5, 6, 0);
                    mVar.u();
                    a0.a(androidx.compose.foundation.layout.q.i(aVar7, c1.h.j(f16)), mVar5, 6);
                    mVar4 = mVar5;
                    iVar2 = null;
                    i19 = 2;
                    i18 = 0;
                    i20 = 6;
                    i21 = i22;
                    context2 = context4;
                    metricTracker = metricTracker;
                    f14 = f16;
                }
                iVar = iVar2;
                i12 = i20;
                i14 = i19;
                i13 = i18;
                f12 = f14;
                mVar2 = mVar4;
                mVar.M();
                mVar.u();
            } else {
                i12 = 6;
                i14 = 2;
                i13 = 0;
                f12 = f14;
                mVar2 = mVar4;
                iVar = null;
            }
            mVar.M();
            mVar2.T(343755210);
            if (z15 && z14) {
                mVar2.T(343757346);
                if (!collection.isEmpty()) {
                    IntercomDividerKt.IntercomDivider(n.k(i.f23074a, c1.h.j(f12), 0.0f, i14, iVar), mVar2, i12, i13);
                }
                mVar.M();
                TeamPresenceRowKt.TeamPresenceRow(iVar, list2, mVar2, 64, 1);
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
