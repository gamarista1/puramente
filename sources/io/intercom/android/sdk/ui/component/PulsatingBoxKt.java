package io.intercom.android.sdk.ui.component;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import yf.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lk0/i;", "modifier", "", "pulseSize", "Lr0/x0;", "pulseColor", "Lr0/g2;", "pulseShape", "", "enabled", "Lkotlin/Function1;", "LC/d;", "Llf/M;", "content", "PulsatingBox-FU0evQE", "(Lk0/i;FJLr0/g2;ZLyf/q;LY/m;II)V", "PulsatingBox", "PulsatingBoxPreview", "(LY/m;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PulsatingBoxKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018c  */
    /* renamed from: PulsatingBox-FU0evQE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m606PulsatingBoxFU0evQE(k0.i r19, float r20, long r21, r0.g2 r23, boolean r24, yf.q r25, Y.C1500m r26, int r27, int r28) {
        /*
            r2 = r20
            r10 = r25
            r11 = r27
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            r0 = -63498318(0xfffffffffc3717b2, float:-3.8026837E36)
            r1 = r26
            Y.m r0 = r1.h(r0)
            r1 = r28 & 1
            r3 = 2
            if (r1 == 0) goto L_0x001f
            r4 = r11 | 6
            r5 = r4
            r4 = r19
            goto L_0x0033
        L_0x001f:
            r4 = r11 & 14
            if (r4 != 0) goto L_0x0030
            r4 = r19
            boolean r5 = r0.S(r4)
            if (r5 == 0) goto L_0x002d
            r5 = 4
            goto L_0x002e
        L_0x002d:
            r5 = r3
        L_0x002e:
            r5 = r5 | r11
            goto L_0x0033
        L_0x0030:
            r4 = r19
            r5 = r11
        L_0x0033:
            r6 = r28 & 2
            if (r6 == 0) goto L_0x003a
            r5 = r5 | 48
            goto L_0x004a
        L_0x003a:
            r6 = r11 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004a
            boolean r6 = r0.c(r2)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r5 = r5 | r6
        L_0x004a:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0063
            r6 = r28 & 4
            if (r6 != 0) goto L_0x005d
            r6 = r21
            boolean r8 = r0.e(r6)
            if (r8 == 0) goto L_0x005f
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005d:
            r6 = r21
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r5 = r5 | r8
            goto L_0x0065
        L_0x0063:
            r6 = r21
        L_0x0065:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007e
            r8 = r28 & 8
            if (r8 != 0) goto L_0x0078
            r8 = r23
            boolean r9 = r0.S(r8)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x0078:
            r8 = r23
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r5 = r5 | r9
            goto L_0x0080
        L_0x007e:
            r8 = r23
        L_0x0080:
            r9 = r28 & 16
            if (r9 == 0) goto L_0x0089
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r12 = r24
            goto L_0x009d
        L_0x0089:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r11
            if (r12 != 0) goto L_0x0086
            r12 = r24
            boolean r13 = r0.b(r12)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r5 = r5 | r13
        L_0x009d:
            r13 = r28 & 32
            if (r13 == 0) goto L_0x00a5
            r13 = 196608(0x30000, float:2.75506E-40)
        L_0x00a3:
            r5 = r5 | r13
            goto L_0x00b6
        L_0x00a5:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00b6
            boolean r13 = r0.C(r10)
            if (r13 == 0) goto L_0x00b3
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a3
        L_0x00b3:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a3
        L_0x00b6:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r5
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00cf
            boolean r13 = r0.i()
            if (r13 != 0) goto L_0x00c6
            goto L_0x00cf
        L_0x00c6:
            r0.I()
            r1 = r4
            r3 = r6
            r5 = r8
            r6 = r12
            goto L_0x0186
        L_0x00cf:
            r0.D()
            r13 = r11 & 1
            r14 = 1
            if (r13 == 0) goto L_0x00f5
            boolean r13 = r0.L()
            if (r13 == 0) goto L_0x00de
            goto L_0x00f5
        L_0x00de:
            r0.I()
            r1 = r28 & 4
            if (r1 == 0) goto L_0x00e7
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e7:
            r1 = r28 & 8
            if (r1 == 0) goto L_0x00ed
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ed:
            r1 = r4
            r17 = r5
        L_0x00f0:
            r15 = r8
            r16 = r12
            r12 = r6
            goto L_0x0121
        L_0x00f5:
            if (r1 == 0) goto L_0x00fa
            k0.i$a r1 = k0.i.f23074a
            goto L_0x00fb
        L_0x00fa:
            r1 = r4
        L_0x00fb:
            r4 = r28 & 4
            if (r4 == 0) goto L_0x010c
            io.intercom.android.sdk.ui.theme.IntercomTheme r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            r6 = 6
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r4.getColors(r0, r6)
            long r6 = r4.m672getAction0d7_KjU()
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x010c:
            r4 = r28 & 8
            if (r4 == 0) goto L_0x0119
            r4 = 50
            I.f r4 = I.g.a(r4)
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r4
        L_0x0119:
            r17 = r5
            if (r9 == 0) goto L_0x00f0
            r12 = r6
            r15 = r8
            r16 = r14
        L_0x0121:
            r0.v()
            r4 = -1108114118(0xffffffffbdf3853a, float:-0.11890645)
            r0.T(r4)
            java.lang.Object r4 = r0.A()
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            r6 = 0
            if (r4 != r5) goto L_0x0141
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            w.a r4 = w.C2784b.b(r4, r5, r3, r6)
            r0.r(r4)
        L_0x0141:
            r5 = r4
            w.a r5 = (w.C2782a) r5
            r0.M()
            java.lang.Float r3 = java.lang.Float.valueOf(r20)
            io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$1 r4 = new io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$1
            r4.<init>(r5, r2, r6)
            int r6 = r17 >> 3
            r6 = r6 & 14
            r6 = r6 | 64
            Y.P.g(r3, r4, r0, r6)
            k0.c$a r3 = k0.c.f23044a
            k0.c r18 = r3.e()
            io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2 r9 = new io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
            r3 = r9
            r4 = r16
            r6 = r15
            r7 = r12
            r2 = r9
            r9 = r25
            r3.<init>(r4, r5, r6, r7, r9)
            r3 = 54
            r4 = 526284572(0x1f5e771c, float:4.7108854E-20)
            g0.a r6 = g0.c.e(r4, r14, r2, r0, r3)
            r2 = r17 & 14
            r8 = r2 | 3120(0xc30, float:4.372E-42)
            r9 = 4
            r5 = 0
            r3 = r1
            r4 = r18
            r7 = r0
            C.C1087e.a(r3, r4, r5, r6, r7, r8, r9)
            r3 = r12
            r5 = r15
            r6 = r16
        L_0x0186:
            Y.Y0 r12 = r0.k()
            if (r12 == 0) goto L_0x019d
            io.intercom.android.sdk.ui.component.K r13 = new io.intercom.android.sdk.ui.component.K
            r0 = r13
            r2 = r20
            r7 = r25
            r8 = r27
            r9 = r28
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            r12.a(r13)
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.PulsatingBoxKt.m606PulsatingBoxFU0evQE(k0.i, float, long, r0.g2, boolean, yf.q, Y.m, int, int):void");
    }

    private static final void PulsatingBoxPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2057763747);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$PulsatingBoxKt.INSTANCE.m581getLambda2$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new L(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PulsatingBoxPreview$lambda$2(int i10, C1500m mVar, int i11) {
        PulsatingBoxPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PulsatingBox_FU0evQE$lambda$1(i iVar, float f10, long j10, g2 g2Var, boolean z10, q qVar, int i10, int i11, C1500m mVar, int i12) {
        q qVar2 = qVar;
        C6496s.h(qVar2, "$content");
        m606PulsatingBoxFU0evQE(iVar, f10, j10, g2Var, z10, qVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
