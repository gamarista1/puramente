package E3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.C1587a;
import androidx.collection.C1607v;
import androidx.collection.Y;
import androidx.core.view.C1680b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: E3.l  reason: case insensitive filesystem */
public abstract class C1162l implements Cloneable {

    /* renamed from: G  reason: collision with root package name */
    private static final int[] f1848G = {2, 1, 3, 4};

    /* renamed from: H  reason: collision with root package name */
    private static final C1157g f1849H = new a();

    /* renamed from: I  reason: collision with root package name */
    private static ThreadLocal f1850I = new ThreadLocal();

    /* renamed from: A  reason: collision with root package name */
    private boolean f1851A = false;

    /* renamed from: B  reason: collision with root package name */
    private ArrayList f1852B = null;

    /* renamed from: C  reason: collision with root package name */
    private ArrayList f1853C = new ArrayList();

    /* renamed from: D  reason: collision with root package name */
    private e f1854D;

    /* renamed from: E  reason: collision with root package name */
    private C1587a f1855E;

    /* renamed from: F  reason: collision with root package name */
    private C1157g f1856F = f1849H;

    /* renamed from: a  reason: collision with root package name */
    private String f1857a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    private long f1858b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f1859c = -1;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f1860d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f1861e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    ArrayList f1862f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f1863g = null;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f1864h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f1865i = null;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f1866j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f1867k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList f1868l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f1869m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList f1870n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList f1871o = null;

    /* renamed from: p  reason: collision with root package name */
    private t f1872p = new t();

    /* renamed from: q  reason: collision with root package name */
    private t f1873q = new t();

    /* renamed from: r  reason: collision with root package name */
    p f1874r = null;

    /* renamed from: s  reason: collision with root package name */
    private int[] f1875s = f1848G;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList f1876t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList f1877u;

    /* renamed from: v  reason: collision with root package name */
    private ViewGroup f1878v = null;

    /* renamed from: w  reason: collision with root package name */
    boolean f1879w = false;

    /* renamed from: x  reason: collision with root package name */
    ArrayList f1880x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private int f1881y = 0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1882z = false;

    /* renamed from: E3.l$a */
    static class a extends C1157g {
        a() {
        }

        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* renamed from: E3.l$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1587a f1883a;

        b(C1587a aVar) {
            this.f1883a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1883a.remove(animator);
            C1162l.this.f1880x.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C1162l.this.f1880x.add(animator);
        }
    }

    /* renamed from: E3.l$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            C1162l.this.r();
            animator.removeListener(this);
        }
    }

    /* renamed from: E3.l$d */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f1886a;

        /* renamed from: b  reason: collision with root package name */
        String f1887b;

        /* renamed from: c  reason: collision with root package name */
        s f1888c;

        /* renamed from: d  reason: collision with root package name */
        O f1889d;

        /* renamed from: e  reason: collision with root package name */
        C1162l f1890e;

