package androidx.lifecycle;

import Xg.N;
import Xg.x;
import androidx.lifecycle.C1790m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.C2382a;
import p.C2383b;

/* renamed from: androidx.lifecycle.x  reason: case insensitive filesystem */
public class C1800x extends C1790m {

    /* renamed from: k  reason: collision with root package name */
    public static final a f17263k = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17264b;

    /* renamed from: c  reason: collision with root package name */
    private C2382a f17265c;

    /* renamed from: d  reason: collision with root package name */
    private C1790m.b f17266d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f17267e;

    /* renamed from: f  reason: collision with root package name */
    private int f17268f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17269g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17270h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f17271i;

    /* renamed from: j  reason: collision with root package name */
    private final x f17272j;

    /* renamed from: androidx.lifecycle.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1790m.b a(C1790m.b bVar, C1790m.b bVar2) {
            C6496s.h(bVar, "state1");
            if (bVar2 == null || bVar2.compareTo(bVar) >= 0) {
                return bVar;
            }
            return bVar2;
        }

        private a() {
        }
    }

    /* renamed from: androidx.lifecycle.x$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C1790m.b f17273a;

        /* renamed from: b  reason: collision with root package name */
        private C1795s f17274b;

        public b(C1797u uVar, C1790m.b bVar) {
            C6496s.h(bVar, "initialState");
            C6496s.e(uVar);
            this.f17274b = A.f(uVar);
            this.f17273a = bVar;
        }

        public final void a(C1798v vVar, C1790m.a aVar) {
            C6496s.h(aVar, "event");
            C1790m.b c10 = aVar.c();
            this.f17273a = C1800x.f17263k.a(this.f17273a, c10);
            C1795s sVar = this.f17274b;
            C6496s.e(vVar);
            sVar.f(vVar, aVar);
            this.f17273a = c10;
        }

        public final C1790m.b b() {
            return this.f17273a;
        }
    }

    private C1800x(C1798v vVar, boolean z10) {
        this.f17264b = z10;
        this.f17265c = new C2382a();
        C1790m.b bVar = C1790m.b.INITIALIZED;
        this.f17266d = bVar;
        this.f17271i = new ArrayList();
        this.f17267e = new WeakReference(vVar);
        this.f17272j = N.a(bVar);
    }

    private final void e(C1798v vVar) {
        Iterator descendingIterator = this.f17265c.descendingIterator();
        C6496s.g(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f17270h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            C6496s.g(entry, "next()");
            C1797u uVar = (C1797u) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f17266d) > 0 && !this.f17270h && this.f17265c.contains(uVar)) {
                C1790m.a a10 = C1790m.a.Companion.a(bVar.b());
                if (a10 != null) {
                    m(a10.c());
                    bVar.a(vVar, a10);
                    l();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    private final C1790m.b f(C1797u uVar) {
        C1790m.b bVar;
        b bVar2;
        Map.Entry n10 = this.f17265c.n(uVar);
        C1790m.b bVar3 = null;
        if (n10 == null || (bVar2 = (b) n10.getValue()) == null) {
            bVar = null;
        } else {
            bVar = bVar2.b();
        }
        if (!this.f17271i.isEmpty()) {
            ArrayList arrayList = this.f17271i;
            bVar3 = (C1790m.b) arrayList.get(arrayList.size() - 1);
        }
        a aVar = f17263k;
        return aVar.a(aVar.a(this.f17266d, bVar), bVar3);
    }

    private final void g(String str) {
        if (this.f17264b && !C1801y.a()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void h(C1798v vVar) {
        C2383b.d d10 = this.f17265c.d();
        C6496s.g(d10, "observerMap.iteratorWithAdditions()");
        while (d10.hasNext() && !this.f17270h) {
            Map.Entry entry = (Map.Entry) d10.next();
            C1797u uVar = (C1797u) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f17266d) < 0 && !this.f17270h && this.f17265c.contains(uVar)) {
                m(bVar.b());
                C1790m.a b10 = C1790m.a.Companion.b(bVar.b());
                if (b10 != null) {
                    bVar.a(vVar, b10);
                    l();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean j() {
        if (this.f17265c.size() == 0) {
            return true;
        }
        Map.Entry a10 = this.f17265c.a();
        C6496s.e(a10);
        C1790m.b b10 = ((b) a10.getValue()).b();
        Map.Entry g10 = this.f17265c.g();
        C6496s.e(g10);
        C1790m.b b11 = ((b) g10.getValue()).b();
        if (b10 == b11 && this.f17266d == b11) {
            return true;
        }
        return false;
    }

    private final void k(C1790m.b bVar) {
        C1790m.b bVar2 = this.f17266d;
        if (bVar2 != bVar) {
            if (bVar2 == C1790m.b.INITIALIZED && bVar == C1790m.b.DESTROYED) {
                throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f17266d + " in component " + this.f17267e.get()).toString());
            }
            this.f17266d = bVar;
            if (this.f17269g || this.f17268f != 0) {
                this.f17270h = true;
                return;
            }
            this.f17269g = true;
            o();
            this.f17269g = false;
            if (this.f17266d == C1790m.b.DESTROYED) {
                this.f17265c = new C2382a();
            }
        }
    }

    private final void l() {
        ArrayList arrayList = this.f17271i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(C1790m.b bVar) {
        this.f17271i.add(bVar);
    }

    private final void o() {
        C1798v vVar = (C1798v) this.f17267e.get();
        if (vVar != null) {
            while (!j()) {
                this.f17270h = false;
                C1790m.b bVar = this.f17266d;
                Map.Entry a10 = this.f17265c.a();
                C6496s.e(a10);
                if (bVar.compareTo(((b) a10.getValue()).b()) < 0) {
                    e(vVar);
                }
                Map.Entry g10 = this.f17265c.g();
                if (!this.f17270h && g10 != null && this.f17266d.compareTo(((b) g10.getValue()).b()) > 0) {
                    h(vVar);
                }
            }
            this.f17270h = false;
            this.f17272j.setValue(b());
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public void a(C1797u uVar) {
        C1798v vVar;
        boolean z10;
        C6496s.h(uVar, "observer");
        g("addObserver");
        C1790m.b bVar = this.f17266d;
        C1790m.b bVar2 = C1790m.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C1790m.b.INITIALIZED;
        }
        b bVar3 = new b(uVar, bVar2);
        if (((b) this.f17265c.k(uVar, bVar3)) == null && (vVar = (C1798v) this.f17267e.get()) != null) {
            if (this.f17268f != 0 || this.f17269g) {
                z10 = true;
            } else {
                z10 = false;
            }
            C1790m.b f10 = f(uVar);
            this.f17268f++;
            while (bVar3.b().compareTo(f10) < 0 && this.f17265c.contains(uVar)) {
                m(bVar3.b());
                C1790m.a b10 = C1790m.a.Companion.b(bVar3.b());
                if (b10 != null) {
                    bVar3.a(vVar, b10);
                    l();
                    f10 = f(uVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z10) {
                o();
            }
            this.f17268f--;
        }
    }

    public C1790m.b b() {
        return this.f17266d;
    }

    public void d(C1797u uVar) {
        C6496s.h(uVar, "observer");
        g("removeObserver");
        this.f17265c.m(uVar);
    }

    public void i(C1790m.a aVar) {
        C6496s.h(aVar, "event");
        g("handleLifecycleEvent");
        k(aVar.c());
    }

    public void n(C1790m.b bVar) {
        C6496s.h(bVar, "state");
        g("setCurrentState");
        k(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1800x(C1798v vVar) {
        this(vVar, true);
        C6496s.h(vVar, "provider");
    }
}
