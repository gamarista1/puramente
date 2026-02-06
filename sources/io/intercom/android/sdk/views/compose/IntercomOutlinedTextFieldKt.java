package io.intercom.android.sdk.views.compose;

import B.l;
import C.N;
import J.C1226w;
import J.C1227x;
import O0.v;
import Q0.T;
import V.P0;
import W0.c0;
import Y.C1500m;
import Y.M0;
import c1.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000j\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0002\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b$\u0010%\"\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"", "value", "Lkotlin/Function1;", "Llf/M;", "onValueChange", "Lk0/i;", "modifier", "", "enabled", "readOnly", "LQ0/T;", "textStyle", "Lkotlin/Function0;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "LW0/c0;", "visualTransformation", "LJ/x;", "keyboardOptions", "LJ/w;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "LB/l;", "interactionSource", "Lr0/g2;", "shape", "LV/P0;", "colors", "LC/N;", "contentPadding", "IntercomOutlinedTextField", "(Ljava/lang/String;Lyf/l;Lk0/i;ZZLQ0/T;Lyf/p;Lyf/p;Lyf/p;Lyf/p;ZLW0/c0;LJ/x;LJ/w;ZIILB/l;Lr0/g2;LV/P0;LC/N;LY/m;IIII)V", "Lc1/h;", "OutlinedTextFieldTopPadding", "F", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomOutlinedTextFieldKt {
    private static final float OutlinedTextFieldTopPadding = h.j((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IntercomOutlinedTextField(java.lang.String r121, yf.C6798l r122, k0.i r123, boolean r124, boolean r125, Q0.T r126, yf.p r127, yf.p r128, yf.p r129, yf.p r130, boolean r131, W0.c0 r132, J.C1227x r133, J.C1226w r134, boolean r135, int r136, int r137, B.l r138, r0.g2 r139, V.P0 r140, C.N r141, Y.C1500m r142, int r143, int r144, int r145, int r146) {
        /*
            r1 = r121
            r2 = r122
            r15 = r143
            r14 = r144
            r13 = r146
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = 967048125(0x39a3fbbd, float:3.1277342E-4)
            r3 = r142
            Y.m r0 = r3.h(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0024
            r3 = r15 | 6
            goto L_0x0034
        L_0x0024:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0033
            boolean r3 = r0.S(r1)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r15
            goto L_0x0034
        L_0x0033:
            r3 = r15
        L_0x0034:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x003b
            r3 = r3 | 48
            goto L_0x004b
        L_0x003b:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004b
            boolean r6 = r0.C(r2)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r11 = r123
            goto L_0x0066
        L_0x0054:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0051
            r11 = r123
            boolean r12 = r0.S(r11)
            if (r12 == 0) goto L_0x0063
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r12
        L_0x0066:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0073
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r4 = r124
            goto L_0x0086
        L_0x0073:
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0070
            r4 = r124
            boolean r18 = r0.b(r4)
            if (r18 == 0) goto L_0x0082
            r18 = r17
            goto L_0x0084
        L_0x0082:
            r18 = r16
        L_0x0084:
            r3 = r3 | r18
        L_0x0086:
            r18 = r13 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x0093
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r7 = r125
            goto L_0x00a9
        L_0x0093:
            r21 = 57344(0xe000, float:8.0356E-41)
            r21 = r15 & r21
            r7 = r125
            if (r21 != 0) goto L_0x00a9
            boolean r22 = r0.b(r7)
            if (r22 == 0) goto L_0x00a5
            r22 = r20
            goto L_0x00a7
        L_0x00a5:
            r22 = r19
        L_0x00a7:
            r3 = r3 | r22
        L_0x00a9:
            r22 = 458752(0x70000, float:6.42848E-40)
            r22 = r15 & r22
            r23 = 65536(0x10000, float:9.18355E-41)
            r24 = 131072(0x20000, float:1.83671E-40)
            if (r22 != 0) goto L_0x00c7
            r22 = r13 & 32
            r8 = r126
            if (r22 != 0) goto L_0x00c2
            boolean r25 = r0.S(r8)
            if (r25 == 0) goto L_0x00c2
            r25 = r24
            goto L_0x00c4
        L_0x00c2:
            r25 = r23
        L_0x00c4:
            r3 = r3 | r25
            goto L_0x00c9
        L_0x00c7:
            r8 = r126
        L_0x00c9:
            r25 = r13 & 64
            r26 = 1048576(0x100000, float:1.469368E-39)
            r27 = 3670016(0x380000, float:5.142788E-39)
            r28 = 524288(0x80000, float:7.34684E-40)
            if (r25 == 0) goto L_0x00da
            r29 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r29
            r9 = r127
            goto L_0x00ed
        L_0x00da:
            r29 = r15 & r27
            r9 = r127
            if (r29 != 0) goto L_0x00ed
            boolean r30 = r0.C(r9)
            if (r30 == 0) goto L_0x00e9
            r30 = r26
            goto L_0x00eb
        L_0x00e9:
            r30 = r28
        L_0x00eb:
            r3 = r3 | r30
        L_0x00ed:
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00f8
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r31
            r5 = r128
            goto L_0x010d
        L_0x00f8:
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            r31 = r15 & r31
            r5 = r128
            if (r31 != 0) goto L_0x010d
            boolean r32 = r0.C(r5)
            if (r32 == 0) goto L_0x0109
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010b
        L_0x0109:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x010b:
            r3 = r3 | r32
        L_0x010d:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0118
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r32
            r2 = r129
            goto L_0x012d
        L_0x0118:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r15 & r32
            r2 = r129
            if (r32 != 0) goto L_0x012d
            boolean r32 = r0.C(r2)
            if (r32 == 0) goto L_0x0129
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012b
        L_0x0129:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012b:
            r3 = r3 | r32
        L_0x012d:
            r2 = r13 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0138
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r32
            r4 = r130
            goto L_0x014d
        L_0x0138:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r15 & r32
            r4 = r130
            if (r32 != 0) goto L_0x014d
            boolean r32 = r0.C(r4)
            if (r32 == 0) goto L_0x0149
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014b
        L_0x0149:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014b:
            r3 = r3 | r32
        L_0x014d:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0156
            r32 = r14 | 6
            r5 = r131
            goto L_0x016c
        L_0x0156:
            r32 = r14 & 14
            r5 = r131
            if (r32 != 0) goto L_0x016a
            boolean r32 = r0.b(r5)
            if (r32 == 0) goto L_0x0165
            r32 = 4
            goto L_0x0167
        L_0x0165:
            r32 = 2
        L_0x0167:
            r32 = r14 | r32
            goto L_0x016c
        L_0x016a:
            r32 = r14
        L_0x016c:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0175
            r32 = r32 | 48
        L_0x0172:
            r7 = r32
            goto L_0x0189
        L_0x0175:
            r33 = r14 & 112(0x70, float:1.57E-43)
            r7 = r132
            if (r33 != 0) goto L_0x0172
            boolean r33 = r0.S(r7)
            if (r33 == 0) goto L_0x0184
            r22 = 32
            goto L_0x0186
        L_0x0184:
            r22 = 16
        L_0x0186:
            r32 = r32 | r22
            goto L_0x0172
        L_0x0189:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0192
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x018f:
            r9 = r133
            goto L_0x01a5
        L_0x0192:
            r9 = r14 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x018f
            r9 = r133
            boolean r21 = r0.S(r9)
            if (r21 == 0) goto L_0x01a1
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x01a3
        L_0x01a1:
            r29 = 128(0x80, float:1.794E-43)
        L_0x01a3:
            r7 = r7 | r29
        L_0x01a5:
            r9 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x01ae
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x01ab:
            r11 = r134
            goto L_0x01be
        L_0x01ae:
            r11 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01ab
            r11 = r134
            boolean r21 = r0.S(r11)
            if (r21 == 0) goto L_0x01bc
            r16 = r17
        L_0x01bc:
            r7 = r7 | r16
        L_0x01be:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c9
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x01c4:
            r16 = r11
            r11 = r135
            goto L_0x01de
        L_0x01c9:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x01c4
            r16 = r11
            r11 = r135
            boolean r17 = r0.b(r11)
            if (r17 == 0) goto L_0x01dc
            r19 = r20
        L_0x01dc:
            r7 = r7 | r19
        L_0x01de:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r14 & r17
            if (r17 != 0) goto L_0x01fb
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r13 & r17
            r11 = r136
            if (r17 != 0) goto L_0x01f6
            boolean r17 = r0.d(r11)
            if (r17 == 0) goto L_0x01f6
            r17 = r24
            goto L_0x01f8
        L_0x01f6:
            r17 = r23
        L_0x01f8:
            r7 = r7 | r17
            goto L_0x01fd
        L_0x01fb:
            r11 = r136
        L_0x01fd:
            r17 = r13 & r23
            if (r17 == 0) goto L_0x0208
            r19 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r19
            r11 = r137
            goto L_0x021b
        L_0x0208:
            r19 = r14 & r27
            r11 = r137
            if (r19 != 0) goto L_0x021b
            boolean r19 = r0.d(r11)
            if (r19 == 0) goto L_0x0217
            r19 = r26
            goto L_0x0219
        L_0x0217:
            r19 = r28
        L_0x0219:
            r7 = r7 | r19
        L_0x021b:
            r19 = r13 & r24
            if (r19 == 0) goto L_0x0226
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 | r20
            r11 = r138
            goto L_0x023b
        L_0x0226:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r14 & r20
            r11 = r138
            if (r20 != 0) goto L_0x023b
            boolean r20 = r0.S(r11)
            if (r20 == 0) goto L_0x0237
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0239
        L_0x0237:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x0239:
            r7 = r7 | r20
        L_0x023b:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r20 = r14 & r20
            if (r20 != 0) goto L_0x0257
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r13 & r20
            r11 = r139
            if (r20 != 0) goto L_0x0252
            boolean r20 = r0.S(r11)
            if (r20 == 0) goto L_0x0252
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0254
        L_0x0252:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0254:
            r7 = r7 | r20
            goto L_0x0259
        L_0x0257:
            r11 = r139
        L_0x0259:
            r20 = 1879048192(0x70000000, float:1.58456325E29)
            r20 = r14 & r20
            if (r20 != 0) goto L_0x0273
            r20 = r13 & r28
            r11 = r140
            if (r20 != 0) goto L_0x026e
            boolean r20 = r0.S(r11)
            if (r20 == 0) goto L_0x026e
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0270
        L_0x026e:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0270:
            r7 = r7 | r20
            goto L_0x0275
        L_0x0273:
            r11 = r140
        L_0x0275:
            r20 = r13 & r26
            if (r20 == 0) goto L_0x027e
            r21 = r145 | 6
            r11 = r141
            goto L_0x0294
        L_0x027e:
            r21 = r145 & 14
            r11 = r141
            if (r21 != 0) goto L_0x0292
            boolean r21 = r0.S(r11)
            if (r21 == 0) goto L_0x028d
            r21 = 4
            goto L_0x028f
        L_0x028d:
            r21 = 2
        L_0x028f:
            r21 = r145 | r21
            goto L_0x0294
        L_0x0292:
            r21 = r145
        L_0x0294:
            r22 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r3 & r22
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r14) goto L_0x02de
            r11 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r11 & r7
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r14) goto L_0x02de
            r11 = r21 & 11
            r14 = 2
            if (r11 != r14) goto L_0x02de
            boolean r11 = r0.i()
            if (r11 != 0) goto L_0x02b3
            goto L_0x02de
        L_0x02b3:
            r0.I()
            r3 = r123
            r4 = r124
            r5 = r125
            r6 = r126
            r7 = r127
            r8 = r128
            r9 = r129
            r10 = r130
            r11 = r131
            r12 = r132
            r13 = r133
            r14 = r134
            r15 = r135
            r16 = r136
            r17 = r137
            r18 = r138
            r19 = r139
            r20 = r140
            r21 = r141
            goto L_0x066a
        L_0x02de:
            r0.D()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x033f
            boolean r11 = r0.L()
            if (r11 == 0) goto L_0x02ec
            goto L_0x033f
        L_0x02ec:
            r0.I()
            r1 = r13 & 32
            if (r1 == 0) goto L_0x02f8
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r1
            goto L_0x02fb
        L_0x02f8:
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
        L_0x02fb:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r13
            if (r2 == 0) goto L_0x0302
            r7 = r7 & r1
        L_0x0302:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x030b
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r1
        L_0x030b:
            r1 = r13 & r28
            if (r1 == 0) goto L_0x0313
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r7 = r7 & r1
        L_0x0313:
            r6 = r123
            r11 = r124
            r12 = r125
            r14 = r126
            r22 = r127
            r10 = r128
            r1 = r129
            r2 = r130
            r4 = r131
            r5 = r132
            r8 = r133
            r9 = r134
            r16 = r135
            r23 = r136
            r17 = r137
            r19 = r140
            r20 = r141
            r24 = r3
            r25 = r7
            r3 = r138
            r7 = r139
            goto L_0x04fe
        L_0x033f:
            if (r6 == 0) goto L_0x0344
            k0.i$a r6 = k0.i.f23074a
            goto L_0x0346
        L_0x0344:
            r6 = r123
        L_0x0346:
            if (r12 == 0) goto L_0x034a
            r11 = 1
            goto L_0x034c
        L_0x034a:
            r11 = r124
        L_0x034c:
            if (r18 == 0) goto L_0x0350
            r12 = 0
            goto L_0x0352
        L_0x0350:
            r12 = r125
        L_0x0352:
            r18 = r13 & 32
            if (r18 == 0) goto L_0x0366
            Y.I0 r14 = V.T0.d()
            java.lang.Object r14 = r0.m(r14)
            Q0.T r14 = (Q0.T) r14
            r22 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r22
            goto L_0x0368
        L_0x0366:
            r14 = r126
        L_0x0368:
            if (r25 == 0) goto L_0x036d
            r22 = 0
            goto L_0x036f
        L_0x036d:
            r22 = r127
        L_0x036f:
            if (r10 == 0) goto L_0x0373
            r10 = 0
            goto L_0x0375
        L_0x0373:
            r10 = r128
        L_0x0375:
            if (r1 == 0) goto L_0x0379
            r1 = 0
            goto L_0x037b
        L_0x0379:
            r1 = r129
        L_0x037b:
            if (r2 == 0) goto L_0x037f
            r2 = 0
            goto L_0x0381
        L_0x037f:
            r2 = r130
        L_0x0381:
            if (r4 == 0) goto L_0x0385
            r4 = 0
            goto L_0x0387
        L_0x0385:
            r4 = r131
        L_0x0387:
            if (r5 == 0) goto L_0x0390
            W0.c0$a r5 = W0.c0.f8551a
            W0.c0 r5 = r5.c()
            goto L_0x0392
        L_0x0390:
            r5 = r132
        L_0x0392:
            if (r8 == 0) goto L_0x039b
            J.x$a r8 = J.C1227x.f3486g
            J.x r8 = r8.a()
            goto L_0x039d
        L_0x039b:
            r8 = r133
        L_0x039d:
            if (r9 == 0) goto L_0x03a6
            J.w$a r9 = J.C1226w.f3478g
            J.w r9 = r9.a()
            goto L_0x03a8
        L_0x03a6:
            r9 = r134
        L_0x03a8:
            if (r16 == 0) goto L_0x03ad
            r16 = 0
            goto L_0x03af
        L_0x03ad:
            r16 = r135
        L_0x03af:
            r23 = 32768(0x8000, float:4.5918E-41)
            r23 = r13 & r23
            if (r23 == 0) goto L_0x03c5
            if (r16 == 0) goto L_0x03be
            r23 = 1
        L_0x03ba:
            r24 = -458753(0xfffffffffff8ffff, float:NaN)
            goto L_0x03c2
        L_0x03be:
            r23 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x03ba
        L_0x03c2:
            r7 = r7 & r24
            goto L_0x03c7
        L_0x03c5:
            r23 = r136
        L_0x03c7:
            if (r17 == 0) goto L_0x03cc
            r17 = 1
            goto L_0x03ce
        L_0x03cc:
            r17 = r137
        L_0x03ce:
            r123 = r1
            if (r19 == 0) goto L_0x03f3
            r1 = 1299418141(0x4d738c1d, float:2.55377872E8)
            r0.T(r1)
            java.lang.Object r1 = r0.A()
            Y.m$a r19 = Y.C1500m.f10026a
            r124 = r2
            java.lang.Object r2 = r19.a()
            if (r1 != r2) goto L_0x03ed
            B.l r1 = B.k.a()
            r0.r(r1)
        L_0x03ed:
            B.l r1 = (B.l) r1
            r0.M()
            goto L_0x03f7
        L_0x03f3:
            r124 = r2
            r1 = r138
        L_0x03f7:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r13
            if (r2 == 0) goto L_0x040f
            io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            r125 = r1
            int r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            V.B0 r1 = r2.getShapes(r0, r1)
            I.a r1 = r1.e()
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r2
            goto L_0x0413
        L_0x040f:
            r125 = r1
            r1 = r139
        L_0x0413:
            r2 = r13 & r28
            if (r2 == 0) goto L_0x04c7
            V.l0 r2 = V.C1392l0.f7725a
            r126 = r1
            r1 = 6
            V.P0 r28 = r2.c(r0, r1)
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r19 = r1.getColors(r0, r2)
            long r50 = r19.m684getCollectorBorder0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomColors r19 = r1.getColors(r0, r2)
            long r52 = r19.m684getCollectorBorder0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomColors r19 = r1.getColors(r0, r2)
            long r24 = r19.m700getPrimaryText0d7_KjU()
            r19 = 14
            r26 = 0
            r29 = 1052938076(0x3ec28f5c, float:0.38)
            r30 = 0
            r31 = 0
            r32 = 0
            r127 = r24
            r129 = r29
            r130 = r30
            r131 = r31
            r132 = r32
            r133 = r19
            r134 = r26
            long r33 = r0.C2544x0.o(r127, r129, r130, r131, r132, r133, r134)
            io.intercom.android.sdk.ui.theme.IntercomColors r19 = r1.getColors(r0, r2)
            long r29 = r19.m700getPrimaryText0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r0, r2)
            long r31 = r1.m700getPrimaryText0d7_KjU()
            r115 = 2047(0x7ff, float:2.868E-42)
            r116 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
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
            r106 = 0
            r108 = 0
            r110 = 0
            r112 = 0
            r114 = -6152(0xffffffffffffe7f8, float:NaN)
            V.P0 r1 = V.P0.c(r28, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r104, r106, r108, r110, r112, r114, r115, r116)
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r2 & r7
            r7 = r2
            goto L_0x04cb
        L_0x04c7:
            r126 = r1
            r1 = r140
        L_0x04cb:
            if (r20 == 0) goto L_0x04ef
            r2 = 8
            float r2 = (float) r2
            r127 = r1
            float r1 = c1.h.j(r2)
            float r2 = c1.h.j(r2)
            C.N r1 = androidx.compose.foundation.layout.n.b(r1, r2)
            r2 = r124
            r19 = r127
            r20 = r1
            r24 = r3
            r25 = r7
            r1 = r123
        L_0x04ea:
            r3 = r125
            r7 = r126
            goto L_0x04fe
        L_0x04ef:
            r127 = r1
            r1 = r123
            r2 = r124
            r19 = r127
            r20 = r141
            r24 = r3
            r25 = r7
            goto L_0x04ea
        L_0x04fe:
            r0.v()
            long r28 = r14.h()
            r30 = 16
            int r26 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r26 == 0) goto L_0x050e
        L_0x050b:
            r31 = r28
            goto L_0x051a
        L_0x050e:
            if (r11 == 0) goto L_0x0515
            long r28 = r19.k()
            goto L_0x050b
        L_0x0515:
            long r28 = r19.g()
            goto L_0x050b
        L_0x051a:
            Q0.T r13 = new Q0.T
            r30 = r13
            r60 = 16777214(0xfffffe, float:2.3509884E-38)
            r61 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r30.<init>(r31, r33, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r54, r55, r56, r57, r58, r59, r60, r61)
            Q0.T r13 = r14.J(r13)
            if (r22 == 0) goto L_0x0585
            r26 = r14
            io.intercom.android.sdk.views.compose.s r14 = new io.intercom.android.sdk.views.compose.s
            r14.<init>()
            r15 = 1
            k0.i r14 = O0.m.c(r6, r15, r14)
            float r15 = OutlinedTextFieldTopPadding
            r28 = 13
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r123 = r14
            r124 = r30
            r125 = r15
            r126 = r31
            r127 = r32
            r128 = r28
            r129 = r29
            k0.i r14 = androidx.compose.foundation.layout.n.m(r123, r124, r125, r126, r127, r128, r129)
            goto L_0x0588
        L_0x0585:
            r26 = r14
            r14 = r6
        L_0x0588:
            if (r11 == 0) goto L_0x0594
            long r28 = r19.j()
        L_0x058e:
            r15 = r8
            r30 = r9
            r8 = r28
            goto L_0x0599
        L_0x0594:
            long r28 = r19.f()
            goto L_0x058e
        L_0x0599:
            k0.i r8 = androidx.compose.foundation.b.c(r14, r8, r7)
            V.Q0 r9 = V.Q0.f6883a
            float r9 = r9.l()
            r14 = 40
            float r14 = (float) r14
            float r14 = c1.h.j(r14)
            k0.i r8 = androidx.compose.foundation.layout.q.a(r8, r9, r14)
            r0.h2 r9 = new r0.h2
            if (r4 == 0) goto L_0x05be
            long r28 = r19.h()
        L_0x05b6:
            r21 = r6
            r31 = r15
            r14 = r28
            r6 = 0
            goto L_0x05c3
        L_0x05be:
            long r28 = r19.e()
            goto L_0x05b6
        L_0x05c3:
            r9.<init>(r14, r6)
            io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3 r6 = new io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3
            r123 = r6
            r124 = r121
            r125 = r11
            r126 = r16
            r127 = r5
            r128 = r3
            r129 = r4
            r130 = r22
            r131 = r10
            r132 = r1
            r133 = r2
            r134 = r19
            r135 = r20
            r136 = r7
            r123.<init>(r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136)
            r14 = 54
            r15 = 491720992(0x1d4f1120, float:2.7405075E-21)
            r28 = r1
            r1 = 1
            g0.a r1 = g0.c.e(r15, r1, r6, r0, r14)
            r138 = r1
            r1 = 64638(0xfc7e, float:9.0577E-41)
            r1 = r24 & r1
            int r6 = r25 << 12
            r14 = r6 & r27
            r1 = r1 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r6
            r1 = r1 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r6
            r1 = r1 | r14
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r14
            r1 = r1 | r6
            r140 = r1
            int r1 = r25 >> 18
            r1 = r1 & 14
            r6 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r6
            r6 = r25 & 112(0x70, float:1.57E-43)
            r1 = r1 | r6
            int r6 = r25 >> 12
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r6
            r141 = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r142 = r1
            r1 = 0
            r135 = r1
            r123 = r121
            r124 = r122
            r125 = r8
            r126 = r11
            r127 = r12
            r128 = r13
            r129 = r31
            r130 = r30
            r131 = r16
            r132 = r23
            r133 = r17
            r134 = r5
            r136 = r3
            r137 = r9
            r139 = r0
            J.C1207c.b(r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142)
            r18 = r3
            r8 = r10
            r15 = r16
            r3 = r21
            r16 = r23
            r6 = r26
            r9 = r28
            r14 = r30
            r13 = r31
            r10 = r2
            r21 = r20
            r20 = r19
            r19 = r7
            r7 = r22
            r119 = r11
            r11 = r4
            r4 = r119
            r120 = r12
            r12 = r5
            r5 = r120
        L_0x066a:
            Y.Y0 r2 = r0.k()
            if (r2 == 0) goto L_0x068d
            io.intercom.android.sdk.views.compose.t r1 = new io.intercom.android.sdk.views.compose.t
            r0 = r1
            r117 = r1
            r1 = r121
            r118 = r2
            r2 = r122
            r22 = r143
            r23 = r144
            r24 = r145
            r25 = r146
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r117
            r0 = r118
            r0.a(r1)
        L_0x068d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(java.lang.String, yf.l, k0.i, boolean, boolean, Q0.T, yf.p, yf.p, yf.p, yf.p, boolean, W0.c0, J.x, J.w, boolean, int, int, B.l, r0.g2, V.P0, C.N, Y.m, int, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomOutlinedTextField$lambda$2(v vVar) {
        C6496s.h(vVar, "$this$semantics");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomOutlinedTextField$lambda$3(String str, C6798l lVar, i iVar, boolean z10, boolean z11, T t10, p pVar, p pVar2, p pVar3, p pVar4, boolean z12, c0 c0Var, C1227x xVar, C1226w wVar, boolean z13, int i10, int i11, l lVar2, g2 g2Var, P0 p02, N n10, int i12, int i13, int i14, int i15, C1500m mVar, int i16) {
        C6496s.h(str, "$value");
        C6496s.h(lVar, "$onValueChange");
        String str2 = str;
        C6798l lVar3 = lVar;
        IntercomOutlinedTextField(str2, lVar3, iVar, z10, z11, t10, pVar, pVar2, pVar3, pVar4, z12, c0Var, xVar, wVar, z13, i10, i11, lVar2, g2Var, p02, n10, mVar, M0.a(i12 | 1), M0.a(i13), M0.a(i14), i15);
        return C6514M.f71813a;
    }
}
