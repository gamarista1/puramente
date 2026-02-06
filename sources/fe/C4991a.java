package fe;

import ae.m;
import android.app.Activity;
import com.facebook.react.C3448z;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.r;
import expo.modules.kotlin.views.n;
import ie.C5036f;
import ie.C5037g;
import ie.C5039i;
import ie.C5040j;
import ie.k;
import ie.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import qe.C5155b;
import qe.C5157d;
import qe.V;
import qe.W;
import ue.a;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe/a;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: fe.a  reason: case insensitive filesystem */
public final class C4991a extends ke.b {

    /* renamed from: fe.a$a  reason: collision with other inner class name */
    public static final class C0888a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4991a f60547a;

        public C0888a(C4991a aVar) {
            this.f60547a = aVar;
        }

        public final void a(Object[] objArr, ae.p pVar) {
            r rVar;
            C3448z G10;
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = (String) pVar;
            Activity v10 = this.f60547a.c().v();
            if (v10 instanceof r) {
                rVar = (r) v10;
            } else {
                rVar = null;
            }
            if (rVar != null && (G10 = rVar.G()) != null) {
                G10.v();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (ae.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: fe.a$b */
    public static final class b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60548a = new b();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    /* renamed from: fe.a$c */
    public static final class c implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4991a f60549a;

        public c(C4991a aVar) {
            this.f60549a = aVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            r rVar;
            C3448z G10;
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            Activity v10 = this.f60549a.c().v();
            if (v10 instanceof r) {
                rVar = (r) v10;
            } else {
                rVar = null;
            }
            if (!(rVar == null || (G10 = rVar.G()) == null)) {
                G10.v();
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: fe.a$d */
    public static final class d implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f60550a = new d();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    /* renamed from: fe.a$e */
    public static final class e implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f60551a = new e();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    /* renamed from: fe.a$f */
    public static final class f implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            String str2 = objArr[1];
            String str3 = str;
            try {
                UUID fromString = UUID.fromString(str2);
                C6496s.e(fromString);
                return ue.b.b(fromString, str3).toString();
            } catch (IllegalArgumentException unused) {
                throw new a(str2);
            }
        }
    }

    /* renamed from: fe.a$g */
    public static final class g implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f60552a = new g();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    /* renamed from: fe.a$h */
    public static final class h implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4991a f60553a;

        public h(C4991a aVar) {
            this.f60553a = aVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            n h10;
            String[] a10;
            C6496s.h(objArr, "<destruct>");
            m t10 = this.f60553a.e().h().t(objArr[0]);
            LinkedHashMap linkedHashMap = null;
            if (t10 == null || (h10 = t10.e().h()) == null) {
                return null;
            }
            Iterable keySet = h10.f().keySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(Ef.m.d(mf.O.e(C6565s.y(keySet, 10)), 16));
            for (Object next : keySet) {
                String str = (String) next;
                linkedHashMap2.put(next, Boolean.TRUE);
            }
            expo.modules.kotlin.views.b c10 = h10.c();
            if (!(c10 == null || (a10 = c10.a()) == null)) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(Ef.m.d(mf.O.e(a10.length), 16));
                for (String str2 : a10) {
                    Pair a11 = C6502A.a(ge.i.a(str2), mf.O.f(C6502A.a("registrationName", str2)));
                    linkedHashMap3.put(a11.c(), a11.d());
                }
                linkedHashMap = linkedHashMap3;
            }
            return mf.O.l(C6502A.a("validAttributes", linkedHashMap2), C6502A.a("directEventTypes", linkedHashMap));
        }
    }

    /* renamed from: fe.a$i */
    public static final class i implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return UUID.randomUUID().toString();
        }
    }

    public ke.d b() {
        Object obj;
        Object fVar;
        Class<Map> cls = Map.class;
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            ke.c cVar = new ke.c(this);
            C5155b[] bVarArr = new C5155b[0];
            W w10 = W.f61408a;
            V v10 = (V) w10.a().get(O.b(cls2));
            if (v10 == null) {
                v10 = new V(O.b(cls2));
                w10.a().put(O.b(cls2), v10);
            }
            cVar.n().put("uuidv4", new ie.r("uuidv4", bVarArr, v10, new i()));
            C5157d dVar = C5157d.f61437a;
            Ff.d b10 = O.b(cls3);
            Boolean bool = Boolean.FALSE;
            C5155b bVar = (C5155b) dVar.a().get(new Pair(b10, bool));
            if (bVar == null) {
                bVar = new C5155b(new qe.O(O.b(cls3), false, d.f60550a));
            }
            C5155b bVar2 = (C5155b) dVar.a().get(new Pair(O.b(cls3), bool));
            if (bVar2 == null) {
                bVar2 = new C5155b(new qe.O(O.b(cls3), false, e.f60551a));
            }
            C5155b[] bVarArr2 = {bVar, bVar2};
            V v11 = (V) w10.a().get(O.b(cls3));
            if (v11 == null) {
                v11 = new V(O.b(cls3));
                w10.a().put(O.b(cls3), v11);
            }
            cVar.n().put("uuidv5", new ie.r("uuidv5", bVarArr2, v11, new f()));
            C5155b bVar3 = (C5155b) dVar.a().get(new Pair(O.b(cls3), bool));
            if (bVar3 == null) {
                bVar3 = new C5155b(new qe.O(O.b(cls3), false, g.f60552a));
            }
            C5155b[] bVarArr3 = {bVar3};
            V v12 = (V) w10.a().get(O.b(cls));
            if (v12 == null) {
                v12 = new V(O.b(cls));
                w10.a().put(O.b(cls), v12);
            }
            cVar.n().put("getViewConfig", new ie.r("getViewConfig", bVarArr3, v12, new h(this)));
            if (C6496s.c(cls3, ae.p.class)) {
                obj = new C5037g("reloadAppAsync", new C5155b[0], new C0888a(this));
            } else {
                C5155b bVar4 = (C5155b) dVar.a().get(new Pair(O.b(cls3), bool));
                if (bVar4 == null) {
                    bVar4 = new C5155b(new qe.O(O.b(cls3), false, b.f60548a));
                }
                C5155b[] bVarArr4 = {bVar4};
                c cVar2 = new c(this);
                Class<C6514M> cls4 = C6514M.class;
                if (C6496s.c(cls4, Integer.TYPE)) {
                    fVar = new l("reloadAppAsync", bVarArr4, cVar2);
                } else if (C6496s.c(cls4, Boolean.TYPE)) {
                    fVar = new C5039i("reloadAppAsync", bVarArr4, cVar2);
                } else if (C6496s.c(cls4, Double.TYPE)) {
                    fVar = new C5040j("reloadAppAsync", bVarArr4, cVar2);
                } else if (C6496s.c(cls4, Float.TYPE)) {
                    fVar = new k("reloadAppAsync", bVarArr4, cVar2);
                } else if (C6496s.c(cls4, cls3)) {
                    fVar = new ie.n("reloadAppAsync", bVarArr4, cVar2);
                } else {
                    fVar = new C5036f("reloadAppAsync", bVarArr4, cVar2);
                }
                obj = fVar;
            }
            cVar.k().put("reloadAppAsync", obj);
            ke.d p10 = cVar.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
