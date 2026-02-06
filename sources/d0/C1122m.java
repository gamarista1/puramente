package D0;

import H0.C1197s;
import a0.C1538b;
import androidx.collection.C1607v;
import androidx.collection.I;

/* renamed from: D0.m  reason: case insensitive filesystem */
public class C1122m {

    /* renamed from: b  reason: collision with root package name */
    public static final int f1480b = C1538b.f10554d;

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f1481a = new C1538b(new C1121l[16], 0);

    public boolean a(C1607v vVar, C1197s sVar, C1116g gVar, boolean z10) {
        C1538b bVar = this.f1481a;
        int q10 = bVar.q();
        if (q10 <= 0) {
            return false;
        }
        Object[] p10 = bVar.p();
        int i10 = 0;
        boolean z11 = false;
        do {
            if (((C1121l) p10[i10]).a(vVar, sVar, gVar, z10) || z11) {
                z11 = true;
            } else {
                z11 = false;
            }
            i10++;
        } while (i10 < q10);
        return z11;
    }

    public void b(C1116g gVar) {
        int q10 = this.f1481a.q();
        while (true) {
            q10--;
            if (-1 >= q10) {
                return;
            }
            if (((C1121l) this.f1481a.p()[q10]).l().g()) {
                this.f1481a.y(q10);
            }
        }
    }

    public final void c() {
        this.f1481a.i();
    }

    public void d() {
        C1538b bVar = this.f1481a;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i10 = 0;
            do {
                ((C1121l) p10[i10]).d();
                i10++;
            } while (i10 < q10);
        }
    }

    public boolean e(C1116g gVar) {
        C1538b bVar = this.f1481a;
        int q10 = bVar.q();
        boolean z10 = false;
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i10 = 0;
            boolean z11 = false;
            do {
                if (((C1121l) p10[i10]).e(gVar) || z11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i10++;
            } while (i10 < q10);
            z10 = z11;
        }
        b(gVar);
        return z10;
    }

    public boolean f(C1607v vVar, C1197s sVar, C1116g gVar, boolean z10) {
        C1538b bVar = this.f1481a;
        int q10 = bVar.q();
        if (q10 <= 0) {
            return false;
        }
        Object[] p10 = bVar.p();
        int i10 = 0;
        boolean z11 = false;
        do {
            if (((C1121l) p10[i10]).f(vVar, sVar, gVar, z10) || z11) {
                z11 = true;
            } else {
                z11 = false;
            }
            i10++;
        } while (i10 < q10);
        return z11;
    }

    public final C1538b g() {
        return this.f1481a;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.f1481a.q()) {
            C1121l lVar = (C1121l) this.f1481a.p()[i10];
            if (!lVar.k().S1()) {
                lVar.d();
                this.f1481a.y(i10);
            } else {
                i10++;
                lVar.h();
            }
        }
    }

    public void i(long j10, I i10) {
        C1538b bVar = this.f1481a;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i11 = 0;
            do {
                ((C1121l) p10[i11]).i(j10, i10);
                i11++;
            } while (i11 < q10);
        }
    }
}
