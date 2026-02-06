package i0;

import Y.C0;
import b0.C1863a;
import b0.C1867e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6488j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import zf.C6831d;

public final class r implements x, List, RandomAccess, C6831d {

    /* renamed from: a  reason: collision with root package name */
    private z f21772a;

    public static final class a extends z {

        /* renamed from: c  reason: collision with root package name */
        private C1867e f21773c;

        /* renamed from: d  reason: collision with root package name */
        private int f21774d;

        /* renamed from: e  reason: collision with root package name */
        private int f21775e;

        public a(C1867e eVar) {
            this.f21773c = eVar;
        }

        public void c(z zVar) {
            synchronized (s.f21779a) {
                C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f21773c = ((a) zVar).f21773c;
                this.f21774d = ((a) zVar).f21774d;
                this.f21775e = ((a) zVar).f21775e;
                C6514M m10 = C6514M.f71813a;
            }
        }

        public z d() {
            return new a(this.f21773c);
        }

        public final C1867e i() {
            return this.f21773c;
        }

        public final int j() {
            return this.f21774d;
        }

        public final int k() {
            return this.f21775e;
        }

        public final void l(C1867e eVar) {
            this.f21773c = eVar;
        }

        public final void m(int i10) {
            this.f21774d = i10;
        }

        public final void n(int i10) {
            this.f21775e = i10;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f21776a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Collection f21777b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, Collection collection) {
            super(1);
            this.f21776a = i10;
            this.f21777b = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            return Boolean.valueOf(list.addAll(this.f21776a, this.f21777b));
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f21778a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Collection collection) {
            super(1);
            this.f21778a = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            return Boolean.valueOf(list.retainAll(this.f21778a));
        }
    }

