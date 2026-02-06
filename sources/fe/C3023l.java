package Fe;

import android.util.Log;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.C6496s;

/* renamed from: Fe.l  reason: case insensitive filesystem */
public final class C3023l {

    /* renamed from: a  reason: collision with root package name */
    public static final C3023l f31120a = new C3023l();

    /* renamed from: b  reason: collision with root package name */
    private static a f31121b = a.DEBUG;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f31122c;

    /* renamed from: d  reason: collision with root package name */
    private static De.a f31123d;

    /* renamed from: Fe.l$a */
    public enum a {
        ERROR(1),
        WARN(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f31130a;

        private a(int i10) {
            this.f31130a = i10;
        }

        public final int b() {
            return this.f31130a;
        }
    }

    private C3023l() {
    }

    public static final void a(String str) {
        if (f31122c) {
            C3023l lVar = f31120a;
            if (lVar.i(a.DEBUG) && str != null && str.length() > 0) {
                if (lVar.k()) {
                    De.a aVar = f31123d;
                    if (aVar != null) {
                        aVar.a(str, "DEBUG");
                        return;
                    }
                    return;
                }
                Log.d("BranchSDK", str);
            }
        }
    }

    public static final void b(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (f31122c) {
            C3023l lVar = f31120a;
            if (lVar.i(a.ERROR) && str.length() > 0) {
                if (lVar.k()) {
                    De.a aVar = f31123d;
                    if (aVar != null) {
                        aVar.a(str, "ERROR");
                        return;
                    }
                    return;
                }
                Log.e("BranchSDK", str);
            }
        }
    }

    public static final a c() {
        return f31121b;
    }

    public static final void d(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (f31122c) {
            C3023l lVar = f31120a;
            if (lVar.i(a.INFO) && str.length() > 0) {
                if (lVar.k()) {
                    De.a aVar = f31123d;
                    if (aVar != null) {
                        aVar.a(str, "INFO");
                        return;
                    }
                    return;
                }
                Log.i("BranchSDK", str);
            }
        }
    }

    public static final void e(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (str.length() <= 0) {
            return;
        }
        if (f31120a.k()) {
            De.a aVar = f31123d;
            if (aVar != null) {
                aVar.a(str, "INFO");
                return;
            }
            return;
        }
        Log.i("BranchSDK", str);
    }

    public static final void f(De.a aVar) {
        f31123d = aVar;
    }

    public static final void g(boolean z10) {
        f31122c = z10;
    }

    public static final void h(a aVar) {
        C6496s.h(aVar, "<set-?>");
        f31121b = aVar;
    }

    private final boolean i(a aVar) {
        if (aVar.b() <= f31121b.b()) {
            return true;
        }
        return false;
    }

    public static final String j(Exception exc) {
        C6496s.h(exc, "exception");
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private final boolean k() {
        if (f31123d != null) {
            return true;
        }
        return false;
    }

    public static final void l(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (f31122c) {
            C3023l lVar = f31120a;
            if (lVar.i(a.VERBOSE) && str.length() > 0) {
                if (lVar.k()) {
                    De.a aVar = f31123d;
                    if (aVar != null) {
                        aVar.a(str, "VERBOSE");
                        return;
                    }
                    return;
                }
                Log.v("BranchSDK", str);
            }
        }
    }

    public static final void m(String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (f31122c) {
            C3023l lVar = f31120a;
            if (lVar.i(a.WARN) && str.length() > 0) {
                if (lVar.k()) {
                    De.a aVar = f31123d;
                    if (aVar != null) {
                        aVar.a(str, "WARN");
                        return;
                    }
                    return;
                }
                Log.w("BranchSDK", str);
            }
        }
    }
}
