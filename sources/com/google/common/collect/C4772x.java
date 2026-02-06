package com.google.common.collect;

import com.google.common.collect.X;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.common.collect.x  reason: case insensitive filesystem */
public abstract class C4772x extends C4756g implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e  reason: collision with root package name */
    final transient C4771w f56767e;

    /* renamed from: f  reason: collision with root package name */
    final transient int f56768f;

    /* renamed from: com.google.common.collect.x$a */
    class a extends g0 {

        /* renamed from: a  reason: collision with root package name */
        final Iterator f56769a;

        /* renamed from: b  reason: collision with root package name */
        Object f56770b = null;

        /* renamed from: c  reason: collision with root package name */
        Iterator f56771c = C.f();

        a() {
            this.f56769a = C4772x.this.f56767e.entrySet().m();
        }

        /* renamed from: a */
        public Map.Entry next() {
            if (!this.f56771c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f56769a.next();
                this.f56770b = entry.getKey();
                this.f56771c = ((C4768t) entry.getValue()).m();
            }
            Object obj = this.f56770b;
            Objects.requireNonNull(obj);
            return G.d(obj, this.f56771c.next());
        }

        public boolean hasNext() {
            if (this.f56771c.hasNext() || this.f56769a.hasNext()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.x$b */
    class b extends g0 {

        /* renamed from: a  reason: collision with root package name */
        Iterator f56773a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f56774b = C.f();

        b() {
            this.f56773a = C4772x.this.f56767e.values().m();
        }

        public boolean hasNext() {
            if (this.f56774b.hasNext() || this.f56773a.hasNext()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (!this.f56774b.hasNext()) {
                this.f56774b = ((C4768t) this.f56773a.next()).m();
            }
            return this.f56774b.next();
        }
    }

    /* renamed from: com.google.common.collect.x$c */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final Map f56776a = P.d();

        /* renamed from: b  reason: collision with root package name */
        Comparator f56777b;

        /* renamed from: c  reason: collision with root package name */
        Comparator f56778c;
    }

    /* renamed from: com.google.common.collect.x$d */
    private static class d extends C4768t {
        private static final long serialVersionUID = 0;

        /* renamed from: b  reason: collision with root package name */
        final C4772x f56779b;

        d(C4772x xVar) {
            this.f56779b = xVar;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f56779b.b(entry.getKey(), entry.getValue());
        }

        /* renamed from: m */
        public g0 iterator() {
            return this.f56779b.h();
        }

        public int size() {
            return this.f56779b.size();
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* renamed from: com.google.common.collect.x$e */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        static final X.b f56780a;

        /* renamed from: b  reason: collision with root package name */
        static final X.b f56781b;

        static {
            Class<C4772x> cls = C4772x.class;
            f56780a = X.a(cls, "map");
            f56781b = X.a(cls, "size");
        }
    }

    /* renamed from: com.google.common.collect.x$f */
    private static final class f extends C4768t {
        private static final long serialVersionUID = 0;

        /* renamed from: b  reason: collision with root package name */
        private final transient C4772x f56782b;

        f(C4772x xVar) {
            this.f56782b = xVar;
        }

        /* access modifiers changed from: package-private */
        public int b(Object[] objArr, int i10) {
            g0 m10 = this.f56782b.f56767e.values().m();
            while (m10.hasNext()) {
                i10 = ((C4768t) m10.next()).b(objArr, i10);
            }
            return i10;
        }

        public boolean contains(Object obj) {
            return this.f56782b.c(obj);
        }

        /* renamed from: m */
        public g0 iterator() {
            return this.f56782b.j();
        }

        public int size() {
            return this.f56782b.size();
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    C4772x(C4771w wVar, int i10) {
        this.f56767e = wVar;
        this.f56768f = i10;
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    public boolean c(Object obj) {
        if (obj == null || !super.c(obj)) {
            return false;
        }
        return true;
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Map d() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public Set f() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: k */
    public C4771w asMap() {
        return this.f56767e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C4768t e() {
        return new d(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C4768t g() {
        return new f(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public g0 h() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public g0 j() {
        return new b();
    }

    /* renamed from: p */
    public C4768t values() {
        return (C4768t) super.values();
    }

    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f56768f;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
