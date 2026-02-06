package j1;

import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import f1.d;
import i1.C2060b;
import i1.C2063e;
import i1.C2064f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class o {

    /* renamed from: g  reason: collision with root package name */
    static int f22666g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList f22667a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    int f22668b;

    /* renamed from: c  reason: collision with root package name */
    boolean f22669c = false;

    /* renamed from: d  reason: collision with root package name */
    int f22670d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f22671e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f22672f = -1;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference f22673a;

        /* renamed from: b  reason: collision with root package name */
        int f22674b;

        /* renamed from: c  reason: collision with root package name */
        int f22675c;

        /* renamed from: d  reason: collision with root package name */
        int f22676d;

        /* renamed from: e  reason: collision with root package name */
        int f22677e;

        /* renamed from: f  reason: collision with root package name */
        int f22678f;

        /* renamed from: g  reason: collision with root package name */
        int f22679g;

        a(C2063e eVar, d dVar, int i10) {
            this.f22673a = new WeakReference(eVar);
            this.f22674b = dVar.y(eVar.f21896Q);
            this.f22675c = dVar.y(eVar.f21898R);
            this.f22676d = dVar.y(eVar.f21900S);
            this.f22677e = dVar.y(eVar.f21902T);
            this.f22678f = dVar.y(eVar.f21904U);
            this.f22679g = i10;
        }
    }

    public o(int i10) {
        int i11 = f22666g;
        f22666g = i11 + 1;
        this.f22668b = i11;
        this.f22670d = i10;
    }

    private String e() {
        int i10 = this.f22670d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        if (i10 == 2) {
            return "Both";
        }
        return "Unknown";
    }

    private int j(d dVar, ArrayList arrayList, int i10) {
        int y10;
        int y11;
        C2064f fVar = (C2064f) ((C2063e) arrayList.get(0)).M();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((C2063e) arrayList.get(i11)).g(dVar, false);
        }
        if (i10 == 0 && fVar.f21978g1 > 0) {
            C2060b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f21979h1 > 0) {
            C2060b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(f.f37529a, "\n   at").replace("]", ""));
        }
        this.f22671e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f22671e.add(new a((C2063e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            y10 = dVar.y(fVar.f21896Q);
            y11 = dVar.y(fVar.f21900S);
            dVar.E();
        } else {
            y10 = dVar.y(fVar.f21898R);
            y11 = dVar.y(fVar.f21902T);
            dVar.E();
        }
        return y11 - y10;
    }

    public boolean a(C2063e eVar) {
        if (this.f22667a.contains(eVar)) {
            return false;
        }
        this.f22667a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f22667a.size();
        if (this.f22672f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f22672f == oVar.f22668b) {
                    g(this.f22670d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f22668b;
    }

    public int d() {
        return this.f22670d;
    }

    public int f(d dVar, int i10) {
        if (this.f22667a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f22667a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator it = this.f22667a.iterator();
        while (it.hasNext()) {
            C2063e eVar = (C2063e) it.next();
            oVar.a(eVar);
            if (i10 == 0) {
                eVar.f21901S0 = oVar.c();
            } else {
                eVar.f21903T0 = oVar.c();
            }
        }
        this.f22672f = oVar.f22668b;
    }

    public void h(boolean z10) {
        this.f22669c = z10;
    }

    public void i(int i10) {
        this.f22670d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f22668b + "] <";
        Iterator it = this.f22667a.iterator();
        while (it.hasNext()) {
            str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((C2063e) it.next()).v();
        }
        return str + " >";
    }
}
