package Gh;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

/* renamed from: Gh.j  reason: case insensitive filesystem */
public abstract class C5409j implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63303a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f63304b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f63305c;

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f63306d = a0.b();

    /* renamed from: Gh.j$a */
    private static final class a implements W {

        /* renamed from: a  reason: collision with root package name */
        private final C5409j f63307a;

        /* renamed from: b  reason: collision with root package name */
        private long f63308b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f63309c;

        public a(C5409j jVar, long j10) {
            C6496s.h(jVar, "fileHandle");
            this.f63307a = jVar;
            this.f63308b = j10;
        }

        public void close() {
            if (!this.f63309c) {
                this.f63309c = true;
                ReentrantLock o10 = this.f63307a.o();
                o10.lock();
                try {
                    C5409j jVar = this.f63307a;
                    jVar.f63305c = jVar.f63305c - 1;
                    if (this.f63307a.f63305c == 0) {
                        if (this.f63307a.f63304b) {
                            C6514M m10 = C6514M.f71813a;
                            o10.unlock();
                            this.f63307a.q();
                        }
                    }
                } finally {
                    o10.unlock();
                }
            }
        }

        public X timeout() {
            return X.f63257e;
        }

        public long y1(C5404e eVar, long j10) {
            C6496s.h(eVar, "sink");
            if (!this.f63309c) {
                long f10 = this.f63307a.y(this.f63308b, eVar, j10);
                if (f10 != -1) {
                    this.f63308b += f10;
                }
                return f10;
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
    }

    public C5409j(boolean z10) {
        this.f63303a = z10;
    }

    /* access modifiers changed from: private */
    public final long y(long j10, C5404e eVar, long j11) {
        C5404e eVar2 = eVar;
        long j12 = j11;
        if (j12 >= 0) {
            long j13 = j12 + j10;
            long j14 = j10;
            while (true) {
                if (j14 >= j13) {
                    break;
                }
                Q L02 = eVar2.L0(1);
                byte[] bArr = L02.f63241a;
                int i10 = L02.f63243c;
                int t10 = t(j14, bArr, i10, (int) Math.min(j13 - j14, (long) (8192 - i10)));
                if (t10 == -1) {
                    if (L02.f63242b == L02.f63243c) {
                        eVar2.f63284a = L02.b();
                        S.b(L02);
                    }
                    if (j10 == j14) {
                        return -1;
                    }
                } else {
                    L02.f63243c += t10;
                    long j15 = (long) t10;
                    j14 += j15;
                    eVar2.x0(eVar.B0() + j15);
                }
            }
            return j14 - j10;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j12).toString());
    }

    /* JADX INFO: finally extract failed */
    public final long E() {
        ReentrantLock reentrantLock = this.f63306d;
        reentrantLock.lock();
        try {
            if (!this.f63304b) {
                C6514M m10 = C6514M.f71813a;
                reentrantLock.unlock();
                return v();
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final W F(long j10) {
        ReentrantLock reentrantLock = this.f63306d;
        reentrantLock.lock();
        try {
            if (!this.f63304b) {
                this.f63305c++;
                reentrantLock.unlock();
                return new a(this, j10);
            }
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.f63306d;
        reentrantLock.lock();
        try {
            if (!this.f63304b) {
                this.f63304b = true;
                if (this.f63305c != 0) {
                    reentrantLock.unlock();
                    return;
                }
                C6514M m10 = C6514M.f71813a;
                reentrantLock.unlock();
                q();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock o() {
        return this.f63306d;
    }

    /* access modifiers changed from: protected */
    public abstract void q();

    /* access modifiers changed from: protected */
    public abstract int t(long j10, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract long v();
}
