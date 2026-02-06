package Gg;

import Ff.f;
import Fg.C5366d0;
import Fg.C5374h0;
import Fg.C5397y;
import Fg.L;
import Fg.M0;
import Fg.Q;
import Fg.S;
import Fg.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mf.C6565s;
import sf.C6714a;
import tg.q;
import yf.C6798l;
import yf.p;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f63210a = new z();

    private enum a {
        ;

        /* renamed from: Gg.z$a$a  reason: collision with other inner class name */
        static final class C0937a extends a {
            C0937a(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public a b(M0 m02) {
                C6496s.h(m02, "nextType");
                return c(m02);
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            /* renamed from: e */
            public b b(M0 m02) {
                C6496s.h(m02, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public a b(M0 m02) {
                C6496s.h(m02, "nextType");
                return c(m02);
            }
        }

        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, (DefaultConstructorMarker) null);
            }

            public a b(M0 m02) {
                C6496s.h(m02, "nextType");
                a c10 = c(m02);
                if (c10 == a.f63212b) {
                    return this;
                }
                return c10;
            }
        }

        static {
            a[] a10;
            f63216f = C6714a.a(a10);
        }

        public abstract a b(M0 m02);

        /* access modifiers changed from: protected */
        public final a c(M0 m02) {
            C6496s.h(m02, "<this>");
            if (m02.O0()) {
                return f63212b;
            }
            if (m02 instanceof C5397y) {
                ((C5397y) m02).Z0();
            }
            if (r.f63204a.a(m02)) {
                return f63214d;
            }
            return f63213c;
        }
    }

    /* synthetic */ class b extends C6493o implements p {
        b(Object obj) {
            super(2, obj);
        }

        public final String getName() {
            return "isStrictSupertype";
        }

        public final f getOwner() {
            return O.b(z.class);
        }

        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        /* renamed from: i */
        public final Boolean invoke(S s10, S s11) {
            C6496s.h(s10, "p0");
            C6496s.h(s11, "p1");
            return Boolean.valueOf(((z) this.receiver).g(s10, s11));
        }
    }

    /* synthetic */ class c extends C6493o implements p {
        c(Object obj) {
            super(2, obj);
        }

        public final String getName() {
            return "equalTypes";
        }

        public final f getOwner() {
            return O.b(q.class);
        }

        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        /* renamed from: i */
        public final Boolean invoke(S s10, S s11) {
            C6496s.h(s10, "p0");
            C6496s.h(s11, "p1");
            return Boolean.valueOf(((q) this.receiver).b(s10, s11));
        }
    }

    private z() {
    }

    private final Collection c(Collection collection, p pVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            C5366d0 d0Var = (C5366d0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C5366d0 d0Var2 = (C5366d0) it2.next();
                    if (d0Var2 != d0Var) {
                        C6496s.e(d0Var2);
                        C6496s.e(d0Var);
                        if (((Boolean) pVar.invoke(d0Var2, d0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final C5366d0 e(Set set) {
        if (set.size() == 1) {
            return (C5366d0) C6565s.O0(set);
        }
        new y(set);
        Collection collection = set;
        Collection c10 = c(collection, new b(this));
        c10.isEmpty();
        C5366d0 b10 = q.f73565f.b(c10);
        if (b10 != null) {
            return b10;
        }
        Collection c11 = c(c10, new c(p.f63198b.a()));
        c11.isEmpty();
        if (c11.size() < 2) {
            return (C5366d0) C6565s.O0(c11);
        }
        return new Q(collection).f();
    }

    /* access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + C6565s.x0(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean g(S s10, S s11) {
        q a10 = p.f63198b.a();
        if (!a10.c(s10, s11) || a10.c(s11, s10)) {
            return false;
        }
        return true;
    }

    public final C5366d0 d(List list) {
        C6496s.h(list, "types");
        list.size();
        ArrayList<M0> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5366d0 d0Var = (C5366d0) it.next();
            if (d0Var.N0() instanceof Q) {
                Collection l10 = d0Var.N0().l();
                C6496s.g(l10, "getSupertypes(...)");
                Iterable<S> iterable = l10;
                ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
                for (S s10 : iterable) {
                    C6496s.e(s10);
                    C5366d0 d10 = L.d(s10);
                    if (d0Var.O0()) {
                        d10 = d10.U0(true);
                    }
                    arrayList2.add(d10);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(d0Var);
            }
        }
        a aVar = a.f63211a;
        for (M0 b10 : arrayList) {
            aVar = aVar.b(b10);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C5366d0 d0Var2 = (C5366d0) it2.next();
            if (aVar == a.f63214d) {
                if (d0Var2 instanceof i) {
                    d0Var2 = C5374h0.k((i) d0Var2);
                }
                d0Var2 = C5374h0.i(d0Var2, false, 1, (Object) null);
            }
            linkedHashSet.add(d0Var2);
        }
        Iterable<C5366d0> iterable2 = list;
        ArrayList arrayList3 = new ArrayList(C6565s.y(iterable2, 10));
        for (C5366d0 M02 : iterable2) {
            arrayList3.add(M02.M0());
        }
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                next = ((r0) next).v((r0) it3.next());
            }
            return e(linkedHashSet).V0((r0) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
