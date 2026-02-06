package d0;

import f0.C1958b;
import f0.e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6554g;
import zf.C6832e;

/* renamed from: d0.f  reason: case insensitive filesystem */
public abstract class C1902f extends C6554g implements Map, C6832e {

    /* renamed from: a  reason: collision with root package name */
    private C1900d f19408a;

    /* renamed from: b  reason: collision with root package name */
    private e f19409b = new e();

    /* renamed from: c  reason: collision with root package name */
    private C1916t f19410c = this.f19408a.s();

    /* renamed from: d  reason: collision with root package name */
    private Object f19411d;

    /* renamed from: e  reason: collision with root package name */
    private int f19412e;

    /* renamed from: f  reason: collision with root package name */
    private int f19413f = this.f19408a.size();

    public C1902f(C1900d dVar) {
        this.f19408a = dVar;
    }

    public Set a() {
        return new C1904h(this);
    }

    public Set b() {
        return new C1906j(this);
    }

    public int c() {
        return this.f19413f;
    }

    public void clear() {
        C1916t a10 = C1916t.f19425e.a();
        C6496s.f(a10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f19410c = a10;
        r(0);
    }

    public boolean containsKey(Object obj) {
        int i10;
        C1916t tVar = this.f19410c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.k(i10, obj, 0);
    }

    public Collection e() {
        return new C1908l(this);
    }

    public abstract C1900d g();

    public Object get(Object obj) {
        int i10;
        C1916t tVar = this.f19410c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.o(i10, obj, 0);
    }

    public final int j() {
        return this.f19412e;
    }

    public final C1916t k() {
        return this.f19410c;
    }

    public final e l() {
        return this.f19409b;
    }

    public final void n(int i10) {
        this.f19412e = i10;
    }

    public final void o(Object obj) {
        this.f19411d = obj;
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        this.f19411d = null;
        C1916t tVar = this.f19410c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        this.f19410c = tVar.D(i10, obj, obj2, 0, this);
        return this.f19411d;
    }

    public void putAll(Map map) {
        C1900d dVar;
        C1902f fVar;
        if (map instanceof C1900d) {
            dVar = (C1900d) map;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            if (map instanceof C1902f) {
                fVar = (C1902f) map;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                dVar = fVar.g();
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            C1958b bVar = new C1958b(0, 1, (DefaultConstructorMarker) null);
            int size = size();
            C1916t tVar = this.f19410c;
            C1916t s10 = dVar.s();
            C6496s.f(s10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f19410c = tVar.E(s10, 0, bVar, this);
            int size2 = (dVar.size() + size) - bVar.a();
            if (size != size2) {
                r(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    /* access modifiers changed from: protected */
    public final void q(e eVar) {
        this.f19409b = eVar;
    }

    public void r(int i10) {
        this.f19413f = i10;
        this.f19412e++;
    }

    public Object remove(Object obj) {
        this.f19411d = null;
        C1916t G10 = this.f19410c.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (G10 == null) {
            G10 = C1916t.f19425e.a();
            C6496s.f(G10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f19410c = G10;
        return this.f19411d;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C1916t H10 = this.f19410c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H10 == null) {
            H10 = C1916t.f19425e.a();
            C6496s.f(H10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f19410c = H10;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
