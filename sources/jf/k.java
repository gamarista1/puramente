package Jf;

import Jf.h;
import Jf.i;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;

public abstract class k implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Method f63816a;

    /* renamed from: b  reason: collision with root package name */
    private final List f63817b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f63818c;

    public static final class a extends k implements g {

        /* renamed from: d  reason: collision with root package name */
        private final Object f63819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, C6565s.n(), (DefaultConstructorMarker) null);
            C6496s.h(method, "unboxMethod");
            this.f63819d = obj;
        }

        public Object call(Object[] objArr) {
            C6496s.h(objArr, "args");
            c(objArr);
            return b(this.f63819d, objArr);
        }
    }

    public static final class b extends k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, C6565s.e(method.getDeclaringClass()), (DefaultConstructorMarker) null);
            C6496s.h(method, "unboxMethod");
        }

        public Object call(Object[] objArr) {
            Object[] objArr2;
            C6496s.h(objArr, "args");
            c(objArr);
            Object obj = objArr[0];
            i.d dVar = i.f63802e;
            if (objArr.length <= 1) {
                objArr2 = new Object[0];
            } else {
                objArr2 = C6559l.s(objArr, 1, objArr.length);
            }
            return b(obj, objArr2);
        }
    }

    public /* synthetic */ k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    public final List a() {
        return this.f63817b;
    }

    /* access modifiers changed from: protected */
    public final Object b(Object obj, Object[] objArr) {
        C6496s.h(objArr, "args");
        return this.f63816a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    /* renamed from: d */
    public final Method getMember() {
        return null;
    }

    public final Type getReturnType() {
        return this.f63818c;
    }

    private k(Method method, List list) {
        this.f63816a = method;
        this.f63817b = list;
        Class<?> returnType = method.getReturnType();
        C6496s.g(returnType, "getReturnType(...)");
        this.f63818c = returnType;
    }
}
