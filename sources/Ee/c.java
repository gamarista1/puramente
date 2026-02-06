package ee;

import Ff.g;
import Gf.e;
import ae.C4465b;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import ie.C5031a;
import ie.r;
import kotlin.Pair;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import le.d;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import qe.C5155b;
import qe.C5157d;
import qe.V;
import qe.W;
import yf.C6787a;
import yf.p;

public final class c extends d {

    /* renamed from: i  reason: collision with root package name */
    private final String f60103i;

    /* renamed from: j  reason: collision with root package name */
    private final Ff.d f60104j;

    /* renamed from: k  reason: collision with root package name */
    private final C5155b f60105k;

    /* renamed from: l  reason: collision with root package name */
    private r f60106l;

    /* synthetic */ class a extends C6494p implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60107a = new a();

        a() {
            super(2, SharedObject.class, "onStartListeningToEvent", "onStartListeningToEvent(Ljava/lang/String;)V", 0);
        }

        public final void i(SharedObject sharedObject, String str) {
            C6496s.h(sharedObject, "p0");
            C6496s.h(str, "p1");
            sharedObject.y(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            i((SharedObject) obj, (String) obj2);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class b extends C6494p implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60108a = new b();

        b() {
            super(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);
        }

        public final void i(SharedObject sharedObject, String str) {
            C6496s.h(sharedObject, "p0");
            C6496s.h(str, "p1");
            sharedObject.E(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            i((SharedObject) obj, (String) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: ee.c$c  reason: collision with other inner class name */
    public static final class C0881c implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0881c f60109a = new C0881c();

        /* renamed from: a */
        public final Ff.p invoke() {
            return O.m(String.class);
        }
    }

    public c(String str, Ff.d dVar, C5155b bVar) {
        C6496s.h(str, "name");
        C6496s.h(dVar, "ownerClass");
        C6496s.h(bVar, "ownerType");
        this.f60103i = str;
        this.f60104j = dVar;
        this.f60105k = bVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M r(g gVar, Object[] objArr) {
        C6496s.h(objArr, "<destruct>");
        ((p) gVar).invoke(objArr[0], objArr[1]);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M s(Object[] objArr) {
        C6496s.h(objArr, "it");
        return C6514M.f71813a;
    }

    public final d q() {
        boolean z10;
        boolean z11;
        Class<C6514M> cls = C6514M.class;
        boolean c10 = C6496s.c(this.f60104j, O.b(cls));
        if (c10 || !e.j(this.f60104j, O.b(SharedObject.class))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (c10 || !e.j(this.f60104j, O.b(SharedRef.class))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (l() != null && z10) {
            for (Pair pair : C6565s.q(C6502A.a("__expo_onStartListeningToEvent", a.f60107a), C6502A.a("__expo_onStopListeningToEvent", b.f60108a))) {
                String str = (String) pair.a();
                g gVar = (g) pair.b();
                C5155b bVar = this.f60105k;
                Class<String> cls2 = String.class;
                C5155b bVar2 = (C5155b) C5157d.f61437a.a().get(new Pair(O.b(cls2), Boolean.FALSE));
                if (bVar2 == null) {
                    bVar2 = new C5155b(new qe.O(O.b(cls2), false, C0881c.f60109a));
                }
                C5155b[] bVarArr = {bVar, bVar2};
                W w10 = W.f61408a;
                V v10 = (V) w10.a().get(O.b(cls));
                if (v10 == null) {
                    v10 = new V(O.b(cls));
                    w10.a().put(O.b(cls), v10);
                }
                r rVar = new r(str, bVarArr, v10, new C4954a(gVar));
                rVar.c(false);
                n().put(str, rVar);
            }
        }
        le.e i10 = i();
        C4465b d10 = i10.d();
        while (d10.hasNext()) {
            C5031a aVar = (C5031a) d10.next();
            aVar.k(this.f60105k.f());
            aVar.j(true);
        }
        if (c10 || this.f60106l != null || z11) {
            r rVar2 = this.f60106l;
            if (rVar2 == null) {
                C5155b[] bVarArr2 = new C5155b[0];
                W w11 = W.f61408a;
                V v11 = (V) w11.a().get(O.b(cls));
                if (v11 == null) {
                    v11 = new V(O.b(cls));
                    w11.a().put(O.b(cls), v11);
                }
                rVar2 = new r("constructor", bVarArr2, v11, new b());
            }
            rVar2.j(true);
            rVar2.k(this.f60105k.f());
            return new d(this.f60103i, rVar2, i10, z11);
        }
        throw new IllegalArgumentException("constructor cannot be null");
    }

    public final C5155b t() {
        return this.f60105k;
    }

    public final void u(r rVar) {
        this.f60106l = rVar;
    }
}
