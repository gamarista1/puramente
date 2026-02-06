package com.google.firebase.database;

import Tb.i;
import Tb.m;
import java.util.Iterator;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final i f57115a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f57116b;

    /* renamed from: com.google.firebase.database.a$a  reason: collision with other inner class name */
    class C0852a implements Iterable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f57117a;

        /* renamed from: com.google.firebase.database.a$a$a  reason: collision with other inner class name */
        class C0853a implements Iterator {
            C0853a() {
            }

            /* renamed from: a */
            public a next() {
                m mVar = (m) C0852a.this.f57117a.next();
                return new a(a.this.f57116b.J(mVar.c().b()), i.b(mVar.d()));
            }

            public boolean hasNext() {
                return C0852a.this.f57117a.hasNext();
            }

            public void remove() {
                throw new UnsupportedOperationException("remove called on immutable collection");
            }
        }

        C0852a(Iterator it) {
            this.f57117a = it;
        }

        public Iterator iterator() {
            return new C0853a();
        }
    }

    a(b bVar, i iVar) {
        this.f57115a = iVar;
        this.f57116b = bVar;
    }

    public boolean b() {
        return !this.f57115a.k().isEmpty();
    }

    public Iterable c() {
        return new C0852a(this.f57115a.iterator());
    }

    public long d() {
        return (long) this.f57115a.k().getChildCount();
    }

    public String e() {
        return this.f57116b.K();
    }

    public Object f() {
        Object value = this.f57115a.k().q().getValue();
        if (value instanceof Long) {
            return Double.valueOf((double) ((Long) value).longValue());
        }
        return value;
    }

    public b g() {
        return this.f57116b;
    }

    public Object h() {
        return this.f57115a.k().getValue();
    }

    public Object i(boolean z10) {
        return this.f57115a.k().K(z10);
    }

    public boolean j() {
        if (this.f57115a.k().getChildCount() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "DataSnapshot { key = " + this.f57116b.K() + ", value = " + this.f57115a.k().K(true) + " }";
    }
}
