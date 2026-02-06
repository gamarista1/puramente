package ja;

import android.os.Handler;
import android.os.Message;
import ja.o;
import java.util.ArrayList;
import java.util.List;

final class G implements o {

    /* renamed from: b  reason: collision with root package name */
    private static final List f44968b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f44969a;

    private static final class b implements o.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f44970a;

        /* renamed from: b  reason: collision with root package name */
        private G f44971b;

        private b() {
        }

        private void b() {
            this.f44970a = null;
            this.f44971b = null;
            G.n(this);
        }

        public void a() {
            ((Message) C3645a.e(this.f44970a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C3645a.e(this.f44970a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, G g10) {
            this.f44970a = message;
            this.f44971b = g10;
            return this;
        }
    }

    public G(Handler handler) {
        this.f44969a = handler;
    }

    private static b m() {
        b bVar;
        List list = f44968b;
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
        List list = f44968b;
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

    public o.a a(int i10) {
        return m().d(this.f44969a.obtainMessage(i10), this);
    }

    public boolean b(int i10) {
        return this.f44969a.hasMessages(i10);
    }

    public o.a c(int i10, Object obj) {
        return m().d(this.f44969a.obtainMessage(i10, obj), this);
    }

    public void d(Object obj) {
        this.f44969a.removeCallbacksAndMessages(obj);
    }

    public o.a e(int i10, int i11, int i12) {
        return m().d(this.f44969a.obtainMessage(i10, i11, i12), this);
    }

    public boolean f(Runnable runnable) {
        return this.f44969a.post(runnable);
    }

    public boolean g(int i10) {
        return this.f44969a.sendEmptyMessage(i10);
    }

    public boolean h(int i10, long j10) {
        return this.f44969a.sendEmptyMessageAtTime(i10, j10);
    }

    public void i(int i10) {
        this.f44969a.removeMessages(i10);
    }

    public boolean j(o.a aVar) {
        return ((b) aVar).c(this.f44969a);
    }

    public o.a k(int i10, int i11, int i12, Object obj) {
        return m().d(this.f44969a.obtainMessage(i10, i11, i12, obj), this);
    }
}
