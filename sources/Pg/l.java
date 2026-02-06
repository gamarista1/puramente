package Pg;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import mf.C6555h;
import mf.C6559l;
import zf.C6828a;

public final class l extends C6555h {

    /* renamed from: c  reason: collision with root package name */
    public static final b f64708c = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private Object f64709a;

    /* renamed from: b  reason: collision with root package name */
    private int f64710b;

    private static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f64711a;

        public a(Object[] objArr) {
            C6496s.h(objArr, "array");
            this.f64711a = C6481c.a(objArr);
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f64711a.hasNext();
        }

        public Object next() {
            return this.f64711a.next();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            return new l((DefaultConstructorMarker) null);
        }

        public final l b(Collection collection) {
            C6496s.h(collection, "set");
            l lVar = new l((DefaultConstructorMarker) null);
            lVar.addAll(collection);
            return lVar;
        }

        private b() {
        }
    }

    private static final class c implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f64712a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f64713b = true;

        public c(Object obj) {
            this.f64712a = obj;
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f64713b;
        }

        public Object next() {
            if (this.f64713b) {
                this.f64713b = false;
                return this.f64712a;
            }
            throw new NoSuchElementException();
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final l b() {
        return f64708c.a();
    }

    public int a() {
        return this.f64710b;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r4.f64709a = r5
            goto L_0x0075
        L_0x000a:
            int r0 = r4.size()
            r2 = 0
            if (r0 != r1) goto L_0x0023
            java.lang.Object r0 = r4.f64709a
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r5)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.Object r0 = r4.f64709a
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            r4.f64709a = r5
            goto L_0x0075
        L_0x0023:
            int r0 = r4.size()
            r3 = 5
            if (r0 >= r3) goto L_0x0063
            java.lang.Object r0 = r4.f64709a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C6496s.f(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = mf.C6559l.W(r0, r5)
            if (r3 == 0) goto L_0x003a
            return r2
        L_0x003a:
            int r2 = r4.size()
            r3 = 4
            if (r2 != r3) goto L_0x004e
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.util.LinkedHashSet r0 = mf.Y.g(r0)
            r0.add(r5)
            goto L_0x0060
        L_0x004e:
            int r2 = r4.size()
            int r2 = r2 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.C6496s.g(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r5
        L_0x0060:
            r4.f64709a = r0
            goto L_0x0075
        L_0x0063:
            java.lang.Object r0 = r4.f64709a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.C6496s.f(r0, r3)
            java.util.Set r0 = kotlin.jvm.internal.V.e(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x0075
            return r2
        L_0x0075:
            int r5 = r4.size()
            int r5 = r5 + r1
            r4.g(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Pg.l.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f64709a = null;
        g(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C6496s.c(this.f64709a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f64709a;
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C6559l.W((Object[]) obj2, obj);
        }
        Object obj3 = this.f64709a;
        C6496s.f(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void g(int i10) {
        this.f64710b = i10;
    }

    public Iterator iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f64709a);
        }
        if (size() < 5) {
            Object obj = this.f64709a;
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f64709a;
        C6496s.f(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return V.e(obj2).iterator();
    }

    private l() {
    }
}
