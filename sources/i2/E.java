package i2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import i2.C2087l;
import java.util.ArrayList;
import java.util.List;

final class E implements C2087l {

    /* renamed from: b  reason: collision with root package name */
    private static final List f22059b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f22060a;

    private static final class b implements C2087l.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f22061a;

        /* renamed from: b  reason: collision with root package name */
        private E f22062b;

        private b() {
        }

        private void b() {
            this.f22061a = null;
            this.f22062b = null;
            E.n(this);
        }

        public void a() {
            ((Message) C2076a.e(this.f22061a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C2076a.e(this.f22061a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, E e10) {
            this.f22061a = message;
            this.f22062b = e10;
            return this;
        }
    }

    public E(Handler handler) {
        this.f22060a = handler;
    }

    private static b m() {
        b bVar;
        List list = f22059b;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    bVar = new b();
                } else {
                    bVar = (b) list.remove(list.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static void n(b bVar) {
        List list = f22059b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C2087l.a a(int i10) {
        return m().d(this.f22060a.obtainMessage(i10), this);
    }

    public boolean b(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        return this.f22060a.hasMessages(i10);
    }

    public C2087l.a c(int i10, Object obj) {
        return m().d(this.f22060a.obtainMessage(i10, obj), this);
    }

    public void d(Object obj) {
        this.f22060a.removeCallbacksAndMessages(obj);
    }

    public C2087l.a e(int i10, int i11, int i12) {
        return m().d(this.f22060a.obtainMessage(i10, i11, i12), this);
    }

    public boolean f(Runnable runnable) {
        return this.f22060a.post(runnable);
    }

    public boolean g(int i10) {
        return this.f22060a.sendEmptyMessage(i10);
    }

    public boolean h(int i10, long j10) {
        return this.f22060a.sendEmptyMessageAtTime(i10, j10);
    }

    public void i(int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f22060a.removeMessages(i10);
    }

    public boolean j(C2087l.a aVar) {
        return ((b) aVar).c(this.f22060a);
    }

    public Looper k() {
        return this.f22060a.getLooper();
    }
}
