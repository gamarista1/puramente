package D;

import E.L;
import androidx.compose.foundation.lazy.layout.d;
import mf.C6565s;

/* renamed from: D.a  reason: case insensitive filesystem */
final class C1108a implements v {

    /* renamed from: a  reason: collision with root package name */
    private final int f1204a;

    /* renamed from: b  reason: collision with root package name */
    private int f1205b = -1;

    /* renamed from: c  reason: collision with root package name */
    private d.b f1206c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1207d;

    public C1108a(int i10) {
        this.f1204a = i10;
    }

    public void a(u uVar, p pVar) {
        int i10;
        if (this.f1205b != -1 && !pVar.k().isEmpty()) {
            if (this.f1207d) {
                i10 = ((k) C6565s.z0(pVar.k())).getIndex() + 1;
            } else {
                i10 = ((k) C6565s.o0(pVar.k())).getIndex() - 1;
            }
            if (this.f1205b != i10) {
                this.f1205b = -1;
                d.b bVar = this.f1206c;
                if (bVar != null) {
                    bVar.cancel();
                }
                this.f1206c = null;
            }
        }
    }

    public void b(L l10, int i10) {
        int i11 = this.f1204a;
        for (int i12 = 0; i12 < i11; i12++) {
            l10.a(i10 + i12);
        }
    }

    public void c(u uVar, float f10, p pVar) {
        boolean z10;
        int i10;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        if (!pVar.k().isEmpty()) {
            if (f10 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = ((k) C6565s.z0(pVar.k())).getIndex() + 1;
            } else {
                i10 = ((k) C6565s.o0(pVar.k())).getIndex() - 1;
            }
            if (i10 >= 0 && i10 < pVar.h()) {
                if (i10 != this.f1205b) {
                    if (!(this.f1207d == z10 || (bVar3 = this.f1206c) == null)) {
                        bVar3.cancel();
                    }
                    this.f1207d = z10;
                    this.f1205b = i10;
                    this.f1206c = uVar.a(i10);
                }
                if (z10) {
                    k kVar = (k) C6565s.z0(pVar.k());
                    if (((float) (((kVar.a() + kVar.getSize()) + pVar.i()) - pVar.g())) < (-f10) && (bVar2 = this.f1206c) != null) {
                        bVar2.a();
                    }
                } else if (((float) (pVar.j() - ((k) C6565s.o0(pVar.k())).a())) < f10 && (bVar = this.f1206c) != null) {
                    bVar.a();
                }
            }
        }
    }
}
