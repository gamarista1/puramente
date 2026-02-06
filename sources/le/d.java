package le;

import com.facebook.react.bridge.BaseJavaModule;
import ge.f;
import ie.C5035e;
import ie.C5036f;
import ie.C5037g;
import ie.C5039i;
import ie.C5040j;
import ie.k;
import ie.l;
import ie.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6514M;
import qe.C5155b;
import qe.C5157d;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private C6787a f61039a = new c();

    /* renamed from: b  reason: collision with root package name */
    private f f61040b;

    /* renamed from: c  reason: collision with root package name */
    private Map f61041c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map f61042d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map f61043e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private Map f61044f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map f61045g = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final List f61046h = new ArrayList();

    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f61047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f61048b;

        public a(d dVar, a aVar) {
            this.f61047a = dVar;
            this.f61048b = aVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = (String) pVar;
            Iterator it = this.f61047a.f61046h.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.c.a(it.next());
                throw null;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f61049a = new b();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    public static final class c implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f61050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f61051b;

        public c(d dVar, a aVar) {
            this.f61050a = dVar;
            this.f61051b = aVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            Iterator it = this.f61050a.f61046h.iterator();
            if (!it.hasNext()) {
                return C6514M.f71813a;
            }
            android.support.v4.media.session.c.a(it.next());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final Map f(Pair[] pairArr) {
        return mf.O.z(pairArr);
    }

    /* access modifiers changed from: private */
    public static final Map j() {
        return mf.O.i();
    }

    public final C5035e c(String str) {
        C6496s.h(str, "name");
        C5035e eVar = new C5035e(str);
        this.f61044f.put(str, eVar);
        return eVar;
    }

    public final void d(C6787a aVar) {
        C6496s.h(aVar, "constantsProvider");
        this.f61039a = aVar;
    }

    public final void e(Pair... pairArr) {
        C6496s.h(pairArr, "constants");
        this.f61039a = new b(pairArr);
    }

    public final void g(String... strArr) {
        C6496s.h(strArr, "events");
        this.f61040b = new f(strArr);
    }

    public final e i() {
        Object obj;
        Object fVar;
        for (a aVar : a.b()) {
            if (!this.f61043e.containsKey(aVar.c())) {
                String c10 = aVar.c();
                Class<String> cls = String.class;
                if (C6496s.c(cls, ae.p.class)) {
                    obj = new C5037g(c10, new C5155b[0], new a(this, aVar));
                } else {
                    C5157d dVar = C5157d.f61437a;
                    C5155b bVar = (C5155b) dVar.a().get(new Pair(O.b(cls), Boolean.FALSE));
                    if (bVar == null) {
                        bVar = new C5155b(new qe.O(O.b(cls), false, b.f61049a));
                    }
                    C5155b[] bVarArr = {bVar};
                    c cVar = new c(this, aVar);
                    Class<C6514M> cls2 = C6514M.class;
                    if (C6496s.c(cls2, Integer.TYPE)) {
                        fVar = new l(c10, bVarArr, cVar);
                    } else if (C6496s.c(cls2, Boolean.TYPE)) {
                        fVar = new C5039i(c10, bVarArr, cVar);
                    } else if (C6496s.c(cls2, Double.TYPE)) {
                        fVar = new C5040j(c10, bVarArr, cVar);
                    } else if (C6496s.c(cls2, Float.TYPE)) {
                        fVar = new k(c10, bVarArr, cVar);
                    } else if (C6496s.c(cls2, cls)) {
                        fVar = new n(c10, bVarArr, cVar);
                    } else {
                        fVar = new C5036f(c10, bVarArr, cVar);
                    }
                    obj = fVar;
                }
                k().put(c10, obj);
            }
        }
        Map map = this.f61043e;
        Map map2 = this.f61044f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mf.O.e(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C5035e) entry.getValue()).a());
        }
        Map B10 = mf.O.B(mf.O.p(map, linkedHashMap));
        C6787a aVar2 = this.f61039a;
        Map map3 = this.f61041c;
        Map map4 = this.f61042d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mf.O.e(map4.size()));
        Iterator it = map4.entrySet().iterator();
        if (!it.hasNext()) {
            Map p10 = mf.O.p(map3, linkedHashMap2);
            f fVar2 = this.f61040b;
            Map map5 = this.f61045g;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(mf.O.e(map5.size()));
            for (Map.Entry entry2 : map5.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), ((i) entry2.getValue()).a());
            }
            return new e(aVar2, p10, B10, fVar2, linkedHashMap3);
        }
        Map.Entry entry3 = (Map.Entry) it.next();
        entry3.getKey();
        android.support.v4.media.session.c.a(entry3.getValue());
        throw null;
    }

    public final Map k() {
        return this.f61043e;
    }

    public final f l() {
        return this.f61040b;
    }

    public final Map m() {
        return this.f61045g;
    }

    public final Map n() {
        return this.f61041c;
    }
}
