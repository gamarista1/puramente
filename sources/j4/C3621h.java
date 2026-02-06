package j4;

import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1797u;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.DefaultLifecycleObserver;

/* renamed from: j4.h  reason: case insensitive filesystem */
public final class C3621h extends C1790m {

    /* renamed from: b  reason: collision with root package name */
    public static final C3621h f44667b = new C3621h();

    /* renamed from: c  reason: collision with root package name */
    private static final a f44668c = new a();

    /* renamed from: j4.h$a */
    public static final class a implements C1798v {
        a() {
        }

        /* renamed from: a */
        public C3621h getLifecycle() {
            return C3621h.f44667b;
        }
    }

    private C3621h() {
    }

    public void a(C1797u uVar) {
        if (uVar instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) uVar;
            a aVar = f44668c;
            defaultLifecycleObserver.onCreate(aVar);
            defaultLifecycleObserver.onStart(aVar);
            defaultLifecycleObserver.onResume(aVar);
            return;
        }
        throw new IllegalArgumentException((uVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    public C1790m.b b() {
        return C1790m.b.RESUMED;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    public void d(C1797u uVar) {
    }
}
