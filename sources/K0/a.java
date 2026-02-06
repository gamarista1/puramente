package K0;

import O0.b;
import O0.j;
import O0.k;
import O0.n;
import O0.q;
import android.support.v4.media.session.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import mf.C6565s;
import q0.C2421g;
import q0.C2422h;
import y1.C2930A;
import yf.C6787a;

public abstract class a {

    /* renamed from: K0.a$a  reason: collision with other inner class name */
    static final class C0091a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0091a f3981a = new C0091a();

        C0091a() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List list) {
        List list2;
        long j10;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = C6565s.n();
        } else {
            list2 = new ArrayList();
            Object obj = list.get(0);
            int p10 = C6565s.p(list);
            int i10 = 0;
            while (i10 < p10) {
                i10++;
                Object obj2 = list.get(i10);
                n nVar = (n) obj2;
                n nVar2 = (n) obj;
                list2.add(C2421g.d(C2422h.a(Math.abs(C2421g.m(nVar2.i().g()) - C2421g.m(nVar.i().g())), Math.abs(C2421g.n(nVar2.i().g()) - C2421g.n(nVar.i().g())))));
                obj = obj2;
            }
        }
        if (list2.size() == 1) {
            j10 = ((C2421g) C6565s.o0(list2)).v();
        } else if (!list2.isEmpty()) {
            Object o02 = C6565s.o0(list2);
            int p11 = C6565s.p(list2);
            if (1 <= p11) {
                int i11 = 1;
                while (true) {
                    o02 = C2421g.d(C2421g.r(((C2421g) o02).v(), ((C2421g) list2.get(i11)).v()));
                    if (i11 == p11) {
                        break;
                    }
                    i11++;
                }
            }
            j10 = ((C2421g) o02).v();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (C2421g.n(j10) < C2421g.m(j10)) {
            return true;
        }
        return false;
    }

    public static final boolean b(n nVar) {
        j n10 = nVar.n();
        q qVar = q.f4613a;
        if (k.a(n10, qVar.a()) == null && k.a(nVar.n(), qVar.z()) == null) {
            return false;
        }
        return true;
    }

    private static final boolean c(b bVar) {
        if (bVar.b() < 0 || bVar.a() < 0) {
            return true;
        }
        return false;
    }

    public static final void d(n nVar, C2930A a10) {
        int i10;
        j n10 = nVar.n();
        q qVar = q.f4613a;
        b bVar = (b) k.a(n10, qVar.a());
        if (bVar != null) {
            a10.v0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (k.a(nVar.n(), qVar.z()) != null) {
            List t10 = nVar.t();
            int size = t10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar2 = (n) t10.get(i11);
                if (nVar2.n().g(q.f4613a.A())) {
                    arrayList.add(nVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean a11 = a(arrayList);
            int i12 = 1;
            if (a11) {
                i10 = 1;
            } else {
                i10 = arrayList.size();
            }
            if (a11) {
                i12 = arrayList.size();
            }
            a10.v0(C2930A.e.b(i10, i12, false, 0));
        }
    }

    public static final void e(n nVar, C2930A a10) {
        int i10;
        int i11;
        j n10 = nVar.n();
        q qVar = q.f4613a;
        c.a(k.a(n10, qVar.b()));
        n r10 = nVar.r();
        if (r10 != null && k.a(r10.n(), qVar.z()) != null) {
            b bVar = (b) k.a(r10.n(), qVar.a());
            if ((bVar == null || !c(bVar)) && nVar.n().g(qVar.A())) {
                ArrayList arrayList = new ArrayList();
                List t10 = r10.t();
                int size = t10.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    n nVar2 = (n) t10.get(i13);
                    if (nVar2.n().g(q.f4613a.A())) {
                        arrayList.add(nVar2);
                        if (nVar2.q().o0() < nVar.q().o0()) {
                            i12++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a11 = a(arrayList);
                    if (a11) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    if (a11) {
                        i11 = i12;
                    } else {
                        i11 = 0;
                    }
                    C2930A.f b10 = C2930A.f.b(i10, 1, i11, 1, false, ((Boolean) nVar.n().t(q.f4613a.A(), C0091a.f3981a)).booleanValue());
                    if (b10 != null) {
                        a10.w0(b10);
                    }
                }
            }
        }
    }

    private static final C2930A.e f(b bVar) {
        return C2930A.e.b(bVar.b(), bVar.a(), false, 0);
    }
}
