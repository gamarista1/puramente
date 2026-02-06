package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aK\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"", "title", "Lk0/i;", "modifier", "description", "", "iconId", "Lkotlin/Function0;", "Llf/M;", "bottomContent", "EmptyState", "(Ljava/lang/String;Lk0/i;Ljava/lang/String;Ljava/lang/Integer;Lyf/p;LY/m;II)V", "EmptyStatePreview", "(LY/m;I)V", "EmptyStateWithOutlinedButtonPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EmptyStateKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void EmptyState(java.lang.String r47, k0.i r48, java.lang.String r49, java.lang.Integer r50, yf.p r51, Y.C1500m r52, int r53, int r54) {
        /*
            r0 = r47
            r15 = r53
            r13 = 16
            r1 = 2
            r2 = 4
            r14 = 6
            java.lang.String r3 = "title"
            kotlin.jvm.internal.C6496s.h(r0, r3)
            r3 = 728499887(0x2b6c06af, float:8.385332E-13)
            r4 = r52
            Y.m r12 = r4.h(r3)
            r3 = 1
            r4 = r54 & 1
            if (r4 == 0) goto L_0x001f
            r4 = r15 | 6
            goto L_0x002f
        L_0x001f:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x002e
            boolean r4 = r12.S(r0)
            if (r4 == 0) goto L_0x002b
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r4 = r4 | r15
            goto L_0x002f
        L_0x002e:
            r4 = r15
        L_0x002f:
            r1 = r54 & 2
            r5 = 32
            if (r1 == 0) goto L_0x003a
            r4 = r4 | 48
        L_0x0037:
            r6 = r48
            goto L_0x004a
        L_0x003a:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0037
            r6 = r48
            boolean r7 = r12.S(r6)
            if (r7 == 0) goto L_0x0048
            r7 = r5
            goto L_0x0049
        L_0x0048:
            r7 = r13
        L_0x0049:
            r4 = r4 | r7
        L_0x004a:
            r2 = r54 & 4
            if (r2 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r7 = r49
            goto L_0x0065
        L_0x0053:
            r7 = r15 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0050
            r7 = r49
            boolean r8 = r12.S(r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r8
        L_0x0065:
            r8 = r54 & 8
            if (r8 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r9 = r50
            goto L_0x0080
        L_0x006e:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x006b
            r9 = r50
            boolean r10 = r12.S(r9)
            if (r10 == 0) goto L_0x007d
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r4 = r4 | r10
        L_0x0080:
            r10 = r54 & 16
            if (r10 == 0) goto L_0x008b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r11 = r51
        L_0x0088:
            r16 = r4
            goto L_0x00a1
        L_0x008b:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x0086
            r11 = r51
            boolean r16 = r12.C(r11)
            if (r16 == 0) goto L_0x009c
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r16
            goto L_0x0088
        L_0x00a1:
            r4 = 46811(0xb6db, float:6.5596E-41)
            r4 = r16 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r14) goto L_0x00bb
            boolean r4 = r12.i()
            if (r4 != 0) goto L_0x00b1
            goto L_0x00bb
        L_0x00b1:
            r12.I()
            r2 = r6
            r3 = r7
            r4 = r9
            r5 = r11
            r1 = r12
            goto L_0x0298
        L_0x00bb:
            if (r1 == 0) goto L_0x00c1
            k0.i$a r1 = k0.i.f23074a
            r14 = r1
            goto L_0x00c2
        L_0x00c1:
            r14 = r6
        L_0x00c2:
            r1 = 0
            if (r2 == 0) goto L_0x00c8
            r40 = r1
            goto L_0x00ca
        L_0x00c8:
            r40 = r7
        L_0x00ca:
            if (r8 == 0) goto L_0x00cf
            r41 = r1
            goto L_0x00d1
        L_0x00cf:
            r41 = r9
        L_0x00d1:
            if (r10 == 0) goto L_0x00d5
            r2 = r1
            goto L_0x00d6
        L_0x00d5:
            r2 = r11
        L_0x00d6:
            r4 = 24
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            k0.i r4 = androidx.compose.foundation.layout.n.i(r14, r4)
            r6 = 0
            k0.i r1 = androidx.compose.foundation.layout.q.f(r4, r6, r3, r1)
            k0.c$a r3 = k0.c.f23044a
            k0.c$b r3 = r3.g()
            C.c r4 = C.C1085c.f882a
            C.c$f r4 = r4.b()
            r6 = 54
            H0.F r3 = C.C1090h.a(r4, r3, r12, r6)
            r11 = 0
            int r4 = Y.C1494j.a(r12, r11)
            Y.y r6 = r12.p()
            k0.i r1 = k0.h.e(r12, r1)
            J0.g$a r7 = J0.C1241g.f3853J
            yf.a r8 = r7.a()
            Y.f r9 = r12.j()
            if (r9 != 0) goto L_0x0114
            Y.C1494j.c()
        L_0x0114:
            r12.F()
            boolean r9 = r12.f()
            if (r9 == 0) goto L_0x0121
            r12.U(r8)
            goto L_0x0124
        L_0x0121:
            r12.q()
        L_0x0124:
            Y.m r8 = Y.F1.a(r12)
            yf.p r9 = r7.c()
            Y.F1.b(r8, r3, r9)
            yf.p r3 = r7.e()
            Y.F1.b(r8, r6, r3)
            yf.p r3 = r7.b()
            boolean r6 = r8.f()
            if (r6 != 0) goto L_0x014e
            java.lang.Object r6 = r8.A()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r9)
            if (r6 != 0) goto L_0x015c
        L_0x014e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r8.r(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.V(r4, r3)
        L_0x015c:
            yf.p r3 = r7.d()
            Y.F1.b(r8, r1, r3)
            C.k r1 = C.C1093k.f978a
            r1 = -1239346793(0xffffffffb6211197, float:-2.4001108E-6)
            r12.T(r1)
            if (r41 != 0) goto L_0x0171
            r42 = r11
            r11 = 6
            goto L_0x01a8
        L_0x0171:
            int r1 = r41.intValue()
            w0.c r4 = M0.e.c(r1, r12, r11)
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r12, r3)
            long r7 = r1.m700getPrimaryText0d7_KjU()
            k0.i$a r1 = k0.i.f23074a
            float r3 = (float) r5
            float r3 = c1.h.j(r3)
            k0.i r6 = androidx.compose.foundation.layout.q.n(r1, r3)
            r10 = 440(0x1b8, float:6.17E-43)
            r3 = 0
            r5 = 0
            r9 = r12
            r42 = r11
            r11 = r3
            V.V.a(r4, r5, r6, r7, r9, r10, r11)
            float r3 = (float) r13
            float r3 = c1.h.j(r3)
            k0.i r1 = androidx.compose.foundation.layout.q.i(r1, r3)
            r11 = 6
            C.a0.a(r1, r12, r11)
        L_0x01a8:
            r12.M()
            io.intercom.android.sdk.ui.theme.IntercomTheme r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r1 = r9.getTypography(r12, r10)
            Q0.T r20 = r1.getType03()
            b1.j$a r25 = b1.j.f19110b
            int r1 = r25.a()
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r9.getColors(r12, r10)
            long r3 = r3.m700getPrimaryText0d7_KjU()
            r8 = r2
            r2 = r3
            b1.j r1 = b1.j.h(r1)
            r7 = r12
            r12 = r1
            r22 = r16 & 14
            r23 = 0
            r24 = 65018(0xfdfa, float:9.111E-41)
            r1 = 0
            r4 = 0
            r6 = 0
            r16 = 0
            r48 = r7
            r7 = r16
            r43 = r8
            r8 = r16
            r16 = 0
            r44 = r9
            r45 = r10
            r9 = r16
            r16 = 0
            r17 = r11
            r11 = r16
            r18 = 0
            r46 = r14
            r13 = r18
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r47
            r21 = r48
            V.T0.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = -1239330071(0xffffffffb62152e9, float:-2.403913E-6)
            r1 = r48
            r1.T(r0)
            if (r40 != 0) goto L_0x0213
            r2 = 6
            goto L_0x0266
        L_0x0213:
            k0.i$a r0 = k0.i.f23074a
            r2 = 6
            float r3 = (float) r2
            float r3 = c1.h.j(r3)
            k0.i r0 = androidx.compose.foundation.layout.q.i(r0, r3)
            C.a0.a(r0, r1, r2)
            r0 = r44
            r3 = r45
            io.intercom.android.sdk.ui.theme.IntercomTypography r4 = r0.getTypography(r1, r3)
            Q0.T r35 = r4.getType04()
            int r4 = r25.a()
            io.intercom.android.sdk.ui.theme.IntercomColors r0 = r0.getColors(r1, r3)
            long r17 = r0.m700getPrimaryText0d7_KjU()
            b1.j r27 = b1.j.h(r4)
            r38 = 0
            r39 = 65018(0xfdfa, float:9.111E-41)
            r16 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r15 = r40
            r36 = r1
            V.T0.b(r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x0266:
            r1.M()
            r0 = -1239320282(0xffffffffb6217926, float:-2.4061387E-6)
            r1.T(r0)
            r11 = r43
            if (r11 != 0) goto L_0x0274
            goto L_0x028b
        L_0x0274:
            k0.i$a r0 = k0.i.f23074a
            r3 = 16
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r0 = androidx.compose.foundation.layout.q.i(r0, r3)
            C.a0.a(r0, r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r42)
            r11.invoke(r1, r0)
        L_0x028b:
            r1.M()
            r1.u()
            r5 = r11
            r3 = r40
            r4 = r41
            r2 = r46
        L_0x0298:
            Y.Y0 r8 = r1.k()
            if (r8 == 0) goto L_0x02ad
            io.intercom.android.sdk.m5.components.f0 r9 = new io.intercom.android.sdk.m5.components.f0
            r0 = r9
            r1 = r47
            r6 = r53
            r7 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.EmptyStateKt.EmptyState(java.lang.String, k0.i, java.lang.String, java.lang.Integer, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyState$lambda$4(String str, i iVar, String str2, Integer num, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$title");
        EmptyState(str, iVar, str2, num, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void EmptyStatePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1885515198);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$EmptyStateKt.INSTANCE.m158getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6026g0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyStatePreview$lambda$5(int i10, C1500m mVar, int i11) {
        EmptyStatePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void EmptyStateWithOutlinedButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-484307592);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$EmptyStateKt.INSTANCE.m161getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6022e0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyStateWithOutlinedButtonPreview$lambda$6(int i10, C1500m mVar, int i11) {
        EmptyStateWithOutlinedButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
