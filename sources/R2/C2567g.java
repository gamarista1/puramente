package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.C1591e;
import i2.C2076a;
import i2.L;
import java.util.ArrayDeque;
import r2.j;

/* renamed from: r2.g  reason: case insensitive filesystem */
final class C2567g extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f25624a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f25625b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f25626c;

    /* renamed from: d  reason: collision with root package name */
    private final C1591e f25627d;

    /* renamed from: e  reason: collision with root package name */
    private final C1591e f25628e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f25629f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f25630g;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f25631h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f25632i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f25633j;

    /* renamed from: k  reason: collision with root package name */
    private MediaCodec.CryptoException f25634k;

    /* renamed from: l  reason: collision with root package name */
    private long f25635l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25636m;

    /* renamed from: n  reason: collision with root package name */
    private IllegalStateException f25637n;

    /* renamed from: o  reason: collision with root package name */
    private j.c f25638o;

    C2567g(HandlerThread handlerThread) {
        this.f25625b = handlerThread;
        this.f25627d = new C1591e();
        this.f25628e = new C1591e();
        this.f25629f = new ArrayDeque();
        this.f25630g = new ArrayDeque();
    }

    private void b(MediaFormat mediaFormat) {
        this.f25628e.a(-2);
        this.f25630g.add(mediaFormat);
    }

    private void f() {
        if (!this.f25630g.isEmpty()) {
            this.f25632i = (MediaFormat) this.f25630g.getLast();
        }
        this.f25627d.b();
        this.f25628e.b();
        this.f25629f.clear();
        this.f25630g.clear();
    }

    private boolean i() {
        if (this.f25635l > 0 || this.f25636m) {
            return true;
        }
        return false;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f25637n;
        if (illegalStateException != null) {
            this.f25637n = null;
            throw illegalStateException;
        }
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f25634k;
        if (cryptoException != null) {
            this.f25634k = null;
            throw cryptoException;
        }
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f25633j;
        if (codecException != null) {
            this.f25633j = null;
            throw codecException;
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        synchronized (this.f25624a) {
            try {
                if (!this.f25636m) {
                    long j10 = this.f25635l - 1;
                    this.f25635l = j10;
                    if (j10 <= 0) {
                        if (j10 < 0) {
                            o(new IllegalStateException());
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

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f25624a) {
            this.f25637n = illegalStateException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f25624a
            monitor-enter(r0)
            r3.j()     // Catch:{ all -> 0x000f }
            boolean r1 = r3.i()     // Catch:{ all -> 0x000f }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x000f:
            r1 = move-exception
            goto L_0x0022
        L_0x0011:
            androidx.collection.e r1 = r3.f25627d     // Catch:{ all -> 0x000f }
            boolean r1 = r1.d()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            androidx.collection.e r1 = r3.f25627d     // Catch:{ all -> 0x000f }
            int r2 = r1.e()     // Catch:{ all -> 0x000f }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C2567g.c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f25624a
            monitor-enter(r0)
            r9.j()     // Catch:{ all -> 0x000f }
            boolean r1 = r9.i()     // Catch:{ all -> 0x000f }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x000f:
            r10 = move-exception
            goto L_0x004c
        L_0x0011:
            androidx.collection.e r1 = r9.f25628e     // Catch:{ all -> 0x000f }
            boolean r1 = r1.d()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x001b
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x001b:
            androidx.collection.e r1 = r9.f25628e     // Catch:{ all -> 0x000f }
            int r1 = r1.e()     // Catch:{ all -> 0x000f }
            if (r1 < 0) goto L_0x003d
            android.media.MediaFormat r2 = r9.f25631h     // Catch:{ all -> 0x000f }
            i2.C2076a.i(r2)     // Catch:{ all -> 0x000f }
            java.util.ArrayDeque r2 = r9.f25629f     // Catch:{ all -> 0x000f }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x000f }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x000f }
            int r4 = r2.offset     // Catch:{ all -> 0x000f }
            int r5 = r2.size     // Catch:{ all -> 0x000f }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x000f }
            int r8 = r2.flags     // Catch:{ all -> 0x000f }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x000f }
            goto L_0x004a
        L_0x003d:
            r10 = -2
            if (r1 != r10) goto L_0x004a
            java.util.ArrayDeque r10 = r9.f25630g     // Catch:{ all -> 0x000f }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x000f }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x000f }
            r9.f25631h = r10     // Catch:{ all -> 0x000f }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C2567g.d(android.media.MediaCodec$BufferInfo):int");
    }

    public void e() {
        synchronized (this.f25624a) {
            this.f25635l++;
            ((Handler) L.h(this.f25626c)).post(new C2566f(this));
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f25624a) {
            try {
                mediaFormat = this.f25631h;
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
        if (this.f25626c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f25625b.start();
        Handler handler = new Handler(this.f25625b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f25626c = handler;
    }

    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f25624a) {
            this.f25634k = cryptoException;
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f25624a) {
            this.f25633j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f25624a) {
            try {
                this.f25627d.a(i10);
                j.c cVar = this.f25638o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f25624a) {
            try {
                MediaFormat mediaFormat = this.f25632i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f25632i = null;
                }
                this.f25628e.a(i10);
                this.f25629f.add(bufferInfo);
                j.c cVar = this.f25638o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f25624a) {
            b(mediaFormat);
            this.f25632i = null;
        }
    }

    public void p(j.c cVar) {
        synchronized (this.f25624a) {
            this.f25638o = cVar;
        }
    }

    public void q() {
        synchronized (this.f25624a) {
            this.f25636m = true;
            this.f25625b.quit();
            f();
        }
    }
}
