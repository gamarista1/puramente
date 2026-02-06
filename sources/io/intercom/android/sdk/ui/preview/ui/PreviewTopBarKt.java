package io.intercom.android.sdk.ui.preview.ui;

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
import yf.C6787a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aq\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk0/i;", "modifier", "", "showDeleteAction", "showSendAction", "showDownloadAction", "Lkotlin/Function0;", "Llf/M;", "onBackCLick", "onDeleteClick", "onSendClick", "onDownloadClick", "PreviewTopBar", "(Lk0/i;ZZZLyf/a;Lyf/a;Lyf/a;Lyf/a;LY/m;II)V", "PreviewTopBarPreview", "(LY/m;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PreviewTopBarKt {
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void PreviewTopBar(k0.i r37, boolean r38, boolean r39, boolean r40, yf.C6787a r41, yf.C6787a r42, yf.C6787a r43, yf.C6787a r44, Y.C1500m r45, int r46, int r47) {
        /*
            r2 = r38
            r12 = r41
            r13 = r42
            r14 = r46
            r15 = r47
            r0 = 128(0x80, float:1.794E-43)
            r1 = 16
            r3 = 32
            r11 = 48
            r4 = 2
            r5 = 4
            java.lang.String r6 = "onBackCLick"
            kotlin.jvm.internal.C6496s.h(r12, r6)
            java.lang.String r6 = "onDeleteClick"
            kotlin.jvm.internal.C6496s.h(r13, r6)
            r6 = 312640005(0x12a28205, float:1.025569E-27)
            r7 = r45
            Y.m r10 = r7.h(r6)
            r6 = 1
            r7 = r15 & 1
            if (r7 == 0) goto L_0x0032
            r8 = r14 | 6
            r9 = r8
            r8 = r37
            goto L_0x0046
        L_0x0032:
            r8 = r14 & 14
            if (r8 != 0) goto L_0x0043
            r8 = r37
            boolean r9 = r10.S(r8)
            if (r9 == 0) goto L_0x0040
            r9 = r5
            goto L_0x0041
        L_0x0040:
            r9 = r4
        L_0x0041:
            r9 = r9 | r14
            goto L_0x0046
        L_0x0043:
            r8 = r37
            r9 = r14
        L_0x0046:
            r4 = r4 & r15
            if (r4 == 0) goto L_0x004b
            r9 = r9 | r11
            goto L_0x0059
        L_0x004b:
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0059
            boolean r4 = r10.b(r2)
            if (r4 == 0) goto L_0x0057
            r4 = r3
            goto L_0x0058
        L_0x0057:
            r4 = r1
        L_0x0058:
            r9 = r9 | r4
        L_0x0059:
            r4 = r15 & 4
            if (r4 == 0) goto L_0x0062
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x005f:
            r5 = r39
            goto L_0x0075
        L_0x0062:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r39
            boolean r16 = r10.b(r5)
            if (r16 == 0) goto L_0x0071
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r16 = r0
        L_0x0073:
            r9 = r9 | r16
        L_0x0075:
            r16 = r15 & 8
            if (r16 == 0) goto L_0x007e
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x007b:
            r11 = r40
            goto L_0x0091
        L_0x007e:
            r11 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007b
            r11 = r40
            boolean r18 = r10.b(r11)
            if (r18 == 0) goto L_0x008d
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r9 = r9 | r18
        L_0x0091:
            r1 = r1 & r15
            if (r1 == 0) goto L_0x0097
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a9
        L_0x0097:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r14
            if (r1 != 0) goto L_0x00a9
            boolean r1 = r10.C(r12)
            if (r1 == 0) goto L_0x00a6
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r9 = r9 | r1
        L_0x00a9:
            r1 = r15 & 32
            r25 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00b2
            r9 = r9 | r25
            goto L_0x00c3
        L_0x00b2:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r14
            if (r1 != 0) goto L_0x00c3
            boolean r1 = r10.C(r13)
            if (r1 == 0) goto L_0x00c0
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r9 = r9 | r1
        L_0x00c3:
            r1 = r15 & 64
            if (r1 == 0) goto L_0x00cd
            r3 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 | r3
        L_0x00ca:
            r3 = r43
            goto L_0x00e1
        L_0x00cd:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x00ca
            r3 = r43
            boolean r18 = r10.C(r3)
            if (r18 == 0) goto L_0x00dd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r9 = r9 | r18
        L_0x00e1:
            r0 = r0 & r15
            if (r0 == 0) goto L_0x00ed
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 | r18
            r6 = r44
        L_0x00ea:
            r26 = r9
            goto L_0x0103
        L_0x00ed:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r14 & r18
            r6 = r44
            if (r18 != 0) goto L_0x00ea
            boolean r18 = r10.C(r6)
            if (r18 == 0) goto L_0x00fe
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r9 = r9 | r18
            goto L_0x00ea
        L_0x0103:
            r9 = 23967451(0x16db6db, float:4.3661218E-38)
            r9 = r26 & r9
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r9 != r3) goto L_0x0120
            boolean r3 = r10.i()
            if (r3 != 0) goto L_0x0114
            goto L_0x0120
        L_0x0114:
            r10.I()
            r7 = r43
            r3 = r5
            r1 = r8
            r12 = r10
            r4 = r11
            r8 = r6
            goto L_0x0308
        L_0x0120:
            if (r7 == 0) goto L_0x0126
            k0.i$a r3 = k0.i.f23074a
            r9 = r3
            goto L_0x0127
        L_0x0126:
            r9 = r8
        L_0x0127:
            r8 = 0
            if (r4 == 0) goto L_0x012d
            r27 = r8
            goto L_0x012f
        L_0x012d:
            r27 = r5
        L_0x012f:
            if (r16 == 0) goto L_0x0134
            r28 = r8
            goto L_0x0136
        L_0x0134:
            r28 = r11
        L_0x0136:
            if (r1 == 0) goto L_0x013e
            io.intercom.android.sdk.ui.preview.ui.x r1 = new io.intercom.android.sdk.ui.preview.ui.x
            r1.<init>()
            goto L_0x0140
        L_0x013e:
            r1 = r43
        L_0x0140:
            if (r0 == 0) goto L_0x0148
            io.intercom.android.sdk.ui.preview.ui.y r0 = new io.intercom.android.sdk.ui.preview.ui.y
            r0.<init>()
            goto L_0x0149
        L_0x0148:
            r0 = r6
        L_0x0149:
            r3 = 0
            r4 = 0
            r5 = 1
            k0.i r3 = androidx.compose.foundation.layout.q.h(r9, r3, r5, r4)
            r5 = 3
            k0.i r18 = androidx.compose.foundation.layout.q.v(r3, r4, r8, r5, r4)
            r0.x0$a r3 = r0.C2544x0.f25560b
            long r29 = r3.a()
            r35 = 14
            r36 = 0
            r31 = 1056964608(0x3f000000, float:0.5)
            r32 = 0
            r33 = 0
            r34 = 0
            long r19 = r0.C2544x0.o(r29, r31, r32, r33, r34, r35, r36)
            r22 = 2
            r23 = 0
            r21 = 0
            k0.i r3 = androidx.compose.foundation.b.d(r18, r19, r21, r22, r23)
            k0.c$a r16 = k0.c.f23044a
            k0.c$c r4 = r16.i()
            C.c r18 = C.C1085c.f882a
            C.c$f r5 = r18.d()
            r6 = 54
            H0.F r4 = C.W.b(r5, r4, r10, r6)
            int r5 = Y.C1494j.a(r10, r8)
            Y.y r6 = r10.p()
            k0.i r3 = k0.h.e(r10, r3)
            J0.g$a r19 = J0.C1241g.f3853J
            yf.a r7 = r19.a()
            Y.f r11 = r10.j()
            if (r11 != 0) goto L_0x01a2
            Y.C1494j.c()
        L_0x01a2:
            r10.F()
            boolean r11 = r10.f()
            if (r11 == 0) goto L_0x01af
            r10.U(r7)
            goto L_0x01b2
        L_0x01af:
            r10.q()
        L_0x01b2:
            Y.m r7 = Y.F1.a(r10)
            yf.p r11 = r19.c()
            Y.F1.b(r7, r4, r11)
            yf.p r4 = r19.e()
            Y.F1.b(r7, r6, r4)
            yf.p r4 = r19.b()
            boolean r6 = r7.f()
            if (r6 != 0) goto L_0x01dc
            java.lang.Object r6 = r7.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r11)
            if (r6 != 0) goto L_0x01ea
        L_0x01dc:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7.r(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.V(r5, r4)
        L_0x01ea:
            yf.p r4 = r19.d()
            Y.F1.b(r7, r3, r4)
            C.Z r3 = C.Z.f873a
            io.intercom.android.sdk.ui.preview.ui.ComposableSingletons$PreviewTopBarKt r29 = io.intercom.android.sdk.ui.preview.ui.ComposableSingletons$PreviewTopBarKt.INSTANCE
            yf.p r11 = r29.m607getLambda1$intercom_sdk_ui_release()
            int r3 = r26 >> 12
            r3 = r3 & 14
            r20 = r3 | r25
            r21 = 30
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r41
            r8 = r11
            r30 = r9
            r9 = r10
            r11 = r10
            r10 = r20
            r12 = r11
            r13 = 48
            r11 = r21
            V.U.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            k0.c$c r3 = r16.i()
            k0.i$a r4 = k0.i.f23074a
            C.c$e r5 = r18.f()
            H0.F r3 = C.W.b(r5, r3, r12, r13)
            r5 = 0
            int r5 = Y.C1494j.a(r12, r5)
            Y.y r6 = r12.p()
            k0.i r4 = k0.h.e(r12, r4)
            yf.a r7 = r19.a()
            Y.f r8 = r12.j()
            if (r8 != 0) goto L_0x023e
            Y.C1494j.c()
        L_0x023e:
            r12.F()
            boolean r8 = r12.f()
            if (r8 == 0) goto L_0x024b
            r12.U(r7)
            goto L_0x024e
        L_0x024b:
            r12.q()
        L_0x024e:
            Y.m r7 = Y.F1.a(r12)
            yf.p r8 = r19.c()
            Y.F1.b(r7, r3, r8)
            yf.p r3 = r19.e()
            Y.F1.b(r7, r6, r3)
            yf.p r3 = r19.b()
            boolean r6 = r7.f()
            if (r6 != 0) goto L_0x0278
            java.lang.Object r6 = r7.A()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r8)
            if (r6 != 0) goto L_0x0286
        L_0x0278:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7.r(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.V(r5, r3)
        L_0x0286:
            yf.p r3 = r19.d()
            Y.F1.b(r7, r4, r3)
            r3 = 881566524(0x348ba33c, float:2.6009536E-7)
            r12.T(r3)
            if (r2 == 0) goto L_0x02ab
            yf.p r8 = r29.m608getLambda2$intercom_sdk_ui_release()
            int r3 = r26 >> 15
            r3 = r3 & 14
            r10 = r3 | r25
            r11 = 30
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r42
            r9 = r12
            V.U.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x02ab:
            r12.M()
            r3 = 881579446(0x348bd5b6, float:2.6046263E-7)
            r12.T(r3)
            if (r27 == 0) goto L_0x02d1
            yf.p r21 = r29.m609getLambda3$intercom_sdk_ui_release()
            int r3 = r26 >> 18
            r3 = r3 & 14
            r23 = r3 | r25
            r24 = 30
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r1
            r22 = r12
            V.U.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x02d1:
            r12.M()
            r3 = 881592201(0x348c0789, float:2.6082515E-7)
            r12.T(r3)
            if (r28 == 0) goto L_0x02f7
            yf.p r21 = r29.m610getLambda4$intercom_sdk_ui_release()
            int r3 = r26 >> 21
            r3 = r3 & 14
            r23 = r3 | r25
            r24 = 30
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r0
            r22 = r12
            V.U.b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x02f7:
            r12.M()
            r12.u()
            r12.u()
            r8 = r0
            r7 = r1
            r3 = r27
            r4 = r28
            r1 = r30
        L_0x0308:
            Y.Y0 r11 = r12.k()
            if (r11 == 0) goto L_0x0321
            io.intercom.android.sdk.ui.preview.ui.z r12 = new io.intercom.android.sdk.ui.preview.ui.z
            r0 = r12
            r2 = r38
            r5 = r41
            r6 = r42
            r9 = r46
            r10 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0321:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.ui.PreviewTopBarKt.PreviewTopBar(k0.i, boolean, boolean, boolean, yf.a, yf.a, yf.a, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewTopBar$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewTopBar$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewTopBar$lambda$4(i iVar, boolean z10, boolean z11, boolean z12, C6787a aVar, C6787a aVar2, C6787a aVar3, C6787a aVar4, int i10, int i11, C1500m mVar, int i12) {
        C6787a aVar5 = aVar;
        C6496s.h(aVar5, "$onBackCLick");
        C6787a aVar6 = aVar2;
        C6496s.h(aVar6, "$onDeleteClick");
        PreviewTopBar(iVar, z10, z11, z12, aVar5, aVar6, aVar3, aVar4, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PreviewTopBarPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1899188968);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$PreviewTopBarKt.INSTANCE.m612getLambda6$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new A(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewTopBarPreview$lambda$5(int i10, C1500m mVar, int i11) {
        PreviewTopBarPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
