package Vg;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.v;
import lf.w;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f65431a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        e eVar = null;
        try {
            v.a aVar = v.f71841b;
            obj = v.b(new d(a(Looper.getMainLooper(), true), (String) null, 2, (DefaultConstructorMarker) null));
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (!v.g(obj)) {
            eVar = obj;
        }
        f65431a = eVar;
    }

    public static final Handler a(Looper looper, boolean z10) {
        if (!z10) {
            return new Handler(looper);
        }
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            C6496s.f(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final e b(Handler handler, String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ e c(Handler handler, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return b(handler, str);
    }
}
