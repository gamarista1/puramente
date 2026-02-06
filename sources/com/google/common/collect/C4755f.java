package com.google.common.collect;

import com.google.common.collect.J;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.f  reason: case insensitive filesystem */
abstract class C4755f implements H {

    /* renamed from: a  reason: collision with root package name */
    private transient Collection f56700a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set f56701b;

    /* renamed from: c  reason: collision with root package name */
    private transient Collection f56702c;

    /* renamed from: d  reason: collision with root package name */
    private transient Map f56703d;

    /* renamed from: com.google.common.collect.f$a */
    class a extends J.b {
        a() {
        }

        /* access modifiers changed from: package-private */
        public H a() {
            return C4755f.this;
        }

        public Iterator iterator() {
            return C4755f.this.h();
        }
    }

    /* renamed from: com.google.common.collect.f$b */
    class b extends a implements Set {
        b(C4755f fVar) {
            super();
        }

        public boolean equals(Object obj) {
            return a0.a(this, obj);
        }

        public int hashCode() {
            return a0.d(this);
        }
    }

    /* renamed from: com.google.common.collect.f$c */
    class c extends AbstractCollection {
        c() {
        }

        public void clear() {
            C4755f.this.clear();
        }

        public boolean contains(Object obj) {
            return C4755f.this.c(obj);
        }

        public Iterator iterator() {
            return C4755f.this.j();
        }

        public int size() {
            return C4755f.this.size();
        }
    }

    C4755f() {
    }

    public Collection a() {
        Collection collection = this.f56700a;
        if (collection != null) {
            return collection;
        }
        Collection e10 = e();
        this.f56700a = e10;
        return e10;
    }

    public Map asMap() {
        Map map = this.f56703d;
        if (map != null) {
            return map;
        }
        Map d10 = d();
        this.f56703d = d10;
        return d10;
    }

    public boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    public boolean c(Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract Map d();

    /* access modifiers changed from: package-private */
    public abstract Collection e();

    public boolean equals(Object obj) {
        return J.a(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract Set f();

    /* access modifiers changed from: package-private */
    public abstract Collection g();

    /* access modifiers changed from: package-private */
    public abstract Iterator h();

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set i() {
        Set set = this.f56701b;
        if (set != null) {
            return set;
        }
        Set f10 = f();
        this.f56701b = f10;
        return f10;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator j();

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return asMap().toString();
    }

    public Collection values() {
        Collection collection = this.f56702c;
        if (collection != null) {
            return collection;
        }
        Collection g10 = g();
        this.f56702c = g10;
        return g10;
    }
}
