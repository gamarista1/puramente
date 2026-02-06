package io.intercom.android.sdk.m5.helpcenter.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.text.Html;
import android.text.Spanned;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.HighlightTagHandler;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import w1.b;
import yf.C6798l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;", "item", "Lkotlin/Function1;", "", "Llf/M;", "onClick", "Lk0/i;", "modifier", "ArticleResultRowComponent", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$ArticleResultRow;Lyf/l;Lk0/i;LY/m;II)V", "rawText", "Landroid/text/Spanned;", "highlightedText", "(Ljava/lang/String;)Landroid/text/Spanned;", "ArticleRowComponentPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ArticleResultRowComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ArticleResultRowComponent(io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow.ArticleResultRow r36, yf.C6798l r37, k0.i r38, Y.C1500m r39, int r40, int r41) {
        /*
            r1 = r36
            r2 = r37
            r4 = r40
            r0 = 48
            r3 = 6
            java.lang.String r5 = "item"
            kotlin.jvm.internal.C6496s.h(r1, r5)
            java.lang.String r5 = "onClick"
            kotlin.jvm.internal.C6496s.h(r2, r5)
            r5 = -506618245(0xffffffffe1cd9e7b, float:-4.7412528E20)
            r6 = r39
            Y.m r5 = r6.h(r5)
            r6 = 1
            r7 = r41 & 1
            r15 = 4
            r14 = 2
            if (r7 == 0) goto L_0x0026
            r7 = r4 | 6
            goto L_0x0036
        L_0x0026:
            r7 = r4 & 14
            if (r7 != 0) goto L_0x0035
            boolean r7 = r5.S(r1)
            if (r7 == 0) goto L_0x0032
            r7 = r15
            goto L_0x0033
        L_0x0032:
            r7 = r14
        L_0x0033:
            r7 = r7 | r4
            goto L_0x0036
        L_0x0035:
            r7 = r4
        L_0x0036:
            r8 = r41 & 2
            r9 = 16
            r10 = 32
            if (r8 == 0) goto L_0x0040
            r7 = r7 | r0
            goto L_0x004e
        L_0x0040:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004e
            boolean r8 = r5.C(r2)
            if (r8 == 0) goto L_0x004c
            r8 = r10
            goto L_0x004d
        L_0x004c:
            r8 = r9
        L_0x004d:
            r7 = r7 | r8
        L_0x004e:
            r8 = r41 & 4
            if (r8 == 0) goto L_0x0057
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0054:
            r11 = r38
            goto L_0x0069
        L_0x0057:
            r11 = r4 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0054
            r11 = r38
            boolean r12 = r5.S(r11)
            if (r12 == 0) goto L_0x0066
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r7 = r7 | r12
        L_0x0069:
            r12 = r7 & 731(0x2db, float:1.024E-42)
            r13 = 146(0x92, float:2.05E-43)
            if (r12 != r13) goto L_0x007c
            boolean r12 = r5.i()
            if (r12 != 0) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            r5.I()
            r3 = r11
            goto L_0x02dc
        L_0x007c:
            if (r8 == 0) goto L_0x0082
            k0.i$a r8 = k0.i.f23074a
            r13 = r8
            goto L_0x0083
        L_0x0082:
            r13 = r11
        L_0x0083:
            r12 = 0
            r11 = 0
            k0.i r16 = androidx.compose.foundation.layout.q.h(r13, r12, r6, r11)
            r8 = -866808730(0xffffffffcc558c66, float:-5.598044E7)
            r5.T(r8)
            r8 = r7 & 112(0x70, float:1.57E-43)
            r3 = 0
            if (r8 != r10) goto L_0x0096
            r8 = r6
            goto L_0x0097
        L_0x0096:
            r8 = r3
        L_0x0097:
            r7 = r7 & 14
            if (r7 != r15) goto L_0x009d
            r7 = r6
            goto L_0x009e
        L_0x009d:
            r7 = r3
        L_0x009e:
            r7 = r7 | r8
            java.lang.Object r8 = r5.A()
            if (r7 != 0) goto L_0x00ad
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00b5
        L_0x00ad:
            io.intercom.android.sdk.m5.helpcenter.ui.components.d r8 = new io.intercom.android.sdk.m5.helpcenter.ui.components.d
            r8.<init>(r2, r1)
            r5.r(r8)
        L_0x00b5:
            r20 = r8
            yf.a r20 = (yf.C6787a) r20
            r5.M()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            k0.i r7 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            float r8 = (float) r9
            float r9 = c1.h.j(r8)
            k0.i r16 = androidx.compose.foundation.layout.n.k(r7, r12, r9, r6, r11)
            float r17 = c1.h.j(r8)
            r21 = 14
            r18 = 0
            r19 = 0
            r20 = 0
            k0.i r6 = androidx.compose.foundation.layout.n.m(r16, r17, r18, r19, r20, r21, r22)
            k0.c$a r7 = k0.c.f23044a
            k0.c$c r8 = r7.i()
            C.c r9 = C.C1085c.f882a
            C.c$e r10 = r9.f()
            H0.F r0 = C.W.b(r10, r8, r5, r0)
            int r8 = Y.C1494j.a(r5, r3)
            Y.y r10 = r5.p()
            k0.i r6 = k0.h.e(r5, r6)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r12 = r16.a()
            Y.f r17 = r5.j()
            if (r17 != 0) goto L_0x010e
            Y.C1494j.c()
        L_0x010e:
            r5.F()
            boolean r17 = r5.f()
            if (r17 == 0) goto L_0x011b
            r5.U(r12)
            goto L_0x011e
        L_0x011b:
            r5.q()
        L_0x011e:
            Y.m r12 = Y.F1.a(r5)
            yf.p r15 = r16.c()
            Y.F1.b(r12, r0, r15)
            yf.p r0 = r16.e()
            Y.F1.b(r12, r10, r0)
            yf.p r0 = r16.b()
            boolean r10 = r12.f()
            if (r10 != 0) goto L_0x0148
            java.lang.Object r10 = r12.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r15)
            if (r10 != 0) goto L_0x0156
        L_0x0148:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r12.r(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.V(r8, r0)
        L_0x0156:
            yf.p r0 = r16.d()
            Y.F1.b(r12, r6, r0)
            C.Z r17 = C.Z.f873a
            k0.i$a r0 = k0.i.f23074a
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r18 = r0
            k0.i r6 = C.Y.b(r17, r18, r19, r20, r21, r22)
            C.c$m r8 = r9.g()
            k0.c$b r7 = r7.k()
            H0.F r7 = C.C1090h.a(r8, r7, r5, r3)
            int r8 = Y.C1494j.a(r5, r3)
            Y.y r9 = r5.p()
            k0.i r6 = k0.h.e(r5, r6)
            yf.a r10 = r16.a()
            Y.f r12 = r5.j()
            if (r12 != 0) goto L_0x0194
            Y.C1494j.c()
        L_0x0194:
            r5.F()
            boolean r12 = r5.f()
            if (r12 == 0) goto L_0x01a1
            r5.U(r10)
            goto L_0x01a4
        L_0x01a1:
            r5.q()
        L_0x01a4:
            Y.m r10 = Y.F1.a(r5)
            yf.p r12 = r16.c()
            Y.F1.b(r10, r7, r12)
            yf.p r7 = r16.e()
            Y.F1.b(r10, r9, r7)
            yf.p r7 = r16.b()
            boolean r9 = r10.f()
            if (r9 != 0) goto L_0x01ce
            java.lang.Object r9 = r10.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r12)
            if (r9 != 0) goto L_0x01dc
        L_0x01ce:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.r(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.V(r8, r7)
        L_0x01dc:
            yf.p r7 = r16.d()
            Y.F1.b(r10, r6, r7)
            C.k r6 = C.C1093k.f978a
            Y.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r5.m(r6)
            r15 = r6
            android.content.Context r15 = (android.content.Context) r15
            java.lang.String r6 = r36.getTitleText()
            android.text.Spanned r6 = highlightedText(r6)
            Q0.d r6 = io.intercom.android.sdk.survey.block.BlockExtensionsKt.toAnnotatedString$default(r6, r15, r11, r14, r11)
            io.intercom.android.sdk.ui.theme.IntercomTheme r12 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r12.getTypography(r5, r10)
            Q0.T r27 = r7.getType04()
            b1.t$a r32 = b1.t.f19154a
            int r21 = r32.b()
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r12.getColors(r5, r10)
            long r8 = r7.m700getPrimaryText0d7_KjU()
            r30 = 48
            r31 = 129018(0x1f7fa, float:1.80793E-40)
            r7 = 0
            r16 = 0
            r33 = r10
            r10 = r16
            r16 = 0
            r34 = r12
            r12 = r16
            r3 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r35 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 0
            r28 = r5
            V.T0.c(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = 1612603933(0x601e621d, float:4.5650865E19)
            r5.T(r6)
            int r6 = r36.getSummaryVisibility()
            if (r6 != 0) goto L_0x02c0
            java.lang.String r6 = r36.getSummaryText()
            boolean r6 = Sg.p.d0(r6)
            if (r6 != 0) goto L_0x02c0
            r6 = 4
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r6 = androidx.compose.foundation.layout.q.i(r3, r6)
            r7 = 0
            C.a0.a(r6, r5, r7)
            java.lang.String r6 = r36.getSummaryText()
            android.text.Spanned r6 = highlightedText(r6)
            r7 = r35
            r14 = 0
            r15 = 2
            Q0.d r6 = io.intercom.android.sdk.survey.block.BlockExtensionsKt.toAnnotatedString$default(r6, r7, r14, r15, r14)
            r8 = r33
            r7 = r34
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r7.getTypography(r5, r8)
            Q0.T r27 = r7.getType04Point5()
            int r21 = r32.b()
            r7 = 4286611584(0xff808080, double:2.1178675207E-314)
            long r8 = r0.C2550z0.d(r7)
            r30 = 48
            r31 = 129018(0x1f7fa, float:1.80793E-40)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 384(0x180, float:5.38E-43)
            r28 = r5
            V.T0.c(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x02c0:
            r5.M()
            r5.u()
            r6 = 22
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            r7 = 2
            r8 = 0
            r9 = 0
            k0.i r0 = androidx.compose.foundation.layout.n.k(r0, r6, r8, r7, r9)
            r6 = 0
            r7 = 6
            io.intercom.android.sdk.m5.components.IntercomChevronKt.IntercomChevron(r0, r5, r7, r6)
            r5.u()
        L_0x02dc:
            Y.Y0 r6 = r5.k()
            if (r6 == 0) goto L_0x02f3
            io.intercom.android.sdk.m5.helpcenter.ui.components.e r7 = new io.intercom.android.sdk.m5.helpcenter.ui.components.e
            r0 = r7
            r1 = r36
            r2 = r37
            r4 = r40
            r5 = r41
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt.ArticleResultRowComponent(io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow$ArticleResultRow, yf.l, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleResultRowComponent$lambda$1$lambda$0(C6798l lVar, ArticleSearchResultRow.ArticleResultRow articleResultRow) {
        C6496s.h(lVar, "$onClick");
        C6496s.h(articleResultRow, "$item");
        lVar.invoke(articleResultRow.getId());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleResultRowComponent$lambda$4(ArticleSearchResultRow.ArticleResultRow articleResultRow, C6798l lVar, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(articleResultRow, "$item");
        C6496s.h(lVar, "$onClick");
        ArticleResultRowComponent(articleResultRow, lVar, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(387759007);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ArticleResultRowComponentKt.INSTANCE.m344getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6203f(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleRowComponentPreview$lambda$5(int i10, C1500m mVar, int i11) {
        ArticleRowComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final Spanned highlightedText(String str) {
        HighlightTagHandler highlightTagHandler = new HighlightTagHandler();
        Spanned b10 = b.b("&zwj;" + str, 0, (Html.ImageGetter) null, highlightTagHandler);
        C6496s.g(b10, "fromHtml(...)");
        return b10;
    }
}
