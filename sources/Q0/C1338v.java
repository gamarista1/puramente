package Q0;

import b1.C1873e;
import b1.C1874f;
import b1.C1876h;
import b1.j;
import b1.l;
import b1.q;
import b1.s;
import c1.v;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q0.v  reason: case insensitive filesystem */
public final class C1338v {

    /* renamed from: a  reason: collision with root package name */
    private final int f5383a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5384b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5385c;

    /* renamed from: d  reason: collision with root package name */
    private final q f5386d;

    /* renamed from: e  reason: collision with root package name */
    private final y f5387e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876h f5388f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5389g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5390h;

    /* renamed from: i  reason: collision with root package name */
    private final s f5391i;

    public /* synthetic */ C1338v(int i10, int i11, long j10, q qVar, y yVar, C1876h hVar, int i12, int i13, s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, qVar, yVar, hVar, i12, i13, sVar);
    }

    public static /* synthetic */ C1338v b(C1338v vVar, int i10, int i11, long j10, q qVar, y yVar, C1876h hVar, int i12, int i13, s sVar, int i14, Object obj) {
        int i15;
        int i16;
        long j11;
        q qVar2;
        y yVar2;
        C1876h hVar2;
        int i17;
        int i18;
        s sVar2;
        C1338v vVar2 = vVar;
        int i19 = i14;
        if ((i19 & 1) != 0) {
            i15 = vVar2.f5383a;
        } else {
            i15 = i10;
        }
        if ((i19 & 2) != 0) {
            i16 = vVar2.f5384b;
        } else {
            i16 = i11;
        }
        if ((i19 & 4) != 0) {
            j11 = vVar2.f5385c;
        } else {
            j11 = j10;
        }
        if ((i19 & 8) != 0) {
            qVar2 = vVar2.f5386d;
        } else {
            qVar2 = qVar;
        }
        if ((i19 & 16) != 0) {
            yVar2 = vVar2.f5387e;
        } else {
            yVar2 = yVar;
        }
        if ((i19 & 32) != 0) {
            hVar2 = vVar2.f5388f;
        } else {
            hVar2 = hVar;
        }
        if ((i19 & 64) != 0) {
            i17 = vVar2.f5389g;
        } else {
            i17 = i12;
        }
        if ((i19 & 128) != 0) {
            i18 = vVar2.f5390h;
        } else {
            i18 = i13;
        }
        if ((i19 & 256) != 0) {
            sVar2 = vVar2.f5391i;
        } else {
            sVar2 = sVar;
        }
        return vVar.a(i15, i16, j11, qVar2, yVar2, hVar2, i17, i18, sVar2);
    }

    public final C1338v a(int i10, int i11, long j10, q qVar, y yVar, C1876h hVar, int i12, int i13, s sVar) {
        return new C1338v(i10, i11, j10, qVar, yVar, hVar, i12, i13, sVar, (DefaultConstructorMarker) null);
    }

    public final int c() {
        return this.f5390h;
    }

    public final int d() {
        return this.f5389g;
    }

    public final long e() {
        return this.f5385c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1338v)) {
            return false;
        }
        C1338v vVar = (C1338v) obj;
        if (j.k(this.f5383a, vVar.f5383a) && l.j(this.f5384b, vVar.f5384b) && v.e(this.f5385c, vVar.f5385c) && C6496s.c(this.f5386d, vVar.f5386d) && C6496s.c(this.f5387e, vVar.f5387e) && C6496s.c(this.f5388f, vVar.f5388f) && C1874f.f(this.f5389g, vVar.f5389g) && C1873e.g(this.f5390h, vVar.f5390h) && C6496s.c(this.f5391i, vVar.f5391i)) {
            return true;
        }
        return false;
    }

    public final C1876h f() {
        return this.f5388f;
    }

    public final y g() {
        return this.f5387e;
    }

    public final int h() {
        return this.f5383a;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int l10 = ((((j.l(this.f5383a) * 31) + l.k(this.f5384b)) * 31) + v.i(this.f5385c)) * 31;
        q qVar = this.f5386d;
        int i13 = 0;
        if (qVar != null) {
            i10 = qVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (l10 + i10) * 31;
        y yVar = this.f5387e;
        if (yVar != null) {
            i11 = yVar.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        C1876h hVar = this.f5388f;
        if (hVar != null) {
            i12 = hVar.hashCode();
        } else {
            i12 = 0;
        }
        int j10 = (((((i15 + i12) * 31) + C1874f.j(this.f5389g)) * 31) + C1873e.h(this.f5390h)) * 31;
        s sVar = this.f5391i;
        if (sVar != null) {
            i13 = sVar.hashCode();
        }
        return j10 + i13;
    }

    public final int i() {
        return this.f5384b;
    }

    public final q j() {
        return this.f5386d;
    }

    public final s k() {
        return this.f5391i;
    }

    public final C1338v l(C1338v vVar) {
        if (vVar == null) {
            return this;
        }
        return C1339w.a(this, vVar.f5383a, vVar.f5384b, vVar.f5385c, vVar.f5386d, vVar.f5387e, vVar.f5388f, vVar.f5389g, vVar.f5390h, vVar.f5391i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + j.m(this.f5383a) + ", textDirection=" + l.l(this.f5384b) + ", lineHeight=" + v.j(this.f5385c) + ", textIndent=" + this.f5386d + ", platformStyle=" + this.f5387e + ", lineHeightStyle=" + this.f5388f + ", lineBreak=" + C1874f.k(this.f5389g) + ", hyphens=" + C1873e.i(this.f5390h) + ", textMotion=" + this.f5391i + ')';
    }

    private C1338v(int i10, int i11, long j10, q qVar, y yVar, C1876h hVar, int i12, int i13, s sVar) {
        this.f5383a = i10;
        this.f5384b = i11;
        this.f5385c = j10;
        this.f5386d = qVar;
        this.f5387e = yVar;
        this.f5388f = hVar;
        this.f5389g = i12;
        this.f5390h = i13;
        this.f5391i = sVar;
        if (!v.e(j10, v.f19242b.a()) && v.h(j10) < 0.0f) {
            throw new IllegalStateException(("lineHeight can't be negative (" + v.h(j10) + ')').toString());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1338v(int r12, int r13, long r14, b1.q r16, Q0.y r17, b1.C1876h r18, int r19, int r20, b1.s r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            b1.j$a r1 = b1.j.f19110b
            int r1 = r1.g()
            goto L_0x000e
        L_0x000d:
            r1 = r12
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0019
            b1.l$a r2 = b1.l.f19124b
            int r2 = r2.f()
            goto L_0x001a
        L_0x0019:
            r2 = r13
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            c1.v$a r3 = c1.v.f19242b
            long r3 = r3.a()
            goto L_0x0026
        L_0x0025:
            r3 = r14
        L_0x0026:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x002d
            r5 = r6
            goto L_0x002f
        L_0x002d:
            r5 = r16
        L_0x002f:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0035
            r7 = r6
            goto L_0x0037
        L_0x0035:
            r7 = r17
        L_0x0037:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003d
            r8 = r6
            goto L_0x003f
        L_0x003d:
            r8 = r18
        L_0x003f:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x004a
            b1.f$a r9 = b1.C1874f.f19072b
            int r9 = r9.b()
            goto L_0x004c
        L_0x004a:
            r9 = r19
        L_0x004c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0057
            b1.e$a r10 = b1.C1873e.f19067b
            int r10 = r10.c()
            goto L_0x0059
        L_0x0057:
            r10 = r20
        L_0x0059:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r6 = r21
        L_0x0060:
            r0 = 0
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r6
            r23 = r0
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C1338v.<init>(int, int, long, b1.q, Q0.y, b1.h, int, int, b1.s, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
