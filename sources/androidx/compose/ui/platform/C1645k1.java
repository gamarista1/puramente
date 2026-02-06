package androidx.compose.ui.platform;

import H0.C1201w;
import J0.G;
import O0.a;
import O0.g;
import O0.i;
import O0.j;
import O0.k;
import O0.n;
import O0.p;
import O0.q;
import Q0.L;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.collection.C;
import androidx.collection.C1601o;
import androidx.collection.C1602p;
import androidx.compose.ui.viewinterop.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q0.C2423i;
import yf.C6798l;

/* renamed from: androidx.compose.ui.platform.k1  reason: case insensitive filesystem */
public abstract class C1645k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final C2423i f13809a = new C2423i(0.0f, 0.0f, 10.0f, 10.0f);

    public static final C1636h1 a(List list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C1636h1) list.get(i11)).d() == i10) {
                return (C1636h1) list.get(i11);
            }
        }
        return null;
    }

    public static final C1601o b(p pVar) {
        n a10 = pVar.a();
        C b10 = C1602p.b();
        if (a10.q().e() && a10.q().J0()) {
            C2423i i10 = a10.i();
            c(new Region(Math.round(i10.i()), Math.round(i10.l()), Math.round(i10.j()), Math.round(i10.e())), a10, b10, a10, new Region());
        }
        return b10;
    }

    private static final void c(Region region, n nVar, C c10, n nVar2, Region region2) {
        boolean z10;
        int i10;
        C2423i iVar;
        C1201w p10;
        if (!nVar2.q().e() || !nVar2.q().J0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (region.isEmpty() && nVar2.o() != nVar.o()) {
            return;
        }
        if (!z10 || nVar2.x()) {
            C2423i v10 = nVar2.v();
            int round = Math.round(v10.i());
            int round2 = Math.round(v10.l());
            int round3 = Math.round(v10.j());
            int round4 = Math.round(v10.e());
            region2.set(round, round2, round3, round4);
            if (nVar2.o() == nVar.o()) {
                i10 = -1;
            } else {
                i10 = nVar2.o();
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                c10.t(i10, new C1642j1(nVar2, region2.getBounds()));
                List t10 = nVar2.t();
                for (int size = t10.size() - 1; -1 < size; size--) {
                    c(region, nVar, c10, (n) t10.get(size), region2);
                }
                if (f(nVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            } else if (nVar2.x()) {
                n r10 = nVar2.r();
                if (r10 == null || (p10 = r10.p()) == null || !p10.e()) {
                    iVar = f13809a;
                } else {
                    iVar = r10.i();
                }
                c10.t(i10, new C1642j1(nVar2, new Rect(Math.round(iVar.i()), Math.round(iVar.l()), Math.round(iVar.j()), Math.round(iVar.e()))));
            } else if (i10 == -1) {
                c10.t(i10, new C1642j1(nVar2, region2.getBounds()));
            }
        }
    }

    public static final Float d(j jVar) {
        C6798l lVar;
        ArrayList arrayList = new ArrayList();
        a aVar = (a) k.a(jVar, i.f4556a.h());
        if (aVar == null || (lVar = (C6798l) aVar.a()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final L e(j jVar) {
        C6798l lVar;
        ArrayList arrayList = new ArrayList();
        a aVar = (a) k.a(jVar, i.f4556a.i());
        if (aVar == null || (lVar = (C6798l) aVar.a()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (L) arrayList.get(0);
    }

    public static final boolean f(n nVar) {
        if (!g(nVar) || (!nVar.w().z() && !nVar.w().k())) {
            return false;
        }
        return true;
    }

    public static final boolean g(n nVar) {
        if (nVar.z() || nVar.w().g(q.f4613a.n())) {
            return false;
        }
        return true;
    }

    public static final View h(C1617b0 b0Var, int i10) {
        Object obj;
        Iterator it = b0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((G) ((Map.Entry) obj).getKey()).p0() == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (c) entry.getValue();
        }
        return null;
    }

    public static final String i(int i10) {
        g.a aVar = g.f4539b;
        if (g.k(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (g.k(i10, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (g.k(i10, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (g.k(i10, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (g.k(i10, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
