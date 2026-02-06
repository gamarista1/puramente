package X6;

import X5.a;
import X5.h;
import X5.i;
import android.util.Log;
import java.io.Closeable;

/* renamed from: X6.a  reason: case insensitive filesystem */
public class C3078a {

    /* renamed from: a  reason: collision with root package name */
    private final a.c f35126a;

    /* renamed from: X6.a$a  reason: collision with other inner class name */
    class C0568a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Z6.a f35127a;

        C0568a(Z6.a aVar) {
            this.f35127a = aVar;
        }

        public boolean a() {
            return this.f35127a.b();
        }

        public void b(i iVar, Throwable th2) {
            String str;
            this.f35127a.a(iVar, th2);
            Object f10 = iVar.f();
            if (f10 != null) {
                str = f10.getClass().getName();
            } else {
                str = "<value is null>";
            }
            U5.a.K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), str, C3078a.d(th2));
        }
    }

    public C3078a(Z6.a aVar) {
        this.f35126a = new C0568a(aVar);
    }

    /* access modifiers changed from: private */
    public static String d(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        return Log.getStackTraceString(th2);
    }

    public a b(Closeable closeable) {
        return a.V(closeable, this.f35126a);
    }

    public a c(Object obj, h hVar) {
        return a.j0(obj, hVar, this.f35126a);
    }
}
