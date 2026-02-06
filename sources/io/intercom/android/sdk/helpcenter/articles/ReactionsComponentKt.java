package io.intercom.android.sdk.helpcenter.articles;

import V.O0;
import Y.A1;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import c1.h;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6787a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\r\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u0013²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u0002²\u0006\f\u0010\u0011\u001a\u00020\u000f8\nX\u0002²\u0006\f\u0010\u0012\u001a\u00020\u000f8\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "currentReactionState", "Lkotlin/Function0;", "Llf/M;", "sadReactionTapped", "neutralReactionTapped", "happyReactionTapped", "ReactionsComponent", "(Lk0/i;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;Lyf/a;Lyf/a;Lyf/a;LY/m;II)V", "ReactionsComponentPreview", "(LY/m;I)V", "ReactionComponentSadTappedPreview", "ReactionComponentNeutralTappedPreview", "Lc1/h;", "sadSize", "happySize", "neutralSize", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ReactionsComponentKt {
    public static final void ReactionComponentNeutralTappedPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(507405585);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m132getLambda3$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new L(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ReactionComponentNeutralTappedPreview$lambda$17(int i10, C1500m mVar, int i11) {
        ReactionComponentNeutralTappedPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ReactionComponentSadTappedPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2092315616);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m131getLambda2$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new G(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ReactionComponentSadTappedPreview$lambda$16(int i10, C1500m mVar, int i11) {
        ReactionComponentSadTappedPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x044c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ReactionsComponent(k0.i r45, io.intercom.android.sdk.helpcenter.articles.ArticleViewState.ReactionState r46, yf.C6787a r47, yf.C6787a r48, yf.C6787a r49, Y.C1500m r50, int r51, int r52) {
        /*
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r51
            r0 = 48
            r1 = 16
            r7 = 2
            r8 = 4
            r9 = 6
            java.lang.String r10 = "currentReactionState"
            kotlin.jvm.internal.C6496s.h(r2, r10)
            java.lang.String r10 = "sadReactionTapped"
            kotlin.jvm.internal.C6496s.h(r3, r10)
            java.lang.String r10 = "neutralReactionTapped"
            kotlin.jvm.internal.C6496s.h(r4, r10)
            java.lang.String r10 = "happyReactionTapped"
            kotlin.jvm.internal.C6496s.h(r5, r10)
            r10 = -1539407934(0xffffffffa43e7fc2, float:-4.1307898E-17)
            r11 = r50
            Y.m r10 = r11.h(r10)
            r15 = 1
            r11 = r52 & 1
            if (r11 == 0) goto L_0x0039
            r12 = r6 | 6
            r13 = r12
            r12 = r45
            goto L_0x004d
        L_0x0039:
            r12 = r6 & 14
            if (r12 != 0) goto L_0x004a
            r12 = r45
            boolean r13 = r10.S(r12)
            if (r13 == 0) goto L_0x0047
            r13 = r8
            goto L_0x0048
        L_0x0047:
            r13 = r7
        L_0x0048:
            r13 = r13 | r6
            goto L_0x004d
        L_0x004a:
            r12 = r45
            r13 = r6
        L_0x004d:
            r7 = r52 & 2
            if (r7 == 0) goto L_0x0053
            r13 = r13 | r0
            goto L_0x0062
        L_0x0053:
            r7 = r6 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0062
            boolean r7 = r10.S(r2)
            if (r7 == 0) goto L_0x0060
            r7 = 32
            goto L_0x0061
        L_0x0060:
            r7 = r1
        L_0x0061:
            r13 = r13 | r7
        L_0x0062:
            r7 = r52 & 4
            if (r7 == 0) goto L_0x0069
            r13 = r13 | 384(0x180, float:5.38E-43)
            goto L_0x0079
        L_0x0069:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0079
            boolean r7 = r10.C(r3)
            if (r7 == 0) goto L_0x0076
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0078
        L_0x0076:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0078:
            r13 = r13 | r7
        L_0x0079:
            r7 = r52 & 8
            if (r7 == 0) goto L_0x0080
            r13 = r13 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x0080:
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0090
            boolean r7 = r10.C(r4)
            if (r7 == 0) goto L_0x008d
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r13 = r13 | r7
        L_0x0090:
            r7 = r52 & 16
            r36 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x009b
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
        L_0x0099:
            r7 = r13
            goto L_0x00ac
        L_0x009b:
            r7 = r6 & r36
            if (r7 != 0) goto L_0x0099
            boolean r7 = r10.C(r5)
            if (r7 == 0) goto L_0x00a8
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r13 = r13 | r7
            goto L_0x0099
        L_0x00ac:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r7
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00c1
            boolean r13 = r10.i()
            if (r13 != 0) goto L_0x00bb
            goto L_0x00c1
        L_0x00bb:
            r10.I()
            r1 = r12
            goto L_0x046a
        L_0x00c1:
            if (r11 == 0) goto L_0x00c7
            k0.i$a r11 = k0.i.f23074a
            r13 = r11
            goto L_0x00c8
        L_0x00c7:
            r13 = r12
        L_0x00c8:
            k0.c$a r37 = k0.c.f23044a
            k0.c$b r11 = r37.g()
            C.c r38 = C.C1085c.f882a
            C.c$m r12 = r38.g()
            H0.F r0 = C.C1090h.a(r12, r11, r10, r0)
            r14 = 0
            int r11 = Y.C1494j.a(r10, r14)
            Y.y r12 = r10.p()
            k0.i r8 = k0.h.e(r10, r13)
            J0.g$a r39 = J0.C1241g.f3853J
            yf.a r9 = r39.a()
            Y.f r17 = r10.j()
            if (r17 != 0) goto L_0x00f4
            Y.C1494j.c()
        L_0x00f4:
            r10.F()
            boolean r17 = r10.f()
            if (r17 == 0) goto L_0x0101
            r10.U(r9)
            goto L_0x0104
        L_0x0101:
            r10.q()
        L_0x0104:
            Y.m r9 = Y.F1.a(r10)
            yf.p r1 = r39.c()
            Y.F1.b(r9, r0, r1)
            yf.p r0 = r39.e()
            Y.F1.b(r9, r12, r0)
            yf.p r0 = r39.b()
            boolean r1 = r9.f()
            if (r1 != 0) goto L_0x012e
            java.lang.Object r1 = r9.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r12)
            if (r1 != 0) goto L_0x013c
        L_0x012e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r9.r(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r9.V(r1, r0)
        L_0x013c:
            yf.p r0 = r39.d()
            Y.F1.b(r9, r8, r0)
            C.k r0 = C.C1093k.f978a
            r0 = 0
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r0, r10, r14, r15)
            k0.i$a r1 = k0.i.f23074a
            r8 = 16
            float r8 = (float) r8
            float r9 = c1.h.j(r8)
            k0.i r9 = androidx.compose.foundation.layout.q.i(r1, r9)
            r11 = 6
            C.a0.a(r9, r10, r11)
            int r9 = io.intercom.android.sdk.R.string.intercom_article_question
            java.lang.String r11 = M0.i.a(r9, r10, r14)
            r34 = 0
            r35 = 131070(0x1fffe, float:1.83668E-40)
            r12 = 0
            r17 = 0
            r40 = r13
            r9 = r14
            r13 = r17
            r16 = 0
            r9 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r32 = r10
            V.T0.b(r11, r12, r13, r15, r17, r18, r19, r20, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            float r11 = c1.h.j(r8)
            k0.i r11 = androidx.compose.foundation.layout.n.i(r1, r11)
            r15 = 0
            k0.i r11 = androidx.compose.foundation.layout.q.h(r11, r15, r9, r0)
            C.c$f r12 = r38.b()
            k0.c$c r13 = r37.l()
            r14 = 6
            H0.F r12 = C.W.b(r12, r13, r10, r14)
            r13 = 0
            int r14 = Y.C1494j.a(r10, r13)
            Y.y r13 = r10.p()
            k0.i r11 = k0.h.e(r10, r11)
            yf.a r15 = r39.a()
            Y.f r17 = r10.j()
            if (r17 != 0) goto L_0x01c7
            Y.C1494j.c()
        L_0x01c7:
            r10.F()
            boolean r17 = r10.f()
            if (r17 == 0) goto L_0x01d4
            r10.U(r15)
            goto L_0x01d7
        L_0x01d4:
            r10.q()
        L_0x01d7:
            Y.m r15 = Y.F1.a(r10)
            yf.p r0 = r39.c()
            Y.F1.b(r15, r12, r0)
            yf.p r0 = r39.e()
            Y.F1.b(r15, r13, r0)
            yf.p r0 = r39.b()
            boolean r12 = r15.f()
            if (r12 != 0) goto L_0x0201
            java.lang.Object r12 = r15.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r13)
            if (r12 != 0) goto L_0x020f
        L_0x0201:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r15.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r15.V(r12, r0)
        L_0x020f:
            yf.p r0 = r39.d()
            Y.F1.b(r15, r11, r0)
            C.Z r0 = C.Z.f873a
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r0 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r15 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.Sad
            r14 = 38
            r13 = 24
            if (r0 == r15) goto L_0x0234
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r0 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r11 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.None
            if (r0 != r11) goto L_0x022d
            goto L_0x0234
        L_0x022d:
            float r0 = (float) r13
            float r0 = c1.h.j(r0)
        L_0x0232:
            r11 = r0
            goto L_0x023a
        L_0x0234:
            float r0 = (float) r14
            float r0 = c1.h.j(r0)
            goto L_0x0232
        L_0x023a:
            r0 = 0
            r17 = 14
            r12 = 0
            r18 = 0
            r19 = 0
            r9 = r13
            r13 = r18
            r14 = r19
            r41 = r15
            r15 = r10
            r16 = r0
            Y.A1 r0 = w.C2786c.c(r11, r12, r13, r14, r15, r16, r17)
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r11 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r15 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.Happy
            if (r11 == r15) goto L_0x0260
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r11 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r12 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.None
            if (r11 != r12) goto L_0x0263
        L_0x0260:
            r14 = 38
            goto L_0x026b
        L_0x0263:
            float r11 = (float) r9
            float r11 = c1.h.j(r11)
            r14 = 38
            goto L_0x0270
        L_0x026b:
            float r11 = (float) r14
            float r11 = c1.h.j(r11)
        L_0x0270:
            r16 = 0
            r17 = 14
            r12 = 0
            r13 = 0
            r18 = 0
            r14 = r18
            r42 = r15
            r15 = r10
            Y.A1 r27 = w.C2786c.c(r11, r12, r13, r14, r15, r16, r17)
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r11 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r15 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.Neutral
            if (r11 == r15) goto L_0x0291
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r11 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r12 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.None
            if (r11 != r12) goto L_0x0294
        L_0x0291:
            r9 = 38
            goto L_0x029b
        L_0x0294:
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
        L_0x0299:
            r11 = r9
            goto L_0x02a1
        L_0x029b:
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
            goto L_0x0299
        L_0x02a1:
            r16 = 0
            r17 = 14
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r15
            r15 = r10
            Y.A1 r28 = w.C2786c.c(r11, r12, r13, r14, r15, r16, r17)
            r11 = -1674636031(0xffffffff9c2f1501, float:-5.792979E-22)
            r10.T(r11)
            r11 = r7 & 896(0x380, float:1.256E-42)
            r12 = 256(0x100, float:3.59E-43)
            if (r11 != r12) goto L_0x02bc
            r15 = 1
            goto L_0x02bd
        L_0x02bc:
            r15 = 0
        L_0x02bd:
            java.lang.Object r11 = r10.A()
            if (r15 != 0) goto L_0x02cb
            Y.m$a r12 = Y.C1500m.f10026a
            java.lang.Object r12 = r12.a()
            if (r11 != r12) goto L_0x02d3
        L_0x02cb:
            io.intercom.android.sdk.helpcenter.articles.H r11 = new io.intercom.android.sdk.helpcenter.articles.H
            r11.<init>(r3)
            r10.r(r11)
        L_0x02d3:
            r22 = r11
            yf.a r22 = (yf.C6787a) r22
            r10.M()
            r23 = 7
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r18 = r1
            k0.i r11 = androidx.compose.foundation.d.d(r18, r19, r20, r21, r22, r23, r24)
            float r0 = ReactionsComponent$lambda$13$lambda$12$lambda$0(r0)
            k0.i r13 = androidx.compose.foundation.layout.q.n(r11, r0)
            int r0 = io.intercom.android.sdk.R.drawable.intercom_reaction_sad
            r11 = 0
            w0.c r0 = M0.e.c(r0, r10, r11)
            r0.y0$a r15 = r0.C2547y0.f25576b
            r11 = 1
            r12 = 0
            float[] r14 = r0.C2435A0.b(r12, r11, r12)
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r11 = r46.getSelectedReaction()
            r12 = r41
            if (r11 == r12) goto L_0x031c
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r11 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r12 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.None
            if (r11 != r12) goto L_0x0315
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            goto L_0x031f
        L_0x0315:
            r12 = 0
            r0.C2435A0.e(r14, r12)
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0322
        L_0x031c:
            r12 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x031f:
            r0.C2435A0.e(r14, r11)
        L_0x0322:
            r0.y0 r17 = r15.a(r14)
            r19 = 56
            r20 = 56
            r14 = 0
            r16 = 0
            r18 = 0
            r21 = 0
            r22 = r11
            r11 = r0
            r0 = r12
            r12 = r14
            r14 = r16
            r43 = r15
            r15 = r18
            r16 = r21
            r18 = r10
            x.C2842F.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r11 = c1.h.j(r8)
            k0.i r11 = androidx.compose.foundation.layout.q.r(r1, r11)
            r12 = 6
            C.a0.a(r11, r10, r12)
            r11 = -1674606715(0xffffffff9c2f8785, float:-5.80778E-22)
            r10.T(r11)
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 != r12) goto L_0x035d
            r15 = 1
            goto L_0x035e
        L_0x035d:
            r15 = 0
        L_0x035e:
            java.lang.Object r11 = r10.A()
            if (r15 != 0) goto L_0x036c
            Y.m$a r12 = Y.C1500m.f10026a
            java.lang.Object r12 = r12.a()
            if (r11 != r12) goto L_0x0374
        L_0x036c:
            io.intercom.android.sdk.helpcenter.articles.I r11 = new io.intercom.android.sdk.helpcenter.articles.I
            r11.<init>(r4)
            r10.r(r11)
        L_0x0374:
            r22 = r11
            yf.a r22 = (yf.C6787a) r22
            r10.M()
            r23 = 7
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r18 = r1
            k0.i r11 = androidx.compose.foundation.d.d(r18, r19, r20, r21, r22, r23, r24)
            float r12 = ReactionsComponent$lambda$13$lambda$12$lambda$2(r28)
            k0.i r13 = androidx.compose.foundation.layout.q.n(r11, r12)
            int r11 = io.intercom.android.sdk.R.drawable.intercom_reaction_neutral
            r12 = 0
            w0.c r11 = M0.e.c(r11, r10, r12)
            r12 = 1
            r14 = 0
            float[] r15 = r0.C2435A0.b(r14, r12, r14)
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r12 = r46.getSelectedReaction()
            if (r12 == r9) goto L_0x03ae
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r9 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r12 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.None
            if (r9 != r12) goto L_0x03b1
        L_0x03ae:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03b9
        L_0x03b1:
            r0.C2435A0.e(r15, r0)
            r14 = r43
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03be
        L_0x03b9:
            r0.C2435A0.e(r15, r9)
            r14 = r43
        L_0x03be:
            r0.y0 r17 = r14.a(r15)
            r19 = 56
            r20 = 56
            r12 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r44 = r14
            r14 = r15
            r15 = r16
            r16 = r18
            r18 = r10
            x.C2842F.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r8 = c1.h.j(r8)
            k0.i r8 = androidx.compose.foundation.layout.q.r(r1, r8)
            r11 = 6
            C.a0.a(r8, r10, r11)
            r8 = -1674576893(0xffffffff9c2ffc03, float:-5.822836E-22)
            r10.T(r8)
            r7 = r7 & r36
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r8) goto L_0x03f2
            r15 = 1
            goto L_0x03f3
        L_0x03f2:
            r15 = 0
        L_0x03f3:
            java.lang.Object r7 = r10.A()
            if (r15 != 0) goto L_0x0401
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0409
        L_0x0401:
            io.intercom.android.sdk.helpcenter.articles.J r7 = new io.intercom.android.sdk.helpcenter.articles.J
            r7.<init>(r5)
            r10.r(r7)
        L_0x0409:
            r22 = r7
            yf.a r22 = (yf.C6787a) r22
            r10.M()
            r23 = 7
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r18 = r1
            k0.i r1 = androidx.compose.foundation.d.d(r18, r19, r20, r21, r22, r23, r24)
            float r7 = ReactionsComponent$lambda$13$lambda$12$lambda$1(r27)
            k0.i r13 = androidx.compose.foundation.layout.q.n(r1, r7)
            int r1 = io.intercom.android.sdk.R.drawable.intercom_reaction_happy
            r7 = 0
            w0.c r11 = M0.e.c(r1, r10, r7)
            r1 = 1
            r7 = 0
            float[] r1 = r0.C2435A0.b(r7, r1, r7)
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r7 = r46.getSelectedReaction()
            r8 = r42
            if (r7 == r8) goto L_0x044c
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r7 = r46.getSelectedReaction()
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$Reaction r8 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.Reaction.None
            if (r7 != r8) goto L_0x0446
            goto L_0x044c
        L_0x0446:
            r0.C2435A0.e(r1, r0)
        L_0x0449:
            r0 = r44
            goto L_0x0450
        L_0x044c:
            r0.C2435A0.e(r1, r9)
            goto L_0x0449
        L_0x0450:
            r0.y0 r17 = r0.a(r1)
            r19 = 56
            r20 = 56
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = r10
            x.C2842F.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r10.u()
            r10.u()
            r1 = r40
        L_0x046a:
            Y.Y0 r8 = r10.k()
            if (r8 == 0) goto L_0x0485
            io.intercom.android.sdk.helpcenter.articles.K r9 = new io.intercom.android.sdk.helpcenter.articles.K
            r0 = r9
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r51
            r7 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0485:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt.ReactionsComponent(k0.i, io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ReactionState, yf.a, yf.a, yf.a, Y.m, int, int):void");
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$0(A1 a12) {
        return ((h) a12.getValue()).r();
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$1(A1 a12) {
        return ((h) a12.getValue()).r();
    }

    /* access modifiers changed from: private */
    public static final C6514M ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9(C6787a aVar) {
        C6496s.h(aVar, "$happyReactionTapped");
        aVar.invoke();
        return C6514M.f71813a;
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$2(A1 a12) {
        return ((h) a12.getValue()).r();
    }

    /* access modifiers changed from: private */
    public static final C6514M ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3(C6787a aVar) {
        C6496s.h(aVar, "$sadReactionTapped");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6(C6787a aVar) {
        C6496s.h(aVar, "$neutralReactionTapped");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ReactionsComponent$lambda$14(i iVar, ArticleViewState.ReactionState reactionState, C6787a aVar, C6787a aVar2, C6787a aVar3, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(reactionState, "$currentReactionState");
        C6496s.h(aVar, "$sadReactionTapped");
        C6496s.h(aVar2, "$neutralReactionTapped");
        C6496s.h(aVar3, "$happyReactionTapped");
        ReactionsComponent(iVar, reactionState, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void ReactionsComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(913251333);
        if (i10 != 0 || !h10.i()) {
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m130getLambda1$intercom_sdk_base_release(), h10, 12582912, 127);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ReactionsComponentPreview$lambda$15(int i10, C1500m mVar, int i11) {
        ReactionsComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
