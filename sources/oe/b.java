package oe;

import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private Map f61206a = new LinkedHashMap();

    /* access modifiers changed from: private */
    public static final C6514M c(b bVar, Class cls) {
        bVar.d(cls);
        return C6514M.f71813a;
    }

    private final void d(Class cls) {
        this.f61206a.remove(cls);
    }

    public final void b(Class cls, JavaScriptObject javaScriptObject) {
        C6496s.h(cls, "native");
        C6496s.h(javaScriptObject, "js");
        javaScriptObject.d(new a(this, cls));
        this.f61206a.put(cls, javaScriptObject);
    }

    public final JavaScriptObject e(Class cls) {
        C6496s.h(cls, "native");
        return (JavaScriptObject) this.f61206a.get(cls);
    }
}
