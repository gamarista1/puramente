package yg;

import Fg.S;
import Of.C5483a;
import Of.C5495m;
import Of.Z;
import Of.g0;
import Pg.k;
import Wf.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.f;
import rg.C6700r;
import yf.C6798l;

/* renamed from: yg.x  reason: case insensitive filesystem */
public final class C6825x extends C6802a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f73967d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final String f73968b;

    /* renamed from: c  reason: collision with root package name */
    private final C6812k f73969c;

    /* renamed from: yg.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6812k a(String str, Collection collection) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            C6496s.h(collection, "types");
            Iterable<S> iterable = collection;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (S o10 : iterable) {
                arrayList.add(o10.o());
            }
            k b10 = Og.a.b(arrayList);
            C6812k b11 = C6803b.f73902d.b(str, b10);
            if (b10.size() <= 1) {
                return b11;
            }
            return new C6825x(str, b11, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C6825x(String str, C6812k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kVar);
    }

    public static final C6812k m(String str, Collection collection) {
        return f73967d.a(str, collection);
    }

    /* access modifiers changed from: private */
    public static final C5483a n(C5483a aVar) {
        C6496s.h(aVar, "$this$selectMostSpecificInEachOverridableGroup");
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final C5483a o(g0 g0Var) {
        C6496s.h(g0Var, "$this$selectMostSpecificInEachOverridableGroup");
        return g0Var;
    }

    /* access modifiers changed from: private */
    public static final C5483a p(Z z10) {
        C6496s.h(z10, "$this$selectMostSpecificInEachOverridableGroup");
        return z10;
    }

    public Collection b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return C6700r.b(super.b(fVar, bVar), C6823v.f73965a);
    }

    public Collection c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return C6700r.b(super.c(fVar, bVar), C6822u.f73964a);
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : super.f(dVar, lVar)) {
            if (((C5495m) next) instanceof C5483a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        C6496s.f(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return C6565s.K0(C6700r.b(list, C6824w.f73966a), (List) pair.b());
    }

    /* access modifiers changed from: protected */
    public C6812k i() {
        return this.f73969c;
    }

    private C6825x(String str, C6812k kVar) {
        this.f73968b = str;
        this.f73969c = kVar;
    }
}
