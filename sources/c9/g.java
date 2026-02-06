package C9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import ja.C3645a;
import ja.M;
import java.util.ArrayDeque;

final class g extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f30132a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f30133b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f30134c;

    /* renamed from: d  reason: collision with root package name */
    private final k f30135d;

    /* renamed from: e  reason: collision with root package name */
    private final k f30136e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f30137f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f30138g;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f30139h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f30140i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f30141j;

    /* renamed from: k  reason: collision with root package name */
    private long f30142k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30143l;

    /* renamed from: m  reason: collision with root package name */
    private IllegalStateException f30144m;

    g(HandlerThread handlerThread) {
        this.f30133b = handlerThread;
        this.f30135d = new k();
        this.f30136e = new k();
        this.f30137f = new ArrayDeque();
        this.f30138g = new ArrayDeque();
    }

    private void b(MediaFormat mediaFormat) {
        this.f30136e.a(-2);
        this.f30138g.add(mediaFormat);
    }

    private void f() {
        if (!this.f30138g.isEmpty()) {
            this.f30140i = (MediaFormat) this.f30138g.getLast();
        }
        this.f30135d.b();
        this.f30136e.b();
        this.f30137f.clear();
        this.f30138g.clear();
        this.f30141j = null;
    }

    private boolean i() {
        if (this.f30142k > 0 || this.f30143l) {
            return true;
        }
        return false;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f30144m;
        if (illegalStateException != null) {
            this.f30144m = null;
            throw illegalStateException;
        }
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f30141j;
        if (codecException != null) {
            this.f30141j = null;
            throw codecException;
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        synchronized (this.f30132a) {
            try {
                if (!this.f30143l) {
                    long j10 = this.f30142k - 1;
                    this.f30142k = j10;
                    if (j10 <= 0) {
                        if (j10 < 0) {
                            n(new IllegalStateException());
                        } else {
                            f();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f30132a) {
            this.f30144m = illegalStateException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f30132a
            monitor-enter(r0)
            boolean r1 = r3.i()     // Catch:{ all -> 0x000c }
            r2 = -1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return r2
        L_0x000c:
            r1 = move-exception
            goto L_0x0022
        L_0x000e:
            r3.j()     // Catch:{ all -> 0x000c }
            C9.k r1 = r3.f30135d     // Catch:{ all -> 0x000c }
            boolean r1 = r1.d()     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            C9.k r1 = r3.f30135d     // Catch:{ all -> 0x000c }
            int r2 = r1.e()     // Catch:{ all -> 0x000c }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return r2
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.g.c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f30132a
            monitor-enter(r0)
            boolean r1 = r9.i()     // Catch:{ all -> 0x000c }
            r2 = -1
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return r2
        L_0x000c:
            r10 = move-exception
            goto L_0x004c
        L_0x000e:
            r9.j()     // Catch:{ all -> 0x000c }
            C9.k r1 = r9.f30136e     // Catch:{ all -> 0x000c }
            boolean r1 = r1.d()     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x001b
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return r2
        L_0x001b:
            C9.k r1 = r9.f30136e     // Catch:{ all -> 0x000c }
            int r1 = r1.e()     // Catch:{ all -> 0x000c }
            if (r1 < 0) goto L_0x003d
            android.media.MediaFormat r2 = r9.f30139h     // Catch:{ all -> 0x000c }
            ja.C3645a.h(r2)     // Catch:{ all -> 0x000c }
            java.util.ArrayDeque r2 = r9.f30137f     // Catch:{ all -> 0x000c }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x000c }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x000c }
            int r4 = r2.offset     // Catch:{ all -> 0x000c }
            int r5 = r2.size     // Catch:{ all -> 0x000c }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x000c }
            int r8 = r2.flags     // Catch:{ all -> 0x000c }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x000c }
            goto L_0x004a
        L_0x003d:
            r10 = -2
            if (r1 != r10) goto L_0x004a
            java.util.ArrayDeque r10 = r9.f30138g     // Catch:{ all -> 0x000c }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x000c }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x000c }
            r9.f30139h = r10     // Catch:{ all -> 0x000c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return r1
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.g.d(android.media.MediaCodec$BufferInfo):int");
    }

    public void e() {
        synchronized (this.f30132a) {
            this.f30142k++;
            ((Handler) M.j(this.f30134c)).post(new f(this));
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f30132a) {
            try {
                mediaFormat = this.f30139h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f30134c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        this.f30133b.start();
        Handler handler = new Handler(this.f30133b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f30134c = handler;
    }

    public void o() {
        synchronized (this.f30132a) {
            this.f30143l = true;
            this.f30133b.quit();
            f();
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f30132a) {
            this.f30141j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f30132a) {
            this.f30135d.a(i10);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f30132a) {
            try {
                MediaFormat mediaFormat = this.f30140i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f30140i = null;
                }
                this.f30136e.a(i10);
                this.f30137f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f30132a) {
            b(mediaFormat);
            this.f30140i = null;
        }
    }
}
