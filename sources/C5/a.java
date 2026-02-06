package C5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import t7.C4049a;
import yf.C6787a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30038a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f30039b;

    /* renamed from: c  reason: collision with root package name */
    private static final Lazy f30040c = C6531o.b(C0501a.f30042a);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f30041d = new AtomicBoolean(false);

    /* renamed from: C5.a$a  reason: collision with other inner class name */
    static final class C0501a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0501a f30042a = new C0501a();

        C0501a() {
            super(0);
        }

        /* renamed from: a */
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool();
        }
    }

    static {
        String cls = a.class.toString();
        C6496s.g(cls, "GpsTopicsManager::class.java.toString()");
        f30039b = cls;
    }

    private a() {
    }

    public static final void a() {
        Class<a> cls = a.class;
        if (!C4049a.d(cls)) {
            try {
                f30041d.set(true);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
