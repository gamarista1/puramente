package Pf;

import com.amazon.a.a.n.a.a.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;
import zf.C6828a;

public interface h extends Iterable, C6828a {

    /* renamed from: L  reason: collision with root package name */
    public static final a f64602L = a.f64603a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f64603a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final h f64604b = new C0947a();

        /* renamed from: Pf.h$a$a  reason: collision with other inner class name */
        public static final class C0947a implements h {
            C0947a() {
            }

            public Void a(c cVar) {
                C6496s.h(cVar, "fqName");
                return null;
            }

            public /* bridge */ /* synthetic */ c i(c cVar) {
                return (c) a(cVar);
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator iterator() {
                return C6565s.n().iterator();
            }

            public boolean n0(c cVar) {
                return b.b(this, cVar);
            }

            public String toString() {
                return g.f37322a;
            }
        }

        private a() {
        }

        public final h a(List list) {
            C6496s.h(list, "annotations");
            if (list.isEmpty()) {
                return f64604b;
            }
            return new i(list);
        }

        public final h b() {
            return f64604b;
        }
    }

    public static final class b {
        public static c a(h hVar, c cVar) {
            Object obj;
            C6496s.h(cVar, "fqName");
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C6496s.c(((c) obj).f(), cVar)) {
                    break;
                }
            }
            return (c) obj;
        }

        public static boolean b(h hVar, c cVar) {
            C6496s.h(cVar, "fqName");
            if (hVar.i(cVar) != null) {
                return true;
            }
            return false;
        }
    }

    c i(c cVar);

    boolean isEmpty();

    boolean n0(c cVar);
}
