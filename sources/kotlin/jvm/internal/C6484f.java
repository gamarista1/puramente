package kotlin.jvm.internal;

import Ff.c;
import Ff.f;
import Ff.k;
import Ff.p;
import Ff.q;
import Ff.t;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import xf.C6782b;

/* renamed from: kotlin.jvm.internal.f  reason: case insensitive filesystem */
public abstract class C6484f implements c, Serializable {
    public static final Object NO_RECEIVER = a.f71778a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient c reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.f$a */
    private static class a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final a f71778a = new a();

        private a() {
        }

        private Object readResolve() {
            return f71778a;
        }
    }

    public C6484f() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public c compute() {
        c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract c computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return O.c(cls);
        }
        return O.b(cls);
    }

    public List<k> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public c getReflected() {
        c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C6782b();
    }

    public p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<q> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public t getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    protected C6484f(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C6484f(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
