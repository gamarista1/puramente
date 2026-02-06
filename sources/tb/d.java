package Tb;

import Ob.e;
import Ob.l;
import Tb.c;
import Tb.n;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List f52516a;

    /* renamed from: b  reason: collision with root package name */
    private final List f52517b;

    class a extends c.C0806c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f52518a;

        a(b bVar) {
            this.f52518a = bVar;
        }

        public void b(b bVar, n nVar) {
            this.f52518a.q(bVar);
            d.f(nVar, this.f52518a);
            this.f52518a.l();
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private StringBuilder f52519a = null;

        /* renamed from: b  reason: collision with root package name */
        private Stack f52520b = new Stack();

        /* renamed from: c  reason: collision with root package name */
        private int f52521c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f52522d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f52523e = true;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final List f52524f = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final List f52525g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        private final C0807d f52526h;

        public b(C0807d dVar) {
            this.f52526h = dVar;
        }

        private void g(StringBuilder sb2, b bVar) {
            sb2.append(l.j(bVar.b()));
        }

        private Lb.l k(int i10) {
            b[] bVarArr = new b[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bVarArr[i11] = (b) this.f52520b.get(i11);
            }
            return new Lb.l(bVarArr);
        }

        /* access modifiers changed from: private */
        public void l() {
            this.f52522d--;
            if (h()) {
                this.f52519a.append(")");
            }
            this.f52523e = true;
        }

        private void m() {
            l.g(h(), "Can't end range without starting a range!");
            for (int i10 = 0; i10 < this.f52522d; i10++) {
                this.f52519a.append(")");
            }
            this.f52519a.append(")");
            Lb.l k10 = k(this.f52521c);
            this.f52525g.add(l.i(this.f52519a.toString()));
            this.f52524f.add(k10);
            this.f52519a = null;
        }

        private void n() {
            if (!h()) {
                StringBuilder sb2 = new StringBuilder();
                this.f52519a = sb2;
                sb2.append("(");
                Iterator it = k(this.f52522d).iterator();
                while (it.hasNext()) {
                    g(this.f52519a, (b) it.next());
                    this.f52519a.append(":(");
                }
                this.f52523e = false;
            }
        }

        /* access modifiers changed from: private */
        public void o() {
            boolean z10;
            if (this.f52522d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l.g(z10, "Can't finish hashing in the middle processing a child");
            if (h()) {
                m();
            }
            this.f52525g.add("");
        }

        /* access modifiers changed from: private */
        public void p(k kVar) {
            n();
            this.f52521c = this.f52522d;
            this.f52519a.append(kVar.L(n.b.V2));
            this.f52523e = true;
            if (this.f52526h.a(this)) {
                m();
            }
        }

        /* access modifiers changed from: private */
        public void q(b bVar) {
            n();
            if (this.f52523e) {
                this.f52519a.append(f.f37529a);
            }
            g(this.f52519a, bVar);
            this.f52519a.append(":(");
            if (this.f52522d == this.f52520b.size()) {
                this.f52520b.add(bVar);
            } else {
                this.f52520b.set(this.f52522d, bVar);
            }
            this.f52522d++;
            this.f52523e = false;
        }

        public boolean h() {
            if (this.f52519a != null) {
                return true;
            }
            return false;
        }

        public int i() {
            return this.f52519a.length();
        }

        public Lb.l j() {
            return k(this.f52522d);
        }
    }

    private static class c implements C0807d {

        /* renamed from: a  reason: collision with root package name */
        private final long f52527a;

        public c(n nVar) {
            this.f52527a = Math.max(512, (long) Math.sqrt((double) (e.b(nVar) * 100)));
        }

        public boolean a(b bVar) {
            if (((long) bVar.i()) <= this.f52527a || (!bVar.j().isEmpty() && bVar.j().C().equals(b.l()))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: Tb.d$d  reason: collision with other inner class name */
    public interface C0807d {
        boolean a(b bVar);
    }

    private d(List list, List list2) {
        if (list.size() == list2.size() - 1) {
            this.f52516a = list;
            this.f52517b = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public static d b(n nVar) {
        return c(nVar, new c(nVar));
    }

    public static d c(n nVar, C0807d dVar) {
        if (nVar.isEmpty()) {
            return new d(Collections.emptyList(), Collections.singletonList(""));
        }
        b bVar = new b(dVar);
        f(nVar, bVar);
        bVar.o();
        return new d(bVar.f52524f, bVar.f52525g);
    }

    /* access modifiers changed from: private */
    public static void f(n nVar, b bVar) {
        if (nVar.e0()) {
            bVar.p((k) nVar);
        } else if (nVar.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else if (nVar instanceof c) {
            ((c) nVar).r(new a(bVar), true);
        } else {
            throw new IllegalStateException("Expected children node, but got: " + nVar);
        }
    }

    public List d() {
        return Collections.unmodifiableList(this.f52517b);
    }

    public List e() {
        return Collections.unmodifiableList(this.f52516a);
    }
}
