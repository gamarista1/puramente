package E3;

import E3.C1162l;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class p extends C1162l {

    /* renamed from: X  reason: collision with root package name */
    private ArrayList f1898X = new ArrayList();

    /* renamed from: Y  reason: collision with root package name */
    private boolean f1899Y = true;

    /* renamed from: Z  reason: collision with root package name */
    int f1900Z;

    /* renamed from: f0  reason: collision with root package name */
    boolean f1901f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    private int f1902g0 = 0;

    class a extends C1163m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1162l f1903a;

        a(C1162l lVar) {
            this.f1903a = lVar;
        }

        public void d(C1162l lVar) {
            this.f1903a.W();
            lVar.S(this);
        }
    }

    static class b extends C1163m {

        /* renamed from: a  reason: collision with root package name */
        p f1905a;

        b(p pVar) {
            this.f1905a = pVar;
        }

        public void d(C1162l lVar) {
            p pVar = this.f1905a;
            int i10 = pVar.f1900Z - 1;
            pVar.f1900Z = i10;
            if (i10 == 0) {
                pVar.f1901f0 = false;
                pVar.r();
            }
            lVar.S(this);
        }

        public void e(C1162l lVar) {
            p pVar = this.f1905a;
            if (!pVar.f1901f0) {
                pVar.d0();
                this.f1905a.f1901f0 = true;
            }
        }
    }

    private void k0(C1162l lVar) {
        this.f1898X.add(lVar);
        lVar.f1874r = this;
    }

    private void t0() {
        b bVar = new b(this);
        Iterator it = this.f1898X.iterator();
        while (it.hasNext()) {
            ((C1162l) it.next()).a(bVar);
        }
        this.f1900Z = this.f1898X.size();
    }

    public void Q(View view) {
        super.Q(view);
        int size = this.f1898X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1162l) this.f1898X.get(i10)).Q(view);
        }
    }

    public void U(View view) {
        super.U(view);
        int size = this.f1898X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1162l) this.f1898X.get(i10)).U(view);
        }
    }

    /* access modifiers changed from: protected */
    public void W() {
        if (this.f1898X.isEmpty()) {
            d0();
            r();
            return;
        }
        t0();
        if (!this.f1899Y) {
            for (int i10 = 1; i10 < this.f1898X.size(); i10++) {
                ((C1162l) this.f1898X.get(i10 - 1)).a(new a((C1162l) this.f1898X.get(i10)));
            }
            C1162l lVar = (C1162l) this.f1898X.get(0);
            if (lVar != null) {
                lVar.W();
                return;
            }
            return;
        }
        Iterator it = this.f1898X.iterator();
        while (it.hasNext()) {
            ((C1162l) it.next()).W();
        }
    }

    public void Y(C1162l.e eVar) {
        super.Y(eVar);
        this.f1902g0 |= 8;
        int size = this.f1898X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1162l) this.f1898X.get(i10)).Y(eVar);
        }
    }

    public void a0(C1157g gVar) {
        super.a0(gVar);
        this.f1902g0 |= 4;
        if (this.f1898X != null) {
            for (int i10 = 0; i10 < this.f1898X.size(); i10++) {
                ((C1162l) this.f1898X.get(i10)).a0(gVar);
            }
        }
    }

    public void b0(C1165o oVar) {
        super.b0(oVar);
        this.f1902g0 |= 2;
        int size = this.f1898X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1162l) this.f1898X.get(i10)).b0(oVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String e0(String str) {
        String e02 = super.e0(str);
        for (int i10 = 0; i10 < this.f1898X.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e02);
            sb2.append("\n");
            sb2.append(((C1162l) this.f1898X.get(i10)).e0(str + "  "));
            e02 = sb2.toString();
        }
        return e02;
    }

    /* renamed from: g0 */
    public p a(C1162l.f fVar) {
        return (p) super.a(fVar);
    }

    public void h(s sVar) {
        if (J(sVar.f1910b)) {
            Iterator it = this.f1898X.iterator();
            while (it.hasNext()) {
                C1162l lVar = (C1162l) it.next();
                if (lVar.J(sVar.f1910b)) {
                    lVar.h(sVar);
                    sVar.f1911c.add(lVar);
                }
            }
        }
    }

    /* renamed from: i0 */
    public p c(View view) {
        for (int i10 = 0; i10 < this.f1898X.size(); i10++) {
            ((C1162l) this.f1898X.get(i10)).c(view);
        }
        return (p) super.c(view);
    }

    /* access modifiers changed from: package-private */
    public void j(s sVar) {
        super.j(sVar);
        int size = this.f1898X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C1162l) this.f1898X.get(i10)).j(sVar);
        }
    }

    public p j0(C1162l lVar) {
        k0(lVar);
        long j10 = this.f1859c;
        if (j10 >= 0) {
            lVar.X(j10);
        }
        if ((this.f1902g0 & 1) != 0) {
            lVar.Z(u());
        }
        if ((this.f1902g0 & 2) != 0) {
            z();
            lVar.b0((C1165o) null);
        }
        if ((this.f1902g0 & 4) != 0) {
            lVar.a0(y());
        }
        if ((this.f1902g0 & 8) != 0) {
            lVar.Y(t());
        }
        return this;
    }

    public void k(s sVar) {
        if (J(sVar.f1910b)) {
            Iterator it = this.f1898X.iterator();
            while (it.hasNext()) {
                C1162l lVar = (C1162l) it.next();
                if (lVar.J(sVar.f1910b)) {
                    lVar.k(sVar);
                    sVar.f1911c.add(lVar);
                }
            }
        }
    }

    public C1162l l0(int i10) {
        if (i10 < 0 || i10 >= this.f1898X.size()) {
            return null;
        }
        return (C1162l) this.f1898X.get(i10);
    }

    public int m0() {
        return this.f1898X.size();
    }

    /* renamed from: n0 */
    public p S(C1162l.f fVar) {
        return (p) super.S(fVar);
    }

    /* renamed from: o */
    public C1162l clone() {
        p pVar = (p) super.clone();
        pVar.f1898X = new ArrayList();
        int size = this.f1898X.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.k0(((C1162l) this.f1898X.get(i10)).clone());
        }
        return pVar;
    }

    /* renamed from: o0 */
    public p T(View view) {
        for (int i10 = 0; i10 < this.f1898X.size(); i10++) {
            ((C1162l) this.f1898X.get(i10)).T(view);
        }
        return (p) super.T(view);
    }

    /* renamed from: p0 */
    public p X(long j10) {
        ArrayList arrayList;
        super.X(j10);
        if (this.f1859c >= 0 && (arrayList = this.f1898X) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C1162l) this.f1898X.get(i10)).X(j10);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long B10 = B();
        int size = this.f1898X.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1162l lVar = (C1162l) this.f1898X.get(i10);
            if (B10 > 0 && (this.f1899Y || i10 == 0)) {
                long B11 = lVar.B();
                if (B11 > 0) {
                    lVar.c0(B11 + B10);
                } else {
                    lVar.c0(B10);
                }
            }
            lVar.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: q0 */
    public p Z(TimeInterpolator timeInterpolator) {
        this.f1902g0 |= 1;
        ArrayList arrayList = this.f1898X;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C1162l) this.f1898X.get(i10)).Z(timeInterpolator);
            }
        }
        return (p) super.Z(timeInterpolator);
    }

    public p r0(int i10) {
        if (i10 == 0) {
            this.f1899Y = true;
        } else if (i10 == 1) {
            this.f1899Y = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    /* renamed from: s0 */
    public p c0(long j10) {
        return (p) super.c0(j10);
    }
}
