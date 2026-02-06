package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C1790m;
import kotlin.jvm.internal.C6496s;

public class Y {

    /* renamed from: a  reason: collision with root package name */
    private final C1800x f17182a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f17183b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f17184c;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C1800x f17185a;

        /* renamed from: b  reason: collision with root package name */
        private final C1790m.a f17186b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f17187c;

        public a(C1800x xVar, C1790m.a aVar) {
            C6496s.h(xVar, "registry");
            C6496s.h(aVar, "event");
            this.f17185a = xVar;
            this.f17186b = aVar;
        }

        public void run() {
            if (!this.f17187c) {
                this.f17185a.i(this.f17186b);
                this.f17187c = true;
            }
        }
    }

    public Y(C1798v vVar) {
        C6496s.h(vVar, "provider");
        this.f17182a = new C1800x(vVar);
    }

    private final void f(C1790m.a aVar) {
        a aVar2 = this.f17184c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f17182a, aVar);
        this.f17184c = aVar3;
        Handler handler = this.f17183b;
        C6496s.e(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public C1790m a() {
        return this.f17182a;
    }

    public void b() {
        f(C1790m.a.ON_START);
    }

    public void c() {
        f(C1790m.a.ON_CREATE);
    }

    public void d() {
        f(C1790m.a.ON_STOP);
        f(C1790m.a.ON_DESTROY);
    }

    public void e() {
        f(C1790m.a.ON_START);
    }
}
