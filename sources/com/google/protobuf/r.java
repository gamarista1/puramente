package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C4863a;
import com.google.protobuf.C4881t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class r extends C4863a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, r> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected h0 unknownFields = h0.c();

    public static abstract class a extends C4863a.C0867a {

        /* renamed from: a  reason: collision with root package name */
        private final r f58647a;

        /* renamed from: b  reason: collision with root package name */
        protected r f58648b;

        protected a(r rVar) {
            this.f58647a = rVar;
            if (!rVar.I()) {
                this.f58648b = y();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static void x(Object obj, Object obj2) {
            W.a().d(obj).a(obj, obj2);
        }

        private r y() {
            return this.f58647a.P();
        }

        public final r q() {
            r r10 = n();
            if (r10.G()) {
                return r10;
            }
            throw C4863a.C0867a.p(r10);
        }

        /* renamed from: r */
        public r n() {
            if (!this.f58648b.I()) {
                return this.f58648b;
            }
            this.f58648b.J();
            return this.f58648b;
        }

        /* renamed from: s */
        public a clone() {
            a N10 = w().c();
            N10.f58648b = n();
            return N10;
        }

        /* access modifiers changed from: protected */
        public final void t() {
            if (!this.f58648b.I()) {
                u();
            }
        }

        /* access modifiers changed from: protected */
        public void u() {
            r y10 = y();
            x(y10, this.f58648b);
            this.f58648b = y10;
        }

        public r w() {
            return this.f58647a;
        }
    }

    protected static class b extends C4864b {

        /* renamed from: b  reason: collision with root package name */
        private final r f58649b;

        public b(r rVar) {
            this.f58649b = rVar;
        }
    }

    public enum c {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    static r A(Class cls) {
        r rVar = defaultInstanceMap.get(cls);
        if (rVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (rVar == null) {
            rVar = ((r) k0.k(cls)).d();
            if (rVar != null) {
                defaultInstanceMap.put(cls, rVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return rVar;
    }

    static Object F(Method method, Object obj, Object... objArr) {
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

    protected static final boolean H(r rVar, boolean z10) {
        r rVar2;
        byte byteValue = ((Byte) rVar.v(c.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f10 = W.a().d(rVar).f(rVar);
        if (z10) {
            c cVar = c.SET_MEMOIZED_IS_INITIALIZED;
            if (f10) {
                rVar2 = rVar;
            } else {
                rVar2 = null;
            }
            rVar.w(cVar, rVar2);
        }
        return f10;
    }

    protected static C4881t.d L(C4881t.d dVar) {
        int i10;
        int size = dVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return dVar.c(i10);
    }

    protected static C4881t.e M(C4881t.e eVar) {
        int i10;
        int size = eVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return eVar.c(i10);
    }

    protected static Object O(K k10, String str, Object[] objArr) {
        return new Y(k10, str, objArr);
    }

    protected static void Q(Class cls, r rVar) {
        rVar.K();
        defaultInstanceMap.put(cls, rVar);
    }

    private int t(Z z10) {
        if (z10 == null) {
            return W.a().d(this).g(this);
        }
        return z10.g(this);
    }

    protected static C4881t.d y() {
        return C4880s.h();
    }

    protected static C4881t.e z() {
        return X.d();
    }

    /* renamed from: B */
    public final r d() {
        return (r) v(c.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public int C() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    public int D() {
        return this.memoizedSerializedSize & a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        if (C() == 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        return H(this, true);
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void J() {
        W.a().d(this).e(this);
        K();
    }

    /* access modifiers changed from: package-private */
    public void K() {
        this.memoizedSerializedSize &= a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: N */
    public final a c() {
        return (a) v(c.NEW_BUILDER);
    }

    /* access modifiers changed from: package-private */
    public r P() {
        return (r) v(c.NEW_MUTABLE_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void R(int i10) {
        this.memoizedHashCode = i10;
    }

    /* access modifiers changed from: package-private */
    public void S(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public int a() {
        return f((Z) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return W.a().d(this).d(this, (r) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int f(Z z10) {
        if (I()) {
            int t10 = t(z10);
            if (t10 >= 0) {
                return t10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + t10);
        } else if (D() != Integer.MAX_VALUE) {
            return D();
        } else {
            int t11 = t(z10);
            S(t11);
            return t11;
        }
    }

    public int hashCode() {
        if (I()) {
            return s();
        }
        if (E()) {
            R(s());
        }
        return C();
    }

    public void i(C4870h hVar) {
        W.a().d(this).h(this, C4871i.P(hVar));
    }

    /* access modifiers changed from: package-private */
    public Object p() {
        return v(c.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        S(a.e.API_PRIORITY_OTHER);
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return W.a().d(this).c(this);
    }

    public String toString() {
        return M.f(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final a u() {
        return (a) v(c.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object v(c cVar) {
        return x(cVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object w(c cVar, Object obj) {
        return x(cVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object x(c cVar, Object obj, Object obj2);
}
