package io.intercom.android.sdk.ui.component;

import V.C1383h;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import c1.h;
import g0.c;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk0/i;", "modifier", "Lr0/x0;", "backgroundColor", "contentColor", "", "badgeText", "badgeColor", "badgeContentColor", "Lkotlin/Function0;", "Llf/M;", "onClick", "JumpToBottom-kNRdK3w", "(Lk0/i;JJLjava/lang/String;JJLyf/a;LY/m;II)V", "JumpToBottom", "JumpToBottomPreview", "(LY/m;I)V", "UnreadBadge-eaDK9VM", "(Lk0/i;Ljava/lang/String;JJLY/m;II)V", "UnreadBadge", "Lc1/h;", "JumpBottomPadding", "F", "getJumpBottomPadding", "()F", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JumpToBottomKt {
    private static final float JumpBottomPadding = h.j((float) 12);

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ee  */
    /* renamed from: JumpToBottom-kNRdK3w  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m603JumpToBottomkNRdK3w(k0.i r21, long r22, long r24, java.lang.String r26, long r27, long r29, yf.C6787a r31, Y.C1500m r32, int r33, int r34) {
        /*
            r11 = r31
            r12 = r33
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            r0 = 1700007899(0x65540fdb, float:6.2589636E22)
            r1 = r32
            Y.m r0 = r1.h(r0)
            r1 = r34 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r12 | 6
            r3 = r2
            r2 = r21
            goto L_0x0030
        L_0x001c:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r21
            boolean r3 = r0.S(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r12
            goto L_0x0030
        L_0x002d:
            r2 = r21
            r3 = r12
        L_0x0030:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r34 & 2
            if (r4 != 0) goto L_0x0043
            r4 = r22
            boolean r6 = r0.e(r4)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0043:
            r4 = r22
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
            goto L_0x004b
        L_0x0049:
            r4 = r22
        L_0x004b:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0064
            r6 = r34 & 4
            if (r6 != 0) goto L_0x005e
            r6 = r24
            boolean r8 = r0.e(r6)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x005e:
            r6 = r24
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
            goto L_0x0066
        L_0x0064:
            r6 = r24
        L_0x0066:
            r8 = r34 & 8
            if (r8 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r9 = r26
            goto L_0x0081
        L_0x006f:
            r9 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x006c
            r9 = r26
            boolean r10 = r0.S(r9)
            if (r10 == 0) goto L_0x007e
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r10
        L_0x0081:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r12
            if (r10 != 0) goto L_0x009a
            r10 = r34 & 16
            r13 = r27
            if (r10 != 0) goto L_0x0096
            boolean r10 = r0.e(r13)
            if (r10 == 0) goto L_0x0096
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r10
            goto L_0x009c
        L_0x009a:
            r13 = r27
        L_0x009c:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r12
            if (r10 != 0) goto L_0x00b4
            r10 = r34 & 32
            r4 = r29
            if (r10 != 0) goto L_0x00b0
            boolean r10 = r0.e(r4)
            if (r10 == 0) goto L_0x00b0
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r3 = r3 | r10
            goto L_0x00b6
        L_0x00b4:
            r4 = r29
        L_0x00b6:
            r10 = r34 & 64
            if (r10 == 0) goto L_0x00be
            r10 = 1572864(0x180000, float:2.204052E-39)
        L_0x00bc:
            r3 = r3 | r10
            goto L_0x00cf
        L_0x00be:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r12
            if (r10 != 0) goto L_0x00cf
            boolean r10 = r0.C(r11)
            if (r10 == 0) goto L_0x00cc
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bc
        L_0x00cc:
            r10 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00bc
        L_0x00cf:
            r10 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r10 & r3
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r15) goto L_0x00ee
            boolean r10 = r0.i()
            if (r10 != 0) goto L_0x00df
            goto L_0x00ee
        L_0x00df:
            r0.I()
            r1 = r2
            r2 = r22
            r19 = r6
            r6 = r9
            r9 = r4
            r4 = r19
            r7 = r13
            goto L_0x01ba
        L_0x00ee:
            r0.D()
            r10 = r12 & 1
            r15 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r10 == 0) goto L_0x011f
            boolean r10 = r0.L()
            if (r10 == 0) goto L_0x0102
            goto L_0x011f
        L_0x0102:
            r0.I()
            r1 = r34 & 2
            if (r1 == 0) goto L_0x010b
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010b:
            r1 = r34 & 4
            if (r1 == 0) goto L_0x0111
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0111:
            r1 = r34 & 16
            if (r1 == 0) goto L_0x0117
            r3 = r3 & r16
        L_0x0117:
            r1 = r34 & 32
            if (r1 == 0) goto L_0x011c
            r3 = r3 & r15
        L_0x011c:
            r17 = r22
            goto L_0x016c
        L_0x011f:
            if (r1 == 0) goto L_0x0124
            k0.i$a r1 = k0.i.f23074a
            r2 = r1
        L_0x0124:
            r1 = r34 & 2
            r10 = 6
            if (r1 == 0) goto L_0x0136
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r0, r10)
            long r17 = r1.m678getBackground0d7_KjU()
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0138
        L_0x0136:
            r17 = r22
        L_0x0138:
            r1 = r34 & 4
            if (r1 == 0) goto L_0x0148
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r0, r10)
            long r6 = r1.m700getPrimaryText0d7_KjU()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0148:
            if (r8 == 0) goto L_0x014c
            r1 = 0
            r9 = r1
        L_0x014c:
            r1 = r34 & 16
            if (r1 == 0) goto L_0x015d
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r0, r10)
            long r13 = r1.m672getAction0d7_KjU()
            r1 = r3 & r16
            r3 = r1
        L_0x015d:
            r1 = r34 & 32
            if (r1 == 0) goto L_0x016c
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r0, r10)
            long r4 = r1.m694getOnAction0d7_KjU()
            r3 = r3 & r15
        L_0x016c:
            r0.v()
            io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1 r1 = new io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
            r21 = r1
            r22 = r9
            r23 = r13
            r25 = r4
            r21.<init>(r22, r23, r25)
            r8 = -1557616541(0xffffffffa328a863, float:-9.1429555E-18)
            r10 = 1
            r15 = 54
            g0.a r1 = g0.c.e(r8, r10, r1, r0, r15)
            io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2 r8 = new io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
            r21 = r8
            r22 = r31
            r23 = r17
            r25 = r6
            r21.<init>(r22, r23, r25)
            r27 = r4
            r4 = 1814183329(0x6c223da1, float:7.845481E26)
            g0.a r4 = g0.c.e(r4, r10, r8, r0, r15)
            int r3 = r3 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 390(0x186, float:5.47E-43)
            r5 = 0
            r21 = r1
            r22 = r2
            r23 = r4
            r24 = r0
            r25 = r3
            r26 = r5
            V.C1383h.b(r21, r22, r23, r24, r25, r26)
            r1 = r2
            r4 = r6
            r6 = r9
            r7 = r13
            r2 = r17
            r9 = r27
        L_0x01ba:
            Y.Y0 r14 = r0.k()
            if (r14 == 0) goto L_0x01cf
            io.intercom.android.sdk.ui.component.y r15 = new io.intercom.android.sdk.ui.component.y
            r0 = r15
            r11 = r31
            r12 = r33
            r13 = r34
            r0.<init>(r1, r2, r4, r6, r7, r9, r11, r12, r13)
            r14.a(r15)
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.JumpToBottomKt.m603JumpToBottomkNRdK3w(k0.i, long, long, java.lang.String, long, long, yf.a, Y.m, int, int):void");
    }

    @IntercomPreviews
    private static final void JumpToBottomPreview(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(-1260816059);
        if (i11 != 0 || !h10.i()) {
            m603JumpToBottomkNRdK3w((i) null, 0, 0, (String) null, 0, 0, new w(), h10, 1572864, 63);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M JumpToBottomPreview$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M JumpToBottomPreview$lambda$2(int i10, C1500m mVar, int i11) {
        JumpToBottomPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M JumpToBottom_kNRdK3w$lambda$0(i iVar, long j10, long j11, String str, long j12, long j13, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6787a aVar2 = aVar;
        C6496s.h(aVar2, "$onClick");
        m603JumpToBottomkNRdK3w(iVar, j10, j11, str, j12, j13, aVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    /* renamed from: UnreadBadge-eaDK9VM  reason: not valid java name */
    public static final void m604UnreadBadgeeaDK9VM(i iVar, String str, long j10, long j11, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        long j12;
        long j13;
        long j14;
        long j15;
        i iVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2 = str;
        int i17 = i10;
        C1500m h10 = mVar.h(885989429);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i17 | 6;
            iVar2 = iVar;
        } else if ((i17 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i17;
        } else {
            iVar2 = iVar;
            i12 = i17;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i17 & 112) == 0) {
            if (h10.S(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i17 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j10;
                if (h10.e(j12)) {
                    i14 = 256;
                    i12 |= i14;
                }
            } else {
                j12 = j10;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            j12 = j10;
        }
        if ((i17 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                j13 = j11;
                if (h10.e(j13)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                j13 = j11;
            }
            i13 = 1024;
            i12 |= i13;
        } else {
            j13 = j11;
        }
        if ((i12 & 5851) != 1170 || !h10.i()) {
            h10.D();
            if ((i17 & 1) == 0 || h10.L()) {
                if (i18 != 0) {
                    iVar3 = i.f23074a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i11 & 4) != 0) {
                    j12 = IntercomTheme.INSTANCE.getColors(h10, 6).m672getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    j13 = IntercomTheme.INSTANCE.getColors(h10, 6).m694getOnAction0d7_KjU();
                    i12 &= -7169;
                }
            } else {
                h10.I();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                iVar3 = iVar2;
            }
            long j16 = j13;
            int i19 = i12;
            long j17 = j16;
            h10.v();
            C1383h.a(iVar3, j12, 0, c.e(-480925784, true, new JumpToBottomKt$UnreadBadge$1(j17, str2), h10, 54), h10, (i19 & 14) | 3072 | ((i19 >> 3) & 112), 4);
            long j18 = j17;
            j15 = j12;
            j14 = j18;
        } else {
            h10.I();
            iVar3 = iVar2;
            j15 = j12;
            j14 = j13;
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new z(iVar3, str, j15, j14, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnreadBadge_eaDK9VM$lambda$3(i iVar, String str, long j10, long j11, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$badgeText");
        m604UnreadBadgeeaDK9VM(iVar, str, j10, j11, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final float getJumpBottomPadding() {
        return JumpBottomPadding;
    }
}
