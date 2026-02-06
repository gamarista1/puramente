package com.google.firebase.database;

import Lb.D;
import Lb.l;
import Lb.u;
import Tb.i;
import Tb.m;
import Tb.n;
import Tb.o;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final u f57142a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f57143b;

    class a implements Iterable {

        /* renamed from: com.google.firebase.database.f$a$a  reason: collision with other inner class name */
        class C0855a implements Iterator {
            C0855a() {
            }

            /* renamed from: a */
            public f next() {
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                return false;
            }

            public void remove() {
                throw new UnsupportedOperationException("remove called on immutable collection");
            }
        }

        a() {
        }

        public Iterator iterator() {
            return new C0855a();
        }
    }

    class b implements Iterable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f57146a;

        class a implements Iterator {
            a() {
            }

            /* renamed from: a */
            public f next() {
                return new f(f.this.f57142a, f.this.f57143b.x(((m) b.this.f57146a.next()).c()), (a) null);
            }

            public boolean hasNext() {
                return b.this.f57146a.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException("remove called on immutable collection");
            }
        }

        b(Iterator it) {
            this.f57146a = it;
        }

        public Iterator iterator() {
            return new a();
        }
    }

    /* synthetic */ f(u uVar, l lVar, a aVar) {
        this(uVar, lVar);
    }

    public Iterable c() {
        n f10 = f();
        if (f10.isEmpty() || f10.e0()) {
            return new a();
        }
        return new b(i.b(f10).iterator());
    }

    public long d() {
        return (long) f().getChildCount();
    }

    public String e() {
        if (this.f57143b.C() != null) {
            return this.f57143b.C().b();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!this.f57142a.equals(fVar.f57142a) || !this.f57143b.equals(fVar.f57143b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public n f() {
        return this.f57142a.a(this.f57143b);
    }

    public Object g() {
        return f().getValue();
    }

    public boolean h() {
        n f10 = f();
        if (f10.e0() || f10.isEmpty()) {
            return false;
        }
        return true;
    }

    public void i(Object obj) {
        D.g(this.f57143b, obj);
        Object b10 = Pb.a.b(obj);
        Ob.m.k(b10);
        this.f57142a.c(this.f57143b, o.a(b10));
    }

    public String toString() {
        String str;
        Tb.b E10 = this.f57143b.E();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MutableData { key = ");
        if (E10 != null) {
            str = E10.b();
        } else {
            str = "<none>";
        }
        sb2.append(str);
        sb2.append(", value = ");
        sb2.append(this.f57142a.b().K(true));
        sb2.append(" }");
        return sb2.toString();
    }

    f(n nVar) {
        this(new u(nVar), new l(""));
    }

    private f(u uVar, l lVar) {
        this.f57142a = uVar;
        this.f57143b = lVar;
        D.g(lVar, g());
    }
}
