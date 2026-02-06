package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a¹\u0001\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u000f\u0010\u001e\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u000f\u0010\u001f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001f\u0010\u001c\u001a\u000f\u0010 \u001a\u00020\u000bH\u0001¢\u0006\u0004\b \u0010\u001c\u001a\u000f\u0010!\u001a\u00020\u000bH\u0001¢\u0006\u0004\b!\u0010\u001c\u001a\u000f\u0010\"\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\"\u0010\u001c¨\u0006#"}, d2 = {"Lk0/i;", "modifier", "", "title", "subtitle", "", "subtitleIcon", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "Lkotlin/Function0;", "Llf/M;", "onBackClick", "navIcon", "", "isActive", "Lr0/x0;", "backgroundColor", "contentColor", "subtitleColor", "onTitleClicked", "Lkotlin/Function1;", "LC/Y;", "menuItems", "TopActionBar-NpQZenA", "(Lk0/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lyf/a;Ljava/lang/Integer;ZJJJLyf/a;Lyf/q;LY/m;III)V", "TopActionBar", "TopActionBarAvatarPreview", "(LY/m;I)V", "TopActionBarGroupChatPreview", "TopActionBarTeamReplyTimePreview", "TopActionBarMultipleAvatarsPreview", "TopActionBarBackButtonPreview", "TopActionBarTitlePreview", "TopActionBarEndContentPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TopActionBarKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x07ff  */
    /* JADX WARNING: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0132  */
    /* renamed from: TopActionBar-NpQZenA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m207TopActionBarNpQZenA(k0.i r85, java.lang.String r86, java.lang.String r87, java.lang.Integer r88, java.util.List<io.intercom.android.sdk.m5.components.avatar.AvatarWrapper> r89, yf.C6787a r90, java.lang.Integer r91, boolean r92, long r93, long r95, long r97, yf.C6787a r99, yf.q r100, Y.C1500m r101, int r102, int r103, int r104) {
        /*
            r15 = r102
            r13 = r103
            r14 = r104
            r2 = 196608(0x30000, float:2.75506E-40)
            r4 = 8
            r5 = 128(0x80, float:1.794E-43)
            r6 = 16
            r7 = 32
            r8 = 48
            r9 = 6
            r11 = 256(0x100, float:3.59E-43)
            r12 = -1160200926(0xffffffffbad8bd22, float:-0.0016535858)
            r0 = r101
            Y.m r0 = r0.h(r12)
            r12 = 1
            r17 = r14 & 1
            r18 = 2
            r1 = 4
            if (r17 == 0) goto L_0x002b
            r20 = r15 | 6
            r9 = r85
            goto L_0x0041
        L_0x002b:
            r20 = r15 & 14
            r9 = r85
            if (r20 != 0) goto L_0x003f
            boolean r20 = r0.S(r9)
            if (r20 == 0) goto L_0x003a
            r20 = r1
            goto L_0x003c
        L_0x003a:
            r20 = r18
        L_0x003c:
            r20 = r15 | r20
            goto L_0x0041
        L_0x003f:
            r20 = r15
        L_0x0041:
            r21 = r14 & 2
            if (r21 == 0) goto L_0x004c
            r20 = r20 | 48
            r12 = r86
        L_0x0049:
            r8 = r20
            goto L_0x0060
        L_0x004c:
            r22 = r15 & 112(0x70, float:1.57E-43)
            r12 = r86
            if (r22 != 0) goto L_0x0049
            boolean r22 = r0.S(r12)
            if (r22 == 0) goto L_0x005b
            r22 = r7
            goto L_0x005d
        L_0x005b:
            r22 = r6
        L_0x005d:
            r20 = r20 | r22
            goto L_0x0049
        L_0x0060:
            r20 = r14 & 4
            if (r20 == 0) goto L_0x0069
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0066:
            r1 = r87
            goto L_0x007c
        L_0x0069:
            r1 = r15 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0066
            r1 = r87
            boolean r23 = r0.S(r1)
            if (r23 == 0) goto L_0x0078
            r23 = r11
            goto L_0x007a
        L_0x0078:
            r23 = r5
        L_0x007a:
            r8 = r8 | r23
        L_0x007c:
            r23 = r14 & 8
            if (r23 == 0) goto L_0x0085
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0082:
            r4 = r88
            goto L_0x0098
        L_0x0085:
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0082
            r4 = r88
            boolean r25 = r0.S(r4)
            if (r25 == 0) goto L_0x0094
            r25 = 2048(0x800, float:2.87E-42)
            goto L_0x0096
        L_0x0094:
            r25 = 1024(0x400, float:1.435E-42)
        L_0x0096:
            r8 = r8 | r25
        L_0x0098:
            r3 = r14 & 16
            if (r3 == 0) goto L_0x009e
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r26 = r14 & 32
            if (r26 == 0) goto L_0x00a6
            r8 = r8 | r2
            r2 = r90
            goto L_0x00bb
        L_0x00a6:
            r27 = 458752(0x70000, float:6.42848E-40)
            r27 = r15 & r27
            r2 = r90
            if (r27 != 0) goto L_0x00bb
            boolean r28 = r0.C(r2)
            if (r28 == 0) goto L_0x00b7
            r28 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r28 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r8 = r8 | r28
        L_0x00bb:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r15 & r28
            if (r28 != 0) goto L_0x00d5
            r28 = r14 & 64
            r7 = r91
            if (r28 != 0) goto L_0x00d0
            boolean r29 = r0.S(r7)
            if (r29 == 0) goto L_0x00d0
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r8 = r8 | r29
            goto L_0x00d7
        L_0x00d5:
            r7 = r91
        L_0x00d7:
            r6 = r14 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00e2
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r8 = r8 | r29
            r5 = r92
            goto L_0x00f7
        L_0x00e2:
            r29 = 29360128(0x1c00000, float:7.052966E-38)
            r29 = r15 & r29
            r5 = r92
            if (r29 != 0) goto L_0x00f7
            boolean r30 = r0.b(r5)
            if (r30 == 0) goto L_0x00f3
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f3:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r8 = r8 | r30
        L_0x00f7:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r15 & r30
            if (r30 != 0) goto L_0x0111
            r10 = r14 & 256(0x100, float:3.59E-43)
            r11 = r93
            if (r10 != 0) goto L_0x010c
            boolean r31 = r0.e(r11)
            if (r31 == 0) goto L_0x010c
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010c:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r8 = r8 | r31
            goto L_0x0113
        L_0x0111:
            r11 = r93
        L_0x0113:
            r31 = 1879048192(0x70000000, float:1.58456325E29)
            r31 = r15 & r31
            if (r31 != 0) goto L_0x012c
            r10 = r14 & 512(0x200, float:7.175E-43)
            r1 = r95
            if (r10 != 0) goto L_0x0128
            boolean r10 = r0.e(r1)
            if (r10 == 0) goto L_0x0128
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0128:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r8 = r8 | r10
            goto L_0x012e
        L_0x012c:
            r1 = r95
        L_0x012e:
            r10 = r13 & 14
            if (r10 != 0) goto L_0x014a
            r10 = 1024(0x400, float:1.435E-42)
            r1 = r14 & 1024(0x400, float:1.435E-42)
            if (r1 != 0) goto L_0x0143
            r1 = r97
            boolean r10 = r0.e(r1)
            if (r10 == 0) goto L_0x0145
            r18 = 4
            goto L_0x0145
        L_0x0143:
            r1 = r97
        L_0x0145:
            r10 = r13 | r18
        L_0x0147:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x014e
        L_0x014a:
            r1 = r97
            r10 = r13
            goto L_0x0147
        L_0x014e:
            r1 = r1 & r14
            if (r1 == 0) goto L_0x0157
            r2 = 48
            r10 = r10 | r2
        L_0x0154:
            r2 = r99
            goto L_0x016a
        L_0x0157:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0154
            r2 = r99
            boolean r18 = r0.C(r2)
            if (r18 == 0) goto L_0x0166
            r18 = 32
            goto L_0x0168
        L_0x0166:
            r18 = 16
        L_0x0168:
            r10 = r10 | r18
        L_0x016a:
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0173
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0170:
            r4 = 16
            goto L_0x018a
        L_0x0173:
            r4 = r13 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0187
            r4 = r100
            boolean r18 = r0.C(r4)
            if (r18 == 0) goto L_0x0182
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0184
        L_0x0182:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0184:
            r10 = r10 | r29
            goto L_0x0170
        L_0x0187:
            r4 = r100
            goto L_0x0170
        L_0x018a:
            if (r3 != r4) goto L_0x01bd
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r8
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x01bd
            r4 = r10 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x01bd
            boolean r4 = r0.i()
            if (r4 != 0) goto L_0x01a2
            goto L_0x01bd
        L_0x01a2:
            r0.I()
            r2 = r86
            r3 = r87
            r4 = r88
            r5 = r89
            r6 = r90
            r8 = r92
            r13 = r97
            r15 = r99
            r16 = r100
            r1 = r9
            r9 = r11
            r11 = r95
            goto L_0x07f9
        L_0x01bd:
            r0.D()
            r4 = 1
            r5 = r15 & 1
            if (r5 == 0) goto L_0x01cb
            boolean r5 = r0.L()
            if (r5 == 0) goto L_0x01cd
        L_0x01cb:
            r5 = r10
            goto L_0x0209
        L_0x01cd:
            r0.I()
            r1 = r14 & 64
            if (r1 == 0) goto L_0x01d8
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r1
        L_0x01d8:
            r1 = 256(0x100, float:3.59E-43)
            r1 = r1 & r14
            if (r1 == 0) goto L_0x01e1
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r8 = r8 & r1
        L_0x01e1:
            r1 = r14 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x01e9
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r8 = r8 & r1
        L_0x01e9:
            r1 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r14
            if (r1 == 0) goto L_0x01f0
            r10 = r10 & -15
        L_0x01f0:
            r1 = r86
            r2 = r87
            r3 = r88
            r4 = r89
            r5 = r90
            r6 = r92
            r75 = r97
            r77 = r8
            r78 = r10
            r10 = r11
            r8 = r99
            r12 = r100
            goto L_0x02be
        L_0x0209:
            if (r17 == 0) goto L_0x020d
            k0.i$a r9 = k0.i.f23074a
        L_0x020d:
            if (r21 == 0) goto L_0x0212
            java.lang.String r17 = ""
            goto L_0x0214
        L_0x0212:
            r17 = r86
        L_0x0214:
            if (r20 == 0) goto L_0x0219
            r18 = 0
            goto L_0x021b
        L_0x0219:
            r18 = r87
        L_0x021b:
            if (r23 == 0) goto L_0x0220
            r20 = 0
            goto L_0x0222
        L_0x0220:
            r20 = r88
        L_0x0222:
            if (r3 == 0) goto L_0x0229
            java.util.List r3 = mf.C6565s.n()
            goto L_0x022b
        L_0x0229:
            r3 = r89
        L_0x022b:
            if (r26 == 0) goto L_0x0230
            r21 = 0
            goto L_0x0232
        L_0x0230:
            r21 = r90
        L_0x0232:
            r23 = r14 & 64
            if (r23 == 0) goto L_0x0241
            int r7 = io.intercom.android.sdk.R.drawable.intercom_back
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r19
        L_0x0241:
            if (r6 == 0) goto L_0x0247
            r6 = 0
        L_0x0244:
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x024a
        L_0x0247:
            r6 = r92
            goto L_0x0244
        L_0x024a:
            r10 = r10 & r14
            if (r10 == 0) goto L_0x025e
            io.intercom.android.sdk.ui.theme.IntercomTheme r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r10 = r10.getColors(r0, r11)
            long r10 = r10.m691getHeader0d7_KjU()
            r12 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r8 = r8 & r12
            goto L_0x025f
        L_0x025e:
            r10 = r11
        L_0x025f:
            r12 = r14 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0277
            io.intercom.android.sdk.ui.theme.IntercomTheme r12 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r12.getColors(r0, r4)
            long r25 = r4.m697getOnHeader0d7_KjU()
            r4 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r8
            r8 = r4
        L_0x0274:
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x027a
        L_0x0277:
            r25 = r95
            goto L_0x0274
        L_0x027a:
            r4 = r4 & r14
            if (r4 == 0) goto L_0x028c
            io.intercom.android.sdk.ui.theme.IntercomTheme r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r12 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r4.getColors(r0, r12)
            long r29 = r4.m697getOnHeader0d7_KjU()
            r4 = r5 & -15
            goto L_0x028f
        L_0x028c:
            r29 = r97
            r4 = r5
        L_0x028f:
            if (r1 == 0) goto L_0x0297
            io.intercom.android.sdk.m5.components.m1 r1 = new io.intercom.android.sdk.m5.components.m1
            r1.<init>()
            goto L_0x0299
        L_0x0297:
            r1 = r99
        L_0x0299:
            if (r2 == 0) goto L_0x02af
            r78 = r4
            r77 = r8
            r2 = r18
            r5 = r21
            r95 = r25
            r75 = r29
            r12 = 0
        L_0x02a8:
            r8 = r1
            r4 = r3
            r1 = r17
            r3 = r20
            goto L_0x02be
        L_0x02af:
            r12 = r100
            r78 = r4
            r77 = r8
            r2 = r18
            r5 = r21
            r95 = r25
            r75 = r29
            goto L_0x02a8
        L_0x02be:
            r0.v()
            boolean r13 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m718isDarkColor8_81llA(r95)
            r14 = 0
            io.intercom.android.sdk.utilities.ApplyStatusBarColorKt.ApplyStatusBarContentColor(r13, r0, r14)
            k0.i$a r13 = k0.i.f23074a
            C.c r79 = C.C1085c.f882a
            C.c$m r14 = r79.g()
            k0.c$a r80 = k0.c.f23044a
            k0.c$b r15 = r80.k()
            r97 = r12
            r12 = 0
            H0.F r14 = C.C1090h.a(r14, r15, r0, r12)
            int r15 = Y.C1494j.a(r0, r12)
            Y.y r12 = r0.p()
            r98 = r3
            k0.i r3 = k0.h.e(r0, r13)
            J0.g$a r81 = J0.C1241g.f3853J
            r99 = r2
            yf.a r2 = r81.a()
            Y.f r17 = r0.j()
            if (r17 != 0) goto L_0x02fd
            Y.C1494j.c()
        L_0x02fd:
            r0.F()
            boolean r17 = r0.f()
            if (r17 == 0) goto L_0x030a
            r0.U(r2)
            goto L_0x030d
        L_0x030a:
            r0.q()
        L_0x030d:
            Y.m r2 = Y.F1.a(r0)
            r100 = r1
            yf.p r1 = r81.c()
            Y.F1.b(r2, r14, r1)
            yf.p r1 = r81.e()
            Y.F1.b(r2, r12, r1)
            yf.p r1 = r81.b()
            boolean r12 = r2.f()
            if (r12 != 0) goto L_0x0339
            java.lang.Object r12 = r2.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r14)
            if (r12 != 0) goto L_0x0347
        L_0x0339:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r2.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r2.V(r12, r1)
        L_0x0347:
            yf.p r1 = r81.d()
            Y.F1.b(r2, r3, r1)
            C.k r1 = C.C1093k.f978a
            r1 = 0
            r2 = 1
            r3 = 0
            k0.i r1 = androidx.compose.foundation.layout.q.h(r9, r1, r2, r3)
            r2 = 2
            r3 = 0
            r12 = 0
            r85 = r1
            r86 = r10
            r88 = r12
            r89 = r2
            r90 = r3
            k0.i r1 = androidx.compose.foundation.b.d(r85, r86, r88, r89, r90)
            k0.i r1 = C.j0.e(r1)
            r2 = 56
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            k0.i r1 = androidx.compose.foundation.layout.q.i(r1, r2)
            r2 = 4
            float r2 = (float) r2
            float r3 = c1.h.j(r2)
            r12 = 11
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r85 = r1
            r86 = r15
            r87 = r17
            r88 = r3
            r89 = r18
            r90 = r12
            r91 = r14
            k0.i r1 = androidx.compose.foundation.layout.n.m(r85, r86, r87, r88, r89, r90, r91)
            r3 = 369277633(0x1602bac1, float:1.0560246E-25)
            r0.T(r3)
            r3 = r78 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r3 != r12) goto L_0x03a5
            r3 = 1
            goto L_0x03a6
        L_0x03a5:
            r3 = 0
        L_0x03a6:
            java.lang.Object r12 = r0.A()
            if (r3 != 0) goto L_0x03b4
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r12 != r3) goto L_0x03bc
        L_0x03b4:
            io.intercom.android.sdk.m5.components.n1 r12 = new io.intercom.android.sdk.m5.components.n1
            r12.<init>(r8)
            r0.r(r12)
        L_0x03bc:
            r3 = r12
            yf.a r3 = (yf.C6787a) r3
            r0.M()
            r12 = 7
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r85 = r1
            r86 = r15
            r87 = r17
            r88 = r18
            r89 = r3
            r90 = r12
            r91 = r14
            k0.i r1 = androidx.compose.foundation.d.d(r85, r86, r87, r88, r89, r90, r91)
            k0.c$c r3 = r80.i()
            C.c$e r12 = r79.f()
            r14 = 48
            H0.F r3 = C.W.b(r12, r3, r0, r14)
            r12 = 0
            int r14 = Y.C1494j.a(r0, r12)
            Y.y r12 = r0.p()
            k0.i r1 = k0.h.e(r0, r1)
            yf.a r15 = r81.a()
            Y.f r17 = r0.j()
            if (r17 != 0) goto L_0x0403
            Y.C1494j.c()
        L_0x0403:
            r0.F()
            boolean r17 = r0.f()
            if (r17 == 0) goto L_0x0410
            r0.U(r15)
            goto L_0x0413
        L_0x0410:
            r0.q()
        L_0x0413:
            Y.m r15 = Y.F1.a(r0)
            r82 = r8
            yf.p r8 = r81.c()
            Y.F1.b(r15, r3, r8)
            yf.p r3 = r81.e()
            Y.F1.b(r15, r12, r3)
            yf.p r3 = r81.b()
            boolean r8 = r15.f()
            if (r8 != 0) goto L_0x043f
            java.lang.Object r8 = r15.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r12)
            if (r8 != 0) goto L_0x044d
        L_0x043f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r15.r(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r15.V(r8, r3)
        L_0x044d:
            yf.p r3 = r81.d()
            Y.F1.b(r15, r1, r3)
            C.Z r1 = C.Z.f873a
            float r3 = c1.h.j(r2)
            k0.i r3 = androidx.compose.foundation.layout.q.r(r13, r3)
            r8 = 6
            C.a0.a(r3, r0, r8)
            r3 = -1851701552(0xffffffff91a146d0, float:-2.5444963E-28)
            r0.T(r3)
            if (r5 == 0) goto L_0x04a5
            if (r7 == 0) goto L_0x04a5
            io.intercom.android.sdk.m5.components.TopActionBarKt$TopActionBar$2$2$1 r3 = new io.intercom.android.sdk.m5.components.TopActionBarKt$TopActionBar$2$2$1
            r14 = r95
            r3.<init>(r7, r14)
            r8 = 54
            r12 = 1988527504(0x76868590, float:1.3642124E33)
            r95 = r7
            r7 = 1
            g0.a r3 = g0.c.e(r12, r7, r3, r0, r8)
            int r7 = r77 >> 15
            r7 = r7 & 14
            r8 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r8
            r8 = 30
            r12 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r85 = r5
            r86 = r12
            r87 = r17
            r88 = r18
            r89 = r19
            r90 = r3
            r91 = r0
            r92 = r7
            r93 = r8
            V.U.b(r85, r86, r87, r88, r89, r90, r91, r92, r93)
            goto L_0x04a9
        L_0x04a5:
            r14 = r95
            r95 = r7
        L_0x04a9:
            r0.M()
            if (r5 == 0) goto L_0x04b6
            r3 = 8
        L_0x04b0:
            float r7 = (float) r3
            float r3 = c1.h.j(r7)
            goto L_0x04b9
        L_0x04b6:
            r3 = 16
            goto L_0x04b0
        L_0x04b9:
            int r7 = r4.size()
            r8 = 3
            r12 = 1
            if (r7 != r12) goto L_0x0509
            r7 = -1567586432(0xffffffffa2908780, float:-3.9174744E-18)
            r0.T(r7)
            k0.i r3 = androidx.compose.foundation.layout.q.r(r13, r3)
            r7 = 0
            C.a0.a(r3, r0, r7)
            java.lang.Object r3 = mf.C6565s.o0(r4)
            io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r3 = (io.intercom.android.sdk.m5.components.avatar.AvatarWrapper) r3
            r7 = 24
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            k0.i r7 = androidx.compose.foundation.layout.q.n(r13, r7)
            int r12 = r77 >> 12
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | 70
            r17 = 52
            r18 = 0
            r19 = 0
            r21 = 0
            r85 = r7
            r86 = r3
            r87 = r18
            r88 = r6
            r89 = r19
            r91 = r21
            r92 = r0
            r93 = r12
            r94 = r17
            io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.m208AvatarIconRd90Nhg(r85, r86, r87, r88, r89, r91, r92, r93, r94)
            r0.M()
        L_0x0506:
            r3 = 8
            goto L_0x0553
        L_0x0509:
            int r7 = r4.size()
            r12 = 1
            if (r7 <= r12) goto L_0x0549
            r7 = -1567284709(0xffffffffa295221b, float:-4.042264E-18)
            r0.T(r7)
            k0.i r3 = androidx.compose.foundation.layout.q.r(r13, r3)
            r7 = 0
            C.a0.a(r3, r0, r7)
            r3 = r4
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = mf.C6565s.V0(r3, r8)
            r7 = 24
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            r12 = 392(0x188, float:5.5E-43)
            r17 = 10
            r18 = 0
            r19 = 0
            r85 = r3
            r86 = r18
            r87 = r7
            r88 = r19
            r90 = r0
            r91 = r12
            r92 = r17
            io.intercom.android.sdk.m5.components.AvatarGroupKt.m136AvatarGroupJ8mCjc(r85, r86, r87, r88, r90, r91, r92)
            r0.M()
            goto L_0x0506
        L_0x0549:
            r3 = -1567074250(0xffffffffa2985836, float:-4.129308E-18)
            r0.T(r3)
            r0.M()
            goto L_0x0506
        L_0x0553:
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.q.r(r13, r3)
            r7 = 6
            C.a0.a(r3, r0, r7)
            r3 = 2
            r7 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r85 = r1
            r86 = r13
            r87 = r12
            r88 = r17
            r89 = r3
            r90 = r7
            k0.i r3 = C.Y.b(r85, r86, r87, r88, r89, r90)
            k0.c$b r7 = r80.k()
            C.c$m r12 = r79.g()
            r8 = 48
            H0.F r7 = C.C1090h.a(r12, r7, r0, r8)
            r8 = 0
            int r12 = Y.C1494j.a(r0, r8)
            Y.y r8 = r0.p()
            k0.i r3 = k0.h.e(r0, r3)
            r94 = r4
            yf.a r4 = r81.a()
            Y.f r17 = r0.j()
            if (r17 != 0) goto L_0x05a0
            Y.C1494j.c()
        L_0x05a0:
            r0.F()
            boolean r17 = r0.f()
            if (r17 == 0) goto L_0x05ad
            r0.U(r4)
            goto L_0x05b0
        L_0x05ad:
            r0.q()
        L_0x05b0:
            Y.m r4 = Y.F1.a(r0)
            r96 = r5
            yf.p r5 = r81.c()
            Y.F1.b(r4, r7, r5)
            yf.p r5 = r81.e()
            Y.F1.b(r4, r8, r5)
            yf.p r5 = r81.b()
            boolean r7 = r4.f()
            if (r7 != 0) goto L_0x05dc
            java.lang.Object r7 = r4.A()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r8)
            if (r7 != 0) goto L_0x05ea
        L_0x05dc:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4.r(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4.V(r7, r5)
        L_0x05ea:
            yf.p r5 = r81.d()
            Y.F1.b(r4, r3, r5)
            io.intercom.android.sdk.ui.theme.IntercomTheme r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r5 = r3.getTypography(r0, r4)
            Q0.T r43 = r5.getType03()
            r73 = 16777214(0xfffffe, float:2.3509884E-38)
            r74 = 0
            r46 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r44 = r14
            Q0.T r37 = Q0.T.c(r43, r44, r46, r48, r49, r50, r51, r52, r53, r55, r56, r57, r58, r60, r61, r62, r63, r64, r65, r67, r68, r69, r70, r71, r72, r73, r74)
            b1.j$a r5 = b1.j.f19110b
            int r7 = r5.f()
            b1.t$a r8 = b1.t.f19154a
            int r32 = r8.b()
            b1.j r29 = b1.j.h(r7)
            int r7 = r77 >> 3
            r7 = r7 & 14
            int r12 = r77 >> 21
            r12 = r12 & 896(0x380, float:1.256E-42)
            r39 = r7 | r12
            r40 = 3120(0xc30, float:4.372E-42)
            r41 = 54778(0xd5fa, float:7.676E-41)
            r18 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r33 = 0
            r34 = 1
            r35 = 0
            r36 = 0
            r17 = r100
            r19 = r14
            r38 = r0
            V.T0.b(r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r7 = 1212138404(0x483fc3a4, float:196366.56)
            r0.T(r7)
            if (r99 == 0) goto L_0x0684
            int r7 = r99.length()
            if (r7 != 0) goto L_0x068c
        L_0x0684:
            r43 = r6
            r42 = r9
            r44 = r10
            goto L_0x0791
        L_0x068c:
            k0.c$c r7 = r80.i()
            C.c$e r12 = r79.f()
            r43 = r6
            r6 = 48
            H0.F r6 = C.W.b(r12, r7, r0, r6)
            r7 = 0
            int r12 = Y.C1494j.a(r0, r7)
            Y.y r7 = r0.p()
            r42 = r9
            k0.i r9 = k0.h.e(r0, r13)
            r44 = r10
            yf.a r10 = r81.a()
            Y.f r11 = r0.j()
            if (r11 != 0) goto L_0x06ba
            Y.C1494j.c()
        L_0x06ba:
            r0.F()
            boolean r11 = r0.f()
            if (r11 == 0) goto L_0x06c7
            r0.U(r10)
            goto L_0x06ca
        L_0x06c7:
            r0.q()
        L_0x06ca:
            Y.m r10 = Y.F1.a(r0)
            yf.p r11 = r81.c()
            Y.F1.b(r10, r6, r11)
            yf.p r6 = r81.e()
            Y.F1.b(r10, r7, r6)
            yf.p r6 = r81.b()
            boolean r7 = r10.f()
            if (r7 != 0) goto L_0x06f4
            java.lang.Object r7 = r10.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r11)
            if (r7 != 0) goto L_0x0702
        L_0x06f4:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r10.r(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r10.V(r7, r6)
        L_0x0702:
            yf.p r6 = r81.d()
            Y.F1.b(r10, r9, r6)
            r6 = 559054092(0x21527d0c, float:7.1316266E-19)
            r0.T(r6)
            if (r98 != 0) goto L_0x0712
            goto L_0x0746
        L_0x0712:
            int r6 = r98.intValue()
            int r7 = r77 >> 9
            r7 = r7 & 14
            w0.c r6 = M0.e.c(r6, r0, r7)
            int r7 = r78 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 56
            r9 = 4
            r10 = 0
            r11 = 0
            r85 = r6
            r86 = r10
            r87 = r11
            r88 = r75
            r90 = r0
            r91 = r7
            r92 = r9
            V.V.a(r85, r86, r87, r88, r90, r91, r92)
            float r2 = c1.h.j(r2)
            k0.i r2 = androidx.compose.foundation.layout.q.r(r13, r2)
            r6 = 6
            C.a0.a(r2, r0, r6)
            lf.M r2 = lf.C6514M.f71813a
        L_0x0746:
            r0.M()
            io.intercom.android.sdk.ui.theme.IntercomTypography r2 = r3.getTypography(r0, r4)
            Q0.T r37 = r2.getType05()
            int r2 = r5.f()
            int r32 = r8.b()
            b1.j r29 = b1.j.h(r2)
            r2 = 6
            int r3 = r77 >> 6
            r3 = r3 & 14
            int r4 = r78 << 6
            r2 = r4 & 896(0x380, float:1.256E-42)
            r39 = r3 | r2
            r40 = 3120(0xc30, float:4.372E-42)
            r41 = 54778(0xd5fa, float:7.676E-41)
            r18 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r33 = 0
            r34 = 1
            r35 = 0
            r36 = 0
            r17 = r99
            r19 = r75
            r38 = r0
            V.T0.b(r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.u()
        L_0x0791:
            r0.M()
            r0.u()
            r2 = 16
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            k0.i r2 = androidx.compose.foundation.layout.q.r(r13, r2)
            r3 = 6
            C.a0.a(r2, r0, r3)
            r2 = -1851617640(0xffffffff91a28e98, float:-2.5646974E-28)
            r0.T(r2)
            if (r97 != 0) goto L_0x07b1
            r3 = r97
            goto L_0x07c2
        L_0x07b1:
            r2 = 3
            int r2 = r78 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r97
            r3.invoke(r1, r0, r2)
            lf.M r1 = lf.C6514M.f71813a
        L_0x07c2:
            r0.M()
            r0.u()
            r1 = 369368110(0x16041c2e, float:1.0671767E-25)
            r0.T(r1)
            boolean r1 = Sg.p.d0(r100)
            if (r1 != 0) goto L_0x07da
            r1 = 1
            r2 = 0
            r4 = 0
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r2, r0, r4, r1)
        L_0x07da:
            r0.M()
            r0.u()
            r5 = r94
            r7 = r95
            r6 = r96
            r4 = r98
            r2 = r100
            r16 = r3
            r11 = r14
            r1 = r42
            r8 = r43
            r9 = r44
            r13 = r75
            r15 = r82
            r3 = r99
        L_0x07f9:
            Y.Y0 r0 = r0.k()
            if (r0 == 0) goto L_0x081a
            r85 = r15
            io.intercom.android.sdk.m5.components.o1 r15 = new io.intercom.android.sdk.m5.components.o1
            r83 = r0
            r0 = r15
            r84 = r15
            r15 = r85
            r17 = r102
            r18 = r103
            r19 = r104
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r19)
            r0 = r83
            r1 = r84
            r0.a(r1)
        L_0x081a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.TopActionBarKt.m207TopActionBarNpQZenA(k0.i, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, yf.a, java.lang.Integer, boolean, long, long, long, yf.a, yf.q, Y.m, int, int, int):void");
    }

    @IntercomPreviews
    public static final void TopActionBarAvatarPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-876643721);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TopActionBarKt.INSTANCE.m196getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBarAvatarPreview$lambda$9(int i10, C1500m mVar, int i11) {
        TopActionBarAvatarPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TopActionBarBackButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1611748073);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TopActionBarKt.INSTANCE.m200getLambda5$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new l1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBarBackButtonPreview$lambda$13(int i10, C1500m mVar, int i11) {
        TopActionBarBackButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TopActionBarEndContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1992822204);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TopActionBarKt.INSTANCE.m204getLambda9$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new j1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBarEndContentPreview$lambda$15(int i10, C1500m mVar, int i11) {
        TopActionBarEndContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TopActionBarGroupChatPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(86306281);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TopActionBarKt.INSTANCE.m197getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new q1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBarGroupChatPreview$lambda$10(int i10, C1500m mVar, int i11) {
        TopActionBarGroupChatPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TopActionBarMultipleAvatarsPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1436789380);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TopActionBarKt.INSTANCE.m199getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new s1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBarMultipleAvatarsPreview$lambda$12(int i10, C1500m mVar, int i11) {
        TopActionBarMultipleAvatarsPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TopActionBarTeamReplyTimePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(500144364);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TopActionBarKt.INSTANCE.m198getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new p1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBarTeamReplyTimePreview$lambda$11(int i10, C1500m mVar, int i11) {
        TopActionBarTeamReplyTimePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TopActionBarTitlePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1648201034);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TopActionBarKt.INSTANCE.m201getLambda6$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new k1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBarTitlePreview$lambda$14(int i10, C1500m mVar, int i11) {
        TopActionBarTitlePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBar_NpQZenA$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBar_NpQZenA$lambda$7$lambda$2$lambda$1(C6787a aVar) {
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TopActionBar_NpQZenA$lambda$8(i iVar, String str, String str2, Integer num, List list, C6787a aVar, Integer num2, boolean z10, long j10, long j11, long j12, C6787a aVar2, q qVar, int i10, int i11, int i12, C1500m mVar, int i13) {
        m207TopActionBarNpQZenA(iVar, str, str2, num, list, aVar, num2, z10, j10, j11, j12, aVar2, qVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C6514M.f71813a;
    }
}
