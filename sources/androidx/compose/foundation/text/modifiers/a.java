package androidx.compose.foundation.text.modifiers;

import H0.C1193n;
import H0.C1194o;
import H0.C1197s;
import H0.E;
import H0.G;
import H0.H;
import J0.B;
import J0.C1247m;
import J0.C1253t;
import J0.r;
import O.g;
import Q0.C1321d;
import Q0.T;
import V0.h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;
import t0.C2602c;
import yf.C6798l;

public final class a extends C1247m implements B, r, C1253t {

    /* renamed from: p  reason: collision with root package name */
    private g f13181p;

    /* renamed from: q  reason: collision with root package name */
    private C6798l f13182q;

    /* renamed from: r  reason: collision with root package name */
    private final b f13183r;

    public /* synthetic */ a(C1321d dVar, T t10, h.b bVar, C6798l lVar, int i10, boolean z10, int i11, int i12, List list, C6798l lVar2, g gVar, C2443E0 e02, C6798l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, t10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, e02, lVar3);
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        return this.f13183r.y2(oVar, nVar, i10);
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        return this.f13183r.B2(oVar, nVar, i10);
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        return this.f13183r.z2(oVar, nVar, i10);
    }

    public G o(H h10, E e10, long j10) {
        return this.f13183r.A2(h10, e10, j10);
    }

    public final void r2(C1321d dVar, T t10, List list, int i10, int i11, boolean z10, h.b bVar, int i12, C6798l lVar, C6798l lVar2, g gVar, C2443E0 e02) {
        b bVar2 = this.f13183r;
        C1321d dVar2 = dVar;
        bVar2.s2(bVar2.F2(e02, t10), this.f13183r.H2(dVar), this.f13183r.G2(t10, list, i10, i11, z10, bVar, i12), this.f13183r.E2(lVar, lVar2, gVar, this.f13182q));
        J0.E.b(this);
    }

    public void u(C2602c cVar) {
        this.f13183r.t2(cVar);
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        return this.f13183r.C2(oVar, nVar, i10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(Q0.C1321d r19, Q0.T r20, V0.h.b r21, yf.C6798l r22, int r23, boolean r24, int r25, int r26, java.util.List r27, yf.C6798l r28, O.g r29, r0.C2443E0 r30, yf.C6798l r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r18 = this;
            r0 = r32
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r22
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0017
            b1.t$a r1 = b1.t.f19154a
            int r1 = r1.a()
            r8 = r1
            goto L_0x0019
        L_0x0017:
            r8 = r23
        L_0x0019:
            r1 = r0 & 32
            r3 = 1
            if (r1 == 0) goto L_0x0020
            r9 = r3
            goto L_0x0022
        L_0x0020:
            r9 = r24
        L_0x0022:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L_0x002d
        L_0x002b:
            r10 = r25
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0033
            r11 = r3
            goto L_0x0035
        L_0x0033:
            r11 = r26
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003b
            r12 = r2
            goto L_0x003d
        L_0x003b:
            r12 = r27
        L_0x003d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
            r13 = r2
            goto L_0x0045
        L_0x0043:
            r13 = r28
        L_0x0045:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004b
            r14 = r2
            goto L_0x004d
        L_0x004b:
            r14 = r29
        L_0x004d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0053
            r15 = r2
            goto L_0x0055
        L_0x0053:
            r15 = r30
        L_0x0055:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x005c
            r16 = r2
            goto L_0x005e
        L_0x005c:
            r16 = r31
        L_0x005e:
            r17 = 0
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.a.<init>(Q0.d, Q0.T, V0.h$b, yf.l, int, boolean, int, int, java.util.List, yf.l, O.g, r0.E0, yf.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private a(C1321d dVar, T t10, h.b bVar, C6798l lVar, int i10, boolean z10, int i11, int i12, List list, C6798l lVar2, g gVar, C2443E0 e02, C6798l lVar3) {
        this.f13182q = lVar3;
        b bVar2 = r1;
        b bVar3 = new b(dVar, t10, bVar, lVar, i10, z10, i11, i12, list, lVar2, this.f13181p, e02, this.f13182q, (DefaultConstructorMarker) null);
        this.f13183r = (b) l2(bVar2);
        throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
    }

    public void p(C1197s sVar) {
    }
}
