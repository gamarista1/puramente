package Rg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6565s;
import mf.Y;
import yf.C6798l;
import zf.C6828a;

abstract class p extends o {

    public static final class a implements Iterable, C6828a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f65000a;

        public a(h hVar) {
            this.f65000a = hVar;
        }

        public Iterator iterator() {
            return this.f65000a.iterator();
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65001a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            boolean z10;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* synthetic */ class c extends C6494p implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65002a = new c();

        c() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* renamed from: i */
        public final Iterator invoke(h hVar) {
            C6496s.h(hVar, "p0");
            return hVar.iterator();
        }
    }

    public static h A(h hVar, h hVar2) {
        C6496s.h(hVar, "<this>");
        C6496s.h(hVar2, "elements");
        return n.f(k.j(hVar, hVar2));
    }

    public static h B(h hVar, Iterable iterable) {
        C6496s.h(hVar, "<this>");
        C6496s.h(iterable, "elements");
        return n.f(k.j(hVar, C6565s.b0(iterable)));
    }

    public static h C(h hVar, Object obj) {
        C6496s.h(hVar, "<this>");
        return n.f(k.j(hVar, k.j(obj)));
    }

    public static h D(h hVar, int i10) {
        C6496s.h(hVar, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return k.e();
        } else {
            if (hVar instanceof c) {
                return ((c) hVar).b(i10);
            }
            return new r(hVar, i10);
        }
    }

    public static h E(h hVar, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(lVar, "predicate");
        return new s(hVar, lVar);
    }

    public static Collection F(h hVar, Collection collection) {
        C6496s.h(hVar, "<this>");
        C6496s.h(collection, "destination");
        for (Object add : hVar) {
            collection.add(add);
        }
        return collection;
    }

    public static List G(h hVar) {
        C6496s.h(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return C6565s.n();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C6565s.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List H(h hVar) {
        C6496s.h(hVar, "<this>");
        return (List) k.F(hVar, new ArrayList());
    }

    public static Set I(h hVar) {
        C6496s.h(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return Y.e();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Y.d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static boolean k(h hVar) {
        C6496s.h(hVar, "<this>");
        return hVar.iterator().hasNext();
    }

    public static Iterable l(h hVar) {
        C6496s.h(hVar, "<this>");
        return new a(hVar);
    }

    public static int m(h hVar) {
        C6496s.h(hVar, "<this>");
        Iterator it = hVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                C6565s.w();
            }
        }
        return i10;
    }

    public static h n(h hVar, int i10) {
        C6496s.h(hVar, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return hVar;
        } else {
            if (hVar instanceof c) {
                return ((c) hVar).a(i10);
            }
            return new b(hVar, i10);
        }
    }

    public static h o(h hVar, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(lVar, "predicate");
        return new e(hVar, true, lVar);
    }

    public static h p(h hVar, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(lVar, "predicate");
        return new e(hVar, false, lVar);
    }

    public static h q(h hVar) {
        C6496s.h(hVar, "<this>");
        h p10 = k.p(hVar, b.f65001a);
        C6496s.f(p10, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return p10;
    }

    public static Object r(h hVar) {
        C6496s.h(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static h s(h hVar, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(lVar, "transform");
        return new f(hVar, lVar, c.f65002a);
    }

    public static final Appendable t(h hVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(appendable, "buffer");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object next : hVar) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Sg.p.a(appendable, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String u(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(charSequence, "separator");
        C6496s.h(charSequence2, "prefix");
        C6496s.h(charSequence3, "postfix");
        C6496s.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) t(hVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        C6496s.g(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String v(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C6798l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return u(hVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static Object w(h hVar) {
        C6496s.h(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static h x(h hVar, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(lVar, "transform");
        return new t(hVar, lVar);
    }

    public static h y(h hVar, C6798l lVar) {
        C6496s.h(hVar, "<this>");
        C6496s.h(lVar, "transform");
        return k.q(new t(hVar, lVar));
    }

    public static Object z(h hVar, Comparator comparator) {
        C6496s.h(hVar, "<this>");
        C6496s.h(comparator, "comparator");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }
}
