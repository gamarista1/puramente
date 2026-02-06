package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1728a;
import androidx.datastore.preferences.protobuf.C1751y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w  reason: case insensitive filesystem */
public abstract class C1749w extends C1728a {
    private static Map<Object, C1749w> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.e();

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends C1728a.C0289a {

        /* renamed from: a  reason: collision with root package name */
        private final C1749w f16560a;

        /* renamed from: b  reason: collision with root package name */
        protected C1749w f16561b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f16562c = false;

        protected a(C1749w wVar) {
            this.f16560a = wVar;
            this.f16561b = (C1749w) wVar.p(d.NEW_MUTABLE_INSTANCE);
        }

        private void u(C1749w wVar, C1749w wVar2) {
            a0.a().d(wVar).a(wVar, wVar2);
        }

        public final C1749w m() {
            C1749w o10 = n();
            if (o10.x()) {
                return o10;
            }
            throw C1728a.C0289a.l(o10);
        }

        /* renamed from: o */
        public C1749w n() {
            if (this.f16562c) {
                return this.f16561b;
            }
            this.f16561b.z();
            this.f16562c = true;
            return this.f16561b;
        }

        /* renamed from: p */
        public a clone() {
            a B10 = d().c();
            B10.t(n());
            return B10;
        }

        /* access modifiers changed from: protected */
        public void q() {
            if (this.f16562c) {
                C1749w wVar = (C1749w) this.f16561b.p(d.NEW_MUTABLE_INSTANCE);
                u(wVar, this.f16561b);
                this.f16561b = wVar;
                this.f16562c = false;
            }
        }

        /* renamed from: r */
        public C1749w d() {
            return this.f16560a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public a j(C1749w wVar) {
            return t(wVar);
        }

        public a t(C1749w wVar) {
            q();
            u(this.f16561b, wVar);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    protected static class b extends C1729b {

        /* renamed from: b  reason: collision with root package name */
        private final C1749w f16563b;

        public b(C1749w wVar) {
            this.f16563b = wVar;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends C1740m {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static C1751y.b A(C1751y.b bVar) {
        int i10;
        int size = bVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return bVar.c(i10);
    }

    protected static Object C(O o10, String str, Object[] objArr) {
        return new c0(o10, str, objArr);
    }

    protected static C1749w D(C1749w wVar, InputStream inputStream) {
        return m(E(wVar, C1735h.f(inputStream), C1742o.b()));
    }

    static C1749w E(C1749w wVar, C1735h hVar, C1742o oVar) {
        C1749w wVar2 = (C1749w) wVar.p(d.NEW_MUTABLE_INSTANCE);
        try {
            e0 d10 = a0.a().d(wVar2);
            d10.h(wVar2, C1736i.O(hVar), oVar);
            d10.e(wVar2);
            return wVar2;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C1752z) {
                throw ((C1752z) e10.getCause());
            }
            throw new C1752z(e10.getMessage()).i(wVar2);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C1752z) {
                throw ((C1752z) e11.getCause());
            }
            throw e11;
        }
    }

    protected static void F(Class cls, C1749w wVar) {
        defaultInstanceMap.put(cls, wVar);
    }

    private static C1749w m(C1749w wVar) {
        if (wVar == null || wVar.x()) {
            return wVar;
        }
        throw wVar.i().a().i(wVar);
    }

    protected static C1751y.b s() {
        return b0.d();
    }

    static C1749w t(Class cls) {
        C1749w wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (wVar == null) {
            wVar = ((C1749w) p0.i(cls)).d();
            if (wVar != null) {
                defaultInstanceMap.put(cls, wVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return wVar;
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final boolean y(C1749w wVar, boolean z10) {
        C1749w wVar2;
        byte byteValue = ((Byte) wVar.p(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f10 = a0.a().d(wVar).f(wVar);
        if (z10) {
            d dVar = d.SET_MEMOIZED_IS_INITIALIZED;
            if (f10) {
                wVar2 = wVar;
            } else {
                wVar2 = null;
            }
            wVar.q(dVar, wVar2);
        }
        return f10;
    }

    /* renamed from: B */
    public final a c() {
        return (a) p(d.NEW_BUILDER);
    }

    /* renamed from: G */
    public final a g() {
        a aVar = (a) p(d.NEW_BUILDER);
        aVar.t(this);
        return aVar;
    }

    public int a() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = a0.a().d(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d().getClass().isInstance(obj)) {
            return false;
        }
        return a0.a().d(this).d(this, (C1749w) obj);
    }

    public void h(C1737j jVar) {
        a0.a().d(this).i(this, C1738k.P(jVar));
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int c10 = a0.a().d(this).c(this);
        this.memoizedHashCode = c10;
        return c10;
    }

    /* access modifiers changed from: package-private */
    public void j(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* access modifiers changed from: package-private */
    public Object l() {
        return p(d.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    public final a o() {
        return (a) p(d.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object p(d dVar) {
        return r(dVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object q(d dVar, Object obj) {
        return r(dVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object r(d dVar, Object obj, Object obj2);

    public String toString() {
        return Q.e(this, super.toString());
    }

    /* renamed from: u */
    public final C1749w d() {
        return (C1749w) p(d.GET_DEFAULT_INSTANCE);
    }

    public final boolean x() {
        return y(this, true);
    }

    /* access modifiers changed from: protected */
    public void z() {
        a0.a().d(this).e(this);
    }
}
