package io.intercom.android.sdk.tickets;

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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"", "name", "Lkotlin/Function0;", "Llf/M;", "onClick", "", "visible", "Lk0/i;", "modifier", "TicketProgressBanner", "(Ljava/lang/String;Lyf/a;ZLk0/i;LY/m;II)V", "TicketProgressRowPreview", "(LY/m;I)V", "TicketProgressRowLongTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketProgressBannerKt {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TicketProgressBanner(java.lang.String r17, yf.C6787a r18, boolean r19, k0.i r20, Y.C1500m r21, int r22, int r23) {
        /*
            r1 = r17
            r2 = r18
            r5 = r22
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = -108721483(0xfffffffff9850ab5, float:-8.634908E34)
            r3 = r21
            Y.m r0 = r3.h(r0)
            r3 = r23 & 1
            r4 = 4
            r6 = 2
            if (r3 == 0) goto L_0x0022
            r3 = r5 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r0.S(r1)
            if (r3 == 0) goto L_0x002e
            r3 = r4
            goto L_0x002f
        L_0x002e:
            r3 = r6
        L_0x002f:
            r3 = r3 | r5
            goto L_0x0032
        L_0x0031:
            r3 = r5
        L_0x0032:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x0049
        L_0x0039:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0049
            boolean r7 = r0.C(r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r3 = r3 | r7
        L_0x0049:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r19
            goto L_0x0064
        L_0x0052:
            r7 = r5 & 896(0x380, float:1.256E-42)
            r15 = r19
            if (r7 != 0) goto L_0x0064
            boolean r7 = r0.b(r15)
            if (r7 == 0) goto L_0x0061
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r7
        L_0x0064:
            r7 = r23 & 8
            if (r7 == 0) goto L_0x006d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r8 = r20
            goto L_0x007f
        L_0x006d:
            r8 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x006a
            r8 = r20
            boolean r9 = r0.S(r8)
            if (r9 == 0) goto L_0x007c
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r9
        L_0x007f:
            r9 = r3 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0091
            boolean r9 = r0.i()
            if (r9 != 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            r0.I()
            r4 = r8
            goto L_0x00d9
        L_0x0091:
            if (r7 == 0) goto L_0x0098
            k0.i$a r7 = k0.i.f23074a
            r16 = r7
            goto L_0x009a
        L_0x0098:
            r16 = r8
        L_0x009a:
            r7 = 1000(0x3e8, float:1.401E-42)
            r8 = 0
            w.q0 r4 = w.C2798j.j(r7, r7, r8, r4, r8)
            r9 = 0
            androidx.compose.animation.i r4 = androidx.compose.animation.g.o(r4, r9, r6, r8)
            r10 = 0
            r11 = 6
            w.q0 r7 = w.C2798j.j(r7, r10, r8, r11, r8)
            androidx.compose.animation.k r9 = androidx.compose.animation.g.q(r7, r9, r6, r8)
            io.intercom.android.sdk.tickets.TicketProgressBannerKt$TicketProgressBanner$1 r6 = new io.intercom.android.sdk.tickets.TicketProgressBannerKt$TicketProgressBanner$1
            r6.<init>(r2, r1)
            r7 = 54
            r8 = 417589981(0x18e3eadd, float:5.8915276E-24)
            r10 = 1
            g0.a r12 = g0.c.e(r8, r10, r6, r0, r7)
            int r3 = r3 >> r11
            r6 = r3 & 14
            r7 = 200064(0x30d80, float:2.8035E-40)
            r6 = r6 | r7
            r3 = r3 & 112(0x70, float:1.57E-43)
            r13 = r6 | r3
            r14 = 16
            r10 = 0
            r6 = r19
            r7 = r16
            r8 = r4
            r11 = r12
            r12 = r0
            v.C2721d.g(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r16
        L_0x00d9:
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x00f2
            io.intercom.android.sdk.tickets.C r8 = new io.intercom.android.sdk.tickets.C
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner(java.lang.String, yf.a, boolean, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressBanner$lambda$0(String str, C6787a aVar, boolean z10, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$name");
        C6496s.h(aVar, "$onClick");
        TicketProgressBanner(str, aVar, z10, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void TicketProgressRowLongTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-384429412);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m529getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressRowLongTextPreview$lambda$2(int i10, C1500m mVar, int i11) {
        TicketProgressRowLongTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TicketProgressRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-433396877);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m528getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressRowPreview$lambda$1(int i10, C1500m mVar, int i11) {
        TicketProgressRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
