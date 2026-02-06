package androidx.compose.ui.platform;

import V0.n;
import V0.p;
import android.os.Parcel;
import android.util.Base64;
import b1.C1869a;
import b1.k;
import b1.o;
import c1.v;
import c1.w;
import c1.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import mf.C6565s;
import q0.C2422h;
import r0.C2544x0;
import r0.e2;

/* renamed from: androidx.compose.ui.platform.l0  reason: case insensitive filesystem */
public final class C1647l0 {

    /* renamed from: a  reason: collision with root package name */
    private final Parcel f13810a;

    public C1647l0(String str) {
        Parcel obtain = Parcel.obtain();
        this.f13810a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int a() {
        return this.f13810a.dataAvail();
    }

    private final float b() {
        return C1869a.c(e());
    }

    private final byte c() {
        return this.f13810a.readByte();
    }

    private final float e() {
        return this.f13810a.readFloat();
    }

    private final int i() {
        return this.f13810a.readInt();
    }

    private final e2 j() {
        return new e2(d(), C2422h.a(e(), e()), e(), (DefaultConstructorMarker) null);
    }

    private final String l() {
        return this.f13810a.readString();
    }

    private final k m() {
        boolean z10;
        int i10 = i();
        k.a aVar = k.f19119b;
        boolean z11 = false;
        if ((aVar.b().e() & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & aVar.d().e()) != 0) {
            z11 = true;
        }
        if (z10 && z11) {
            return aVar.a(C6565s.q(aVar.b(), aVar.d()));
        }
        if (z10) {
            return aVar.b();
        }
        if (z11) {
            return aVar.d();
        }
        return aVar.c();
    }

    private final o n() {
        return new o(e(), e());
    }

    private final long p() {
        return C6508G.b(this.f13810a.readLong());
    }

    public final long d() {
        return C2544x0.l(p());
    }

    public final int f() {
        byte c10 = c();
        if (c10 == 0) {
            return n.f8200b.b();
        }
        if (c10 == 1) {
            return n.f8200b.a();
        }
        return n.f8200b.b();
    }

    public final int g() {
        byte c10 = c();
        if (c10 == 0) {
            return V0.o.f8204b.b();
        }
        if (c10 == 1) {
            return V0.o.f8204b.a();
        }
        if (c10 == 3) {
            return V0.o.f8204b.c();
        }
        if (c10 == 2) {
            return V0.o.f8204b.d();
        }
        return V0.o.f8204b.b();
    }

    public final p h() {
        return new p(i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        r4 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Q0.C k() {
        /*
            r22 = this;
            androidx.compose.ui.platform.I0 r15 = new androidx.compose.ui.platform.I0
            r0 = r15
            r19 = 16383(0x3fff, float:2.2957E-41)
            r20 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r21 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20)
            r0 = r22
        L_0x0024:
            android.os.Parcel r1 = r0.f13810a
            int r1 = r1.dataAvail()
            r2 = 1
            if (r1 <= r2) goto L_0x0045
            byte r1 = r22.c()
            r3 = 8
            if (r1 != r2) goto L_0x0049
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0045
            long r1 = r22.d()
            r4 = r21
            r4.c(r1)
            goto L_0x0024
        L_0x0045:
            r4 = r21
            goto L_0x0116
        L_0x0049:
            r4 = r21
            r5 = 2
            r6 = 5
            if (r1 != r5) goto L_0x005f
            int r1 = r22.a()
            if (r1 < r6) goto L_0x0116
            long r1 = r22.o()
            r4.e(r1)
        L_0x005c:
            r21 = r4
            goto L_0x0024
        L_0x005f:
            r5 = 3
            r7 = 4
            if (r1 != r5) goto L_0x0071
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0116
            V0.p r1 = r22.h()
            r4.h(r1)
            goto L_0x005c
        L_0x0071:
            if (r1 != r7) goto L_0x0085
            int r1 = r22.a()
            if (r1 < r2) goto L_0x0116
            int r1 = r22.f()
            V0.n r1 = V0.n.c(r1)
            r4.f(r1)
            goto L_0x005c
        L_0x0085:
            if (r1 != r6) goto L_0x0099
            int r1 = r22.a()
            if (r1 < r2) goto L_0x0116
            int r1 = r22.g()
            V0.o r1 = V0.o.e(r1)
            r4.g(r1)
            goto L_0x005c
        L_0x0099:
            r2 = 6
            if (r1 != r2) goto L_0x00a4
            java.lang.String r1 = r22.l()
            r4.d(r1)
            goto L_0x005c
        L_0x00a4:
            r2 = 7
            if (r1 != r2) goto L_0x00b5
            int r1 = r22.a()
            if (r1 < r6) goto L_0x0116
            long r1 = r22.o()
            r4.i(r1)
            goto L_0x005c
        L_0x00b5:
            if (r1 != r3) goto L_0x00c9
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0116
            float r1 = r22.b()
            b1.a r1 = b1.C1869a.b(r1)
            r4.b(r1)
            goto L_0x005c
        L_0x00c9:
            r2 = 9
            if (r1 != r2) goto L_0x00db
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0116
            b1.o r1 = r22.n()
            r4.l(r1)
            goto L_0x005c
        L_0x00db:
            r2 = 10
            if (r1 != r2) goto L_0x00ee
            int r1 = r22.a()
            if (r1 < r3) goto L_0x0116
            long r1 = r22.d()
            r4.a(r1)
            goto L_0x005c
        L_0x00ee:
            r2 = 11
            if (r1 != r2) goto L_0x0101
            int r1 = r22.a()
            if (r1 < r7) goto L_0x0116
            b1.k r1 = r22.m()
            r4.k(r1)
            goto L_0x005c
        L_0x0101:
            r2 = 12
            if (r1 != r2) goto L_0x005c
            int r1 = r22.a()
            r2 = 20
            if (r1 < r2) goto L_0x0116
            r0.e2 r1 = r22.j()
            r4.j(r1)
            goto L_0x005c
        L_0x0116:
            Q0.C r1 = r4.m()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1647l0.k():Q0.C");
    }

    public final long o() {
        long j10;
        byte c10 = c();
        if (c10 == 1) {
            j10 = x.f19246b.b();
        } else if (c10 == 2) {
            j10 = x.f19246b.a();
        } else {
            j10 = x.f19246b.c();
        }
        if (x.g(j10, x.f19246b.c())) {
            return v.f19242b.a();
        }
        return w.a(e(), j10);
    }
}
