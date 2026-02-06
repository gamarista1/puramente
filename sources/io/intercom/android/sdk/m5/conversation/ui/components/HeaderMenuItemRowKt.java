package io.intercom.android.sdk.m5.conversation.ui.components;

import V.B0;
import V.C1383h;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import yf.C6787a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001au\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a[\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lk0/i;", "modifier", "", "label", "", "icon", "badgeText", "", "showBadge", "showUnreadDot", "isExpanded", "Lkotlin/Function0;", "Llf/M;", "onClick", "enabled", "Lr0/x0;", "tint", "HeaderMenuItemRow-6RhP_wg", "(Lk0/i;Ljava/lang/String;ILjava/lang/String;ZZZLyf/a;ZJLY/m;II)V", "HeaderMenuItemRow", "CollapsedHeaderMenuItemRow-88mDfTA", "(Lk0/i;Ljava/lang/String;ILjava/lang/String;ZZLyf/a;JLY/m;II)V", "CollapsedHeaderMenuItemRow", "ExpandedHeaderMenuItemRow", "(Lk0/i;Ljava/lang/String;ILjava/lang/String;ZZLyf/a;ZLY/m;II)V", "UnreadBadge", "(Lk0/i;Ljava/lang/String;LY/m;II)V", "CollapsedHeaderMenuItemPreview", "(LY/m;I)V", "CollapsedHeaderMenuItemDotPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HeaderMenuItemRowKt {
    @IntercomPreviews
    private static final void CollapsedHeaderMenuItemDotPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(591640881);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m230getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6163w(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CollapsedHeaderMenuItemDotPreview$lambda$9(int i10, C1500m mVar, int i11) {
        CollapsedHeaderMenuItemDotPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void CollapsedHeaderMenuItemPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1230888234);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m228getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6166z(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CollapsedHeaderMenuItemPreview$lambda$8(int i10, C1500m mVar, int i11) {
        CollapsedHeaderMenuItemPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: CollapsedHeaderMenuItemRow-88mDfTA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m251CollapsedHeaderMenuItemRow88mDfTA(k0.i r18, java.lang.String r19, int r20, java.lang.String r21, boolean r22, boolean r23, yf.C6787a r24, long r25, Y.C1500m r27, int r28, int r29) {
        /*
            r4 = r21
            r5 = r22
            r6 = r23
            r10 = r28
            r11 = r29
            r0 = 955883181(0x38f99ead, float:1.1902801E-4)
            r1 = r27
            Y.m r0 = r1.h(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x001d
            r2 = r10 | 6
            r3 = r2
            r2 = r18
            goto L_0x0031
        L_0x001d:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002e
            r2 = r18
            boolean r3 = r0.S(r2)
            if (r3 == 0) goto L_0x002b
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = 2
        L_0x002c:
            r3 = r3 | r10
            goto L_0x0031
        L_0x002e:
            r2 = r18
            r3 = r10
        L_0x0031:
            r7 = r11 & 2
            if (r7 == 0) goto L_0x003a
            r3 = r3 | 48
        L_0x0037:
            r7 = r19
            goto L_0x004c
        L_0x003a:
            r7 = r10 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0037
            r7 = r19
            boolean r8 = r0.S(r7)
            if (r8 == 0) goto L_0x0049
            r8 = 32
            goto L_0x004b
        L_0x0049:
            r8 = 16
        L_0x004b:
            r3 = r3 | r8
        L_0x004c:
            r8 = r11 & 4
            if (r8 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r8 = r20
            goto L_0x0067
        L_0x0055:
            r8 = r10 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0052
            r8 = r20
            boolean r9 = r0.d(r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r9
        L_0x0067:
            r9 = r11 & 8
            if (r9 == 0) goto L_0x006e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007e
            boolean r9 = r0.S(r4)
            if (r9 == 0) goto L_0x007b
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r9
        L_0x007e:
            r9 = r11 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0085:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0097
            boolean r9 = r0.b(r5)
            if (r9 == 0) goto L_0x0094
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r9
        L_0x0097:
            r9 = r11 & 32
            if (r9 == 0) goto L_0x009f
            r9 = 196608(0x30000, float:2.75506E-40)
        L_0x009d:
            r3 = r3 | r9
            goto L_0x00b0
        L_0x009f:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x00b0
            boolean r9 = r0.b(r6)
            if (r9 == 0) goto L_0x00ad
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009d
        L_0x00ad:
            r9 = 65536(0x10000, float:9.18355E-41)
            goto L_0x009d
        L_0x00b0:
            r9 = r11 & 64
            if (r9 == 0) goto L_0x00ba
            r9 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r9
        L_0x00b7:
            r9 = r24
            goto L_0x00cd
        L_0x00ba:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x00b7
            r9 = r24
            boolean r12 = r0.C(r9)
            if (r12 == 0) goto L_0x00ca
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r12
        L_0x00cd:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x00d7
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r12
            r14 = r25
            goto L_0x00ea
        L_0x00d7:
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r10
            r14 = r25
            if (r12 != 0) goto L_0x00ea
            boolean r12 = r0.e(r14)
            if (r12 == 0) goto L_0x00e7
            r12 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r12 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r3 = r3 | r12
        L_0x00ea:
            r12 = 23967451(0x16db6db, float:4.3661218E-38)
            r12 = r12 & r3
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r12 != r13) goto L_0x00ff
            boolean r12 = r0.i()
            if (r12 != 0) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            r0.I()
            r1 = r2
            goto L_0x013d
        L_0x00ff:
            if (r1 == 0) goto L_0x0104
            k0.i$a r1 = k0.i.f23074a
            goto L_0x0105
        L_0x0104:
            r1 = r2
        L_0x0105:
            io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
            r2.<init>(r6, r4, r5)
            r12 = -415284443(0xffffffffe73f4325, float:-9.032106E23)
            r13 = 1
            r4 = 54
            g0.a r2 = g0.c.e(r12, r13, r2, r0, r4)
            io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
            r18 = r12
            r5 = r13
            r13 = r24
            r14 = r20
            r15 = r19
            r16 = r25
            r12.<init>(r13, r14, r15, r16)
            r12 = 1598560935(0x5f481aa7, float:1.4419021E19)
            r13 = r18
            g0.a r14 = g0.c.e(r12, r5, r13, r0, r4)
            int r3 = r3 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 390(0x186, float:5.47E-43)
            r17 = 0
            r12 = r2
            r13 = r1
            r15 = r0
            r16 = r3
            V.C1383h.b(r12, r13, r14, r15, r16, r17)
        L_0x013d:
            Y.Y0 r12 = r0.k()
            if (r12 == 0) goto L_0x015e
            io.intercom.android.sdk.m5.conversation.ui.components.y r13 = new io.intercom.android.sdk.m5.conversation.ui.components.y
            r0 = r13
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r10 = r28
            r11 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            r12.a(r13)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.m251CollapsedHeaderMenuItemRow88mDfTA(k0.i, java.lang.String, int, java.lang.String, boolean, boolean, yf.a, long, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(i iVar, String str, int i10, String str2, boolean z10, boolean z11, C6787a aVar, long j10, int i11, int i12, C1500m mVar, int i13) {
        C6496s.h(str, "$label");
        C6787a aVar2 = aVar;
        C6496s.h(aVar2, "$onClick");
        m251CollapsedHeaderMenuItemRow88mDfTA(iVar, str, i10, str2, z10, z11, aVar2, j10, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void ExpandedHeaderMenuItemRow(k0.i r43, java.lang.String r44, int r45, java.lang.String r46, boolean r47, boolean r48, yf.C6787a r49, boolean r50, Y.C1500m r51, int r52, int r53) {
        /*
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            r15 = r50
            r2 = r52
            r1 = r53
            r8 = 32
            r14 = 16
            r9 = 2
            r13 = 6
            r10 = 1007952458(0x3c14224a, float:0.009041378)
            r11 = r51
            Y.m r12 = r11.h(r10)
            r10 = 1
            r11 = r1 & 1
            r10 = 4
            if (r11 == 0) goto L_0x002c
            r16 = r2 | 6
            r13 = r43
            r17 = r16
            goto L_0x0042
        L_0x002c:
            r16 = r2 & 14
            r13 = r43
            if (r16 != 0) goto L_0x0040
            boolean r17 = r12.S(r13)
            if (r17 == 0) goto L_0x003b
            r17 = r10
            goto L_0x003d
        L_0x003b:
            r17 = r9
        L_0x003d:
            r17 = r2 | r17
            goto L_0x0042
        L_0x0040:
            r17 = r2
        L_0x0042:
            r9 = r9 & r1
            if (r9 == 0) goto L_0x004c
            r17 = r17 | 48
        L_0x0047:
            r9 = r44
        L_0x0049:
            r0 = r17
            goto L_0x0060
        L_0x004c:
            r9 = r2 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r44
            boolean r18 = r12.S(r9)
            if (r18 == 0) goto L_0x005b
            r18 = r8
            goto L_0x005d
        L_0x005b:
            r18 = r14
        L_0x005d:
            r17 = r17 | r18
            goto L_0x0049
        L_0x0060:
            r17 = r1 & 4
            if (r17 == 0) goto L_0x0067
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0077
        L_0x0067:
            r10 = r2 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0077
            boolean r10 = r12.d(r3)
            if (r10 == 0) goto L_0x0074
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0076
        L_0x0074:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0076:
            r0 = r0 | r10
        L_0x0077:
            r10 = r1 & 8
            if (r10 == 0) goto L_0x007e
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x008e
        L_0x007e:
            r10 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x008e
            boolean r10 = r12.S(r4)
            if (r10 == 0) goto L_0x008b
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r0 = r0 | r10
        L_0x008e:
            r10 = r1 & 16
            if (r10 == 0) goto L_0x0095
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a7
        L_0x0095:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r2
            if (r10 != 0) goto L_0x00a7
            boolean r10 = r12.b(r5)
            if (r10 == 0) goto L_0x00a4
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r0 = r0 | r10
        L_0x00a7:
            r8 = r8 & r1
            if (r8 == 0) goto L_0x00ae
            r8 = 196608(0x30000, float:2.75506E-40)
        L_0x00ac:
            r0 = r0 | r8
            goto L_0x00bf
        L_0x00ae:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r2
            if (r8 != 0) goto L_0x00bf
            boolean r8 = r12.b(r6)
            if (r8 == 0) goto L_0x00bc
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00bc:
            r8 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00ac
        L_0x00bf:
            r8 = r1 & 64
            r10 = 1048576(0x100000, float:1.469368E-39)
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r8 == 0) goto L_0x00cd
            r8 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c9:
            r0 = r0 | r8
        L_0x00ca:
            r8 = 128(0x80, float:1.794E-43)
            goto L_0x00dc
        L_0x00cd:
            r8 = r2 & r19
            if (r8 != 0) goto L_0x00ca
            boolean r8 = r12.C(r7)
            if (r8 == 0) goto L_0x00d9
            r8 = r10
            goto L_0x00c9
        L_0x00d9:
            r8 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c9
        L_0x00dc:
            r8 = r8 & r1
            if (r8 == 0) goto L_0x00e3
            r8 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e1:
            r0 = r0 | r8
            goto L_0x00f4
        L_0x00e3:
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r2
            if (r8 != 0) goto L_0x00f4
            boolean r8 = r12.b(r15)
            if (r8 == 0) goto L_0x00f1
            r8 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e1
        L_0x00f1:
            r8 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e1
        L_0x00f4:
            r8 = 23967451(0x16db6db, float:4.3661218E-38)
            r8 = r8 & r0
            r14 = 4793490(0x492492, float:6.71711E-39)
            if (r8 != r14) goto L_0x010a
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x0104
            goto L_0x010a
        L_0x0104:
            r12.I()
            r1 = r13
            goto L_0x029b
        L_0x010a:
            if (r11 == 0) goto L_0x0110
            k0.i$a r8 = k0.i.f23074a
            r14 = r8
            goto L_0x0111
        L_0x0110:
            r14 = r13
        L_0x0111:
            r8 = 0
            r11 = 0
            r13 = 1
            k0.i r8 = androidx.compose.foundation.layout.q.h(r14, r8, r13, r11)
            r11 = -1310322408(0xffffffffb1e61118, float:-6.6958243E-9)
            r12.T(r11)
            r11 = r0 & r19
            r19 = r14
            r14 = 0
            if (r11 != r10) goto L_0x0127
            r10 = r13
            goto L_0x0128
        L_0x0127:
            r10 = r14
        L_0x0128:
            java.lang.Object r11 = r12.A()
            if (r10 != 0) goto L_0x0136
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x013e
        L_0x0136:
            io.intercom.android.sdk.m5.conversation.ui.components.C r11 = new io.intercom.android.sdk.m5.conversation.ui.components.C
            r11.<init>(r7)
            r12.r(r11)
        L_0x013e:
            r13 = r11
            yf.a r13 = (yf.C6787a) r13
            r12.M()
            r20 = 6
            r21 = 0
            r10 = 0
            r11 = 0
            r9 = r50
            r41 = r12
            r12 = r13
            r13 = r20
            r42 = r19
            r1 = 16
            r14 = r21
            k0.i r8 = androidx.compose.foundation.d.d(r8, r9, r10, r11, r12, r13, r14)
            float r1 = (float) r1
            float r9 = c1.h.j(r1)
            k0.i r8 = androidx.compose.foundation.layout.n.i(r8, r9)
            C.c r9 = C.C1085c.f882a
            C.c$f r9 = r9.d()
            k0.c$a r10 = k0.c.f23044a
            k0.c$c r10 = r10.i()
            r11 = 54
            r12 = r41
            H0.F r9 = C.W.b(r9, r10, r12, r11)
            r10 = 0
            int r11 = Y.C1494j.a(r12, r10)
            Y.y r10 = r12.p()
            k0.i r8 = k0.h.e(r12, r8)
            J0.g$a r13 = J0.C1241g.f3853J
            yf.a r14 = r13.a()
            Y.f r16 = r12.j()
            if (r16 != 0) goto L_0x0194
            Y.C1494j.c()
        L_0x0194:
            r12.F()
            boolean r16 = r12.f()
            if (r16 == 0) goto L_0x01a1
            r12.U(r14)
            goto L_0x01a4
        L_0x01a1:
            r12.q()
        L_0x01a4:
            Y.m r14 = Y.F1.a(r12)
            yf.p r2 = r13.c()
            Y.F1.b(r14, r9, r2)
            yf.p r2 = r13.e()
            Y.F1.b(r14, r10, r2)
            yf.p r2 = r13.b()
            boolean r9 = r14.f()
            if (r9 != 0) goto L_0x01ce
            java.lang.Object r9 = r14.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r10)
            if (r9 != 0) goto L_0x01dc
        L_0x01ce:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r14.r(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r14.V(r9, r2)
        L_0x01dc:
            yf.p r2 = r13.d()
            Y.F1.b(r14, r8, r2)
            C.Z r2 = C.Z.f873a
            r2 = 1463394796(0x5739a1ec, float:2.041051E14)
            r12.T(r2)
            if (r15 == 0) goto L_0x01fa
            io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r2.getColors(r12, r8)
            long r8 = r2.m700getPrimaryText0d7_KjU()
            goto L_0x0200
        L_0x01fa:
            r0.x0$a r2 = r0.C2544x0.f25560b
            long r8 = r2.e()
        L_0x0200:
            r12.M()
            int r2 = r0 >> 3
            r38 = r2 & 14
            r39 = 0
            r40 = 131066(0x1fffa, float:1.83663E-40)
            r17 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r16 = r44
            r18 = r8
            r37 = r12
            V.T0.b(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            if (r6 == 0) goto L_0x0250
            r0 = -1879265457(0xffffffff8ffcaf4f, float:-2.4916645E-29)
            r12.T(r0)
            k0.i$a r0 = k0.i.f23074a
            r1 = 4
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            k0.i r0 = androidx.compose.foundation.layout.n.i(r0, r1)
            r1 = 0
            r2 = 6
            io.intercom.android.sdk.m5.components.ConversationItemKt.UnreadIndicator(r0, r12, r2, r1)
            r12.M()
            goto L_0x0296
        L_0x0250:
            r2 = 6
            if (r4 == 0) goto L_0x026a
            if (r5 != 0) goto L_0x0256
            goto L_0x026a
        L_0x0256:
            r1 = -1878872966(0xffffffff9002ac7a, float:-2.577085E-29)
            r12.T(r1)
            k0.i$a r1 = k0.i.f23074a
            int r0 = r0 >> r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = 0
            UnreadBadge(r1, r4, r12, r0, r2)
            r12.M()
            goto L_0x0296
        L_0x026a:
            r10 = -1879114425(0xffffffff8ffefd47, float:-2.5143893E-29)
            r12.T(r10)
            k0.i$a r10 = k0.i.f23074a
            float r1 = c1.h.j(r1)
            k0.i r18 = androidx.compose.foundation.layout.q.n(r10, r1)
            int r1 = r0 >> 6
            r1 = r1 & 14
            w0.c r16 = M0.e.c(r3, r12, r1)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 392(0x188, float:5.5E-43)
            r23 = 0
            r17 = r44
            r19 = r8
            r21 = r12
            r22 = r0
            V.V.a(r16, r17, r18, r19, r21, r22, r23)
            r12.M()
        L_0x0296:
            r12.u()
            r1 = r42
        L_0x029b:
            Y.Y0 r11 = r12.k()
            if (r11 == 0) goto L_0x02bc
            io.intercom.android.sdk.m5.conversation.ui.components.D r12 = new io.intercom.android.sdk.m5.conversation.ui.components.D
            r0 = r12
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            r8 = r50
            r9 = r52
            r10 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow(k0.i, java.lang.String, int, java.lang.String, boolean, boolean, yf.a, boolean, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedHeaderMenuItemRow$lambda$4$lambda$3(C6787a aVar) {
        C6496s.h(aVar, "$onClick");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ExpandedHeaderMenuItemRow$lambda$6(i iVar, String str, int i10, String str2, boolean z10, boolean z11, C6787a aVar, boolean z12, int i11, int i12, C1500m mVar, int i13) {
        C6496s.h(str, "$label");
        C6787a aVar2 = aVar;
        C6496s.h(aVar2, "$onClick");
        ExpandedHeaderMenuItemRow(iVar, str, i10, str2, z10, z11, aVar2, z12, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0121  */
    /* renamed from: HeaderMenuItemRow-6RhP_wg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m252HeaderMenuItemRow6RhP_wg(k0.i r23, java.lang.String r24, int r25, java.lang.String r26, boolean r27, boolean r28, boolean r29, yf.C6787a r30, boolean r31, long r32, Y.C1500m r34, int r35, int r36) {
        /*
            r12 = r24
            r13 = r35
            r14 = r36
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            r0 = 442747888(0x1a63cbf0, float:4.710724E-23)
            r1 = r34
            Y.m r15 = r1.h(r0)
            r0 = r14 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r13 | 6
            r2 = r1
            r1 = r23
            goto L_0x0032
        L_0x001e:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r23
            boolean r2 = r15.S(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r13
            goto L_0x0032
        L_0x002f:
            r1 = r23
            r2 = r13
        L_0x0032:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x0039
            r2 = r2 | 48
            goto L_0x0049
        L_0x0039:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            boolean r3 = r15.S(r12)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r2 = r2 | r3
        L_0x0049:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            r11 = r25
            goto L_0x0064
        L_0x0052:
            r3 = r13 & 896(0x380, float:1.256E-42)
            r11 = r25
            if (r3 != 0) goto L_0x0064
            boolean r3 = r15.d(r11)
            if (r3 == 0) goto L_0x0061
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r3
        L_0x0064:
            r3 = r14 & 8
            if (r3 == 0) goto L_0x006d
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r4 = r26
            goto L_0x007f
        L_0x006d:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x006a
            r4 = r26
            boolean r5 = r15.S(r4)
            if (r5 == 0) goto L_0x007c
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r2 = r2 | r5
        L_0x007f:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0088
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r6 = r27
            goto L_0x009c
        L_0x0088:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x0085
            r6 = r27
            boolean r7 = r15.b(r6)
            if (r7 == 0) goto L_0x0099
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r2 = r2 | r7
        L_0x009c:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x00a6
            r8 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r8
        L_0x00a3:
            r8 = r28
            goto L_0x00b9
        L_0x00a6:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a3
            r8 = r28
            boolean r9 = r15.b(r8)
            if (r9 == 0) goto L_0x00b6
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r2 = r2 | r9
        L_0x00b9:
            r9 = r14 & 64
            r10 = 3670016(0x380000, float:5.142788E-39)
            if (r9 == 0) goto L_0x00c6
            r16 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r16
            r10 = r29
            goto L_0x00d9
        L_0x00c6:
            r16 = r13 & r10
            r10 = r29
            if (r16 != 0) goto L_0x00d9
            boolean r16 = r15.b(r10)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r2 = r2 | r16
        L_0x00d9:
            r1 = r14 & 128(0x80, float:1.794E-43)
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            if (r1 == 0) goto L_0x00e6
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r17
            r4 = r30
            goto L_0x00f9
        L_0x00e6:
            r17 = r13 & r16
            r4 = r30
            if (r17 != 0) goto L_0x00f9
            boolean r17 = r15.C(r4)
            if (r17 == 0) goto L_0x00f5
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r2 = r2 | r17
        L_0x00f9:
            r4 = r14 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0103
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r4
        L_0x0100:
            r4 = r31
            goto L_0x0117
        L_0x0103:
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x0100
            r4 = r31
            boolean r17 = r15.b(r4)
            if (r17 == 0) goto L_0x0113
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r2 = r2 | r17
        L_0x0117:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0121
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r4
            r11 = r32
            goto L_0x0134
        L_0x0121:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r13
            r11 = r32
            if (r4 != 0) goto L_0x0134
            boolean r4 = r15.e(r11)
            if (r4 == 0) goto L_0x0131
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r2 = r2 | r4
        L_0x0134:
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r2
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r6) goto L_0x0153
            boolean r4 = r15.i()
            if (r4 != 0) goto L_0x0144
            goto L_0x0153
        L_0x0144:
            r15.I()
            r1 = r23
            r4 = r26
            r5 = r27
            r6 = r8
            r7 = r10
            r8 = r30
            goto L_0x01f0
        L_0x0153:
            if (r0 == 0) goto L_0x015a
            k0.i$a r0 = k0.i.f23074a
            r17 = r0
            goto L_0x015c
        L_0x015a:
            r17 = r23
        L_0x015c:
            if (r3 == 0) goto L_0x0162
            r0 = 0
            r18 = r0
            goto L_0x0164
        L_0x0162:
            r18 = r26
        L_0x0164:
            if (r5 == 0) goto L_0x016a
            r0 = 1
            r19 = r0
            goto L_0x016c
        L_0x016a:
            r19 = r27
        L_0x016c:
            r0 = 0
            if (r7 == 0) goto L_0x0172
            r20 = r0
            goto L_0x0174
        L_0x0172:
            r20 = r8
        L_0x0174:
            if (r9 == 0) goto L_0x0179
            r21 = r0
            goto L_0x017b
        L_0x0179:
            r21 = r10
        L_0x017b:
            if (r1 == 0) goto L_0x0185
            io.intercom.android.sdk.m5.conversation.ui.components.A r0 = new io.intercom.android.sdk.m5.conversation.ui.components.A
            r0.<init>()
            r22 = r0
            goto L_0x0187
        L_0x0185:
            r22 = r30
        L_0x0187:
            r0 = 524286(0x7fffe, float:7.34681E-40)
            if (r21 == 0) goto L_0x01b6
            r1 = -1365549178(0xffffffffae9b5f86, float:-7.065552E-11)
            r15.T(r1)
            r0 = r0 & r2
            int r1 = r2 >> 3
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r1 = r1 & r16
            r9 = r0 | r1
            r10 = 0
            r0 = r17
            r1 = r24
            r2 = r25
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r31
            r8 = r15
            ExpandedHeaderMenuItemRow(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.M()
            goto L_0x01e4
        L_0x01b6:
            r1 = -1365233877(0xffffffffaea02f2b, float:-7.284336E-11)
            r15.T(r1)
            r0 = r0 & r2
            int r1 = r2 >> 3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r0 = r0 | r1
            int r1 = r2 >> 6
            r1 = r1 & r16
            r10 = r0 | r1
            r16 = 0
            r0 = r17
            r1 = r24
            r2 = r25
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r32
            r9 = r15
            r11 = r16
            m251CollapsedHeaderMenuItemRow88mDfTA(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            r15.M()
        L_0x01e4:
            r1 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
        L_0x01f0:
            Y.Y0 r15 = r15.k()
            if (r15 == 0) goto L_0x020c
            io.intercom.android.sdk.m5.conversation.ui.components.B r12 = new io.intercom.android.sdk.m5.conversation.ui.components.B
            r0 = r12
            r2 = r24
            r3 = r25
            r9 = r31
            r10 = r32
            r14 = r12
            r12 = r35
            r13 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r15.a(r14)
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.m252HeaderMenuItemRow6RhP_wg(k0.i, java.lang.String, int, java.lang.String, boolean, boolean, boolean, yf.a, boolean, long, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HeaderMenuItemRow_6RhP_wg$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HeaderMenuItemRow_6RhP_wg$lambda$1(i iVar, String str, int i10, String str2, boolean z10, boolean z11, boolean z12, C6787a aVar, boolean z13, long j10, int i11, int i12, C1500m mVar, int i13) {
        String str3 = str;
        C6496s.h(str3, "$label");
        m252HeaderMenuItemRow6RhP_wg(iVar, str3, i10, str2, z10, z11, z12, aVar, z13, j10, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void UnreadBadge(i iVar, String str, C1500m mVar, int i10, int i11) {
        int i12;
        long j10;
        int i13;
        int i14;
        C1500m h10 = mVar.h(1917800334);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(iVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (h10.S(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !h10.i()) {
            if (i15 != 0) {
                iVar = i.f23074a;
            }
            long r22 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m679getBadge0d7_KjU();
            if (ColorExtensionsKt.m719isLightColor8_81llA(r22)) {
                j10 = C2544x0.f25560b.a();
            } else {
                j10 = C2544x0.f25560b.i();
            }
            C1383h.a(iVar, r22, 0, c.e(-1370135743, true, new HeaderMenuItemRowKt$UnreadBadge$1(j10, str), h10, 54), h10, (i12 & 14) | 3072, 4);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6164x(iVar, str, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnreadBadge$lambda$7(i iVar, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$badgeText");
        UnreadBadge(iVar, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
