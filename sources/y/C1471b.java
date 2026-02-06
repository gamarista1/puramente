package Y;

import android.os.Looper;
import android.util.Log;
import i0.q;
import kotlin.Lazy;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import yf.C6787a;

/* renamed from: Y.b  reason: case insensitive filesystem */
public abstract class C1471b {

    /* renamed from: a  reason: collision with root package name */
    private static final Lazy f9929a = C6531o.b(a.f9931a);

    /* renamed from: b  reason: collision with root package name */
    private static final long f9930b;

    /* renamed from: Y.b$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9931a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final C1490h0 invoke() {
            if (Looper.getMainLooper() != null) {
                return G.f9761a;
            }
            return Z0.f9920a;
        }
    }

    static {
        long j10;
        try {
            j10 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j10 = -1;
        }
        f9930b = j10;
    }

    public static final C1503n0 a(float f10) {
        return new C1518v0(f10);
    }

    public static final C1505o0 b(int i10) {
        return new C1520w0(i10);
    }

    public static final C1507p0 c(long j10) {
        return new C1522x0(j10);
    }

    public static final q d(Object obj, o1 o1Var) {
        return new C1524y0(obj, o1Var);
    }

    public static final long e() {
        return f9930b;
    }

    public static final void f(String str, Throwable th2) {
        Log.e("ComposeInternal", str, th2);
    }
}
