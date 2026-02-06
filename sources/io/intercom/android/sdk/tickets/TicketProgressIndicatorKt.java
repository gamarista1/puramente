package io.intercom.android.sdk.tickets;

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
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import t0.C2605f;
import w.C2762F;
import w.C2774S;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\n\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ProgressSection;", "progressSections", "Lr0/x0;", "progressColor", "Lk0/i;", "modifier", "Llf/M;", "TicketProgressIndicator-3IgeMak", "(Ljava/util/List;JLk0/i;LY/m;II)V", "TicketProgressIndicator", "TicketProgressIndicatorPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketProgressIndicatorKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: TicketProgressIndicator-3IgeMak  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m536TicketProgressIndicator3IgeMak(java.util.List<io.intercom.android.sdk.tickets.TicketTimelineCardState.ProgressSection> r34, long r35, k0.i r37, Y.C1500m r38, int r39, int r40) {
        /*
            r1 = r34
            r12 = r35
            java.lang.String r0 = "progressSections"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            r0 = 484493125(0x1ce0c745, float:1.4874587E-21)
            r2 = r38
            Y.m r0 = r2.h(r0)
            r2 = r40 & 4
            if (r2 == 0) goto L_0x001a
            k0.i$a r2 = k0.i.f23074a
            r15 = r2
            goto L_0x001c
        L_0x001a:
            r15 = r37
        L_0x001c:
            java.lang.String r2 = "Infinite progress animation"
            r3 = 6
            r14 = 0
            w.N r26 = w.C2771O.c(r2, r0, r3, r14)
            io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r2.getColors(r0, r4)
            long r10 = r2.m687getDisabled0d7_KjU()
            C.c r2 = C.C1085c.f882a
            r4 = 4
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            C.c$f r2 = r2.n(r4)
            r4 = 0
            r9 = 0
            r8 = 1
            k0.i r4 = androidx.compose.foundation.layout.q.h(r15, r9, r8, r4)
            r5 = 50
            I.f r5 = I.g.a(r5)
            k0.i r4 = o0.C2342e.a(r4, r5)
            k0.c$a r5 = k0.c.f23044a
            k0.c$c r5 = r5.l()
            H0.F r2 = C.W.b(r2, r5, r0, r3)
            int r3 = Y.C1494j.a(r0, r14)
            Y.y r5 = r0.p()
            k0.i r4 = k0.h.e(r0, r4)
            J0.g$a r6 = J0.C1241g.f3853J
            yf.a r7 = r6.a()
            Y.f r16 = r0.j()
            if (r16 != 0) goto L_0x0072
            Y.C1494j.c()
        L_0x0072:
            r0.F()
            boolean r16 = r0.f()
            if (r16 == 0) goto L_0x007f
            r0.U(r7)
            goto L_0x0082
        L_0x007f:
            r0.q()
        L_0x0082:
            Y.m r7 = Y.F1.a(r0)
            yf.p r8 = r6.c()
            Y.F1.b(r7, r2, r8)
            yf.p r2 = r6.e()
            Y.F1.b(r7, r5, r2)
            yf.p r2 = r6.b()
            boolean r5 = r7.f()
            if (r5 != 0) goto L_0x00ac
            java.lang.Object r5 = r7.A()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r8)
            if (r5 != 0) goto L_0x00ba
        L_0x00ac:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r7.r(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.V(r3, r2)
        L_0x00ba:
            yf.p r2 = r6.d()
            Y.F1.b(r7, r4, r2)
            C.Z r27 = C.Z.f873a
            r2 = 1767069389(0x695356cd, float:1.5968328E25)
            r0.T(r2)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r28 = r2.iterator()
        L_0x00d0:
            boolean r2 = r28.hasNext()
            if (r2 == 0) goto L_0x0228
            java.lang.Object r2 = r28.next()
            r16 = r2
            io.intercom.android.sdk.tickets.TicketTimelineCardState$ProgressSection r16 = (io.intercom.android.sdk.tickets.TicketTimelineCardState.ProgressSection) r16
            r2 = 1767070266(0x69535a3a, float:1.596934E25)
            r0.T(r2)
            boolean r2 = r16.isLoading()
            if (r2 == 0) goto L_0x0125
            io.intercom.android.sdk.tickets.E r2 = new io.intercom.android.sdk.tickets.E
            r2.<init>()
            w.S r3 = w.C2798j.f(r2)
            r7 = 6
            r8 = 0
            r4 = 0
            r5 = 0
            w.M r5 = w.C2798j.e(r3, r4, r5, r7, r8)
            int r2 = w.C2770N.f27201f
            r2 = r2 | 25008(0x61b0, float:3.5044E-41)
            int r3 = w.C2769M.f27197d
            int r3 = r3 << 9
            r8 = r2 | r3
            r17 = 0
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "Progress value animation"
            r2 = r26
            r7 = r0
            r29 = 1
            r30 = r9
            r9 = r17
            Y.A1 r2 = w.C2771O.a(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r9 = r2.floatValue()
            goto L_0x0134
        L_0x0125:
            r30 = r9
            r29 = 1
            boolean r2 = r16.isDone()
            if (r2 == 0) goto L_0x0132
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0134
        L_0x0132:
            r9 = r30
        L_0x0134:
            r0.M()
            r2 = 1767091849(0x6953ae89, float:1.5994223E25)
            r0.T(r2)
            boolean r2 = r16.isLoading()
            if (r2 == 0) goto L_0x01bf
            r2 = 1463860081(0x5740bb71, float:2.11911287E14)
            r0.T(r2)
            r2 = r39 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r3 = 32
            if (r2 <= r3) goto L_0x0157
            boolean r2 = r0.e(r12)
            if (r2 != 0) goto L_0x015b
        L_0x0157:
            r2 = r39 & 48
            if (r2 != r3) goto L_0x015e
        L_0x015b:
            r8 = r29
            goto L_0x015f
        L_0x015e:
            r8 = r14
        L_0x015f:
            boolean r2 = r0.e(r10)
            r2 = r2 | r8
            java.lang.Object r3 = r0.A()
            if (r2 != 0) goto L_0x0172
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x017a
        L_0x0172:
            io.intercom.android.sdk.tickets.F r3 = new io.intercom.android.sdk.tickets.F
            r3.<init>(r12, r10)
            r0.r(r3)
        L_0x017a:
            yf.l r3 = (yf.C6798l) r3
            r0.M()
            w.S r16 = w.C2798j.f(r3)
            r20 = 6
            r21 = 0
            r17 = 0
            r18 = 0
            w.M r7 = w.C2798j.e(r16, r17, r18, r20, r21)
            int r2 = w.C2770N.f27201f
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            int r3 = r39 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = w.C2769M.f27197d
            int r3 = r3 << 9
            r16 = r2 | r3
            r17 = 0
            java.lang.String r8 = "Color value animation"
            r2 = r26
            r3 = r10
            r5 = r35
            r31 = r9
            r9 = r0
            r32 = r10
            r10 = r16
            r11 = r17
            Y.A1 r2 = v.C2717A.a(r2, r3, r5, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r2.getValue()
            r0.x0 r2 = (r0.C2544x0) r2
            long r2 = r2.y()
            goto L_0x01c4
        L_0x01bf:
            r31 = r9
            r32 = r10
            r2 = r12
        L_0x01c4:
            r0.M()
            k0.i$a r17 = k0.i.f23074a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r27
            k0.i r4 = C.Y.b(r16, r17, r18, r19, r20, r21)
            float r5 = (float) r14
            float r21 = c1.h.j(r5)
            r0.i2$a r5 = r0.i2.f25529a
            int r20 = r5.c()
            r5 = 1463876813(0x5740fccd, float:2.12192004E14)
            r0.T(r5)
            r9 = r31
            boolean r5 = r0.c(r9)
            java.lang.Object r6 = r0.A()
            if (r5 != 0) goto L_0x01fc
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0204
        L_0x01fc:
            io.intercom.android.sdk.tickets.G r6 = new io.intercom.android.sdk.tickets.G
            r6.<init>(r9)
            r0.r(r6)
        L_0x0204:
            r5 = r6
            yf.a r5 = (yf.C6787a) r5
            r0.M()
            io.intercom.android.sdk.tickets.H r22 = new io.intercom.android.sdk.tickets.H
            r22.<init>()
            r24 = 1769472(0x1b0000, float:2.479558E-39)
            r25 = 0
            r6 = r14
            r14 = r5
            r5 = r15
            r15 = r4
            r16 = r2
            r18 = r32
            r23 = r0
            V.C1400p0.b(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            r15 = r5
            r14 = r6
            r9 = r30
            r10 = r32
            goto L_0x00d0
        L_0x0228:
            r5 = r15
            r0.M()
            r0.u()
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x0247
            io.intercom.android.sdk.tickets.I r8 = new io.intercom.android.sdk.tickets.I
            r0 = r8
            r1 = r34
            r2 = r35
            r4 = r5
            r5 = r39
            r6 = r40
            r0.<init>(r1, r2, r4, r5, r6)
            r7.a(r8)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.TicketProgressIndicatorKt.m536TicketProgressIndicator3IgeMak(java.util.List, long, k0.i, Y.m, int, int):void");
    }

    @IntercomPreviews
    public static final void TicketProgressIndicatorPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1245553611);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketProgressIndicatorKt.INSTANCE.m530getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new J(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressIndicatorPreview$lambda$9(int i10, C1500m mVar, int i11) {
        TicketProgressIndicatorPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0(C2774S.b bVar) {
        C6496s.h(bVar, "$this$keyframes");
        bVar.d(3200);
        Float valueOf = Float.valueOf(1.0f);
        bVar.e(bVar.f(valueOf, 850), C2762F.e());
        bVar.f(valueOf, 3200);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1(long j10, long j11, C2774S.b bVar) {
        C6496s.h(bVar, "$this$keyframes");
        bVar.d(3200);
        bVar.e(bVar.f(C2544x0.k(j10), 850), C2762F.e());
        bVar.f(C2544x0.k(j10), 1850);
        bVar.e(bVar.f(C2544x0.k(j11), 2200), C2762F.e());
        bVar.f(C2544x0.k(j11), 3200);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final float TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3(float f10) {
        return f10;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5(C2605f fVar) {
        C6496s.h(fVar, "$this$LinearProgressIndicator");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketProgressIndicator_3IgeMak$lambda$8(List list, long j10, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$progressSections");
        m536TicketProgressIndicator3IgeMak(list, j10, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
