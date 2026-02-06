package io.intercom.android.sdk.m5.helpcenter.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow$ArticleRow;", "articleRow", "Lkotlin/Function1;", "", "Llf/M;", "onClick", "ArticleRowComponent", "(Lk0/i;Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow$ArticleRow;Lyf/l;LY/m;II)V", "ArticleRowComponentPreview", "(LY/m;I)V", "ArticleRowComponentLongTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ArticleRowComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: io.intercom.android.sdk.m5.helpcenter.ui.components.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ArticleRowComponent(k0.i r32, io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow.ArticleRow r33, yf.C6798l r34, Y.C1500m r35, int r36, int r37) {
        /*
            r2 = r33
            r4 = r36
            java.lang.String r0 = "articleRow"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = 1326302174(0x4f0dc3de, float:2.37842381E9)
            r1 = r35
            Y.m r0 = r1.h(r0)
            r1 = r37 & 1
            r3 = 2
            if (r1 == 0) goto L_0x001d
            r5 = r4 | 6
            r6 = r5
            r5 = r32
            goto L_0x0031
        L_0x001d:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x002e
            r5 = r32
            boolean r6 = r0.S(r5)
            if (r6 == 0) goto L_0x002b
            r6 = 4
            goto L_0x002c
        L_0x002b:
            r6 = r3
        L_0x002c:
            r6 = r6 | r4
            goto L_0x0031
        L_0x002e:
            r5 = r32
            r6 = r4
        L_0x0031:
            r7 = r37 & 2
            r8 = 16
            r9 = 32
            if (r7 == 0) goto L_0x003c
            r6 = r6 | 48
            goto L_0x004a
        L_0x003c:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004a
            boolean r7 = r0.S(r2)
            if (r7 == 0) goto L_0x0048
            r7 = r9
            goto L_0x0049
        L_0x0048:
            r7 = r8
        L_0x0049:
            r6 = r6 | r7
        L_0x004a:
            r7 = r37 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r11 = r34
            goto L_0x0066
        L_0x0055:
            r11 = r4 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0052
            r11 = r34
            boolean r12 = r0.C(r11)
            if (r12 == 0) goto L_0x0063
            r12 = r10
            goto L_0x0065
        L_0x0063:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r6 = r6 | r12
        L_0x0066:
            r12 = r6 & 731(0x2db, float:1.024E-42)
            r13 = 146(0x92, float:2.05E-43)
            if (r12 != r13) goto L_0x007a
            boolean r12 = r0.i()
            if (r12 != 0) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            r0.I()
            r1 = r5
            r3 = r11
            goto L_0x01dd
        L_0x007a:
            if (r1 == 0) goto L_0x007f
            k0.i$a r1 = k0.i.f23074a
            goto L_0x0080
        L_0x007f:
            r1 = r5
        L_0x0080:
            if (r7 == 0) goto L_0x0089
            io.intercom.android.sdk.m5.helpcenter.ui.components.g r5 = new io.intercom.android.sdk.m5.helpcenter.ui.components.g
            r5.<init>()
            r14 = r5
            goto L_0x008a
        L_0x0089:
            r14 = r11
        L_0x008a:
            r15 = 0
            r5 = 1
            r13 = 0
            k0.i r16 = androidx.compose.foundation.layout.q.h(r1, r15, r5, r13)
            r7 = 1587298991(0x5e9c42af, float:5.6298772E18)
            r0.T(r7)
            r7 = r6 & 896(0x380, float:1.256E-42)
            r12 = 0
            if (r7 != r10) goto L_0x009e
            r7 = r5
            goto L_0x009f
        L_0x009e:
            r7 = r12
        L_0x009f:
            r6 = r6 & 112(0x70, float:1.57E-43)
            if (r6 != r9) goto L_0x00a5
            r6 = r5
            goto L_0x00a6
        L_0x00a5:
            r6 = r12
        L_0x00a6:
            r6 = r6 | r7
            java.lang.Object r7 = r0.A()
            if (r6 != 0) goto L_0x00b5
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00bd
        L_0x00b5:
            io.intercom.android.sdk.m5.helpcenter.ui.components.h r7 = new io.intercom.android.sdk.m5.helpcenter.ui.components.h
            r7.<init>(r14, r2)
            r0.r(r7)
        L_0x00bd:
            r20 = r7
            yf.a r20 = (yf.C6787a) r20
            r0.M()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            k0.i r23 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            float r6 = (float) r8
            float r24 = c1.h.j(r6)
            r28 = 14
            r29 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            k0.i r6 = androidx.compose.foundation.layout.n.m(r23, r24, r25, r26, r27, r28, r29)
            r7 = 12
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            k0.i r5 = androidx.compose.foundation.layout.n.k(r6, r15, r7, r5, r13)
            C.c r6 = C.C1085c.f882a
            C.c$f r6 = r6.d()
            k0.c$a r7 = k0.c.f23044a
            k0.c$c r7 = r7.i()
            r8 = 54
            H0.F r6 = C.W.b(r6, r7, r0, r8)
            int r7 = Y.C1494j.a(r0, r12)
            Y.y r8 = r0.p()
            k0.i r5 = k0.h.e(r0, r5)
            J0.g$a r9 = J0.C1241g.f3853J
            yf.a r10 = r9.a()
            Y.f r11 = r0.j()
            if (r11 != 0) goto L_0x011d
            Y.C1494j.c()
        L_0x011d:
            r0.F()
            boolean r11 = r0.f()
            if (r11 == 0) goto L_0x012a
            r0.U(r10)
            goto L_0x012d
        L_0x012a:
            r0.q()
        L_0x012d:
            Y.m r10 = Y.F1.a(r0)
            yf.p r11 = r9.c()
            Y.F1.b(r10, r6, r11)
            yf.p r6 = r9.e()
            Y.F1.b(r10, r8, r6)
            yf.p r6 = r9.b()
            boolean r8 = r10.f()
            if (r8 != 0) goto L_0x0157
            java.lang.Object r8 = r10.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r11)
            if (r8 != 0) goto L_0x0165
        L_0x0157:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.V(r7, r6)
        L_0x0165:
            yf.p r6 = r9.d()
            Y.F1.b(r10, r5, r6)
            C.Z r16 = C.Z.f873a
            java.lang.String r5 = r33.getTitle()
            io.intercom.android.sdk.ui.theme.IntercomTheme r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r8 = r6.getTypography(r0, r7)
            Q0.T r25 = r8.getType04Point5()
            io.intercom.android.sdk.ui.theme.IntercomColors r6 = r6.getColors(r0, r7)
            long r7 = r6.m700getPrimaryText0d7_KjU()
            k0.i$a r11 = k0.i.f23074a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r11
            k0.i r6 = C.Y.b(r16, r17, r18, r19, r20, r21)
            r28 = 0
            r29 = 65528(0xfff8, float:9.1824E-41)
            r9 = 0
            r16 = 0
            r30 = r11
            r11 = r16
            r12 = r16
            r13 = r16
            r16 = 0
            r31 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r26 = r0
            V.T0.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 22
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            r8 = r30
            r6 = 0
            r7 = 0
            k0.i r3 = androidx.compose.foundation.layout.n.k(r8, r5, r6, r3, r7)
            r5 = 6
            r6 = 0
            io.intercom.android.sdk.m5.components.IntercomChevronKt.IntercomChevron(r3, r0, r5, r6)
            r0.u()
            r3 = r31
        L_0x01dd:
            Y.Y0 r6 = r0.k()
            if (r6 == 0) goto L_0x01f2
            io.intercom.android.sdk.m5.helpcenter.ui.components.i r7 = new io.intercom.android.sdk.m5.helpcenter.ui.components.i
            r0 = r7
            r2 = r33
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt.ArticleRowComponent(k0.i, io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow$ArticleRow, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleRowComponent$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleRowComponent$lambda$2$lambda$1(C6798l lVar, CollectionDetailsRow.ArticleRow articleRow) {
        C6496s.h(articleRow, "$articleRow");
        lVar.invoke(articleRow.getId());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleRowComponent$lambda$4(i iVar, CollectionDetailsRow.ArticleRow articleRow, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(articleRow, "$articleRow");
        ArticleRowComponent(iVar, articleRow, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentLongTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2014154163);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m346getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6208k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleRowComponentLongTextPreview$lambda$6(int i10, C1500m mVar, int i11) {
        ArticleRowComponentLongTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(761606012);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m345getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6207j(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ArticleRowComponentPreview$lambda$5(int i10, C1500m mVar, int i11) {
        ArticleRowComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
