package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import nb.o;
import nb.u;

public abstract class I {

    class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f56616a;

        a(int i10) {
            this.f56616a = i10;
        }

        /* access modifiers changed from: package-private */
        public Map c() {
            return P.c(this.f56616a);
        }
    }

    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f56617a;

        b(Comparator comparator) {
            this.f56617a = comparator;
        }

        /* access modifiers changed from: package-private */
        public Map c() {
            return new TreeMap(this.f56617a);
        }
    }

    private static final class c implements u, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f56618a;

        c(int i10) {
            this.f56618a = C4758i.b(i10, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List get() {
            return new ArrayList(this.f56618a);
        }
    }

    public static abstract class d extends I {
        d() {
            super((a) null);
        }

        public abstract D e();
    }

    public static abstract class e {

        class a extends d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f56619a;

            a(int i10) {
                this.f56619a = i10;
            }

            public D e() {
                return J.b(e.this.c(), new c(this.f56619a));
            }
        }

        e() {
        }

        public d a() {
            return b(2);
        }

        public d b(int i10) {
            C4758i.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        /* access modifiers changed from: package-private */
        public abstract Map c();
    }

    /* synthetic */ I(a aVar) {
        this();
    }

    public static e a() {
        return b(8);
    }

    public static e b(int i10) {
        C4758i.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e c() {
        return d(O.d());
    }

    public static e d(Comparator comparator) {
        o.j(comparator);
        return new b(comparator);
    }

    private I() {
    }
}
