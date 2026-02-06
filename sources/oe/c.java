package oe;

import ae.u;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f61207a;

    private /* synthetic */ c(int i10) {
        this.f61207a = i10;
    }

    public static final /* synthetic */ c a(int i10) {
        return new c(i10);
    }

    public static boolean c(int i10, Object obj) {
        if ((obj instanceof c) && i10 == ((c) obj).j()) {
            return true;
        }
        return false;
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static final JavaScriptObject e(int i10, u uVar) {
        C6496s.h(uVar, "runtimeContext");
        SharedObject g10 = g(i10, uVar);
        if (g10 == null) {
            return null;
        }
        return uVar.i().e(g10);
    }

    public static final SharedObject f(int i10, u uVar) {
        C6496s.h(uVar, "runtimeContext");
        return uVar.i().f(i10);
    }

    public static final SharedObject g(int i10, u uVar) {
        C6496s.h(uVar, "runtimeContext");
        return uVar.i().g(i10);
    }

    public static String h(int i10) {
        return "SharedObjectId(value=" + i10 + ")";
    }

    public static final JavaScriptWeakObject i(int i10, u uVar) {
        C6496s.h(uVar, "runtimeContext");
        SharedObject g10 = g(i10, uVar);
        if (g10 == null) {
            return null;
        }
        return uVar.i().h(g10);
    }

    public boolean equals(Object obj) {
        return c(this.f61207a, obj);
    }

    public int hashCode() {
        return d(this.f61207a);
    }

    public final /* synthetic */ int j() {
        return this.f61207a;
    }

    public String toString() {
        return h(this.f61207a);
    }

    public static int b(int i10) {
        return i10;
    }
}
