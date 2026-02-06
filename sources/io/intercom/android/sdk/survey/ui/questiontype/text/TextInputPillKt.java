package io.intercom.android.sdk.survey.ui.questiontype.text;

import H.b;
import J.C1225v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import p0.l;
import qf.C6658d;
import qf.g;
import r0.C2544x0;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a¹\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u000f\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u000f\u0010 \u001a\u00020\u0004H\u0001¢\u0006\u0004\b \u0010\u001d\u001a\u000f\u0010!\u001a\u00020\u0004H\u0001¢\u0006\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"", "text", "placeholderText", "Lkotlin/Function1;", "Llf/M;", "onTextChanged", "Lr0/x0;", "strokeColor", "cursorColor", "", "maxLines", "", "singleLine", "LJ/v;", "onImeActionNext", "LW0/y;", "keyboardType", "LW0/r;", "imeAction", "showTrailingIcon", "Lkotlin/Function0;", "leadingIcon", "enabled", "Lc1/h;", "minHeight", "TextInputPill-g5ZjG94", "(Ljava/lang/String;Ljava/lang/String;Lyf/l;Lr0/x0;JIZLyf/l;IIZLyf/p;ZFLY/m;III)V", "TextInputPill", "TextInputPillPlaceholder", "(LY/m;I)V", "TextInputPillUnchecked", "TextInputPillValidated", "TextInputPillError", "TextInputPillDisabled", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextInputPillKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0134  */
    /* renamed from: TextInputPill-g5ZjG94  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m517TextInputPillg5ZjG94(java.lang.String r123, java.lang.String r124, yf.C6798l r125, r0.C2544x0 r126, long r127, int r129, boolean r130, yf.C6798l r131, int r132, int r133, boolean r134, yf.p r135, boolean r136, float r137, Y.C1500m r138, int r139, int r140, int r141) {
        /*
            r8 = r125
            r3 = r139
            r1 = r140
            r0 = r141
            java.lang.String r2 = "onTextChanged"
            kotlin.jvm.internal.C6496s.h(r8, r2)
            r2 = 701760197(0x29d402c5, float:9.415172E-14)
            r4 = r138
            Y.m r14 = r4.h(r2)
            r2 = r0 & 1
            if (r2 == 0) goto L_0x0020
            r6 = r3 | 6
            r7 = r6
            r6 = r123
            goto L_0x0034
        L_0x0020:
            r6 = r3 & 14
            if (r6 != 0) goto L_0x0031
            r6 = r123
            boolean r7 = r14.S(r6)
            if (r7 == 0) goto L_0x002e
            r7 = 4
            goto L_0x002f
        L_0x002e:
            r7 = 2
        L_0x002f:
            r7 = r7 | r3
            goto L_0x0034
        L_0x0031:
            r6 = r123
            r7 = r3
        L_0x0034:
            r9 = r0 & 2
            if (r9 == 0) goto L_0x003d
            r7 = r7 | 48
        L_0x003a:
            r12 = r124
            goto L_0x004f
        L_0x003d:
            r12 = r3 & 112(0x70, float:1.57E-43)
            if (r12 != 0) goto L_0x003a
            r12 = r124
            boolean r13 = r14.S(r12)
            if (r13 == 0) goto L_0x004c
            r13 = 32
            goto L_0x004e
        L_0x004c:
            r13 = 16
        L_0x004e:
            r7 = r7 | r13
        L_0x004f:
            r13 = r0 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0058
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r13 = r3 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x0068
            boolean r13 = r14.C(r8)
            if (r13 == 0) goto L_0x0065
            r13 = r16
            goto L_0x0067
        L_0x0065:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r7 = r7 | r13
        L_0x0068:
            r13 = r0 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0075
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0072:
            r4 = r126
            goto L_0x0088
        L_0x0075:
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0072
            r4 = r126
            boolean r19 = r14.S(r4)
            if (r19 == 0) goto L_0x0084
            r19 = r18
            goto L_0x0086
        L_0x0084:
            r19 = r17
        L_0x0086:
            r7 = r7 | r19
        L_0x0088:
            r19 = r0 & 16
            if (r19 == 0) goto L_0x0091
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r11 = r127
            goto L_0x00a7
        L_0x0091:
            r19 = 57344(0xe000, float:8.0356E-41)
            r19 = r3 & r19
            r11 = r127
            if (r19 != 0) goto L_0x00a7
            boolean r20 = r14.e(r11)
            if (r20 == 0) goto L_0x00a3
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r7 = r7 | r20
        L_0x00a7:
            r20 = r0 & 32
            if (r20 == 0) goto L_0x00b2
            r21 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r21
            r5 = r129
            goto L_0x00c7
        L_0x00b2:
            r21 = 458752(0x70000, float:6.42848E-40)
            r21 = r3 & r21
            r5 = r129
            if (r21 != 0) goto L_0x00c7
            boolean r22 = r14.d(r5)
            if (r22 == 0) goto L_0x00c3
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r7 = r7 | r22
        L_0x00c7:
            r22 = r0 & 64
            if (r22 == 0) goto L_0x00d2
            r23 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r23
            r10 = r130
            goto L_0x00e7
        L_0x00d2:
            r23 = 3670016(0x380000, float:5.142788E-39)
            r23 = r3 & r23
            r10 = r130
            if (r23 != 0) goto L_0x00e7
            boolean r24 = r14.b(r10)
            if (r24 == 0) goto L_0x00e3
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e5
        L_0x00e3:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00e5:
            r7 = r7 | r24
        L_0x00e7:
            r15 = r0 & 128(0x80, float:1.794E-43)
            r109 = 29360128(0x1c00000, float:7.052966E-38)
            if (r15 == 0) goto L_0x00f4
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 | r25
            r4 = r131
            goto L_0x0107
        L_0x00f4:
            r25 = r3 & r109
            r4 = r131
            if (r25 != 0) goto L_0x0107
            boolean r25 = r14.C(r4)
            if (r25 == 0) goto L_0x0103
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r7 = r7 | r25
        L_0x0107:
            r4 = r0 & 256(0x100, float:3.59E-43)
            r110 = 234881024(0xe000000, float:1.5777218E-30)
            if (r4 == 0) goto L_0x0114
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 | r25
            r5 = r132
            goto L_0x0127
        L_0x0114:
            r25 = r3 & r110
            r5 = r132
            if (r25 != 0) goto L_0x0127
            boolean r25 = r14.d(r5)
            if (r25 == 0) goto L_0x0123
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r7 = r7 | r25
        L_0x0127:
            r5 = r0 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0134
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 | r25
            r3 = r133
        L_0x0131:
            r111 = r7
            goto L_0x014a
        L_0x0134:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r3 & r25
            r3 = r133
            if (r25 != 0) goto L_0x0131
            boolean r25 = r14.d(r3)
            if (r25 == 0) goto L_0x0145
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0147
        L_0x0145:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0147:
            r7 = r7 | r25
            goto L_0x0131
        L_0x014a:
            r7 = r0 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0153
            r21 = r1 | 6
            r3 = r134
            goto L_0x0169
        L_0x0153:
            r25 = r1 & 14
            r3 = r134
            if (r25 != 0) goto L_0x0167
            boolean r25 = r14.b(r3)
            if (r25 == 0) goto L_0x0162
            r21 = 4
            goto L_0x0164
        L_0x0162:
            r21 = 2
        L_0x0164:
            r21 = r1 | r21
            goto L_0x0169
        L_0x0167:
            r21 = r1
        L_0x0169:
            r3 = r0 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0172
            r21 = r21 | 48
        L_0x016f:
            r6 = r21
            goto L_0x0186
        L_0x0172:
            r25 = r1 & 112(0x70, float:1.57E-43)
            r6 = r135
            if (r25 != 0) goto L_0x016f
            boolean r25 = r14.C(r6)
            if (r25 == 0) goto L_0x0181
            r19 = 32
            goto L_0x0183
        L_0x0181:
            r19 = 16
        L_0x0183:
            r21 = r21 | r19
            goto L_0x016f
        L_0x0186:
            r8 = r0 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x018c:
            r10 = r136
            goto L_0x01a0
        L_0x018f:
            r10 = r1 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x018c
            r10 = r136
            boolean r19 = r14.b(r10)
            if (r19 == 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r16 = 128(0x80, float:1.794E-43)
        L_0x019e:
            r6 = r6 | r16
        L_0x01a0:
            r10 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a9
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x01a6:
            r0 = r137
            goto L_0x01b9
        L_0x01a9:
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x01a6
            r0 = r137
            boolean r16 = r14.c(r0)
            if (r16 == 0) goto L_0x01b7
            r17 = r18
        L_0x01b7:
            r6 = r6 | r17
        L_0x01b9:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r111 & r16
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r1) goto L_0x01ef
            r0 = r6 & 5851(0x16db, float:8.199E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r0 != r1) goto L_0x01ef
            boolean r0 = r14.i()
            if (r0 != 0) goto L_0x01d0
            goto L_0x01ef
        L_0x01d0:
            r14.I()
            r1 = r123
            r2 = r124
            r4 = r126
            r7 = r129
            r8 = r130
            r9 = r131
            r10 = r132
            r11 = r133
            r12 = r134
            r13 = r135
            r15 = r137
            r29 = r14
            r14 = r136
            goto L_0x046e
        L_0x01ef:
            if (r2 == 0) goto L_0x01f6
            java.lang.String r0 = ""
            r112 = r0
            goto L_0x01f8
        L_0x01f6:
            r112 = r123
        L_0x01f8:
            if (r9 == 0) goto L_0x01fe
            java.lang.String r0 = ""
            r1 = r0
            goto L_0x0200
        L_0x01fe:
            r1 = r124
        L_0x0200:
            r0 = 0
            if (r13 == 0) goto L_0x0206
            r113 = r0
            goto L_0x0208
        L_0x0206:
            r113 = r126
        L_0x0208:
            if (r20 == 0) goto L_0x0210
            r2 = 2147483647(0x7fffffff, float:NaN)
            r114 = r2
            goto L_0x0212
        L_0x0210:
            r114 = r129
        L_0x0212:
            if (r22 == 0) goto L_0x0218
            r2 = 0
            r115 = r2
            goto L_0x021a
        L_0x0218:
            r115 = r130
        L_0x021a:
            if (r15 == 0) goto L_0x0224
            io.intercom.android.sdk.survey.ui.questiontype.text.A r2 = new io.intercom.android.sdk.survey.ui.questiontype.text.A
            r2.<init>()
            r116 = r2
            goto L_0x0226
        L_0x0224:
            r116 = r131
        L_0x0226:
            if (r4 == 0) goto L_0x0231
            W0.y$a r2 = W0.C1456y.f8623b
            int r2 = r2.h()
            r117 = r2
            goto L_0x0233
        L_0x0231:
            r117 = r132
        L_0x0233:
            if (r5 == 0) goto L_0x023e
            W0.r$a r2 = W0.r.f8593b
            int r2 = r2.a()
            r118 = r2
            goto L_0x0240
        L_0x023e:
            r118 = r133
        L_0x0240:
            if (r7 == 0) goto L_0x0245
            r2 = 0
            r13 = r2
            goto L_0x0247
        L_0x0245:
            r13 = r134
        L_0x0247:
            if (r3 == 0) goto L_0x024c
            r119 = r0
            goto L_0x024e
        L_0x024c:
            r119 = r135
        L_0x024e:
            r3 = 1
            if (r8 == 0) goto L_0x0254
            r120 = r3
            goto L_0x0256
        L_0x0254:
            r120 = r136
        L_0x0256:
            if (r10 == 0) goto L_0x0260
            c1.h$a r2 = c1.h.f19213b
            float r2 = r2.c()
            r8 = r2
            goto L_0x0262
        L_0x0260:
            r8 = r137
        L_0x0262:
            r2 = -652106389(0xffffffffd921a56b, float:-2.84370939E15)
            r14.T(r2)
            if (r113 != 0) goto L_0x0293
            io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r2.getColors(r14, r4)
            long r4 = r2.m700getPrimaryText0d7_KjU()
            r2 = 14
            r7 = 0
            r9 = 1036831949(0x3dcccccd, float:0.1)
            r10 = 0
            r15 = 0
            r16 = 0
            r129 = r4
            r131 = r9
            r132 = r10
            r133 = r15
            r134 = r16
            r135 = r2
            r136 = r7
            long r4 = r0.C2544x0.o(r129, r131, r132, r133, r134, r135, r136)
            goto L_0x0297
        L_0x0293:
            long r4 = r113.y()
        L_0x0297:
            r14.M()
            r2 = -652100754(0xffffffffd921bb6e, float:-2.84522202E15)
            r14.T(r2)
            java.lang.Object r2 = r14.A()
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r9 = r7.a()
            if (r2 != r9) goto L_0x02b3
            H.b r2 = androidx.compose.foundation.relocation.b.a()
            r14.r(r2)
        L_0x02b3:
            H.b r2 = (H.b) r2
            r14.M()
            java.lang.Object r9 = r14.A()
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x02d0
            qf.h r7 = qf.h.f72645a
            Ug.K r7 = Y.P.j(r7, r14)
            Y.B r9 = new Y.B
            r9.<init>(r7)
            r14.r(r9)
        L_0x02d0:
            Y.B r9 = (Y.B) r9
            Ug.K r7 = r9.a()
            k0.i$a r9 = k0.i.f23074a
            r10 = 0
            k0.i r9 = androidx.compose.foundation.layout.q.h(r9, r10, r3, r0)
            k0.i r0 = androidx.compose.foundation.layout.q.b(r9, r10, r8, r3, r0)
            float r9 = (float) r3
            float r9 = c1.h.j(r9)
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            V.B0 r16 = r10.getShapes(r14, r15)
            I.a r3 = r16.e()
            k0.i r0 = x.C2866e.f(r0, r9, r4, r3)
            V.B0 r3 = r10.getShapes(r14, r15)
            I.a r3 = r3.e()
            k0.i r0 = o0.C2342e.a(r0, r3)
            k0.i r0 = androidx.compose.foundation.relocation.b.b(r0, r2)
            io.intercom.android.sdk.survey.ui.questiontype.text.B r3 = new io.intercom.android.sdk.survey.ui.questiontype.text.B
            r3.<init>(r7, r2)
            k0.i r2 = androidx.compose.ui.focus.e.a(r0, r3)
            V.Q0 r0 = V.Q0.f6883a
            r3 = 6
            V.P0 r20 = r0.c(r14, r3)
            r0.x0$a r0 = r0.C2544x0.f25560b
            long r42 = r0.g()
            long r44 = r0.g()
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r10.getColors(r14, r15)
            long r29 = r3.m678getBackground0d7_KjU()
            r3 = 4294638330(0xfffafafa, double:2.12183326E-314)
            long r33 = r0.C2550z0.d(r3)
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r10.getColors(r14, r15)
            long r31 = r3.m678getBackground0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r10.getColors(r14, r15)
            long r35 = r3.m678getBackground0d7_KjU()
            r3 = 4285756278(0xff737376, double:2.1174449434E-314)
            long r25 = r0.C2550z0.d(r3)
            long r46 = r0.g()
            r107 = 2047(0x7ff, float:2.868E-42)
            r108 = 0
            r21 = 0
            r23 = 0
            r27 = 0
            r39 = 0
            r41 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r102 = 0
            r104 = 0
            r106 = -14837(0xffffffffffffc60b, float:NaN)
            r37 = r127
            V.P0 r22 = V.P0.c(r20, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r104, r106, r107, r108)
            J.x r0 = new J.x
            r3 = r15
            r15 = r0
            r4 = 115(0x73, float:1.61E-43)
            r5 = 0
            r7 = 0
            r9 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r129 = r0
            r130 = r7
            r131 = r9
            r132 = r117
            r133 = r118
            r134 = r16
            r135 = r17
            r136 = r18
            r137 = r4
            r138 = r5
            r129.<init>(r130, r131, r132, r133, r134, r135, r136, r137, r138)
            J.w r0 = new J.w
            r16 = r0
            r4 = 59
            r7 = 0
            r19 = 0
            r129 = r0
            r130 = r7
            r132 = r116
            r133 = r17
            r134 = r18
            r135 = r19
            r136 = r4
            r137 = r5
            r129.<init>(r130, r131, r132, r133, r134, r135, r136, r137)
            V.B0 r0 = r10.getShapes(r14, r3)
            I.a r21 = r0.e()
            io.intercom.android.sdk.ui.theme.IntercomTypography r0 = r10.getTypography(r14, r3)
            Q0.T r5 = r0.getType04()
            io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3 r0 = new io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
            r0.<init>(r1)
            r3 = 54
            r4 = -712506390(0xffffffffd58803ea, float:-1.8693799E13)
            r9 = 1
            g0.a r7 = g0.c.e(r4, r9, r0, r14, r3)
            io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4 r0 = new io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
            r0.<init>(r13)
            r4 = 583948524(0x22ce58ec, float:5.593056E-18)
            g0.a r9 = g0.c.e(r4, r9, r0, r14, r3)
            r0 = 817889280(0x30c00000, float:1.3969839E-9)
            r3 = r111 & 14
            r0 = r0 | r3
            int r3 = r111 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r6 << 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            int r3 = r6 << 21
            r3 = r3 & r110
            r24 = r0 | r3
            int r0 = r111 << 3
            r0 = r0 & r109
            int r3 = r111 << 9
            r3 = r3 & r110
            r25 = r0 | r3
            r26 = 0
            r27 = 1604688(0x187c50, float:2.248647E-39)
            r4 = 0
            r6 = 0
            r10 = 0
            r0 = 0
            r11 = r0
            r12 = 0
            r0 = 0
            r28 = r13
            r13 = r0
            r0 = 0
            r29 = r14
            r14 = r0
            r19 = 0
            r20 = 0
            r0 = r112
            r30 = r1
            r1 = r125
            r3 = r120
            r31 = r8
            r8 = r119
            r17 = r115
            r18 = r114
            r23 = r29
            V.R0.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12 = r28
            r2 = r30
            r15 = r31
            r1 = r112
            r4 = r113
            r7 = r114
            r8 = r115
            r9 = r116
            r10 = r117
            r11 = r118
            r13 = r119
            r14 = r120
        L_0x046e:
            Y.Y0 r5 = r29.k()
            if (r5 == 0) goto L_0x048f
            io.intercom.android.sdk.survey.ui.questiontype.text.C r6 = new io.intercom.android.sdk.survey.ui.questiontype.text.C
            r0 = r6
            r3 = r125
            r121 = r5
            r122 = r6
            r5 = r127
            r16 = r139
            r17 = r140
            r18 = r141
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r121
            r1 = r122
            r0.a(r1)
        L_0x048f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt.m517TextInputPillg5ZjG94(java.lang.String, java.lang.String, yf.l, r0.x0, long, int, boolean, yf.l, int, int, boolean, yf.p, boolean, float, Y.m, int, int, int):void");
    }

    public static final void TextInputPillDisabled(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1100722979);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextInputPillKt.INSTANCE.m516getLambda5$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPillDisabled$lambda$8(int i10, C1500m mVar, int i11) {
        TextInputPillDisabled(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TextInputPillError(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-175520743);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextInputPillKt.INSTANCE.m515getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPillError$lambda$7(int i10, C1500m mVar, int i11) {
        TextInputPillError(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TextInputPillPlaceholder(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1437391364);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextInputPillKt.INSTANCE.m512getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPillPlaceholder$lambda$4(int i10, C1500m mVar, int i11) {
        TextInputPillPlaceholder(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TextInputPillUnchecked(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-869352961);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextInputPillKt.INSTANCE.m513getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new y(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPillUnchecked$lambda$5(int i10, C1500m mVar, int i11) {
        TextInputPillUnchecked(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TextInputPillValidated(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(559292703);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextInputPillKt.INSTANCE.m514getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new z(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPillValidated$lambda$6(int i10, C1500m mVar, int i11) {
        TextInputPillValidated(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPill_g5ZjG94$lambda$0(C1225v vVar) {
        C6496s.h(vVar, "<this>");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPill_g5ZjG94$lambda$2(K k10, b bVar, l lVar) {
        C6496s.h(k10, "$coroutineScope");
        C6496s.h(bVar, "$bringIntoViewRequester");
        C6496s.h(lVar, "it");
        if (lVar.a()) {
            C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new TextInputPillKt$TextInputPill$2$1(bVar, (C6658d<? super TextInputPillKt$TextInputPill$2$1>) null), 3, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextInputPill_g5ZjG94$lambda$3(String str, String str2, C6798l lVar, C2544x0 x0Var, long j10, int i10, boolean z10, C6798l lVar2, int i11, int i12, boolean z11, p pVar, boolean z12, float f10, int i13, int i14, int i15, C1500m mVar, int i16) {
        String str3 = str;
        String str4 = str2;
        C6496s.h(lVar, "$onTextChanged");
        String str5 = str;
        String str6 = str2;
        m517TextInputPillg5ZjG94(str5, str6, lVar, x0Var, j10, i10, z10, lVar2, i11, i12, z11, pVar, z12, f10, mVar, M0.a(i13 | 1), M0.a(i14), i15);
        return C6514M.f71813a;
    }
}
