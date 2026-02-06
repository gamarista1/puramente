package p003if;

import We.C5664z;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: if.a  reason: invalid package */
public final class a extends ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    /* renamed from: if.a$a  reason: collision with other inner class name */
    static final class C1012a implements C5664z {

        /* renamed from: a  reason: collision with root package name */
        private final ReentrantLock f67890a;

        C1012a(ReentrantLock reentrantLock) {
            this.f67890a = reentrantLock;
        }

        public void close() {
            this.f67890a.unlock();
        }
    }

    public C5664z a() {
        lock();
        return new C1012a(this);
    }
}
