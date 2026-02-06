package io.intercom.android.sdk.helpcenter.search;

import D.x;
import Y.C1500m;
import android.content.Context;
import g0.c;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1 implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ C6798l $onArticleClicked;
    final /* synthetic */ C6787a $onClearSearchClick;
    final /* synthetic */ ArticleSearchState $state;

    IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1(ArticleSearchState articleSearchState, C6798l lVar, C6787a aVar, Context context) {
        this.$state = articleSearchState;
        this.$onArticleClicked = lVar;
        this.$onClearSearchClick = aVar;
        this.$context = context;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(ArticleSearchState articleSearchState, C6798l lVar, x xVar) {
        C6496s.h(articleSearchState, "$state");
        C6496s.h(lVar, "$onArticleClicked");
        C6496s.h(xVar, "$this$LazyColumn");
        x.e(xVar, ((ArticleSearchState.Content) articleSearchState).getSearchResults().size(), (C6798l) null, (C6798l) null, c.c(-1650909594, true, new IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$1$1$1(articleSearchState, lVar)), 6, (Object) null);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(Y.C1500m r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r14 = r29
            r1 = r30 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0015
            boolean r1 = r29.i()
            if (r1 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r29.I()
            goto L_0x0224
        L_0x0015:
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState r1 = r0.$state
            boolean r2 = r1 instanceof io.intercom.android.sdk.helpcenter.search.ArticleSearchState.Content
            if (r2 == 0) goto L_0x007d
            r1 = 484447755(0x1ce0160b, float:1.4828775E-21)
            r14.T(r1)
            k0.i$a r2 = k0.i.f23074a
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r14, r3)
            long r3 = r1.m678getBackground0d7_KjU()
            r6 = 2
            r7 = 0
            r5 = 0
            k0.i r1 = androidx.compose.foundation.b.d(r2, r3, r5, r6, r7)
            r2 = 154178788(0x93094e4, float:2.1255237E-33)
            r14.T(r2)
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState r2 = r0.$state
            boolean r2 = r14.S(r2)
            yf.l r3 = r0.$onArticleClicked
            boolean r3 = r14.S(r3)
            r2 = r2 | r3
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState r3 = r0.$state
            yf.l r4 = r0.$onArticleClicked
            java.lang.Object r5 = r29.A()
            if (r2 != 0) goto L_0x005b
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x0063
        L_0x005b:
            io.intercom.android.sdk.helpcenter.search.n r5 = new io.intercom.android.sdk.helpcenter.search.n
            r5.<init>(r3, r4)
            r14.r(r5)
        L_0x0063:
            r9 = r5
            yf.l r9 = (yf.C6798l) r9
            r29.M()
            r11 = 0
            r12 = 254(0xfe, float:3.56E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = r29
            D.C1109b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r29.M()
            goto L_0x0224
        L_0x007d:
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState$Error r2 = io.intercom.android.sdk.helpcenter.search.ArticleSearchState.Error.INSTANCE
            boolean r2 = kotlin.jvm.internal.C6496s.c(r1, r2)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x00aa
            r1 = 485142124(0x1ceaae6c, float:1.5529908E-21)
            r14.T(r1)
            io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r1 = new io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA
            r11 = 7
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            k0.i$a r2 = k0.i.f23074a
            k0.i r2 = androidx.compose.foundation.layout.q.f(r2, r5, r4, r3)
            r3 = 48
            io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt.HelpCenterErrorScreen(r1, r2, r14, r3, r6)
            r29.M()
            goto L_0x0224
        L_0x00aa:
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState$Initial r2 = io.intercom.android.sdk.helpcenter.search.ArticleSearchState.Initial.INSTANCE
            boolean r2 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r2 == 0) goto L_0x00c2
            r1 = 485341516(0x1cedb94c, float:1.5731243E-21)
            r14.T(r1)
            r29.M()
            yf.a r1 = r0.$onClearSearchClick
            r1.invoke()
            goto L_0x0224
        L_0x00c2:
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState$Loading r2 = io.intercom.android.sdk.helpcenter.search.ArticleSearchState.Loading.INSTANCE
            boolean r2 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r2 == 0) goto L_0x00df
            r1 = 485420287(0x1ceeecff, float:1.5810781E-21)
            r14.T(r1)
            k0.i$a r1 = k0.i.f23074a
            k0.i r1 = androidx.compose.foundation.layout.q.f(r1, r5, r4, r3)
            r2 = 6
            io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(r1, r14, r2, r6)
            r29.M()
            goto L_0x0224
        L_0x00df:
            boolean r2 = r1 instanceof io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResults
            if (r2 != 0) goto L_0x00f7
            boolean r1 = r1 instanceof io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResultsNoTeamHelp
            if (r1 == 0) goto L_0x00e8
            goto L_0x00f7
        L_0x00e8:
            r1 = 154175038(0x930863e, float:2.124835E-33)
            r14.T(r1)
            r29.M()
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x00f7:
            r1 = 485632916(0x1cf22b94, float:1.6025481E-21)
            r14.T(r1)
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState r1 = r0.$state
            boolean r2 = r1 instanceof io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResults
            if (r2 == 0) goto L_0x010a
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState$NoResults r1 = (io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResults) r1
            java.lang.String r1 = r1.getSearchTerm()
            goto L_0x0117
        L_0x010a:
            boolean r2 = r1 instanceof io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResultsNoTeamHelp
            if (r2 == 0) goto L_0x0115
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState$NoResultsNoTeamHelp r1 = (io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResultsNoTeamHelp) r1
            java.lang.String r1 = r1.getSearchTerm()
            goto L_0x0117
        L_0x0115:
            java.lang.String r1 = ""
        L_0x0117:
            android.content.Context r2 = r0.$context
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState r15 = r0.$state
            k0.i$a r7 = k0.i.f23074a
            C.c r8 = C.C1085c.f882a
            C.c$m r8 = r8.g()
            k0.c$a r9 = k0.c.f23044a
            k0.c$b r9 = r9.k()
            H0.F r8 = C.C1090h.a(r8, r9, r14, r6)
            int r6 = Y.C1494j.a(r14, r6)
            Y.y r9 = r29.p()
            k0.i r10 = k0.h.e(r14, r7)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r12 = r11.a()
            Y.f r13 = r29.j()
            if (r13 != 0) goto L_0x0148
            Y.C1494j.c()
        L_0x0148:
            r29.F()
            boolean r13 = r29.f()
            if (r13 == 0) goto L_0x0155
            r14.U(r12)
            goto L_0x0158
        L_0x0155:
            r29.q()
        L_0x0158:
            Y.m r12 = Y.F1.a(r29)
            yf.p r13 = r11.c()
            Y.F1.b(r12, r8, r13)
            yf.p r8 = r11.e()
            Y.F1.b(r12, r9, r8)
            yf.p r8 = r11.b()
            boolean r9 = r12.f()
            if (r9 != 0) goto L_0x0182
            java.lang.Object r9 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 != 0) goto L_0x0190
        L_0x0182:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r12.r(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12.V(r6, r8)
        L_0x0190:
            yf.p r6 = r11.d()
            Y.F1.b(r12, r10, r6)
            C.k r6 = C.C1093k.f978a
            Q0.d r1 = io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt.getNoResultsMessage(r2, r1)
            k0.i r16 = androidx.compose.foundation.layout.q.h(r7, r5, r4, r3)
            r2 = 32
            float r2 = (float) r2
            float r18 = c1.h.j(r2)
            r2 = 20
            float r2 = (float) r2
            float r17 = c1.h.j(r2)
            float r19 = c1.h.j(r2)
            r21 = 8
            r22 = 0
            r20 = 0
            k0.i r2 = androidx.compose.foundation.layout.n.m(r16, r17, r18, r19, r20, r21, r22)
            b1.j$a r3 = b1.j.f19110b
            int r7 = r3.a()
            io.intercom.android.sdk.ui.theme.IntercomTheme r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r14, r4)
            long r3 = r3.m700getPrimaryText0d7_KjU()
            r5 = 16
            long r5 = c1.w.f(r5)
            b1.j r13 = b1.j.h(r7)
            r25 = 0
            r26 = 261616(0x3fdf0, float:3.66602E-40)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r27 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 3072(0xc00, float:4.305E-42)
            r23 = r29
            V.T0.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 145075595(0x8a5ad8b, float:9.971376E-34)
            r7 = r29
            r7.T(r1)
            r1 = r27
            boolean r2 = r1 instanceof io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResults
            if (r2 == 0) goto L_0x021b
            r15 = r1
            io.intercom.android.sdk.helpcenter.search.ArticleSearchState$NoResults r15 = (io.intercom.android.sdk.helpcenter.search.ArticleSearchState.NoResults) r15
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r1 = r15.getTeamPresenceState()
            r5 = 0
            r6 = 6
            r2 = 0
            r3 = 0
            r4 = r29
            io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt.TeamPresenceComponent(r1, r2, r3, r4, r5, r6)
        L_0x021b:
            r29.M()
            r29.u()
            r29.M()
        L_0x0224:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1.invoke(Y.m, int):void");
    }
}
