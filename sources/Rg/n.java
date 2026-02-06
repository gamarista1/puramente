package Rg;

import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6559l;
import yf.C6787a;
import yf.C6798l;

abstract class n extends m {

    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f64995a;

        public a(Iterator it) {
            this.f64995a = it;
        }

        public Iterator iterator() {
            return this.f64995a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64996a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator invoke(h hVar) {
            C6496s.h(hVar, "it");
            return hVar.iterator();
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f64998a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6787a aVar) {
            super(1);
            this.f64998a = aVar;
        }

        public final Object invoke(Object obj) {
            C6496s.h(obj, "it");
            return this.f64998a.invoke();
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f64999a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(0);
            this.f64999a = obj;
        }

        public final Object invoke() {
            return this.f64999a;
        }
    }

    public static h c(Iterator it) {
        C6496s.h(it, "<this>");
        return k.d(new a(it));
    }

    public static h d(h hVar) {
        C6496s.h(hVar, "<this>");
        if (hVar instanceof a) {
            return hVar;
        }
        return new a(hVar);
    }

    public static h e() {
        return d.f64970a;
    }

    public static final h f(h hVar) {
        C6496s.h(hVar, "<this>");
        return g(hVar, b.f64996a);
    }

    private static final h g(h hVar, C6798l lVar) {
        if (hVar instanceof t) {
            return ((t) hVar).e(lVar);
        }
        return new f(hVar, c.f64997a, lVar);
    }

    public static h h(Object obj, C6798l lVar) {
        C6496s.h(lVar, "nextFunction");
        if (obj == null) {
            return d.f64970a;
        }
        return new g(new e(obj), lVar);
    }

    public static h i(C6787a aVar) {
        C6496s.h(aVar, "nextFunction");
        return k.d(new g(aVar, new d(aVar)));
    }

    public static h j(Object... objArr) {
        C6496s.h(objArr, "elements");
        return C6559l.S(objArr);
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f64997a = new c();

        c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
