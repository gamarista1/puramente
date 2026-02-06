package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2547y0;
import r0.C2550z0;
import t0.C2605f;
import t0.C2606g;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a}\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lk0/i;", "modifier", "", "icon", "Lkotlin/Function0;", "Llf/M;", "avatarIcon", "iconModifier", "text", "", "textString", "subtitle", "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", "badge", "onClick", "HomeItem", "(Lk0/i;Ljava/lang/Integer;Lyf/p;Lk0/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;Lyf/a;LY/m;II)V", "HomeSendMessagePreview", "(LY/m;I)V", "HomeMessagesPreview", "HomeTicketsPreview", "HomeTicketsRTLPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeItemKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0635  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HomeItem(k0.i r44, java.lang.Integer r45, yf.p r46, k0.i r47, java.lang.Integer r48, java.lang.String r49, java.lang.String r50, io.intercom.android.sdk.m5.home.states.HomeItemBadge r51, yf.C6787a r52, Y.C1500m r53, int r54, int r55) {
        /*
            r10 = r54
            r11 = r55
            r1 = 8
            r2 = 128(0x80, float:1.794E-43)
            r4 = 32
            r5 = 48
            r6 = 16
            r7 = 2
            r8 = 6
            r9 = -360748364(0xffffffffea7f6ab4, float:-7.7194993E25)
            r12 = r53
            Y.m r9 = r12.h(r9)
            r12 = 1
            r13 = r11 & 1
            r14 = 4
            if (r13 == 0) goto L_0x0026
            r15 = r10 | 6
            r16 = r15
            r15 = r44
            goto L_0x003e
        L_0x0026:
            r15 = r10 & 14
            if (r15 != 0) goto L_0x003a
            r15 = r44
            boolean r16 = r9.S(r15)
            if (r16 == 0) goto L_0x0035
            r16 = r14
            goto L_0x0037
        L_0x0035:
            r16 = r7
        L_0x0037:
            r16 = r10 | r16
            goto L_0x003e
        L_0x003a:
            r15 = r44
            r16 = r10
        L_0x003e:
            r7 = r7 & r11
            if (r7 == 0) goto L_0x0048
            r16 = r16 | 48
            r8 = r45
        L_0x0045:
            r5 = r16
            goto L_0x005c
        L_0x0048:
            r17 = r10 & 112(0x70, float:1.57E-43)
            r8 = r45
            if (r17 != 0) goto L_0x0045
            boolean r17 = r9.S(r8)
            if (r17 == 0) goto L_0x0057
            r17 = r4
            goto L_0x0059
        L_0x0057:
            r17 = r6
        L_0x0059:
            r16 = r16 | r17
            goto L_0x0045
        L_0x005c:
            r16 = r11 & 4
            if (r16 == 0) goto L_0x0065
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0062:
            r14 = r46
            goto L_0x0078
        L_0x0065:
            r14 = r10 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x0062
            r14 = r46
            boolean r18 = r9.C(r14)
            if (r18 == 0) goto L_0x0074
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x0076
        L_0x0074:
            r18 = r2
        L_0x0076:
            r5 = r5 | r18
        L_0x0078:
            r18 = r11 & 8
            if (r18 == 0) goto L_0x0081
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x007e:
            r1 = r47
            goto L_0x0094
        L_0x0081:
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x007e
            r1 = r47
            boolean r19 = r9.S(r1)
            if (r19 == 0) goto L_0x0090
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x0092
        L_0x0090:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x0092:
            r5 = r5 | r19
        L_0x0094:
            r19 = r11 & 16
            if (r19 == 0) goto L_0x009d
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r0 = r48
            goto L_0x00b3
        L_0x009d:
            r20 = 57344(0xe000, float:8.0356E-41)
            r20 = r10 & r20
            r0 = r48
            if (r20 != 0) goto L_0x00b3
            boolean r21 = r9.S(r0)
            if (r21 == 0) goto L_0x00af
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b1
        L_0x00af:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00b1:
            r5 = r5 | r21
        L_0x00b3:
            r4 = r4 & r11
            if (r4 == 0) goto L_0x00bd
            r21 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r21
            r12 = r49
            goto L_0x00d2
        L_0x00bd:
            r21 = 458752(0x70000, float:6.42848E-40)
            r21 = r10 & r21
            r12 = r49
            if (r21 != 0) goto L_0x00d2
            boolean r21 = r9.S(r12)
            if (r21 == 0) goto L_0x00ce
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d0
        L_0x00ce:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x00d0:
            r5 = r5 | r21
        L_0x00d2:
            r21 = r11 & 64
            if (r21 == 0) goto L_0x00dd
            r22 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r22
            r6 = r50
            goto L_0x00f2
        L_0x00dd:
            r22 = 3670016(0x380000, float:5.142788E-39)
            r22 = r10 & r22
            r6 = r50
            if (r22 != 0) goto L_0x00f2
            boolean r23 = r9.S(r6)
            if (r23 == 0) goto L_0x00ee
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f0
        L_0x00ee:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00f0:
            r5 = r5 | r23
        L_0x00f2:
            r2 = r2 & r11
            if (r2 == 0) goto L_0x00fe
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r23
            r3 = r51
        L_0x00fb:
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0114
        L_0x00fe:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r10 & r23
            r3 = r51
            if (r23 != 0) goto L_0x00fb
            boolean r24 = r9.S(r3)
            if (r24 == 0) goto L_0x010f
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r5 = r5 | r24
            goto L_0x00fb
        L_0x0114:
            r0 = r0 & r11
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            if (r0 == 0) goto L_0x0120
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r24
            r1 = r52
            goto L_0x0133
        L_0x0120:
            r24 = r10 & r23
            r1 = r52
            if (r24 != 0) goto L_0x0133
            boolean r25 = r9.C(r1)
            if (r25 == 0) goto L_0x012f
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0131
        L_0x012f:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0131:
            r5 = r5 | r25
        L_0x0133:
            r25 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r5 & r25
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r3) goto L_0x0156
            boolean r1 = r9.i()
            if (r1 != 0) goto L_0x0144
            goto L_0x0156
        L_0x0144:
            r9.I()
            r4 = r47
            r5 = r48
            r39 = r52
            r7 = r6
            r2 = r8
            r6 = r12
            r3 = r14
            r1 = r15
            r8 = r51
            goto L_0x062f
        L_0x0156:
            if (r13 == 0) goto L_0x015b
            k0.i$a r1 = k0.i.f23074a
            goto L_0x015c
        L_0x015b:
            r1 = r15
        L_0x015c:
            r3 = 0
            if (r7 == 0) goto L_0x0160
            r8 = r3
        L_0x0160:
            if (r16 == 0) goto L_0x0169
            io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt r7 = io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt.INSTANCE
            yf.p r7 = r7.m169getLambda1$intercom_sdk_base_release()
            goto L_0x016a
        L_0x0169:
            r7 = r14
        L_0x016a:
            if (r18 == 0) goto L_0x017b
            k0.i$a r13 = k0.i.f23074a
            r14 = 16
            float r15 = (float) r14
            float r14 = c1.h.j(r15)
            k0.i r13 = androidx.compose.foundation.layout.q.n(r13, r14)
            r14 = r13
            goto L_0x017d
        L_0x017b:
            r14 = r47
        L_0x017d:
            if (r19 == 0) goto L_0x0182
            r37 = r3
            goto L_0x0184
        L_0x0182:
            r37 = r48
        L_0x0184:
            if (r4 == 0) goto L_0x0188
            r4 = r3
            goto L_0x0189
        L_0x0188:
            r4 = r12
        L_0x0189:
            if (r21 == 0) goto L_0x018c
            r6 = r3
        L_0x018c:
            if (r2 == 0) goto L_0x0191
            io.intercom.android.sdk.m5.home.states.HomeItemBadge$None r2 = io.intercom.android.sdk.m5.home.states.HomeItemBadge.None.INSTANCE
            goto L_0x0193
        L_0x0191:
            r2 = r51
        L_0x0193:
            if (r0 == 0) goto L_0x019b
            io.intercom.android.sdk.m5.components.w0 r0 = new io.intercom.android.sdk.m5.components.w0
            r0.<init>()
            goto L_0x019d
        L_0x019b:
            r0 = r52
        L_0x019d:
            r12 = 0
            r15 = 1
            k0.i r13 = androidx.compose.foundation.layout.q.h(r1, r12, r15, r3)
            r12 = -244013531(0xfffffffff174a625, float:-1.2114432E30)
            r9.T(r12)
            r12 = r5 & r23
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 != r15) goto L_0x01b1
            r12 = 1
            goto L_0x01b2
        L_0x01b1:
            r12 = 0
        L_0x01b2:
            java.lang.Object r15 = r9.A()
            if (r12 != 0) goto L_0x01c0
            Y.m$a r12 = Y.C1500m.f10026a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x01c8
        L_0x01c0:
            io.intercom.android.sdk.m5.components.x0 r15 = new io.intercom.android.sdk.m5.components.x0
            r15.<init>(r0)
            r9.r(r15)
        L_0x01c8:
            r12 = r15
            yf.a r12 = (yf.C6787a) r12
            r9.M()
            r15 = 7
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r44 = r13
            r45 = r18
            r46 = r19
            r47 = r21
            r48 = r12
            r49 = r15
            r50 = r16
            k0.i r12 = androidx.compose.foundation.d.d(r44, r45, r46, r47, r48, r49, r50)
            r13 = 16
            float r13 = (float) r13
            float r13 = c1.h.j(r13)
            r15 = 12
            float r3 = (float) r15
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.n.j(r12, r13, r3)
            k0.c$a r38 = k0.c.f23044a
            k0.c$c r12 = r38.i()
            C.c r15 = C.C1085c.f882a
            C.c$e r13 = r15.f()
            r39 = r0
            r0 = 48
            H0.F r0 = C.W.b(r13, r12, r9, r0)
            r12 = 0
            int r13 = Y.C1494j.a(r9, r12)
            Y.y r12 = r9.p()
            k0.i r3 = k0.h.e(r9, r3)
            J0.g$a r40 = J0.C1241g.f3853J
            r41 = r1
            yf.a r1 = r40.a()
            Y.f r16 = r9.j()
            if (r16 != 0) goto L_0x022d
            Y.C1494j.c()
        L_0x022d:
            r9.F()
            boolean r16 = r9.f()
            if (r16 == 0) goto L_0x023a
            r9.U(r1)
            goto L_0x023d
        L_0x023a:
            r9.q()
        L_0x023d:
            Y.m r1 = Y.F1.a(r9)
            yf.p r10 = r40.c()
            Y.F1.b(r1, r0, r10)
            yf.p r0 = r40.e()
            Y.F1.b(r1, r12, r0)
            yf.p r0 = r40.b()
            boolean r10 = r1.f()
            if (r10 != 0) goto L_0x0267
            java.lang.Object r10 = r1.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r12)
            if (r10 != 0) goto L_0x0275
        L_0x0267:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r1.r(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r1.V(r10, r0)
        L_0x0275:
            yf.p r0 = r40.d()
            Y.F1.b(r1, r3, r0)
            C.Z r0 = C.Z.f873a
            k0.i$a r1 = k0.i.f23074a
            r3 = 2
            r10 = 0
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            r44 = r0
            r45 = r1
            r46 = r12
            r47 = r13
            r48 = r3
            r49 = r10
            k0.i r3 = C.Y.b(r44, r45, r46, r47, r48, r49)
            r10 = 4
            float r10 = (float) r10
            float r10 = c1.h.j(r10)
            C.c$f r10 = r15.n(r10)
            k0.c$b r12 = r38.k()
            r13 = 6
            H0.F r10 = C.C1090h.a(r10, r12, r9, r13)
            r12 = 0
            int r13 = Y.C1494j.a(r9, r12)
            Y.y r12 = r9.p()
            k0.i r3 = k0.h.e(r9, r3)
            yf.a r11 = r40.a()
            Y.f r16 = r9.j()
            if (r16 != 0) goto L_0x02c2
            Y.C1494j.c()
        L_0x02c2:
            r9.F()
            boolean r16 = r9.f()
            if (r16 == 0) goto L_0x02cf
            r9.U(r11)
            goto L_0x02d2
        L_0x02cf:
            r9.q()
        L_0x02d2:
            Y.m r11 = Y.F1.a(r9)
            r44 = r14
            yf.p r14 = r40.c()
            Y.F1.b(r11, r10, r14)
            yf.p r10 = r40.e()
            Y.F1.b(r11, r12, r10)
            yf.p r10 = r40.b()
            boolean r12 = r11.f()
            if (r12 != 0) goto L_0x02fe
            java.lang.Object r12 = r11.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r14)
            if (r12 != 0) goto L_0x030c
        L_0x02fe:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r11.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r11.V(r12, r10)
        L_0x030c:
            yf.p r10 = r40.d()
            Y.F1.b(r11, r3, r10)
            C.k r3 = C.C1093k.f978a
            r3 = -1379228937(0xffffffffadcaa2f7, float:-2.3037112E-11)
            r9.T(r3)
            if (r37 == 0) goto L_0x032d
            int r3 = r37.intValue()
            r10 = 12
            int r10 = r5 >> 12
            r10 = r10 & 14
            java.lang.String r3 = M0.i.a(r3, r9, r10)
        L_0x032b:
            r12 = r3
            goto L_0x0333
        L_0x032d:
            if (r4 != 0) goto L_0x0332
            java.lang.String r3 = ""
            goto L_0x032b
        L_0x0332:
            r12 = r4
        L_0x0333:
            r9.M()
            io.intercom.android.sdk.ui.theme.IntercomTheme r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r11 = r3.getTypography(r9, r10)
            Q0.T r32 = r11.getType04SemiBold()
            b1.t$a r11 = b1.t.f19154a
            int r27 = r11.b()
            r35 = 3120(0xc30, float:4.372E-42)
            r36 = 55294(0xd7fe, float:7.7483E-41)
            r13 = 0
            r16 = 0
            r11 = r44
            r42 = r15
            r14 = r16
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 2
            r30 = 0
            r31 = 0
            r34 = 0
            r33 = r9
            V.T0.b(r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r12 = -1379221164(0xffffffffadcac154, float:-2.3050596E-11)
            r9.T(r12)
            if (r6 == 0) goto L_0x03ba
            io.intercom.android.sdk.ui.theme.IntercomTypography r12 = r3.getTypography(r9, r10)
            Q0.T r32 = r12.getType04()
            r12 = 4285887861(0xff757575, double:2.117509954E-314)
            long r14 = r0.C2550z0.d(r12)
            int r12 = r5 >> 18
            r12 = r12 & 14
            r12 = r12 | 384(0x180, float:5.38E-43)
            r34 = r12
            r35 = 0
            r36 = 65530(0xfffa, float:9.1827E-41)
            r13 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r12 = r6
            r33 = r9
            V.T0.b(r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x03ba:
            r9.M()
            r9.u()
            io.intercom.android.sdk.m5.home.states.HomeItemBadge$None r12 = io.intercom.android.sdk.m5.home.states.HomeItemBadge.None.INSTANCE
            boolean r12 = kotlin.jvm.internal.C6496s.c(r2, r12)
            if (r12 == 0) goto L_0x04a5
            r0 = 941879891(0x3823f253, float:3.908791E-5)
            r9.T(r0)
            k0.c$c r0 = r38.i()
            r12 = 8
            float r12 = (float) r12
            float r12 = c1.h.j(r12)
            r13 = r42
            C.c$f r12 = r13.n(r12)
            r13 = 54
            H0.F r0 = C.W.b(r12, r0, r9, r13)
            r12 = 0
            int r12 = Y.C1494j.a(r9, r12)
            Y.y r13 = r9.p()
            k0.i r1 = k0.h.e(r9, r1)
            yf.a r14 = r40.a()
            Y.f r15 = r9.j()
            if (r15 != 0) goto L_0x03ff
            Y.C1494j.c()
        L_0x03ff:
            r9.F()
            boolean r15 = r9.f()
            if (r15 == 0) goto L_0x040c
            r9.U(r14)
            goto L_0x040f
        L_0x040c:
            r9.q()
        L_0x040f:
            Y.m r14 = Y.F1.a(r9)
            yf.p r15 = r40.c()
            Y.F1.b(r14, r0, r15)
            yf.p r0 = r40.e()
            Y.F1.b(r14, r13, r0)
            yf.p r0 = r40.b()
            boolean r13 = r14.f()
            if (r13 != 0) goto L_0x0439
            java.lang.Object r13 = r14.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r13 = kotlin.jvm.internal.C6496s.c(r13, r15)
            if (r13 != 0) goto L_0x0447
        L_0x0439:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r14.r(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14.V(r12, r0)
        L_0x0447:
            yf.p r0 = r40.d()
            Y.F1.b(r14, r1, r0)
            r0 = 6
            int r0 = r5 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.invoke(r9, r0)
            r0 = -1379205196(0xffffffffadcaffb4, float:-2.3078296E-11)
            r9.T(r0)
            if (r8 != 0) goto L_0x0463
            goto L_0x0496
        L_0x0463:
            java.lang.String r0 = r8.toString()
            k0.i r0 = androidx.compose.ui.platform.n1.a(r11, r0)
            int r1 = r8.intValue()
            int r5 = r5 >> 3
            r5 = r5 & 14
            w0.c r1 = M0.e.c(r1, r9, r5)
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r9, r10)
            long r12 = r3.m673getActionContrastWhite0d7_KjU()
            r3 = 56
            r5 = 0
            r10 = 0
            r44 = r1
            r45 = r10
            r46 = r0
            r47 = r12
            r49 = r9
            r50 = r3
            r51 = r5
            V.V.a(r44, r45, r46, r47, r49, r50, r51)
            lf.M r0 = lf.C6514M.f71813a
        L_0x0496:
            r9.M()
            r9.u()
            r9.M()
            lf.M r0 = lf.C6514M.f71813a
            r53 = r4
            goto L_0x061e
        L_0x04a5:
            io.intercom.android.sdk.m5.home.states.HomeItemBadge$IconWithIndicator r12 = io.intercom.android.sdk.m5.home.states.HomeItemBadge.IconWithIndicator.INSTANCE
            boolean r12 = kotlin.jvm.internal.C6496s.c(r2, r12)
            if (r12 == 0) goto L_0x059c
            r0 = 942534549(0x382def95, float:4.1469542E-5)
            r9.T(r0)
            if (r8 != 0) goto L_0x04b9
            r53 = r4
            goto L_0x0597
        L_0x04b9:
            k0.c r0 = r38.o()
            r12 = 0
            H0.F r0 = androidx.compose.foundation.layout.d.h(r0, r12)
            int r13 = Y.C1494j.a(r9, r12)
            Y.y r12 = r9.p()
            k0.i r14 = k0.h.e(r9, r1)
            yf.a r15 = r40.a()
            Y.f r16 = r9.j()
            if (r16 != 0) goto L_0x04db
            Y.C1494j.c()
        L_0x04db:
            r9.F()
            boolean r16 = r9.f()
            if (r16 == 0) goto L_0x04e8
            r9.U(r15)
            goto L_0x04eb
        L_0x04e8:
            r9.q()
        L_0x04eb:
            Y.m r15 = Y.F1.a(r9)
            r53 = r4
            yf.p r4 = r40.c()
            Y.F1.b(r15, r0, r4)
            yf.p r0 = r40.e()
            Y.F1.b(r15, r12, r0)
            yf.p r0 = r40.b()
            boolean r4 = r15.f()
            if (r4 != 0) goto L_0x0517
            java.lang.Object r4 = r15.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r12)
            if (r4 != 0) goto L_0x0525
        L_0x0517:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r15.r(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r15.V(r4, r0)
        L_0x0525:
            yf.p r0 = r40.d()
            Y.F1.b(r15, r14, r0)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            io.intercom.android.sdk.m5.shapes.CutIconWithIndicatorShape r4 = new io.intercom.android.sdk.m5.shapes.CutIconWithIndicatorShape
            r12 = 1
            r13 = 0
            r14 = 0
            r4.<init>(r14, r12, r13)
            k0.i r4 = o0.C2342e.a(r11, r4)
            java.lang.String r12 = r8.toString()
            k0.i r4 = androidx.compose.ui.platform.n1.a(r4, r12)
            int r12 = r8.intValue()
            int r5 = r5 >> 3
            r5 = r5 & 14
            w0.c r5 = M0.e.c(r12, r9, r5)
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r9, r10)
            long r12 = r3.m673getActionContrastWhite0d7_KjU()
            r3 = 56
            r10 = 0
            r14 = 0
            r44 = r5
            r45 = r14
            r46 = r4
            r47 = r12
            r49 = r9
            r50 = r3
            r51 = r10
            V.V.a(r44, r45, r46, r47, r49, r50, r51)
            r3 = 4292544041(0xffdb0629, double:2.120798544E-314)
            long r3 = r0.C2550z0.d(r3)
            I.f r5 = I.g.e()
            k0.i r1 = androidx.compose.foundation.b.c(r1, r3, r5)
            r3 = 7
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r1 = androidx.compose.foundation.layout.q.n(r1, r3)
            k0.c r3 = r38.n()
            k0.i r0 = r0.e(r1, r3)
            r1 = 0
            androidx.compose.foundation.layout.d.a(r0, r9, r1)
            r9.u()
            lf.M r0 = lf.C6514M.f71813a
        L_0x0597:
            r9.M()
            goto L_0x061e
        L_0x059c:
            r53 = r4
            boolean r3 = r2 instanceof io.intercom.android.sdk.m5.home.states.HomeItemBadge.IndicatorWithCount
            if (r3 == 0) goto L_0x0645
            r3 = 943331838(0x383a19fe, float:4.4370063E-5)
            r9.T(r3)
            r3 = 6
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            r4 = 11
            r5 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r44 = r1
            r45 = r10
            r46 = r12
            r47 = r3
            r48 = r13
            r49 = r4
            r50 = r5
            k0.i r1 = androidx.compose.foundation.layout.n.m(r44, r45, r46, r47, r48, r49, r50)
            io.intercom.android.sdk.m5.components.y0 r3 = new io.intercom.android.sdk.m5.components.y0
            r3.<init>()
            k0.i r1 = androidx.compose.ui.draw.b.b(r1, r3)
            k0.c$c r3 = r38.i()
            k0.i r13 = r0.c(r1, r3)
            r0 = r2
            io.intercom.android.sdk.m5.home.states.HomeItemBadge$IndicatorWithCount r0 = (io.intercom.android.sdk.m5.home.states.HomeItemBadge.IndicatorWithCount) r0
            int r0 = r0.getCount()
            java.lang.String r12 = java.lang.String.valueOf(r0)
            r0.x0$a r0 = r0.C2544x0.f25560b
            long r14 = r0.i()
            r0 = 11
            long r16 = c1.w.f(r0)
            V0.p$a r0 = V0.p.f8210b
            V0.p r19 = r0.g()
            r35 = 0
            r36 = 131024(0x1ffd0, float:1.83604E-40)
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 200064(0x30d80, float:2.8035E-40)
            r33 = r9
            V.T0.b(r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r9.M()
            lf.M r0 = lf.C6514M.f71813a
        L_0x061e:
            r9.u()
            r3 = r7
            r4 = r11
            r5 = r37
            r1 = r41
            r7 = r6
            r6 = r53
            r43 = r8
            r8 = r2
            r2 = r43
        L_0x062f:
            Y.Y0 r12 = r9.k()
            if (r12 == 0) goto L_0x0644
            io.intercom.android.sdk.m5.components.z0 r13 = new io.intercom.android.sdk.m5.components.z0
            r0 = r13
            r9 = r39
            r10 = r54
            r11 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0644:
            return
        L_0x0645:
            r0 = 861667097(0x335bff19, float:5.122192E-8)
            r9.T(r0)
            r9.M()
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.HomeItemKt.HomeItem(k0.i, java.lang.Integer, yf.p, k0.i, java.lang.Integer, java.lang.String, java.lang.String, io.intercom.android.sdk.m5.home.states.HomeItemBadge, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeItem$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeItem$lambda$10(i iVar, Integer num, p pVar, i iVar2, Integer num2, String str, String str2, HomeItemBadge homeItemBadge, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        HomeItem(iVar, num, pVar, iVar2, num2, str, str2, homeItemBadge, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeItem$lambda$2$lambda$1(C6787a aVar) {
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeItem$lambda$9$lambda$8(C2605f fVar) {
        C6496s.h(fVar, "$this$drawBehind");
        C2605f.n0(fVar, C2550z0.d(4292544041L), 22.0f, 0, 0.0f, (C2606g) null, (C2547y0) null, 0, 124, (Object) null);
        return C6514M.f71813a;
    }

    private static final void HomeMessagesPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1318695433);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeItemKt.INSTANCE.m173getLambda5$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6049s0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeMessagesPreview$lambda$12(int i10, C1500m mVar, int i11) {
        HomeMessagesPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void HomeSendMessagePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(861055120);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeItemKt.INSTANCE.m171getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6051t0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeSendMessagePreview$lambda$11(int i10, C1500m mVar, int i11) {
        HomeSendMessagePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void HomeTicketsPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-279860840);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeItemKt.INSTANCE.m175getLambda7$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6055v0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeTicketsPreview$lambda$13(int i10, C1500m mVar, int i11) {
        HomeTicketsPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void HomeTicketsRTLPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1844314002);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HomeItemKt.INSTANCE.m177getLambda9$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6053u0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeTicketsRTLPreview$lambda$14(int i10, C1500m mVar, int i11) {
        HomeTicketsRTLPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
