package oe;

import ae.u;
import ae.w;
import expo.modules.kotlin.exception.e;
import expo.modules.kotlin.exception.o;
import expo.modules.kotlin.exception.y;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f61208a;

    /* renamed from: b  reason: collision with root package name */
    private int f61209b = c.b(1);

    /* renamed from: c  reason: collision with root package name */
    private Map f61210c = new LinkedHashMap();

    public d(u uVar) {
        C6496s.h(uVar, "runtimeContext");
        this.f61208a = w.a(uVar);
    }

    private final int c(int i10) {
        if (this.f61210c.containsKey(c.a(i10)) || i10 == 0 || i10 >= this.f61209b) {
            return i10;
        }
        throw new y();
    }

    private final int d() {
        int i10;
        synchronized (this) {
            i10 = this.f61209b;
            this.f61209b = c.b(i10 + 1);
        }
        return i10;
    }

    public final int a(SharedObject sharedObject, JavaScriptObject javaScriptObject) {
        C6496s.h(sharedObject, "native");
        C6496s.h(javaScriptObject, "js");
        int d10 = d();
        sharedObject.I(d10);
        JavaScriptObject.h(javaScriptObject, "__expo_shared_object_id__", d10, (List) null, 4, (Object) null);
        u uVar = (u) this.f61208a.get();
        if (uVar != null) {
            uVar.f().setNativeStateForSharedObject(d10, javaScriptObject);
            int f10 = sharedObject.f();
            if (f10 > 0) {
                javaScriptObject.setExternalMemoryPressure(f10);
            }
            if (sharedObject instanceof SharedRef) {
                JavaScriptObject.i(javaScriptObject, "nativeRefType", ((SharedRef) sharedObject).Q(), (List) null, 4, (Object) null);
            }
            JavaScriptWeakObject createWeak = javaScriptObject.createWeak();
            synchronized (this) {
                this.f61210c.put(c.a(d10), C6502A.a(sharedObject, createWeak));
                C6514M m10 = C6514M.f71813a;
            }
            if (sharedObject.t().get() == null) {
                sharedObject.F(w.a(uVar));
            }
            return d10;
        }
        throw new e();
    }

    public final void b(int i10) {
        Pair pair;
        synchronized (this) {
            pair = (Pair) this.f61210c.remove(c.a(i10));
        }
        if (pair != null) {
            SharedObject sharedObject = (SharedObject) pair.a();
            sharedObject.I(c.b(0));
            sharedObject.M();
        }
    }

    public final JavaScriptObject e(SharedObject sharedObject) {
        JavaScriptObject javaScriptObject;
        JavaScriptWeakObject javaScriptWeakObject;
        C6496s.h(sharedObject, "native");
        synchronized (this) {
            Pair pair = (Pair) this.f61210c.get(c.a(sharedObject.v()));
            if (pair == null || (javaScriptWeakObject = (JavaScriptWeakObject) pair.d()) == null) {
                javaScriptObject = null;
            } else {
                javaScriptObject = javaScriptWeakObject.lock();
            }
        }
        return javaScriptObject;
    }

    public final SharedObject f(int i10) {
        SharedObject sharedObject;
        Pair pair = (Pair) this.f61210c.get(c.a(c(i10)));
        if (pair != null) {
            sharedObject = (SharedObject) pair.c();
        } else {
            sharedObject = null;
        }
        if (sharedObject != null) {
            return sharedObject;
        }
        throw new o();
    }

    public final SharedObject g(int i10) {
        SharedObject sharedObject;
        synchronized (this) {
            Pair pair = (Pair) this.f61210c.get(c.a(i10));
            if (pair != null) {
                sharedObject = (SharedObject) pair.c();
            } else {
                sharedObject = null;
            }
        }
        return sharedObject;
    }

    public final JavaScriptWeakObject h(SharedObject sharedObject) {
        JavaScriptWeakObject javaScriptWeakObject;
        C6496s.h(sharedObject, "nativeObject");
        synchronized (this) {
            Pair pair = (Pair) this.f61210c.get(c.a(sharedObject.v()));
            if (pair != null) {
                javaScriptWeakObject = (JavaScriptWeakObject) pair.d();
            } else {
                javaScriptWeakObject = null;
            }
        }
        return javaScriptWeakObject;
    }
}