    public r() {
        C1867e a10 = C1863a.a();
        a aVar = new a(a10);
        if (C2057k.f21728e.e()) {
            a aVar2 = new a(a10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f21772a = aVar;
    }

    private final boolean t(C6798l lVar) {
        int j10;
        C1867e i10;
        Object invoke;
        C2057k c10;
        boolean z10;
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i10 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i10);
            C1867e.a builder = i10.builder();
            invoke = lVar.invoke(builder);
            C1867e f10 = builder.f();
            if (C6496s.c(f10, i10)) {
                break;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(f10);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return ((Boolean) invoke).booleanValue();
    }

    public final a a() {
        z k10 = k();
        C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) p.X((a) k10, this);
    }

    public boolean add(Object obj) {
        int j10;
        C1867e i10;
        boolean z10;
        C2057k c10;
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i10 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i10);
            C1867e add = i10.add(obj);
            z10 = false;
            if (C6496s.c(add, i10)) {
                return false;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(add);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public boolean addAll(int i10, Collection collection) {
        return t(new b(i10, collection));
    }

    public int b() {
        return a().i().size();
    }

    public void clear() {
        C2057k c10;
        z k10 = k();
        C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) k10;
        p.J();
        synchronized (p.I()) {
            c10 = C2057k.f21728e.c();
            a aVar2 = (a) p.h0(aVar, this, c10);
            synchronized (s.f21779a) {
                aVar2.l(C1863a.a());
                aVar2.m(aVar2.j() + 1);
                aVar2.n(aVar2.k() + 1);
            }
        }
        p.Q(c10, this);
    }

    public boolean contains(Object obj) {
        return a().i().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return a().i().containsAll(collection);
    }

    public Object get(int i10) {
        return a().i().get(i10);
    }

    public int indexOf(Object obj) {
        return a().i().indexOf(obj);
    }

    public boolean isEmpty() {
        return a().i().isEmpty();
    }

    public Iterator iterator() {
        return listIterator();
    }

    public z k() {
        return this.f21772a;
    }

    public int lastIndexOf(Object obj) {
        return a().i().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return new w(this, 0);
    }

    public void n(z zVar) {
        zVar.g(k());
        C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f21772a = (a) zVar;
    }

    public final int r() {
        z k10 = k();
        C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) p.F((a) k10)).k();
    }

    public final /* bridge */ Object remove(int i10) {
        return v(i10);
    }

    public boolean removeAll(Collection collection) {
        int j10;
        C1867e i10;
        boolean z10;
        C2057k c10;
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i10 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i10);
            C1867e removeAll = i10.removeAll(collection);
            z10 = false;
            if (C6496s.c(removeAll, i10)) {
                return false;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(removeAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public boolean retainAll(Collection collection) {
        return t(new c(collection));
    }

    public Object set(int i10, Object obj) {
        int j10;
        C1867e i11;
        C2057k c10;
        boolean z10;
        Object obj2 = get(i10);
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i11 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i11);
            C1867e eVar = i11.set(i10, obj);
            if (C6496s.c(eVar, i11)) {
                break;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(eVar);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return obj2;
    }

    public final /* bridge */ int size() {
        return b();
    }

    public List subList(int i10, int i11) {
        boolean z10;
        if (i10 < 0 || i10 > i11 || i11 > size()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C0.a("fromIndex or toIndex are out of bounds");
        }
        return new C2044A(this, i10, i11);
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public String toString() {
        z k10 = k();
        C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) p.F((a) k10)).i() + ")@" + hashCode();
    }

    public Object v(int i10) {
        int j10;
        C1867e i11;
        C2057k c10;
        boolean z10;
        Object obj = get(i10);
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i11 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i11);
            C1867e y10 = i11.y(i10);
            if (C6496s.c(y10, i11)) {
                break;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(y10);
                        z10 = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return obj;
    }

    public final void x(int i10, int i11) {
        int j10;
        C1867e i12;
        C2057k c10;
        boolean z10;
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i12 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i12);
            C1867e.a builder = i12.builder();
            builder.subList(i10, i11).clear();
            C1867e f10 = builder.f();
            if (!C6496s.c(f10, i12)) {
                z k11 = k();
                C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) k11;
                p.J();
                synchronized (p.I()) {
                    c10 = C2057k.f21728e.c();
                    a aVar3 = (a) p.h0(aVar2, this, c10);
                    synchronized (s.f21779a) {
                        if (aVar3.j() == j10) {
                            aVar3.l(f10);
                            z10 = true;
                            aVar3.m(aVar3.j() + 1);
                            aVar3.n(aVar3.k() + 1);
                        } else {
                            z10 = false;
                        }
                    }
                }
                p.Q(c10, this);
            } else {
                return;
            }
        } while (!z10);
    }

    public final int z(Collection collection, int i10, int i11) {
        int j10;
        C1867e i12;
        C2057k c10;
        boolean z10;
        int size = size();
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i12 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i12);
            C1867e.a builder = i12.builder();
            builder.subList(i10, i11).retainAll(collection);
            C1867e f10 = builder.f();
            if (C6496s.c(f10, i12)) {
                break;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(f10);
                        z10 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return size - size();
    }

    public boolean addAll(Collection collection) {
        int j10;
        C1867e i10;
        boolean z10;
        C2057k c10;
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i10 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i10);
            C1867e addAll = i10.addAll(collection);
            z10 = false;
            if (C6496s.c(addAll, i10)) {
                return false;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(addAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public ListIterator listIterator(int i10) {
        return new w(this, i10);
    }

    public boolean remove(Object obj) {
        int j10;
        C1867e i10;
        boolean z10;
        C2057k c10;
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i10 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i10);
            C1867e remove = i10.remove(obj);
            z10 = false;
            if (C6496s.c(remove, i10)) {
                return false;
            }
            z k11 = k();
            C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) k11;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                a aVar3 = (a) p.h0(aVar2, this, c10);
                synchronized (s.f21779a) {
                    if (aVar3.j() == j10) {
                        aVar3.l(remove);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z10 = true;
                    }
                }
            }
            p.Q(c10, this);
        } while (!z10);
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        return C6488j.b(this, objArr);
    }

    public void add(int i10, Object obj) {
        int j10;
        C1867e i11;
        C2057k c10;
        boolean z10;
        do {
            synchronized (s.f21779a) {
                z k10 = k();
                C6496s.f(k10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) k10);
                j10 = aVar.j();
                i11 = aVar.i();
                C6514M m10 = C6514M.f71813a;
            }
            C6496s.e(i11);
            C1867e add = i11.add(i10, obj);
            if (!C6496s.c(add, i11)) {
                z k11 = k();
                C6496s.f(k11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) k11;
                p.J();
                synchronized (p.I()) {
                    c10 = C2057k.f21728e.c();
                    a aVar3 = (a) p.h0(aVar2, this, c10);
                    synchronized (s.f21779a) {
                        if (aVar3.j() == j10) {
                            aVar3.l(add);
                            z10 = true;
                            aVar3.n(aVar3.k() + 1);
                            aVar3.m(aVar3.j() + 1);
                        } else {
                            z10 = false;
                        }
                    }
                }
                p.Q(c10, this);
            } else {
                return;
            }
        } while (!z10);
    }
}
