package E3;

import E3.C1162l;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.W;
import java.util.ArrayList;
import java.util.List;

/* renamed from: E3.e  reason: case insensitive filesystem */
public class C1155e extends W {

    /* renamed from: E3.e$a */
    class a extends C1162l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f1831a;

        a(Rect rect) {
            this.f1831a = rect;
        }
    }

    /* renamed from: E3.e$c */
    class c extends C1163m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f1836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1838c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f1839d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f1840e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f1841f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1836a = obj;
            this.f1837b = arrayList;
            this.f1838c = obj2;
            this.f1839d = arrayList2;
            this.f1840e = obj3;
            this.f1841f = arrayList3;
        }

        public void d(C1162l lVar) {
            lVar.S(this);
        }

        public void e(C1162l lVar) {
            Object obj = this.f1836a;
            if (obj != null) {
                C1155e.this.D(obj, this.f1837b, (ArrayList) null);
            }
            Object obj2 = this.f1838c;
            if (obj2 != null) {
                C1155e.this.D(obj2, this.f1839d, (ArrayList) null);
            }
            Object obj3 = this.f1840e;
            if (obj3 != null) {
                C1155e.this.D(obj3, this.f1841f, (ArrayList) null);
            }
        }
    }

    /* renamed from: E3.e$d */
    class d extends C1162l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f1843a;

        d(Rect rect) {
            this.f1843a = rect;
        }
    }

    private static boolean C(C1162l lVar) {
        if (!W.l(lVar.C()) || !W.l(lVar.D()) || !W.l(lVar.E())) {
            return true;
        }
        return false;
    }

    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.F().clear();
            pVar.F().addAll(arrayList2);
            D(pVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.j0((C1162l) obj);
        return pVar;
    }

    public void D(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        C1162l lVar = (C1162l) obj;
        int i11 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int m02 = pVar.m0();
            while (i11 < m02) {
                D(pVar.l0(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!C(lVar)) {
            List F10 = lVar.F();
            if (F10.size() == arrayList.size() && F10.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i10 = 0;
                } else {
                    i10 = arrayList2.size();
                }
                while (i11 < i10) {
                    lVar.c((View) arrayList2.get(i11));
                    i11++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    lVar.T((View) arrayList.get(size));
                }
            }
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((C1162l) obj).c(view);
        }
    }

    public void b(Object obj, ArrayList arrayList) {
        C1162l lVar = (C1162l) obj;
        if (lVar != null) {
            int i10 = 0;
            if (lVar instanceof p) {
                p pVar = (p) lVar;
                int m02 = pVar.m0();
                while (i10 < m02) {
                    b(pVar.l0(i10), arrayList);
                    i10++;
                }
            } else if (!C(lVar) && W.l(lVar.F())) {
                int size = arrayList.size();
                while (i10 < size) {
                    lVar.c((View) arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void e(ViewGroup viewGroup, Object obj) {
        C1164n.a(viewGroup, (C1162l) obj);
    }

    public boolean g(Object obj) {
        return obj instanceof C1162l;
    }

    public Object h(Object obj) {
        if (obj != null) {
            return ((C1162l) obj).clone();
        }
        return null;
    }

    public Object o(Object obj, Object obj2, Object obj3) {
        C1162l lVar = (C1162l) obj;
        C1162l lVar2 = (C1162l) obj2;
        C1162l lVar3 = (C1162l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new p().j0(lVar).j0(lVar2).r0(1);
        } else if (lVar == null) {
            if (lVar2 != null) {
                lVar = lVar2;
            } else {
                lVar = null;
            }
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar = new p();
        if (lVar != null) {
            pVar.j0(lVar);
        }
        pVar.j0(lVar3);
        return pVar;
    }

    public Object p(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.j0((C1162l) obj);
        }
        if (obj2 != null) {
            pVar.j0((C1162l) obj2);
        }
        if (obj3 != null) {
            pVar.j0((C1162l) obj3);
        }
        return pVar;
    }

    public void r(Object obj, View view, ArrayList arrayList) {
        ((C1162l) obj).a(new b(view, arrayList));
    }

    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((C1162l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((C1162l) obj).Y(new d(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((C1162l) obj).Y(new a(rect));
        }
    }

    public void z(Object obj, View view, ArrayList arrayList) {
        p pVar = (p) obj;
        List F10 = pVar.F();
        F10.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            W.f(F10, (View) arrayList.get(i10));
        }
        F10.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    /* renamed from: E3.e$b */
    class b implements C1162l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1834b;

        b(View view, ArrayList arrayList) {
            this.f1833a = view;
            this.f1834b = arrayList;
        }

        public void d(C1162l lVar) {
            lVar.S(this);
            this.f1833a.setVisibility(8);
            int size = this.f1834b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f1834b.get(i10)).setVisibility(0);
            }
        }

        public void a(C1162l lVar) {
        }

        public void b(C1162l lVar) {
        }

        public void c(C1162l lVar) {
        }

        public void e(C1162l lVar) {
        }
    }
}