        d(View view, String str, C1162l lVar, O o10, s sVar) {
            this.f1886a = view;
            this.f1887b = str;
            this.f1888c = sVar;
            this.f1889d = o10;
            this.f1890e = lVar;
        }
    }

    /* renamed from: E3.l$e */
    public static abstract class e {
    }

    /* renamed from: E3.l$f */
    public interface f {
        void a(C1162l lVar);

        void b(C1162l lVar);

        void c(C1162l lVar);

        void d(C1162l lVar);

        void e(C1162l lVar);
    }

    private static C1587a A() {
        C1587a aVar = (C1587a) f1850I.get();
        if (aVar != null) {
            return aVar;
        }
        C1587a aVar2 = new C1587a();
        f1850I.set(aVar2);
        return aVar2;
    }

    private static boolean K(s sVar, s sVar2, String str) {
        Object obj = sVar.f1909a.get(str);
        Object obj2 = sVar2.f1909a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void L(C1587a aVar, C1587a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && J(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && J(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f1876t.add(sVar);
                    this.f1877u.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void M(C1587a aVar, C1587a aVar2) {
        s sVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.i(size);
            if (view != null && J(view) && (sVar = (s) aVar2.remove(view)) != null && J(sVar.f1910b)) {
                this.f1876t.add((s) aVar.k(size));
                this.f1877u.add(sVar);
            }
        }
    }

    private void N(C1587a aVar, C1587a aVar2, C1607v vVar, C1607v vVar2) {
        View view;
        int m10 = vVar.m();
        for (int i10 = 0; i10 < m10; i10++) {
            View view2 = (View) vVar.o(i10);
            if (view2 != null && J(view2) && (view = (View) vVar2.e(vVar.i(i10))) != null && J(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f1876t.add(sVar);
                    this.f1877u.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void O(C1587a aVar, C1587a aVar2, C1587a aVar3, C1587a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) aVar3.n(i10);
            if (view2 != null && J(view2) && (view = (View) aVar4.get(aVar3.i(i10))) != null && J(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f1876t.add(sVar);
                    this.f1877u.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void P(t tVar, t tVar2) {
        C1587a aVar = new C1587a((Y) tVar.f1912a);
        C1587a aVar2 = new C1587a((Y) tVar2.f1912a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1875s;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    M(aVar, aVar2);
                } else if (i11 == 2) {
                    O(aVar, aVar2, tVar.f1915d, tVar2.f1915d);
                } else if (i11 == 3) {
                    L(aVar, aVar2, tVar.f1913b, tVar2.f1913b);
                } else if (i11 == 4) {
                    N(aVar, aVar2, tVar.f1914c, tVar2.f1914c);
                }
                i10++;
            } else {
                d(aVar, aVar2);
                return;
            }
        }
    }

    private void V(Animator animator, C1587a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            g(animator);
        }
    }

    private void d(C1587a aVar, C1587a aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s sVar = (s) aVar.n(i10);
            if (J(sVar.f1910b)) {
                this.f1876t.add(sVar);
                this.f1877u.add((Object) null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s sVar2 = (s) aVar2.n(i11);
            if (J(sVar2.f1910b)) {
                this.f1877u.add(sVar2);
                this.f1876t.add((Object) null);
            }
        }
    }

    private static void e(t tVar, View view, s sVar) {
        tVar.f1912a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f1913b.indexOfKey(id2) >= 0) {
                tVar.f1913b.put(id2, (Object) null);
            } else {
                tVar.f1913b.put(id2, view);
            }
        }
        String J10 = C1680b0.J(view);
        if (J10 != null) {
            if (tVar.f1915d.containsKey(J10)) {
                tVar.f1915d.put(J10, (Object) null);
            } else {
                tVar.f1915d.put(J10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f1914c.g(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f1914c.e(itemIdAtPosition);
                    if (view2 != null) {
                        C1680b0.x0(view2, false);
                        tVar.f1914c.j(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                C1680b0.x0(view, true);
                tVar.f1914c.j(itemIdAtPosition, view);
            }
        }
    }

    private void i(View view, boolean z10) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList arrayList = this.f1865i;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList arrayList2 = this.f1866j;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList arrayList3 = this.f1867k;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            if (!((Class) this.f1867k.get(i10)).isInstance(view)) {
                                i10++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s(view);
                        if (z10) {
                            k(sVar);
                        } else {
                            h(sVar);
                        }
                        sVar.f1911c.add(this);
                        j(sVar);
                        if (z10) {
                            e(this.f1872p, view, sVar);
                        } else {
                            e(this.f1873q, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList arrayList4 = this.f1869m;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList arrayList5 = this.f1870n;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList arrayList6 = this.f1871o;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        if (!((Class) this.f1871o.get(i11)).isInstance(view)) {
                                            i11++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                    i(viewGroup.getChildAt(i12), z10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public long B() {
        return this.f1858b;
    }

    public List C() {
        return this.f1861e;
    }

    public List D() {
        return this.f1863g;
    }

    public List E() {
        return this.f1864h;
    }

    public List F() {
        return this.f1862f;
    }

    public String[] G() {
        return null;
    }

    public s H(View view, boolean z10) {
        t tVar;
        p pVar = this.f1874r;
        if (pVar != null) {
            return pVar.H(view, z10);
        }
        if (z10) {
            tVar = this.f1872p;
        } else {
            tVar = this.f1873q;
        }
        return (s) tVar.f1912a.get(view);
    }

    public boolean I(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] G10 = G();
        if (G10 != null) {
            int length = G10.length;
            int i10 = 0;
            while (i10 < length) {
                if (!K(sVar, sVar2, G10[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String K10 : sVar.f1909a.keySet()) {
            if (K(sVar, sVar2, K10)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean J(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f1865i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f1866j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f1867k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f1867k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f1868l != null && C1680b0.J(view) != null && this.f1868l.contains(C1680b0.J(view))) {
            return false;
        }
        if ((this.f1861e.size() == 0 && this.f1862f.size() == 0 && (((arrayList = this.f1864h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1863g) == null || arrayList2.isEmpty()))) || this.f1861e.contains(Integer.valueOf(id2)) || this.f1862f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f1863g;
        if (arrayList6 != null && arrayList6.contains(C1680b0.J(view))) {
            return true;
        }
        if (this.f1864h != null) {
            for (int i11 = 0; i11 < this.f1864h.size(); i11++) {
                if (((Class) this.f1864h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void Q(View view) {
        if (!this.f1851A) {
            C1587a A10 = A();
            int size = A10.size();
            O d10 = A.d(view);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = (d) A10.n(i10);
                if (dVar.f1886a != null && d10.equals(dVar.f1889d)) {
                    C1151a.b((Animator) A10.i(i10));
                }
            }
            ArrayList arrayList = this.f1852B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1852B.clone();
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((f) arrayList2.get(i11)).c(this);
                }
            }
            this.f1882z = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: E3.s} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void R(android.view.ViewGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1876t = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1877u = r0
            E3.t r0 = r10.f1872p
            E3.t r1 = r10.f1873q
            r10.P(r0, r1)
            androidx.collection.a r0 = A()
            int r1 = r0.size()
            E3.O r2 = E3.A.d(r11)
            r3 = 1
            int r1 = r1 - r3
        L_0x0023:
            if (r1 < 0) goto L_0x007f
            java.lang.Object r4 = r0.i(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x007c
            java.lang.Object r5 = r0.get(r4)
            E3.l$d r5 = (E3.C1162l.d) r5
            if (r5 == 0) goto L_0x007c
            android.view.View r6 = r5.f1886a
            if (r6 == 0) goto L_0x007c
            E3.O r6 = r5.f1889d
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x007c
            E3.s r6 = r5.f1888c
            android.view.View r7 = r5.f1886a
            E3.s r8 = r10.H(r7, r3)
            E3.s r9 = r10.w(r7, r3)
            if (r8 != 0) goto L_0x005c
            if (r9 != 0) goto L_0x005c
            E3.t r9 = r10.f1873q
            androidx.collection.a r9 = r9.f1912a
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            E3.s r9 = (E3.s) r9
        L_0x005c:
            if (r8 != 0) goto L_0x0060
            if (r9 == 0) goto L_0x007c
        L_0x0060:
            E3.l r5 = r5.f1890e
            boolean r5 = r5.I(r6, r9)
            if (r5 == 0) goto L_0x007c
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x0079
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            r0.remove(r4)
            goto L_0x007c
        L_0x0079:
            r4.cancel()
        L_0x007c:
            int r1 = r1 + -1
            goto L_0x0023
        L_0x007f:
            E3.t r6 = r10.f1872p
            E3.t r7 = r10.f1873q
            java.util.ArrayList r8 = r10.f1876t
            java.util.ArrayList r9 = r10.f1877u
            r4 = r10
            r5 = r11
            r4.q(r5, r6, r7, r8, r9)
            r10.W()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C1162l.R(android.view.ViewGroup):void");
    }

    public C1162l S(f fVar) {
        ArrayList arrayList = this.f1852B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f1852B.size() == 0) {
            this.f1852B = null;
        }
        return this;
    }

    public C1162l T(View view) {
        this.f1862f.remove(view);
        return this;
    }

    public void U(View view) {
        if (this.f1882z) {
            if (!this.f1851A) {
                C1587a A10 = A();
                int size = A10.size();
                O d10 = A.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d dVar = (d) A10.n(i10);
                    if (dVar.f1886a != null && d10.equals(dVar.f1889d)) {
                        C1151a.c((Animator) A10.i(i10));
                    }
                }
                ArrayList arrayList = this.f1852B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1852B.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).b(this);
                    }
                }
            }
            this.f1882z = false;
        }
    }

    /* access modifiers changed from: protected */
    public void W() {
        d0();
        C1587a A10 = A();
        Iterator it = this.f1853C.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (A10.containsKey(animator)) {
                d0();
                V(animator, A10);
            }
        }
        this.f1853C.clear();
        r();
    }

    public C1162l X(long j10) {
        this.f1859c = j10;
        return this;
    }

    public void Y(e eVar) {
        this.f1854D = eVar;
    }

    public C1162l Z(TimeInterpolator timeInterpolator) {
        this.f1860d = timeInterpolator;
        return this;
    }

    public C1162l a(f fVar) {
        if (this.f1852B == null) {
            this.f1852B = new ArrayList();
        }
        this.f1852B.add(fVar);
        return this;
    }

    public void a0(C1157g gVar) {
        if (gVar == null) {
            this.f1856F = f1849H;
        } else {
            this.f1856F = gVar;
        }
    }

    public C1162l c(View view) {
        this.f1862f.add(view);
        return this;
    }

    public C1162l c0(long j10) {
        this.f1858b = j10;
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f1880x.size() - 1; size >= 0; size--) {
            ((Animator) this.f1880x.get(size)).cancel();
        }
        ArrayList arrayList = this.f1852B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f1852B.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void d0() {
        if (this.f1881y == 0) {
            ArrayList arrayList = this.f1852B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1852B.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).e(this);
                }
            }
            this.f1851A = false;
        }
        this.f1881y++;
    }

    /* access modifiers changed from: package-private */
    public String e0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1859c != -1) {
            str2 = str2 + "dur(" + this.f1859c + ") ";
        }
        if (this.f1858b != -1) {
            str2 = str2 + "dly(" + this.f1858b + ") ";
        }
        if (this.f1860d != null) {
            str2 = str2 + "interp(" + this.f1860d + ") ";
        }
        if (this.f1861e.size() <= 0 && this.f1862f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f1861e.size() > 0) {
            for (int i10 = 0; i10 < this.f1861e.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1861e.get(i10);
            }
        }
        if (this.f1862f.size() > 0) {
            for (int i11 = 0; i11 < this.f1862f.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f1862f.get(i11);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    public void g(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void h(s sVar);

    public abstract void k(s sVar);

    /* access modifiers changed from: package-private */
    public void l(ViewGroup viewGroup, boolean z10) {
        C1587a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        m(z10);
        if ((this.f1861e.size() > 0 || this.f1862f.size() > 0) && (((arrayList = this.f1863g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f1864h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f1861e.size(); i10++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f1861e.get(i10)).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        k(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f1911c.add(this);
                    j(sVar);
                    if (z10) {
                        e(this.f1872p, findViewById, sVar);
                    } else {
                        e(this.f1873q, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f1862f.size(); i11++) {
                View view = (View) this.f1862f.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    k(sVar2);
                } else {
                    h(sVar2);
                }
                sVar2.f1911c.add(this);
                j(sVar2);
                if (z10) {
                    e(this.f1872p, view, sVar2);
                } else {
                    e(this.f1873q, view, sVar2);
                }
            }
        } else {
            i(viewGroup, z10);
        }
        if (!z10 && (aVar = this.f1855E) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f1872p.f1915d.remove((String) this.f1855E.i(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f1872p.f1915d.put((String) this.f1855E.n(i13), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z10) {
        if (z10) {
            this.f1872p.f1912a.clear();
            this.f1872p.f1913b.clear();
            this.f1872p.f1914c.a();
            return;
        }
        this.f1873q.f1912a.clear();
        this.f1873q.f1913b.clear();
        this.f1873q.f1914c.a();
    }

    /* renamed from: o */
    public C1162l clone() {
        try {
            C1162l lVar = (C1162l) super.clone();
            lVar.f1853C = new ArrayList();
            lVar.f1872p = new t();
            lVar.f1873q = new t();
            lVar.f1876t = null;
            lVar.f1877u = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        Animator animator;
        s sVar;
        View view;
        s sVar2;
        Animator animator2;
        C1587a A10 = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = (s) arrayList.get(i11);
            s sVar4 = (s) arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f1911c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f1911c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null) && (sVar3 == null || sVar4 == null || I(sVar3, sVar4))) {
                Animator p10 = p(viewGroup, sVar3, sVar4);
                if (p10 != null) {
                    if (sVar4 != null) {
                        View view2 = sVar4.f1910b;
                        String[] G10 = G();
                        if (G10 != null && G10.length > 0) {
                            sVar2 = new s(view2);
                            s sVar5 = (s) tVar2.f1912a.get(view2);
                            if (sVar5 != null) {
                                int i12 = 0;
                                while (i12 < G10.length) {
                                    Map map = sVar2.f1909a;
                                    Animator animator3 = p10;
                                    String str = G10[i12];
                                    map.put(str, sVar5.f1909a.get(str));
                                    i12++;
                                    p10 = animator3;
                                    G10 = G10;
                                }
                            }
                            Animator animator4 = p10;
                            int size2 = A10.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) A10.get((Animator) A10.i(i13));
                                if (dVar.f1888c != null && dVar.f1886a == view2 && dVar.f1887b.equals(x()) && dVar.f1888c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            t tVar3 = tVar2;
                            animator2 = p10;
                            sVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        t tVar4 = tVar2;
                        view = sVar3.f1910b;
                        animator = p10;
                        sVar = null;
                    }
                    if (animator != null) {
                        i10 = size;
                        d dVar2 = r0;
                        d dVar3 = new d(view, x(), this, A.d(viewGroup), sVar);
                        A10.put(animator, dVar2);
                        this.f1853C.add(animator);
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            } else {
                ViewGroup viewGroup2 = viewGroup;
            }
            t tVar5 = tVar2;
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = (Animator) this.f1853C.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        int i10 = this.f1881y - 1;
        this.f1881y = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f1852B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1852B.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).d(this);
                }
            }
            for (int i12 = 0; i12 < this.f1872p.f1914c.m(); i12++) {
                View view = (View) this.f1872p.f1914c.o(i12);
                if (view != null) {
                    C1680b0.x0(view, false);
                }
            }
            for (int i13 = 0; i13 < this.f1873q.f1914c.m(); i13++) {
                View view2 = (View) this.f1873q.f1914c.o(i13);
                if (view2 != null) {
                    C1680b0.x0(view2, false);
                }
            }
            this.f1851A = true;
        }
    }

    public long s() {
        return this.f1859c;
    }

    public e t() {
        return this.f1854D;
    }

    public String toString() {
        return e0("");
    }

    public TimeInterpolator u() {
        return this.f1860d;
    }

    /* access modifiers changed from: package-private */
    public s w(View view, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        p pVar = this.f1874r;
        if (pVar != null) {
            return pVar.w(view, z10);
        }
        if (z10) {
            arrayList = this.f1876t;
        } else {
            arrayList = this.f1877u;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i10);
            if (sVar == null) {
                return null;
            }
            if (sVar.f1910b == view) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.f1877u;
        } else {
            arrayList2 = this.f1876t;
        }
        return (s) arrayList2.get(i10);
    }

    public String x() {
        return this.f1857a;
    }

    public C1157g y() {
        return this.f1856F;
    }

    public C1165o z() {
        return null;
    }

    public void b0(C1165o oVar) {
    }

    /* access modifiers changed from: package-private */
    public void j(s sVar) {
    }
}
