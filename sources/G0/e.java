package g0;

import Y.B0;
import Y.C1517v;
import Y.C1525z;
import Y.G1;
import d0.C1900d;
import d0.C1902f;
import d0.C1916t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e extends C1900d implements B0 {

    /* renamed from: g  reason: collision with root package name */
    public static final b f20857g = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final e f20858h;

    public static final class a extends C1902f implements B0.a {

        /* renamed from: g  reason: collision with root package name */
        private e f20859g;

        public a(e eVar) {
            super(eVar);
            this.f20859g = eVar;
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof C1517v)) {
                return false;
            }
            return t((C1517v) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof G1)) {
                return false;
            }
            return u((G1) obj);
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof C1517v)) {
                return null;
            }
            return v((C1517v) obj);
        }

        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof C1517v)) {
                return obj2;
            }
            return w((C1517v) obj, (G1) obj2);
        }

        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof C1517v)) {
                return null;
            }
            return x((C1517v) obj);
        }

        /* renamed from: s */
        public e g() {
            e eVar;
            if (k() == this.f20859g.s()) {
                eVar = this.f20859g;
            } else {
                q(new f0.e());
                eVar = new e(k(), size());
            }
            this.f20859g = eVar;
            return eVar;
        }

        public /* bridge */ boolean t(C1517v vVar) {
            return super.containsKey(vVar);
        }

        public /* bridge */ boolean u(G1 g12) {
            return super.containsValue(g12);
        }

        public /* bridge */ G1 v(C1517v vVar) {
            return (G1) super.get(vVar);
        }

        public /* bridge */ G1 w(C1517v vVar, G1 g12) {
            return (G1) super.getOrDefault(vVar, g12);
        }

        public /* bridge */ G1 x(C1517v vVar) {
            return (G1) super.remove(vVar);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f20858h;
        }

        private b() {
        }
    }

    static {
        C1916t a10 = C1916t.f19425e.a();
        C6496s.f(a10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f20858h = new e(a10, 0);
    }

    public e(C1916t tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ boolean A(G1 g12) {
        return super.containsValue(g12);
    }

    public /* bridge */ G1 B(C1517v vVar) {
        return (G1) super.get(vVar);
    }

    public /* bridge */ G1 C(C1517v vVar, G1 g12) {
        return (G1) super.getOrDefault(vVar, g12);
    }

    public Object a(C1517v vVar) {
        return C1525z.b(this, vVar);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C1517v)) {
            return false;
        }
        return z((C1517v) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof G1)) {
            return false;
        }
        return A((G1) obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C1517v)) {
            return null;
        }
        return B((C1517v) obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C1517v)) {
            return obj2;
        }
        return C((C1517v) obj, (G1) obj2);
    }

    public B0 m(C1517v vVar, G1 g12) {
        C1916t.b P10 = s().P(vVar.hashCode(), vVar, g12, 0);
        if (P10 == null) {
            return this;
        }
        return new e(P10.a(), size() + P10.b());
    }

    /* renamed from: x */
    public a builder() {
        return new a(this);
    }

    public /* bridge */ boolean z(C1517v vVar) {
        return super.containsKey(vVar);
    }
}
