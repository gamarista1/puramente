package io.intercom.android.sdk.helpcenter.articles;

import C.N;
import C.f0;
import C.i0;
import C.l0;
import U8.b;
import Ug.K;
import V.B0;
import V.C1415x0;
import Y.C1500m;
import Y.P;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import g0.C2005a;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomTopBarIcon;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ApplyStatusBarColorKt;
import java.util.Map;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import r0.g2;
import rf.C6680b;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomArticleActivity$onCreate$1 implements p {
    final /* synthetic */ IntercomArticleActivity this$0;

    IntercomArticleActivity$onCreate$1(IntercomArticleActivity intercomArticleActivity) {
        this.this$0 = intercomArticleActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            final IntercomArticleActivity intercomArticleActivity = this.this$0;
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-199442729, true, new p() {

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
                @f(c = "io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1", f = "IntercomArticleActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1  reason: invalid class name */
                static final class AnonymousClass1 extends l implements p {
                    int label;

                    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
                        return new AnonymousClass1(intercomArticleActivity, dVar);
                    }

                    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
                        return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C6680b.f();
                        if (this.label == 0) {
                            w.b(obj);
                            intercomArticleActivity.getViewModel().fragmentLoaded(intercomArticleActivity.getArguments().getArticleId());
                            return C6514M.f71813a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    C1500m mVar2 = mVar;
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        b e10 = U8.c.e((Window) null, mVar2, 0, 1);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        ApplyStatusBarColorKt.m710applyStatusBarColor4WTKRHQ(e10, intercomTheme.getColors(mVar2, i11).m678getBackground0d7_KjU());
                        C6514M m10 = C6514M.f71813a;
                        final IntercomArticleActivity intercomArticleActivity = intercomArticleActivity;
                        P.g(m10, new AnonymousClass1((C6658d<? super AnonymousClass1>) null), mVar2, 70);
                        i d10 = i0.d(androidx.compose.foundation.b.d(i.f23074a, intercomTheme.getColors(mVar2, i11).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null), l0.b(f0.f925a, mVar2, 8));
                        final IntercomArticleActivity intercomArticleActivity2 = intercomArticleActivity;
                        C2005a e11 = c.e(547021723, true, new p() {
                            /* access modifiers changed from: private */
                            public static final C6514M invoke$lambda$0(IntercomArticleActivity intercomArticleActivity) {
                                C6496s.h(intercomArticleActivity, "this$0");
                                intercomArticleActivity.finish();
                                return C6514M.f71813a;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1500m) obj, ((Number) obj2).intValue());
                                return C6514M.f71813a;
                            }

                            public final void invoke(C1500m mVar, int i10) {
                                if ((i10 & 11) != 2 || !mVar.i()) {
                                    IntercomTopBarIcon intercomTopBarIcon = new IntercomTopBarIcon(R.drawable.intercom_ic_close, (String) null, new x(intercomArticleActivity2));
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    int i11 = IntercomTheme.$stable;
                                    IntercomTopBarKt.m602IntercomTopBarbogVsAg((i) null, (String) null, intercomTopBarIcon, (c.b) null, intercomTheme.getColors(mVar, i11).m678getBackground0d7_KjU(), intercomTheme.getColors(mVar, i11).m700getPrimaryText0d7_KjU(), (C6787a) null, (q) null, mVar, IntercomTopBarIcon.$stable << 6, 203);
                                    return;
                                }
                                mVar.I();
                            }
                        }, mVar2, 54);
                        final IntercomArticleActivity intercomArticleActivity3 = intercomArticleActivity;
                        C1415x0.a(d10, e11, (p) null, (p) null, (p) null, 0, 0, 0, (f0) null, g0.c.e(-494666138, true, new q() {
                            /* access modifiers changed from: private */
                            public static final WebView invoke$lambda$7$lambda$2(String str, IntercomArticleActivity intercomArticleActivity, Map map, Context context) {
                                C6496s.h(str, "$articleUrl");
                                C6496s.h(intercomArticleActivity, "this$0");
                                C6496s.h(map, "$headers");
                                C6496s.h(context, "it");
                                WebView webView = new WebView(context);
                                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                ArticleWebViewClient articleWebViewClient = new ArticleWebViewClient(str, new IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(intercomArticleActivity, webView), Injector.get().getAppConfigProvider().get().getHelpCenterUrls());
                                webView.getSettings().setJavaScriptEnabled(true);
                                webView.setWebViewClient(articleWebViewClient);
                                intercomArticleActivity.setCookies();
                                webView.loadUrl(str, map);
                                return webView;
                            }

                            /* access modifiers changed from: private */
                            public static final C6514M invoke$lambda$7$lambda$3(WebView webView) {
                                C6496s.h(webView, "it");
                                return C6514M.f71813a;
                            }

                            /* access modifiers changed from: private */
                            public static final C6514M invoke$lambda$7$lambda$4(IntercomArticleActivity intercomArticleActivity) {
                                C6496s.h(intercomArticleActivity, "this$0");
                                intercomArticleActivity.getViewModel().sadReactionTapped();
                                return C6514M.f71813a;
                            }

                            /* access modifiers changed from: private */
                            public static final C6514M invoke$lambda$7$lambda$5(IntercomArticleActivity intercomArticleActivity) {
                                C6496s.h(intercomArticleActivity, "this$0");
                                intercomArticleActivity.getViewModel().neutralReactionTapped();
                                return C6514M.f71813a;
                            }

                            /* access modifiers changed from: private */
                            public static final C6514M invoke$lambda$7$lambda$6(IntercomArticleActivity intercomArticleActivity) {
                                C6496s.h(intercomArticleActivity, "this$0");
                                intercomArticleActivity.getViewModel().happyReactionTapped();
                                return C6514M.f71813a;
                            }

                            /* access modifiers changed from: private */
                            public static final C6514M invoke$lambda$8(IntercomArticleActivity intercomArticleActivity) {
                                C6496s.h(intercomArticleActivity, "this$0");
                                intercomArticleActivity.getViewModel().fragmentLoaded(intercomArticleActivity.getArguments().getArticleId());
                                return C6514M.f71813a;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
                                return C6514M.f71813a;
                            }

                            /* JADX WARNING: type inference failed for: r3v8, types: [io.intercom.android.sdk.m5.components.ErrorState] */
                            /* JADX WARNING: type inference failed for: r19v1, types: [io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA] */
                            /* JADX WARNING: type inference failed for: r11v2, types: [io.intercom.android.sdk.m5.components.ErrorState$WithCTA] */
                            /* JADX WARNING: Multi-variable type inference failed */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void invoke(C.N r26, Y.C1500m r27, int r28) {
                                /*
                                    r25 = this;
                                    r0 = r25
                                    r1 = r26
                                    r9 = r27
                                    java.lang.String r2 = "paddingValues"
                                    kotlin.jvm.internal.C6496s.h(r1, r2)
                                    r2 = r28 & 14
                                    if (r2 != 0) goto L_0x001b
                                    boolean r2 = r9.S(r1)
                                    if (r2 == 0) goto L_0x0017
                                    r2 = 4
                                    goto L_0x0018
                                L_0x0017:
                                    r2 = 2
                                L_0x0018:
                                    r2 = r28 | r2
                                    goto L_0x001d
                                L_0x001b:
                                    r2 = r28
                                L_0x001d:
                                    r2 = r2 & 91
                                    r3 = 18
                                    if (r2 != r3) goto L_0x002f
                                    boolean r2 = r27.i()
                                    if (r2 != 0) goto L_0x002a
                                    goto L_0x002f
                                L_0x002a:
                                    r27.I()
                                    goto L_0x01f3
                                L_0x002f:
                                    io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity r2 = r6
                                    io.intercom.android.sdk.helpcenter.articles.ArticleViewModel r2 = r2.getViewModel()
                                    Xg.L r2 = r2.getState()
                                    r3 = 8
                                    r7 = 0
                                    r8 = 1
                                    Y.A1 r2 = Y.p1.b(r2, r7, r9, r3, r8)
                                    java.lang.Object r2 = r2.getValue()
                                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState r2 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState) r2
                                    boolean r3 = r2 instanceof io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Initial
                                    r10 = 0
                                    if (r3 == 0) goto L_0x0062
                                    r2 = 2087418970(0x7c6b7c5a, float:4.8908476E36)
                                    r9.T(r2)
                                    k0.i$a r2 = k0.i.f23074a
                                    k0.i r1 = androidx.compose.foundation.layout.n.h(r2, r1)
                                    int r2 = io.intercom.android.sdk.R.drawable.intercom_article_webview_loading_state
                                    io.intercom.android.sdk.m5.components.LoadingScreenKt.LoadingScreen(r1, r2, r9, r10, r10)
                                    r27.M()
                                    goto L_0x01f3
                                L_0x0062:
                                    boolean r3 = r2 instanceof io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Content
                                    if (r3 == 0) goto L_0x01a3
                                    r3 = 2087918256(0x7c731ab0, float:5.0490777E36)
                                    r9.T(r3)
                                    androidx.compose.foundation.o r12 = androidx.compose.foundation.m.a(r10, r9, r10, r8)
                                    k0.i$a r6 = k0.i.f23074a
                                    k0.i r11 = androidx.compose.foundation.layout.n.h(r6, r1)
                                    r16 = 14
                                    r17 = 0
                                    r13 = 0
                                    r14 = 0
                                    r15 = 0
                                    k0.i r1 = androidx.compose.foundation.m.d(r11, r12, r13, r14, r15, r16, r17)
                                    r11 = 0
                                    k0.i r12 = androidx.compose.foundation.layout.q.f(r1, r11, r8, r7)
                                    io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
                                    int r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
                                    io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r9, r3)
                                    long r13 = r1.m678getBackground0d7_KjU()
                                    r16 = 2
                                    r15 = 0
                                    k0.i r1 = androidx.compose.foundation.b.d(r12, r13, r15, r16, r17)
                                    io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity r12 = r6
                                    C.c r3 = C.C1085c.f882a
                                    C.c$m r3 = r3.g()
                                    k0.c$a r4 = k0.c.f23044a
                                    k0.c$b r4 = r4.k()
                                    H0.F r3 = C.C1090h.a(r3, r4, r9, r10)
                                    int r4 = Y.C1494j.a(r9, r10)
                                    Y.y r5 = r27.p()
                                    k0.i r1 = k0.h.e(r9, r1)
                                    J0.g$a r13 = J0.C1241g.f3853J
                                    yf.a r14 = r13.a()
                                    Y.f r15 = r27.j()
                                    if (r15 != 0) goto L_0x00c6
                                    Y.C1494j.c()
                                L_0x00c6:
                                    r27.F()
                                    boolean r15 = r27.f()
                                    if (r15 == 0) goto L_0x00d3
                                    r9.U(r14)
                                    goto L_0x00d6
                                L_0x00d3:
                                    r27.q()
                                L_0x00d6:
                                    Y.m r14 = Y.F1.a(r27)
                                    yf.p r15 = r13.c()
                                    Y.F1.b(r14, r3, r15)
                                    yf.p r3 = r13.e()
                                    Y.F1.b(r14, r5, r3)
                                    yf.p r3 = r13.b()
                                    boolean r5 = r14.f()
                                    if (r5 != 0) goto L_0x0100
                                    java.lang.Object r5 = r14.A()
                                    java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
                                    boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r15)
                                    if (r5 != 0) goto L_0x010e
                                L_0x0100:
                                    java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                                    r14.r(r5)
                                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                                    r14.V(r4, r3)
                                L_0x010e:
                                    yf.p r3 = r13.d()
                                    Y.F1.b(r14, r1, r3)
                                    C.k r1 = C.C1093k.f978a
                                    r13 = r2
                                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Content r13 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Content) r13
                                    java.lang.String r1 = r13.getArticleUrl()
                                    java.lang.String r2 = "MobileClientDisplayType"
                                    java.lang.String r3 = "AndroidIntercomHeaderless"
                                    kotlin.Pair r2 = lf.C6502A.a(r2, r3)
                                    java.lang.String r3 = "MobileClient"
                                    java.lang.String r4 = "AndroidIntercomWebView"
                                    kotlin.Pair r3 = lf.C6502A.a(r3, r4)
                                    java.lang.String r4 = "MobileClientReactionsHidden"
                                    java.lang.String r5 = "true"
                                    kotlin.Pair r4 = lf.C6502A.a(r4, r5)
                                    kotlin.Pair[] r2 = new kotlin.Pair[]{r2, r3, r4}
                                    java.util.Map r2 = mf.O.l(r2)
                                    io.intercom.android.sdk.helpcenter.articles.y r3 = new io.intercom.android.sdk.helpcenter.articles.y
                                    r3.<init>(r1, r12, r2)
                                    io.intercom.android.sdk.helpcenter.articles.z r4 = new io.intercom.android.sdk.helpcenter.articles.z
                                    r4.<init>()
                                    r5 = 384(0x180, float:5.38E-43)
                                    r14 = 2
                                    r2 = 0
                                    r1 = r3
                                    r3 = r4
                                    r4 = r27
                                    r15 = r6
                                    r6 = r14
                                    androidx.compose.ui.viewinterop.e.a(r1, r2, r3, r4, r5, r6)
                                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ReactionState r2 = r13.getReactionState()
                                    int r1 = r2.getReactionComponentVisibility()
                                    if (r1 != 0) goto L_0x0160
                                    r10 = r8
                                L_0x0160:
                                    r1 = -286434903(0xffffffffeeed59a9, float:-3.672817E28)
                                    r9.T(r1)
                                    if (r10 == 0) goto L_0x0199
                                    k0.i r1 = androidx.compose.foundation.layout.q.h(r15, r11, r8, r7)
                                    io.intercom.android.sdk.helpcenter.articles.A r3 = new io.intercom.android.sdk.helpcenter.articles.A
                                    r3.<init>(r12)
                                    io.intercom.android.sdk.helpcenter.articles.B r4 = new io.intercom.android.sdk.helpcenter.articles.B
                                    r4.<init>(r12)
                                    io.intercom.android.sdk.helpcenter.articles.C r5 = new io.intercom.android.sdk.helpcenter.articles.C
                                    r5.<init>(r12)
                                    r7 = 6
                                    r8 = 0
                                    r6 = r27
                                    io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt.ReactionsComponent(r1, r2, r3, r4, r5, r6, r7, r8)
                                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ReactionState r1 = r13.getReactionState()
                                    int r1 = r1.getTeamHelpVisibility()
                                    if (r1 != 0) goto L_0x0199
                                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState r1 = r13.getTeamPresenceState()
                                    r5 = 0
                                    r6 = 6
                                    r2 = 0
                                    r3 = 0
                                    r4 = r27
                                    io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt.TeamPresenceComponent(r1, r2, r3, r4, r5, r6)
                                L_0x0199:
                                    r27.M()
                                    r27.u()
                                    r27.M()
                                    goto L_0x01f3
                                L_0x01a3:
                                    boolean r3 = r2 instanceof io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Error
                                    if (r3 == 0) goto L_0x01f4
                                    r3 = 2093479501(0x7cc7f64d, float:8.306101E36)
                                    r9.T(r3)
                                    io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Error r2 = (io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Error) r2
                                    int r3 = r2.getRetryButtonVisibility()
                                    if (r3 != 0) goto L_0x01b6
                                    goto L_0x01b7
                                L_0x01b6:
                                    r8 = r10
                                L_0x01b7:
                                    k0.i$a r3 = k0.i.f23074a
                                    k0.i r1 = androidx.compose.foundation.layout.n.h(r3, r1)
                                    if (r8 == 0) goto L_0x01da
                                    io.intercom.android.sdk.m5.components.ErrorState$WithCTA r3 = new io.intercom.android.sdk.m5.components.ErrorState$WithCTA
                                    int r13 = r2.getMessage()
                                    io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity r2 = r6
                                    io.intercom.android.sdk.helpcenter.articles.D r4 = new io.intercom.android.sdk.helpcenter.articles.D
                                    r4.<init>(r2)
                                    r17 = 13
                                    r18 = 0
                                    r12 = 0
                                    r14 = 0
                                    r15 = 0
                                    r11 = r3
                                    r16 = r4
                                    r11.<init>(r12, r13, r14, r15, r16, r17, r18)
                                    goto L_0x01ed
                                L_0x01da:
                                    io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA r3 = new io.intercom.android.sdk.m5.components.ErrorState$WithoutCTA
                                    int r21 = r2.getMessage()
                                    r23 = 5
                                    r24 = 0
                                    r20 = 0
                                    r22 = 0
                                    r19 = r3
                                    r19.<init>(r20, r21, r22, r23, r24)
                                L_0x01ed:
                                    io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen(r3, r1, r9, r10, r10)
                                    r27.M()
                                L_0x01f3:
                                    return
                                L_0x01f4:
                                    r1 = 344433773(0x1487a46d, float:1.3696371E-26)
                                    r9.T(r1)
                                    r27.M()
                                    lf.s r1 = new lf.s
                                    r1.<init>()
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1.AnonymousClass1.AnonymousClass3.invoke(C.N, Y.m, int):void");
                            }
                        }, mVar2, 54), mVar, 805306416, 508);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 3072, 7);
            return;
        }
        mVar.I();
    }
}
