package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import c1.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2422h;
import q0.C2427m;
import r0.C2472Y;
import r0.C2490f0;
import r0.C2544x0;
import r0.C2547y0;
import r0.S1;
import r0.T1;
import t0.C2603d;
import t0.C2605f;
import t0.C2609j;
import t0.C2610k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\f\u001a\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk0/i;", "modifier", "Lr0/x0;", "backgroundColor", "Lc1/h;", "strokeWidth", "strokeColor", "Llf/M;", "StarRating-tAjK0ZQ", "(Lk0/i;JFJLY/m;II)V", "StarRating", "SelectedStar", "(LY/m;I)V", "UnSelectedStar", "Lr0/S1;", "getStarPath", "()Lr0/S1;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StarRatingKt {
    public static final void SelectedStar(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-596392123);
        if (i10 != 0 || !h10.i()) {
            float f10 = (float) 44;
            m505StarRatingtAjK0ZQ(q.i(q.r(i.f23074a, h.j(f10)), h.j(f10)), C2544x0.f25560b.j(), 0.0f, 0, h10, 54, 12);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SelectedStar$lambda$4(int i10, C1500m mVar, int i11) {
        SelectedStar(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: io.intercom.android.sdk.survey.ui.questiontype.numericscale.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: io.intercom.android.sdk.survey.ui.questiontype.numericscale.s} */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0106, code lost:
        if (r4 == Y.C1500m.f10026a.a()) goto L_0x0108;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: StarRating-tAjK0ZQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m505StarRatingtAjK0ZQ(k0.i r16, long r17, float r19, long r20, Y.C1500m r22, int r23, int r24) {
        /*
            r7 = r23
            r0 = -1509251218(0xffffffffa60aa76e, float:-4.810528E-16)
            r1 = r22
            Y.m r0 = r1.h(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r16
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 14
            if (r2 != 0) goto L_0x0026
            r2 = r16
            boolean r3 = r0.S(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r16
            r3 = r7
        L_0x0029:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
            r8 = r17
            goto L_0x0044
        L_0x0032:
            r6 = r7 & 112(0x70, float:1.57E-43)
            r8 = r17
            if (r6 != 0) goto L_0x0044
            boolean r6 = r0.e(r8)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r24 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r11 = r19
            goto L_0x0060
        L_0x004f:
            r11 = r7 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x004c
            r11 = r19
            boolean r12 = r0.c(r11)
            if (r12 == 0) goto L_0x005d
            r12 = r10
            goto L_0x005f
        L_0x005d:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r12
        L_0x0060:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            r13 = 2048(0x800, float:2.87E-42)
            if (r12 != 0) goto L_0x0078
            r12 = r24 & 8
            r14 = r20
            if (r12 != 0) goto L_0x0074
            boolean r12 = r0.e(r14)
            if (r12 == 0) goto L_0x0074
            r12 = r13
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r12
            goto L_0x007a
        L_0x0078:
            r14 = r20
        L_0x007a:
            r12 = r3 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r12 != r5) goto L_0x0090
            boolean r5 = r0.i()
            if (r5 != 0) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            r0.I()
            r1 = r2
        L_0x008b:
            r2 = r8
            r4 = r11
            r5 = r14
            goto L_0x0124
        L_0x0090:
            r0.D()
            r5 = r7 & 1
            r12 = 1
            if (r5 == 0) goto L_0x00aa
            boolean r5 = r0.L()
            if (r5 == 0) goto L_0x009f
            goto L_0x00aa
        L_0x009f:
            r0.I()
            r1 = r24 & 8
            if (r1 == 0) goto L_0x00a8
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00a8:
            r1 = r2
            goto L_0x00cc
        L_0x00aa:
            if (r1 == 0) goto L_0x00af
            k0.i$a r1 = k0.i.f23074a
            goto L_0x00b0
        L_0x00af:
            r1 = r2
        L_0x00b0:
            if (r4 == 0) goto L_0x00b9
            r0.x0$a r2 = r0.C2544x0.f25560b
            long r4 = r2.i()
            r8 = r4
        L_0x00b9:
            if (r6 == 0) goto L_0x00c1
            float r2 = (float) r12
            float r2 = c1.h.j(r2)
            r11 = r2
        L_0x00c1:
            r2 = r24 & 8
            if (r2 == 0) goto L_0x00cc
            long r4 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m713getAccessibleBorderColor8_81llA(r8)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r14 = r4
        L_0x00cc:
            r0.v()
            r2 = -1036119505(0xffffffffc23e122f, float:-47.517757)
            r0.T(r2)
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 ^ 3072(0xc00, float:4.305E-42)
            r4 = 0
            if (r2 <= r13) goto L_0x00e2
            boolean r2 = r0.e(r14)
            if (r2 != 0) goto L_0x00e6
        L_0x00e2:
            r2 = r3 & 3072(0xc00, float:4.305E-42)
            if (r2 != r13) goto L_0x00e8
        L_0x00e6:
            r2 = r12
            goto L_0x00e9
        L_0x00e8:
            r2 = r4
        L_0x00e9:
            r5 = r3 & 896(0x380, float:1.256E-42)
            if (r5 != r10) goto L_0x00ef
            r5 = r12
            goto L_0x00f0
        L_0x00ef:
            r5 = r4
        L_0x00f0:
            r2 = r2 | r5
            r5 = r3 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r5 != r6) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r12 = r4
        L_0x00f9:
            r2 = r2 | r12
            java.lang.Object r4 = r0.A()
            if (r2 != 0) goto L_0x0108
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0118
        L_0x0108:
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.s r4 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.s
            r16 = r4
            r17 = r14
            r19 = r11
            r20 = r8
            r16.<init>(r17, r19, r20)
            r0.r(r4)
        L_0x0118:
            yf.l r4 = (yf.C6798l) r4
            r0.M()
            r2 = r3 & 14
            x.C2870i.a(r1, r4, r0, r2)
            goto L_0x008b
        L_0x0124:
            Y.Y0 r9 = r0.k()
            if (r9 == 0) goto L_0x0137
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.t r10 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.t
            r0 = r10
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r4, r5, r7, r8)
            r9.a(r10)
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt.m505StarRatingtAjK0ZQ(k0.i, long, float, long, Y.m, int, int):void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public static final C6514M StarRating_tAjK0ZQ$lambda$2$lambda$1(long j10, float f10, long j11, C2605f fVar) {
        C2605f fVar2 = fVar;
        C6496s.h(fVar2, "$this$Canvas");
        float k10 = C2427m.k(fVar.d()) / 33.0f;
        float i10 = C2427m.i(fVar.d()) / 32.0f;
        S1 starPath = getStarPath();
        long a10 = C2422h.a(0.0f, 0.0f);
        C2603d w12 = fVar.w1();
        long d10 = w12.d();
        w12.f().q();
        try {
            w12.e().e(k10, i10, a10);
            C2605f.U(fVar, starPath, j10, 0.0f, new C2610k(fVar2.t1(f10), 0.0f, 0, 0, (T1) null, 30, (DefaultConstructorMarker) null), (C2547y0) null, 0, 52, (Object) null);
            C2605f.U(fVar, starPath, j11, 0.0f, C2609j.f25944a, C2547y0.f25576b.b(j11, C2490f0.f25500a.z()), 0, 36, (Object) null);
            w12.f().h();
            w12.h(d10);
            return C6514M.f71813a;
        } catch (Throwable th2) {
            w12.f().h();
            w12.h(d10);
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M StarRating_tAjK0ZQ$lambda$3(i iVar, long j10, float f10, long j11, int i10, int i11, C1500m mVar, int i12) {
        m505StarRatingtAjK0ZQ(iVar, j10, f10, j11, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void UnSelectedStar(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(843558828);
        if (i10 != 0 || !h10.i()) {
            float f10 = (float) 44;
            m505StarRatingtAjK0ZQ(q.i(q.r(i.f23074a, h.j(f10)), h.j(f10)), 0, 0.0f, 0, h10, 6, 14);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnSelectedStar$lambda$5(int i10, C1500m mVar, int i11) {
        UnSelectedStar(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final S1 getStarPath() {
        S1 a10 = C2472Y.a();
        a10.p(31.9f, 11.25f);
        a10.q(32.95f, 11.39f, 33.38f, 12.71f, 32.6f, 13.46f);
        a10.t(25.33f, 20.47f);
        a10.t(27.16f, 30.48f);
        a10.q(27.35f, 31.54f, 26.25f, 32.36f, 25.31f, 31.84f);
        a10.t(16.5f, 26.98f);
        a10.t(7.69f, 31.84f);
        a10.q(6.75f, 32.36f, 5.65f, 31.54f, 5.84f, 30.48f);
        a10.t(7.67f, 20.47f);
        a10.t(0.4f, 13.46f);
        a10.q(-0.38f, 12.71f, 0.05f, 11.39f, 1.1f, 11.25f);
        a10.t(11.04f, 9.92f);
        a10.t(15.36f, 0.73f);
        a10.q(15.82f, -0.24f, 17.18f, -0.24f, 17.64f, 0.73f);
        a10.t(21.96f, 9.92f);
        a10.t(31.9f, 11.25f);
        return a10;
    }
}
