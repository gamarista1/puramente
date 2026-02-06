package X4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o5.k;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f34994a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final b f34995b = new b();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lock f34996a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        int f34997b;

        a() {
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue f34998a = new ArrayDeque();

        b() {
        }

        /* access modifiers changed from: package-private */
        public a a() {
            a aVar;
            synchronized (this.f34998a) {
                aVar = (a) this.f34998a.poll();
            }
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        /* access modifiers changed from: package-private */
        public void b(a aVar) {
            synchronized (this.f34998a) {
                try {
                    if (this.f34998a.size() < 10) {
                        this.f34998a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f34994a.get(str);
                if (aVar == null) {
                    aVar = this.f34995b.a();
                    this.f34994a.put(str, aVar);
                }
                aVar.f34997b++;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        aVar.f34996a.lock();
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f34994a.get(str));
                int i10 = aVar.f34997b;
                if (i10 >= 1) {
                    int i11 = i10 - 1;
                    aVar.f34997b = i11;
                    if (i11 == 0) {
                        a aVar2 = (a) this.f34994a.remove(str);
                        if (aVar2.equals(aVar)) {
                            this.f34995b.b(aVar2);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f34997b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f34996a.unlock();
    }
}
