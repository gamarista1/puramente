package io.intercom.android.sdk.m5.home.ui.components;

import Q0.L;
import Q0.T;
import V.B0;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import t0.C2602c;
import yf.C6798l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aG\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk0/i;", "modifier", "", "text", "Lr0/x0;", "color", "LQ0/T;", "style", "Lkotlin/Function1;", "", "Llf/M;", "onTextWrap", "WrapReportingText-T042LqI", "(Lk0/i;Ljava/lang/String;JLQ0/T;Lyf/l;LY/m;II)V", "WrapReportingText", "PreviewShortText", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WrapReportingTextKt {
    private static final void PreviewShortText(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(381018303);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$WrapReportingTextKt.INSTANCE.m380getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewShortText$lambda$7(int i10, C1500m mVar, int i11) {
        PreviewShortText(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: io.intercom.android.sdk.m5.home.ui.components.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: WrapReportingText-T042LqI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m381WrapReportingTextT042LqI(k0.i r28, java.lang.String r29, long r30, Q0.T r32, yf.C6798l r33, Y.C1500m r34, int r35, int r36) {
        /*
            r2 = r29
            r3 = r32
            r1 = r35
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            r0 = 834036955(0x31b664db, float:5.308363E-9)
            r4 = r34
            Y.m r0 = r4.h(r0)
            r4 = r36 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0024
            r6 = r1 | 6
            r7 = r6
            r6 = r28
            goto L_0x0038
        L_0x0024:
            r6 = r1 & 14
            if (r6 != 0) goto L_0x0035
            r6 = r28
            boolean r7 = r0.S(r6)
            if (r7 == 0) goto L_0x0032
            r7 = 4
            goto L_0x0033
        L_0x0032:
            r7 = r5
        L_0x0033:
            r7 = r7 | r1
            goto L_0x0038
        L_0x0035:
            r6 = r28
            r7 = r1
        L_0x0038:
            r8 = r36 & 2
            if (r8 == 0) goto L_0x003f
            r7 = r7 | 48
            goto L_0x004f
        L_0x003f:
            r8 = r1 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004f
            boolean r8 = r0.S(r2)
            if (r8 == 0) goto L_0x004c
            r8 = 32
            goto L_0x004e
        L_0x004c:
            r8 = 16
        L_0x004e:
            r7 = r7 | r8
        L_0x004f:
            r8 = r36 & 4
            if (r8 == 0) goto L_0x0058
            r7 = r7 | 384(0x180, float:5.38E-43)
            r13 = r30
            goto L_0x006a
        L_0x0058:
            r8 = r1 & 896(0x380, float:1.256E-42)
            r13 = r30
            if (r8 != 0) goto L_0x006a
            boolean r8 = r0.e(r13)
            if (r8 == 0) goto L_0x0067
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r7 = r7 | r8
        L_0x006a:
            r8 = r36 & 8
            if (r8 == 0) goto L_0x0071
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r8 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            boolean r8 = r0.S(r3)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r7 = r7 | r8
        L_0x0081:
            r8 = r36 & 16
            r9 = 16384(0x4000, float:2.2959E-41)
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008f
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x008c:
            r11 = r33
            goto L_0x00a0
        L_0x008f:
            r11 = r1 & r10
            if (r11 != 0) goto L_0x008c
            r11 = r33
            boolean r12 = r0.C(r11)
            if (r12 == 0) goto L_0x009d
            r12 = r9
            goto L_0x009f
        L_0x009d:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r7 = r7 | r12
        L_0x00a0:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r7
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r15) goto L_0x00b8
            boolean r12 = r0.i()
            if (r12 != 0) goto L_0x00af
            goto L_0x00b8
        L_0x00af:
            r0.I()
            r27 = r0
            r1 = r6
            r6 = r11
            goto L_0x0172
        L_0x00b8:
            if (r4 == 0) goto L_0x00be
            k0.i$a r4 = k0.i.f23074a
            r15 = r4
            goto L_0x00bf
        L_0x00be:
            r15 = r6
        L_0x00bf:
            if (r8 == 0) goto L_0x00c8
            io.intercom.android.sdk.m5.home.ui.components.x r4 = new io.intercom.android.sdk.m5.home.ui.components.x
            r4.<init>()
            r12 = r4
            goto L_0x00c9
        L_0x00c8:
            r12 = r11
        L_0x00c9:
            r4 = 1070301976(0x3fcb8318, float:1.5899382)
            r0.T(r4)
            java.lang.Object r4 = r0.A()
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r8 = r6.a()
            if (r4 != r8) goto L_0x00e5
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r8 = 0
            Y.r0 r4 = Y.u1.d(r4, r8, r5, r8)
            r0.r(r4)
        L_0x00e5:
            Y.r0 r4 = (Y.C1510r0) r4
            r0.M()
            r5 = 1070306974(0x3fcb969e, float:1.590534)
            r0.T(r5)
            java.lang.Object r5 = r0.A()
            java.lang.Object r8 = r6.a()
            if (r5 != r8) goto L_0x0102
            io.intercom.android.sdk.m5.home.ui.components.y r5 = new io.intercom.android.sdk.m5.home.ui.components.y
            r5.<init>(r4)
            r0.r(r5)
        L_0x0102:
            yf.l r5 = (yf.C6798l) r5
            r0.M()
            k0.i r20 = androidx.compose.ui.draw.b.d(r15, r5)
            r5 = 1070309155(0x3fcb9f23, float:1.590794)
            r0.T(r5)
            r5 = r7 & r10
            if (r5 != r9) goto L_0x0117
            r5 = 1
            goto L_0x0118
        L_0x0117:
            r5 = 0
        L_0x0118:
            java.lang.Object r8 = r0.A()
            if (r5 != 0) goto L_0x0124
            java.lang.Object r5 = r6.a()
            if (r8 != r5) goto L_0x012c
        L_0x0124:
            io.intercom.android.sdk.m5.home.ui.components.z r8 = new io.intercom.android.sdk.m5.home.ui.components.z
            r8.<init>(r12, r4)
            r0.r(r8)
        L_0x012c:
            r19 = r8
            yf.l r19 = (yf.C6798l) r19
            r0.M()
            int r4 = r7 >> 3
            r4 = r4 & 14
            r5 = r7 & 896(0x380, float:1.256E-42)
            r22 = r4 | r5
            int r4 = r7 << 9
            r5 = 3670016(0x380000, float:5.142788E-39)
            r23 = r4 & r5
            r24 = 32760(0x7ff8, float:4.5907E-41)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r25 = r12
            r12 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r26 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r27 = r0
            r0 = r29
            r1 = r20
            r2 = r30
            r20 = r32
            r21 = r27
            V.T0.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6 = r25
            r1 = r26
        L_0x0172:
            Y.Y0 r9 = r27.k()
            if (r9 == 0) goto L_0x018b
            io.intercom.android.sdk.m5.home.ui.components.A r10 = new io.intercom.android.sdk.m5.home.ui.components.A
            r0 = r10
            r2 = r29
            r3 = r30
            r5 = r32
            r7 = r35
            r8 = r36
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r9.a(r10)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt.m381WrapReportingTextT042LqI(k0.i, java.lang.String, long, Q0.T, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M WrapReportingText_T042LqI$lambda$0(boolean z10) {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M WrapReportingText_T042LqI$lambda$3$lambda$2(C1510r0 r0Var, C2602c cVar) {
        C6496s.h(r0Var, "$readyToDraw");
        C6496s.h(cVar, "$this$drawWithContent");
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            cVar.H1();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M WrapReportingText_T042LqI$lambda$5$lambda$4(C6798l lVar, C1510r0 r0Var, L l10) {
        C6496s.h(r0Var, "$readyToDraw");
        C6496s.h(l10, "textLayoutResult");
        boolean z10 = true;
        if (l10.n() <= 1) {
            z10 = false;
        }
        lVar.invoke(Boolean.valueOf(z10));
        r0Var.setValue(Boolean.TRUE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M WrapReportingText_T042LqI$lambda$6(i iVar, String str, long j10, T t10, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        C6496s.h(t10, "$style");
        m381WrapReportingTextT042LqI(iVar, str, j10, t10, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
