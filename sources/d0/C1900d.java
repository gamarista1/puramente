package d0;

import b0.C1864b;
import b0.C1866d;
import d0.C1916t;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6551d;
import zf.C6828a;

/* renamed from: d0.d  reason: case insensitive filesystem */
public class C1900d extends C6551d implements Map, C6828a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19400d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19401e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C1900d f19402f = new C1900d(C1916t.f19425e.a(), 0);

    /* renamed from: b  reason: collision with root package name */
    private final C1916t f19403b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19404c;

    /* renamed from: d0.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1900d a() {
            C1900d o10 = C1900d.f19402f;
            C6496s.f(o10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return o10;
        }

        private a() {
        }
    }

    public C1900d(C1916t tVar, int i10) {
        this.f19403b = tVar;
        this.f19404c = i10;
    }

    private final C1866d q() {
        return new C1910n(this);
    }

    public boolean containsKey(Object obj) {
        int i10;
        C1916t tVar = this.f19403b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.k(i10, obj, 0);
    }

    public final Set e() {
        return q();
    }

    public Object get(Object obj) {
        int i10;
        C1916t tVar = this.f19403b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.o(i10, obj, 0);
    }

    public int j() {
        return this.f19404c;
    }

    /* renamed from: r */
    public C1866d g() {
        return new C1912p(this);
    }

    public final C1916t s() {
        return this.f19403b;
    }

    /* renamed from: t */
    public C1864b k() {
        return new C1914r(this);
    }

    public C1900d u(Object obj, Object obj2) {
        int i10;
        C1916t tVar = this.f19403b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        C1916t.b P10 = tVar.P(i10, obj, obj2, 0);
        if (P10 == null) {
            return this;
        }
        return new C1900d(P10.a(), size() + P10.b());
    }

    public C1900d v(Object obj) {
        int i10;
        C1916t tVar = this.f19403b;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        C1916t Q10 = tVar.Q(i10, obj, 0);
        if (this.f19403b == Q10) {
            return this;
        }
        if (Q10 == null) {
            return f19400d.a();
        }
        return new C1900d(Q10, size() - 1);
    }
}
