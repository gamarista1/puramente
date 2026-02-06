package yg;

import Of.C5490h;
import Of.C5491i;
import Of.D;
import Pg.k;
import Wf.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import mf.Y;
import ng.f;
import yf.C6798l;
import yg.C6812k;

/* renamed from: yg.b  reason: case insensitive filesystem */
public final class C6803b implements C6812k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f73902d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final String f73903b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6812k[] f73904c;

    /* renamed from: yg.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6812k a(String str, Iterable iterable) {
            C6496s.h(str, "debugName");
            C6496s.h(iterable, "scopes");
            k kVar = new k();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C6812k kVar2 = (C6812k) it.next();
                if (kVar2 != C6812k.b.f73949b) {
                    if (kVar2 instanceof C6803b) {
                        C6565s.E(kVar, ((C6803b) kVar2).f73904c);
                    } else {
                        kVar.add(kVar2);
                    }
                }
            }
            return b(str, kVar);
        }

        public final C6812k b(String str, List list) {
            C6496s.h(str, "debugName");
            C6496s.h(list, "scopes");
            int size = list.size();
            if (size == 0) {
                return C6812k.b.f73949b;
            }
            if (size != 1) {
                return new C6803b(str, (C6812k[]) list.toArray(new C6812k[0]), (DefaultConstructorMarker) null);
            }
            return (C6812k) list.get(0);
        }

        private a() {
        }
    }

    public /* synthetic */ C6803b(String str, C6812k[] kVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kVarArr);
    }

    public Set a() {
        C6812k[] kVarArr = this.f73904c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6812k a10 : kVarArr) {
            C6565s.D(linkedHashSet, a10.a());
        }
        return linkedHashSet;
    }

    public Collection b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        C6812k[] kVarArr = this.f73904c;
        int length = kVarArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length == 1) {
            return kVarArr[0].b(fVar, bVar);
        }
        Collection collection = null;
        for (C6812k b10 : kVarArr) {
            collection = Og.a.a(collection, b10.b(fVar, bVar));
        }
        if (collection == null) {
            return Y.e();
        }
        return collection;
    }

    public Collection c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        C6812k[] kVarArr = this.f73904c;
        int length = kVarArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length == 1) {
            return kVarArr[0].c(fVar, bVar);
        }
        Collection collection = null;
        for (C6812k c10 : kVarArr) {
            collection = Og.a.a(collection, c10.c(fVar, bVar));
        }
        if (collection == null) {
            return Y.e();
        }
        return collection;
    }

    public Set d() {
        C6812k[] kVarArr = this.f73904c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6812k d10 : kVarArr) {
            C6565s.D(linkedHashSet, d10.d());
        }
        return linkedHashSet;
    }

    public C5490h e(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        C5490h hVar = null;
        for (C6812k e10 : this.f73904c) {
            C5490h e11 = e10.e(fVar, bVar);
            if (e11 != null) {
                if (!(e11 instanceof C5491i) || !((D) e11).k0()) {
                    return e11;
                }
                if (hVar == null) {
                    hVar = e11;
                }
            }
        }
        return hVar;
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        C6812k[] kVarArr = this.f73904c;
        int length = kVarArr.length;
        if (length == 0) {
            return C6565s.n();
        }
        if (length == 1) {
            return kVarArr[0].f(dVar, lVar);
        }
        Collection collection = null;
        for (C6812k f10 : kVarArr) {
            collection = Og.a.a(collection, f10.f(dVar, lVar));
        }
        if (collection == null) {
            return Y.e();
        }
        return collection;
    }

    public Set g() {
        return C6814m.a(C6559l.R(this.f73904c));
    }

    public String toString() {
        return this.f73903b;
    }

    private C6803b(String str, C6812k[] kVarArr) {
        this.f73903b = str;
        this.f73904c = kVarArr;
    }
}
